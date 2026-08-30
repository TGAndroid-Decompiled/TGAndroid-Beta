package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(4);
    public final String f44058a;
    public final int f44059b;
    public final String f44060c;

    public d(String str, int i10, String str2) {
        this.f44058a = str;
        this.f44059b = i10;
        this.f44060c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f44058a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f44059b);
        f5.l(parcel, 4, this.f44060c);
        f5.r(parcel, q10);
    }
}
