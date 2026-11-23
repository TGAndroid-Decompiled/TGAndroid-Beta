package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class tt0 implements org.telegram.messenger.w10 {
    public final int f52471a = 0;
    public final boolean f52472b;
    public final String f52473c;
    public final org.telegram.messenger.fs d;
    public final Object f52474e;
    public final Object f52475f;
    public final Object f52476g;

    public tt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.f52474e = channelParticipant;
        this.f52475f = user;
        this.f52476g = chatParticipant;
        this.f52472b = z10;
        this.f52473c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i7 = this.f52471a;
        Object obj2 = this.f52476g;
        Object obj3 = this.f52475f;
        Object obj4 = this.f52474e;
        org.telegram.messenger.fs fsVar = this.d;
        switch (i7) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) fsVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                boolean z11 = this.f52472b;
                if (channelParticipant != null) {
                    profileActivity.R4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.R4(num.intValue(), user, chatParticipant, null, null, this.f52473c, z11);
                    return;
                }
            default:
                q11 q11Var = (q11) fsVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = q11Var.W;
                boolean z12 = this.f52472b;
                String str = this.f52473c;
                if (z12) {
                    ArrayList u02 = org.telegram.messenger.ri.d0(i10).u0(5);
                    for (int i11 = 0; i11 < u02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) u02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) u02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.fj.V(arrayList2.get(i12), null, null);
                                long j3 = arrayList2.get(i12).f28498id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j3)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.ri.d0(i10).f26740t0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.fj.V(arrayList.get(i14), null, null);
                                long j10 = arrayList.get(i14).f28498id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
                String[] strArr = q11.f51223c2;
                di.l6 l6Var = new di.l6(q11Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (q11Var.f51226a0 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d02.X(strArr, str, false, l6Var, true, z10, false, false, 30);
                return;
        }
    }

    public tt0(q11 q11Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = q11Var;
        this.f52472b = z10;
        this.f52474e = linkedHashSet;
        this.f52473c = str;
        this.f52475f = hashMap;
        this.f52476g = arrayList;
    }
}
