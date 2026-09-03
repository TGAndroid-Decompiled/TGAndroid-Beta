package ph;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qi1;
public final class p7 implements View.OnClickListener {
    public final int f42213a;
    public final y7 f42214b;

    public p7(y7 y7Var, int i10) {
        this.f42213a = i10;
        this.f42214b = y7Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        c8 c8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f42213a) {
            case 0:
                y7 y7Var = this.f42214b;
                HashMap hashMap = y7Var.d;
                ArrayList arrayList = y7Var.f42660c;
                e8 e8Var = y7Var.T;
                d dVar = y7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    HashMap hashMap2 = e8Var.e;
                    ArrayList arrayList2 = e8Var.d;
                    HashMap hashMap3 = e8Var.f41625r;
                    ArrayList arrayList3 = e8Var.f41624n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = y7Var.f42658a;
                    if (i19 == 5) {
                        r7 r7Var = e8Var.S;
                        if (r7Var != null) {
                            r7Var.run(arrayList);
                        }
                        e8Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f19209id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new qi1(3, y7Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = e8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = e8.l1(arrayList3, hashMap3);
                            int i21 = e8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = c8Var.f41439c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = c8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i20, i16, e8Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = e8.l1(arrayList2, hashMap2);
                            int i22 = e8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = c8Var.f41439c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = c8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        e8Var.g1(c8Var, new nh.t3(e8Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (e8Var.W) {
                            e8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            e8Var.g1(new c8(2, i13, arrayList), new nh.t3(e8Var, 1), false);
                            return;
                        }
                        e8Var.f1();
                        e8Var.f41621b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (e8Var.W) {
                            HashSet l13 = e8.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                e8Var.f1();
                                i12 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                                c8 c8Var2 = new c8(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = c8Var2.f41439c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = c8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                e8Var.g1(c8Var2, new q7(y7Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!e8.l1(arrayList, hashMap).isEmpty()) {
                            e8Var.K = 3;
                            e8Var.f1();
                            e8Var.f41621b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = e8.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        nh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        q7 q7Var = new q7(y7Var, 1);
                        int i23 = storiesController.f15897a;
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
                                tL_contacts_setBlocked.f19206id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ff.a(q7Var, 11));
                        return;
                    } else {
                        e8Var.K = i19;
                        e8Var.f1();
                        e8Var.f41621b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                y7 y7Var2 = this.f42214b;
                e8 e8Var2 = y7Var2.T;
                if (e8Var2.L) {
                    e8Var2.J = 5;
                    e8Var2.f41621b.D(1);
                    return;
                }
                Context context = y7Var2.getContext();
                f6Var = ((org.telegram.ui.ActionBar.g3) e8Var2).resourcesProvider;
                e8 e8Var3 = new e8(context, f6Var);
                e8Var3.S = new r7(y7Var2, 1);
                e8Var3.N = e8Var2.N;
                e8Var3.show();
                return;
            default:
                y7 y7Var3 = this.f42214b;
                HashMap hashMap7 = y7Var3.d;
                a0.h hVar = y7Var3.f42659b;
                ArrayList arrayList7 = y7Var3.f42660c;
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
                y7Var3.T.G.clear();
                y7Var3.f42666x.f41334c.a();
                y7Var3.f(true);
                y7Var3.e(true);
                return;
        }
    }
}
