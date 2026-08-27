package x7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w7.f(5);

    public final String f49366a;

    public final byte[] f49367b;

    public final int f49368c;

    public a(String str, byte[] bArr, int i10) {
        this.f49366a = str;
        this.f49367b = bArr;
        this.f49368c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f49366a);
        r8.c(parcel, 3, this.f49367b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f49368c);
        r8.r(parcel, iQ);
    }
}
