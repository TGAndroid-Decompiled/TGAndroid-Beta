package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(25);
    public final String f44247a;
    public final String f44248b;
    public final String f44249c;

    public f(String str, String str2, String str3) {
        this.f44247a = str;
        this.f44248b = str2;
        this.f44249c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f44247a, ", corpusName=", this.f44248b, ", uri="), this.f44249c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44247a);
        f0.l(parcel, 2, this.f44248b);
        f0.l(parcel, 3, this.f44249c);
        f0.r(parcel, q6);
    }
}
