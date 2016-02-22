package com.company.AnalyzePackage.VisitorPackage;

/**
 * Created by oleg on 16.02.16.
 */

import com.company.AnalyzePackage.CodeItemsPackage.*;


public  interface AbstractVisitor {
    void visitCode(BCode bCode);
    void visitCodeException(BCodeException e);
    void visitConstantClass(BConstantClass constantClass);
    void visitConstantDouble(BConstantDouble constantDouble);
    void visitConstantField(BConstantFieldReference bConstantFieldReference);
    void visitConstantFloat(BConstantFloat constantFloat);
    void visitConstantInt(BConstantInt constantInt);
    void visitConstantInterfaceMethod(BConstantInterfaceMethod constantInterfaceMethod);
    void visitConstantLong(BConstantLong constantLong);
    void visitConstantMethod(BConstantMethod constantMethod);
    void visitConstantString(BConstantString constantString);
    void visitConstantValue(BConstantValue constantValue);
    void visitField(BField field);
    void visitJavaClass(BJavaClass javaClass);
    void visitLineNumber(BLineNumber lineNumber);
    void visitLocalVariable(BLocalVariable localVariable);
    void visitMethod(BMethod method);
    void visitSignature(BSignature signature);
}
