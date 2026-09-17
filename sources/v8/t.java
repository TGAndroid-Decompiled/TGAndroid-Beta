package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(2);
    public final String f47780a;
    public final String f47781b;
    public final int f47782c;
    public final int d;

    public t(int i10, int i11, String str, String str2) {
        this.f47780a = str;
        this.f47781b = str2;
        this.f47782c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f47780a);
        e0.l(parcel, 3, this.f47781b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f47782c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }
}
