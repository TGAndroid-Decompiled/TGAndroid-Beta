package x5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class j {
    public final int f46820a;
    public final TaskCompletionSource f46821b = new TaskCompletionSource();
    public final int f46822c;
    public final Bundle d;
    public final int e;

    public j(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.f46820a = i10;
        this.f46822c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(b7.a aVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String jVar = toString();
            String obj = aVar.toString();
            Log.d("MessengerIpcClient", "Failing " + jVar + " with " + obj);
        }
        this.f46821b.setException(aVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String jVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + jVar + " with " + valueOf);
        }
        this.f46821b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f46822c + " id=" + this.f46820a + " oneWay=" + a() + "}";
    }
}
