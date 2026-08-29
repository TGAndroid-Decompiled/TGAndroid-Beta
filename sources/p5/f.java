package p5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final s5.b f45635b = new s5.b("Session", null);
    public final x f45636a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.e.b(context).W0(str, str2, new j(this));
        } catch (RemoteException | d e10) {
            com.google.android.gms.internal.cast.e.f4087a.a(e10, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            xVar = null;
        }
        this.f45636a = xVar;
    }

    public final String a() {
        z5.l.e("Must be called from the main thread.");
        x xVar = this.f45636a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 3);
                String readString = O0.readString();
                O0.recycle();
                return readString;
            } catch (RemoteException e10) {
                f45635b.a(e10, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z10;
        z5.l.e("Must be called from the main thread.");
        x xVar = this.f45636a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 5);
                int i10 = com.google.android.gms.internal.cast.u.f4281a;
                if (O0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O0.recycle();
                return z10;
            } catch (RemoteException e10) {
                f45635b.a(e10, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        z5.l.e("Must be called from the main thread.");
        x xVar = this.f45636a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 6);
                int i10 = com.google.android.gms.internal.cast.u.f4281a;
                if (O0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O0.recycle();
                return z10;
            } catch (RemoteException e10) {
                f45635b.a(e10, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        x xVar = this.f45636a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel M0 = vVar.M0();
            M0.writeInt(i10);
            vVar.Q0(M0, 13);
        } catch (RemoteException e10) {
            f45635b.a(e10, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        z5.l.e("Must be called from the main thread.");
        x xVar = this.f45636a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 17);
                int readInt = O0.readInt();
                O0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel O02 = vVar2.O0(vVar2.M0(), 18);
                    int readInt2 = O02.readInt();
                    O02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e10) {
                f45635b.a(e10, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final j6.a f() {
        x xVar = this.f45636a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 1);
                j6.a J0 = j6.b.J0(O0.readStrongBinder());
                O0.recycle();
                return J0;
            } catch (RemoteException e10) {
                f45635b.a(e10, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
