package z5;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new w5.k(16);
    public final int f50636a;
    public final int f50637b;
    public final int f50638c;
    public final long d;
    public final long f50639e;
    public final String f50640f;
    public final String h;
    public final int f50641n;
    public final int f50642r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f50636a = i10;
        this.f50637b = i11;
        this.f50638c = i12;
        this.d = j10;
        this.f50639e = j11;
        this.f50640f = str;
        this.h = str2;
        this.f50641n = i13;
        this.f50642r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50636a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f50637b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f50638c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(this.f50639e);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f50640f);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.h);
        com.google.android.gms.internal.cast.o.s(parcel, 8, 4);
        parcel.writeInt(this.f50641n);
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(this.f50642r);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
