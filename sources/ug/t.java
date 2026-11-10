package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.e3;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.PremiumPreviewFragment;
public final class t implements View.OnClickListener {
    public final int f56825a;
    public final i0 f56826b;

    public t(i0 i0Var, int i7) {
        this.f56825a = i7;
        this.f56826b = i0Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        int i7 = this.f56825a;
        i0 i0Var = this.f56826b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                return;
            case 1:
                y yVar = i0Var.f56639z2;
                if (yVar.f56770r) {
                    yVar.h.performClick();
                    return;
                } else {
                    yVar.f56772w.performClick();
                    return;
                }
            case 2:
                y yVar2 = i0Var.f56639z2;
                if (yVar2.f56770r) {
                    yVar2.h.performClick();
                    return;
                } else {
                    yVar2.f56772w.performClick();
                    return;
                }
            default:
                int i10 = i0Var.f56617c2;
                HashSet hashSet = i0Var.f56633t2;
                if (i0Var.f56618e2) {
                    f2 f2Var = i0Var.F2;
                    if (f2Var != 0) {
                        ?? obj = new Object();
                        obj.f27388a = true;
                        f2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i10 == 19 || i10 == 32 || i0Var.s1()) {
                    e3 e3Var = i0Var.X1;
                    if (e3Var.f22175a) {
                        i0Var.f56639z2.f56772w.callOnClick();
                        e3 e3Var2 = i0Var.X1;
                        if (e3Var2.d && e3Var2.f22184l) {
                            v vVar = new v(i0Var, 1);
                            if (e3Var2.f22178e) {
                                j3 = 300;
                            } else {
                                j3 = 0;
                            }
                            org.telegram.messenger.g0.i3(vVar, j3);
                            return;
                        }
                        return;
                    } else if (e3Var.d && wg.r.i() && !i0Var.X1.f22185m) {
                        wg.h.i(i0Var.V1, i0Var);
                        return;
                    } else {
                        i0Var.dismiss();
                        return;
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                i0Var.d2.add((TLRPC.Chat) it.next());
                            }
                            i0Var.x1(arrayList);
                            return;
                        } else if (i10 == 5) {
                            TLRPC.User a22 = qp.s1(i0Var.f28669a).a2(Long.valueOf(p10.i(i0Var.f28669a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getContext(), i0Var.I0);
                            String G = id.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = G;
                            if (arrayList2.size() == 1) {
                                u1Var.T = org.telegram.messenger.g0.X2(id.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                u1Var.T = org.telegram.messenger.g0.X2(id.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                            }
                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                            alertDialog$Builder.k(id.M0(2131743364, null), new gr(i0Var, arrayList2, a22, 12));
                            u1Var.show();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                t6.U(textView, m6.f28131q7, i0Var.I0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    i0Var.dismiss();
                    return;
                } else {
                    i0Var.y1(null);
                    return;
                }
        }
    }
}
