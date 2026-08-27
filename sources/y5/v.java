package y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class v extends z5.a {
    public static final Parcelable.Creator<v> CREATOR = new w7.f(14);

    public final int f49700a;

    public final IBinder f49701b;

    public final v5.a f49702c;
    public final boolean d;

    public final boolean f49703e;

    public v(int i10, IBinder iBinder, v5.a aVar, boolean z10, boolean z11) {
        this.f49700a = i10;
        this.f49701b = iBinder;
        this.f49702c = aVar;
        this.d = z10;
        this.f49703e = z11;
    }

    public final boolean equals(Object obj) {
        Object l0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f49702c.equals(vVar.f49702c)) {
            return false;
        }
        Object l0Var2 = null;
        IBinder iBinder = this.f49701b;
        if (iBinder == null) {
            l0Var = null;
        } else {
            int i10 = a.f49600b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        IBinder iBinder2 = vVar.f49701b;
        if (iBinder2 != null) {
            int i11 = a.f49600b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var2 = iInterfaceQueryLocalInterface2 instanceof h ? (h) iInterfaceQueryLocalInterface2 : new l0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        return l.l(l0Var, l0Var2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49700a);
        r8.f(parcel, 2, this.f49701b);
        r8.k(parcel, 3, this.f49702c, i10);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f49703e ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
