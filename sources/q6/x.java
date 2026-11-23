package q6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new q4.x(6);
    public final int f56016a;
    public final IBinder f56017b;
    public final n6.a f56018c;
    public final boolean d;
    public final boolean f56019e;

    public x(int i7, IBinder iBinder, n6.a aVar, boolean z10, boolean z11) {
        this.f56016a = i7;
        this.f56017b = iBinder;
        this.f56018c = aVar;
        this.d = z10;
        this.f56019e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (this.f56018c.equals(xVar.f56018c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f56017b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i7 = a.f55900b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                        }
                        IBinder iBinder2 = xVar.f56017b;
                        if (iBinder2 != null) {
                            int i10 = a.f55900b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof i) {
                                obj2 = (i) queryLocalInterface2;
                            } else {
                                obj2 = new a8.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                        }
                        if (m.l(aVar, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56016a);
        bc.f(parcel, 2, this.f56017b);
        bc.k(parcel, 3, this.f56018c, i7);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f56019e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
