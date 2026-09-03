package wh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class p4 {
    public static final HashMap f49963a = new HashMap();
    public static final HashMap f49964b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (p4.class) {
            try {
                f49963a.clear();
                f49964b.clear();
                int i10 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f49963a.put(Long.valueOf(photo.f20869id), photo);
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
                            f49964b.put(Long.valueOf(document.f20851id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
