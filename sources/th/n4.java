package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class n4 {
    public static final HashMap f48593a = new HashMap();
    public static final HashMap f48594b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (n4.class) {
            try {
                f48593a.clear();
                f48594b.clear();
                int i10 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f48593a.put(Long.valueOf(photo.f22416id), photo);
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
                            f48594b.put(Long.valueOf(document.f22398id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
