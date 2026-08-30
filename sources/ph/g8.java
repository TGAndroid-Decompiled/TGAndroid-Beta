package ph;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zt0;
public abstract class g8 extends View {
    public static final int f41696a = 0;

    public static void a(int i10, u6 u6Var) {
        d8 d8Var;
        if (u6Var != null) {
            try {
                String string = MessagesController.getInstance(i10).getMainSettings().getString("story_privacy2", null);
                if (string == null) {
                    d8Var = new d8();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                    d8Var = b(serializedData);
                    serializedData.cleanup();
                    if (d8Var.f41469f.isEmpty() && d8Var.f41467b.isEmpty()) {
                        d8Var = new d8();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(d8Var.f41468c);
                        for (ArrayList arrayList : d8Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                            messagesStorage.getStorageQueue().postRunnable(new zt0(messagesStorage, hashSet, i10, 13));
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                d8Var = new d8();
            }
            u6Var.E0 = d8Var;
            u6Var.F0.clear();
            u6Var.F0.addAll(u6Var.E0.f41467b);
            if (UserConfig.getInstance(i10).isPremium()) {
                u6Var.I0 = MessagesController.getInstance(i10).getMainSettings().getInt("story_period", 86400);
            } else {
                u6Var.I0 = 86400;
            }
        }
    }

    public static d8 b(SerializedData serializedData) {
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
                    d8 d8Var = new d8(readInt32, arrayList, 0);
                    ArrayList arrayList5 = d8Var.f41468c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = d8Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return d8Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, d8 d8Var) {
        int i10 = d8Var.f41466a;
        HashMap hashMap = d8Var.d;
        ArrayList arrayList = d8Var.f41468c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = d8Var.e;
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
