package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40725a;
    public final String f40726b;
    public final String f40727c;

    public f(String str, String str2, String str3) {
        this.f40725a = str;
        this.f40726b = str2;
        this.f40727c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f40725a, ", corpusName=", this.f40726b, ", uri="), this.f40727c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40725a);
        e0.l(parcel, 2, this.f40726b);
        e0.l(parcel, 3, this.f40727c);
        e0.r(parcel, q6);
    }
}
