package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class x6 extends View {
    public static final int f52173a = 0;

    public static void a(int i10, n5 n5Var) {
        u6 u6Var;
        if (n5Var != null) {
            try {
                String string = vp.r1(i10).f7.getString("story_privacy2", null);
                if (string == null) {
                    u6Var = new u6();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    u6Var = b(serializedData);
                    serializedData.cleanup();
                    if (u6Var.f52020f.isEmpty() && u6Var.f52018b.isEmpty()) {
                        u6Var = new u6();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(u6Var.f52019c);
                        for (ArrayList arrayList : u6Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            hs a02 = hs.a0(i10);
                            a02.f15938a.c(new org.telegram.ui.Wallet.x0(a02, hashSet, i10, 22));
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                u6Var = new u6();
            }
            n5Var.E0 = u6Var;
            n5Var.F0.clear();
            n5Var.F0.addAll(n5Var.E0.f52018b);
            if (d20.i(i10).q()) {
                n5Var.I0 = vp.r1(i10).f7.getInt("story_period", 86400);
            } else {
                n5Var.I0 = 86400;
            }
        }
    }

    public static u6 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i10 = 0; i10 < readInt322; i10++) {
                arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
            }
            if (serializedData.readInt32(true) == 481674261) {
                int readInt323 = serializedData.readInt32(true);
                ArrayList arrayList2 = new ArrayList(readInt323);
                for (int i11 = 0; i11 < readInt323; i11++) {
                    arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
                }
                if (serializedData.readInt32(true) == 481674261) {
                    int readInt324 = serializedData.readInt32(true);
                    HashMap hashMap = new HashMap();
                    for (int i12 = 0; i12 < readInt324; i12++) {
                        long readInt64 = serializedData.readInt64(true);
                        if (serializedData.readInt32(true) == 481674261) {
                            int readInt325 = serializedData.readInt32(true);
                            ArrayList arrayList3 = new ArrayList(readInt325);
                            for (int i13 = 0; i13 < readInt325; i13++) {
                                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
                            }
                            hashMap.put(Long.valueOf(readInt64), arrayList3);
                        } else {
                            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList2);
                    for (ArrayList arrayList4 : hashMap.values()) {
                        hashSet.addAll(arrayList4);
                    }
                    u6 u6Var = new u6(readInt32, arrayList, 0);
                    ArrayList arrayList5 = u6Var.f52019c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = u6Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return u6Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, u6 u6Var) {
        int i10 = u6Var.f52017a;
        HashMap hashMap = u6Var.d;
        ArrayList arrayList = u6Var.f52019c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = u6Var.e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            serializedData.writeInt64(((Long) obj2).longValue());
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            serializedData.writeInt64(((Long) entry.getKey()).longValue());
            serializedData.writeInt32(481674261);
            serializedData.writeInt32(((ArrayList) entry.getValue()).size());
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
