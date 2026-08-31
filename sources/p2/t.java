package p2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;
import n7.qa;
import org.telegram.ui.Components.ul0;
public final class t implements ServiceConnection {
    public final c f44176a;
    public final com.google.android.gms.internal.play_billing.m f44177b;
    public final com.google.android.gms.internal.play_billing.m f44178c;
    public final b d;

    public t(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f44177b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f44178c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f44176a = cVar;
    }

    public final Long a(boolean z4) {
        if (z4) {
            com.google.android.gms.internal.play_billing.m mVar = this.f44177b;
            if (mVar.f3534b) {
                long a2 = mVar.f3533a.a();
                if (mVar.f3534b) {
                    mVar.f3534b = false;
                    long j10 = (a2 - mVar.d) + mVar.f3535c;
                    mVar.f3535c = j10;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
                }
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            return null;
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f44178c;
        if (mVar2.f3534b) {
            long a10 = mVar2.f3533a.a();
            if (mVar2.f3534b) {
                mVar2.f3534b = false;
                long j11 = (a10 - mVar2.d) + mVar2.f3535c;
                mVar2.f3535c = j11;
                return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
            }
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        return null;
    }

    public final void b(h hVar, int i10, String str, boolean z4) {
        try {
            j3 s6 = k3.s();
            int i11 = hVar.f44145a;
            s6.c();
            k3.r((k3) s6.f3602b, i11);
            String str2 = hVar.f44147c;
            s6.c();
            k3.o((k3) s6.f3602b, str2);
            s6.c();
            k3.q((k3) s6.f3602b, i10);
            if (str != null) {
                s6.c();
                k3.n((k3) s6.f3602b, str);
            }
            Long a2 = a(z4);
            b bVar = this.d;
            if (z4) {
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                if (a2 != null) {
                    long longValue = a2.longValue();
                    r10.c();
                    d4.p((d4) r10.f3602b, longValue);
                }
                f3 u10 = g3.u();
                u10.d(s6);
                u10.c();
                g3.t((g3) u10.f3602b, 6);
                u10.e(r10);
                bVar.h((g3) u10.a());
                return;
            }
            z3 p10 = a4.p();
            p10.c();
            a4.n((a4) p10.f3602b, (k3) s6.a());
            if (a2 != null) {
                long longValue2 = a2.longValue();
                p10.c();
                a4.o((a4) p10.f3602b, longValue2);
            }
            bVar.h.r1((a4) p10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(h hVar) {
        b bVar = this.d;
        synchronized (bVar.f44103a) {
            try {
                if (bVar.f44104b == 3) {
                    return;
                }
                try {
                    this.f44176a.onBillingSetupFinished(hVar);
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
                qa qaVar = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f3602b, 6);
                j3 s6 = k3.s();
                s6.c();
                k3.q((k3) s6.f3602b, 110);
                u10.d(s6);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                qaVar.k1((g3) u10.a());
            } else {
                bVar.h.q1(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.d;
        synchronized (bVar2.f44103a) {
            if (bVar2.f44104b != 3 && bVar2.f44104b != 0) {
                bVar2.k(0);
                bVar2.m();
                try {
                    this.f44176a.onBillingServiceDisconnected();
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
        synchronized (bVar.f44103a) {
            try {
                if (bVar.f44104b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f3438b;
                if (iBinder == null) {
                    aVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c) {
                        aVar = (com.google.android.gms.internal.play_billing.c) queryLocalInterface;
                    } else {
                        aVar = new a7.a(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                    }
                }
                bVar.f44109i = aVar;
                if (b.f(new h2.f(this, 8), 30000L, new ul0(this, 6), bVar.r(), bVar.e()) == null) {
                    h u10 = bVar.u();
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
                qa qaVar = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.f3602b, 6);
                j3 s6 = k3.s();
                s6.c();
                k3.q((k3) s6.f3602b, 109);
                u10.d(s6);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                qaVar.k1((g3) u10.a());
            } else {
                bVar.h.t1(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f44178c;
        mVar.f3535c = 0L;
        mVar.f3534b = false;
        mVar.a();
        b bVar2 = this.d;
        synchronized (bVar2.f44103a) {
            try {
                if (bVar2.f44104b != 3) {
                    bVar2.k(0);
                    try {
                        this.f44176a.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            } finally {
            }
        }
    }
}
