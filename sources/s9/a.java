package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f42897a;

    public a(f fVar) {
        this.f42897a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f42897a.f2327a).J(bundle);
    }

    public void a(t0.a aVar) {
        f fVar = this.f42897a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2328b).add(aVar);
            ((ob.a) fVar.f2329c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
