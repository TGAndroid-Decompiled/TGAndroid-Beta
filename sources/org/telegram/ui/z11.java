package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class z11 extends org.telegram.ui.Components.ja implements org.telegram.messenger.is {
    public final org.telegram.ui.Components.oy T1;
    public final hi.d U1;
    public final fi.k6 V1;
    public final HashMap W1;
    public final int X1;
    public int Y1;
    public org.telegram.ui.Components.p41 Z1;

    public z11(org.telegram.ui.ActionBar.e2 r17, long r18, int r20, di.h3 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z11.<init>(org.telegram.ui.ActionBar.e2, long, int, di.h3):void");
    }

    @Override
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.f29679a, 0, false, new a5(this, 26), this.J0);
        this.Z1 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131744798, null);
    }

    public final void d1() {
        int abs;
        org.telegram.ui.Components.oy oyVar = this.T1;
        int L0 = oyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(oyVar.N0() - L0) + 1;
        }
        fi.k6 k6Var = this.V1;
        if (k6Var != null) {
            int i7 = L0 + abs;
            int i10 = k6Var.i();
            int i11 = this.X1;
            if (i7 > i10 - i11) {
                k6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25605x5 && ((fi.k6) objArr[0]) == this.V1) {
            this.Z1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.b41 G;
        org.telegram.ui.Components.p41 p41Var = this.Z1;
        if (p41Var == null || i7 == 0 || (G = p41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.gj) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            int e12 = gjVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.W1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.f33175e = false;
                ((org.telegram.ui.Cells.n7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), gjVar.f23822l);
                G.f33175e = true;
                ((org.telegram.ui.Cells.n7) view).i(true, true);
            }
            hi.d dVar = this.U1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = this.V1.o();
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25605x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.z(this.Y1);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25605x5);
    }
}
