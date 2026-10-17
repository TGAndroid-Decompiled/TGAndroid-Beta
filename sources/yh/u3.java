package yh;

import ai.x9;
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
    public final int f50557a;
    public final Object f50558b;

    public u3(Object obj, int i10) {
        this.f50557a = i10;
        this.f50558b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        long j10;
        int i11 = this.f50557a;
        int i12 = 0;
        boolean z10 = true;
        Object obj3 = this.f50558b;
        switch (i11) {
            case 0:
                s61 s61Var = (s61) obj2;
                g4.U((g4) obj3, (ArrayList) obj);
                return;
            case 1:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var2 = (s61) obj2;
                x9 x9Var = l4Var.Y;
                if (x9Var != null) {
                    ArrayList arrayList2 = x9Var.f2448l;
                    arrayList.add(f61.C(AndroidUtilities.dp(16.0f)));
                    if (x9Var.f2445i && arrayList2.isEmpty()) {
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
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(l4Var.X))) {
                                int i15 = g1.f50265a;
                                f61 J = f61.J(g1.class);
                                J.f26149u = 1;
                                J.f26153z = 0;
                                J.G = savedStarGift;
                                J.f26145q = true;
                                J.f26135f = true;
                                J.f26146r = false;
                                HashSet hashSet = l4Var.Z;
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
                        if (x9Var.f2445i || !x9Var.f2446j) {
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
                zh.f fVar = (zh.f) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList3 = fVar.e;
                fVar.f51984c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    fVar.f51983b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        fVar.f51983b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(fVar.f51982a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (shareThemeBackdrops == null) {
                    z10 = false;
                }
                fVar.d = z10;
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
                zh.p0 p0Var = (zh.p0) obj3;
                TLRPC.ShareTheme shareTheme = (TLRPC.ShareTheme) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (shareTheme != null && !p0Var.E && !p0Var.f52084x) {
                    int i17 = p0Var.f52076a;
                    zh.c1[] c1VarArr = zh.c1.d;
                    if (c1VarArr[i17] == null) {
                        c1VarArr[i17] = new zh.c1(i17);
                    }
                    c1VarArr[i17].a(p0Var.f52078c.f52074f, shareTheme);
                    TLRPC.ShareTheme shareTheme2 = p0Var.H;
                    if (shareTheme2 == null) {
                        if (shareTheme == shareTheme2) {
                            return;
                        }
                    } else {
                        byte[] b10 = zh.c1.b(shareTheme);
                        byte[] b11 = zh.c1.b(shareTheme2);
                        if (b10 != null && Arrays.equals(b10, b11)) {
                            return;
                        }
                    }
                    p0Var.a(shareTheme);
                    return;
                }
                return;
        }
    }
}
