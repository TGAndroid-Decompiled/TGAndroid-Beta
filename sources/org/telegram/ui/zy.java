package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
public final class zy implements Runnable {
    public final int f44042a;
    public Object f44043b;
    public final Object f44044c;

    public zy(int i10, Object obj, Object obj2) {
        this.f44042a = i10;
        this.f44044c = obj;
        this.f44043b = obj2;
    }

    private final void a() {
        x5.i iVar = (x5.i) this.f44043b;
        int i10 = ((x5.j) this.f44044c).f50460a;
        synchronized (iVar) {
            x5.j jVar = (x5.j) iVar.f50458e.get(i10);
            if (jVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                iVar.f50458e.remove(i10);
                jVar.b(new Exception("Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = 0;
        switch (this.f44042a) {
            case 0:
                ((org.telegram.ui.Components.ic) this.f44043b).j();
                ((cz) this.f44044c).B = null;
                return;
            case 1:
                p2.b bVar = (p2.b) this.f44043b;
                p2.h hVar = (p2.h) this.f44044c;
                if (((p2.o) bVar.f44138f.f44170c) != null) {
                    ((p2.o) bVar.f44138f.f44170c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 2:
                Future future = (Future) this.f44043b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f44044c;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                p2.h hVar2 = p2.a0.f44126i;
                ((p2.b) this.f44043b).y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f3577b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f3604e;
                ((org.telegram.messenger.d0) this.f44044c).a(hVar2, new p2.q(vVar, vVar));
                return;
            case 4:
                p2.h hVar3 = p2.a0.f44126i;
                ((p2.b) this.f44043b).y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f3577b;
                ((p2.n) this.f44044c).b(hVar3, com.google.android.gms.internal.play_billing.v.f3604e);
                return;
            case 5:
                q5.f0 f0Var = ((q5.e0) this.f44043b).f44573b;
                u5.d dVar = (u5.d) this.f44044c;
                u5.b bVar2 = q5.f0.G;
                q5.d dVar2 = dVar.d;
                q5.x xVar = dVar.f48393f;
                q5.d dVar3 = f0Var.f44583t;
                r5.e0 e0Var = f0Var.D;
                if (!u5.a.d(dVar2, dVar3)) {
                    f0Var.f44583t = dVar2;
                    e0Var.c();
                }
                double d = dVar.f48389a;
                if (!Double.isNaN(d) && Math.abs(d - f0Var.v) > 1.0E-7d) {
                    f0Var.v = d;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z17 = dVar.f48390b;
                if (z17 != f0Var.f44585w) {
                    f0Var.f44585w = z17;
                    z4 = true;
                }
                u5.b bVar3 = q5.f0.G;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(f0Var.f44576m));
                if (e0Var != null && (z4 || f0Var.f44576m)) {
                    e0Var.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.f48391c;
                if (i11 != f0Var.f44586x) {
                    f0Var.f44586x = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(f0Var.f44576m));
                if (e0Var != null && (z10 || f0Var.f44576m)) {
                    e0Var.a();
                }
                int i12 = dVar.f48392e;
                if (i12 != f0Var.f44587y) {
                    f0Var.f44587y = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var.f44576m));
                if (e0Var != null && (z11 || f0Var.f44576m)) {
                    e0Var.e();
                }
                if (!u5.a.d(f0Var.f44588z, xVar)) {
                    f0Var.f44588z = xVar;
                }
                f0Var.f44576m = false;
                return;
            case 6:
                q5.f0 f0Var2 = ((q5.e0) this.f44043b).f44573b;
                u5.b bVar4 = q5.f0.G;
                String str = ((u5.c) this.f44044c).f48388a;
                if (!u5.a.d(str, f0Var2.f44584u)) {
                    f0Var2.f44584u = str;
                    z12 = true;
                } else {
                    z12 = false;
                }
                q5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var2.f44577n));
                r5.e0 e0Var2 = f0Var2.D;
                if (e0Var2 != null && (z12 || f0Var2.f44577n)) {
                    e0Var2.d();
                }
                f0Var2.f44577n = false;
                return;
            case 7:
                qd.i iVar = (qd.i) this.f44044c;
                ld.a0 a0Var = iVar.f44835c;
                while (true) {
                    try {
                        ((Runnable) this.f44043b).run();
                    } catch (Throwable th2) {
                        ld.e0.m(th2, uc.i.f48516a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 != null) {
                        this.f44043b = f10;
                        i10++;
                        if (i10 >= 16 && a0Var.e()) {
                            a0Var.c(iVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 8:
                u5.w wVar = (u5.w) this.f44043b;
                u5.d dVar4 = (u5.d) this.f44044c;
                u5.b bVar5 = u5.w.f48433k0;
                q5.d dVar5 = dVar4.d;
                q5.x xVar2 = dVar4.f48393f;
                q5.d dVar6 = wVar.R;
                r5.e0 e0Var3 = wVar.T;
                if (!u5.a.d(dVar5, dVar6)) {
                    wVar.R = dVar5;
                    e0Var3.c();
                }
                double d10 = dVar4.f48389a;
                if (!Double.isNaN(d10) && Math.abs(d10 - wVar.f48437c0) > 1.0E-7d) {
                    wVar.f48437c0 = d10;
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = dVar4.f48390b;
                if (z18 != wVar.Z) {
                    wVar.Z = z18;
                    z13 = true;
                }
                Double.isNaN(dVar4.h);
                u5.b bVar6 = u5.w.f48433k0;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar.f48436b0));
                if (e0Var3 != null && (z13 || wVar.f48436b0)) {
                    e0Var3.f();
                }
                int i13 = dVar4.f48391c;
                if (i13 != wVar.f48439e0) {
                    wVar.f48439e0 = i13;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(wVar.f48436b0));
                if (e0Var3 != null && (z14 || wVar.f48436b0)) {
                    e0Var3.a();
                }
                int i14 = dVar4.f48392e;
                if (i14 != wVar.f48440f0) {
                    wVar.f48440f0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(wVar.f48436b0));
                if (e0Var3 != null && (z15 || wVar.f48436b0)) {
                    e0Var3.e();
                }
                if (!u5.a.d(wVar.f48438d0, xVar2)) {
                    wVar.f48438d0 = xVar2;
                }
                wVar.f48436b0 = false;
                return;
            case 9:
                u5.w wVar2 = (u5.w) this.f44043b;
                u5.b bVar7 = u5.w.f48433k0;
                String str2 = ((u5.c) this.f44044c).f48388a;
                if (!u5.a.d(str2, wVar2.Y)) {
                    wVar2.Y = str2;
                    z16 = true;
                } else {
                    z16 = false;
                }
                u5.w.f48433k0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(wVar2.f48435a0));
                r5.e0 e0Var4 = wVar2.T;
                if (e0Var4 != null && (z16 || wVar2.f48435a0)) {
                    e0Var4.d();
                }
                wVar2.f48435a0 = false;
                return;
            case 10:
                x1.a aVar = (x1.a) this.f44044c;
                Object obj = this.f44043b;
                if (aVar.f50269c.get()) {
                    o5.d dVar7 = aVar.f50270e;
                    if (dVar7.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar7.h = null;
                        dVar7.b();
                    }
                } else {
                    o5.d dVar8 = aVar.f50270e;
                    if (dVar8.f16608g != aVar) {
                        if (dVar8.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar8.h = null;
                            dVar8.b();
                        }
                    } else if (!dVar8.f16605c) {
                        SystemClock.uptimeMillis();
                        dVar8.f16608g = null;
                        w1.a aVar2 = dVar8.f16603a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj);
                            } else {
                                aVar2.h(obj);
                            }
                        }
                    }
                }
                aVar.f50268b = 3;
                return;
            case 11:
                x5.i iVar2 = (x5.i) this.f44043b;
                IBinder iBinder = (IBinder) this.f44044c;
                synchronized (iVar2) {
                    if (iBinder == null) {
                        iVar2.a("Null service connection");
                        return;
                    }
                    try {
                        iVar2.f50457c = new q5.c0(iBinder);
                        iVar2.f50455a = 2;
                        ((ScheduledExecutorService) iVar2.f50459f.f50467c).execute(new x5.g(iVar2, 0));
                        return;
                    } catch (RemoteException e6) {
                        iVar2.a(e6.getMessage());
                        return;
                    }
                }
            case 12:
                a();
                return;
            default:
                xh.n nVar = (xh.n) this.f44044c;
                ArrayList arrayList = (ArrayList) this.f44043b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    nVar.B((f2.j) obj2);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
        }
    }

    public zy(Object obj, Object obj2, boolean z4, int i10) {
        this.f44042a = i10;
        this.f44043b = obj;
        this.f44044c = obj2;
    }
}
