package s6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import kotlin.jvm.internal.j;
import r6.m;
import r6.r;

public final class f extends b7.a implements a {

    public final int f47800b;

    public final TaskCompletionSource f47801c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f47800b = i10;
        this.f47801c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void U(Status status, r6.e eVar) {
        switch (this.f47800b) {
            case 0:
                j.e(status, "status");
                g5.a(status, eVar, this.f47801c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void h(Status status, m mVar) {
        switch (this.f47800b) {
            case 1:
                j.e(status, "status");
                g5.a(status, mVar, this.f47801c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void q(Status status, r6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void u0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
