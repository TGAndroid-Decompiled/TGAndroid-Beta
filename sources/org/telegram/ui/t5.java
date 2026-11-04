package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 extends FrameLayout {
    public final v5 f49699a;

    public t5(v5 v5Var, Activity activity) {
        super(activity);
        this.f49699a = v5Var;
        setWillNotDraw(false);
        ci.t4 t4Var = new ci.t4(v5Var, getContext());
        ci.t4 t4Var2 = new ci.t4(v5Var, getContext());
        ci.t4 t4Var3 = new ci.t4(v5Var, getContext());
        t4Var.c(2131231083, org.telegram.messenger.bd.M0(2131753664, null));
        t4Var2.c(2131231116, org.telegram.messenger.bd.M0(2131749561, null));
        t4Var3.c(2131231126, org.telegram.messenger.bd.M0(2131750831, null));
        t4Var.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f49100b;

            {
                this.f49100b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i3 = r2;
                t5 t5Var = this.f49100b;
                switch (i3) {
                    case 0:
                        v5 v5Var2 = t5Var.f49699a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i10 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f49699a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        return;
                    default:
                        v5 v5Var4 = t5Var.f49699a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        t4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f49100b;

            {
                this.f49100b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i3 = r2;
                t5 t5Var = this.f49100b;
                switch (i3) {
                    case 0:
                        v5 v5Var2 = t5Var.f49699a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i10 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f49699a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        return;
                    default:
                        v5 v5Var4 = t5Var.f49699a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        t4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final t5 f49100b;

            {
                this.f49100b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i3 = r2;
                t5 t5Var = this.f49100b;
                switch (i3) {
                    case 0:
                        v5 v5Var2 = t5Var.f49699a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i10 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        v5 v5Var3 = t5Var.f49699a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        return;
                    default:
                        v5 v5Var4 = t5Var.f49699a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(t4Var, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.hp.s1(v5Var.T).f23090p4 && org.telegram.messenger.t3.N(v5Var.f50391j0)) {
            linearLayout.addView(t4Var2, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(t4Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, b8.mf.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
