package q5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import m5.b0;
import m5.f0;
import m5.g0;
public abstract class q {
    public final b f46045a;
    public final String f46046b;
    public j4.c f46047c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f46046b = str;
        this.f46045a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        j4.c cVar = this.f46047c;
        if (cVar == null) {
            b bVar = this.f46045a;
            Log.e(bVar.f46009a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) cVar.f13432c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        j4.c cVar = this.f46047c;
        if (cVar == null) {
            b bVar = this.f46045a;
            Log.e(bVar.f46009a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        g0 g0Var = (g0) cVar.f13431b;
        if (g0Var != null) {
            f0 f0Var = (f0) g0Var;
            String str2 = this.f46046b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f2914c = new b0(f0Var, str2, str, 1);
                    b10.f2912a = 8405;
                    f0Var.e(1, b10.b()).addOnFailureListener(new f2.d(cVar, j10, 7));
                    return;
                }
                b bVar2 = f0.G;
                Log.w(bVar2.f46009a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
