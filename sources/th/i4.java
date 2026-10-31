package th;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i4 implements RequestDelegate {
    public final int f49063a;
    public final e5 f49064b;

    public i4(e5 e5Var, int i10) {
        this.f49063a = i10;
        this.f49064b = e5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49063a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    e5 e5Var = this.f49064b;
                    vp.r1(e5Var.f48904a).K3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.i0.g3(new m4(e5Var, 1));
                    return;
                }
                return;
            case 1:
                final e5 e5Var2 = this.f49064b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e5 e5Var3 = e5Var2;
                                HashSet hashSet = e5Var3.L;
                                int i10 = e5Var3.f48904a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    vp.r1(i10).V3(tL_contacts_blocked.users, false);
                                    vp.r1(i10).P3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked.peer_id)));
                                    }
                                    e5Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    e5Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    vp.r1(i10).V3(tL_contacts_blockedSlice.users, false);
                                    vp.r1(i10).P3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    e5Var3.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < e5Var3.N) {
                                        z10 = false;
                                    }
                                    e5Var3.O = z10;
                                } else {
                                    return;
                                }
                                zs.f(i10).k(196, new Object[0]);
                                e5Var3.P = false;
                                e5Var3.Q = System.currentTimeMillis();
                                return;
                            default:
                                e5 e5Var4 = e5Var2;
                                int i13 = e5Var4.f48904a;
                                ArrayList arrayList3 = e5Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    vp.r1(i13).P3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(vp.k1(chat));
                                    }
                                }
                                e5Var4.U = false;
                                e5Var4.V = true;
                                zs.f(i13).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final e5 e5Var3 = this.f49064b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e5 e5Var32 = e5Var3;
                                HashSet hashSet = e5Var32.L;
                                int i10 = e5Var32.f48904a;
                                TLObject tLObject2 = tLObject;
                                boolean z10 = true;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    vp.r1(i10).V3(tL_contacts_blocked.users, false);
                                    vp.r1(i10).P3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked.peer_id)));
                                    }
                                    e5Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    e5Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    vp.r1(i10).V3(tL_contacts_blockedSlice.users, false);
                                    vp.r1(i10).P3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    e5Var32.N = tL_contacts_blockedSlice.count;
                                    if (hashSet.size() < e5Var32.N) {
                                        z10 = false;
                                    }
                                    e5Var32.O = z10;
                                } else {
                                    return;
                                }
                                zs.f(i10).k(196, new Object[0]);
                                e5Var32.P = false;
                                e5Var32.Q = System.currentTimeMillis();
                                return;
                            default:
                                e5 e5Var4 = e5Var3;
                                int i13 = e5Var4.f48904a;
                                ArrayList arrayList3 = e5Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    vp.r1(i13).P3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(vp.k1(chat));
                                    }
                                }
                                e5Var4.U = false;
                                e5Var4.V = true;
                                zs.f(i13).k(198, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            case 3:
                e5 e5Var4 = this.f49064b;
                e5Var4.getClass();
                org.telegram.messenger.i0.g3(new m4(e5Var4, 0));
                return;
            case 4:
                e5 e5Var5 = this.f49064b;
                e5Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.i0.g3(new m4(e5Var5, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new rh.l5(this.f49064b, tLObject, tL_error, 6));
                return;
        }
    }
}
