package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(9);
    public final String f50496a;
    public final byte[] f50497b;
    public final int f50498c;

    public a(String str, byte[] bArr, int i10) {
        this.f50496a = str;
        this.f50497b = bArr;
        this.f50498c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f50496a);
        o.c(parcel, 3, this.f50497b);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.f50498c);
        o.r(parcel, q6);
    }
}
