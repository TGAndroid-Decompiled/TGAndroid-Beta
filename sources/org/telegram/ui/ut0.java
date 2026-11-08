package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class ut0 implements org.telegram.messenger.c20 {
    public final int f50418a = 0;
    public final boolean f50419b;
    public final String f50420c;
    public final org.telegram.messenger.ls d;
    public final Object f50421e;
    public final Object f50422f;
    public final Object f50423g;

    public ut0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z9, String str) {
        this.d = profileActivity;
        this.f50421e = channelParticipant;
        this.f50422f = user;
        this.f50423g = chatParticipant;
        this.f50419b = z9;
        this.f50420c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i7 = this.f50418a;
        Object obj2 = this.f50423g;
        Object obj3 = this.f50422f;
        Object obj4 = this.f50421e;
        org.telegram.messenger.ls lsVar = this.d;
        switch (i7) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) lsVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                boolean z10 = this.f50419b;
                if (channelParticipant != null) {
                    profileActivity.O4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.O4(num.intValue(), user, chatParticipant, null, null, this.f50420c, z10);
                    return;
                }
            default:
                q11 q11Var = (q11) lsVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = q11Var.V;
                boolean z11 = this.f50419b;
                String str = this.f50420c;
                if (z11) {
                    ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(5);
                    for (int i11 = 0; i11 < s02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.ij.V(arrayList2.get(i12), null, null);
                                long j3 = arrayList2.get(i12).f26962id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j3)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(i10).f25840s0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.ij.V(arrayList.get(i14), null, null);
                                long j10 = arrayList.get(i14).f26962id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
                String[] strArr = q11.f49016b2;
                bi.q7 q7Var = new bi.q7(q11Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (q11Var.W == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b02.V(strArr, str, false, q7Var, true, z9, false, false, 30);
                return;
        }
    }

    public ut0(q11 q11Var, boolean z9, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = q11Var;
        this.f50419b = z9;
        this.f50421e = linkedHashSet;
        this.f50420c = str;
        this.f50422f = hashMap;
        this.f50423g = arrayList;
    }
}
