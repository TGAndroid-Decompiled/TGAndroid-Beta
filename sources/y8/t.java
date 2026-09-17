package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f49648a;
    public final boolean f49649b;
    public final boolean f49650c;

    public t(int i10, boolean z10, boolean z11) {
        this.f49648a = i10;
        this.f49649b = z10;
        this.f49650c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49648a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49649b ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f49650c ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
