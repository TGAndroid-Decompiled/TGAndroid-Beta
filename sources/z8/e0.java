package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class e0 extends p6.a {
    public static final Parcelable.Creator<e0> CREATOR = new d(25);
    public final int f52720a;
    public final String f52721b;

    public e0(int i10, String str) {
        this.f52720a = i10;
        this.f52721b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52720a);
        df.l(parcel, 3, this.f52721b);
        df.r(parcel, q5);
    }
}
