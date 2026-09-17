package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f43963a;
    public final String f43964b;
    public final String f43965c;

    public f(String str, String str2, String str3) {
        this.f43963a = str;
        this.f43964b = str2;
        this.f43965c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f43963a, ", corpusName=", this.f43964b, ", uri="), this.f43965c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43963a);
        e0.l(parcel, 2, this.f43964b);
        e0.l(parcel, 3, this.f43965c);
        e0.r(parcel, q6);
    }
}
