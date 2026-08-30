package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
public final class yy implements Runnable {
    public final int f40600a;
    public Object f40601b;
    public final Object f40602c;

    public yy(int i10, Object obj, Object obj2) {
        this.f40600a = i10;
        this.f40602c = obj;
        this.f40601b = obj2;
    }

    private final void a() {
        x5.i iVar = (x5.i) this.f40601b;
        IBinder iBinder = (IBinder) this.f40602c;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.a("Null service connection");
                return;
            }
            try {
                iVar.f46818c = new q5.g0(iBinder);
                iVar.f46816a = 2;
                ((ScheduledExecutorService) iVar.f46819f.f46825c).execute(new x5.g(iVar, 0));
            } catch (RemoteException e) {
                iVar.a(e.getMessage());
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
        switch (this.f40600a) {
            case 0:
                ((org.telegram.ui.Components.ic) this.f40601b).j();
                ((bz) this.f40602c).B = null;
                return;
            case 1:
                p2.b bVar = (p2.b) this.f40601b;
                p2.h hVar = (p2.h) this.f40602c;
                if (((p2.p) bVar.f40944f.f40988c) != null) {
                    ((p2.p) bVar.f40944f.f40988c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 2:
                Future future = (Future) this.f40601b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f40602c;
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
                p2.h hVar2 = p2.b0.f40968i;
                ((p2.b) this.f40601b).y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f3572b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                ((org.telegram.messenger.d) this.f40602c).a(hVar2, new p2.r(vVar, vVar));
                return;
            case 4:
                p2.h hVar3 = p2.b0.f40968i;
                ((p2.b) this.f40601b).y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f3572b;
                ((p2.o) this.f40602c).b(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 5:
                q5.e0 e0Var = ((q5.d0) this.f40601b).f42785b;
                u5.d dVar = (u5.d) this.f40602c;
                u5.b bVar2 = q5.e0.G;
                q5.d dVar2 = dVar.d;
                q5.x xVar = dVar.f45105f;
                q5.d dVar3 = e0Var.f42798t;
                r5.e0 e0Var2 = e0Var.D;
                if (!u5.a.d(dVar2, dVar3)) {
                    e0Var.f42798t = dVar2;
                    e0Var2.c();
                }
                double d = dVar.f45102a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var.v) > 1.0E-7d) {
                    e0Var.v = d;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z17 = dVar.f45103b;
                if (z17 != e0Var.f42800w) {
                    e0Var.f42800w = z17;
                    z4 = true;
                }
                u5.b bVar3 = q5.e0.G;
                bVar3.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(e0Var.f42791m));
                if (e0Var2 != null && (z4 || e0Var.f42791m)) {
                    e0Var2.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.f45104c;
                if (i11 != e0Var.f42801x) {
                    e0Var.f42801x = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar3.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.f42791m));
                if (e0Var2 != null && (z10 || e0Var.f42791m)) {
                    e0Var2.a();
                }
                int i12 = dVar.e;
                if (i12 != e0Var.f42802y) {
                    e0Var.f42802y = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.f42791m));
                if (e0Var2 != null && (z11 || e0Var.f42791m)) {
                    e0Var2.e();
                }
                if (!u5.a.d(e0Var.f42803z, xVar)) {
                    e0Var.f42803z = xVar;
                }
                e0Var.f42791m = false;
                return;
            case 6:
                q5.e0 e0Var3 = ((q5.d0) this.f40601b).f42785b;
                u5.b bVar4 = q5.e0.G;
                String str = ((u5.c) this.f40602c).f45101a;
                if (!u5.a.d(str, e0Var3.f42799u)) {
                    e0Var3.f42799u = str;
                    z12 = true;
                } else {
                    z12 = false;
                }
                q5.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var3.f42792n));
                r5.e0 e0Var4 = e0Var3.D;
                if (e0Var4 != null && (z12 || e0Var3.f42792n)) {
                    e0Var4.d();
                }
                e0Var3.f42792n = false;
                return;
            case 7:
                qd.i iVar = (qd.i) this.f40602c;
                ld.a0 a0Var = iVar.f43027c;
                while (true) {
                    try {
                        ((Runnable) this.f40601b).run();
                    } catch (Throwable th2) {
                        ld.e0.m(th2, uc.i.f45219a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 != null) {
                        this.f40601b = f10;
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
                u5.w wVar = (u5.w) this.f40601b;
                u5.d dVar4 = (u5.d) this.f40602c;
                u5.b bVar5 = u5.w.f45142k0;
                q5.d dVar5 = dVar4.d;
                q5.x xVar2 = dVar4.f45105f;
                q5.d dVar6 = wVar.R;
                r5.e0 e0Var5 = wVar.T;
                if (!u5.a.d(dVar5, dVar6)) {
                    wVar.R = dVar5;
                    e0Var5.c();
                }
                double d10 = dVar4.f45102a;
                if (!Double.isNaN(d10) && Math.abs(d10 - wVar.f45146c0) > 1.0E-7d) {
                    wVar.f45146c0 = d10;
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = dVar4.f45103b;
                if (z18 != wVar.Z) {
                    wVar.Z = z18;
                    z13 = true;
                }
                Double.isNaN(dVar4.h);
                u5.b bVar6 = u5.w.f45142k0;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar.f45145b0));
                if (e0Var5 != null && (z13 || wVar.f45145b0)) {
                    e0Var5.f();
                }
                int i13 = dVar4.f45104c;
                if (i13 != wVar.f45148e0) {
                    wVar.f45148e0 = i13;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(wVar.f45145b0));
                if (e0Var5 != null && (z14 || wVar.f45145b0)) {
                    e0Var5.a();
                }
                int i14 = dVar4.e;
                if (i14 != wVar.f45149f0) {
                    wVar.f45149f0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(wVar.f45145b0));
                if (e0Var5 != null && (z15 || wVar.f45145b0)) {
                    e0Var5.e();
                }
                if (!u5.a.d(wVar.f45147d0, xVar2)) {
                    wVar.f45147d0 = xVar2;
                }
                wVar.f45145b0 = false;
                return;
            case 9:
                u5.w wVar2 = (u5.w) this.f40601b;
                u5.b bVar7 = u5.w.f45142k0;
                String str2 = ((u5.c) this.f40602c).f45101a;
                if (!u5.a.d(str2, wVar2.Y)) {
                    wVar2.Y = str2;
                    z16 = true;
                } else {
                    z16 = false;
                }
                u5.w.f45142k0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(wVar2.f45144a0));
                r5.e0 e0Var6 = wVar2.T;
                if (e0Var6 != null && (z16 || wVar2.f45144a0)) {
                    e0Var6.d();
                }
                wVar2.f45144a0 = false;
                return;
            case 10:
                wh.n nVar = (wh.n) this.f40602c;
                ArrayList arrayList = (ArrayList) this.f40601b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    nVar.B((f2.j) obj);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
            case 11:
                x1.a aVar = (x1.a) this.f40602c;
                Object obj2 = this.f40601b;
                if (aVar.f46643c.get()) {
                    o5.d dVar7 = aVar.e;
                    if (dVar7.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar7.h = null;
                        dVar7.b();
                    }
                } else {
                    o5.d dVar8 = aVar.e;
                    if (dVar8.f16448g != aVar) {
                        if (dVar8.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar8.h = null;
                            dVar8.b();
                        }
                    } else if (!dVar8.f16446c) {
                        SystemClock.uptimeMillis();
                        dVar8.f16448g = null;
                        w1.a aVar2 = dVar8.f16444a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f46642b = 3;
                return;
            case 12:
                a();
                return;
            default:
                x5.i iVar2 = (x5.i) this.f40601b;
                int i15 = ((x5.j) this.f40602c).f46820a;
                synchronized (iVar2) {
                    x5.j jVar = (x5.j) iVar2.e.get(i15);
                    if (jVar != 0) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i15);
                        iVar2.e.remove(i15);
                        jVar.b(new Exception("Timed out waiting for response", null));
                        iVar2.c();
                    }
                }
                return;
        }
    }

    public yy(Object obj, Object obj2, boolean z4, int i10) {
        this.f40600a = i10;
        this.f40601b = obj;
        this.f40602c = obj2;
    }
}
