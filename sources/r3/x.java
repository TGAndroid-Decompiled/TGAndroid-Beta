package r3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class x implements com.google.android.gms.common.api.internal.s {
    public final String[] f46596a;

    public x(u5.s sVar, String[] strArr) {
        this.f46596a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u5.r rVar = new u5.r(0, (TaskCompletionSource) obj2);
        u5.i iVar = (u5.i) ((u5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.s.d(M0, rVar);
        M0.writeStringArray(this.f46596a);
        iVar.R0(M0, 5);
    }

    public x(String[] strArr) {
        this.f46596a = strArr;
    }
}
