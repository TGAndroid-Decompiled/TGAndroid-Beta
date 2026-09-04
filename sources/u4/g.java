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
import n7.z0;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;
public final class g implements Callable {
    public final int f46945a;
    public final Object f46946b;
    public final Object f46947c;

    public g(int i10, Object obj, Object obj2) {
        this.f46945a = i10;
        this.f46947c = obj;
        this.f46946b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f46945a;
        Object obj = this.f46947c;
        Object obj2 = this.f46946b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f1904b.get((String) obj2);
            case 1:
                z0 z0Var = (z0) obj;
                m mVar = (m) z0Var.f16704c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(mVar.f48407g.f2527b.listFiles(m.f48401r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) mVar.f48412m.f6375b).f2524b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.f2529e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f2530f.listFiles()));
                    mVar.f48416q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f48403b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.f48405e.f6391b;
                    return ((Task) z0Var.f16703b).onSuccessTask(executor, new o0.a(this, executor, false, 22));
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
                HashMap hashMap = ha.f48162f;
                pa.b();
                int i11 = oa.f48251a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f48162f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e7 = mobileVisionBase.f6438b.e(aVar);
                    haVar.close();
                    return e7;
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
        this.f46945a = 4;
        this.f46946b = mobileVisionBase;
        this.f46947c = aVar;
    }
}
