package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40966a;
    public final String f40967b;
    public final String f40968c;

    public f(String str, String str2, String str3) {
        this.f40966a = str;
        this.f40967b = str2;
        this.f40968c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f40966a, ", corpusName=", this.f40967b, ", uri="), this.f40968c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40966a);
        f0.l(parcel, 2, this.f40967b);
        f0.l(parcel, 3, this.f40968c);
        f0.r(parcel, q6);
    }
}
