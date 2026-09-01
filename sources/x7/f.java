package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import g7.i;
import org.telegram.ui.Components.ai;
public final class f {
    public final g7.a f50450a;

    public f(g7.a aVar) {
        m.h(aVar);
        this.f50450a = aVar;
    }

    public final void a(ai aiVar) {
        try {
            i iVar = (i) this.f50450a;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, (l6.a) aiVar.f25265b);
            iVar.Q0(M0, 18);
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final boolean equals(Object obj) {
        boolean z4 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            g7.a aVar = this.f50450a;
            g7.a aVar2 = ((f) obj).f50450a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            if (L0.readInt() != 0) {
                z4 = true;
            }
            L0.recycle();
            return z4;
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.f50450a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }
}
