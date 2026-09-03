package q5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.s {
    public final int f42792a = 1;
    public final f0 f42793b;
    public final String f42794c;
    public final f d;

    public a0(f0 f0Var, String str, s5.h hVar) {
        this.f42793b = f0Var;
        this.f42794c = str;
        this.d = hVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f42792a) {
            case 0:
                boolean z4 = true;
                if (this.f42793b.F == 1) {
                    z4 = false;
                }
                b6.m.j("Not active connection", z4);
                if (this.d != null) {
                    u5.f fVar = (u5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.f42794c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z10 = true;
                if (this.f42793b.F == 1) {
                    z10 = false;
                }
                b6.m.j("Not active connection", z10);
                u5.f fVar2 = (u5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.f42794c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    u5.f fVar3 = (u5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(f0 f0Var, f fVar, String str) {
        this.f42793b = f0Var;
        this.d = fVar;
        this.f42794c = str;
    }
}
