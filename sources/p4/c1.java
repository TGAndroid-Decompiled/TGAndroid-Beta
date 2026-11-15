package p4;

import a8.xa;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import c8.bb;
import c8.hb;
import e2.p1;
import e2.q1;
import e2.s1;
import h9.g2;
import h9.r1;
import h9.x1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.ka;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.hn0;
public final class c1 extends Binder implements m {
    public final WeakReference f54600a;
    public final ab.c0 f54601b;
    public final Set f54602c;
    public r1 d;
    public x1 f54603e;
    public int f54604f;
    public b1 f54605i;

    public c1(d0 d0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f54600a = new WeakReference(d0Var);
        this.f54601b = new ab.c0(d0Var);
        this.f54602c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = r1.f13737r;
        this.f54603e = x1.h;
    }

    public static m9.y k1(d0 d0Var, v vVar, int i7, a1 a1Var, h2.j jVar) {
        if (d0Var.j()) {
            return m9.w.f20596b;
        }
        m9.y yVar = (m9.y) a1Var.k(d0Var, vVar, i7);
        ?? obj = new Object();
        yVar.b(new hn0(d0Var, (Object) obj, jVar, yVar, 27), m9.r.f20591a);
        return obj;
    }

    public static void r1(d0 d0Var, v vVar, int i7, m1 m1Var) {
        try {
            u uVar = vVar.d;
            uVar.getClass();
            uVar.f(i7, m1Var);
            d0Var.f54620c.a(true, true);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionStub", "Failed to send result to controller " + vVar, e10);
        }
    }

    public static org.telegram.ui.ActionBar.z s1(h2.j jVar) {
        return new org.telegram.ui.ActionBar.z(new org.telegram.ui.ActionBar.z(jVar, 15), 14);
    }

