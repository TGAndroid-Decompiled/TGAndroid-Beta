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
import org.telegram.ui.ii1;
public final class q7 implements View.OnClickListener {
    public final int f42218a;
    public final z7 f42219b;

    public q7(z7 z7Var, int i10) {
        this.f42218a = i10;
        this.f42219b = z7Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        d8 d8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f42218a) {
            case 0:
                z7 z7Var = this.f42219b;
                HashMap hashMap = z7Var.d;
                ArrayList arrayList = z7Var.f42662c;
                f8 f8Var = z7Var.T;
                d dVar = z7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    HashMap hashMap2 = f8Var.e;
                    ArrayList arrayList2 = f8Var.d;
                    HashMap hashMap3 = f8Var.f41661r;
                    ArrayList arrayList3 = f8Var.f41660n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = z7Var.f42660a;
                    if (i19 == 5) {
                        s7 s7Var = f8Var.S;
                        if (s7Var != null) {
                            s7Var.run(arrayList);
                        }
                        f8Var.dismiss();
                        return;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f19234id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ii1(3, z7Var, messagesController));
                        return;
                    } else if (i19 == 0) {
                        int i20 = f8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = f8.l1(arrayList3, hashMap3);
                            int i21 = f8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                            d8Var = new d8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = d8Var.f41468c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = d8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                            d8Var = new d8(i20, i16, f8Var.h);
                        } else if (i20 != 4) {
                            i14 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                            d8Var = new d8(i20, i14, (ArrayList) null);
                        } else {
                            HashSet l12 = f8.l1(arrayList2, hashMap2);
                            int i22 = f8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                            d8Var = new d8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = d8Var.f41468c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = d8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        }
                        f8Var.g1(d8Var, new nh.t3(f8Var, 1), false);
                        return;
                    } else if (i19 == 2) {
                        if (f8Var.W) {
                            f8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                            f8Var.g1(new d8(2, i13, arrayList), new nh.t3(f8Var, 1), false);
                            return;
                        }
                        f8Var.f1();
                        f8Var.f41657b.D(0);
                        return;
                    } else if (i19 == 3) {
                        if (f8Var.W) {
                            HashSet l13 = f8.l1(arrayList, hashMap);
                            if (!l13.isEmpty()) {
                                f8Var.f1();
                                i12 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                                d8 d8Var2 = new d8(3, i12, new ArrayList(l13));
                                ArrayList arrayList6 = d8Var2.f41468c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = d8Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                f8Var.g1(d8Var2, new r7(z7Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!f8.l1(arrayList, hashMap).isEmpty()) {
                            f8Var.K = 3;
                            f8Var.f1();
                            f8Var.f41657b.D(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i19 == 6) {
                        HashSet l14 = f8.l1(arrayList, hashMap);
                        dVar.setLoading(true);
                        i11 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                        nh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                        r7 r7Var = new r7(z7Var, 1);
                        int i23 = storiesController.f15917a;
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
                                tL_contacts_setBlocked.f19231id.add(inputPeer);
                            }
                        }
                        storiesController.N = hashSet.size() + storiesController.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new gf.a(r7Var, 11));
                        return;
                    } else {
                        f8Var.K = i19;
                        f8Var.f1();
                        f8Var.f41657b.D(0);
                        return;
                    }
                }
                return;
            case 1:
                z7 z7Var2 = this.f42219b;
                f8 f8Var2 = z7Var2.T;
                if (f8Var2.L) {
                    f8Var2.J = 5;
                    f8Var2.f41657b.D(1);
                    return;
                }
                Context context = z7Var2.getContext();
                f6Var = ((org.telegram.ui.ActionBar.g3) f8Var2).resourcesProvider;
                f8 f8Var3 = new f8(context, f6Var);
                f8Var3.S = new s7(z7Var2, 1);
                f8Var3.N = f8Var2.N;
                f8Var3.show();
                return;
            default:
                z7 z7Var3 = this.f42219b;
                HashMap hashMap7 = z7Var3.d;
                a0.h hVar = z7Var3.f42661b;
                ArrayList arrayList7 = z7Var3.f42662c;
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
                z7Var3.T.G.clear();
                z7Var3.f42668x.f41383c.a();
                z7Var3.f(true);
                z7Var3.e(true);
                return;
        }
    }
}
