package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.n;
import w9.p;
public final class c {
    public final p f46750a;

    public c(p pVar) {
        this.f46750a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f46750a.f48969f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = nVar.f48951e;
        v vVar = new v(nVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.l(new x(vVar, 7));
    }

    public final void b() {
        p pVar = this.f46750a;
        Boolean bool = Boolean.TRUE;
        w9.s sVar = pVar.f48966b;
        synchronized (sVar) {
            sVar.f48992f = false;
            sVar.f48993g = bool;
            SharedPreferences.Editor edit = sVar.f48988a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f48990c) {
                if (sVar.a()) {
                    if (!sVar.f48991e) {
                        sVar.d.trySetResult(null);
                        sVar.f48991e = true;
                    }
                } else if (sVar.f48991e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.f48991e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        n nVar = this.f46750a.f48969f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = nVar.f48948a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f46750a.f48969f.d;
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
                ((s) p3Var.f15850b).l(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
