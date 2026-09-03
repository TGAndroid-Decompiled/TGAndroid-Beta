package u5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q5.b0;
import q5.f0;
import q5.g0;
public abstract class q {
    public final b f48421a;
    public final String f48422b;
    public s5.m f48423c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f48422b = str;
        this.f48421a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        s5.m mVar = this.f48423c;
        if (mVar == null) {
            b bVar = this.f48421a;
            Log.e(bVar.f48385a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) mVar.f47094c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        s5.m mVar = this.f48423c;
        if (mVar == null) {
            b bVar = this.f48421a;
            Log.e(bVar.f48385a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        g0 g0Var = (g0) mVar.f47093b;
        if (g0Var != null) {
            f0 f0Var = (f0) g0Var;
            String str2 = this.f48422b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
                    e6.f2824c = new b0(f0Var, str2, str, 1);
                    e6.f2822a = 8405;
                    f0Var.e(1, e6.e()).addOnFailureListener(new f2.c(mVar, j10, 8));
                    return;
                }
                b bVar2 = f0.G;
                Log.w(bVar2.f48385a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
