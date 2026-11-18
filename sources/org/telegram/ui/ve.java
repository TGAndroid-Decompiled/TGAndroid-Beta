package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ve implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.xo, ll0 {
    public final int f52758a;
    public final Runnable f52759b;

    public ve(int i7, Runnable runnable) {
        this.f52758a = i7;
        this.f52759b = runnable;
    }

    @Override
    public void d(int i7) {
        int i10 = this.f52758a;
        Runnable runnable = this.f52759b;
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
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.f52758a) {
            case 3:
                this.f52759b.run();
                return true;
            case 4:
                this.f52759b.run();
                return true;
            case 5:
                this.f52759b.run();
                return true;
            case 6:
                this.f52759b.run();
                return true;
            case 7:
                this.f52759b.run();
                return true;
            default:
                this.f52759b.run();
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52758a) {
            case 0:
                this.f52759b.run();
                return;
            case 1:
                this.f52759b.run();
                return;
            default:
                Runnable runnable = this.f52759b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
