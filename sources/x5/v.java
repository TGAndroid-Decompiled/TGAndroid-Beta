package x5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class v extends y5.a {
    public static final Parcelable.Creator<v> CREATOR = new w7.i(6);
    public final int f48983a;
    public final IBinder f48984b;
    public final u5.a f48985c;
    public final boolean d;
    public final boolean f48986e;

    public v(int i9, IBinder iBinder, u5.a aVar, boolean z10, boolean z11) {
        this.f48983a = i9;
        this.f48984b = iBinder;
        this.f48985c = aVar;
        this.d = z10;
        this.f48986e = z11;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (this.f48985c.equals(vVar.f48985c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f48984b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i9 = a.f48883b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                aVar = (h) queryLocalInterface;
                            } else {
                                aVar = new b7.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                            }
                        }
                        IBinder iBinder2 = vVar.f48984b;
                        if (iBinder2 != null) {
                            int i10 = a.f48883b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new b7.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 11);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48983a);
        p8.f(parcel, 2, this.f48984b);
        p8.k(parcel, 3, this.f48985c, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f48986e ? 1 : 0);
        p8.r(parcel, q10);
    }
}
