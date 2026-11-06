package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(17);
    public final String f54848a;
    public final String f54849b;
    public final String f54850c;

    public f(String str, String str2, String str3) {
        this.f54848a = str;
        this.f54849b = str2;
        this.f54850c = str3;
    }

    public final String toString() {
        return p0.s(com.google.android.recaptcha.internal.a.n("DocumentId[packageName=", this.f54848a, ", corpusName=", this.f54849b, ", uri="), this.f54850c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f54848a);
        wb.l(parcel, 2, this.f54849b);
        wb.l(parcel, 3, this.f54850c);
        wb.s(parcel, r10);
    }
}
