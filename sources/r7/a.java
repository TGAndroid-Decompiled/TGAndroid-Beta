package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final a f47040a = new Object();
    public static final a f47041b = new Object();
    public static final a f47042c = new Object();

    public void a(k kVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        k6.c cVar;
        synchronized (kVar.V) {
            try {
                i iVar = (i) kVar.V.remove(nVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e7 = iVar.f47053b.e();
                e7.f6654b = null;
                e7.f6655c = null;
                if (z10) {
                    k6.c[] m10 = kVar.m();
                    if (m10 != null) {
                        int length = m10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                cVar = m10[i10];
                                if ("location_updates_with_callback".equals(cVar.f14702a)) {
                                    break;
                                }
                                i10++;
                            } else {
                                cVar = null;
                                break;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            z zVar = (z) kVar.u();
                            l lVar = new l(2, null, iVar, null, null, null);
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel N0 = zVar.N0();
                            d.c(N0, lVar);
                            d.d(N0, eVar);
                            zVar.R0(N0, 89);
                        }
                    }
                    z zVar2 = (z) kVar.u();
                    o oVar = new o(2, null, null, iVar, null, new g(taskCompletionSource), null);
                    Parcel N02 = zVar2.N0();
                    d.c(N02, oVar);
                    zVar2.R0(N02, 59);
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
        k6.c cVar;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        g8.b bVar = new g8.b(Long.MAX_VALUE, 0, false, null, null);
        k6.c[] m10 = kVar.m();
        if (m10 != null) {
            int length = m10.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    cVar = m10[i10];
                    if ("get_last_location_with_request".equals(cVar.f14702a)) {
                        break;
                    }
                    i10++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z zVar = (z) kVar.u();
                f fVar = new f(0, taskCompletionSource);
                Parcel N0 = zVar.N0();
                d.c(N0, bVar);
                d.d(N0, fVar);
                zVar.R0(N0, 82);
                return;
            }
        }
        z zVar2 = (z) kVar.u();
        Parcel N02 = zVar2.N0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                zVar2.f336b.transact(7, N02, obtain, 0);
                obtain.readException();
                N02.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) d.a(obtain, Location.CREATOR));
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } catch (Throwable th2) {
            N02.recycle();
            throw th2;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
