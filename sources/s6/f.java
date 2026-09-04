package s6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class f extends b8.b implements d {
    public final int f45951b;
    public final TaskCompletionSource f45952c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.f45951b = i10;
        this.f45952c = taskCompletionSource;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
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
            W((Status) k7.a.a(parcel, Status.CREATOR), (r6.c) k7.a.a(parcel, r6.c.CREATOR));
            return true;
        }
        k7.a.b(parcel);
        v((Status) k7.a.a(parcel, Status.CREATOR), (r6.a) k7.a.a(parcel, r6.a.CREATOR));
        return true;
    }

    @Override
    public void W(Status status, r6.c cVar) {
        switch (this.f45951b) {
            case 1:
                f5.b(status, cVar, this.f45952c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void v(Status status, r6.a aVar) {
        switch (this.f45951b) {
            case 0:
                f5.b(status, aVar, this.f45952c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
