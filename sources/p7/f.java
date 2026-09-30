package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40967a;
    public final String f40968b;
    public final String f40969c;

    public f(String str, String str2, String str3) {
        this.f40967a = str;
        this.f40968b = str2;
        this.f40969c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f40967a, ", corpusName=", this.f40968b, ", uri="), this.f40969c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40967a);
        f0.l(parcel, 2, this.f40968b);
        f0.l(parcel, 3, this.f40969c);
        f0.r(parcel, q6);
    }
}
