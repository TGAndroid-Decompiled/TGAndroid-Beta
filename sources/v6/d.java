package v6;

import a8.k8;
import a8.q;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d extends q implements b {
    public final int f57125b;
    public final TaskCompletionSource f57126c;

    public d(f fVar, TaskCompletionSource taskCompletionSource, int i7) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 8);
        this.f57125b = i7;
        this.f57126c = taskCompletionSource;
    }

    @Override
    public void B(Status status, u6.c cVar) {
        switch (this.f57125b) {
            case 1:
                k8.b(status, cVar, this.f57126c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean I0(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return false;
                    }
                    Status status = (Status) n7.a.a(parcel, Status.CREATOR);
                    n7.a.d(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) n7.a.a(parcel, Status.CREATOR);
                u6.b bVar = (u6.b) n7.a.a(parcel, u6.b.CREATOR);
                n7.a.d(parcel);
                throw new UnsupportedOperationException();
            }
            n7.a.d(parcel);
            B((Status) n7.a.a(parcel, Status.CREATOR), (u6.c) n7.a.a(parcel, u6.c.CREATOR));
            return true;
        }
        n7.a.d(parcel);
        l0((Status) n7.a.a(parcel, Status.CREATOR), (u6.a) n7.a.a(parcel, u6.a.CREATOR));
        return true;
    }

    @Override
    public void l0(Status status, u6.a aVar) {
        switch (this.f57125b) {
            case 0:
                k8.b(status, aVar, this.f57126c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
