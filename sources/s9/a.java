package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import u2.x0;
public final class a implements u9.a {
    public final f f43208a;

    public a(f fVar) {
        this.f43208a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43208a.f2321a).J(bundle);
    }

    public void a(x0 x0Var) {
        f fVar = this.f43208a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2322b).add(x0Var);
            ((ob.a) fVar.f2323c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
