package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f43962a;
    public final String f43963b;
    public final String f43964c;

    public f(String str, String str2, String str3) {
        this.f43962a = str;
        this.f43963b = str2;
        this.f43964c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f43962a, ", corpusName=", this.f43963b, ", uri="), this.f43964c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43962a);
        e0.l(parcel, 2, this.f43963b);
        e0.l(parcel, 3, this.f43964c);
        e0.r(parcel, q6);
    }
}
