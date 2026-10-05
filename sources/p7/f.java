package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f44318a;
    public final String f44319b;
    public final String f44320c;

    public f(String str, String str2, String str3) {
        this.f44318a = str;
        this.f44319b = str2;
        this.f44320c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f44318a, ", corpusName=", this.f44319b, ", uri="), this.f44320c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44318a);
        g0.l(parcel, 2, this.f44319b);
        g0.l(parcel, 3, this.f44320c);
        g0.r(parcel, q6);
    }
}
