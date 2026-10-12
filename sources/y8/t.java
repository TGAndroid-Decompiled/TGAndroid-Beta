package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f52049a;
    public final boolean f52050b;
    public final boolean f52051c;

    public t(int i10, boolean z10, boolean z11) {
        this.f52049a = i10;
        this.f52050b = z10;
        this.f52051c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52049a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52050b ? 1 : 0);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f52051c ? 1 : 0);
        w7.c0.r(parcel, q6);
    }
}