    public final e1 A1(e1 e1Var) {
        r1 r1Var;
        h9.i0 i0Var = e1Var.F.f10383a;
        ?? xaVar = new xa(4, 10);
        xa xaVar2 = new xa(4, 10);
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            e2.m1 m1Var = ((e2.r1) i0Var.get(i7)).f10375b;
            String str = (String) this.d.get(m1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.f54604f;
                this.f54604f = i10 + 1;
                String str2 = h2.l0.f13471a;
                sb2.append(Integer.toString(i10, 36));
                sb2.append("-");
                sb2.append(m1Var.f10210b);
                str = sb2.toString();
            }
            xaVar.F(m1Var, str);
            xaVar2.u(m1Var.f10210b, str);
        }
        if (xaVar.f713b == 0) {
            r1Var = r1.f13737r;
        } else {
            r1Var = new r1(xaVar.f713b, (Object[]) xaVar.f714c);
        }
        this.d = r1Var;
        this.f54603e = xaVar2.c(false);
        h9.f0 p10 = h9.i0.p();
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            e2.r1 r1Var2 = (e2.r1) i0Var.get(i11);
            p10.c(new e2.r1(B1(r1Var2.f10375b), r1Var2.f10376c, r1Var2.d, r1Var2.f10377e));
        }
        e1 a10 = e1Var.a(new s1(p10.f()));
        q1 q1Var = a10.G;
        if (q1Var.H.isEmpty()) {
            return a10;
        }
        p1 c10 = q1Var.a().c();
        g2 it = q1Var.H.values().iterator();
        while (it.hasNext()) {
            e2.n1 n1Var = (e2.n1) it.next();
            c10.a(new e2.n1(B1(n1Var.f10237a), n1Var.f10238b));
        }
        return a10.d(c10.b());
    }

    public final e2.m1 B1(e2.m1 m1Var) {
        String str;
        String str2 = (String) this.d.get(m1Var);
        if (str2 == null) {
            str2 = m1Var.f10210b;
        }
        int i7 = 0;
        while (true) {
            int i10 = m1Var.f10209a;
            e2.u[] uVarArr = m1Var.d;
            if (i7 < i10) {
                if (uVarArr[i7].f10445m != null) {
                    e2.u[] uVarArr2 = new e2.u[i10];
                    for (int i11 = 0; i11 < m1Var.f10209a; i11++) {
                        e2.u uVar = uVarArr[i11];
                        String str3 = uVar.f10445m;
                        if (str3 != null) {
                            str = (String) this.f54603e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            e2.t a10 = uVar.a();
                            a10.f10393l = str;
                            uVarArr2[i11] = new e2.u(a10);
                        } else {
                            uVarArr2[i11] = uVar;
                        }
                    }
                    return new e2.m1(str2, uVarArr2);
                }
                i7++;
            } else {
                return new e2.m1(str2, uVarArr);
            }
        }
    }

    public final void h1(l lVar, Bundle bundle) {
        WeakReference weakReference = this.f54600a;
        d0 d0Var = (d0) weakReference.get();
        if (lVar != null && bundle != null && d0Var != null) {
            try {
                Context context = d0Var.f54622f;
                i a10 = i.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a10.f54717c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    h2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    hb.a(lVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a10.d;
                }
                try {
                    q4.r rVar = new q4.r(str, callingPid, callingUid);
                    boolean b10 = q4.u.a(context).b(rVar);
                    int i7 = a10.f54715a;
                    int i10 = a10.f54716b;
                    v vVar = new v(rVar, i7, i10, b10, new x0(lVar, i10), a10.f54718e);
                    d0 d0Var2 = (d0) weakReference.get();
                    if (d0Var2 != null && !d0Var2.j()) {
                        this.f54602c.add(vVar);
                        h2.l0.W(d0Var2.f54627l, new hn0(this, vVar, d0Var2, lVar, 26));
                        return;
                    }
                    hb.a(lVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
                return;
            }
        }
        hb.a(lVar);
    }

    public final void i1(l lVar, int i7) {
        if (lVar == null) {
            return;
        }
        p1(lVar, i7, 26, s1(new q0(7)));
    }

    public final void j1(l lVar, int i7, i1 i1Var, int i10, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d0 d0Var = (d0) this.f54600a.get();
            if (d0Var != null && !d0Var.j()) {
                v p10 = this.f54601b.p(lVar.asBinder());
                if (p10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                h2.l0.W(d0Var.f54627l, new ka(this, p10, i1Var, d0Var, i7, i10, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void l1(l lVar, int i7) {
        if (lVar == null) {
            return;
        }
        p1(lVar, i7, 26, s1(new org.telegram.utils.twidget.e(29)));
    }

    public final int m1(v vVar, g1 g1Var, int i7) {
        if (g1Var.p0(17)) {
            ab.c0 c0Var = this.f54601b;
            if (!c0Var.z(vVar, 17) && c0Var.z(vVar, 16)) {
                return g1Var.o0() + i7;
            }
        }
        return i7;
    }

    public final void n1(l lVar, int i7, Bundle bundle, Bundle bundle2, boolean z10) {
        i1 i1Var;
        Bundle o4 = h2.l0.o(bundle2);
        if (lVar != null && bundle != null && o4 != null) {
            try {
                int i10 = bundle.getInt(i1.f54723f, 0);
                if (i10 != 0) {
                    i1Var = new i1(i10);
                } else {
                    String string = bundle.getString(i1.f54724g);
                    string.getClass();
                    Bundle o10 = h2.l0.o(bundle.getBundle(i1.h));
                    if (o10 == null) {
                        o10 = Bundle.EMPTY;
                    }
                    i1Var = new i1(string, o10);
                }
                if (d.j(i1Var.f54726b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var = (d0) this.f54600a.get();
                        if (d0Var != null && !d0Var.j()) {
                            v p10 = this.f54601b.p(lVar.asBinder());
                            if (p10 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            h2.l0.W(d0Var.f54627l, new bg.l0(this, p10, i1Var, d0Var, i7, lVar, 15));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                j1(lVar, i7, i1Var, 0, new t0(new org.telegram.utils.twidget.e(z10, i1Var, o4), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
            }
        }
    }

    public final void o1(v vVar, int i7) {
        q1(vVar, i7, 1, s1(new k8(9, this, vVar)));
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        h hVar;
        v p10;
        v p11;
        v p12;
        v p13;
        v p14;
        v p15;
        v p16;
        v p17;
        v p18;
        v p19;
        v p20;
        v p21;
        v p22;
        v p23;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        q a10 = null;
        q a11 = null;
        q a12 = null;
        q a13 = null;
        q a14 = null;
        switch (i7) {
            case 3002:
                z1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                u1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                l1(p.h1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                i1(p.h1(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                t1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                v1(p.h1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) bb.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                w1(p.h1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) bb.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                v1(p.h1(parcel.readStrongBinder()), parcel.readInt(), (Bundle) bb.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                x1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                x1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                y1(p.h1(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                l h12 = p.h1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (h12 != null) {
                    p1(h12, readInt, 1, s1(new l2.v(4, z10)));
                    return true;
                }
                break;
            case 3014:
                l h13 = p.h1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h13 != null && bundle != null) {
                    try {
                        m1 a15 = m1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            ab.c0 c0Var = this.f54601b;
                            IBinder asBinder = h13.asBinder();
                            synchronized (c0Var.f909b) {
                                v p24 = c0Var.p(asBinder);
                                hVar = p24 != null ? (h) ((a0.f) c0Var.d).get(p24) : null;
                            }
                            com.google.android.gms.common.api.internal.t tVar = hVar != null ? hVar.f54700b : null;
                            if (tVar != null) {
                                tVar.i(readInt2, a15);
                            }
                            break;
                        } finally {
                        }
                    } catch (RuntimeException e10) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e10);
                        break;
                    }
                }
                break;
            case 3015:
                l h14 = p.h1(parcel.readStrongBinder());
                parcel.readInt();
                h1(h14, (Bundle) bb.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                l h15 = p.h1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                n1(h15, readInt3, (Bundle) bb.a(parcel, creator), (Bundle) bb.a(parcel, creator), false);
                return true;
            case 3017:
                l h16 = p.h1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (h16 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    p1(h16, readInt4, 15, s1(new l2.t(readInt5, 8)));
                    return true;
                }
                break;
            case 3018:
                l h17 = p.h1(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z11 = parcel.readInt() != 0;
                if (h17 != null) {
                    p1(h17, readInt6, 14, s1(new l2.v(6, z11)));
                    return true;
                }
                break;
            case 3019:
                l h18 = p.h1(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (h18 != null && readInt8 >= 0) {
                    p1(h18, readInt7, 20, new org.telegram.ui.ActionBar.z(new o0(this, readInt8, 4), 14));
                    return true;
                }
                break;
            case 3020:
                l h19 = p.h1(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (h19 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    p1(h19, readInt9, 20, new org.telegram.ui.ActionBar.z(new n0(this, readInt10, readInt11), 14));
                    return true;
                }
                break;
            case 3021:
                l h110 = p.h1(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (h110 != null) {
                    p1(h110, readInt12, 20, s1(new q0(17)));
                    return true;
                }
                break;
            case 3022:
                l h111 = p.h1(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (h111 != null && readInt14 >= 0 && readInt15 >= 0) {
                    p1(h111, readInt13, 20, s1(new gh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                l h112 = p.h1(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (h112 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    p1(h112, readInt16, 20, s1(new h2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((g1) obj).u0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                l h113 = p.h1(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (h113 != null && (p10 = this.f54601b.p(h113.asBinder())) != null) {
                    o1(p10, readInt20);
                    return true;
                }
                break;
            case 3025:
                l h114 = p.h1(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (h114 != null && (p11 = this.f54601b.p(h114.asBinder())) != null) {
                    q1(p11, readInt21, 1, s1(new org.telegram.utils.twidget.e(26)));
                    return true;
                }
                break;
            case 3026:
                l h115 = p.h1(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (h115 != null) {
                    p1(h115, readInt22, 2, s1(new q0(15)));
                    return true;
                }
                break;
            case 3027:
                l h116 = p.h1(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h116 != null && bundle2 != null) {
                    try {
                        p1(h116, readInt23, 13, s1(new org.telegram.ui.ActionBar.z(new e2.w0(bundle2.getFloat(e2.w0.f10472e, 1.0f), bundle2.getFloat(e2.w0.f10473f, 1.0f)), 13)));
                        break;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                        break;
                    }
                }
                break;
            case 3028:
                l h117 = p.h1(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (h117 != null && readFloat > 0.0f) {
                    p1(h117, readInt24, 13, s1(new l2.s(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                l h118 = p.h1(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h118 != null && bundle3 != null && (p12 = this.f54601b.p(h118.asBinder())) != null) {
                    try {
                        final e2.l0 a16 = e2.l0.a(p12.f54870c, bundle3);
                        q1(p12, readInt25, 20, new t0(new k8(12, new a1() {
                            @Override
                            public final Object k(d0 d0Var, v vVar, int i11) {
                                switch (r1) {
                                    case 0:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                    case 1:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                    default:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                }
                            }
                        }, new q0(9)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3030:
                l h119 = p.h1(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h119 != null && bundle4 != null && readInt27 >= 0 && (p13 = this.f54601b.p(h119.asBinder())) != null) {
                    try {
                        final e2.l0 a17 = e2.l0.a(p13.f54870c, bundle4);
                        q1(p13, readInt26, 20, new t0(new k8(12, new a1() {
                            @Override
                            public final Object k(d0 d0Var, v vVar, int i11) {
                                switch (r1) {
                                    case 0:
                                        return d0Var.l(vVar, h9.i0.u(a17));
                                    case 1:
                                        return d0Var.l(vVar, h9.i0.u(a17));
                                    default:
                                        return d0Var.l(vVar, h9.i0.u(a17));
                                }
                            }
                        }, new o0(this, readInt27, 1)), 1));
                        break;
                    } catch (RuntimeException e13) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                        break;
                    }
                }
                break;
            case 3031:
                l h120 = p.h1(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (h120 != null && readStrongBinder != null && (p14 = this.f54601b.p(h120.asBinder())) != null) {
                    try {
                        h9.i0 a18 = e2.g.a(readStrongBinder);
                        h9.f0 p25 = h9.i0.p();
                        for (int i11 = 0; i11 < a18.size(); i11++) {
                            Bundle bundle5 = (Bundle) a18.get(i11);
                            bundle5.getClass();
                            p25.c(e2.l0.a(p14.f54870c, bundle5));
                        }
                        q1(p14, readInt28, 20, new t0(new k8(12, new l2.w(3, p25.f()), new q0(8)), 1));
                        break;
                    } catch (RuntimeException e14) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                        break;
                    }
                }
                break;
            case 3032:
                l h121 = p.h1(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (h121 != null && readStrongBinder2 != null && readInt30 >= 0 && (p15 = this.f54601b.p(h121.asBinder())) != null) {
                    try {
                        h9.i0 a19 = e2.g.a(readStrongBinder2);
                        h9.f0 p26 = h9.i0.p();
                        for (int i12 = 0; i12 < a19.size(); i12++) {
                            Bundle bundle6 = (Bundle) a19.get(i12);
                            bundle6.getClass();
                            p26.c(e2.l0.a(p15.f54870c, bundle6));
                        }
                        q1(p15, readInt29, 20, new t0(new k8(12, new l2.w(2, p26.f()), new o0(this, readInt30, 3)), 1));
                        break;
                    } catch (RuntimeException e15) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                        break;
                    }
                }
                break;
            case 3033:
                l h122 = p.h1(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h122 != null && bundle7 != null && (p16 = this.f54601b.p(h122.asBinder())) != null) {
                    try {
                        q1(p16, readInt31, 19, s1(new l2.q(e2.o0.b(p16.f54870c, bundle7))));
                        break;
                    } catch (RuntimeException e16) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                        break;
                    }
                }
                break;
            case 3034:
                l h123 = p.h1(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (h123 != null && (p17 = this.f54601b.p(h123.asBinder())) != null) {
                    q1(p17, readInt32, 3, s1(new q0(11)));
                    return true;
                }
                break;
            case 3035:
                l h124 = p.h1(parcel.readStrongBinder());
                parcel.readInt();
                if (h124 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var = (d0) this.f54600a.get();
                        if (d0Var != null && !d0Var.j()) {
                            h2.l0.W(d0Var.f54627l, new org.telegram.ui.web.e1(8, this, h124));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                l h125 = p.h1(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (h125 != null) {
                    p1(h125, readInt33, 4, s1(new q0(13)));
                    return true;
                }
                break;
            case 3037:
                l h126 = p.h1(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (h126 != null && readInt35 >= 0) {
                    p1(h126, readInt34, 10, new org.telegram.ui.ActionBar.z(new o0(this, readInt35, 0), 14));
                    return true;
                }
                break;
            case 3038:
                l h127 = p.h1(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (h127 != null) {
                    p1(h127, readInt36, 5, s1(new n2.d0(readLong)));
                    return true;
                }
                break;
            case 3039:
                l h128 = p.h1(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (h128 != null && readInt38 >= 0) {
                    p1(h128, readInt37, 10, new org.telegram.ui.ActionBar.z(new c4.n(this, readInt38, readLong2, 6), 14));
                    return true;
                }
                break;
            case 3040:
                l h129 = p.h1(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (h129 != null && (p18 = this.f54601b.p(h129.asBinder())) != null) {
                    q1(p18, readInt39, 11, s1(new q0(0)));
                    return true;
                }
                break;
            case 3041:
                l h130 = p.h1(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (h130 != null && (p19 = this.f54601b.p(h130.asBinder())) != null) {
                    q1(p19, readInt40, 12, s1(new q0(4)));
                    return true;
                }
                break;
            case 3042:
                l h131 = p.h1(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (h131 != null) {
                    p1(h131, readInt41, 6, s1(new q0(2)));
                    return true;
                }
                break;
            case 3043:
                l h132 = p.h1(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (h132 != null) {
                    p1(h132, readInt42, 8, s1(new org.telegram.utils.twidget.e(27)));
                    return true;
                }
                break;
            case 3044:
                l h133 = p.h1(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) bb.a(parcel, Surface.CREATOR);
                if (h133 != null) {
                    p1(h133, readInt43, 27, s1(new k8(10, this, surface)));
                    return true;
                }
                break;
            case 3045:
                l h134 = p.h1(parcel.readStrongBinder());
                if (h134 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var2 = (d0) this.f54600a.get();
                        if (d0Var2 != null && !d0Var2.j()) {
                            v p27 = this.f54601b.p(h134.asBinder());
                            if (p27 != null) {
                                h2.l0.W(d0Var2.f54627l, new org.telegram.ui.web.e1(9, this, p27));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                l h135 = p.h1(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (h135 != null && (p20 = this.f54601b.p(h135.asBinder())) != null) {
                    q1(p20, readInt44, 7, s1(new q0(1)));
                    return true;
                }
                break;
            case 3047:
                l h136 = p.h1(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (h136 != null && (p21 = this.f54601b.p(h136.asBinder())) != null) {
                    q1(p21, readInt45, 9, s1(new q0(5)));
                    return true;
                }
                break;
            case 3048:
                l h137 = p.h1(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h137 != null && bundle8 != null) {
                    try {
                        p1(h137, readInt46, 29, s1(new k8(8, this, q1.b(bundle8))));
                        break;
                    } catch (RuntimeException e17) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                        break;
                    }
                }
                break;
            case 3049:
                l h138 = p.h1(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h138 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        h2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            j1(h138, readInt47, null, 40010, new t0(new q0(readString, 6, e2.d1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e18) {
                            h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                l h139 = p.h1(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h139 != null && bundle10 != null) {
                    try {
                        j1(h139, readInt48, null, 40010, new t0(new q0(e2.d1.a(bundle10), 20), 1));
                        break;
                    } catch (RuntimeException e19) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                        break;
                    }
                }
                break;
            case 3051:
                l h140 = p.h1(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (h140 != null && readInt50 >= 0) {
                    p1(h140, readInt49, 33, s1(new gh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                l h141 = p.h1(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (h141 != null) {
                    p1(h141, readInt52, 34, s1(new l2.t(readInt53, 7)));
                    return true;
                }
                break;
            case 3053:
                l h142 = p.h1(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (h142 != null) {
                    p1(h142, readInt54, 34, s1(new l2.t(readInt55, 6)));
                    return true;
                }
                break;
            case 3054:
                l h143 = p.h1(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z12 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (h143 != null) {
                    p1(h143, readInt56, 34, s1(new h2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((g1) obj).J(readInt57, z12);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                l h144 = p.h1(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                if (h144 != null && bundle11 != null && readInt59 >= 0 && (p22 = this.f54601b.p(h144.asBinder())) != null) {
                    try {
                        final e2.l0 a20 = e2.l0.a(p22.f54870c, bundle11);
                        q1(p22, readInt58, 20, new t0(new k8(12, new a1() {
                            @Override
                            public final Object k(d0 d0Var3, v vVar, int i112) {
                                switch (r1) {
                                    case 0:
                                        return d0Var3.l(vVar, h9.i0.u(a20));
                                    case 1:
                                        return d0Var3.l(vVar, h9.i0.u(a20));
                                    default:
                                        return d0Var3.l(vVar, h9.i0.u(a20));
                                }
                            }
                        }, new o0(this, readInt59, 2)), 1));
                        break;
                    } catch (RuntimeException e20) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e20);
                        break;
                    }
                }
                break;
            case 3056:
                l h145 = p.h1(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (h145 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (p23 = this.f54601b.p(h145.asBinder())) != null) {
                    try {
                        h9.i0 a21 = e2.g.a(readStrongBinder3);
                        h9.f0 p28 = h9.i0.p();
                        for (int i13 = 0; i13 < a21.size(); i13++) {
                            Bundle bundle12 = (Bundle) a21.get(i13);
                            bundle12.getClass();
                            p28.c(e2.l0.a(p23.f54870c, bundle12));
                        }
                        q1(p23, readInt60, 20, new t0(new k8(12, new org.telegram.ui.ActionBar.z(p28.f(), 12), new n0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e21) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                        break;
                    }
                }
                break;
            case 3057:
                l h146 = p.h1(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                if (h146 != null && bundle13 != null) {
                    try {
                        p1(h146, readInt63, 35, s1(new ab.z(10, e2.e.a(bundle13), z13)));
                        break;
                    } catch (RuntimeException e22) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                        break;
                    }
                }
                break;
            case 3058:
                l h147 = p.h1(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (h147 != null) {
                    p1(h147, readInt64, 24, s1(new org.telegram.utils.twidget.e(25)));
                    return true;
                }
                break;
            case 3059:
                l h148 = p.h1(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (h148 != null) {
                    p1(h148, readInt65, 24, s1(new q0(12)));
                    return true;
                }
                break;
            case 3060:
                l h149 = p.h1(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                n1(h149, readInt66, (Bundle) bb.a(parcel, creator2), (Bundle) bb.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                l h150 = p.h1(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) bb.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (h150 != null) {
                    p1(h150, readInt67, 27, s1(new bt(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                l h151 = p.h1(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (h151 != null) {
                    p1(h151, readInt70, 27, s1(new n0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i7) {
                    case 4001:
                        l h152 = p.h1(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                        if (h152 != null) {
                            if (bundle14 != null) {
                                try {
                                    a14 = q.a(bundle14);
                                } catch (RuntimeException e23) {
                                    h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    break;
                                }
                            }
                            j1(h152, readInt73, null, 50000, new t0(new q0(a14, 14), 0));
                            break;
                        }
                        break;
                    case 4002:
                        l h153 = p.h1(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (h153 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                h2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            j1(h153, readInt74, null, 50004, new t0(new q0(readString2, 3), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        l h154 = p.h1(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                        if (h154 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                h2.a.l("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                                break;
                            } else if (readInt76 < 0) {
                                h2.a.l("MediaSessionStub", "getChildren(): Ignoring negative page");
                                break;
                            } else if (readInt77 < 1) {
                                h2.a.l("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle15 != null) {
                                    try {
                                        a13 = q.a(bundle15);
                                    } catch (RuntimeException e24) {
                                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                        break;
                                    }
                                }
                                j1(h154, readInt75, null, 50003, new t0(new org.telegram.utils.twidget.e(readString3, readInt76, readInt77, a13), 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        l h155 = p.h1(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                        if (h155 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                h2.a.l("MediaSessionStub", "search(): Ignoring empty query");
                                break;
                            } else {
                                if (bundle16 != null) {
                                    try {
                                        a12 = q.a(bundle16);
                                    } catch (RuntimeException e25) {
                                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                        break;
                                    }
                                }
                                j1(h155, readInt78, null, 50005, new t0(new q0(readString4, 18, a12), 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        l h156 = p.h1(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                        if (h156 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                h2.a.l("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                                break;
                            } else if (readInt80 < 0) {
                                h2.a.l("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                                break;
                            } else if (readInt81 < 1) {
                                h2.a.l("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                                break;
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        a11 = q.a(bundle17);
                                    } catch (RuntimeException e26) {
                                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                        break;
                                    }
                                }
                                j1(h156, readInt79, null, 50006, new t0(new q0(readString5, readInt80, readInt81, a11), 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        l h157 = p.h1(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) bb.a(parcel, Bundle.CREATOR);
                        if (h157 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                h2.a.l("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                break;
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        a10 = q.a(bundle18);
                                    } catch (RuntimeException e27) {
                                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e27);
                                        break;
                                    }
                                }
                                j1(h157, readInt82, null, 50001, new t0(new q0(readString6, 16, a10), 0));
                                break;
                            }
                        }
                        break;
                    case 4007:
                        l h158 = p.h1(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (h158 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                h2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            j1(h158, readInt83, null, 50002, new t0(new org.telegram.utils.twidget.e(readString7, 23), 0));
                            return true;
                        }
                        break;
                    default:
                        return super.onTransact(i7, parcel, parcel2, i10);
                }
        }
        return true;
    }

    public final void p1(l lVar, int i7, int i10, org.telegram.ui.ActionBar.z zVar) {
        v p10 = this.f54601b.p(lVar.asBinder());
        if (p10 != null) {
            q1(p10, i7, i10, zVar);
        }
    }

    public final void q1(v vVar, int i7, int i10, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d0 d0Var = (d0) this.f54600a.get();
            if (d0Var != null && !d0Var.j()) {
                h2.l0.W(d0Var.f54627l, new oi.e0(this, vVar, i10, d0Var, i7, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void t1(l lVar, int i7, boolean z10) {
        if (lVar == null) {
            return;
        }
        p1(lVar, i7, 26, s1(new l2.v(5, z10)));
    }

    public final void u1(l lVar, int i7, int i10) {
        if (lVar != null && i10 >= 0) {
            p1(lVar, i7, 25, s1(new l2.t(i10, 9)));
        }
    }

    public final void v1(l lVar, int i7, Bundle bundle, boolean z10) {
        v p10;
        if (lVar != null && bundle != null && (p10 = this.f54601b.p(lVar.asBinder())) != null) {
            try {
                q1(p10, i7, 31, new t0(new k8(11, new ab.z(9, e2.l0.a(p10.f54870c, bundle), z10), new q0(19)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void w1(l lVar, int i7, Bundle bundle, long j3) {
        v p10;
        if (lVar != null && bundle != null && (p10 = this.f54601b.p(lVar.asBinder())) != null) {
            try {
                q1(p10, i7, 31, new t0(new k8(11, new ai.c0(e2.l0.a(p10.f54870c, bundle), j3, 13), new q0(19)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void x1(l lVar, int i7, IBinder iBinder, boolean z10) {
        v p10;
        if (lVar != null && iBinder != null && (p10 = this.f54601b.p(lVar.asBinder())) != null) {
            try {
                h9.i0 a10 = e2.g.a(iBinder);
                h9.f0 p11 = h9.i0.p();
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Bundle bundle = (Bundle) a10.get(i10);
                    bundle.getClass();
                    p11.c(e2.l0.a(p10.f54870c, bundle));
                }
                q1(p10, i7, 20, new t0(new k8(11, new ab.z(11, p11.f(), z10), new q0(19)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void y1(l lVar, int i7, IBinder iBinder, int i10, long j3) {
        v p10;
        if (lVar != null && iBinder != null) {
            if ((i10 == -1 || i10 >= 0) && (p10 = this.f54601b.p(lVar.asBinder())) != null) {
                try {
                    h9.i0 a10 = e2.g.a(iBinder);
                    h9.f0 p11 = h9.i0.p();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        Bundle bundle = (Bundle) a10.get(i11);
                        bundle.getClass();
                        p11.c(e2.l0.a(p10.f54870c, bundle));
                    }
                    q1(p10, i7, 20, new t0(new k8(11, new c4.n(p11.f(), i10, j3, 7), new q0(19)), 1));
                } catch (RuntimeException e10) {
                    h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                }
            }
        }
    }

    public final void z1(l lVar, int i7, float f10) {
        if (lVar != null && f10 >= 0.0f && f10 <= 1.0f) {
            p1(lVar, i7, 24, s1(new l2.s(f10, 2)));
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
