package zh;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ff0;
public abstract class e {
    public static final ArrayList f51976a = new ArrayList();
    public static final ff0 f51977b = new ff0(24);

    public static Bitmap a(int i10, int i11, long j10) {
        long j11;
        Bitmap bitmap;
        long j12;
        long j13 = i10 * i11;
        long j14 = 4 * j13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = f51976a;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                d dVar = null;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    d dVar2 = (d) obj;
                    long allocationByteCount = dVar2.f51943a.getAllocationByteCount();
                    long j15 = j13;
                    if (elapsedRealtime - dVar2.f51944b >= 200 && allocationByteCount >= j14) {
                        j12 = j14;
                        if (allocationByteCount <= Math.max(8 * j15, 1048576L)) {
                            if (dVar != null && allocationByteCount >= dVar.f51943a.getAllocationByteCount()) {
                            }
                            dVar = dVar2;
                        }
                    } else {
                        j12 = j14;
                    }
                    j13 = j15;
                    j14 = j12;
                }
                j11 = j14;
                if (dVar != null) {
                    f51976a.remove(dVar);
                    bitmap = dVar.f51943a;
                } else {
                    bitmap = null;
                }
            } finally {
            }
        }
        if (bitmap != null) {
            try {
                bitmap.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(0);
                return bitmap;
            } catch (Throwable th2) {
                FileLog.e(th2);
                bitmap.recycle();
            }
        }
        long j16 = j11 + j10;
        if (!e1.a(j16)) {
            b();
            if (!e1.a(j16)) {
                return null;
            }
        }
        try {
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            FileLog.e(e);
            b();
            return null;
        }
    }

    public static void b() {
        ArrayList arrayList = f51976a;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d) obj).f51943a.recycle();
                }
                f51976a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Bitmap bitmap) {
        if (!bitmap.isRecycled() && bitmap.isMutable()) {
            ArrayList arrayList = f51976a;
            synchronized (arrayList) {
                try {
                    arrayList.add(new d(bitmap, SystemClock.elapsedRealtime()));
                    while (true) {
                        ArrayList arrayList2 = f51976a;
                        if (arrayList2.size() > 2) {
                            ((d) arrayList2.remove(0)).f51943a.recycle();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ff0 ff0Var = f51977b;
            AndroidUtilities.cancelRunOnUIThread(ff0Var);
            AndroidUtilities.runOnUIThread(ff0Var, 10000L);
        }
    }
}
