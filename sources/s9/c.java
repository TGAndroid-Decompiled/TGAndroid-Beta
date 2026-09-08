package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.m;
import w9.o;
import w9.r;
public final class c {
    public final o f45993a;

    public c(o oVar) {
        this.f45993a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.f45993a.f48452f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = mVar.f48434e;
        u uVar = new u(mVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.h(new x(uVar, 7));
    }

    public final void b() {
        o oVar = this.f45993a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.f48449b;
        synchronized (rVar) {
            rVar.f48475f = false;
            rVar.f48476g = bool;
            SharedPreferences.Editor edit = rVar.f48471a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.f48473c) {
                if (rVar.a()) {
                    if (!rVar.f48474e) {
                        rVar.d.trySetResult(null);
                        rVar.f48474e = true;
                    }
                } else if (rVar.f48474e) {
                    rVar.d = new TaskCompletionSource();
                    rVar.f48474e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        m mVar = this.f45993a.f48452f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = mVar.f48431a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f45993a.f48452f.d;
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
                ((s) p3Var.f15662b).h(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
