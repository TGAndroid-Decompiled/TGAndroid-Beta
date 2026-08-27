package x7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w7.f(7);

    public final String f49378a;

    public g(String str) {
        this.f49378a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f49378a);
        r8.r(parcel, iQ);
    }
}
