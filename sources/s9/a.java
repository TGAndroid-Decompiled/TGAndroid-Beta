package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f42871a;

    public a(f fVar) {
        this.f42871a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f42871a.f2324a).J(bundle);
    }

    public void a(t0.a aVar) {
        f fVar = this.f42871a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2325b).add(aVar);
            ((ob.a) fVar.f2326c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
