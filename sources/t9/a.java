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
            ((ArrayList) fVar.f1481b).add(aVar);
            ((u) fVar.f1482c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void l(Bundle bundle) {
        ((rb.b) this.f45546a.f1480a).l(bundle);
    }
}
