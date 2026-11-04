package za;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class y extends Binder {
    public final z6.c f60344a;

    public y(z6.c cVar) {
        this.f60344a = cVar;
    }

    public final void a(z zVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = zVar.f60345a;
            f fVar = (f) this.f60344a.f59791a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.f60288a.execute(new z9.o(fVar, intent, taskCompletionSource, 1));
            taskCompletionSource.getTask().addOnCompleteListener(new c3.b(3), new xg.c(zVar, 10));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
