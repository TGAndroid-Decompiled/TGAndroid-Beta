package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f44304a;
    public final String f44305b;
    public final String f44306c;

    public f(String str, String str2, String str3) {
        this.f44304a = str;
        this.f44305b = str2;
        this.f44306c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f44304a, ", corpusName=", this.f44305b, ", uri="), this.f44306c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44304a);
        g0.l(parcel, 2, this.f44305b);
        g0.l(parcel, 3, this.f44306c);
        g0.r(parcel, q6);
    }
}
