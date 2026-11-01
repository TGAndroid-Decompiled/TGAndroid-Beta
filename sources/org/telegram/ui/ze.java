package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class ze implements org.telegram.messenger.r20 {
    public final int f43982a;
    public final un f43983b;

    public ze(un unVar, int i10) {
        this.f43982a = i10;
        this.f43983b = unVar;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f43982a;
        un unVar = this.f43983b;
        switch (i10) {
            case 0:
                org.telegram.messenger.pj pjVar = (org.telegram.messenger.pj) obj;
                un unVar2 = this.f43983b;
                unVar2.f42270w5 = pjVar;
                unVar2.F5.f16690k.suggested_post = pjVar.c();
                unVar2.Wb(true, null, unVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                unVar.S1 = (org.telegram.messenger.h3) obj;
                return;
            case 2:
                unVar.bc((org.telegram.messenger.pj) obj);
                return;
            case 3:
                unVar.Tb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    return;
                }
                return;
            case 4:
                unVar.ya((String) obj, false);
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.U6 = unVar.J9();
                    q1Var.V6 = unVar.U9();
                    boolean T9 = unVar.T9();
                    if (q1Var.W6 != T9) {
                        q1Var.W6 = T9;
                        unVar.f42303z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.D6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            unVar.C0.g(R);
                        }
                    }
                    q1Var.X6 = unVar.h9();
                    int i92 = unVar.i9();
                    if (q1Var.Y6 != i92) {
                        q1Var.Y6 = i92;
                        q1Var.V3();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                    s0Var.f22903e0 = unVar.J9();
                    s0Var.f22916i0 = unVar.U9();
                    unVar.T9();
                    unVar.h9();
                    int i93 = unVar.i9();
                    if (s0Var.f22919j0 != i93) {
                        s0Var.f22919j0 = i93;
                        s0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(unVar.i9() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.a0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    unVar.R1 = tL_premium_boostsStatus;
                    unVar.getMessagesController().G0().b(unVar.f42108j6, tL_premium_boostsStatus, new ze(unVar, 1));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.p21 p21Var = unVar.f42057f2;
                if (p21Var != null) {
                    p21Var.n(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                cs csVar = unVar.f42043e0;
                csVar.f36391c.add(((org.telegram.ui.ActionBar.t0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = un.f41979bd;
                unVar.Va(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = un.f41979bd;
                unVar.Va(intValue2);
                return;
        }
    }
}
