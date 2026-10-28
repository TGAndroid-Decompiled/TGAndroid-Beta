package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(25);
    public final String f47022a;
    public final String f47023b;
    public final String f47024c;

    public f(String str, String str2, String str3) {
        this.f47022a = str;
        this.f47023b = str2;
        this.f47024c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f47022a, ", corpusName=", this.f47023b, ", uri="), this.f47024c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f47022a);
        df.l(parcel, 2, this.f47023b);
        df.l(parcel, 3, this.f47024c);
        df.r(parcel, q5);
    }
}
