package u9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements w9.a {
    public final f f49659a;

    public a(f fVar) {
        this.f49659a = fVar;
    }

    public void a(vg.d dVar) {
        f fVar = this.f49659a;
        synchronized (fVar) {
            ((ArrayList) fVar.f2546b).add(dVar);
            ((tb.a) fVar.f2547c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void b(Bundle bundle) {
        ((pa.d) this.f49659a.f2545a).b(bundle);
    }
}
