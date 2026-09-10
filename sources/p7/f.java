package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(27);
    public final String f39823a;
    public final String f39824b;
    public final String f39825c;

    public f(String str, String str2, String str3) {
        this.f39823a = str;
        this.f39824b = str2;
        this.f39825c = str3;
    }

    public final String toString() {
        return a4.a.s(a4.a.w("DocumentId[packageName=", this.f39823a, ", corpusName=", this.f39824b, ", uri="), this.f39825c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f39823a);
        e0.l(parcel, 2, this.f39824b);
        e0.l(parcel, 3, this.f39825c);
        e0.r(parcel, q6);
    }
}
