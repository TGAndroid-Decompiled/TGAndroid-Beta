package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f42827a;

    public a(f fVar) {
        this.f42827a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f42827a.f2319a).J(bundle);
    }

    public void a(v3.d dVar) {
        f fVar = this.f42827a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2320b).add(dVar);
            ((ob.a) fVar.f2321c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
