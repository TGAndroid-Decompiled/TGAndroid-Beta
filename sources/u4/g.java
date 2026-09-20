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
import org.telegram.ui.Cells.f3;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;
public final class g implements Callable {
    public final int f43920a;
    public final Object f43921b;
    public final Object f43922c;

    public g(int i10, Object obj, Object obj2) {
        this.f43920a = i10;
        this.f43922c = obj;
        this.f43921b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f43920a;
        Object obj = this.f43922c;
        Object obj2 = this.f43921b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f2876b.get((String) obj2);
            case 1:
                m5.e eVar = (m5.e) obj;
                m mVar = (m) eVar.f14954c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(mVar.f45238g.f3452b.listFiles(m.f45233r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) mVar.f45243m.f7331b).f3449b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3454f.listFiles()));
                    mVar.f45247q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f45235b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.e.f7346b;
                    return ((Task) eVar.f14953b).onSuccessTask(executor, new f3(20, this, executor));
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
                HashMap hashMap = ha.f45011f;
                pa.b();
                int i11 = oa.f45094a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f45011f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f7385b.e(aVar);
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
        this.f43920a = 4;
        this.f43921b = mobileVisionBase;
        this.f43922c = aVar;
    }
}
