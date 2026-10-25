package z8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class b extends c8.b implements g0 {
    public b() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                x xVar = (x) g8.a.a(parcel, x.CREATOR);
                throw a.b(parcel);
            case 3:
                r0 r0Var = (r0) g8.a.a(parcel, r0.CREATOR);
                throw a.b(parcel);
            case 4:
                a0 a0Var = (a0) g8.a.a(parcel, a0.CREATOR);
                throw a.b(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) g8.a.a(parcel, DataHolder.CREATOR);
                throw a.b(parcel);
            case 6:
                o oVar = (o) g8.a.a(parcel, o.CREATOR);
                throw a.b(parcel);
            case 7:
                g8.a.b(parcel);
                N((u0) g8.a.a(parcel, u0.CREATOR));
                break;
            case 8:
                c0 c0Var = (c0) g8.a.a(parcel, c0.CREATOR);
                throw a.b(parcel);
            case 9:
                d0 d0Var = (d0) g8.a.a(parcel, d0.CREATOR);
                throw a.b(parcel);
            case 10:
                z zVar = (z) g8.a.a(parcel, z.CREATOR);
                throw a.b(parcel);
            case 11:
                Status status = (Status) g8.a.a(parcel, Status.CREATOR);
                g8.a.b(parcel);
                A();
                break;
            case 12:
                v0 v0Var = (v0) g8.a.a(parcel, v0.CREATOR);
                throw a.b(parcel);
            case 13:
                y yVar = (y) g8.a.a(parcel, y.CREATOR);
                throw a.b(parcel);
            case 14:
                n0 n0Var = (n0) g8.a.a(parcel, n0.CREATOR);
                throw a.b(parcel);
            case 15:
                j jVar = (j) g8.a.a(parcel, j.CREATOR);
                throw a.b(parcel);
            case 16:
                j jVar2 = (j) g8.a.a(parcel, j.CREATOR);
                throw a.b(parcel);
            case 17:
                r rVar = (r) g8.a.a(parcel, r.CREATOR);
                throw a.b(parcel);
            case 18:
                s sVar = (s) g8.a.a(parcel, s.CREATOR);
                throw a.b(parcel);
            case 19:
                h hVar = (h) g8.a.a(parcel, h.CREATOR);
                throw a.b(parcel);
            case 20:
                i iVar = (i) g8.a.a(parcel, i.CREATOR);
                throw a.b(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                q qVar = (q) g8.a.a(parcel, q.CREATOR);
                throw a.b(parcel);
            case 23:
                p pVar = (p) g8.a.a(parcel, p.CREATOR);
                throw a.b(parcel);
            case 26:
                h0 h0Var = (h0) g8.a.a(parcel, h0.CREATOR);
                throw a.b(parcel);
            case 27:
                s0 s0Var = (s0) g8.a.a(parcel, s0.CREATOR);
                throw a.b(parcel);
            case 28:
                t tVar = (t) g8.a.a(parcel, t.CREATOR);
                throw a.b(parcel);
            case 29:
                v vVar = (v) g8.a.a(parcel, v.CREATOR);
                throw a.b(parcel);
            case 30:
                u uVar = (u) g8.a.a(parcel, u.CREATOR);
                throw a.b(parcel);
            case 34:
                t0 t0Var = (t0) g8.a.a(parcel, t0.CREATOR);
                throw a.b(parcel);
            case 35:
                b0 b0Var = (b0) g8.a.a(parcel, b0.CREATOR);
                throw a.b(parcel);
            case 36:
                q0 q0Var = (q0) g8.a.a(parcel, q0.CREATOR);
                throw a.b(parcel);
            case 37:
                w wVar = (w) g8.a.a(parcel, w.CREATOR);
                throw a.b(parcel);
            case 38:
                k kVar = (k) g8.a.a(parcel, k.CREATOR);
                throw a.b(parcel);
            case 39:
                e0 e0Var = (e0) g8.a.a(parcel, e0.CREATOR);
                throw a.b(parcel);
            case 40:
                e1 e1Var = (e1) g8.a.a(parcel, e1.CREATOR);
                throw a.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void N(u0 u0Var) {
        throw new UnsupportedOperationException();
    }
}
