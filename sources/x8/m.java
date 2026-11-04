package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new w8.b(9);
    public ArrayList f58563a;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.o(parcel, 1, this.f58563a);
        j8.a.t(parcel, s6);
    }
}
