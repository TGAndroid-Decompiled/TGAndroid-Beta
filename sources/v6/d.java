package v6;

import a8.l8;
import a8.q;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d extends q implements b {
    public final int f59333b;
    public final TaskCompletionSource f59334c;

    public d(e eVar, TaskCompletionSource taskCompletionSource, int i7) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 8);
        this.f59333b = i7;
        this.f59334c = taskCompletionSource;
    }

    @Override
    public void C0(Status status, u6.a aVar) {
        switch (this.f59333b) {
            case 0:
                l8.b(status, aVar, this.f59334c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void K(Status status, u6.c cVar) {
        switch (this.f59333b) {
            case 1:
                l8.b(status, cVar, this.f59334c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean i1(int i7, Parcel parcel, Parcel parcel2) {
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
            K((Status) n7.a.a(parcel, Status.CREATOR), (u6.c) n7.a.a(parcel, u6.c.CREATOR));
            return true;
        }
        n7.a.d(parcel);
        C0((Status) n7.a.a(parcel, Status.CREATOR), (u6.a) n7.a.a(parcel, u6.a.CREATOR));
        return true;
    }
}
