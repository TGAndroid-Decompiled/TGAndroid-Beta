package u5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;

public final class j {

    public final int f48416a;

    public final TaskCompletionSource f48417b = new TaskCompletionSource();

    public final int f48418c;
    public final Bundle d;

    public final int f48419e;

    public j(int i10, int i11, Bundle bundle, int i12) {
        this.f48419e = i12;
        this.f48416a = i10;
        this.f48418c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f48419e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + sVar.toString());
        }
        this.f48417b.setException(sVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f48417b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f48418c + " id=" + this.f48416a + " oneWay=" + a() + "}";
    }
}
