package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f52044a;
    public final boolean f52045b;

    public s(int i10, boolean z10) {
        this.f52044a = i10;
        this.f52045b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52044a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52045b ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
