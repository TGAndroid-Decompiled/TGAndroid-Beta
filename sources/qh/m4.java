package qh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class m4 {
    public static final HashMap f46523a = new HashMap();
    public static final HashMap f46524b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (m4.class) {
            try {
                f46523a.clear();
                f46524b.clear();
                int i9 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f46523a.put(Long.valueOf(photo.f22404id), photo);
                        }
                    }
                }
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        Object obj2 = arrayList2.get(i9);
                        i9++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (document != null) {
                            f46524b.put(Long.valueOf(document.f22386id), document);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
