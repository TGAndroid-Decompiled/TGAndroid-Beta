package q6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new q4.x(6);
    public final int f53831a;
    public final IBinder f53832b;
    public final n6.a f53833c;
    public final boolean d;
    public final boolean f53834e;

    public x(int i7, IBinder iBinder, n6.a aVar, boolean z9, boolean z10) {
        this.f53831a = i7;
        this.f53832b = iBinder;
        this.f53833c = aVar;
        this.d = z9;
        this.f53834e = z10;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (this.f53833c.equals(xVar.f53833c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f53832b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i7 = a.f53715b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                        }
                        IBinder iBinder2 = xVar.f53832b;
                        if (iBinder2 != null) {
                            int i10 = a.f53715b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof i) {
                                obj2 = (i) queryLocalInterface2;
                            } else {
                                obj2 = new a8.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                        }
                        if (m.k(aVar, obj2)) {
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
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53831a);
        wb.f(parcel, 2, this.f53832b);
        wb.k(parcel, 3, this.f53833c, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f53834e ? 1 : 0);
        wb.s(parcel, r10);
    }
}
