package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f44303a;
    public final String f44304b;
    public final String f44305c;

    public f(String str, String str2, String str3) {
        this.f44303a = str;
        this.f44304b = str2;
        this.f44305c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f44303a, ", corpusName=", this.f44304b, ", uri="), this.f44305c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44303a);
        g0.l(parcel, 2, this.f44304b);
        g0.l(parcel, 3, this.f44305c);
        g0.r(parcel, q6);
    }
}
