package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import v0.k;
public final class a implements v9.a {
    public final f f47353a;

    public a(f fVar) {
        this.f47353a = fVar;
    }

    public void a(k kVar) {
        f fVar = this.f47353a;
        synchronized (fVar) {
            ((ArrayList) fVar.f3100b).add(kVar);
            ((u) fVar.f3101c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void o(Bundle bundle) {
        ((rb.b) this.f47353a.f3099a).o(bundle);
    }
}
