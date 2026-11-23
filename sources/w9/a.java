package w9;

import a3.l;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import w7.s;
public final class a implements y9.a {
    public final f f59765a;

    public a(f fVar) {
        this.f59765a = fVar;
    }

    @Override
    public void I(Bundle bundle) {
        ((s) this.f59765a.f2213a).I(bundle);
    }

    public void a(l lVar) {
        f fVar = this.f59765a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2214b).add(lVar);
            ((z9.a) fVar.f2215c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
