package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import sg.y;
import t7.u;
public final class a implements v9.a {
    public final f f46914a;

    public a(f fVar) {
        this.f46914a = fVar;
    }

    public void a(y yVar) {
        f fVar = this.f46914a;
        synchronized (fVar) {
            ((ArrayList) fVar.f3093b).add(yVar);
            ((u) fVar.f3094c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void o(Bundle bundle) {
        ((rb.b) this.f46914a.f3092a).o(bundle);
    }
}
