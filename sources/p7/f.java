package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f45484a;
    public final String f45485b;
    public final String f45486c;

    public f(String str, String str2, String str3) {
        this.f45484a = str;
        this.f45485b = str2;
        this.f45486c = str3;
    }

    public final String toString() {
        return a1.g.t(a1.g.x("DocumentId[packageName=", this.f45484a, ", corpusName=", this.f45485b, ", uri="), this.f45486c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45484a);
        d0.l(parcel, 2, this.f45485b);
        d0.l(parcel, 3, this.f45486c);
        d0.r(parcel, q6);
    }
}
