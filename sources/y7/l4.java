package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class l4 extends p6.a {
    public static final Parcelable.Creator<l4> CREATOR = new m5(0);
    public final String f52266a;
    public final String f52267b;
    public final float f52268c;
    public final int d;

    public l4(float f7, int i10, String str, String str2) {
        this.f52267b = str2;
        this.f52268c = f7;
        this.f52266a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52267b);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.f52268c);
        df.l(parcel, 4, this.f52266a);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
