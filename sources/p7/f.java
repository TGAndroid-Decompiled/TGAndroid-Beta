package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.i(24);
    public final String f44855a;
    public final String f44856b;
    public final String f44857c;

    public f(String str, String str2, String str3) {
        this.f44855a = str;
        this.f44856b = str2;
        this.f44857c = str3;
    }

    public final String toString() {
        return a1.g.r(a1.g.v("DocumentId[packageName=", this.f44855a, ", corpusName=", this.f44856b, ", uri="), this.f44857c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f44855a);
        h0.l(parcel, 2, this.f44856b);
        h0.l(parcel, 3, this.f44857c);
        h0.r(parcel, q6);
    }
}
