package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f40649a;
    public final String f40650b;
    public final String f40651c;

    public f(String str, String str2, String str3) {
        this.f40649a = str;
        this.f40650b = str2;
        this.f40651c = str3;
    }

    public final String toString() {
        return a4.a.t(a4.a.x("DocumentId[packageName=", this.f40649a, ", corpusName=", this.f40650b, ", uri="), this.f40651c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40649a);
        e0.l(parcel, 2, this.f40650b);
        e0.l(parcel, 3, this.f40651c);
        e0.r(parcel, q6);
    }
}
