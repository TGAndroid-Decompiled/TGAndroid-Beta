package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.w;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.m;
import w9.o;
import w9.r;
public final class c {
    public final o f42875a;

    public c(o oVar) {
        this.f42875a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.f42875a.f44951f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = mVar.e;
        w wVar = new w(mVar, currentTimeMillis, th2, currentThread);
        tVar.getClass();
        tVar.k(new x(wVar, 7));
    }

    public final void b() {
        o oVar = this.f42875a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.f44949b;
        synchronized (rVar) {
            rVar.f44971f = false;
            rVar.f44972g = bool;
            SharedPreferences.Editor edit = rVar.f44968a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.f44970c) {
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
        m mVar = this.f42875a.f44951f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = mVar.f44932a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f42875a.f44951f.d;
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
                ((t) p3Var.f14281b).k(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
