package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f46689a;
    public final boolean f46690b;

    public s(int i10, boolean z10) {
        this.f46689a = i10;
        this.f46690b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46689a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46690b ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
