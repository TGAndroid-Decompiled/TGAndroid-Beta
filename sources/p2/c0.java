package p2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s1;
import n7.qa;
public final class c0 extends BroadcastReceiver {
    public boolean f40976a;
    public final boolean f40977b;
    public final f f40978c;

    public c0(f fVar, boolean z4) {
        this.f40978c = fVar;
        this.f40977b = z4;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f40976a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f40977b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f40976a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        c0 c0Var;
        int i10;
        try {
            try {
                if (this.f40976a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f40977b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    c0Var = this;
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    c0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.f40976a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, h hVar, int i10, m3 m3Var, long j10, boolean z4) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                a0 a0Var = (a0) this.f40978c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f3554a;
                synchronized (o1.class) {
                    int i12 = o1.f3554a;
                    q2 q2Var = q2.f3569c;
                    d = s1.d();
                    int i13 = o1.f3554a;
                }
                ((qa) a0Var).p1(g3.n(byteArray, d), j10, z4);
                return;
            }
            ((qa) ((a0) this.f40978c.d)).p1(z.b(23, i10, hVar, null, m3Var), j10, z4);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
