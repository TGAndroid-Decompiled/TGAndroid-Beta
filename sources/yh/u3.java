package yh;

import ai.y9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
public final class u3 implements Utilities.Callback2 {
    public final int f50582a;
    public final Object f50583b;

    public u3(Object obj, int i10) {
        this.f50582a = i10;
        this.f50583b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        long j10;
        int i11 = this.f50582a;
        int i12 = 0;
        boolean z10 = true;
        Object obj3 = this.f50583b;
        switch (i11) {
            case 0:
                s61 s61Var = (s61) obj2;
                g4.U((g4) obj3, (ArrayList) obj);
                return;
            case 1:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var2 = (s61) obj2;
                y9 y9Var = l4Var.Y;
                if (y9Var != null) {
                    ArrayList arrayList2 = y9Var.f2498l;
                    arrayList.add(f61.C(AndroidUtilities.dp(16.0f)));
                    if (y9Var.f2495i && arrayList2.isEmpty()) {
                        f61 o10 = f61.o(1, 34);
                        o10.f26156u = 1;
                        arrayList.add(o10);
                        f61 o11 = f61.o(2, 34);
                        o11.f26156u = 1;
                        arrayList.add(o11);
                        f61 o12 = f61.o(3, 34);
                        o12.f26156u = 1;
                        arrayList.add(o12);
                        f61 o13 = f61.o(4, 34);
                        o13.f26156u = 1;
                        arrayList.add(o13);
                        f61 o14 = f61.o(5, 34);
                        o14.f26156u = 1;
                        arrayList.add(o14);
                        f61 o15 = f61.o(6, 34);
                        o15.f26156u = 1;
                        arrayList.add(o15);
                        f61 o16 = f61.o(7, 34);
                        o16.f26156u = 1;
                        arrayList.add(o16);
                        f61 o17 = f61.o(8, 34);
                        o17.f26156u = 1;
                        arrayList.add(o17);
                        f61 o18 = f61.o(9, 34);
                        o18.f26156u = 1;
                        arrayList.add(o18);
                    } else {
                        int size = arrayList2.size();
                        int i13 = 0;
                        int i14 = 3;
                        while (i13 < size) {
                            Object obj4 = arrayList2.get(i13);
                            i13++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(l4Var.X))) {
                                int i15 = g1.f50290a;
                                f61 J = f61.J(g1.class);
                                J.f26156u = 1;
                                J.f26160z = 0;
                                J.G = savedStarGift;
                                J.f26152q = true;
                                J.f26142f = true;
                                J.f26153r = false;
                                HashSet hashSet = l4Var.Z;
                                int i16 = savedStarGift.msg_id;
                                if (i16 == 0) {
                                    j10 = savedStarGift.saved_id;
                                } else {
                                    j10 = i16;
                                }
                                J.K(hashSet.contains(Long.valueOf(j10)));
                                J.f26156u = 1;
                                arrayList.add(J);
                                i14--;
                                if (i14 == 0) {
                                    i14 = 3;
                                }
                            }
                        }
                        if (y9Var.f2495i || !y9Var.f2496j) {
                            while (true) {
                                if (i14 <= 0) {
                                    i10 = 3;
                                } else {
                                    i10 = i14;
                                }
                                if (i12 < i10) {
                                    i12++;
                                    f61 o19 = f61.o(i12, 34);
                                    o19.f26156u = 1;
                                    arrayList.add(o19);
                                }
                            }
                        }
                    }
                    arrayList.add(f61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 2:
                zh.d dVar = (zh.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList3 = dVar.e;
                dVar.f51708c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.f51707b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.f51707b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(dVar.f51706a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
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
            default:
                zh.i0 i0Var = (zh.i0) obj3;
                TLRPC.ShareTheme shareTheme = (TLRPC.ShareTheme) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (shareTheme != null && !i0Var.E && !i0Var.f51791x) {
                    int i17 = i0Var.f51783a;
                    zh.u0[] u0VarArr = zh.u0.d;
                    if (u0VarArr[i17] == null) {
                        u0VarArr[i17] = new zh.u0(i17);
                    }
                    u0VarArr[i17].a(i0Var.f51785c.f51781f, shareTheme);
                    TLRPC.ShareTheme shareTheme2 = i0Var.H;
                    if (shareTheme2 == null) {
                        if (shareTheme == shareTheme2) {
                            return;
                        }
                    } else {
                        byte[] b10 = zh.u0.b(shareTheme);
                        byte[] b11 = zh.u0.b(shareTheme2);
                        if (b10 != null && Arrays.equals(b10, b11)) {
                            return;
                        }
                    }
                    i0Var.a(shareTheme);
                    return;
                }
                return;
        }
    }
}
