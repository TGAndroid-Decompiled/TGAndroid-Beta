package w9;

import a3.l;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements y9.a {
    public final f f57632a;

    public a(f fVar) {
        this.f57632a = fVar;
    }

    public void a(l lVar) {
        f fVar = this.f57632a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2300b).add(lVar);
            ((qb.a) fVar.f2301c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void a2(Bundle bundle) {
        ((qb.a) this.f57632a.f2299a).a2(bundle);
    }
}
