package q5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f44518a;
    public final e0 f44519b;
    public final String f44520c;
    public final String d;

    public b0(e0 e0Var, String str, String str2, int i10) {
        this.f44518a = i10;
        this.f44519b = e0Var;
        this.f44520c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z4 = false;
        boolean z10 = true;
        switch (this.f44518a) {
            case 0:
                e0 e0Var = this.f44519b;
                String str = this.f44520c;
                String str2 = this.d;
                u5.x xVar = (u5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (e0Var.F != 2) {
                    z10 = false;
                }
                b6.m.j("Not connected to device", z10);
                u5.f fVar = (u5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.s.f3120a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (e0Var.f44547r) {
                    try {
                        if (e0Var.f44544o != null) {
                            e0Var.i(2477);
                        }
                        e0Var.f44544o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.f44519b;
                String str3 = this.f44520c;
                String str4 = this.d;
                u5.x xVar2 = (u5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.f44546q.incrementAndGet();
                if (e0Var2.F == 2) {
                    z4 = true;
                }
                b6.m.j("Not connected to device", z4);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    u5.f fVar2 = (u5.f) xVar2.u();
                    Parcel M02 = fVar2.M0();
                    M02.writeString(str3);
                    M02.writeString(str4);
                    M02.writeLong(incrementAndGet);
                    fVar2.R0(M02, 9);
                    return;
                } catch (RemoteException e6) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e6);
                    return;
                }
        }
    }
}
