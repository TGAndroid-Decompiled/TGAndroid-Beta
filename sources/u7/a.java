package u7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import c8.xb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.z9;
import q6.h0;
public final class a implements Continuation, com.google.android.gms.common.api.internal.p, com.google.android.gms.common.api.internal.n {
    public static final a f56369a = new Object();
    public static final a f56370b = new Object();
    public static final a f56371c = new Object();

    public void a(k kVar, com.google.android.gms.common.api.internal.m mVar, boolean z9, TaskCompletionSource taskCompletionSource) {
        n6.c[] cVarArr;
        IInterface aVar;
        IInterface aVar2;
        synchronized (kVar.G) {
            try {
                i iVar = (i) kVar.G.remove(mVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                n6.c cVar = null;
                iVar.f56383b.g().f6674b = null;
                if (z9) {
                    h0 h0Var = kVar.B;
                    if (h0Var == null) {
                        cVarArr = null;
                    } else {
                        cVarArr = h0Var.f53897b;
                    }
                    if (cVarArr != null) {
                        int length = cVarArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                break;
                            }
                            n6.c cVar2 = cVarArr[i7];
                            if ("location_updates_with_callback".equals(cVar2.f20500a)) {
                                cVar = cVar2;
                                break;
                            }
                            i7++;
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            x xVar = (x) kVar.n();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel p12 = xVar.p1();
                            int i10 = d.f56374a;
                            p12.writeInt(1);
                            int r10 = xb.r(p12, 20293);
                            xb.q(p12, 1, 4);
                            p12.writeInt(2);
                            xb.f(p12, 3, iVar);
                            xb.s(p12, r10);
                            d.c(p12, eVar);
                            xVar.t1(p12, 89);
                        }
                    }
                    x xVar2 = (x) kVar.n();
                    g gVar = new g(taskCompletionSource);
                    int i11 = i.f56382c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    if (queryLocalInterface instanceof j8.j) {
                        aVar = (j8.j) queryLocalInterface;
                    } else {
                        aVar = new a8.a(iVar, "com.google.android.gms.location.ILocationCallback", 10);
                    }
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    if (queryLocalInterface2 instanceof w) {
                        aVar2 = (w) queryLocalInterface2;
                    } else {
                        aVar2 = new a8.a(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                    }
                    Parcel p13 = xVar2.p1();
                    int i12 = d.f56374a;
                    p13.writeInt(1);
                    int r11 = xb.r(p13, 20293);
                    xb.q(p13, 1, 4);
                    p13.writeInt(2);
                    xb.f(p13, 5, aVar.asBinder());
                    xb.f(p13, 6, aVar2.asBinder());
                    xb.s(p13, r11);
                    xVar2.t1(p13, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        n6.c[] cVarArr;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        j8.a aVar = new j8.a(Long.MAX_VALUE, 0, false, null, null);
        h0 h0Var = kVar.B;
        n6.c cVar = null;
        if (h0Var == null) {
            cVarArr = null;
        } else {
            cVarArr = h0Var.f53897b;
        }
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                n6.c cVar2 = cVarArr[i7];
                if ("get_last_location_with_request".equals(cVar2.f20500a)) {
                    cVar = cVar2;
                    break;
                }
                i7++;
            }
            if (cVar != null && cVar.b() >= 1) {
                x xVar = (x) kVar.n();
                f fVar = new f(0, taskCompletionSource);
                Parcel p12 = xVar.p1();
                int i10 = d.f56374a;
                p12.writeInt(1);
                aVar.writeToParcel(p12, 0);
                d.c(p12, fVar);
                xVar.t1(p12, 82);
                return;
            }
        }
        x xVar2 = (x) kVar.n();
        Parcel p13 = xVar2.p1();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                xVar2.f306b.transact(7, p13, obtain, 0);
                obtain.readException();
                p13.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) d.a(obtain, Location.CREATOR));
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            p13.recycle();
            throw th2;
        }
    }

    @Override
    public void f(Object obj) {
        ((z9) obj).getClass();
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
