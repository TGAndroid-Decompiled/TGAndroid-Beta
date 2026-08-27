package y5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

public final class b0 extends b7.a {

    public g f49602b;

    public final int f49603c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 11);
        this.f49602b = gVar;
        this.f49603c = i10;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) x6.a.a(parcel, Bundle.CREATOR);
            x6.a.b(parcel);
            l.i(this.f49602b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f49602b.B(i11, strongBinder, bundle, this.f49603c);
            this.f49602b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            x6.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) x6.a.a(parcel, f0.CREATOR);
            x6.a.b(parcel);
            g gVar = this.f49602b;
            l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            l.h(f0Var);
            gVar.M = f0Var;
            if (gVar.C()) {
                e eVar = f0Var.d;
                m mVarA = m.a();
                n nVar = eVar == null ? null : eVar.f49610a;
                synchronized (mVarA) {
                    try {
                        if (nVar == null) {
                            nVar = m.f49672c;
                        } else {
                            n nVar2 = (n) mVarA.f49673a;
                            if (nVar2 == null || nVar2.f49674a < nVar.f49674a) {
                            }
                        }
                        mVarA.f49673a = nVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = f0Var.f49627a;
            l.i(this.f49602b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f49602b.B(i12, strongBinder2, bundle2, this.f49603c);
            this.f49602b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
