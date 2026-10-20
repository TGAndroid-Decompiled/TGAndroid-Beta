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
import mi.q;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import x9.m;
import x9.o;
import x9.r;
public final class f implements Callable {
    public final int f47596a;
    public final Object f47597b;
    public final Object f47598c;

    public f(int i10, Object obj, Object obj2) {
        this.f47596a = i10;
        this.f47598c = obj;
        this.f47597b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f47596a;
        Object obj = this.f47598c;
        Object obj2 = this.f47597b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).f3639b.get((String) obj2);
            case 1:
                n2.e eVar = (n2.e) obj;
                m mVar = (m) eVar.f17040c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ca.c.e(mVar.f49699g.f5046b.listFiles(m.f49694r))) {
                        file.delete();
                    }
                    ca.c cVar = ((ca.b) mVar.f49704m.f7646b).f5043b;
                    ca.b.a(ca.c.e(cVar.d.listFiles()));
                    ca.b.a(ca.c.e(cVar.e.listFiles()));
                    ca.b.a(ca.c.e(cVar.f5048f.listFiles()));
                    mVar.f49708q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f49696b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.e.f7660b;
                    return ((Task) eVar.f17039b).onSuccessTask(executor, new q(this, executor, false, 28));
                }
                rVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                m.a((m) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return o.a((o) obj, (ea.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                wb.a aVar = (wb.a) obj;
                HashMap hashMap = ha.f48710f;
                pa.b();
                int i11 = oa.f48793a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f48710f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f7703b.e(aVar);
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
        this.f47596a = 4;
        this.f47597b = mobileVisionBase;
        this.f47598c = aVar;
    }
}
