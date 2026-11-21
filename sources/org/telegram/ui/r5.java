package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 extends FrameLayout {
    public final t5 f51446a;

    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.f51446a = t5Var;
        setWillNotDraw(false);
        di.n4 n4Var = new di.n4(t5Var, getContext());
        di.n4 n4Var2 = new di.n4(t5Var, getContext());
        di.n4 n4Var3 = new di.n4(t5Var, getContext());
        n4Var.c(2131231083, org.telegram.messenger.gd.N0(2131753661, null));
        n4Var2.c(2131231116, org.telegram.messenger.gd.N0(2131749377, null));
        n4Var3.c(2131231126, org.telegram.messenger.gd.N0(2131750818, null));
        n4Var.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50746b;

            {
                this.f50746b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i7 = r2;
                r5 r5Var = this.f50746b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f51446a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.k0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.k0 k0Var = new ug.k0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            k0Var.B1(g3Var);
                            k0Var.A1(tL_premium_boostsStatus, true);
                            k0Var.C1(j3);
                            k0Var.f58766c2 = null;
                            t5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f51446a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        h6Var = ((org.telegram.ui.ActionBar.g2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, h6Var, j10, null);
                        wg.l.f59826p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f51446a;
                        ug.k0 k0Var2 = new ug.k0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        k0Var2.A1(t5Var4.U, true);
                        k0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        n4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50746b;

            {
                this.f50746b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i7 = r2;
                r5 r5Var = this.f50746b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f51446a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.k0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.k0 k0Var = new ug.k0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            k0Var.B1(g3Var);
                            k0Var.A1(tL_premium_boostsStatus, true);
                            k0Var.C1(j3);
                            k0Var.f58766c2 = null;
                            t5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f51446a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        h6Var = ((org.telegram.ui.ActionBar.g2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, h6Var, j10, null);
                        wg.l.f59826p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f51446a;
                        ug.k0 k0Var2 = new ug.k0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        k0Var2.A1(t5Var4.U, true);
                        k0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        n4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f50746b;

            {
                this.f50746b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i7 = r2;
                r5 r5Var = this.f50746b;
                switch (i7) {
                    case 0:
                        t5 t5Var2 = r5Var.f51446a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i10 = ug.k0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.k0 k0Var = new ug.k0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            k0Var.B1(g3Var);
                            k0Var.A1(tL_premium_boostsStatus, true);
                            k0Var.C1(j3);
                            k0Var.f58766c2 = null;
                            t5Var2.showDialog(k0Var);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = r5Var.f51446a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        h6Var = ((org.telegram.ui.ActionBar.g2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, h6Var, j10, null);
                        wg.l.f59826p1.I0 = new q5(r5Var, 0);
                        return;
                    default:
                        t5 t5Var4 = r5Var.f51446a;
                        ug.k0 k0Var2 = new ug.k0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        k0Var2.A1(t5Var4.U, true);
                        k0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(k0Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(n4Var, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.mp.u1(t5Var.T).f25787s4 && org.telegram.messenger.v3.N(t5Var.f52221j0)) {
            linearLayout.addView(n4Var2, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(n4Var3, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ma.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
