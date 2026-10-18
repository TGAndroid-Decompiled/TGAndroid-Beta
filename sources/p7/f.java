package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(25);
    public final String f44238a;
    public final String f44239b;
    public final String f44240c;

    public f(String str, String str2, String str3) {
        this.f44238a = str;
        this.f44239b = str2;
        this.f44240c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f44238a, ", corpusName=", this.f44239b, ", uri="), this.f44240c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44238a);
        f0.l(parcel, 2, this.f44239b);
        f0.l(parcel, 3, this.f44240c);
        f0.r(parcel, q6);
    }
}
