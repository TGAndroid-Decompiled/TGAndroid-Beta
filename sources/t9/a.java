package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import th.m1;
public final class a implements v9.a {
    public final f f48568a;

    public a(f fVar) {
        this.f48568a = fVar;
    }

    @Override
    public void I(Bundle bundle) {
        ((hb.a) this.f48568a.f1379a).I(bundle);
    }

    public void a(m1 m1Var) {
        f fVar = this.f48568a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1380b).add(m1Var);
            ((kb.a) fVar.f1381c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
