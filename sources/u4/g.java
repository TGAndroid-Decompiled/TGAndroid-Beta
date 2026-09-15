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
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;
public final class g implements Callable {
    public final int f43618a;
    public final Object f43619b;
    public final Object f43620c;

    public g(int i10, Object obj, Object obj2) {
        this.f43618a = i10;
        this.f43620c = obj;
        this.f43619b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f43618a;
        Object obj = this.f43620c;
        Object obj2 = this.f43619b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f2871b.get((String) obj2);
            case 1:
                o0.a aVar = (o0.a) obj;
                m mVar = (m) aVar.f15301c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(mVar.f44940g.f3447b.listFiles(m.f44935r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) mVar.f44945m.f7332b).f3444b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3449f.listFiles()));
                    mVar.f44949q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f44937b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.e.f7347b;
                    return ((Task) aVar.f15300b).onSuccessTask(executor, new a1(this, executor, false, 23));
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
                vb.a aVar2 = (vb.a) obj;
                HashMap hashMap = ha.f44710f;
                pa.b();
                int i11 = oa.f44796a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f44710f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f7380b.e(aVar2);
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
        this.f43618a = 4;
        this.f43619b = mobileVisionBase;
        this.f43620c = aVar;
    }
}
