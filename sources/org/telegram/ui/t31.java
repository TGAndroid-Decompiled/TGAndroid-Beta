package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class t31 extends org.telegram.ui.Components.ha implements org.telegram.messenger.us {
    public final org.telegram.ui.Components.yy P1;
    public final vh.d Q1;
    public final th.x4 R1;
    public final HashMap S1;
    public final int T1;
    public int U1;
    public org.telegram.ui.Components.p51 V1;

    public t31(org.telegram.ui.ActionBar.k2 r17, long r18, int r20, org.telegram.ui.Components.zb r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t31.<init>(org.telegram.ui.ActionBar.k2, long, int, org.telegram.ui.Components.zb):void");
    }

    @Override
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(tk0Var, getContext(), this.f21583a, 0, false, new z4(this, 25), this.I0);
        this.V1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131744816, null);
    }

    public final void d1() {
        int abs;
        org.telegram.ui.Components.yy yyVar = this.P1;
        int L0 = yyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(yyVar.N0() - L0) + 1;
        }
        th.x4 x4Var = this.R1;
        if (x4Var != null) {
            int i10 = L0 + abs;
            int i11 = x4Var.i();
            int i12 = this.T1;
            if (i10 > i11 - i12) {
                x4Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19723x5 && ((th.x4) objArr[0]) == this.R1) {
            this.V1.O(false);
            d1();
        }
    }

    public final boolean e1(int i10, View view) {
        org.telegram.ui.Components.a51 G;
        org.telegram.ui.Components.p51 p51Var = this.V1;
        if (p51Var == null || i10 == 0 || (G = p51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.jj) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
            int f12 = jjVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.S1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.e = false;
                ((org.telegram.ui.Cells.s7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), jjVar.f16341l);
                G.e = true;
                ((org.telegram.ui.Cells.s7) view).i(true, true);
            }
            vh.d dVar = this.Q1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1 = this.R1.o();
        org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.f19723x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1.z(this.U1);
        org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.f19723x5);
    }
}
