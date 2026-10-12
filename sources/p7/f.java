package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(25);
    public final String f43152a;
    public final String f43153b;
    public final String f43154c;

    public f(String str, String str2, String str3) {
        this.f43152a = str;
        this.f43153b = str2;
        this.f43154c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f43152a, ", corpusName=", this.f43153b, ", uri="), this.f43154c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f43152a);
        g0.l(parcel, 2, this.f43153b);
        g0.l(parcel, 3, this.f43154c);
        g0.r(parcel, q6);
    }
}
