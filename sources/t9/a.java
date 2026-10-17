package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
public final class a implements v9.a {
    public final f f46935a;

    public a(f fVar) {
        this.f46935a = fVar;
    }

    public void a(si.a aVar) {
        f fVar = this.f46935a;
        synchronized (fVar) {
            ((ArrayList) fVar.f3096b).add(aVar);
            ((u) fVar.f3097c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void o(Bundle bundle) {
        ((rb.b) this.f46935a.f3095a).o(bundle);
    }
}
