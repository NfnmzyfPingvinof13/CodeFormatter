package com.company.AnalyzePackage.CodeItemsPackage;

import com.company.AnalyzePackage.VisitorPackage.AbstractVisitor;

/**
 * Created by oleg on 16.02.16.
 */
public class BCode implements BNode {
    private int maxStack;
    private int maxLocals;
    private int codeLength;


    BCode(final BCode code) {

    }

    public final int getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(final int maxStack) {
        this.maxStack = maxStack;
    }

    public final int getMaxLocals() {
        return maxLocals;
    }

    public void setMaxLocals(final int maxLocals) {
        this.maxLocals = maxLocals;
    }

    public final int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(final int codeLength) {
        this.codeLength = codeLength;
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visitCode(this);
    }
}
