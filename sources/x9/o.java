package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f53482a;
    public final p f53483b;

    public o(p pVar, int i10) {
        this.f53482a = i10;
        this.f53483b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f53482a) {
            case 0:
                try {
                    u9.b bVar = this.f53483b.d;
                    ca.c cVar = (ca.c) bVar.f50195c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f4084b, (String) bVar.f50194b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f53483b.f53487f;
                u9.b bVar2 = nVar.f53470c;
                ca.c cVar2 = (ca.c) bVar2.f50195c;
                String str = (String) bVar2.f50194b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f4084b, str).exists()) {
                    String e7 = nVar.e();
                    if (e7 == null || !nVar.f53474j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) bVar2.f50195c;
                    cVar3.getClass();
                    new File(cVar3.f4084b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
