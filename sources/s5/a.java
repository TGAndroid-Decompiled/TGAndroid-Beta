package s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import j7.g5;
import r5.c0;
public final class a extends c6.a {
    public final String f47042a;
    public final String f47043b;
    public final k f47044c;
    public final f d;
    public final boolean f47045e;
    public final boolean f47046f;
    public static final u5.b h = new u5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new c0(1);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z4, boolean z10) {
        k aVar;
        this.f47042a = str;
        this.f47043b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new a7.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
            }
        }
        this.f47044c = aVar;
        this.d = fVar;
        this.f47045e = z4;
        this.f47046f = z10;
    }

    public final void e() {
        k kVar = this.f47044c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                l6.a J0 = l6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (l6.b.K0(J0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e6) {
                h.a(e6, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f47042a);
        g5.l(parcel, 3, this.f47043b);
        k kVar = this.f47044c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f135b;
        }
        g5.f(parcel, 4, iBinder);
        g5.k(parcel, 5, this.d, i10);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f47045e ? 1 : 0);
        g5.s(parcel, 7, 4);
        parcel.writeInt(this.f47046f ? 1 : 0);
        g5.r(parcel, q10);
    }
}
