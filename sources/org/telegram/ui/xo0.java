package org.telegram.ui;

import android.view.View;
public final class xo0 extends org.telegram.ui.Components.n91 {
    public final int f45743a;
    public final Object f45744b;

    public xo0(Object obj, int i10) {
        this.f45743a = i10;
        this.f45744b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f45743a) {
            case 0:
                return;
            default:
                if (view instanceof org.telegram.ui.Wallet.g2) {
                    ((org.telegram.ui.Wallet.g2) view).getClass();
                    return;
                }
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f45743a) {
            case 0:
                tp0 tp0Var = (tp0) this.f45744b;
                if (i10 == 1) {
                    return tp0Var.h;
                }
                if (i10 == 0) {
                    return tp0Var.f43719n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f45744b).f36693c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f45743a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f45744b).f36693c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f45743a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
