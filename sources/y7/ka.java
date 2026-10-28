package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class ka extends p6.a {
    public static final Parcelable.Creator<ka> CREATOR = new m5(2);
    public final String f52258a;
    public final float f52259b;
    public final String f52260c;
    public final int d;

    public ka(float f7, int i10, String str, String str2) {
        this.f52258a = str;
        this.f52259b = f7;
        this.f52260c = str2;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52258a);
        df.s(parcel, 2, 4);
        parcel.writeFloat(this.f52259b);
        df.l(parcel, 3, this.f52260c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
