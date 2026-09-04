package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;
public final class f extends b8.b {
    public final int f44936b;
    public final TaskCompletionSource f44937c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f44936b = i10;
        switch (i10) {
            case 1:
                this.f44937c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f44937c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        switch (this.f44936b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    f5.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f44937c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    g8.g gVar = (g8.g) d.a(parcel, g8.g.CREATOR);
                    d.b(parcel);
                    Status status = gVar.f10479a;
                    ?? obj = new Object();
                    obj.f2041a = gVar;
                    f5.a(status, obj, this.f44937c);
                    return true;
                }
                return false;
        }
    }
}
