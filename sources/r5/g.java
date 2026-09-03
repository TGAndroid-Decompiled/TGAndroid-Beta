package r5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final u5.b f43392c = new u5.b("SessionManager", null);
    public final y f43393a;
    public final Context f43394b;

    public g(y yVar, Context context) {
        this.f43393a = yVar;
        this.f43394b = context;
    }

    public final void a(h hVar) {
        b6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f43393a;
            z zVar = new z(hVar);
            Parcel M0 = yVar.M0();
            com.google.android.gms.internal.cast.t.d(M0, zVar);
            yVar.Q0(M0, 2);
        } catch (RemoteException e) {
            f43392c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z4) {
        u5.b bVar = f43392c;
        b6.m.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f45160a, bVar.d("End session for %s", this.f43394b.getPackageName()));
            y yVar = this.f43393a;
            Parcel M0 = yVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.f3146a;
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
            y yVar = this.f43393a;
            Parcel O0 = yVar.O0(yVar.M0(), 1);
            l6.a J0 = l6.b.J0(O0.readStrongBinder());
            O0.recycle();
            return (f) l6.b.K0(J0);
        } catch (RemoteException e) {
            f43392c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
