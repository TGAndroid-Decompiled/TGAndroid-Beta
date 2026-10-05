package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class f extends b8.b {
    public final int f45851b;
    public final TaskCompletionSource f45852c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f45851b = i10;
        switch (i10) {
            case 1:
                this.f45852c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f45852c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean K0(Parcel parcel, int i10) {
        switch (this.f45851b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    g5.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f45852c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    g8.g gVar = (g8.g) d.a(parcel, g8.g.CREATOR);
                    d.b(parcel);
                    Status status = gVar.f10343a;
                    ?? obj = new Object();
                    obj.f3235a = gVar;
                    g5.a(status, obj, this.f45852c);
                    return true;
                }
                return false;
        }
    }
}
