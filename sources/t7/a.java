package t7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.t9;
import p6.h0;
public final class a implements Continuation, com.google.android.gms.common.api.internal.p, com.google.android.gms.common.api.internal.n {
    public static final a f54948a = new Object();
    public static final a f54949b = new Object();
    public static final a f54950c = new Object();

    public void a(k kVar, com.google.android.gms.common.api.internal.m mVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        m6.c[] cVarArr;
        IInterface aVar;
        IInterface aVar2;
        synchronized (kVar.G) {
            try {
                i iVar = (i) kVar.G.remove(mVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                m6.c cVar = null;
                iVar.f54962b.g().f6726b = null;
                if (z10) {
                    h0 h0Var = kVar.B;
                    if (h0Var == null) {
                        cVarArr = null;
                    } else {
                        cVarArr = h0Var.f53262b;
                    }
                    if (cVarArr != null) {
                        int length = cVarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            m6.c cVar2 = cVarArr[i3];
                            if ("location_updates_with_callback".equals(cVar2.f19183a)) {
                                cVar = cVar2;
                                break;
                            }
                            i3++;
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            x xVar = (x) kVar.m();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel P0 = xVar.P0();
                            int i10 = d.f54953a;
                            P0.writeInt(1);
                            int s6 = j8.a.s(P0, 20293);
                            j8.a.r(P0, 1, 4);
                            P0.writeInt(2);
                            j8.a.g(P0, 3, iVar);
                            j8.a.t(P0, s6);
                            d.c(P0, eVar);
                            xVar.T0(P0, 89);
                        }
                    }
                    x xVar2 = (x) kVar.m();
                    g gVar = new g(taskCompletionSource);
                    int i11 = i.f54961c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    if (queryLocalInterface instanceof i8.j) {
                        aVar = (i8.j) queryLocalInterface;
                    } else {
                        aVar = new b8.a(iVar, "com.google.android.gms.location.ILocationCallback", 9);
                    }
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    if (queryLocalInterface2 instanceof w) {
                        aVar2 = (w) queryLocalInterface2;
                    } else {
                        aVar2 = new b8.a(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
                    }
                    Parcel P02 = xVar2.P0();
                    int i12 = d.f54953a;
                    P02.writeInt(1);
                    int s10 = j8.a.s(P02, 20293);
                    j8.a.r(P02, 1, 4);
                    P02.writeInt(2);
                    j8.a.g(P02, 5, aVar.asBinder());
                    j8.a.g(P02, 6, aVar2.asBinder());
                    j8.a.t(P02, s10);
                    xVar2.T0(P02, 59);
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
        m6.c[] cVarArr;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        i8.a aVar = new i8.a(Long.MAX_VALUE, 0, false, null, null);
        h0 h0Var = kVar.B;
        m6.c cVar = null;
        if (h0Var == null) {
            cVarArr = null;
        } else {
            cVarArr = h0Var.f53262b;
        }
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                m6.c cVar2 = cVarArr[i3];
                if ("get_last_location_with_request".equals(cVar2.f19183a)) {
                    cVar = cVar2;
                    break;
                }
                i3++;
            }
            if (cVar != null && cVar.b() >= 1) {
                x xVar = (x) kVar.m();
                f fVar = new f(0, taskCompletionSource);
                Parcel P0 = xVar.P0();
                int i10 = d.f54953a;
                P0.writeInt(1);
                aVar.writeToParcel(P0, 0);
                d.c(P0, fVar);
                xVar.T0(P0, 82);
                return;
            }
        }
        x xVar2 = (x) kVar.m();
        Parcel P02 = xVar2.P0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                xVar2.f2456b.transact(7, P02, obtain, 0);
                obtain.readException();
                P02.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) d.a(obtain, Location.CREATOR));
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            P02.recycle();
            throw th2;
        }
    }

    @Override
    public void c(Object obj) {
        ((t9) obj).getClass();
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
