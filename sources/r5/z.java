package r5;

import android.os.Parcel;
public final class z extends a7.c {
    public final h f46729b;
    public final Class f46730c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f46729b = hVar;
        this.f46730c = c.class;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z4 = false;
        Class cls = this.f46730c;
        h hVar = this.f46729b;
        switch (i10) {
            case 1:
                l6.b bVar = new l6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.s.d(parcel2, bVar);
                return true;
            case 2:
                l6.a J0 = l6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar = (f) l6.b.K0(J0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.j((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                l6.a J02 = l6.b.J0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar2 = (f) l6.b.K0(J02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.f((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                l6.a J03 = l6.b.J0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar3 = (f) l6.b.K0(J03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.i((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                l6.a J04 = l6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar4 = (f) l6.b.K0(J04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.m((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                l6.a J05 = l6.b.J0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar5 = (f) l6.b.K0(J05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.o((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                l6.a J06 = l6.b.J0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar6 = (f) l6.b.K0(J06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.k((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                l6.a J07 = l6.b.J0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.s.f3120a;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar7 = (f) l6.b.K0(J07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.g((f) cls.cast(fVar7), z4);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                l6.a J08 = l6.b.J0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar8 = (f) l6.b.K0(J08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.e((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                l6.a J09 = l6.b.J0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.s.b(parcel);
                f fVar9 = (f) l6.b.K0(J09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.h((f) cls.cast(fVar9), readInt4);
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
