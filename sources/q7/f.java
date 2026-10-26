package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(25);
    public final String f46987a;
    public final String f46988b;
    public final String f46989c;

    public f(String str, String str2, String str3) {
        this.f46987a = str;
        this.f46988b = str2;
        this.f46989c = str3;
    }

    public final String toString() {
        return a1.g.s(a1.g.w("DocumentId[packageName=", this.f46987a, ", corpusName=", this.f46988b, ", uri="), this.f46989c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f46987a);
        df.l(parcel, 2, this.f46988b);
        df.l(parcel, 3, this.f46989c);
        df.r(parcel, q5);
    }
}
