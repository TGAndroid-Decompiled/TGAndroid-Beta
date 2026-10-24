package yh;

import ai.y9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
public final class t3 implements Utilities.Callback2 {
    public final int f50988a;
    public final Object f50989b;

    public t3(Object obj, int i10) {
        this.f50988a = i10;
        this.f50989b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        long j10;
        int i11 = this.f50988a;
        int i12 = 0;
        boolean z10 = true;
        Object obj3 = this.f50989b;
        switch (i11) {
            case 0:
                a71 a71Var = (a71) obj2;
                f4.T((f4) obj3, (ArrayList) obj);
                return;
            case 1:
                k4 k4Var = (k4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var2 = (a71) obj2;
                y9 y9Var = k4Var.Y;
                if (y9Var != null) {
                    ArrayList arrayList2 = y9Var.f2511l;
                    arrayList.add(l61.C(AndroidUtilities.dp(16.0f)));
                    if (y9Var.f2508i && arrayList2.isEmpty()) {
                        l61 o10 = l61.o(1, 34);
                        o10.f28236u = 1;
                        arrayList.add(o10);
                        l61 o11 = l61.o(2, 34);
                        o11.f28236u = 1;
                        arrayList.add(o11);
                        l61 o12 = l61.o(3, 34);
                        o12.f28236u = 1;
                        arrayList.add(o12);
                        l61 o13 = l61.o(4, 34);
                        o13.f28236u = 1;
                        arrayList.add(o13);
                        l61 o14 = l61.o(5, 34);
                        o14.f28236u = 1;
                        arrayList.add(o14);
                        l61 o15 = l61.o(6, 34);
                        o15.f28236u = 1;
                        arrayList.add(o15);
                        l61 o16 = l61.o(7, 34);
                        o16.f28236u = 1;
                        arrayList.add(o16);
                        l61 o17 = l61.o(8, 34);
                        o17.f28236u = 1;
                        arrayList.add(o17);
                        l61 o18 = l61.o(9, 34);
                        o18.f28236u = 1;
                        arrayList.add(o18);
                    } else {
                        int size = arrayList2.size();
                        int i13 = 0;
                        int i14 = 3;
                        while (i13 < size) {
                            Object obj4 = arrayList2.get(i13);
                            i13++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(k4Var.X))) {
                                int i15 = f1.f50683a;
                                l61 J = l61.J(f1.class);
                                J.f28236u = 1;
                                J.f28240z = 0;
                                J.G = savedStarGift;
                                J.f28232q = true;
                                J.f28222f = true;
                                J.f28233r = false;
                                HashSet hashSet = k4Var.Z;
                                int i16 = savedStarGift.msg_id;
                                if (i16 == 0) {
                                    j10 = savedStarGift.saved_id;
                                } else {
                                    j10 = i16;
                                }
                                J.K(hashSet.contains(Long.valueOf(j10)));
                                J.f28236u = 1;
                                arrayList.add(J);
                                i14--;
                                if (i14 == 0) {
                                    i14 = 3;
                                }
                            }
                        }
                        if (y9Var.f2508i || !y9Var.f2509j) {
                            while (true) {
                                if (i14 <= 0) {
                                    i10 = 3;
                                } else {
                                    i10 = i14;
                                }
                                if (i12 < i10) {
                                    i12++;
                                    l61 o19 = l61.o(i12, 34);
                                    o19.f28236u = 1;
                                    arrayList.add(o19);
                                }
                            }
                        }
                    }
                    arrayList.add(l61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            default:
                zh.d dVar = (zh.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList3 = dVar.e;
                dVar.f52431c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.f52430b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.f52430b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(dVar.f52429a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (shareThemeBackdrops == null) {
                    z10 = false;
                }
                dVar.d = z10;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                int size2 = arrayList4.size();
                while (i12 < size2) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj5).run();
                }
                return;
        }
    }
}
