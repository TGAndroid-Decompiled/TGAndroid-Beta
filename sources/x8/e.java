package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new w8.b(17);
    public ArrayList f58524a;
    public String f58525b;
    public String f58526c;
    public ArrayList d;
    public boolean f58527e;
    public String f58528f;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.i(parcel, 2, this.f58524a);
        j8.a.m(parcel, 4, this.f58525b);
        j8.a.m(parcel, 5, this.f58526c);
        j8.a.i(parcel, 6, this.d);
        boolean z10 = this.f58527e;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.m(parcel, 8, this.f58528f);
        j8.a.t(parcel, s6);
    }
}
