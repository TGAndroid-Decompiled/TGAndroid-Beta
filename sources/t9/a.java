package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements v9.a {
    public final f f45546a;

    public a(f fVar) {
        this.f45546a = fVar;
    }

    public void a(t0.a aVar) {
        f fVar = this.f45546a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1485b).add(aVar);
            ((u) fVar.f1486c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void d(Bundle bundle) {
        ((rb.b) this.f45546a.f1484a).d(bundle);
    }
}
