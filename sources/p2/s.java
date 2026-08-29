package p2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.rk0;
public final class s implements ServiceConnection {
    public final c f45488a;
    public final com.google.android.gms.internal.play_billing.m f45489b;
    public final com.google.android.gms.internal.play_billing.m f45490c;
    public final b d;

    public s(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f45489b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f45490c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f45488a = cVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f45489b;
            if (mVar.f4646b) {
                long a2 = mVar.f4645a.a();
                if (mVar.f4646b) {
                    mVar.f4646b = false;
                    long j10 = (a2 - mVar.d) + mVar.f4647c;
                    mVar.f4647c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f45490c;
        if (mVar2.f4646b) {
            long a10 = mVar2.f4645a.a();
            if (mVar2.f4646b) {
                mVar2.f4646b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f4647c;
                mVar2.f4647c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(g gVar, int i10, String str, boolean z10) {
        try {
            i3 s10 = j3.s();
            int i11 = gVar.f45457a;
            s10.c();
            j3.r((j3) s10.f4701b, i11);
            String str2 = gVar.f45459c;
            s10.c();
            j3.o((j3) s10.f4701b, str2);
            s10.c();
            j3.q((j3) s10.f4701b, i10);
            if (str != null) {
                s10.c();
                j3.n((j3) s10.f4701b, str);
            }
            Long a2 = a(z10);
            b bVar = this.d;
            if (z10) {
                b4 r6 = c4.r();
                r6.d(false);
                r6.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r6.c();
                    c4.p((c4) r6.f4701b, longValue);
                }
                e3 u10 = f3.u();
                u10.d(s10);
                u10.c();
                f3.t((f3) u10.f4701b, 6);
                u10.e(r6);
                bVar.h((f3) u10.a());
                return;
            }
            y3 p10 = z3.p();
            p10.c();
            z3.n((z3) p10.f4701b, (j3) s10.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p10.c();
                z3.o((z3) p10.f4701b, longValue2);
            }
            bVar.h.t2((z3) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(g gVar) {
        b bVar = this.d;
        synchronized (bVar.f45421a) {
            try {
                if (bVar.f45422b == 3) {
                    return;
                }
                try {
                    this.f45488a.onBillingSetupFinished(gVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                oc.i iVar = bVar.h;
                e3 u10 = f3.u();
                u10.c();
                f3.t((f3) u10.f4701b, 6);
                i3 s10 = j3.s();
                s10.c();
                j3.q((j3) s10.f4701b, 110);
                u10.d(s10);
                b4 r6 = c4.r();
                r6.d(false);
                r6.e();
                u10.e(r6);
                iVar.k2((f3) u10.a());
            } else {
                bVar.h.r2(k3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.d;
        synchronized (bVar2.f45421a) {
            if (bVar2.f45422b != 3 && bVar2.f45422b != 0) {
                bVar2.k(0);
                bVar2.m();
                try {
                    this.f45488a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service connected.");
        b bVar = this.d;
        synchronized (bVar.f45421a) {
            try {
                if (bVar.f45422b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f4543b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new com.google.android.gms.internal.cast.a(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                    }
                }
                bVar.f45427i = aVar;
                if (b.f(new f7.p(this, 8), 30000L, new rk0(this, 7), bVar.r(), bVar.e()) == null) {
                    g u10 = bVar.u();
                    bVar.j(25, u10);
                    c(u10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                oc.i iVar = bVar.h;
                e3 u10 = f3.u();
                u10.c();
                f3.t((f3) u10.f4701b, 6);
                i3 s10 = j3.s();
                s10.c();
                j3.q((j3) s10.f4701b, 109);
                u10.d(s10);
                b4 r6 = c4.r();
                r6.d(false);
                r6.e();
                u10.e(r6);
                iVar.k2((f3) u10.a());
            } else {
                bVar.h.v2(a4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f45490c;
        mVar.f4647c = 0L;
        mVar.f4646b = false;
        mVar.a();
        b bVar2 = this.d;
        synchronized (bVar2.f45421a) {
            try {
                if (bVar2.f45422b != 3) {
                    bVar2.k(0);
                    try {
                        this.f45488a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
