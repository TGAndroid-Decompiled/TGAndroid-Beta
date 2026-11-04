package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new n8.g(21);
    public final int f53325a;
    public final IBinder f53326b;
    public final m6.a f53327c;
    public final boolean d;
    public final boolean f53328e;

    public x(int i3, IBinder iBinder, m6.a aVar, boolean z10, boolean z11) {
        this.f53325a = i3;
        this.f53326b = iBinder;
        this.f53327c = aVar;
        this.d = z10;
        this.f53328e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (this.f53327c.equals(xVar.f53327c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f53326b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i3 = a.f53209b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new b8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                            }
                        }
                        IBinder iBinder2 = xVar.f53326b;
                        if (iBinder2 != null) {
                            int i10 = a.f53209b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof i) {
                                obj2 = (i) queryLocalInterface2;
                            } else {
                                obj2 = new b8.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 8);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53325a);
        j8.a.g(parcel, 2, this.f53326b);
        j8.a.l(parcel, 3, this.f53327c, i3);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f53328e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
