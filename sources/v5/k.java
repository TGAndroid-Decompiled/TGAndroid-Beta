package v5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r;
public final class k {
    public final int f49421a;
    public final TaskCompletionSource f49422b = new TaskCompletionSource();
    public final int f49423c;
    public final Bundle d;
    public final int f49424e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.f49424e = i12;
        this.f49421a = i10;
        this.f49423c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f49424e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = rVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f49422b.setException(rVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f49422b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f49423c + " id=" + this.f49421a + " oneWay=" + a() + "}";
    }
}
