package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j3.r0;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new w7.i(19);
    public final String f50314a;
    public final String f50315b;
    public final String f50316c;

    public f(String str, String str2, String str3) {
        this.f50314a = str;
        this.f50315b = str2;
        this.f50316c = str3;
    }

    public final String toString() {
        return aa.d.r(r0.q("DocumentId[packageName=", this.f50314a, ", corpusName=", this.f50315b, ", uri="), this.f50316c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f50314a);
        p8.l(parcel, 2, this.f50315b);
        p8.l(parcel, 3, this.f50316c);
        p8.r(parcel, q10);
    }
}
