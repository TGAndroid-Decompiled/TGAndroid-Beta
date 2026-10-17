package zh;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j implements NotificationCenter.NotificationCenterDelegate {
    public final int f52030a;
    public final ArrayList f52031b;
    public final HashMap f52032c;
    public final HashMap d = new HashMap();
    public final int e;
    public final boolean f52033f;
    public final v0 h;
    public boolean f52034n;
    public boolean f52035r;

    public j(int i10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, int i11, boolean z10, v0 v0Var) {
        this.f52030a = i10;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f52031b = arrayList2;
        this.f52032c = hashMap2;
        this.e = i11;
        this.f52033f = z10;
        this.h = v0Var;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        FileLoader fileLoader = FileLoader.getInstance(i10);
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            Long l4 = (Long) obj;
            l4.getClass();
            TLRPC.Document document = (TLRPC.Document) hashMap.get(l4);
            if (document != null && ("application/x-tgsticker".equals(document.mime_type) || "video/webm".equals(document.mime_type))) {
                this.d.put(l4, document);
                if (!FileLoader.getInstance(this.f52030a).getPathToAttach(document, true).exists()) {
                    fileLoader.loadFile(document, document, 1, 1);
                }
            }
        }
        a();
    }

    public final void a() {
        File file;
        File file2;
        boolean z10;
        if (!this.f52035r && !this.f52034n) {
            for (TLRPC.Document document : this.d.values()) {
                if (!FileLoader.getInstance(this.f52030a).getPathToAttach(document, true).exists()) {
                    return;
                }
            }
            this.f52035r = true;
            int i10 = this.f52030a;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoadFailed);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f52031b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                Long l4 = (Long) obj;
                long longValue = l4.longValue();
                TLRPC.Document document2 = (TLRPC.Document) this.d.get(l4);
                if (document2 != null) {
                    file = FileLoader.getInstance(this.f52030a).getPathToAttach(document2, true);
                } else {
                    file = null;
                }
                if (document2 != null && "video/webm".equals(document2.mime_type)) {
                    file2 = file;
                    z10 = true;
                } else {
                    file2 = file;
                    z10 = false;
                }
                arrayList.add(new k(longValue, file2, z10, (Bitmap) this.f52032c.get(l4)));
            }
            Utilities.globalQueue.postRunnable(new uf.c(20, this, arrayList));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoadFailed && objArr.length > 0) {
            HashMap hashMap = this.d;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Long l4 = (Long) obj;
                if (FileLoader.getAttachFileName((TLObject) hashMap.get(l4)).equals(objArr[0])) {
                    hashMap.remove(l4);
                }
            }
        }
        a();
    }
}
