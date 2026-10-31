package y8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class a extends b8.b implements d0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override
    public void E() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                u uVar = (u) f8.a.a(parcel, u.CREATOR);
                throw sc.e.j(parcel);
            case 3:
                o0 o0Var = (o0) f8.a.a(parcel, o0.CREATOR);
                throw sc.e.j(parcel);
            case 4:
                x xVar = (x) f8.a.a(parcel, x.CREATOR);
                throw sc.e.j(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) f8.a.a(parcel, DataHolder.CREATOR);
                throw sc.e.j(parcel);
            case 6:
                l lVar = (l) f8.a.a(parcel, l.CREATOR);
                throw sc.e.j(parcel);
            case 7:
                f8.a.b(parcel);
                s0((r0) f8.a.a(parcel, r0.CREATOR));
                break;
            case 8:
                z zVar = (z) f8.a.a(parcel, z.CREATOR);
                throw sc.e.j(parcel);
            case 9:
                a0 a0Var = (a0) f8.a.a(parcel, a0.CREATOR);
                throw sc.e.j(parcel);
            case 10:
                w wVar = (w) f8.a.a(parcel, w.CREATOR);
                throw sc.e.j(parcel);
            case 11:
                Status status = (Status) f8.a.a(parcel, Status.CREATOR);
                f8.a.b(parcel);
                E();
                break;
            case 12:
                s0 s0Var = (s0) f8.a.a(parcel, s0.CREATOR);
                throw sc.e.j(parcel);
            case 13:
                v vVar = (v) f8.a.a(parcel, v.CREATOR);
                throw sc.e.j(parcel);
            case 14:
                k0 k0Var = (k0) f8.a.a(parcel, k0.CREATOR);
                throw sc.e.j(parcel);
            case 15:
                i iVar = (i) f8.a.a(parcel, i.CREATOR);
                throw sc.e.j(parcel);
            case 16:
                i iVar2 = (i) f8.a.a(parcel, i.CREATOR);
                throw sc.e.j(parcel);
            case 17:
                o oVar = (o) f8.a.a(parcel, o.CREATOR);
                throw sc.e.j(parcel);
            case 18:
                p pVar = (p) f8.a.a(parcel, p.CREATOR);
                throw sc.e.j(parcel);
            case 19:
                g gVar = (g) f8.a.a(parcel, g.CREATOR);
                throw sc.e.j(parcel);
            case 20:
                h hVar = (h) f8.a.a(parcel, h.CREATOR);
                throw sc.e.j(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                n nVar = (n) f8.a.a(parcel, n.CREATOR);
                throw sc.e.j(parcel);
            case 23:
                m mVar = (m) f8.a.a(parcel, m.CREATOR);
                throw sc.e.j(parcel);
            case 26:
                e0 e0Var = (e0) f8.a.a(parcel, e0.CREATOR);
                throw sc.e.j(parcel);
            case 27:
                p0 p0Var = (p0) f8.a.a(parcel, p0.CREATOR);
                throw sc.e.j(parcel);
            case 28:
                q qVar = (q) f8.a.a(parcel, q.CREATOR);
                throw sc.e.j(parcel);
            case 29:
                s sVar = (s) f8.a.a(parcel, s.CREATOR);
                throw sc.e.j(parcel);
            case 30:
                r rVar = (r) f8.a.a(parcel, r.CREATOR);
                throw sc.e.j(parcel);
            case 34:
                q0 q0Var = (q0) f8.a.a(parcel, q0.CREATOR);
                throw sc.e.j(parcel);
            case 35:
                y yVar = (y) f8.a.a(parcel, y.CREATOR);
                throw sc.e.j(parcel);
            case 36:
                n0 n0Var = (n0) f8.a.a(parcel, n0.CREATOR);
                throw sc.e.j(parcel);
            case 37:
                t tVar = (t) f8.a.a(parcel, t.CREATOR);
                throw sc.e.j(parcel);
            case 38:
                j jVar = (j) f8.a.a(parcel, j.CREATOR);
                throw sc.e.j(parcel);
            case 39:
                b0 b0Var = (b0) f8.a.a(parcel, b0.CREATOR);
                throw sc.e.j(parcel);
            case 40:
                b1 b1Var = (b1) f8.a.a(parcel, b1.CREATOR);
                throw sc.e.j(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void s0(r0 r0Var) {
        throw new UnsupportedOperationException();
    }
}
