package p5;

import android.os.Parcel;
public final class z extends c7.a {
    public final h f45649b;
    public final Class f45650c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f45649b = hVar;
        this.f45650c = c.class;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        Class cls = this.f45650c;
        h hVar = this.f45649b;
        switch (i10) {
            case 1:
                j6.b bVar = new j6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 2:
                j6.a J0 = j6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar = (f) j6.b.K0(J0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.b((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                j6.a J02 = j6.b.J0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar2 = (f) j6.b.K0(J02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.f((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                j6.a J03 = j6.b.J0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar3 = (f) j6.b.K0(J03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.j((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                j6.a J04 = j6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar4 = (f) j6.b.K0(J04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.d((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                j6.a J05 = j6.b.J0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar5 = (f) j6.b.K0(J05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.g((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                j6.a J06 = j6.b.J0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar6 = (f) j6.b.K0(J06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.a((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                j6.a J07 = j6.b.J0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.u.f4281a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar7 = (f) j6.b.K0(J07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.h((f) cls.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                j6.a J08 = j6.b.J0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar8 = (f) j6.b.K0(J08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.e((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                j6.a J09 = j6.b.J0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar9 = (f) j6.b.K0(J09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.c((f) cls.cast(fVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
