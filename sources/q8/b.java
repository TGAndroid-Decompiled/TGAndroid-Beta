package q8;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class b implements ServiceConnection {
    public p8.c f43022a;
    public final c f43023b;

    public b(c cVar) {
        this.f43023b = cVar;
    }

    public static boolean a(b bVar) {
        if (bVar.f43022a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z4;
        p8.c cVar = this.f43022a;
        if (cVar != null) {
            p8.a aVar = (p8.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = u2.a.f45049a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel E0 = aVar.E0(obtain, 1);
            if (E0.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            E0.recycle();
            if (z4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z4;
        p8.c aVar;
        z4 = this.f43023b.dbg;
        if (z4) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = p8.b.f41082a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof p8.c) {
                aVar = (p8.c) queryLocalInterface;
            } else {
                aVar = new p8.a(iBinder);
            }
        }
        this.f43022a = aVar;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z4;
        this.f43022a = null;
        z4 = this.f43023b.dbg;
        if (z4) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
