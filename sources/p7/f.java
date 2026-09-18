package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40951a;
    public final String f40952b;
    public final String f40953c;

    public f(String str, String str2, String str3) {
        this.f40951a = str;
        this.f40952b = str2;
        this.f40953c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f40951a, ", corpusName=", this.f40952b, ", uri="), this.f40953c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40951a);
        f0.l(parcel, 2, this.f40952b);
        f0.l(parcel, 3, this.f40953c);
        f0.r(parcel, q6);
    }
}
