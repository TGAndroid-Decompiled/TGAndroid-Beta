package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class se implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.so, cl0 {
    public final int f49484a;
    public final Runnable f49485b;

    public se(int i3, Runnable runnable) {
        this.f49484a = i3;
        this.f49485b = runnable;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f49484a) {
            case 3:
                this.f49485b.run();
                return true;
            case 4:
                this.f49485b.run();
                return true;
            case 5:
                this.f49485b.run();
                return true;
            case 6:
                this.f49485b.run();
                return true;
            case 7:
                this.f49485b.run();
                return true;
            default:
                this.f49485b.run();
                return true;
        }
    }

    @Override
    public void e(int i3) {
        int i10 = this.f49484a;
        Runnable runnable = this.f49485b;
        switch (i10) {
            case 9:
                String str = LaunchActivity.E1;
                if (i3 == 1) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (i3 == 1) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f49484a) {
            case 0:
                this.f49485b.run();
                return;
            case 1:
                this.f49485b.run();
                return;
            default:
                Runnable runnable = this.f49485b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
