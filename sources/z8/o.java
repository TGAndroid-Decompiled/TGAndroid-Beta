package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new d(9);
    public final int f52815a;
    public final int f52816b;

    public o(int i10, int i11) {
        this.f52815a = i10;
        this.f52816b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52815a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52816b);
        df.r(parcel, q5);
    }
}
