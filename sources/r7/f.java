package r7;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new q8.i(2);
    public final String f54407a;
    public final String f54408b;
    public final String f54409c;

    public f(String str, String str2, String str3) {
        this.f54407a = str;
        this.f54408b = str2;
        this.f54409c = str3;
    }

    public final String toString() {
        return a1.g.s(com.google.android.recaptcha.internal.a.n("DocumentId[packageName=", this.f54407a, ", corpusName=", this.f54408b, ", uri="), this.f54409c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f54407a);
        j8.a.m(parcel, 2, this.f54408b);
        j8.a.m(parcel, 3, this.f54409c);
        j8.a.t(parcel, s6);
    }
}
