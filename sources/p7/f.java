package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40694a;
    public final String f40695b;
    public final String f40696c;

    public f(String str, String str2, String str3) {
        this.f40694a = str;
        this.f40695b = str2;
        this.f40696c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f40694a, ", corpusName=", this.f40695b, ", uri="), this.f40696c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40694a);
        e0.l(parcel, 2, this.f40695b);
        e0.l(parcel, 3, this.f40696c);
        e0.r(parcel, q6);
    }
}
