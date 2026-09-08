package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements u9.a {
    public final f f45989a;

    public a(f fVar) {
        this.f45989a = fVar;
    }

    public void a(t0.a aVar) {
        f fVar = this.f45989a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1352b).add(aVar);
            ((qb.b) fVar.f1353c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void b0(Bundle bundle) {
        ((na.d) this.f45989a.f1351a).b0(bundle);
    }
}
