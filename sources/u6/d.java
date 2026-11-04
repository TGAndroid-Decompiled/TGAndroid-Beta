package u6;

import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d extends o implements b {
    public final int f55733b;
    public final TaskCompletionSource f55734c;

    public d(e eVar, TaskCompletionSource taskCompletionSource, int i3) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.f55733b = i3;
        this.f55734c = taskCompletionSource;
    }

    @Override
    public final boolean I0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return false;
                    }
                    Status status = (Status) m7.a.a(parcel, Status.CREATOR);
                    m7.a.d(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) m7.a.a(parcel, Status.CREATOR);
                t6.b bVar = (t6.b) m7.a.a(parcel, t6.b.CREATOR);
                m7.a.d(parcel);
                throw new UnsupportedOperationException();
            }
            m7.a.d(parcel);
            l0((Status) m7.a.a(parcel, Status.CREATOR), (t6.c) m7.a.a(parcel, t6.c.CREATOR));
            return true;
        }
        m7.a.d(parcel);
        w0((Status) m7.a.a(parcel, Status.CREATOR), (t6.a) m7.a.a(parcel, t6.a.CREATOR));
        return true;
    }

    @Override
    public void l0(Status status, t6.c cVar) {
        switch (this.f55733b) {
            case 1:
                y9.b(status, cVar, this.f55734c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void w0(Status status, t6.a aVar) {
        switch (this.f55733b) {
            case 0:
                y9.b(status, aVar, this.f55734c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
