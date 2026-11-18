package w9;

import a3.l;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import w7.s;
public final class a implements y9.a {
    public final f f59637a;

    public a(f fVar) {
        this.f59637a = fVar;
    }

    @Override
    public void M(Bundle bundle) {
        ((s) this.f59637a.f2241a).M(bundle);
    }

    public void a(l lVar) {
        f fVar = this.f59637a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2242b).add(lVar);
            ((z9.a) fVar.f2243c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
