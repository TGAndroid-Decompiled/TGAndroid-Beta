package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(17);
    public final String f54952a;
    public final String f54953b;
    public final String f54954c;

    public f(String str, String str2, String str3) {
        this.f54952a = str;
        this.f54953b = str2;
        this.f54954c = str3;
    }

    public final String toString() {
        return p0.s(com.google.android.recaptcha.internal.a.n("DocumentId[packageName=", this.f54952a, ", corpusName=", this.f54953b, ", uri="), this.f54954c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54952a);
        xb.l(parcel, 2, this.f54953b);
        xb.l(parcel, 3, this.f54954c);
        xb.s(parcel, r10);
    }
}
