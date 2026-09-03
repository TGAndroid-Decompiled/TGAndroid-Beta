package q5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.common.api.internal.s {
    public final int f42799a;
    public final f0 f42800b;
    public final String f42801c;
    public final String d;

    public b0(f0 f0Var, String str, String str2, int i10) {
        this.f42799a = i10;
        this.f42800b = f0Var;
        this.f42801c = str;
        this.d = str2;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z4 = false;
        boolean z10 = true;
        switch (this.f42799a) {
            case 0:
                f0 f0Var = this.f42800b;
                String str = this.f42801c;
                String str2 = this.d;
                u5.x xVar = (u5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (f0Var.F != 2) {
                    z10 = false;
                }
                b6.m.j("Not connected to device", z10);
                u5.f fVar = (u5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.t.f3146a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (f0Var.f42829r) {
                    try {
                        if (f0Var.f42826o != null) {
                            f0Var.i(2477);
                        }
                        f0Var.f42826o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                f0 f0Var2 = this.f42800b;
                String str3 = this.f42801c;
                String str4 = this.d;
                u5.x xVar2 = (u5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = f0Var2.B;
                long incrementAndGet = f0Var2.f42828q.incrementAndGet();
                if (f0Var2.F == 2) {
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
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
