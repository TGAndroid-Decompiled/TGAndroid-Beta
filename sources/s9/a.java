package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import u2.o1;
public final class a implements u9.a {
    public final f f43271a;

    public a(f fVar) {
        this.f43271a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43271a.f2326a).J(bundle);
    }

    public void a(o1 o1Var) {
        f fVar = this.f43271a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2327b).add(o1Var);
            ((ob.a) fVar.f2328c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
