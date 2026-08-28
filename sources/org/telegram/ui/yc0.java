package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements org.telegram.ui.Components.wu0 {
    public final int f44819a;
    public final org.telegram.ui.ActionBar.o2 f44820b;

    public yc0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f44819a = i9;
        this.f44820b = o2Var;
    }

    @Override
    public final void G(int i9, boolean z10) {
        uf0 uf0Var;
        vk0 vk0Var;
        switch (this.f44819a) {
            case 0:
                fg0 fg0Var = (fg0) this.f44820b;
                if (i9 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i9 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.P) != null) {
                    uf0Var.run();
                    fg0Var.P = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f44820b;
                if (i9 >= AndroidUtilities.dp(20.0f) && (vk0Var = passcodeActivity.L) != null) {
                    vk0Var.run();
                    passcodeActivity.L = null;
                    return;
                }
                return;
        }
    }
}
