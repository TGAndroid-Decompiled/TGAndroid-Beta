package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class ze implements org.telegram.messenger.q20 {
    public final int f44137a;
    public final un f44138b;

    public ze(un unVar, int i10) {
        this.f44137a = i10;
        this.f44138b = unVar;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f44137a;
        un unVar = this.f44138b;
        switch (i10) {
            case 0:
                org.telegram.messenger.oj ojVar = (org.telegram.messenger.oj) obj;
                un unVar2 = this.f44138b;
                unVar2.f42459w5 = ojVar;
                unVar2.F5.f16337k.suggested_post = ojVar.c();
                unVar2.Rb(true, null, unVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                unVar.Wb((org.telegram.messenger.oj) obj);
                return;
            case 2:
                unVar.Ob(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    return;
                }
                return;
            case 3:
                unVar.ta((String) obj, false);
                return;
            case 4:
                unVar.S1 = (org.telegram.messenger.h3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.U6 = unVar.E9();
                    q1Var.V6 = unVar.P9();
                    boolean O9 = unVar.O9();
                    if (q1Var.W6 != O9) {
                        q1Var.W6 = O9;
                        unVar.f42492z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.D6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            unVar.C0.g(R);
                        }
                    }
                    q1Var.X6 = unVar.d9();
                    int e92 = unVar.e9();
                    if (q1Var.Y6 != e92) {
                        q1Var.Y6 = e92;
                        q1Var.V3();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                    s0Var.f22902e0 = unVar.E9();
                    s0Var.f22915i0 = unVar.P9();
                    unVar.O9();
                    unVar.d9();
                    int e93 = unVar.e9();
                    if (s0Var.f22918j0 != e93) {
                        s0Var.f22918j0 = e93;
                        s0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(unVar.e9() / 2.0f);
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
                    unVar.getMessagesController().G0().b(unVar.f42297j6, tL_premium_boostsStatus, new ze(unVar, 4));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.o21 o21Var = unVar.f42246f2;
                if (o21Var != null) {
                    o21Var.n(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                cs csVar = unVar.f42232e0;
                csVar.f36532c.add(((org.telegram.ui.ActionBar.t0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = un.f42169ad;
                unVar.Qa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = un.f42169ad;
                unVar.Qa(intValue2);
                return;
        }
    }
}
