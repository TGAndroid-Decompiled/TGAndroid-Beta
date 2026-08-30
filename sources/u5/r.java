package u5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r extends a7.c implements e {
    public final int f45134b;
    public final TaskCompletionSource f45135c;

    public r(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f45134b = i10;
        this.f45135c = taskCompletionSource;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            com.google.android.gms.internal.cast.t.b(parcel);
            i0((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void i0(Bundle bundle) {
        switch (this.f45134b) {
            case 0:
                this.f45135c.setResult(bundle);
                return;
            case 1:
                this.f45135c.setResult(bundle);
                return;
            default:
                this.f45135c.setResult(bundle);
                return;
        }
    }
}
