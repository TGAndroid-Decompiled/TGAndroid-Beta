package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class l4 extends p6.a {
    public static final Parcelable.Creator<l4> CREATOR = new m5(0);
    public final String f52208a;
    public final String f52209b;
    public final float f52210c;
    public final int d;

    public l4(float f7, int i10, String str, String str2) {
        this.f52209b = str2;
        this.f52210c = f7;
        this.f52208a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52209b);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.f52210c);
        df.l(parcel, 4, this.f52208a);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
