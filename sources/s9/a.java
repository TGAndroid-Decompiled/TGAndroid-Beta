package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f43198a;

    public a(f fVar) {
        this.f43198a = fVar;
    }

    @Override
    public void J(Bundle bundle) {
        ((u) this.f43198a.f2326a).J(bundle);
    }

    public void a(s0.b bVar) {
        f fVar = this.f43198a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2327b).add(bVar);
            ((ob.a) fVar.f2328c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
