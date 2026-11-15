package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 extends FrameLayout {
    public final t5 f50846a;

    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.f50846a = t5Var;
        setWillNotDraw(false);
        di.k4 k4Var = new di.k4(t5Var, getContext());
        di.k4 k4Var2 = new di.k4(t5Var, getContext());
        di.k4 k4Var3 = new di.k4(t5Var, getContext());
        k4Var.c(2131231083, org.telegram.messenger.hd.M0(2131753664, null));
        k4Var2.c(2131231116, org.telegram.messenger.hd.M0(2131749553, null));
        k4Var3.c(2131231126, org.telegram.messenger.hd.M0(2131750830, null));
        k4Var.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50153b;

            {
                this.f50153b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i7 = r2;
                r5 r5Var = this.f50153b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f50846a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.f58132c2 = null;
                            t5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f50846a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.f59202p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f50846a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        k4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50153b;

            {
                this.f50153b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i7 = r2;
                r5 r5Var = this.f50153b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f50846a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.f58132c2 = null;
                            t5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f50846a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.f59202p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f50846a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        k4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50153b;

            {
                this.f50153b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i7 = r2;
                r5 r5Var = this.f50153b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f50846a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.f58132c2 = null;
                            t5Var2.showDialog(j0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f50846a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.f59202p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f50846a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(k4Var, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.np.s1(t5Var.T).f25370q4 && org.telegram.messenger.t3.N(t5Var.f51367j0)) {
            linearLayout.addView(k4Var2, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(k4Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ja.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
