package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(3);
    public String f50725a;
    public String f50726b;
    public String f50727c;
    public String d;
    public String e;
    public String f50728f;
    public String h;
    public String f50729n;
    public String f50730r;
    public boolean f50731s;
    public String f50732w;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50725a);
        h0.l(parcel, 3, this.f50726b);
        h0.l(parcel, 4, this.f50727c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f50728f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.f50729n);
        h0.l(parcel, 10, this.f50730r);
        boolean z10 = this.f50731s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 12, this.f50732w);
        h0.r(parcel, q6);
    }
}
