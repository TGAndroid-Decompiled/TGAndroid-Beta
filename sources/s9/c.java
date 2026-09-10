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
import m.r3;
import w9.m;
import w9.o;
import w9.r;
public final class c {
    public final o f41814a;

    public c(o oVar) {
        this.f41814a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.f41814a.f43914f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = mVar.e;
        v vVar = new v(mVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.o(new x(vVar, 7));
    }

    public final void b() {
        o oVar = this.f41814a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.f43912b;
        synchronized (rVar) {
            rVar.f43934f = false;
            rVar.f43935g = bool;
            SharedPreferences.Editor edit = rVar.f43931a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.f43933c) {
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
        m mVar = this.f41814a.f43914f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = mVar.f43895a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        r3 r3Var = this.f41814a.f43914f.d;
        r3Var.getClass();
        String b10 = x9.d.b(1024, str);
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
                ((s) r3Var.f13138b).o(new g(r3Var, 1));
            } finally {
            }
        }
    }
}
