package rh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public abstract class n4 {

    public static final HashMap f47299a = new HashMap();

    public static final HashMap f47300b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        try {
            f47299a.clear();
            f47300b.clear();
            int i10 = 0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLRPC.Photo photo = (TLRPC.Photo) obj;
                    if (photo != null) {
                        f47299a.put(Long.valueOf(photo.f22404id), photo);
                    }
                }
            }
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj2;
                    if (document != null) {
                        f47300b.put(Long.valueOf(document.f22386id), document);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
