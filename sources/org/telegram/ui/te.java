package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class te implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, jl0 {
    public final int f51567a;
    public final Runnable f51568b;

    public te(int i7, Runnable runnable) {
        this.f51567a = i7;
        this.f51568b = runnable;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        switch (this.f51567a) {
            case 3:
                this.f51568b.run();
                return true;
            case 4:
                this.f51568b.run();
                return true;
            case 5:
                this.f51568b.run();
                return true;
            case 6:
                this.f51568b.run();
                return true;
            case 7:
                this.f51568b.run();
                return true;
            default:
                this.f51568b.run();
                return true;
        }
    }

    @Override
    public void e(int i7) {
        int i10 = this.f51567a;
        Runnable runnable = this.f51568b;
        switch (i10) {
            case 9:
                String str = LaunchActivity.C1;
                if (i7 == 1) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51567a) {
            case 0:
                this.f51568b.run();
                return;
            case 1:
                this.f51568b.run();
                return;
            default:
                Runnable runnable = this.f51568b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
