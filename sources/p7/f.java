package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f43990a;
    public final String f43991b;
    public final String f43992c;

    public f(String str, String str2, String str3) {
        this.f43990a = str;
        this.f43991b = str2;
        this.f43992c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f43990a, ", corpusName=", this.f43991b, ", uri="), this.f43992c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43990a);
        e0.l(parcel, 2, this.f43991b);
        e0.l(parcel, 3, this.f43992c);
        e0.r(parcel, q6);
    }
}
