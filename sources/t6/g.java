package t6;

import a8.aa;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class g extends c8.b implements d {
    public final int f48719b;
    public final TaskCompletionSource f48720c;

    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.f48719b = i10;
        this.f48720c = taskCompletionSource;
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    Status status = (Status) l7.a.a(parcel, Status.CREATOR);
                    l7.a.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) l7.a.a(parcel, Status.CREATOR);
                s6.b bVar = (s6.b) l7.a.a(parcel, s6.b.CREATOR);
                l7.a.b(parcel);
                throw new UnsupportedOperationException();
            }
            l7.a.b(parcel);
            y0((Status) l7.a.a(parcel, Status.CREATOR), (s6.c) l7.a.a(parcel, s6.c.CREATOR));
            return true;
        }
        l7.a.b(parcel);
        p0((Status) l7.a.a(parcel, Status.CREATOR), (s6.a) l7.a.a(parcel, s6.a.CREATOR));
        return true;
    }

    @Override
    public void p0(Status status, s6.a aVar) {
        switch (this.f48719b) {
            case 0:
                aa.b(status, aVar, this.f48720c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void y0(Status status, s6.c cVar) {
        switch (this.f48719b) {
            case 1:
                aa.b(status, cVar, this.f48720c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
