package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements u9.a {
    public final f f45961a;

    public a(f fVar) {
        this.f45961a = fVar;
    }

    public void a(t0.a aVar) {
        f fVar = this.f45961a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1340b).add(aVar);
            ((qb.b) fVar.f1341c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void b0(Bundle bundle) {
        ((na.d) this.f45961a.f1339a).b0(bundle);
    }
}
