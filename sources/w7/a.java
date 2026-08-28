package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(27);
    public final String f48766a;
    public final byte[] f48767b;
    public final int f48768c;

    public a(String str, byte[] bArr, int i9) {
        this.f48766a = str;
        this.f48767b = bArr;
        this.f48768c = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f48766a);
        p8.c(parcel, 3, this.f48767b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f48768c);
        p8.r(parcel, q10);
    }
}
