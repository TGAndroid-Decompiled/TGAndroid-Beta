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
public final class t3 implements Utilities.Callback2 {
    public final int f50522a;
    public final Object f50523b;

    public t3(Object obj, int i10) {
        this.f50522a = i10;
        this.f50523b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        long j10;
        int i11 = this.f50522a;
        int i12 = 0;
        boolean z10 = true;
        Object obj3 = this.f50523b;
        switch (i11) {
            case 0:
                s61 s61Var = (s61) obj2;
                f4.U((f4) obj3, (ArrayList) obj);
                return;
            case 1:
                k4 k4Var = (k4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var2 = (s61) obj2;
                y9 y9Var = k4Var.Y;
                if (y9Var != null) {
                    ArrayList arrayList2 = y9Var.f2499l;
                    arrayList.add(f61.C(AndroidUtilities.dp(16.0f)));
                    if (y9Var.f2496i && arrayList2.isEmpty()) {
                        f61 o10 = f61.o(1, 34);
                        o10.f26149u = 1;
                        arrayList.add(o10);
                        f61 o11 = f61.o(2, 34);
                        o11.f26149u = 1;
                        arrayList.add(o11);
                        f61 o12 = f61.o(3, 34);
                        o12.f26149u = 1;
                        arrayList.add(o12);
                        f61 o13 = f61.o(4, 34);
                        o13.f26149u = 1;
                        arrayList.add(o13);
                        f61 o14 = f61.o(5, 34);
                        o14.f26149u = 1;
                        arrayList.add(o14);
                        f61 o15 = f61.o(6, 34);
                        o15.f26149u = 1;
                        arrayList.add(o15);
                        f61 o16 = f61.o(7, 34);
                        o16.f26149u = 1;
                        arrayList.add(o16);
                        f61 o17 = f61.o(8, 34);
                        o17.f26149u = 1;
                        arrayList.add(o17);
                        f61 o18 = f61.o(9, 34);
                        o18.f26149u = 1;
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
                                int i15 = f1.f50230a;
                                f61 J = f61.J(f1.class);
                                J.f26149u = 1;
                                J.f26153z = 0;
                                J.G = savedStarGift;
                                J.f26145q = true;
                                J.f26135f = true;
                                J.f26146r = false;
                                HashSet hashSet = k4Var.Z;
                                int i16 = savedStarGift.msg_id;
                                if (i16 == 0) {
                                    j10 = savedStarGift.saved_id;
                                } else {
                                    j10 = i16;
                                }
                                J.K(hashSet.contains(Long.valueOf(j10)));
                                J.f26149u = 1;
                                arrayList.add(J);
                                i14--;
                                if (i14 == 0) {
                                    i14 = 3;
                                }
                            }
                        }
                        if (y9Var.f2496i || !y9Var.f2497j) {
                            while (true) {
                                if (i14 <= 0) {
                                    i10 = 3;
                                } else {
                                    i10 = i14;
                                }
                                if (i12 < i10) {
                                    i12++;
                                    f61 o19 = f61.o(i12, 34);
                                    o19.f26149u = 1;
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
                dVar.f51661c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.f51660b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.f51660b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(dVar.f51659a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
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
                if (shareTheme != null && !i0Var.E && !i0Var.f51746x) {
                    int i17 = i0Var.f51738a;
                    zh.v0[] v0VarArr = zh.v0.d;
                    if (v0VarArr[i17] == null) {
                        v0VarArr[i17] = new zh.v0(i17);
                    }
                    v0VarArr[i17].a(i0Var.f51740c.f51736f, shareTheme);
                    TLRPC.ShareTheme shareTheme2 = i0Var.H;
                    if (shareTheme2 == null) {
                        if (shareTheme == shareTheme2) {
                            return;
                        }
                    } else {
                        byte[] b10 = zh.v0.b(shareTheme);
                        byte[] b11 = zh.v0.b(shareTheme2);
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
