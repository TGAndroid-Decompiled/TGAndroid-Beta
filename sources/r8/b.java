package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import q4.x;
public final class b extends r6.a implements r {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int f56526a;
    public final int f56527b;
    public final Intent f56528c;

    public b(int i7, int i10, Intent intent) {
        this.f56526a = i7;
        this.f56527b = i10;
        this.f56528c = intent;
    }

    @Override
    public final Status a() {
        if (this.f56527b == 0) {
            return Status.f6222e;
        }
        return Status.f6225r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56526a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f56527b);
        bc.k(parcel, 3, this.f56528c, i7);
        bc.s(parcel, r10);
    }
}
