package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f43989a;
    public final String f43990b;
    public final String f43991c;

    public f(String str, String str2, String str3) {
        this.f43989a = str;
        this.f43990b = str2;
        this.f43991c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f43989a, ", corpusName=", this.f43990b, ", uri="), this.f43991c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43989a);
        e0.l(parcel, 2, this.f43990b);
        e0.l(parcel, 3, this.f43991c);
        e0.r(parcel, q6);
    }
}
