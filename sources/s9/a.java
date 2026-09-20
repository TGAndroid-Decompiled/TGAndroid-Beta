package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f43177a;

    public a(f fVar) {
        this.f43177a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43177a.f2327a).J(bundle);
    }

    public void a(s0.b bVar) {
        f fVar = this.f43177a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2328b).add(bVar);
            ((ob.a) fVar.f2329c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
