package r6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import kotlin.jvm.internal.i;
import q6.l;
import q6.q;
public final class f extends a7.a implements a {
    public final int f47080b;
    public final TaskCompletionSource f47081c;

    public f(int i9, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f47080b = i9;
        this.f47081c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void U(Status status, q6.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void p0(Status status, l lVar) {
        switch (this.f47080b) {
            case 1:
                i.e(status, "status");
                h5.a(status, lVar, this.f47081c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void r0(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void t0(Status status, q6.e eVar) {
        switch (this.f47080b) {
            case 0:
                i.e(status, "status");
                h5.a(status, eVar, this.f47081c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
