package s6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class f extends b8.b implements d {
    public final int f48085b;
    public final TaskCompletionSource f48086c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.f48085b = i10;
        this.f48086c = taskCompletionSource;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    Status status = (Status) k7.a.a(parcel, Status.CREATOR);
                    k7.a.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) k7.a.a(parcel, Status.CREATOR);
                r6.b bVar = (r6.b) k7.a.a(parcel, r6.b.CREATOR);
                k7.a.b(parcel);
                throw new UnsupportedOperationException();
            }
            k7.a.b(parcel);
            X((Status) k7.a.a(parcel, Status.CREATOR), (r6.c) k7.a.a(parcel, r6.c.CREATOR));
            return true;
        }
        k7.a.b(parcel);
        w((Status) k7.a.a(parcel, Status.CREATOR), (r6.a) k7.a.a(parcel, r6.a.CREATOR));
        return true;
    }

    @Override
    public void X(Status status, r6.c cVar) {
        switch (this.f48085b) {
            case 1:
                i5.b(status, cVar, this.f48086c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void w(Status status, r6.a aVar) {
        switch (this.f48085b) {
            case 0:
                i5.b(status, aVar, this.f48086c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
