package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.rm;
import org.telegram.ui.PremiumPreviewFragment;
public final class t implements View.OnClickListener {
    public final int f58888a;
    public final l0 f58889b;

    public t(l0 l0Var, int i7) {
        this.f58888a = i7;
        this.f58889b = l0Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        int i7 = this.f58888a;
        l0 l0Var = this.f58889b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(l0Var.l1());
                l0Var.dismiss();
                return;
            case 1:
                b0 b0Var = l0Var.A2;
                if (b0Var.f58865r) {
                    b0Var.h.performClick();
                    return;
                } else {
                    b0Var.f58867w.performClick();
                    return;
                }
            case 2:
                b0 b0Var2 = l0Var.A2;
                if (b0Var2.f58865r) {
                    b0Var2.h.performClick();
                    return;
                } else {
                    b0Var2.f58867w.performClick();
                    return;
                }
            default:
                int i10 = l0Var.d2;
                HashSet hashSet = l0Var.f58747u2;
                if (l0Var.f58732f2) {
                    h2 h2Var = l0Var.G2;
                    if (h2Var != 0) {
                        ?? obj = new Object();
                        obj.f28923a = true;
                        h2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i10 == 19 || i10 == 32 || l0Var.t1()) {
                    g3 g3Var = l0Var.Y1;
                    if (g3Var.f24155a) {
                        l0Var.A2.f58867w.callOnClick();
                        g3 g3Var2 = l0Var.Y1;
                        if (g3Var2.d && g3Var2.f24164l) {
                            v vVar = new v(l0Var, 1);
                            if (g3Var2.f24158e) {
                                j3 = 300;
                            } else {
                                j3 = 0;
                            }
                            org.telegram.messenger.g0.h3(vVar, j3);
                            return;
                        }
                        return;
                    } else if (g3Var.d && wg.s.i() && !l0Var.Y1.f24165m) {
                        wg.h.i(l0Var.W1, l0Var);
                        return;
                    } else {
                        l0Var.dismiss();
                        return;
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                l0Var.f58731e2.add((TLRPC.Chat) it.next());
                            }
                            l0Var.y1(arrayList);
                            return;
                        } else if (i10 == 5) {
                            TLRPC.User c22 = mp.u1(l0Var.f30189a).c2(Long.valueOf(j10.i(l0Var.f30189a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l0Var.getContext(), l0Var.J0);
                            String G = gd.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                            u1Var.S = G;
                            if (arrayList2.size() == 1) {
                                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChannelLeaveAlertWithName", null, 2131752378, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChatsLeaveAlert", null, 2131752165, new Object[0]));
                            }
                            alertDialog$Builder.h(gd.M0(2131752578, null), null);
                            alertDialog$Builder.k(gd.M0(2131743127, null), new rm(l0Var, arrayList2, c22, 13));
                            u1Var.show();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                u6.U(textView, n6.f29637q7, l0Var.J0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    l0Var.dismiss();
                    return;
                } else {
                    l0Var.z1(null);
                    return;
                }
        }
    }
}
