package com.wsl.annotation.compiler;

import javax.lang.model.element.TypeElement;

/**
 * Created by wushuanglong on 2017/2/25.
 */

class NoPackageNameException extends Exception {

    public NoPackageNameException(TypeElement typeElement) {
        super("The package of " + typeElement.getSimpleName() + " has no name");
    }
}
