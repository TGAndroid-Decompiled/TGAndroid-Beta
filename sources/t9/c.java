package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import x9.l;
import x9.n;
import x9.p;
import x9.s;
public final class c {
    public final p f48583a;

    public c(p pVar) {
        this.f48583a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f48583a.f53505f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        xa.n nVar2 = nVar.e;
        l lVar = new l(nVar, currentTimeMillis, th2, currentThread);
        nVar2.getClass();
        nVar2.Y(new t(lVar, 9));
    }

    public final void b() {
        p pVar = this.f48583a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f53503b;
        synchronized (sVar) {
            sVar.f53525f = false;
            sVar.f53526g = bool;
            SharedPreferences.Editor edit = sVar.f53522a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f53524c) {
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
        n nVar = this.f48583a.f53505f;
        nVar.getClass();
        try {
            ((ac.a) nVar.d.d).z(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f53486a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        p3 p3Var = this.f48583a.f53505f.d;
        p3Var.getClass();
        String b10 = y9.d.b(1024, str);
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
                ((xa.n) p3Var.f12520b).Y(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
