package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 extends FrameLayout {
    public final t5 f49381a;

    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.f49381a = t5Var;
        setWillNotDraw(false);
        bi.m5 m5Var = new bi.m5(t5Var, getContext());
        bi.m5 m5Var2 = new bi.m5(t5Var, getContext());
        bi.m5 m5Var3 = new bi.m5(t5Var, getContext());
        m5Var.c(2131231083, org.telegram.messenger.id.M0(2131753664, null));
        m5Var2.c(2131231116, org.telegram.messenger.id.M0(2131749554, null));
        m5Var3.c(2131231126, org.telegram.messenger.id.M0(2131750831, null));
        m5Var.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f48638b;

            {
                this.f48638b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i7 = r2;
                r5 r5Var = this.f48638b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f49381a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i10 = ug.i0.O2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.Y1 = null;
                            t5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f49381a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        f6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, f6Var, j10, null);
                        wg.l.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f49381a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        m5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f48638b;

            {
                this.f48638b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i7 = r2;
                r5 r5Var = this.f48638b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f49381a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i10 = ug.i0.O2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.Y1 = null;
                            t5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f49381a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        f6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, f6Var, j10, null);
                        wg.l.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f49381a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        m5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f48638b;

            {
                this.f48638b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i7 = r2;
                r5 r5Var = this.f48638b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f49381a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i10 = ug.i0.O2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.Y1 = null;
                            t5Var2.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f49381a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        f6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, f6Var, j10, null);
                        wg.l.l1.H0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f49381a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(m5Var, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.qp.s1(t5Var.S).f24865p4 && org.telegram.messenger.t3.N(t5Var.f49923i0)) {
            linearLayout.addView(m5Var2, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(m5Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ha.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
