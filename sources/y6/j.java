package y6;

import android.os.Parcel;
public final class j extends a9.a {
    public final x6.a X0(x6.b bVar, String str, int i10) {
        Parcel P0 = P0();
        m7.a.c(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i10);
        Parcel N0 = N0(P0, 2);
        x6.a M0 = x6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final x6.a Y0(x6.b bVar, String str, int i10, x6.b bVar2) {
        Parcel P0 = P0();
        m7.a.c(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i10);
        m7.a.c(P0, bVar2);
        Parcel N0 = N0(P0, 8);
        x6.a M0 = x6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final x6.a Z0(x6.b bVar, String str, int i10) {
        Parcel P0 = P0();
        m7.a.c(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i10);
        Parcel N0 = N0(P0, 4);
        x6.a M0 = x6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final x6.a a1(x6.b bVar, String str, boolean z10, long j10) {
        Parcel P0 = P0();
        m7.a.c(P0, bVar);
        P0.writeString(str);
        P0.writeInt(z10 ? 1 : 0);
        P0.writeLong(j10);
        Parcel N0 = N0(P0, 7);
        x6.a M0 = x6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }
}
