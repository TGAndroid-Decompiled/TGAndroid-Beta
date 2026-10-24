package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(25);
    public final String f44661a;
    public final String f44662b;
    public final String f44663c;

    public f(String str, String str2, String str3) {
        this.f44661a = str;
        this.f44662b = str2;
        this.f44663c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f44661a, ", corpusName=", this.f44662b, ", uri="), this.f44663c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44661a);
        f0.l(parcel, 2, this.f44662b);
        f0.l(parcel, 3, this.f44663c);
        f0.r(parcel, q6);
    }
}
