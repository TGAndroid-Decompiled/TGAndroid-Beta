package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList f51141a;
    public String f51142b;
    public String f51143c;
    public ArrayList d;
    public boolean e;
    public String f51144f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.h(parcel, 2, this.f51141a);
        df.l(parcel, 4, this.f51142b);
        df.l(parcel, 5, this.f51143c);
        df.h(parcel, 6, this.d);
        boolean z10 = this.e;
        df.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 8, this.f51144f);
        df.r(parcel, q5);
    }
}
