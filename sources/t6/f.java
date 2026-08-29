package t6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
import kotlin.jvm.internal.j;
import s6.m;
import s6.r;
public final class f extends c7.a implements a {
    public final int f48163b;
    public final TaskCompletionSource f48164c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f48163b = i10;
        this.f48164c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override
    public void A0(Status status, s6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void E(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override
    public void Q(Status status, m mVar) {
        switch (this.f48163b) {
            case 1:
                j.e(status, "status");
                o5.a(status, mVar, this.f48164c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void u0(Status status, s6.e eVar) {
        switch (this.f48163b) {
            case 0:
                j.e(status, "status");
                o5.a(status, eVar, this.f48164c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
