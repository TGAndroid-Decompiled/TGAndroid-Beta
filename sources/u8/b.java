package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f58594a;
    public int f58595b;
    public int f58596c;
    public int d;
    public int f58597e;
    public int f58598f;
    public boolean h;
    public String f58599n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f58594a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58595b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58596c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f58597e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f58598f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 9, this.f58599n);
        cc.s(parcel, r10);
    }
}
