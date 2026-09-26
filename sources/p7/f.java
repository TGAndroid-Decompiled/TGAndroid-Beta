package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40964a;
    public final String f40965b;
    public final String f40966c;

    public f(String str, String str2, String str3) {
        this.f40964a = str;
        this.f40965b = str2;
        this.f40966c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f40964a, ", corpusName=", this.f40965b, ", uri="), this.f40966c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40964a);
        f0.l(parcel, 2, this.f40965b);
        f0.l(parcel, 3, this.f40966c);
        f0.r(parcel, q6);
    }
}
