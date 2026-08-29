package z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class v extends a6.a {
    public static final Parcelable.Creator<v> CREATOR = new w5.k(18);
    public final int f50683a;
    public final IBinder f50684b;
    public final w5.a f50685c;
    public final boolean d;
    public final boolean f50686e;

    public v(int i10, IBinder iBinder, w5.a aVar, boolean z10, boolean z11) {
        this.f50683a = i10;
        this.f50684b = iBinder;
        this.f50685c = aVar;
        this.d = z10;
        this.f50686e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (this.f50685c.equals(vVar.f50685c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f50684b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i10 = a.f50583b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                aVar = (h) queryLocalInterface;
                            } else {
                                aVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                            }
                        }
                        IBinder iBinder2 = vVar.f50684b;
                        if (iBinder2 != null) {
                            int i11 = a.f50583b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new com.google.android.gms.internal.cast.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                            }
                        }
                        if (l.l(aVar, obj2)) {
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50683a);
        com.google.android.gms.internal.cast.o.f(parcel, 2, this.f50684b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f50685c, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f50686e ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
