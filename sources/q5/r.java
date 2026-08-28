package q5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r extends a7.a implements e {
    public final int f46048b;
    public final TaskCompletionSource f46049c;

    public r(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
        this.f46048b = i9;
        this.f46049c = taskCompletionSource;
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 1) {
            com.google.android.gms.internal.cast.u.b(parcel);
            h0((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void h0(Bundle bundle) {
        switch (this.f46048b) {
            case 0:
                this.f46049c.setResult(bundle);
                return;
            case 1:
                this.f46049c.setResult(bundle);
                return;
            default:
                this.f46049c.setResult(bundle);
                return;
        }
    }
}
