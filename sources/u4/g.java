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
import w9.n;
import w9.p;
import w9.s;
public final class g implements Callable {
    public final int f47551a;
    public final Object f47552b;
    public final Object f47553c;

    public g(int i10, Object obj, Object obj2) {
        this.f47551a = i10;
        this.f47553c = obj;
        this.f47552b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f47551a;
        Object obj = this.f47553c;
        Object obj2 = this.f47552b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f3098b.get((String) obj2);
            case 1:
                o0.a aVar = (o0.a) obj;
                n nVar = (n) aVar.f16938c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(nVar.f48969g.f3721b.listFiles(n.f48963r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) nVar.f48974m.f7906b).f3718b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3723e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3724f.listFiles()));
                    nVar.f48978q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f48965b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.f48967e.f7922b;
                    return ((Task) aVar.f16937b).onSuccessTask(executor, new z0(this, executor, false, 23));
                }
                sVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (da.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                vb.a aVar2 = (vb.a) obj;
                HashMap hashMap = ha.f48725f;
                pa.b();
                int i11 = oa.f48812a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f48725f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e7 = mobileVisionBase.f7968b.e(aVar2);
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
        this.f47551a = 4;
        this.f47552b = mobileVisionBase;
        this.f47553c = aVar;
    }
}
