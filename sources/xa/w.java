package xa;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import rh.l5;
import vh.e0;
public final class w extends Binder {
    public final e0 f53586a;

    public w(e0 e0Var) {
        this.f53586a = e0Var;
    }

    public final void a(x xVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = xVar.f53587a;
            f fVar = (f) this.f53586a.f51092a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.f53538a.execute(new l5(fVar, intent, taskCompletionSource, 21));
            taskCompletionSource.getTask().addOnCompleteListener(new a3.b(3), new wh.b(xVar, 6));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
