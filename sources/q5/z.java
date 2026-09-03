package q5;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.s {
    public static final z f42912b = new z(0);
    public static final z f42913c = new z(1);
    public final int f42914a;

    public z(int i10) {
        this.f42914a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f42914a) {
            case 0:
                u5.b bVar = f0.G;
                ((u5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                return;
            default:
                u5.b bVar2 = f0.G;
                u5.f fVar = (u5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
