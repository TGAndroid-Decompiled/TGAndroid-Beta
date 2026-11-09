package q6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new q4.x(6);
    public final int f53961a;
    public final IBinder f53962b;
    public final n6.a f53963c;
    public final boolean d;
    public final boolean f53964e;

    public x(int i7, IBinder iBinder, n6.a aVar, boolean z9, boolean z10) {
        this.f53961a = i7;
        this.f53962b = iBinder;
        this.f53963c = aVar;
        this.d = z9;
        this.f53964e = z10;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (this.f53963c.equals(xVar.f53963c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f53962b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i7 = a.f53845b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i) {
                                aVar = (i) queryLocalInterface;
                            } else {
                                aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                            }
                        }
                        IBinder iBinder2 = xVar.f53962b;
                        if (iBinder2 != null) {
                            int i10 = a.f53845b;
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
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53961a);
        xb.f(parcel, 2, this.f53962b);
        xb.k(parcel, 3, this.f53963c, i7);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53964e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
