package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;
import x9.n;
import x9.p;
public final class c {
    public final p f45550a;

    public c(p pVar) {
        this.f45550a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f45550a.f48323f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = nVar.e;
        u uVar = new u(nVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.v(new y(uVar, 9));
    }

    public final void b() {
        p pVar = this.f45550a;
        Boolean bool = Boolean.TRUE;
        x9.s sVar = pVar.f48321b;
        synchronized (sVar) {
            sVar.f48343f = false;
            sVar.f48344g = bool;
            SharedPreferences.Editor edit = sVar.f48340a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f48342c) {
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
        n nVar = this.f45550a.f48323f;
        nVar.getClass();
        try {
            ((c2.b) nVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f48304a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        t3 t3Var = this.f45550a.f48323f.d;
        t3Var.getClass();
        String b10 = y9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) t3Var.h).getReference();
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
                ((AtomicMarkableReference) t3Var.h).set(b10, true);
                ((s) t3Var.f14984b).v(new g(t3Var, 1));
            } finally {
            }
        }
    }
}
