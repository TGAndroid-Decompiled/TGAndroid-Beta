package p2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.r1;
public final class a0 extends BroadcastReceiver {
    public boolean f45418a;
    public final boolean f45419b;
    public final f f45420c;

    public a0(f fVar, boolean z10) {
        this.f45420c = fVar;
        this.f45419b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f45418a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f45419b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f45418a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        a0 a0Var;
        int i10;
        try {
            try {
                if (this.f45418a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f45419b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    a0Var = this;
                    context.registerReceiver(a0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    a0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                a0Var.f45418a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, g gVar, int i10, l3 l3Var, long j10, boolean z10) {
        n1 b10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                y yVar = (y) this.f45420c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = n1.f4657a;
                synchronized (n1.class) {
                    int i12 = n1.f4657a;
                    p2 p2Var = p2.f4671c;
                    b10 = r1.b();
                    int i13 = n1.f4657a;
                }
                ((oc.i) yVar).o2(f3.n(byteArray, b10), j10, z10);
                return;
            }
            ((oc.i) ((y) this.f45420c.d)).o2(x.b(23, i10, gVar, null, l3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: p2.a0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
