package pb;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import u4.f;
import w7.ea;
import w7.fa;
import w7.ma;
import w7.na;
import x7.g8;
import x9.n;
import x9.p;
import x9.s;
public final class d implements Callable {
    public final int f44901a;
    public final Object f44902b;
    public final Object f44903c;

    public d(int i10, Object obj, Object obj2) {
        this.f44901a = i10;
        this.f44903c = obj;
        this.f44902b = obj2;
    }

    @Override
    public final Object call() {
        fa faVar;
        int i10 = this.f44901a;
        Object obj = this.f44902b;
        Object obj2 = this.f44903c;
        switch (i10) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                ob.a aVar = (ob.a) obj2;
                HashMap hashMap = fa.f52517f;
                na.b();
                int i11 = ma.f52651a;
                na.b();
                if (!Boolean.parseBoolean("")) {
                    faVar = ea.h;
                } else {
                    HashMap hashMap2 = fa.f52517f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new fa("detectorTaskWithResource#run"));
                    }
                    faVar = (fa) hashMap2.get("detectorTaskWithResource#run");
                }
                faVar.a();
                try {
                    Object e = mobileVisionBase.f5613b.e(aVar);
                    faVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        faVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            case 1:
                return (f) ((ShortcutInfoCompatSaverImpl) obj2).f1930b.get((String) obj);
            case 2:
                g8 g8Var = (g8) obj2;
                n nVar = (n) g8Var.f53165c;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ca.c.e(nVar.f53472g.f4084b.listFiles(n.f53467r))) {
                        file.delete();
                    }
                    ca.c cVar = ((ca.b) nVar.f53477m.f9348b).f4081b;
                    ca.b.a(ca.c.e(cVar.d.listFiles()));
                    ca.b.a(ca.c.e(cVar.e.listFiles()));
                    ca.b.a(ca.c.e(cVar.f4086f.listFiles()));
                    nVar.f53481q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f53469b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.f53554a;
                    return ((Task) g8Var.f53164b).onSuccessTask(executor, new u9.b(this, executor));
                }
                sVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 3:
                n.a((n) obj2, (String) obj, Boolean.FALSE);
                return null;
            default:
                return p.a((p) obj2, (ea.d) obj);
        }
    }

    public d(MobileVisionBase mobileVisionBase, ob.a aVar) {
        this.f44901a = 0;
        this.f44902b = mobileVisionBase;
        this.f44903c = aVar;
    }
}
