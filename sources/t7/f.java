package t7;

import android.location.Location;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class f extends com.google.android.gms.internal.cast.o {
    public final int f54956b;
    public final TaskCompletionSource f54957c;

    public f(int i3, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f54956b = i3;
        switch (i3) {
            case 1:
                this.f54957c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f54957c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean L0(Parcel parcel, int i3) {
        switch (this.f54956b) {
            case 0:
                if (i3 == 1) {
                    d.b(parcel);
                    y9.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f54957c);
                    return true;
                }
                return false;
            default:
                if (i3 == 1) {
                    i8.e eVar = (i8.e) d.a(parcel, i8.e.CREATOR);
                    d.b(parcel);
                    Status status = eVar.f14700a;
                    ?? obj = new Object();
                    obj.f6076a = eVar;
                    y9.a(status, obj, this.f54957c);
                    return true;
                }
                return false;
        }
    }
}
