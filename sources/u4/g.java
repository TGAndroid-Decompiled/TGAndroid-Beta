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
import w9.n;
import w9.p;
import w9.s;
public final class g implements Callable {
    public final int f43941a;
    public final Object f43942b;
    public final Object f43943c;

    public g(int i10, Object obj, Object obj2) {
        this.f43941a = i10;
        this.f43943c = obj;
        this.f43942b = obj2;
    }

    @Override
    public final Object call() {
        ha haVar;
        int i10 = this.f43941a;
        Object obj = this.f43943c;
        Object obj2 = this.f43942b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f2875b.get((String) obj2);
            case 1:
                m5.e eVar = (m5.e) obj;
                n nVar = (n) eVar.f14969c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ba.c.e(nVar.f45259g.f3451b.listFiles(n.f45254r))) {
                        file.delete();
                    }
                    ba.c cVar = ((ba.b) nVar.f45264m.f7329b).f3448b;
                    ba.b.a(ba.c.e(cVar.d.listFiles()));
                    ba.b.a(ba.c.e(cVar.e.listFiles()));
                    ba.b.a(ba.c.e(cVar.f3453f.listFiles()));
                    nVar.f45268q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f45256b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.f7344b;
                    return ((Task) eVar.f14968b).onSuccessTask(executor, new f3(20, this, executor));
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
                vb.a aVar = (vb.a) obj;
                HashMap hashMap = ha.f45031f;
                pa.b();
                int i11 = oa.f45116a;
                pa.b();
                if (!Boolean.parseBoolean("")) {
                    haVar = ga.h;
                } else {
                    HashMap hashMap2 = ha.f45031f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.f7383b.e(aVar);
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
        this.f43941a = 4;
        this.f43942b = mobileVisionBase;
        this.f43943c = aVar;
    }
}
