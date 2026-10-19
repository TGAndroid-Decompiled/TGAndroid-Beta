package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(25);
    public final String f44235a;
    public final String f44236b;
    public final String f44237c;

    public f(String str, String str2, String str3) {
        this.f44235a = str;
        this.f44236b = str2;
        this.f44237c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f44235a, ", corpusName=", this.f44236b, ", uri="), this.f44237c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44235a);
        f0.l(parcel, 2, this.f44236b);
        f0.l(parcel, 3, this.f44237c);
        f0.r(parcel, q6);
    }
}
