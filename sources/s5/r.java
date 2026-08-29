package s5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r extends c7.a implements e {
    public final int f47619b;
    public final TaskCompletionSource f47620c;

    public r(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f47619b = i10;
        this.f47620c = taskCompletionSource;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            com.google.android.gms.internal.cast.u.b(parcel);
            i0((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void i0(Bundle bundle) {
        switch (this.f47619b) {
            case 0:
                this.f47620c.setResult(bundle);
                return;
            case 1:
                this.f47620c.setResult(bundle);
                return;
            default:
                this.f47620c.setResult(bundle);
                return;
        }
    }
}
