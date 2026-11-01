package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zm extends org.telegram.ui.Components.pp0 {
    public final org.telegram.messenger.kj R2;
    public final fn S2;

    public zm(fn fnVar, Activity activity, un unVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12, org.telegram.messenger.kj kjVar) {
        super(activity, unVar, arrayList, null, null, z10, null, null, false, false, z11, null, p6Var);
        this.S2 = fnVar;
        this.R2 = kjVar;
        this.S1 = z12;
    }

    @Override
    public final void L() {
        int i10;
        un unVar = this.S2.f37191a;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        org.telegram.messenger.i0.Z2(parentActivity, i10);
        super.L();
        if (unVar.Z.getVisibility() == 0) {
            unVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fn fnVar = this.S2;
        un unVar = fnVar.f37191a;
        int i11 = un.f41979bd;
        unVar.c8();
        if (fnVar.f37191a.M3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f19798id != fnVar.f37191a.getUserConfig().e() || !org.telegram.ui.Components.cc.a0(fnVar.f37191a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).f19798id)) {
                    fnVar.f37191a.M3.k(((TLRPC.Dialog) hVar.n(0)).f19798id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            fnVar.f37191a.M3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        vh.h8 h8Var;
        un unVar = this.S2.f37191a;
        org.telegram.messenger.fj fjVar = null;
        if (view instanceof org.telegram.ui.Cells.h7) {
            h8Var = vh.j8.b((org.telegram.ui.Cells.h7) view);
        } else {
            h8Var = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.kj kjVar = this.R2;
        if (kjVar.d1() != 0) {
            fjVar = (org.telegram.messenger.fj) unVar.N6.f(kjVar.d1());
        }
        if (fjVar != null) {
            arrayList.addAll(fjVar.d);
        } else {
            arrayList.add(kjVar);
        }
        final vh.o8 D = vh.o8.D(unVar.getParentActivity(), this.f21584a);
        D.R = new org.telegram.messenger.o20() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                vh.o8 o8Var = D;
                vh.h8 h8Var2 = null;
                if (booleanValue) {
                    zm zmVar = zm.this;
                    org.telegram.messenger.i0.g3(new ch(12, zmVar, l10));
                    zmVar.dismiss();
                    o8Var.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        h8Var2 = vh.j8.b((org.telegram.ui.Cells.h7) view2);
                    }
                    o8Var.X(h8Var2);
                }
                org.telegram.messenger.i0.g3(runnable);
            }
        };
        D.T(h8Var, vh.n5.y(arrayList));
    }
}
