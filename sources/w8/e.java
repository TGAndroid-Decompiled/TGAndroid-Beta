package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList f51080a;
    public String f51081b;
    public String f51082c;
    public ArrayList d;
    public boolean e;
    public String f51083f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.h(parcel, 2, this.f51080a);
        df.l(parcel, 4, this.f51081b);
        df.l(parcel, 5, this.f51082c);
        df.h(parcel, 6, this.d);
        boolean z10 = this.e;
        df.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 8, this.f51083f);
        df.r(parcel, q5);
    }
}
