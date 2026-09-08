package w7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class d9 {
    public static com.google.android.gms.internal.clearcut.u0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        n6.l.h(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, w5.a.f48066a, googleSignInOptions, new com.google.android.gms.common.api.i(new Object(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        z5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        a5.a aVar = a6.h.f321a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new z5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new z5.b(null, status);
            } else {
                bVar = new z5.b(googleSignInAccount2, Status.f4969e);
            }
        }
        Status status3 = bVar.f50796a;
        if (status3.b() && (googleSignInAccount = bVar.f50797b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(n6.l.m(status3));
    }
}
