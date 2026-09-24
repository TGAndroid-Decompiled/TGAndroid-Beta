package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import u2.o1;
public final class a implements u9.a {
    public final f f43149a;

    public a(f fVar) {
        this.f43149a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43149a.f2319a).J(bundle);
    }

    public void a(o1 o1Var) {
        f fVar = this.f43149a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2320b).add(o1Var);
            ((ob.a) fVar.f2321c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
