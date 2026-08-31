package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.li1;
public final class o7 implements View.OnClickListener {
    public final int f45834a;
    public final x7 f45835b;

    public o7(x7 x7Var, int i10) {
        this.f45834a = i10;
        this.f45835b = x7Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        b8 b8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f45834a) {
            case 0:
                x7 x7Var = this.f45835b;
                HashMap hashMap = x7Var.d;
                ArrayList arrayList = x7Var.f46291c;
                d8 d8Var = x7Var.T;
                d dVar = x7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    HashMap hashMap2 = d8Var.f45224e;
                    ArrayList arrayList2 = d8Var.d;
                    HashMap hashMap3 = d8Var.f45227r;
                    ArrayList arrayList3 = d8Var.f45226n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = x7Var.f46289a;
                    if (i19 == 5) {
                        q7 q7Var = d8Var.S;
                        if (q7Var != null) {
                            q7Var.run(arrayList);
                        }
                        d8Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f20893id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new li1(3, x7Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = d8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = d8.l1(arrayList3, hashMap3);
                            int i21 = d8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            b8Var = new b8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = b8Var.f45019c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = b8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            b8Var = new b8(i20, i16, d8Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            b8Var = new b8(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = d8.l1(arrayList2, hashMap2);
                            int i22 = d8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            b8Var = new b8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = b8Var.f45019c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = b8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        d8Var.g1(b8Var, new oh.v3(d8Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (d8Var.W) {
                            d8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            d8Var.g1(new b8(2, i13, arrayList), new oh.v3(d8Var, 1), false);
                            return;
                        }
                        d8Var.f1();
                        d8Var.f45222b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (d8Var.W) {
                            HashSet l13 = d8.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                d8Var.f1();
                                i12 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                                b8 b8Var2 = new b8(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = b8Var2.f45019c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = b8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                d8Var.g1(b8Var2, new p7(x7Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!d8.l1(arrayList, hashMap).isEmpty()) {
                            d8Var.K = 3;
                            d8Var.f1();
                            d8Var.f45222b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = d8.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        oh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        p7 p7Var = new p7(x7Var, 1);
                        int i23 = storiesController.f17770a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = storiesController.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = storiesController.N - hashSet.size();
                        storiesController.N = size;
                        if (size < 0) {
                            storiesController.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = l14.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l10.longValue());
                            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l10);
                                tL_contacts_setBlocked.f20890id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new gf.a(p7Var, 11));
                        return;
                    } else {
                        d8Var.K = i19;
                        d8Var.f1();
                        d8Var.f45222b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                x7 x7Var2 = this.f45835b;
                d8 d8Var2 = x7Var2.T;
                if (d8Var2.L) {
                    d8Var2.J = 5;
                    d8Var2.f45222b.D(1);
                    return;
                }
                Context context = x7Var2.getContext();
                g6Var = ((org.telegram.ui.ActionBar.h3) d8Var2).resourcesProvider;
                d8 d8Var3 = new d8(context, g6Var);
                d8Var3.S = new q7(x7Var2, 1);
                d8Var3.N = d8Var2.N;
                d8Var3.show();
                return;
            default:
                x7 x7Var3 = this.f45835b;
                HashMap hashMap7 = x7Var3.d;
                a0.h hVar = x7Var3.f46290b;
                ArrayList arrayList7 = x7Var3.f46291c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                x7Var3.T.G.clear();
                x7Var3.f46298x.f44919c.a();
                x7Var3.f(true);
                x7Var3.e(true);
                return;
        }
    }
}
