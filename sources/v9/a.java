package v9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import z9.j;
public final class a implements x9.a {
    public final f f56484a;

    public a(f fVar) {
        this.f56484a = fVar;
    }

    public void a(j jVar) {
        f fVar = this.f56484a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1723b).add(jVar);
            ((nb.a) fVar.f1724c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void t(Bundle bundle) {
        ((nb.a) this.f56484a.f1722a).t(bundle);
    }
}
