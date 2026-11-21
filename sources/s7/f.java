package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import q4.x;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(17);
    public final String f57122a;
    public final String f57123b;
    public final String f57124c;

    public f(String str, String str2, String str3) {
        this.f57122a = str;
        this.f57123b = str2;
        this.f57124c = str3;
    }

    public final String toString() {
        return p0.s(e2.n("DocumentId[packageName=", this.f57122a, ", corpusName=", this.f57123b, ", uri="), this.f57124c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57122a);
        bc.l(parcel, 2, this.f57123b);
        bc.l(parcel, 3, this.f57124c);
        bc.s(parcel, r10);
    }
}
