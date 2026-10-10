package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f45528a;
    public final String f45529b;
    public final String f45530c;

    public f(String str, String str2, String str3) {
        this.f45528a = str;
        this.f45529b = str2;
        this.f45530c = str3;
    }

    public final String toString() {
        return a1.g.t(a1.g.x("DocumentId[packageName=", this.f45528a, ", corpusName=", this.f45529b, ", uri="), this.f45530c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45528a);
        d0.l(parcel, 2, this.f45529b);
        d0.l(parcel, 3, this.f45530c);
        d0.r(parcel, q6);
    }
}
