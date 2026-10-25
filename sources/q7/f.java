package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(25);
    public final String f46984a;
    public final String f46985b;
    public final String f46986c;

    public f(String str, String str2, String str3) {
        this.f46984a = str;
        this.f46985b = str2;
        this.f46986c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f46984a, ", corpusName=", this.f46985b, ", uri="), this.f46986c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f46984a);
        df.l(parcel, 2, this.f46985b);
        df.l(parcel, 3, this.f46986c);
        df.r(parcel, q5);
    }
}
