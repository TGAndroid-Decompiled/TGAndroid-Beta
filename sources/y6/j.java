package y6;

import android.os.Parcel;
public final class j extends a9.a {
    public final x6.a W0(x6.b bVar, String str, int i10) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(i10);
        Parcel M0 = M0(O0, 2);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }

    public final x6.a X0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(i10);
        m7.a.c(O0, bVar2);
        Parcel M0 = M0(O0, 8);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }

    public final x6.a Y0(x6.b bVar, String str, int i10) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(i10);
        Parcel M0 = M0(O0, 4);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }

    public final x6.a Z0(x6.b bVar, String str, boolean z10, long j3) {
        Parcel O0 = O0();
        m7.a.c(O0, bVar);
        O0.writeString(str);
        O0.writeInt(z10 ? 1 : 0);
        O0.writeLong(j3);
        Parcel M0 = M0(O0, 7);
        x6.a L0 = x6.b.L0(M0.readStrongBinder());
        M0.recycle();
        return L0;
    }
}
