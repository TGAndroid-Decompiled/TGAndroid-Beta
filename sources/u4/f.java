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
import n6.k;
import n7.z0;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;
public final class f implements Callable {
    public final int f48933a;
    public final Object f48934b;
    public final Object f48935c;

    public f(int i10, Object obj, Object obj2) {
        this.f48933a = i10;
        this.f48935c = obj;
        this.f48934b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f48933a;
        Object obj = this.f48935c;
        Object obj2 = this.f48934b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).f3177b.get((String) obj2);
            case 1:
                z0 z0Var = (z0) obj;
                m mVar = (m) z0Var.f16870c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(mVar.f50337g.f3800b.listFiles(m.f50331r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) mVar.f50342m.f7954b).f3797b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3802e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3803f.listFiles()));
                    mVar.f50346q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                r rVar = mVar.f50333b;
                if (booleanValue) {
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.f50335e.f7970b;
                    return ((Task) z0Var.f16869b).onSuccessTask(executor, new k(this, executor, false, 24));
                }
                rVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                m.a((m) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return o.a((o) obj, (da.c) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                vb.a aVar = (vb.a) obj;
                HashMap hashMap = ha.f50098f;
                pa.b();
                int i11 = oa.f50186a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f50098f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e7 = mobileVisionBase.f8016b.e(aVar);
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

    public f(MobileVisionBase mobileVisionBase, vb.a aVar) {
        this.f48933a = 4;
        this.f48934b = mobileVisionBase;
        this.f48935c = aVar;
    }
}
