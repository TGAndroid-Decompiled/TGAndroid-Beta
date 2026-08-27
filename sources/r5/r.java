package r5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class r extends b7.a implements e {

    public final int f46807b;

    public final TaskCompletionSource f46808c;

    public r(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 2);
        this.f46807b = i10;
        this.f46808c = taskCompletionSource;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.t.b(parcel);
        l0(bundle);
        return true;
    }

    @Override
    public final void l0(Bundle bundle) {
        switch (this.f46807b) {
            case 0:
                this.f46808c.setResult(bundle);
                break;
            case 1:
                this.f46808c.setResult(bundle);
                break;
            default:
                this.f46808c.setResult(bundle);
                break;
        }
    }
}
