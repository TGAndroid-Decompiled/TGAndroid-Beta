package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.g3;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tm;
import org.telegram.ui.PremiumPreviewFragment;
public final class t implements View.OnClickListener {
    public final int f58919a;
    public final k0 f58920b;

    public t(k0 k0Var, int i7) {
        this.f58919a = i7;
        this.f58920b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        int i7 = this.f58919a;
        k0 k0Var = this.f58920b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(k0Var.l1());
                k0Var.dismiss();
                return;
            case 1:
                a0 a0Var = k0Var.A2;
                if (a0Var.f58871r) {
                    a0Var.h.performClick();
                    return;
                } else {
                    a0Var.f58873w.performClick();
                    return;
                }
            case 2:
                a0 a0Var2 = k0Var.A2;
                if (a0Var2.f58871r) {
                    a0Var2.h.performClick();
                    return;
                } else {
                    a0Var2.f58873w.performClick();
                    return;
                }
            default:
                int i10 = k0Var.d2;
                HashSet hashSet = k0Var.f58752u2;
                if (k0Var.f58737f2) {
                    g2 g2Var = k0Var.G2;
                    if (g2Var != 0) {
                        ?? obj = new Object();
                        obj.f28871a = true;
                        g2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i10 == 19 || i10 == 32 || k0Var.t1()) {
                    g3 g3Var = k0Var.Y1;
                    if (g3Var.f24038a) {
                        k0Var.A2.f58873w.callOnClick();
                        g3 g3Var2 = k0Var.Y1;
                        if (g3Var2.d && g3Var2.f24047l) {
                            v vVar = new v(k0Var, 1);
                            if (g3Var2.f24041e) {
                                j3 = 300;
                            } else {
                                j3 = 0;
                            }
                            org.telegram.messenger.g0.h3(vVar, j3);
                            return;
                        }
                        return;
                    } else if (g3Var.d && wg.s.i() && !k0Var.Y1.f24048m) {
                        wg.h.i(k0Var.W1, k0Var);
                        return;
                    } else {
                        k0Var.dismiss();
                        return;
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                k0Var.f58736e2.add((TLRPC.Chat) it.next());
                            }
                            k0Var.y1(arrayList);
                            return;
                        } else if (i10 == 5) {
                            TLRPC.User c22 = np.u1(k0Var.f30139a).c2(Long.valueOf(k10.i(k0Var.f30139a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k0Var.getContext(), k0Var.J0);
                            String G = hd.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                            t1Var.S = G;
                            if (arrayList2.size() == 1) {
                                t1Var.U = org.telegram.messenger.g0.W2(hd.a0("ChannelLeaveAlertWithName", null, 2131752377, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                t1Var.U = org.telegram.messenger.g0.W2(hd.a0("ChatsLeaveAlert", null, 2131752164, new Object[0]));
                            }
                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                            alertDialog$Builder.k(hd.N0(2131743121, null), new tm(k0Var, arrayList2, c22, 13));
                            t1Var.show();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                t6.U(textView, m6.f29588q7, k0Var.J0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    k0Var.dismiss();
                    return;
                } else {
                    k0Var.z1(null);
                    return;
                }
        }
    }
}
