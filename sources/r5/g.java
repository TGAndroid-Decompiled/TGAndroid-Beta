package r5;

import android.os.Parcel;

public abstract class g extends b7.a implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 2);
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                int i11 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                M(i11);
                return true;
            case 2:
                m5.d dVar = (m5.d) com.google.android.gms.internal.cast.t.a(parcel, m5.d.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.t.b(parcel);
                L(dVar, string, string2, z10);
                return true;
            case 3:
                int i12 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                T(i12);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i13 = com.google.android.gms.internal.cast.t.f3660a;
                parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzn();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                P(string3, string4);
                return true;
            case 6:
                String string5 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.t.b(parcel);
                A0(string5, bArrCreateByteArray);
                return true;
            case 7:
                int i14 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                c(i14);
                return true;
            case 8:
                int i15 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzg(i15);
                return true;
            case 9:
                int i16 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzd(i16);
                return true;
            case 10:
                parcel.readString();
                long j10 = parcel.readLong();
                int i17 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzm(i17, j10);
                return true;
            case 11:
                parcel.readString();
                long j11 = parcel.readLong();
                com.google.android.gms.internal.cast.t.b(parcel);
                V(j11);
                return true;
            case 12:
                c cVar = (c) com.google.android.gms.internal.cast.t.a(parcel, c.CREATOR);
                com.google.android.gms.internal.cast.t.b(parcel);
                y(cVar);
                return true;
            case 13:
                d dVar2 = (d) com.google.android.gms.internal.cast.t.a(parcel, d.CREATOR);
                com.google.android.gms.internal.cast.t.b(parcel);
                D(dVar2);
                return true;
            case 14:
                int i18 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                d(i18);
                return true;
            case 15:
                int i19 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                w0(i19);
                return true;
            default:
                return false;
        }
    }
}
