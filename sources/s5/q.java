package s5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import l3.g0;
import o5.b0;
import o5.e0;
import o5.f0;
public abstract class q {
    public final b f47616a;
    public final String f47617b;
    public g0 f47618c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f47617b = str;
        this.f47616a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        g0 g0Var = this.f47618c;
        if (g0Var == null) {
            b bVar = this.f47616a;
            Log.e(bVar.f47580a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) g0Var.f14097c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        g0 g0Var = this.f47618c;
        if (g0Var == null) {
            b bVar = this.f47616a;
            Log.e(bVar.f47580a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) g0Var.f14096b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f47617b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f3928c = new b0(e0Var, str2, str, 1);
                    b10.f3926a = 8405;
                    e0Var.e(1, b10.b()).addOnFailureListener(new f2.c(g0Var, j10, 8));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f47580a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
