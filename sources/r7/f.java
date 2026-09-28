package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class f extends b8.b {
    public final int f42350b;
    public final TaskCompletionSource f42351c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f42350b = i10;
        switch (i10) {
            case 1:
                this.f42351c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f42351c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        switch (this.f42350b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    h5.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f42351c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    g8.g gVar = (g8.g) d.a(parcel, g8.g.CREATOR);
                    d.b(parcel);
                    Status status = gVar.f9498a;
                    ?? obj = new Object();
                    obj.f2992a = gVar;
                    h5.a(status, obj, this.f42351c);
                    return true;
                }
                return false;
        }
    }
}
