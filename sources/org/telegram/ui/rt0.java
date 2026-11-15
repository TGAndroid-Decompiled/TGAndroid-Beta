package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class rt0 implements org.telegram.messenger.z10 {
    public final int f51019a = 0;
    public final boolean f51020b;
    public final String f51021c;
    public final org.telegram.messenger.is d;
    public final Object f51022e;
    public final Object f51023f;
    public final Object f51024g;

    public rt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.f51022e = channelParticipant;
        this.f51023f = user;
        this.f51024g = chatParticipant;
        this.f51020b = z10;
        this.f51021c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i7 = this.f51019a;
        Object obj2 = this.f51024g;
        Object obj3 = this.f51023f;
        Object obj4 = this.f51022e;
        org.telegram.messenger.is isVar = this.d;
        switch (i7) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) isVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                boolean z11 = this.f51020b;
                if (channelParticipant != null) {
                    profileActivity.Q4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.Q4(num.intValue(), user, chatParticipant, null, null, this.f51021c, z11);
                    return;
                }
            default:
                n11 n11Var = (n11) isVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = n11Var.W;
                boolean z12 = this.f51020b;
                String str = this.f51021c;
                if (z12) {
                    ArrayList s02 = org.telegram.messenger.si.b0(i10).s0(5);
                    for (int i11 = 0; i11 < s02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.gj.V(arrayList2.get(i12), null, null);
                                long j3 = arrayList2.get(i12).f28057id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j3)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.si.b0(i10).f26511t0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.gj.V(arrayList.get(i14), null, null);
                                long j10 = arrayList.get(i14).f28057id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
                String[] strArr = n11.f49361c2;
                di.i6 i6Var = new di.i6(n11Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (n11Var.f49364a0 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b02.V(strArr, str, false, i6Var, true, z10, false, false, 30);
                return;
        }
    }

    public rt0(n11 n11Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = n11Var;
        this.f51020b = z10;
        this.f51022e = linkedHashSet;
        this.f51021c = str;
        this.f51023f = hashMap;
        this.f51024g = arrayList;
    }
}
