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
import org.telegram.ui.ri1;
public final class n7 implements View.OnClickListener {
    public final int f45806a;
    public final w7 f45807b;

    public n7(w7 w7Var, int i10) {
        this.f45806a = i10;
        this.f45807b = w7Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        a8 a8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f45806a) {
            case 0:
                w7 w7Var = this.f45807b;
                HashMap hashMap = w7Var.d;
                ArrayList arrayList = w7Var.f46264c;
                c8 c8Var = w7Var.T;
                d dVar = w7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                    HashMap hashMap2 = c8Var.f45189e;
                    ArrayList arrayList2 = c8Var.d;
                    HashMap hashMap3 = c8Var.f45192r;
                    ArrayList arrayList3 = c8Var.f45191n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = w7Var.f46262a;
                    if (i19 == 5) {
                        p7 p7Var = c8Var.S;
                        if (p7Var != null) {
                            p7Var.run(arrayList);
                        }
                        c8Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f20895id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ri1(3, w7Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = c8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = c8.l1(arrayList3, hashMap3);
                            int i21 = c8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = a8Var.f44996c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = a8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i20, i16, c8Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = c8.l1(arrayList2, hashMap2);
                            int i22 = c8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = a8Var.f44996c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = a8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        c8Var.g1(a8Var, new oh.v3(c8Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (c8Var.W) {
                            c8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            c8Var.g1(new a8(2, i13, arrayList), new oh.v3(c8Var, 1), false);
                            return;
                        }
                        c8Var.f1();
                        c8Var.f45187b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (c8Var.W) {
                            HashSet l13 = c8.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                c8Var.f1();
                                i12 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                                a8 a8Var2 = new a8(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = a8Var2.f44996c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = a8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                c8Var.g1(a8Var2, new o7(w7Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!c8.l1(arrayList, hashMap).isEmpty()) {
                            c8Var.K = 3;
                            c8Var.f1();
                            c8Var.f45187b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = c8.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                        oh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        o7 o7Var = new o7(w7Var, 1);
                        int i23 = storiesController.f17772a;
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
                                tL_contacts_setBlocked.f20892id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new gf.a(o7Var, 11));
                        return;
                    } else {
                        c8Var.K = i19;
                        c8Var.f1();
                        c8Var.f45187b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                w7 w7Var2 = this.f45807b;
                c8 c8Var2 = w7Var2.T;
                if (c8Var2.L) {
                    c8Var2.J = 5;
                    c8Var2.f45187b.D(1);
                    return;
                }
                Context context = w7Var2.getContext();
                g6Var = ((org.telegram.ui.ActionBar.h3) c8Var2).resourcesProvider;
                c8 c8Var3 = new c8(context, g6Var);
                c8Var3.S = new p7(w7Var2, 1);
                c8Var3.N = c8Var2.N;
                c8Var3.show();
                return;
            default:
                w7 w7Var3 = this.f45807b;
                HashMap hashMap7 = w7Var3.d;
                a0.h hVar = w7Var3.f46263b;
                ArrayList arrayList7 = w7Var3.f46264c;
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
                w7Var3.T.G.clear();
                w7Var3.f46271x.f46414c.a();
                w7Var3.f(true);
                w7Var3.e(true);
                return;
        }
    }
}
