package u4;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import x9.n;
import x9.p;
import x9.s;
public final class f implements Callable {
    public final int f46202a;
    public final Object f46203b;
    public final Object f46204c;

    public f(int i10, Object obj, Object obj2) {
        this.f46202a = i10;
        this.f46204c = obj;
        this.f46203b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f46202a;
        Object obj = this.f46204c;
        Object obj2 = this.f46203b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).f2029b.get((String) obj2);
            case 1:
                n3.b bVar = (n3.b) obj;
                n nVar = (n) bVar.f15704c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ca.c.e(nVar.f48308g.f4678b.listFiles(n.f48303r))) {
                        file.delete();
                    }
                    ca.c cVar = ((ca.b) nVar.f48313m.f6195b).f4675b;
                    ca.b.a(ca.c.e(cVar.d.listFiles()));
                    ca.b.a(ca.c.e(cVar.e.listFiles()));
                    ca.b.a(ca.c.e(cVar.f4680f.listFiles()));
                    nVar.f48317q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f48305b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.f6209b;
                    ?? obj3 = new Object();
                    obj3.f48300b = this;
                    obj3.f48299a = executor;
                    return ((Task) bVar.f15703b).onSuccessTask(executor, obj3);
                }
                sVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (ea.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                wb.a aVar = (wb.a) obj;
                HashMap hashMap = ha.f47318f;
                pa.b();
                int i11 = oa.f47400a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f47318f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f6250b.e(aVar);
                    haVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        haVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
        }
    }

    public f(MobileVisionBase mobileVisionBase, wb.a aVar) {
        this.f46202a = 4;
        this.f46203b = mobileVisionBase;
        this.f46204c = aVar;
    }
}
