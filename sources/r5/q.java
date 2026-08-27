package r5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import m5.c0;
import m5.f0;
import m5.g0;

public abstract class q {

    public final b f46804a;

    public final String f46805b;

    public j9.a f46806c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f46805b = str;
        this.f46804a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        j9.a aVar = this.f46806c;
        if (aVar != null) {
            return ((AtomicLong) aVar.f12864c).getAndIncrement();
        }
        b bVar = this.f46804a;
        Log.e(bVar.f46768a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void c(long j10, String str) {
        j9.a aVar = this.f46806c;
        if (aVar == null) {
            b bVar = this.f46804a;
            Log.e(bVar.f46768a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        g0 g0Var = (g0) aVar.f12863b;
        if (g0Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        f0 f0Var = (f0) g0Var;
        String str2 = this.f46805b;
        a.b(str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            b bVar2 = f0.G;
            Log.w(bVar2.f46768a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
        vVarB.f3359c = new c0(f0Var, str2, str, 1);
        vVarB.f3357a = 8405;
        f0Var.e(1, vVarB.b()).addOnFailureListener(new f2.c(aVar, j10, 7));
    }
}
