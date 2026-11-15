package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.km;
import org.telegram.ui.PremiumPreviewFragment;
public final class t implements View.OnClickListener {
    public final int f58336a;
    public final j0 f58337b;

    public t(j0 j0Var, int i7) {
        this.f58336a = i7;
        this.f58337b = j0Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        int i7 = this.f58336a;
        j0 j0Var = this.f58337b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(j0Var.k1());
                j0Var.dismiss();
                return;
            case 1:
                z zVar = j0Var.A2;
                if (zVar.f58269r) {
                    zVar.h.performClick();
                    return;
                } else {
                    zVar.f58271w.performClick();
                    return;
                }
            case 2:
                z zVar2 = j0Var.A2;
                if (zVar2.f58269r) {
                    zVar2.h.performClick();
                    return;
                } else {
                    zVar2.f58271w.performClick();
                    return;
                }
            default:
                int i10 = j0Var.d2;
                HashSet hashSet = j0Var.f58149u2;
                if (j0Var.f58134f2) {
                    e2 e2Var = j0Var.G2;
                    if (e2Var != 0) {
                        ?? obj = new Object();
                        obj.f28476a = true;
                        e2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
                    } else {
                        return;
                    }
                } else if (i10 == 19 || i10 == 32 || j0Var.s1()) {
                    e3 e3Var = j0Var.Y1;
                    if (e3Var.f23247a) {
                        j0Var.A2.f58271w.callOnClick();
                        e3 e3Var2 = j0Var.Y1;
                        if (e3Var2.d && e3Var2.f23256l) {
                            v vVar = new v(j0Var, 1);
                            if (e3Var2.f23250e) {
                                j3 = 300;
                            } else {
                                j3 = 0;
                            }
                            org.telegram.messenger.g0.i3(vVar, j3);
                            return;
                        }
                        return;
                    } else if (e3Var.d && wg.q.i() && !j0Var.Y1.f23257m) {
                        wg.h.i(j0Var.W1, j0Var);
                        return;
                    } else {
                        j0Var.dismiss();
                        return;
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 == 2) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                j0Var.f58133e2.add((TLRPC.Chat) it.next());
                            }
                            j0Var.x1(arrayList);
                            return;
                        } else if (i10 == 5) {
                            TLRPC.User a22 = np.s1(j0Var.f29679a).a2(Long.valueOf(m10.i(j0Var.f29679a).e()));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((TLRPC.Chat) it2.next());
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j0Var.getContext(), j0Var.J0);
                            String G = hd.G(arrayList2.size(), "LeaveCommunities", new Object[0]);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = G;
                            if (arrayList2.size() == 1) {
                                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList2.get(0)).title));
                            } else {
                                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                            }
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            alertDialog$Builder.k(hd.M0(2131743364, null), new km(j0Var, arrayList2, a22, 13));
                            t1Var.show();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                q6.U(textView, j6.f29090q7, j0Var.J0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (hashSet.isEmpty()) {
                    j0Var.dismiss();
                    return;
                } else {
                    j0Var.y1(null);
                    return;
                }
        }
    }
}
