package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f41013a;
    public final String f41014b;
    public final String f41015c;

    public f(String str, String str2, String str3) {
        this.f41013a = str;
        this.f41014b = str2;
        this.f41015c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f41013a, ", corpusName=", this.f41014b, ", uri="), this.f41015c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f41013a);
        f0.l(parcel, 2, this.f41014b);
        f0.l(parcel, 3, this.f41015c);
        f0.r(parcel, q6);
    }
}
