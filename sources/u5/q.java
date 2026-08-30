package u5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q5.b0;
import q5.e0;
import q5.f0;
public abstract class q {
    public final b f45131a;
    public final String f45132b;
    public s5.m f45133c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f45132b = str;
        this.f45131a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        s5.m mVar = this.f45133c;
        if (mVar == null) {
            b bVar = this.f45131a;
            Log.e(bVar.f45098a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) mVar.f44089c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        s5.m mVar = this.f45133c;
        if (mVar == null) {
            b bVar = this.f45131a;
            Log.e(bVar.f45098a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) mVar.f44088b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f45132b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f2885c = new b0(e0Var, str2, str, 1);
                    e.f2883a = 8405;
                    e0Var.e(1, e.e()).addOnFailureListener(new f2.c(mVar, j10, 8));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f45098a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
