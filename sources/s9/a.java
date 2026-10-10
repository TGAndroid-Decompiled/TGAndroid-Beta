package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.t;
public final class a implements u9.a {
    public final f f47911a;

    public a(f fVar) {
        this.f47911a = fVar;
    }

    @Override
    public void P(Bundle bundle) {
        ((qb.b) this.f47911a.f2594a).P(bundle);
    }

    public void a(s0.b bVar) {
        f fVar = this.f47911a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2595b).add(bVar);
            ((t) fVar.f2596c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
