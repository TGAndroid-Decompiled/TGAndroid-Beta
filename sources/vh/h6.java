package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h6 implements View.OnClickListener {
    public final int f51257a;
    public final r6 f51258b;

    public h6(r6 r6Var, int i10) {
        this.f51257a = i10;
        this.f51258b = r6Var;
    }

    @Override
    public final void onClick(View view) {
        u6 u6Var;
        int i10 = this.f51257a;
        r6 r6Var = this.f51258b;
        switch (i10) {
            case 0:
                HashMap hashMap = r6Var.d;
                ArrayList arrayList = r6Var.f51888c;
                w6 w6Var = r6Var.W;
                d dVar = r6Var.f51893w;
                if (!dVar.Q) {
                    int i11 = w6.U1;
                    int i12 = w6Var.f21583a;
                    HashMap hashMap2 = w6Var.l1;
                    ArrayList arrayList2 = w6Var.f52102k1;
                    HashMap hashMap3 = w6Var.f52106p1;
                    ArrayList arrayList3 = w6Var.f52105o1;
                    vp r12 = vp.r1(i12);
                    int i13 = r6Var.f51886a;
                    if (i13 == 5) {
                        j6 j6Var = w6Var.M1;
                        if (j6Var != null) {
                            j6Var.a(arrayList);
                        }
                        w6Var.dismiss();
                        return;
                    } else if (i13 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.f19843id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(w6Var.f21583a).sendRequest(tL_editCloseFriends, new rh.h5(8, r6Var, r12));
                        return;
                    } else if (i13 == 0) {
                        int i14 = w6Var.E1;
                        if (i14 == 3) {
                            u6Var = new u6(w6Var.E1, w6Var.f21583a, new ArrayList(w6.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = u6Var.f52019c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = u6Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i14 == 2) {
                            u6Var = new u6(i14, w6Var.f21583a, w6Var.f52104n1);
                        } else if (i14 == 4) {
                            u6Var = new u6(w6Var.E1, w6Var.f21583a, new ArrayList(w6.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = u6Var.f52019c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = u6Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            u6Var = new u6(i14, w6Var.f21583a, (ArrayList) null);
                        }
                        w6Var.N0(u6Var, new th.r2(w6Var, 1), false);
                        return;
                    } else if (i13 == 2) {
                        if (w6Var.Q1) {
                            w6Var.M0();
                            w6Var.N0(new u6(2, w6Var.f21583a, arrayList), new th.r2(w6Var, 1), false);
                            return;
                        }
                        w6Var.M0();
                        w6Var.f52100i1.E(0);
                        return;
                    } else if (i13 == 3) {
                        if (w6Var.Q1) {
                            HashSet R0 = w6.R0(arrayList, hashMap);
                            if (!R0.isEmpty()) {
                                w6Var.M0();
                                u6 u6Var2 = new u6(3, w6Var.f21583a, new ArrayList(R0));
                                ArrayList arrayList6 = u6Var2.f52019c;
                                arrayList6.clear();
                                arrayList6.addAll(arrayList);
                                HashMap hashMap6 = u6Var2.d;
                                hashMap6.clear();
                                hashMap6.putAll(hashMap);
                                w6Var.N0(u6Var2, new i6(r6Var, 0), false);
                                return;
                            }
                            return;
                        } else if (!w6.R0(arrayList, hashMap).isEmpty()) {
                            w6Var.E1 = 3;
                            w6Var.M0();
                            w6Var.f52100i1.E(0);
                            return;
                        } else {
                            return;
                        }
                    } else if (i13 == 6) {
                        HashSet R02 = w6.R0(arrayList, hashMap);
                        dVar.setLoading(true);
                        th.e5 O1 = vp.r1(w6Var.f21583a).O1();
                        i6 i6Var = new i6(r6Var, 1);
                        int i15 = O1.f48904a;
                        TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                        tL_contacts_setBlocked.my_stories_from = true;
                        HashSet hashSet = O1.L;
                        tL_contacts_setBlocked.limit = hashSet.size();
                        int size = O1.N - hashSet.size();
                        O1.N = size;
                        if (size < 0) {
                            O1.N = 0;
                        }
                        hashSet.clear();
                        Iterator it = R02.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            TLRPC.InputPeer i16 = vp.r1(i15).i1(l4.longValue());
                            if (!(i16 instanceof TLRPC.TL_inputPeerEmpty)) {
                                hashSet.add(l4);
                                tL_contacts_setBlocked.f19840id.add(i16);
                            }
                        }
                        O1.N = hashSet.size() + O1.N;
                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                        ConnectionsManager.getInstance(i15).sendRequest(tL_contacts_setBlocked, new ag.c(i6Var, 19));
                        return;
                    } else {
                        w6Var.E1 = i13;
                        w6Var.M0();
                        w6Var.f52100i1.E(0);
                        return;
                    }
                }
                return;
            case 1:
                w6 w6Var2 = r6Var.W;
                if (w6Var2.F1) {
                    w6Var2.D1 = 5;
                    w6Var2.f52100i1.E(1);
                    return;
                }
                w6 w6Var3 = new w6(r6Var.getContext(), w6Var2.I0);
                w6Var3.M1 = new j6(r6Var, 1);
                w6Var3.H1 = w6Var2.H1;
                w6Var3.show();
                return;
            default:
                HashMap hashMap7 = r6Var.d;
                a0.h hVar = r6Var.f51887b;
                ArrayList arrayList7 = r6Var.f51888c;
                int size2 = arrayList7.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj = arrayList7.get(i17);
                    i17++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj2 = arrayList8.get(i18);
                        i18++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                r6Var.W.A1.clear();
                r6Var.f51895y.d.a();
                r6Var.g(true);
                r6Var.f(true);
                return;
        }
    }
}
