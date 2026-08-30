package r5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final u5.b f43368c = new u5.b("SessionManager", null);
    public final y f43369a;
    public final Context f43370b;

    public g(y yVar, Context context) {
        this.f43369a = yVar;
        this.f43370b = context;
    }

    public final void a(h hVar) {
        b6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f43369a;
            z zVar = new z(hVar);
            Parcel M0 = yVar.M0();
            com.google.android.gms.internal.cast.t.d(M0, zVar);
            yVar.Q0(M0, 2);
        } catch (RemoteException e) {
            f43368c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z4) {
        u5.b bVar = f43368c;
        b6.m.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f45098a, bVar.d("End session for %s", this.f43370b.getPackageName()));
            y yVar = this.f43369a;
            Parcel M0 = yVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.f3163a;
            M0.writeInt(1);
            M0.writeInt(z4 ? 1 : 0);
            yVar.Q0(M0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        b6.m.e("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        b6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f43369a;
            Parcel O0 = yVar.O0(yVar.M0(), 1);
            l6.a J0 = l6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (f) l6.b.K0(J0);
        } catch (RemoteException e) {
            f43368c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
