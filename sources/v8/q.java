package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(3);
    public String f50739a;
    public String f50740b;
    public String f50741c;
    public String d;
    public String e;
    public String f50742f;
    public String h;
    public String f50743n;
    public String f50744r;
    public boolean f50745s;
    public String f50746w;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50739a);
        h0.l(parcel, 3, this.f50740b);
        h0.l(parcel, 4, this.f50741c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f50742f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.f50743n);
        h0.l(parcel, 10, this.f50744r);
        boolean z10 = this.f50745s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 12, this.f50746w);
        h0.r(parcel, q6);
    }
}
