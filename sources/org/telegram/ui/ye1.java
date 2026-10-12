package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye1 implements Runnable {
    public final int f44464a;
    public final df1 f44465b;

    public ye1(df1 df1Var, int i10) {
        this.f44464a = i10;
        this.f44465b = df1Var;
    }

    @Override
    public final void run() {
        switch (this.f44464a) {
            case 0:
                df1 df1Var = this.f44465b;
                df1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.m2) df1Var, 11, false).show();
                return;
            default:
                df1 df1Var2 = this.f44465b;
                df1Var2.f36788e.requestFocus();
                AndroidUtilities.showKeyboard(df1Var2.f36788e);
                return;
        }
    }
}
