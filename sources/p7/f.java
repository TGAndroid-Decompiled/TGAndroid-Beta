package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f41064a;
    public final String f41065b;
    public final String f41066c;

    public f(String str, String str2, String str3) {
        this.f41064a = str;
        this.f41065b = str2;
        this.f41066c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f41064a, ", corpusName=", this.f41065b, ", uri="), this.f41066c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f41064a);
        f0.l(parcel, 2, this.f41065b);
        f0.l(parcel, 3, this.f41066c);
        f0.r(parcel, q6);
    }
}
