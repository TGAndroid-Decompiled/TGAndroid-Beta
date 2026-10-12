package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import w9.n;
import w9.p;
public final class c {
    public final p f48102a;

    public c(p pVar) {
        this.f48102a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f48102a.f50494f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = nVar.f50476e;
        u uVar = new u(nVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.k(new x(uVar, 7));
    }

    public final void b() {
        p pVar = this.f48102a;
        Boolean bool = Boolean.TRUE;
        w9.s sVar = pVar.f50491b;
        synchronized (sVar) {
            sVar.f50517f = false;
            sVar.f50518g = bool;
            SharedPreferences.Editor edit = sVar.f50513a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f50515c) {
                if (sVar.a()) {
                    if (!sVar.f50516e) {
                        sVar.d.trySetResult(null);
                        sVar.f50516e = true;
                    }
                } else if (sVar.f50516e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.f50516e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        n nVar = this.f48102a.f50494f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = nVar.f50473a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        r3 r3Var = this.f48102a.f50494f.d;
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
                ((s) r3Var.f15555b).k(new g(r3Var, 1));
            } finally {
            }
        }
    }
}
