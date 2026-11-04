package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class s11 extends org.telegram.ui.Components.ma implements org.telegram.messenger.cs {
    public final org.telegram.ui.Components.hy Q1;
    public final gi.d R1;
    public final ei.r6 S1;
    public final HashMap T1;
    public final int U1;
    public int V1;
    public org.telegram.ui.Components.f41 W1;

    public s11(org.telegram.ui.ActionBar.d2 r17, long r18, int r20, ci.q3 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s11.<init>(org.telegram.ui.ActionBar.d2, long, int, ci.q3):void");
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.f28583a, 0, false, new c5(this, 25), this.J0);
        this.W1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131744808, null);
    }

    public final void d1() {
        int abs;
        org.telegram.ui.Components.hy hyVar = this.Q1;
        int L0 = hyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(hyVar.N0() - L0) + 1;
        }
        ei.r6 r6Var = this.S1;
        if (r6Var != null) {
            int i3 = L0 + abs;
            int i10 = r6Var.i();
            int i11 = this.U1;
            if (i3 > i10 - i11) {
                r6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23338x5 && ((ei.r6) objArr[0]) == this.S1) {
            this.W1.O(false);
            d1();
        }
    }

    public final boolean e1(int i3, View view) {
        org.telegram.ui.Components.r31 G;
        org.telegram.ui.Components.f41 f41Var = this.W1;
        if (f41Var == null || i3 == 0 || (G = f41Var.G(i3 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.zi) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
            int f12 = ziVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.T1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.f37621e = false;
                ((org.telegram.ui.Cells.n7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), ziVar.f26871l);
                G.f37621e = true;
                ((org.telegram.ui.Cells.n7) view).i(true, true);
            }
            gi.d dVar = this.R1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V1 = this.S1.o();
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23338x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S1.z(this.V1);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23338x5);
    }
}
