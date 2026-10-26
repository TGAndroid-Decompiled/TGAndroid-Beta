package s7;

import a8.aa;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class f extends c8.b {
    public final int f47899b;
    public final TaskCompletionSource f47900c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f47899b = i10;
        switch (i10) {
            case 1:
                this.f47900c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f47900c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean J0(Parcel parcel, int i10) {
        switch (this.f47899b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    aa.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f47900c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    h8.g gVar = (h8.g) d.a(parcel, h8.g.CREATOR);
                    d.b(parcel);
                    Status status = gVar.f12707a;
                    ?? obj = new Object();
                    obj.f3212a = gVar;
                    aa.a(status, obj, this.f47900c);
                    return true;
                }
                return false;
        }
    }
}
