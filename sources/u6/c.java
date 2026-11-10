package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f56367a;
    public final boolean f56368b;

    public c(int i7, boolean z9) {
        this.f56367a = i7;
        this.f56368b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f56367a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f56368b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
