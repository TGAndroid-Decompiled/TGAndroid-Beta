package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f48446a;
    public final o f48447b;

    public n(o oVar, int i10) {
        this.f48446a = i10;
        this.f48447b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f48446a) {
            case 0:
                try {
                    o0.a aVar = this.f48447b.d;
                    ba.c cVar = (ba.c) aVar.f16797c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f2554b, (String) aVar.f16796b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f48447b.f48452f;
                o0.a aVar2 = mVar.f48433c;
                ba.c cVar2 = (ba.c) aVar2.f16797c;
                String str = (String) aVar2.f16796b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f2554b, str).exists()) {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.f48438j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) aVar2.f16797c;
                    cVar3.getClass();
                    new File(cVar3.f2554b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
