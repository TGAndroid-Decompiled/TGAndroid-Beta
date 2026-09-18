package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f43132a;

    public a(f fVar) {
        this.f43132a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43132a.f2327a).J(bundle);
    }

    public void a(b bVar) {
        f fVar = this.f43132a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2328b).add(bVar);
            ((ob.a) fVar.f2329c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
