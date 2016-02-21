package com.company.AnalyzePackage.CodeItemsPackage;

/**
 * Created by oleg on 16.02.16.
 */
public class ACode {
    private int maxStack;
    private int maxLocals;
    private int codeLength;


    ACode(final ACode code) {

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
}
