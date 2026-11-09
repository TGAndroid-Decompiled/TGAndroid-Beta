package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ve implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, il0 {
    public final int f50666a;
    public final Runnable f50667b;

    public ve(int i7, Runnable runnable) {
        this.f50666a = i7;
        this.f50667b = runnable;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f50666a) {
            case 3:
                this.f50667b.run();
                return true;
            case 4:
                this.f50667b.run();
                return true;
            case 5:
                this.f50667b.run();
                return true;
            case 6:
                this.f50667b.run();
                return true;
            case 7:
                this.f50667b.run();
                return true;
            default:
                this.f50667b.run();
                return true;
        }
    }

    @Override
    public void b(int i7) {
        int i10 = this.f50666a;
        Runnable runnable = this.f50667b;
        switch (i10) {
            case 9:
                String str = LaunchActivity.B1;
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
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50666a) {
            case 0:
                this.f50667b.run();
                return;
            case 1:
                this.f50667b.run();
                return;
            default:
                Runnable runnable = this.f50667b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
