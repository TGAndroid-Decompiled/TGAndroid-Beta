package u7;

import a8.l8;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class f extends a8.q {
    public final int f58483b;
    public final TaskCompletionSource f58484c;

    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 11);
        this.f58483b = i7;
        switch (i7) {
            case 1:
                this.f58484c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 11);
                return;
            default:
                this.f58484c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean l1(Parcel parcel, int i7) {
        switch (this.f58483b) {
            case 0:
                if (i7 == 1) {
                    d.b(parcel);
                    l8.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f58484c);
                    return true;
                }
                return false;
            default:
                if (i7 == 1) {
                    j8.e eVar = (j8.e) d.a(parcel, j8.e.CREATOR);
                    d.b(parcel);
                    Status status = eVar.f17348a;
                    ?? obj = new Object();
                    obj.f6424a = eVar;
                    l8.a(status, obj, this.f58484c);
                    return true;
                }
                return false;
        }
    }
}
