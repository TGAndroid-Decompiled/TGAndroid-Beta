package t5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
public final class k {
    public final int f47694a;
    public final TaskCompletionSource f47695b = new TaskCompletionSource();
    public final int f47696c;
    public final Bundle d;
    public final int f47697e;

    public k(int i9, int i10, Bundle bundle, int i11) {
        this.f47697e = i11;
        this.f47694a = i9;
        this.f47696c = i10;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f47697e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = sVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f47695b.setException(sVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f47695b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f47696c + " id=" + this.f47694a + " oneWay=" + a() + "}";
    }
}
