package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements u9.a {
    public final f f48098a;

    public a(f fVar) {
        this.f48098a = fVar;
    }

    public void a(s0.b bVar) {
        f fVar = this.f48098a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2593b).add(bVar);
            ((na.d) fVar.f2594c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void x(Bundle bundle) {
        ((rb.a) this.f48098a.f2592a).x(bundle);
    }
}
