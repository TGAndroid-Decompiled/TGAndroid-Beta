package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList f51083a;
    public String f51084b;
    public String f51085c;
    public ArrayList d;
    public boolean e;
    public String f51086f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.h(parcel, 2, this.f51083a);
        df.l(parcel, 4, this.f51084b);
        df.l(parcel, 5, this.f51085c);
        df.h(parcel, 6, this.d);
        boolean z10 = this.e;
        df.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 8, this.f51086f);
        df.r(parcel, q5);
    }
}
