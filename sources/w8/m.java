package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new s(1);
    public ArrayList f51175a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.n(parcel, 1, this.f51175a);
        df.r(parcel, q5);
    }
}
