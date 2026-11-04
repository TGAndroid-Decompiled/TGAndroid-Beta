package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new w8.b(24);
    public String f59326a;
    public String f59327b;
    public ArrayList f59328c;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f59326a);
        j8.a.m(parcel, 3, this.f59327b);
        j8.a.q(parcel, 4, this.f59328c);
        j8.a.t(parcel, s6);
    }
}
