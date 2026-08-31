package x5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class j {
    public final int f50423a;
    public final TaskCompletionSource f50424b = new TaskCompletionSource();
    public final int f50425c;
    public final Bundle d;
    public final int f50426e;

    public j(int i10, int i11, Bundle bundle, int i12) {
        this.f50426e = i12;
        this.f50423a = i10;
        this.f50425c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f50426e) {
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
        this.f50424b.setException(aVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String jVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + jVar + " with " + valueOf);
        }
        this.f50424b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f50425c + " id=" + this.f50423a + " oneWay=" + a() + "}";
    }
}
