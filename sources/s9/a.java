package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f42875a;

    public a(f fVar) {
        this.f42875a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f42875a.f2322a).J(bundle);
    }

    public void a(t0.a aVar) {
        f fVar = this.f42875a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2323b).add(aVar);
            ((ob.a) fVar.f2324c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
