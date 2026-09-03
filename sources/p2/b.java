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
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import n7.qa;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.d0;
import org.telegram.ui.web.e0;
import org.telegram.ui.zy;
public class b extends a {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;
    public final String f44136c;
    public final String d;
    public volatile f f44138f;
    public final Context f44139g;
    public final qa h;
    public volatile com.google.android.gms.internal.play_billing.c f44140i;
    public volatile t f44141j;
    public boolean f44142k;
    public boolean f44144m;
    public boolean f44145n;
    public boolean f44146o;
    public boolean f44147p;
    public boolean f44148q;
    public boolean f44149r;
    public boolean f44150s;
    public boolean f44151t;
    public boolean f44152u;
    public boolean v;
    public boolean f44153w;
    public final cb.b f44154x;
    public final boolean f44155y;
    public ExecutorService f44156z;
    public final Object f44134a = new Object();
    public volatile int f44135b = 0;
    public final Handler f44137e = new Handler(Looper.getMainLooper());
    public int f44143l = 0;

    public b(cb.b bVar, Context context, o oVar, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f3499a;
        this.f44136c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f44139g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f3602b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f3602b, w10);
        }
        String packageName = this.f44139g.getPackageName();
        x10.c();
        p3.t((p3) x10.f3602b, packageName);
        x10.c();
        p3.q((p3) x10.f3602b, nextLong);
        x10.c();
        p3.u((p3) x10.f3602b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f3602b, i10);
        x10.d();
        try {
            int i11 = this.f44139g.getPackageManager().getPackageInfo(this.f44139g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f3602b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qa(this.f44139g, (p3) x10.a());
        if (oVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f44138f = new f(this.f44139g, oVar, this.h);
        this.f44154x = bVar;
        this.f44155y = false;
        this.f44139g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new zy(submit, runnable, false, 2), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e6) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    public static void p(b bVar, int i10) {
        f fVar;
        if (i10 == 0) {
            synchronized (bVar.f44134a) {
                try {
                    if (bVar.f44135b == 3) {
                        return;
                    }
                    bVar.k(2);
                    if (bVar.f44138f != null) {
                        fVar = bVar.f44138f;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        boolean z4 = bVar.f44152u;
                        b0 b0Var = (b0) fVar.f44171e;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                        fVar.f44168a = z4;
                        Context context = (Context) fVar.f44169b;
                        ((b0) fVar.f44172f).a(context, intentFilter2);
                        if (fVar.f44168a) {
                            b0Var.b(context, intentFilter);
                            return;
                        } else {
                            b0Var.a(context, intentFilter);
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
        boolean z4;
        synchronized (bVar.f44134a) {
            z4 = true;
            if (bVar.f44135b != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, h hVar, String str) {
        try {
            int i12 = y.f44216a;
            h(y.b(i10, i11, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void B(int i10, h hVar, long j10, boolean z4) {
        try {
            int i11 = y.f44216a;
            this.h.o1(y.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f44143l, j10, z4);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, h hVar, String str, long j10, boolean z4) {
        try {
            int i11 = y.f44216a;
            this.h.o1(y.b(i10, 2, hVar, str, m3.BROADCAST_ACTION_UNSPECIFIED), this.f44143l, j10, z4);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(h hVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f44137e.post(new zy(this, hVar, false, 1));
    }

    @Override
    public void a(com.google.android.gms.internal.clearcut.e eVar, i iVar) {
        if (f(new s(this, iVar, eVar, 0), 30000L, new s1(this, iVar, eVar, false, 9), r(), e()) == null) {
            h u10 = u();
            y(25, 4, u10);
            iVar.a(u10, eVar.f3277b);
        }
    }

    @Override
    public p2.h b(android.app.Activity r32, final p2.f r33) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.b(android.app.Activity, p2.f):p2.h");
    }

    @Override
    public void c(e0 e0Var, d0 d0Var) {
        if (f(new s(this, d0Var, e0Var, 1), 30000L, new zy(this, d0Var, false, 3), r(), e()) == null) {
            h u10 = u();
            y(25, 7, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f3577b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f3604e;
            d0Var.a(u10, new q(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f44156z == null) {
                this.f44156z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f3599a, new i9.u(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f44156z;
    }

    public final void g(i iVar, String str, h hVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, hVar, y.a(exc));
        iVar.a(hVar, str);
    }

    public final void h(g3 g3Var) {
        try {
            qa qaVar = this.h;
            int i10 = this.f44143l;
            qaVar.getClass();
            o3 o3Var = (o3) ((p3) qaVar.f15701b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3602b, i10);
            qaVar.f15701b = (p3) o3Var.a();
            qaVar.k1(g3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(i3 i3Var) {
        try {
            qa qaVar = this.h;
            int i10 = this.f44143l;
            qaVar.getClass();
            o3 o3Var = (o3) ((p3) qaVar.f15701b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3602b, i10);
            p3 p3Var = (p3) o3Var.a();
            qaVar.f15701b = p3Var;
            qaVar.w1(i3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(int i10, h hVar) {
        try {
            int i11 = y.f44216a;
            f3 f3Var = (f3) y.b(i10, 6, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED).g();
            c4 r10 = d4.r();
            r10.d(false);
            r10.e();
            f3Var.e(r10);
            h((g3) f3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i10) {
        String str;
        String str2;
        synchronized (this.f44134a) {
            try {
                if (this.f44135b == 3) {
                    return;
                }
                int i11 = this.f44135b;
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
                this.f44135b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i10;
        h hVar;
        synchronized (this.f44134a) {
            try {
                if (o()) {
                    hVar = t();
                } else if (this.f44135b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    hVar = a0.f44122c;
                    j(37, hVar);
                } else if (this.f44135b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    hVar = a0.h;
                    j(38, hVar);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f44141j = new t(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f44141j.f44208b;
                    mVar.f3535c = 0L;
                    mVar.f3534b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f44139g.getPackageManager().queryIntentServices(intent, 0);
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
                                intent2.putExtra("playBillingLibraryVersion", this.f44136c);
                                synchronized (this.f44134a) {
                                    try {
                                        if (this.f44135b == 2) {
                                            hVar = t();
                                        } else if (this.f44135b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            hVar = a0.h;
                                            j(105, hVar);
                                        } else {
                                            t tVar = this.f44141j;
                                            if (this.f44139g.bindService(intent2, tVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                hVar = null;
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
                    hVar = a0.f44120a;
                    j(i10, hVar);
                }
            } finally {
            }
        }
        if (hVar != null) {
            cVar.onBillingSetupFinished(hVar);
        }
    }

    public final void m() {
        synchronized (this.f44134a) {
            if (this.f44141j != null) {
                this.f44139g.unbindService(this.f44141j);
                this.f44140i = null;
                this.f44141j = null;
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
                } catch (Exception e6) {
                    if (e6 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e6);
                }
                if (Math.max(0L, j11) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                h hVar2 = a0.f44125g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = hVar2.f44176a;
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
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
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
        boolean z4;
        synchronized (this.f44134a) {
            try {
                z4 = false;
                if (this.f44135b == 2 && this.f44140i != null && this.f44141j != null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.f44137e;
        }
        return new Handler(Looper.myLooper());
    }

    public final x5.k s(h hVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, hVar, y.a(exc));
        return new x5.k(hVar.f44176a, hVar.f44178c, new ArrayList(), new ArrayList());
    }

    public final h t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        h3 s6 = i3.s();
        s6.c();
        i3.r((i3) s6.f3602b, 6);
        c4 r10 = d4.r();
        r10.c();
        d4.q((d4) r10.f3602b);
        r10.d(false);
        r10.e();
        s6.c();
        i3.q((i3) s6.f3602b, (d4) r10.a());
        i((i3) s6.a());
        return a0.f44125g;
    }

    public final h u() {
        int[] iArr = {0, 3};
        synchronized (this.f44134a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f44135b == iArr[i10]) {
                    return a0.h;
                }
            }
            return a0.f44124f;
        }
    }

    public final void v() {
        if (!TextUtils.isEmpty(null)) {
            return;
        }
        this.f44139g.getPackageName();
    }

    public final qa x(h hVar, int i10, String str, Exception exc) {
        A(i10, 9, hVar, y.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new qa(hVar, null, false, 26);
    }

    public final void y(int i10, int i11, h hVar) {
        try {
            int i12 = y.f44216a;
            h(y.b(i10, i11, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void z(int i10, h hVar, long j10) {
        try {
            int i11 = y.f44216a;
            this.h.l1(y.b(i10, 2, hVar, null, m3.BROADCAST_ACTION_UNSPECIFIED), this.f44143l, j10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(cb.b bVar, Context context, androidx.emoji2.text.f fVar) {
        long nextLong = new Random().nextLong();
        this.A = Long.valueOf(nextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f3499a;
        this.f44136c = "8.0.0";
        String w10 = w();
        this.d = w10;
        this.f44139g = context.getApplicationContext();
        o3 x10 = p3.x();
        x10.c();
        p3.v((p3) x10.f3602b);
        if (w10 != null) {
            x10.c();
            p3.w((p3) x10.f3602b, w10);
        }
        String packageName = this.f44139g.getPackageName();
        x10.c();
        p3.t((p3) x10.f3602b, packageName);
        x10.c();
        p3.q((p3) x10.f3602b, nextLong);
        x10.c();
        p3.u((p3) x10.f3602b);
        int i10 = Build.VERSION.SDK_INT;
        x10.c();
        p3.n((p3) x10.f3602b, i10);
        x10.d();
        try {
            int i11 = this.f44139g.getPackageManager().getPackageInfo(this.f44139g.getPackageName(), 0).versionCode;
            x10.c();
            p3.o((p3) x10.f3602b, i11);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.h = new qa(this.f44139g, (p3) x10.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f44138f = new f(this.f44139g, null, this.h);
        this.f44154x = bVar;
        this.f44139g.getPackageName();
    }
}
