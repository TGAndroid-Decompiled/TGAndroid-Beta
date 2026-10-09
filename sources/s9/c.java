package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.q3;
import w9.m;
import w9.o;
import w9.r;
public final class c {
    public final o f47869a;

    public c(o oVar) {
        this.f47869a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.f47869a.f50264f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = mVar.f50246e;
        v vVar = new v(mVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.k(new x(vVar, 7));
    }

    public final void b() {
        o oVar = this.f47869a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.f50261b;
        synchronized (rVar) {
            rVar.f50287f = false;
            rVar.f50288g = bool;
            SharedPreferences.Editor edit = rVar.f50283a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.f50285c) {
                if (rVar.a()) {
                    if (!rVar.f50286e) {
                        rVar.d.trySetResult(null);
                        rVar.f50286e = true;
                    }
                } else if (rVar.f50286e) {
                    rVar.d = new TaskCompletionSource();
                    rVar.f50286e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        m mVar = this.f47869a.f50264f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = mVar.f50243a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        q3 q3Var = this.f47869a.f50264f.d;
        q3Var.getClass();
        String b10 = x9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) q3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) q3Var.h).getReference();
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
                ((AtomicMarkableReference) q3Var.h).set(b10, true);
                ((s) q3Var.f15796b).k(new g(q3Var, 1));
            } finally {
            }
        }
    }
}
