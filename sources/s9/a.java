package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import u2.l0;
public final class a implements u9.a {
    public final f f46747a;

    public a(f fVar) {
        this.f46747a = fVar;
    }

    @Override
    public void H(Bundle bundle) {
        ((u) this.f46747a.f2515a).H(bundle);
    }

    public void a(l0 l0Var) {
        f fVar = this.f46747a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2516b).add(l0Var);
            ((ob.a) fVar.f2517c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
