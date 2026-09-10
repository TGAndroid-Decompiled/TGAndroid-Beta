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
import n7.a1;
import og.u0;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;
public final class g implements Callable {
    public final int f42589a;
    public final Object f42590b;
    public final Object f42591c;

    public g(int i10, Object obj, Object obj2) {
        this.f42589a = i10;
        this.f42591c = obj;
        this.f42590b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f42589a;
        Object obj = this.f42591c;
        Object obj2 = this.f42590b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f1568b.get((String) obj2);
            case 1:
                u0 u0Var = (u0) obj;
                m mVar = (m) u0Var.f14498c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(mVar.f43899g.f2145b.listFiles(m.f43894r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) mVar.f43904m.f6104b).f2142b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f2147f.listFiles()));
                    mVar.f43908q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f43896b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.e.f6118b;
                    return ((Task) u0Var.f14497b).onSuccessTask(executor, new a1(this, executor, false, 23));
                }
                rVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                m.a((m) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return o.a((o) obj, (da.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                vb.a aVar = (vb.a) obj;
                HashMap hashMap = ha.f43670f;
                pa.b();
                int i11 = oa.f43756a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f43670f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f6158b.e(aVar);
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

    public g(MobileVisionBase mobileVisionBase, vb.a aVar) {
        this.f42589a = 4;
        this.f42590b = mobileVisionBase;
        this.f42591c = aVar;
    }
}
