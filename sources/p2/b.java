package p2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nh.d6;
import org.telegram.messenger.BillingController;
public class b extends a {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f45423c;
    public final String d;
    public volatile f f45425f;
    public final Context f45426g;
    public final oc.i h;
    public volatile com.google.android.gms.internal.play_billing.c f45427i;
    public volatile s f45428j;
    public boolean f45429k;
    public boolean f45431m;
    public boolean f45432n;
    public boolean f45433o;
    public boolean f45434p;
    public boolean f45435q;
    public boolean f45436r;
    public boolean f45437s;
    public boolean f45438t;
    public boolean f45439u;
    public boolean v;
    public boolean f45440w;
    public final f7.v f45441x;
    public final boolean f45442y;
    public ExecutorService f45443z;
    public final Object f45421a = new Object();
    public volatile int f45422b = 0;
    public final Handler f45424e = new Handler(Looper.getMainLooper());
    public int f45430l = 0;

    public b(f7.v vVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f4603a;
        this.f45423c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f45426g = context.getApplicationContext();
        n3 x4 = o3.x();
        x4.c();
        o3.v((o3) x4.f4701b);
        if (w10 != null) {
            x4.c();
            o3.w((o3) x4.f4701b, w10);
        }
        String packageName = this.f45426g.getPackageName();
        x4.c();
        o3.t((o3) x4.f4701b, packageName);
        x4.c();
        o3.q((o3) x4.f4701b, nextLong);
        x4.c();
        o3.u((o3) x4.f4701b);
        int i10 = Build.VERSION.SDK_INT;
        x4.c();
        o3.n((o3) x4.f4701b, i10);
        x4.d();
        try {
            int i11 = this.f45426g.getPackageManager().getPackageInfo(this.f45426g.getPackageName(), 0).versionCode;
            x4.c();
            o3.o((o3) x4.f4701b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new oc.i(this.f45426g, (o3) x4.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f45425f = new f(this.f45426g, nVar, this.h);
        this.f45441x = vVar;
        this.f45442y = false;
        this.f45426g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new od.i(5, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void p(b bVar, int i10) {
        f fVar;
        if (i10 == 0) {
            synchronized (bVar.f45421a) {
                try {
                    if (bVar.f45422b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f45425f != null) {
                        fVar = bVar.f45425f;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        boolean z10 = bVar.f45439u;
                        a0 a0Var = (a0) fVar.f45455e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        fVar.f45452a = z10;
                        Context context = (Context) fVar.f45453b;
                        ((a0) fVar.f45456f).a(context, intentFilter2);
                        if (fVar.f45452a) {
                            a0Var.b(context, intentFilter);
                            return;
                        } else {
                            a0Var.a(context, intentFilter);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        bVar.k(0);
    }

    public static boolean q(b bVar) {
        boolean z10;
        synchronized (bVar.f45421a) {
            z10 = true;
            if (bVar.f45422b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, g gVar, String str) {
        try {
            int i12 = x.f45497a;
            h(x.b(i10, i11, gVar, str, l3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, g gVar, long j10, boolean z10) {
        try {
            int i11 = x.f45497a;
            this.h.p2(x.b(i10, 2, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED), this.f45430l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, g gVar, String str, long j10, boolean z10) {
        try {
            int i11 = x.f45497a;
            this.h.p2(x.b(i10, 2, gVar, str, l3.BROADCAST_ACTION_UNSPECIFIED), this.f45430l, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f45424e.post(new od.i(this, gVar, false, 4));
    }

    @Override
    public void a(g5.c cVar, h hVar) {
        if (f(new r(this, hVar, cVar, 0), 30000L, new q1(this, hVar, cVar, false, 10), r(), e()) == null) {
            g u10 = u();
            y(25, 4, u10);
            hVar.a(u10, cVar.f7032a);
        }
    }

    @Override
    public p2.g b(android.app.Activity r32, final p2.f r33) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.b(android.app.Activity, p2.f):p2.g");
    }

    @Override
    public void c(d6 d6Var, org.telegram.messenger.d dVar) {
        if (f(new r(this, dVar, d6Var, 1), 30000L, new od.i(this, dVar, false, 6), r(), e()) == null) {
            g u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f4681b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f4708e;
            dVar.a(u10, new p(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f45443z == null) {
                this.f45443z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f4703a, new g9.w(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f45443z;
    }

    public final void g(h hVar, String str, g gVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, gVar, x.a(exc));
        hVar.a(gVar, str);
    }

    public final void h(f3 f3Var) {
        try {
            oc.i iVar = this.h;
            int i10 = this.f45430l;
            iVar.getClass();
            n3 n3Var = (n3) ((o3) iVar.f19483b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4701b, i10);
            iVar.f19483b = (o3) n3Var.a();
            iVar.k2(f3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(h3 h3Var) {
        try {
            oc.i iVar = this.h;
            int i10 = this.f45430l;
            iVar.getClass();
            n3 n3Var = (n3) ((o3) iVar.f19483b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4701b, i10);
            o3 o3Var = (o3) n3Var.a();
            iVar.f19483b = o3Var;
            iVar.A2(h3Var, o3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, g gVar) {
        try {
            int i11 = x.f45497a;
            e3 e3Var = (e3) x.b(i10, 6, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED).g();
            b4 r6 = c4.r();
            r6.d(false);
            r6.e();
            e3Var.e(r6);
            h((f3) e3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i10) {
        String str;
        String str2;
        synchronized (this.f45421a) {
            try {
                if (this.f45422b == 3) {
                    return;
                }
                int i11 = this.f45422b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            str = "CLOSED";
                        } else {
                            str = "CONNECTED";
                        }
                    } else {
                        str = "CONNECTING";
                    }
                } else {
                    str = "DISCONNECTED";
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            str2 = "CLOSED";
                        } else {
                            str2 = "CONNECTED";
                        }
                    } else {
                        str2 = "CONNECTING";
                    }
                } else {
                    str2 = "DISCONNECTED";
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f45422b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i10;
        g gVar;
        synchronized (this.f45421a) {
            try {
                if (o()) {
                    gVar = t();
                } else if (this.f45422b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gVar = z.f45501c;
                    j(37, gVar);
                } else if (this.f45422b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gVar = z.h;
                    j(38, gVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f45428j = new s(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f45428j.f45489b;
                    mVar.f4647c = 0L;
                    mVar.f4646b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f45426g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f45423c);
                                synchronized (this.f45421a) {
                                    try {
                                        if (this.f45422b == 2) {
                                            gVar = t();
                                        } else if (this.f45422b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            gVar = z.h;
                                            j(105, gVar);
                                        } else {
                                            s sVar = this.f45428j;
                                            if (this.f45426g.bindService(intent2, sVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                gVar = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    } else {
                        i10 = 41;
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    gVar = z.f45499a;
                    j(i10, gVar);
                }
            } finally {
            }
        }
        if (gVar != null) {
            cVar.onBillingSetupFinished(gVar);
        }
    }

    public final void m() {
        synchronized (this.f45421a) {
            if (this.f45428j != null) {
                this.f45426g.unbindService(this.f45428j);
                this.f45427i = null;
                this.f45428j = null;
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar != null) {
            long a2 = hVar.a();
            long j10 = 30000;
            long j11 = 30000;
            int i10 = 1;
            while (i10 <= 3) {
                try {
                } catch (Exception e10) {
                    if (e10 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
                }
                if (Math.max(0L, j11) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                g gVar = z.f45504g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = gVar.f45457a;
                if (i11 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                j11 = j10 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                long j12 = j10;
                long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (j11 < pow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i10 < 3 && pow > 0) {
                    try {
                        Thread.sleep(pow);
                        j11 = j12 - timeUnit.convert((hVar.a() - a2) + 0, timeUnit2);
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                    }
                }
                i10++;
                j10 = j12;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
            return o();
        }
        throw new NullPointerException("ticker");
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f45421a) {
            try {
                z10 = false;
                if (this.f45422b == 2 && this.f45427i != null && this.f45428j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f45424e;
        }
        return new Handler(Looper.myLooper());
    }

    public final v5.l s(g gVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, gVar, x.a(exc));
        return new v5.l(gVar.f45457a, gVar.f45459c, new ArrayList(), new ArrayList());
    }

    public final g t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        g3 s10 = h3.s();
        s10.c();
        h3.r((h3) s10.f4701b, 6);
        b4 r6 = c4.r();
        r6.c();
        c4.q((c4) r6.f4701b);
        r6.d(false);
        r6.e();
        s10.c();
        h3.q((h3) s10.f4701b, (c4) r6.a());
        i((h3) s10.a());
        return z.f45504g;
    }

    public final g u() {
        int[] iArr = {0, 3};
        synchronized (this.f45421a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f45422b == iArr[i10]) {
                    return z.h;
                }
            }
            return z.f45503f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f45426g.getPackageName();
    }

    public final oc.i x(g gVar, int i10, String str, Exception exc) {
        A(i10, 9, gVar, x.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new oc.i(gVar, null, false, 18);
    }

    public final void y(int i10, int i11, g gVar) {
        try {
            int i12 = x.f45497a;
            h(x.b(i10, i11, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, g gVar, long j10) {
        try {
            int i11 = x.f45497a;
            this.h.l2(x.b(i10, 2, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED), this.f45430l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(f7.v vVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f4603a;
        this.f45423c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f45426g = context.getApplicationContext();
        n3 x4 = o3.x();
        x4.c();
        o3.v((o3) x4.f4701b);
        if (w10 != null) {
            x4.c();
            o3.w((o3) x4.f4701b, w10);
        }
        String packageName = this.f45426g.getPackageName();
        x4.c();
        o3.t((o3) x4.f4701b, packageName);
        x4.c();
        o3.q((o3) x4.f4701b, nextLong);
        x4.c();
        o3.u((o3) x4.f4701b);
        int i10 = Build.VERSION.SDK_INT;
        x4.c();
        o3.n((o3) x4.f4701b, i10);
        x4.d();
        try {
            int i11 = this.f45426g.getPackageManager().getPackageInfo(this.f45426g.getPackageName(), 0).versionCode;
            x4.c();
            o3.o((o3) x4.f4701b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new oc.i(this.f45426g, (o3) x4.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f45425f = new f(this.f45426g, null, this.h);
        this.f45441x = vVar;
        this.f45426g.getPackageName();
    }
}
