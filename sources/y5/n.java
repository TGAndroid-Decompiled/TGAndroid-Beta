package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new w7.f(15);

    public final int f49674a;

    public final boolean f49675b;

    public final boolean f49676c;
    public final int d;

    public final int f49677e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f49674a = i10;
        this.f49675b = z10;
        this.f49676c = z11;
        this.d = i11;
        this.f49677e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49674a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f49675b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49676c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f49677e);
        r8.r(parcel, iQ);
    }
}
