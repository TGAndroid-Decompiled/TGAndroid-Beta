package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.m;
import w9.o;
import w9.r;
public final class c {
    public final o f43168a;

    public c(o oVar) {
        this.f43168a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.f43168a.f45237f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = mVar.e;
        v vVar = new v(mVar, currentTimeMillis, th2, currentThread);
        tVar.getClass();
        tVar.k(new x(vVar, 7));
    }

    public final void b() {
        o oVar = this.f43168a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.f45235b;
        synchronized (rVar) {
            rVar.f45257f = false;
            rVar.f45258g = bool;
            SharedPreferences.Editor edit = rVar.f45254a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.f45256c) {
                if (rVar.a()) {
                    if (!rVar.e) {
                        rVar.d.trySetResult(null);
                        rVar.e = true;
                    }
                } else if (rVar.e) {
                    rVar.d = new TaskCompletionSource();
                    rVar.e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        m mVar = this.f43168a.f45237f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = mVar.f45218a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f43168a.f45237f.d;
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
                ((t) p3Var.f14524b).k(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
