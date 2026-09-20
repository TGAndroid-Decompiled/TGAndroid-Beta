package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40992a;
    public final String f40993b;
    public final String f40994c;

    public f(String str, String str2, String str3) {
        this.f40992a = str;
        this.f40993b = str2;
        this.f40994c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f40992a, ", corpusName=", this.f40993b, ", uri="), this.f40994c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40992a);
        f0.l(parcel, 2, this.f40993b);
        f0.l(parcel, 3, this.f40994c);
        f0.r(parcel, q6);
    }
}
