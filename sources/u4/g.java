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
    public final int f47544a;
    public final Object f47545b;
    public final Object f47546c;

    public g(int i10, Object obj, Object obj2) {
        this.f47544a = i10;
        this.f47546c = obj;
        this.f47545b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f47544a;
        Object obj = this.f47546c;
        Object obj2 = this.f47545b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f3098b.get((String) obj2);
            case 1:
                o0.a aVar = (o0.a) obj;
                n nVar = (n) aVar.f16933c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(nVar.f48962g.f3721b.listFiles(n.f48956r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) nVar.f48967m.f7906b).f3718b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3723e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3724f.listFiles()));
                    nVar.f48971q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f48958b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.f48960e.f7922b;
                    return ((Task) aVar.f16932b).onSuccessTask(executor, new z0(this, executor, false, 23));
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
                HashMap hashMap = ha.f48718f;
                pa.b();
                int i11 = oa.f48805a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f48718f;
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
        this.f47544a = 4;
        this.f47545b = mobileVisionBase;
        this.f47546c = aVar;
    }
}
