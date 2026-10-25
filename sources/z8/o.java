package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new d(9);
    public final int f52754a;
    public final int f52755b;

    public o(int i10, int i11) {
        this.f52754a = i10;
        this.f52755b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52754a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52755b);
        df.r(parcel, q5);
    }
}
