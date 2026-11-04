package vg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.e3;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.PremiumPreviewFragment;
public final class t implements View.OnClickListener {
    public final int f56852a;
    public final i0 f56853b;

    public t(i0 i0Var, int i3) {
        this.f56852a = i3;
        this.f56853b = i0Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        int i3 = this.f56852a;
        i0 i0Var = this.f56853b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                return;
            case 1:
                y yVar = i0Var.f56673x2;
                if (yVar.f56765r) {
                    yVar.h.performClick();
                    return;
                } else {
                    yVar.f56767w.performClick();
                    return;
                }
            case 2:
                y yVar2 = i0Var.f56673x2;
                if (yVar2.f56765r) {
                    yVar2.h.performClick();
                    return;
                } else {
                    yVar2.f56767w.performClick();
                    return;
                }
            default:
                int i10 = i0Var.f56651a2;
                HashSet hashSet = i0Var.f56667r2;
                if (i0Var.c2) {
                    d2 d2Var = i0Var.D2;
                    if (d2Var != 0) {
                        ?? obj = new Object();
                        obj.f27395a = true;
                        d2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i10 == 19 || i10 == 32 || i0Var.s1()) {
                    e3 e3Var = i0Var.V1;
                    if (e3Var.f22299a) {
                        i0Var.f56673x2.f56767w.callOnClick();
                        e3 e3Var2 = i0Var.V1;
                        if (e3Var2.d && e3Var2.f22308l) {
                            v vVar = new v(i0Var, 1);
                            if (e3Var2.f22302e) {
                                j10 = 300;
                            } else {
                                j10 = 0;
                            }
                            org.telegram.messenger.g0.i3(vVar, j10);
                            return;
                        }
                        return;
                    } else if (e3Var.d && xg.s.i() && !i0Var.V1.f22309m) {
                        xg.j.i(i0Var.T1, i0Var);
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
                                i0Var.f56652b2.add((TLRPC.Chat) it.next());
                            }
                            i0Var.x1(arrayList);
                            return;
                        } else if (i10 == 5) {
                            TLRPC.User a22 = hp.s1(i0Var.f28583a).a2(Long.valueOf(h10.i(i0Var.f28583a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getContext(), i0Var.J0);
                            String G = bd.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = G;
                            if (arrayList2.size() == 1) {
                                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                            }
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            alertDialog$Builder.k(bd.M0(2131743374, null), new hr(i0Var, arrayList2, a22, 12));
                            s1Var.show();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                r6.V(textView, k6.f28122q7, i0Var.J0);
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
