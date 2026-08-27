package x7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new w7.f(4);

    public final String f49374a;

    public e(String str) {
        this.f49374a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f49374a);
        r8.r(parcel, iQ);
    }
}
