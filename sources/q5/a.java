package q5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o6.w0;
public final class a extends a6.a {
    public final String f46357a;
    public final String f46358b;
    public final k f46359c;
    public final f d;
    public final boolean f46360e;
    public final boolean f46361f;
    public static final s5.b h = new s5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new w0(10);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k aVar;
        this.f46357a = str;
        this.f46358b = str2;
        if (iBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof k) {
                aVar = (k) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 0);
            }
        }
        this.f46359c = aVar;
        this.d = fVar;
        this.f46360e = z10;
        this.f46361f = z11;
    }

    public final void b() {
        k kVar = this.f46359c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                j6.a J0 = j6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (j6.b.K0(J0) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f46357a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f46358b);
        k kVar = this.f46359c;
        if (kVar == null) {
            iBinder = null;
        } else {
            iBinder = kVar.f3996b;
        }
        com.google.android.gms.internal.cast.o.f(parcel, 4, iBinder);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.f46360e ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(this.f46361f ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
