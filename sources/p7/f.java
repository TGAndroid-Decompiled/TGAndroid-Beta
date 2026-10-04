package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f44311a;
    public final String f44312b;
    public final String f44313c;

    public f(String str, String str2, String str3) {
        this.f44311a = str;
        this.f44312b = str2;
        this.f44313c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f44311a, ", corpusName=", this.f44312b, ", uri="), this.f44313c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44311a);
        g0.l(parcel, 2, this.f44312b);
        g0.l(parcel, 3, this.f44313c);
        g0.r(parcel, q6);
    }
}
