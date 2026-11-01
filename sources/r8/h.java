package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.n(13);
    public String f46407a;
    public String f46408b;
    public String f46409c;
    public String d;
    public String e;
    public String f46410f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46407a);
        h0.l(parcel, 3, this.f46408b);
        h0.l(parcel, 4, this.f46409c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f46410f);
        h0.l(parcel, 8, this.h);
        h0.r(parcel, q6);
    }
}
