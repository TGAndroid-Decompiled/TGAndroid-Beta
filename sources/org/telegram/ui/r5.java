package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 extends FrameLayout {
    public final t5 f41134a;

    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.f41134a = t5Var;
        setWillNotDraw(false);
        jg.b1 b1Var = new jg.b1(t5Var, getContext());
        jg.b1 b1Var2 = new jg.b1(t5Var, getContext());
        jg.b1 b1Var3 = new jg.b1(t5Var, getContext());
        b1Var.c(2131231083, org.telegram.messenger.cd.L0(2131753664, null));
        b1Var2.c(2131231116, org.telegram.messenger.cd.L0(2131749562, null));
        b1Var3.c(2131231126, org.telegram.messenger.cd.L0(2131750831, null));
        b1Var.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40469b;

            {
                this.f40469b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.p6 p6Var;
                int i10 = r2;
                r5 r5Var = this.f40469b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.f41134a;
                        long j10 = t5Var2.R;
                        org.telegram.messenger.h3 h3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i11 = kg.q0.O2;
                        if (h3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            kg.q0 q0Var = new kg.q0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            q0Var.A1(h3Var);
                            q0Var.z1(tL_premium_boostsStatus, true);
                            q0Var.B1(j10);
                            q0Var.Y1 = null;
                            t5Var2.showDialog(q0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f41134a;
                        t5Var3.x0(true);
                        long j11 = t5Var3.R;
                        p6Var = ((org.telegram.ui.ActionBar.k2) t5Var3).resourceProvider;
                        mg.v.I0(t5Var3, p6Var, j11, null);
                        mg.v.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f41134a;
                        kg.q0 q0Var2 = new kg.q0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        q0Var2.z1(t5Var4.T, true);
                        q0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(q0Var2);
                        return;
                }
            }
        });
        b1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40469b;

            {
                this.f40469b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.p6 p6Var;
                int i10 = r2;
                r5 r5Var = this.f40469b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.f41134a;
                        long j10 = t5Var2.R;
                        org.telegram.messenger.h3 h3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i11 = kg.q0.O2;
                        if (h3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            kg.q0 q0Var = new kg.q0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            q0Var.A1(h3Var);
                            q0Var.z1(tL_premium_boostsStatus, true);
                            q0Var.B1(j10);
                            q0Var.Y1 = null;
                            t5Var2.showDialog(q0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f41134a;
                        t5Var3.x0(true);
                        long j11 = t5Var3.R;
                        p6Var = ((org.telegram.ui.ActionBar.k2) t5Var3).resourceProvider;
                        mg.v.I0(t5Var3, p6Var, j11, null);
                        mg.v.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f41134a;
                        kg.q0 q0Var2 = new kg.q0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        q0Var2.z1(t5Var4.T, true);
                        q0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(q0Var2);
                        return;
                }
            }
        });
        b1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f40469b;

            {
                this.f40469b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.p6 p6Var;
                int i10 = r2;
                r5 r5Var = this.f40469b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.f41134a;
                        long j10 = t5Var2.R;
                        org.telegram.messenger.h3 h3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i11 = kg.q0.O2;
                        if (h3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            kg.q0 q0Var = new kg.q0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            q0Var.A1(h3Var);
                            q0Var.z1(tL_premium_boostsStatus, true);
                            q0Var.B1(j10);
                            q0Var.Y1 = null;
                            t5Var2.showDialog(q0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f41134a;
                        t5Var3.x0(true);
                        long j11 = t5Var3.R;
                        p6Var = ((org.telegram.ui.ActionBar.k2) t5Var3).resourceProvider;
                        mg.v.I0(t5Var3, p6Var, j11, null);
                        mg.v.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f41134a;
                        kg.q0 q0Var2 = new kg.q0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        q0Var2.z1(t5Var4.T, true);
                        q0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(q0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(b1Var, w7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.vp.r1(t5Var.S).f18879q4 && org.telegram.messenger.w3.N(t5Var.f41724i0)) {
            linearLayout.addView(b1Var2, w7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(b1Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.b6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
