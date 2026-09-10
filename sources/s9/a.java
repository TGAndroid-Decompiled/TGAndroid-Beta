package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements u9.a {
    public final f f41810a;

    public a(f fVar) {
        this.f41810a = fVar;
    }

    public void a(u2.c cVar) {
        f fVar = this.f41810a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1020b).add(cVar);
            ((ob.a) fVar.f1021c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void p(Bundle bundle) {
        ((u) this.f41810a.f1019a).p(bundle);
    }
}
