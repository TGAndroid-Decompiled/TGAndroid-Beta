package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.i(24);
    public final String f44866a;
    public final String f44867b;
    public final String f44868c;

    public f(String str, String str2, String str3) {
        this.f44866a = str;
        this.f44867b = str2;
        this.f44868c = str3;
    }

    public final String toString() {
        return a1.g.r(a1.g.v("DocumentId[packageName=", this.f44866a, ", corpusName=", this.f44867b, ", uri="), this.f44868c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f44866a);
        h0.l(parcel, 2, this.f44867b);
        h0.l(parcel, 3, this.f44868c);
        h0.r(parcel, q6);
    }
}
