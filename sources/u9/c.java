package u9;

import a8.gg;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c5.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.q;
import com.google.firebase.messaging.s;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import y9.n;
import y9.p;
public final class c {
    public final p f49663a;

    public c(p pVar) {
        this.f49663a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f49663a.f52519f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = nVar.e;
        s sVar = new s(nVar, currentTimeMillis, th2, currentThread);
        qVar.getClass();
        qVar.F(new gg(sVar, 10));
    }

    public final void b() {
        p pVar = this.f49663a;
        Boolean bool = Boolean.TRUE;
        y9.s sVar = pVar.f52517b;
        synchronized (sVar) {
            sVar.f52539f = false;
            sVar.f52540g = bool;
            SharedPreferences.Editor edit = sVar.f52536a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f52538c) {
                if (sVar.a()) {
                    if (!sVar.e) {
                        sVar.d.trySetResult(null);
                        sVar.e = true;
                    }
                } else if (sVar.e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        n nVar = this.f49663a.f52519f;
        nVar.getClass();
        try {
            ((c2.b) nVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f52500a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        r3 r3Var = this.f49663a.f52519f.d;
        r3Var.getClass();
        String b10 = z9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                if (b10 == null) {
                    if (str2 == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = b10.equals(str2);
                }
                if (equals) {
                    return;
                }
                ((AtomicMarkableReference) r3Var.h).set(b10, true);
                ((q) r3Var.f17844b).F(new g(r3Var, 1));
            } finally {
            }
        }
    }
}
