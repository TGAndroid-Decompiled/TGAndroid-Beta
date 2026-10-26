package y9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f52456a;
    public final p f52457b;

    public o(p pVar, int i10) {
        this.f52456a = i10;
        this.f52457b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f52456a) {
            case 0:
                try {
                    m4.c cVar = this.f52457b.d;
                    da.c cVar2 = (da.c) cVar.f18010c;
                    cVar2.getClass();
                    boolean delete = new File(cVar2.f8274b, (String) cVar.f18009b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f52457b.f52461f;
                m4.c cVar3 = nVar.f52444c;
                da.c cVar4 = (da.c) cVar3.f18010c;
                String str = (String) cVar3.f18009b;
                cVar4.getClass();
                boolean z10 = true;
                if (!new File(cVar4.f8274b, str).exists()) {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.f52448j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    da.c cVar5 = (da.c) cVar3.f18010c;
                    cVar5.getClass();
                    new File(cVar5.f8274b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
