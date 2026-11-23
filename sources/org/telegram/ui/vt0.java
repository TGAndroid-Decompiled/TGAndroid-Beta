package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class vt0 implements org.telegram.messenger.y10 {
    public final int f52855a = 0;
    public final boolean f52856b;
    public final String f52857c;
    public final org.telegram.messenger.gs d;
    public final Object f52858e;
    public final Object f52859f;
    public final Object f52860g;

    public vt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.f52858e = channelParticipant;
        this.f52859f = user;
        this.f52860g = chatParticipant;
        this.f52856b = z10;
        this.f52857c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i7 = this.f52855a;
        Object obj2 = this.f52860g;
        Object obj3 = this.f52859f;
        Object obj4 = this.f52858e;
        org.telegram.messenger.gs gsVar = this.d;
        switch (i7) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) gsVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                boolean z11 = this.f52856b;
                if (channelParticipant != null) {
                    profileActivity.R4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.R4(num.intValue(), user, chatParticipant, null, null, this.f52857c, z11);
                    return;
                }
            default:
                r11 r11Var = (r11) gsVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = r11Var.W;
                boolean z12 = this.f52856b;
                String str = this.f52857c;
                if (z12) {
                    ArrayList u02 = org.telegram.messenger.si.d0(i10).u0(5);
                    for (int i11 = 0; i11 < u02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) u02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) u02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.gj.V(arrayList2.get(i12), null, null);
                                long j3 = arrayList2.get(i12).f28404id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j3)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.si.d0(i10).f26817t0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.gj.V(arrayList.get(i14), null, null);
                                long j10 = arrayList.get(i14).f28404id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
                String[] strArr = r11.f51398c2;
                di.l6 l6Var = new di.l6(r11Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (r11Var.f51401a0 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d02.X(strArr, str, false, l6Var, true, z10, false, false, 30);
                return;
        }
    }

    public vt0(r11 r11Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = r11Var;
        this.f52856b = z10;
        this.f52858e = linkedHashSet;
        this.f52857c = str;
        this.f52859f = hashMap;
        this.f52860g = arrayList;
    }
}
