package org.telegram.ui;

import android.view.View;
public final class vo0 extends org.telegram.ui.Components.m91 {
    public final int f44865a;
    public final Object f44866b;

    public vo0(Object obj, int i10) {
        this.f44865a = i10;
        this.f44866b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        switch (this.f44865a) {
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
        switch (this.f44865a) {
            case 0:
                rp0 rp0Var = (rp0) this.f44866b;
                if (i10 == 1) {
                    return rp0Var.h;
                }
                if (i10 == 0) {
                    return rp0Var.f43230n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.f44866b).f36665c.get(i10);
        }
    }

    @Override
    public final int e() {
        switch (this.f44865a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.f44866b).f36665c.size();
        }
    }

    @Override
    public final int h(int i10) {
        int i11 = this.f44865a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
