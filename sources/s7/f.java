package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import q4.x;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(17);
    public final String f56507a;
    public final String f56508b;
    public final String f56509c;

    public f(String str, String str2, String str3) {
        this.f56507a = str;
        this.f56508b = str2;
        this.f56509c = str3;
    }

    public final String toString() {
        return p0.s(e2.n("DocumentId[packageName=", this.f56507a, ", corpusName=", this.f56508b, ", uri="), this.f56509c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f56507a);
        yb.l(parcel, 2, this.f56508b);
        yb.l(parcel, 3, this.f56509c);
        yb.s(parcel, r10);
    }
}
