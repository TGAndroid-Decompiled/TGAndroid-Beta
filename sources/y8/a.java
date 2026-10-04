package y8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class a extends b8.b implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override
    public void D() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                w wVar = (w) f8.a.a(parcel, w.CREATOR);
                throw t8.b.k(parcel);
            case 3:
                q0 q0Var = (q0) f8.a.a(parcel, q0.CREATOR);
                throw t8.b.k(parcel);
            case 4:
                z zVar = (z) f8.a.a(parcel, z.CREATOR);
                throw t8.b.k(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) f8.a.a(parcel, DataHolder.CREATOR);
                throw t8.b.k(parcel);
            case 6:
                n nVar = (n) f8.a.a(parcel, n.CREATOR);
                throw t8.b.k(parcel);
            case 7:
                f8.a.b(parcel);
                q0((t0) f8.a.a(parcel, t0.CREATOR));
                break;
            case 8:
                b0 b0Var = (b0) f8.a.a(parcel, b0.CREATOR);
                throw t8.b.k(parcel);
            case 9:
                c0 c0Var = (c0) f8.a.a(parcel, c0.CREATOR);
                throw t8.b.k(parcel);
            case 10:
                y yVar = (y) f8.a.a(parcel, y.CREATOR);
                throw t8.b.k(parcel);
            case 11:
                Status status = (Status) f8.a.a(parcel, Status.CREATOR);
                f8.a.b(parcel);
                D();
                break;
            case 12:
                u0 u0Var = (u0) f8.a.a(parcel, u0.CREATOR);
                throw t8.b.k(parcel);
            case 13:
                x xVar = (x) f8.a.a(parcel, x.CREATOR);
                throw t8.b.k(parcel);
            case 14:
                m0 m0Var = (m0) f8.a.a(parcel, m0.CREATOR);
                throw t8.b.k(parcel);
            case 15:
                i iVar = (i) f8.a.a(parcel, i.CREATOR);
                throw t8.b.k(parcel);
            case 16:
                i iVar2 = (i) f8.a.a(parcel, i.CREATOR);
                throw t8.b.k(parcel);
            case 17:
                q qVar = (q) f8.a.a(parcel, q.CREATOR);
                throw t8.b.k(parcel);
            case 18:
                r rVar = (r) f8.a.a(parcel, r.CREATOR);
                throw t8.b.k(parcel);
            case 19:
                g gVar = (g) f8.a.a(parcel, g.CREATOR);
                throw t8.b.k(parcel);
            case 20:
                h hVar = (h) f8.a.a(parcel, h.CREATOR);
                throw t8.b.k(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                p pVar = (p) f8.a.a(parcel, p.CREATOR);
                throw t8.b.k(parcel);
            case 23:
                o oVar = (o) f8.a.a(parcel, o.CREATOR);
                throw t8.b.k(parcel);
            case 26:
                g0 g0Var = (g0) f8.a.a(parcel, g0.CREATOR);
                throw t8.b.k(parcel);
            case 27:
                r0 r0Var = (r0) f8.a.a(parcel, r0.CREATOR);
                throw t8.b.k(parcel);
            case 28:
                s sVar = (s) f8.a.a(parcel, s.CREATOR);
                throw t8.b.k(parcel);
            case 29:
                u uVar = (u) f8.a.a(parcel, u.CREATOR);
                throw t8.b.k(parcel);
            case 30:
                t tVar = (t) f8.a.a(parcel, t.CREATOR);
                throw t8.b.k(parcel);
            case 34:
                s0 s0Var = (s0) f8.a.a(parcel, s0.CREATOR);
                throw t8.b.k(parcel);
            case 35:
                a0 a0Var = (a0) f8.a.a(parcel, a0.CREATOR);
                throw t8.b.k(parcel);
            case 36:
                p0 p0Var = (p0) f8.a.a(parcel, p0.CREATOR);
                throw t8.b.k(parcel);
            case 37:
                v vVar = (v) f8.a.a(parcel, v.CREATOR);
                throw t8.b.k(parcel);
            case 38:
                j jVar = (j) f8.a.a(parcel, j.CREATOR);
                throw t8.b.k(parcel);
            case 39:
                d0 d0Var = (d0) f8.a.a(parcel, d0.CREATOR);
                throw t8.b.k(parcel);
            case 40:
                d1 d1Var = (d1) f8.a.a(parcel, d1.CREATOR);
                throw t8.b.k(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void q0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
