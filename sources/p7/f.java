package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f45370a;
    public final String f45371b;
    public final String f45372c;

    public f(String str, String str2, String str3) {
        this.f45370a = str;
        this.f45371b = str2;
        this.f45372c = str3;
    }

    public final String toString() {
        return a1.g.t(a1.g.x("DocumentId[packageName=", this.f45370a, ", corpusName=", this.f45371b, ", uri="), this.f45372c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f45370a);
        c0.l(parcel, 2, this.f45371b);
        c0.l(parcel, 3, this.f45372c);
        c0.r(parcel, q6);
    }
}
