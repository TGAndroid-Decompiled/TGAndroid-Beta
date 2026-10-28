package u4;

import aa.b0;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import x7.ha;
import x7.ia;
import x7.pa;
import x7.qa;
import y9.l;
import y9.n;
import y9.p;
import y9.s;
public final class f implements Callable {
    public final int f49619a;
    public final Object f49620b;
    public final Object f49621c;

    public f(int i10, Object obj, Object obj2) {
        this.f49619a = i10;
        this.f49621c = obj;
        this.f49620b = obj2;
    }

    @Override
    public final Object call() {
        ia iaVar;
        int i10 = this.f49619a;
        Object obj = this.f49621c;
        Object obj2 = this.f49620b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).f3092b.get((String) obj2);
            case 1:
                l lVar = (l) obj;
                n nVar = (n) lVar.f52496b;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : da.c.e(nVar.f52504g.f8274b.listFiles(n.f52499r))) {
                        file.delete();
                    }
                    da.c cVar = ((da.b) nVar.f52509m.f1151b).f8271b;
                    da.b.a(da.c.e(cVar.d.listFiles()));
                    da.b.a(da.c.e(cVar.e.listFiles()));
                    da.b.a(da.c.e(cVar.f8276f.listFiles()));
                    nVar.f52513q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f52501b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.f7757a;
                    return ((Task) lVar.f52495a).onSuccessTask(executor, new m4.c(this, executor, false, 28));
                }
                sVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (b0) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                xb.a aVar = (xb.a) obj;
                HashMap hashMap = ia.f51585f;
                qa.b();
                int i11 = pa.f51668a;
                qa.b();
                if (!Boolean.parseBoolean("")) {
                    iaVar = ha.h;
                } else {
                    HashMap hashMap2 = ia.f51585f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ia("detectorTaskWithResource#run"));
                    }
                    iaVar = (ia) hashMap2.get("detectorTaskWithResource#run");
                }
                iaVar.a();
                try {
                    Object e = mobileVisionBase.f7807b.e(aVar);
                    iaVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        iaVar.close();
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

    public f(MobileVisionBase mobileVisionBase, xb.a aVar) {
        this.f49619a = 4;
        this.f49620b = mobileVisionBase;
        this.f49621c = aVar;
    }
}
