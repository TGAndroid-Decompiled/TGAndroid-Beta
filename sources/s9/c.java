package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.n;
import w9.p;
import w9.s;
public final class c {
    public final p f43202a;

    public c(p pVar) {
        this.f43202a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f43202a.f45274f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = nVar.e;
        v vVar = new v(nVar, currentTimeMillis, th2, currentThread);
        tVar.getClass();
        tVar.k(new w(vVar, 7));
    }

    public final void b() {
        p pVar = this.f43202a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f45272b;
        synchronized (sVar) {
            sVar.f45294f = false;
            sVar.f45295g = bool;
            SharedPreferences.Editor edit = sVar.f45291a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f45293c) {
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
        n nVar = this.f43202a.f45274f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f45255a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f43202a.f45274f.d;
        p3Var.getClass();
        String b10 = x9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) p3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) p3Var.h).getReference();
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
                ((AtomicMarkableReference) p3Var.h).set(b10, true);
                ((t) p3Var.f14519b).k(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
