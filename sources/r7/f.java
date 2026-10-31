package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class f extends b8.b {
    public final int f46344b;
    public final TaskCompletionSource f46345c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.f46344b = i10;
        switch (i10) {
            case 1:
                this.f46345c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                return;
            default:
                this.f46345c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean L0(Parcel parcel, int i10) {
        switch (this.f46344b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    i5.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f46345c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    g8.e eVar = (g8.e) d.a(parcel, g8.e.CREATOR);
                    d.b(parcel);
                    Status status = eVar.f7453a;
                    ?? obj = new Object();
                    obj.f2047a = eVar;
                    i5.a(status, obj, this.f46345c);
                    return true;
                }
                return false;
        }
    }
}
