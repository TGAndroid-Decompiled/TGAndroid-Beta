package v6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
import kotlin.jvm.internal.j;
import u6.l;
import u6.r;
public final class f extends a7.c implements a {
    public final int f48951b;
    public final TaskCompletionSource f48952c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f48951b = i10;
        this.f48952c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void H(Status status, l lVar) {
        switch (this.f48951b) {
            case 1:
                j.e(status, "status");
                p5.a(status, lVar, this.f48952c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void N(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void R(Status status, u6.e eVar) {
        switch (this.f48951b) {
            case 0:
                j.e(status, "status");
                p5.a(status, eVar, this.f48952c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void l(Status status, u6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
