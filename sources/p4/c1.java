package p4;

import a8.wa;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import c8.ab;
import c8.ya;
import e2.p1;
import e2.q1;
import e2.r1;
import h9.h2;
import h9.s1;
import h9.y1;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.la;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.us;
import org.telegram.ui.io0;
public final class c1 extends Binder implements m {
    public final WeakReference f53065a;
    public final ui.e f53066b;
    public final Set f53067c;
    public s1 d;
    public y1 f53068e;
    public int f53069f;
    public b1 f53070i;

    public c1(d0 d0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f53065a = new WeakReference(d0Var);
        this.f53066b = new ui.e(d0Var);
        this.f53067c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = s1.f14390r;
        this.f53068e = y1.h;
    }

    public static m9.y K0(d0 d0Var, v vVar, int i7, a1 a1Var, h2.j jVar) {
        if (d0Var.j()) {
            return m9.w.f19996b;
        }
        m9.y yVar = (m9.y) a1Var.i(d0Var, vVar, i7);
        ?? obj = new Object();
        yVar.b(new io0(d0Var, (Object) obj, jVar, yVar, 24), m9.r.f19991a);
        return obj;
    }

    public static void R0(d0 d0Var, v vVar, int i7, m1 m1Var) {
        try {
            u uVar = vVar.d;
            uVar.getClass();
            uVar.f(i7, m1Var);
            d0Var.f53085c.a(true, true);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionStub", "Failed to send result to controller " + vVar, e10);
        }
    }

    public static m3 S0(h2.j jVar) {
        return new m3(new m3(jVar, 11), 10);
    }

    public final void H0(l lVar, Bundle bundle) {
        WeakReference weakReference = this.f53065a;
        d0 d0Var = (d0) weakReference.get();
        if (lVar != null && bundle != null && d0Var != null) {
            try {
                Context context = d0Var.f53087f;
                i a10 = i.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                String str = a10.f53182c;
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                    h2.a.l("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    ab.a(lVar);
                    return;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a10.d;
                }
                try {
                    q4.r rVar = new q4.r(str, callingPid, callingUid);
                    boolean b10 = q4.u.a(context).b(rVar);
                    int i7 = a10.f53180a;
                    int i10 = a10.f53181b;
                    v vVar = new v(rVar, i7, i10, b10, new x0(lVar, i10), a10.f53183e);
                    d0 d0Var2 = (d0) weakReference.get();
                    if (d0Var2 != null && !d0Var2.j()) {
                        this.f53067c.add(vVar);
                        h2.m0.W(d0Var2.f53092l, new io0(this, vVar, d0Var2, lVar, 23));
                        return;
                    }
                    ab.a(lVar);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
                return;
            }
        }
        ab.a(lVar);
    }

    public final void I0(l lVar, int i7) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i7, 26, S0(new r0(1)));
    }

    public final void J0(l lVar, int i7, i1 i1Var, int i10, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d0 d0Var = (d0) this.f53065a.get();
            if (d0Var != null && !d0Var.j()) {
                v x10 = this.f53066b.x(lVar.asBinder());
                if (x10 == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return;
                }
                h2.m0.W(d0Var.f53092l, new la(this, x10, i1Var, d0Var, i7, i10, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void L0(l lVar, int i7) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i7, 26, S0(new org.telegram.utils.twidget.a(23)));
    }

    public final int M0(v vVar, g1 g1Var, int i7) {
        if (g1Var.p0(17)) {
            ui.e eVar = this.f53066b;
            if (!eVar.G(vVar, 17) && eVar.G(vVar, 16)) {
                return g1Var.o0() + i7;
            }
        }
        return i7;
    }

    public final void N0(l lVar, int i7, Bundle bundle, Bundle bundle2, boolean z9) {
        i1 i1Var;
        Bundle o4 = h2.m0.o(bundle2);
        if (lVar != null && bundle != null && o4 != null) {
            try {
                int i10 = bundle.getInt(i1.f53188f, 0);
                if (i10 != 0) {
                    i1Var = new i1(i10);
                } else {
                    String string = bundle.getString(i1.f53189g);
                    string.getClass();
                    Bundle o10 = h2.m0.o(bundle.getBundle(i1.h));
                    if (o10 == null) {
                        o10 = Bundle.EMPTY;
                    }
                    i1Var = new i1(string, o10);
                }
                if (d.j(i1Var.f53191b)) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var = (d0) this.f53065a.get();
                        if (d0Var != null && !d0Var.j()) {
                            v x10 = this.f53066b.x(lVar.asBinder());
                            if (x10 == null) {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                                return;
                            }
                            h2.m0.W(d0Var.f53092l, new bg.l0(this, x10, i1Var, d0Var, i7, lVar, 14));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            return;
                        }
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                J0(lVar, i7, i1Var, 0, new t0(new org.telegram.utils.twidget.a(z9, i1Var, o4), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
            }
        }
    }

    public final void O0(v vVar, int i7) {
        Q0(vVar, i7, 1, S0(new org.telegram.ui.web.a0(6, this, vVar)));
    }

    public final void P0(l lVar, int i7, int i10, m3 m3Var) {
        v x10 = this.f53066b.x(lVar.asBinder());
        if (x10 != null) {
            Q0(x10, i7, i10, m3Var);
        }
    }

    public final void Q0(v vVar, int i7, int i10, a1 a1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d0 d0Var = (d0) this.f53065a.get();
            if (d0Var != null && !d0Var.j()) {
                h2.m0.W(d0Var.f53092l, new li.g0(this, vVar, i10, d0Var, i7, a1Var));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void T0(l lVar, int i7, boolean z9) {
        if (lVar == null) {
            return;
        }
        P0(lVar, i7, 26, S0(new l2.x(5, z9)));
    }

    public final void U0(l lVar, int i7, int i10) {
        if (lVar != null && i10 >= 0) {
            P0(lVar, i7, 25, S0(new l2.u(i10, 9)));
        }
    }

    public final void V0(l lVar, int i7, Bundle bundle, boolean z9) {
        v x10;
        if (lVar != null && bundle != null && (x10 = this.f53066b.x(lVar.asBinder())) != null) {
            try {
                Q0(x10, i7, 31, new t0(new org.telegram.ui.web.a0(8, new ab.y(9, e2.l0.a(x10.f53335c, bundle), z9), new r0(13)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void W0(l lVar, int i7, Bundle bundle, long j3) {
        v x10;
        if (lVar != null && bundle != null && (x10 = this.f53066b.x(lVar.asBinder())) != null) {
            try {
                Q0(x10, i7, 31, new t0(new org.telegram.ui.web.a0(8, new di.c1(e2.l0.a(x10.f53335c, bundle), j3, 12), new r0(13)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void X0(l lVar, int i7, IBinder iBinder, boolean z9) {
        v x10;
        if (lVar != null && iBinder != null && (x10 = this.f53066b.x(lVar.asBinder())) != null) {
            try {
                h9.i0 a10 = e2.g.a(iBinder);
                h9.f0 p10 = h9.i0.p();
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Bundle bundle = (Bundle) a10.get(i10);
                    bundle.getClass();
                    p10.c(e2.l0.a(x10.f53335c, bundle));
                }
                Q0(x10, i7, 20, new t0(new org.telegram.ui.web.a0(8, new ab.y(11, p10.f(), z9), new r0(13)), 1));
            } catch (RuntimeException e10) {
                h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void Y0(l lVar, int i7, IBinder iBinder, int i10, long j3) {
        v x10;
        if (lVar != null && iBinder != null) {
            if ((i10 == -1 || i10 >= 0) && (x10 = this.f53066b.x(lVar.asBinder())) != null) {
                try {
                    h9.i0 a10 = e2.g.a(iBinder);
                    h9.f0 p10 = h9.i0.p();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        Bundle bundle = (Bundle) a10.get(i11);
                        bundle.getClass();
                        p10.c(e2.l0.a(x10.f53335c, bundle));
                    }
                    Q0(x10, i7, 20, new t0(new org.telegram.ui.web.a0(8, new c4.n(p10.f(), i10, j3, 7), new r0(13)), 1));
                } catch (RuntimeException e10) {
                    h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                }
            }
        }
    }

    public final void Z0(l lVar, int i7, float f10) {
        if (lVar != null && f10 >= 0.0f && f10 <= 1.0f) {
            P0(lVar, i7, 24, S0(new l2.t(f10, 2)));
        }
    }

    public final e1 a1(e1 e1Var) {
        s1 s1Var;
        h9.i0 i0Var = e1Var.F.f10547a;
        ?? waVar = new wa(4, 10);
        wa waVar2 = new wa(4, 10);
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            e2.m1 m1Var = ((r1) i0Var.get(i7)).f10539b;
            String str = (String) this.d.get(m1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.f53069f;
                this.f53069f = i10 + 1;
                String str2 = h2.m0.f14112a;
                sb2.append(Integer.toString(i10, 36));
                sb2.append("-");
                sb2.append(m1Var.f10374b);
                str = sb2.toString();
            }
            waVar.G(m1Var, str);
            waVar2.v(m1Var.f10374b, str);
        }
        if (waVar.f700b == 0) {
            s1Var = s1.f14390r;
        } else {
            s1Var = new s1(waVar.f700b, (Object[]) waVar.f701c);
        }
        this.d = s1Var;
        this.f53068e = waVar2.d(false);
        h9.f0 p10 = h9.i0.p();
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            r1 r1Var = (r1) i0Var.get(i11);
            p10.c(new r1(b1(r1Var.f10539b), r1Var.f10540c, r1Var.d, r1Var.f10541e));
        }
        e1 a10 = e1Var.a(new e2.s1(p10.f()));
        q1 q1Var = a10.G;
        if (q1Var.H.isEmpty()) {
            return a10;
        }
        p1 c10 = q1Var.a().c();
        h2 it = q1Var.H.values().iterator();
        while (it.hasNext()) {
            e2.n1 n1Var = (e2.n1) it.next();
            c10.a(new e2.n1(b1(n1Var.f10401a), n1Var.f10402b));
        }
        return a10.d(c10.b());
    }

    public final e2.m1 b1(e2.m1 m1Var) {
        String str;
        String str2 = (String) this.d.get(m1Var);
        if (str2 == null) {
            str2 = m1Var.f10374b;
        }
        int i7 = 0;
        while (true) {
            int i10 = m1Var.f10373a;
            e2.u[] uVarArr = m1Var.d;
            if (i7 < i10) {
                if (uVarArr[i7].f10609m != null) {
                    e2.u[] uVarArr2 = new e2.u[i10];
                    for (int i11 = 0; i11 < m1Var.f10373a; i11++) {
                        e2.u uVar = uVarArr[i11];
                        String str3 = uVar.f10609m;
                        if (str3 != null) {
                            str = (String) this.f53068e.get(str3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            e2.t a10 = uVar.a();
                            a10.f10557l = str;
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

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        h hVar;
        v x10;
        v x11;
        v x12;
        v x13;
        v x14;
        v x15;
        v x16;
        v x17;
        v x18;
        v x19;
        v x20;
        v x21;
        v x22;
        v x23;
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
                Z0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                U0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                L0(p.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                I0(p.H0(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                T0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                V0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) ya.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                W0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) ya.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                V0(p.H0(parcel.readStrongBinder()), parcel.readInt(), (Bundle) ya.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                X0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                X0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                Y0(p.H0(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                l H0 = p.H0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z9 = parcel.readInt() != 0;
                if (H0 != null) {
                    P0(H0, readInt, 1, S0(new l2.x(4, z9)));
                    return true;
                }
                break;
            case 3014:
                l H02 = p.H0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H02 != null && bundle != null) {
                    try {
                        m1 a15 = m1.a(bundle);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            ui.e eVar = this.f53066b;
                            IBinder asBinder = H02.asBinder();
                            synchronized (eVar.f56814b) {
                                v x24 = eVar.x(asBinder);
                                hVar = x24 != null ? (h) ((a0.f) eVar.d).get(x24) : null;
                            }
                            com.google.android.gms.common.api.internal.s sVar = hVar != null ? hVar.f53165b : null;
                            if (sVar != null) {
                                sVar.i(readInt2, a15);
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
                l H03 = p.H0(parcel.readStrongBinder());
                parcel.readInt();
                H0(H03, (Bundle) ya.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                l H04 = p.H0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                N0(H04, readInt3, (Bundle) ya.a(parcel, creator), (Bundle) ya.a(parcel, creator), false);
                return true;
            case 3017:
                l H05 = p.H0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                if (H05 != null && (readInt5 == 2 || readInt5 == 0 || readInt5 == 1)) {
                    P0(H05, readInt4, 15, S0(new l2.u(readInt5, 8)));
                    return true;
                }
                break;
            case 3018:
                l H06 = p.H0(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (H06 != null) {
                    P0(H06, readInt6, 14, S0(new l2.x(6, z10)));
                    return true;
                }
                break;
            case 3019:
                l H07 = p.H0(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                if (H07 != null && readInt8 >= 0) {
                    P0(H07, readInt7, 20, new m3(new o0(this, readInt8, 4), 10));
                    return true;
                }
                break;
            case 3020:
                l H08 = p.H0(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                if (H08 != null && readInt10 >= 0 && readInt11 >= readInt10) {
                    P0(H08, readInt9, 20, new m3(new n0(this, readInt10, readInt11), 10));
                    return true;
                }
                break;
            case 3021:
                l H09 = p.H0(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                if (H09 != null) {
                    P0(H09, readInt12, 20, S0(new r0(11)));
                    return true;
                }
                break;
            case 3022:
                l H010 = p.H0(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                if (H010 != null && readInt14 >= 0 && readInt15 >= 0) {
                    P0(H010, readInt13, 20, S0(new gh.c(readInt14, readInt15, 5)));
                    return true;
                }
                break;
            case 3023:
                l H011 = p.H0(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                final int readInt19 = parcel.readInt();
                if (H011 != null && readInt17 >= 0 && readInt18 >= readInt17 && readInt19 >= 0) {
                    P0(H011, readInt16, 20, S0(new h2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((g1) obj).u0(readInt17, readInt18, readInt19);
                        }
                    }));
                    return true;
                }
                break;
            case 3024:
                l H012 = p.H0(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (H012 != null && (x10 = this.f53066b.x(H012.asBinder())) != null) {
                    O0(x10, readInt20);
                    return true;
                }
                break;
            case 3025:
                l H013 = p.H0(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (H013 != null && (x11 = this.f53066b.x(H013.asBinder())) != null) {
                    Q0(x11, readInt21, 1, S0(new org.telegram.utils.twidget.a(20)));
                    return true;
                }
                break;
            case 3026:
                l H014 = p.H0(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                if (H014 != null) {
                    P0(H014, readInt22, 2, S0(new r0(9)));
                    return true;
                }
                break;
            case 3027:
                l H015 = p.H0(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                Bundle bundle2 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H015 != null && bundle2 != null) {
                    try {
                        P0(H015, readInt23, 13, S0(new m3(new e2.w0(bundle2.getFloat(e2.w0.f10636e, 1.0f), bundle2.getFloat(e2.w0.f10637f, 1.0f)), 9)));
                        break;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
                        break;
                    }
                }
                break;
            case 3028:
                l H016 = p.H0(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (H016 != null && readFloat > 0.0f) {
                    P0(H016, readInt24, 13, S0(new l2.t(readFloat, 1)));
                    return true;
                }
                break;
            case 3029:
                l H017 = p.H0(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                Bundle bundle3 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H017 != null && bundle3 != null && (x12 = this.f53066b.x(H017.asBinder())) != null) {
                    try {
                        final e2.l0 a16 = e2.l0.a(x12.f53335c, bundle3);
                        Q0(x12, readInt25, 20, new t0(new org.telegram.ui.web.a0(9, new a1() {
                            @Override
                            public final Object i(d0 d0Var, v vVar, int i11) {
                                switch (r1) {
                                    case 0:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                    case 1:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                    default:
                                        return d0Var.l(vVar, h9.i0.u(a16));
                                }
                            }
                        }, new r0(3)), 1));
                        break;
                    } catch (RuntimeException e12) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e12);
                        break;
                    }
                }
                break;
            case 3030:
                l H018 = p.H0(parcel.readStrongBinder());
                int readInt26 = parcel.readInt();
                int readInt27 = parcel.readInt();
                Bundle bundle4 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H018 != null && bundle4 != null && readInt27 >= 0 && (x13 = this.f53066b.x(H018.asBinder())) != null) {
                    try {
                        final e2.l0 a17 = e2.l0.a(x13.f53335c, bundle4);
                        Q0(x13, readInt26, 20, new t0(new org.telegram.ui.web.a0(9, new a1() {
                            @Override
                            public final Object i(d0 d0Var, v vVar, int i11) {
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
                l H019 = p.H0(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (H019 != null && readStrongBinder != null && (x14 = this.f53066b.x(H019.asBinder())) != null) {
                    try {
                        h9.i0 a18 = e2.g.a(readStrongBinder);
                        h9.f0 p10 = h9.i0.p();
                        for (int i11 = 0; i11 < a18.size(); i11++) {
                            Bundle bundle5 = (Bundle) a18.get(i11);
                            bundle5.getClass();
                            p10.c(e2.l0.a(x14.f53335c, bundle5));
                        }
                        Q0(x14, readInt28, 20, new t0(new org.telegram.ui.web.a0(9, new l2.z(3, p10.f()), new r0(2)), 1));
                        break;
                    } catch (RuntimeException e14) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                        break;
                    }
                }
                break;
            case 3032:
                l H020 = p.H0(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (H020 != null && readStrongBinder2 != null && readInt30 >= 0 && (x15 = this.f53066b.x(H020.asBinder())) != null) {
                    try {
                        h9.i0 a19 = e2.g.a(readStrongBinder2);
                        h9.f0 p11 = h9.i0.p();
                        for (int i12 = 0; i12 < a19.size(); i12++) {
                            Bundle bundle6 = (Bundle) a19.get(i12);
                            bundle6.getClass();
                            p11.c(e2.l0.a(x15.f53335c, bundle6));
                        }
                        Q0(x15, readInt29, 20, new t0(new org.telegram.ui.web.a0(9, new l2.z(2, p11.f()), new o0(this, readInt30, 3)), 1));
                        break;
                    } catch (RuntimeException e15) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                        break;
                    }
                }
                break;
            case 3033:
                l H021 = p.H0(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                Bundle bundle7 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H021 != null && bundle7 != null && (x16 = this.f53066b.x(H021.asBinder())) != null) {
                    try {
                        Q0(x16, readInt31, 19, S0(new l2.r(e2.o0.b(x16.f53335c, bundle7))));
                        break;
                    } catch (RuntimeException e16) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e16);
                        break;
                    }
                }
                break;
            case 3034:
                l H022 = p.H0(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (H022 != null && (x17 = this.f53066b.x(H022.asBinder())) != null) {
                    Q0(x17, readInt32, 3, S0(new r0(5)));
                    return true;
                }
                break;
            case 3035:
                l H023 = p.H0(parcel.readStrongBinder());
                parcel.readInt();
                if (H023 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var = (d0) this.f53065a.get();
                        if (d0Var != null && !d0Var.j()) {
                            h2.m0.W(d0Var.f53092l, new org.telegram.ui.web.w(17, this, H023));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3036:
                l H024 = p.H0(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                if (H024 != null) {
                    P0(H024, readInt33, 4, S0(new r0(7)));
                    return true;
                }
                break;
            case 3037:
                l H025 = p.H0(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                int readInt35 = parcel.readInt();
                if (H025 != null && readInt35 >= 0) {
                    P0(H025, readInt34, 10, new m3(new o0(this, readInt35, 0), 10));
                    return true;
                }
                break;
            case 3038:
                l H026 = p.H0(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                long readLong = parcel.readLong();
                if (H026 != null) {
                    P0(H026, readInt36, 5, S0(new n2.c0(readLong)));
                    return true;
                }
                break;
            case 3039:
                l H027 = p.H0(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                int readInt38 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (H027 != null && readInt38 >= 0) {
                    P0(H027, readInt37, 10, new m3(new c4.n(this, readInt38, readLong2, 6), 10));
                    return true;
                }
                break;
            case 3040:
                l H028 = p.H0(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (H028 != null && (x18 = this.f53066b.x(H028.asBinder())) != null) {
                    Q0(x18, readInt39, 11, S0(new org.telegram.utils.twidget.a(24)));
                    return true;
                }
                break;
            case 3041:
                l H029 = p.H0(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (H029 != null && (x19 = this.f53066b.x(H029.asBinder())) != null) {
                    Q0(x19, readInt40, 12, S0(new org.telegram.utils.twidget.a(28)));
                    return true;
                }
                break;
            case 3042:
                l H030 = p.H0(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (H030 != null) {
                    P0(H030, readInt41, 6, S0(new org.telegram.utils.twidget.a(26)));
                    return true;
                }
                break;
            case 3043:
                l H031 = p.H0(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (H031 != null) {
                    P0(H031, readInt42, 8, S0(new org.telegram.utils.twidget.a(21)));
                    return true;
                }
                break;
            case 3044:
                l H032 = p.H0(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                Surface surface = (Surface) ya.a(parcel, Surface.CREATOR);
                if (H032 != null) {
                    P0(H032, readInt43, 27, S0(new org.telegram.ui.web.a0(7, this, surface)));
                    return true;
                }
                break;
            case 3045:
                l H033 = p.H0(parcel.readStrongBinder());
                if (H033 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        d0 d0Var2 = (d0) this.f53065a.get();
                        if (d0Var2 != null && !d0Var2.j()) {
                            v x25 = this.f53066b.x(H033.asBinder());
                            if (x25 != null) {
                                h2.m0.W(d0Var2.f53092l, new org.telegram.ui.web.w(18, this, x25));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                break;
            case 3046:
                l H034 = p.H0(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (H034 != null && (x20 = this.f53066b.x(H034.asBinder())) != null) {
                    Q0(x20, readInt44, 7, S0(new org.telegram.utils.twidget.a(25)));
                    return true;
                }
                break;
            case 3047:
                l H035 = p.H0(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                if (H035 != null && (x21 = this.f53066b.x(H035.asBinder())) != null) {
                    Q0(x21, readInt45, 9, S0(new org.telegram.utils.twidget.a(29)));
                    return true;
                }
                break;
            case 3048:
                l H036 = p.H0(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                Bundle bundle8 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H036 != null && bundle8 != null) {
                    try {
                        P0(H036, readInt46, 29, S0(new org.telegram.ui.web.a0(5, this, q1.b(bundle8))));
                        break;
                    } catch (RuntimeException e17) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e17);
                        break;
                    }
                }
                break;
            case 3049:
                l H037 = p.H0(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle9 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H037 != null && readString != null && bundle9 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        h2.a.l("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        break;
                    } else {
                        try {
                            J0(H037, readInt47, null, 40010, new t0(new r0(readString, 0, e2.d1.a(bundle9)), 1));
                            break;
                        } catch (RuntimeException e18) {
                            h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e18);
                            break;
                        }
                    }
                }
                break;
            case 3050:
                l H038 = p.H0(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                Bundle bundle10 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H038 != null && bundle10 != null) {
                    try {
                        J0(H038, readInt48, null, 40010, new t0(new r0(e2.d1.a(bundle10), 14), 1));
                        break;
                    } catch (RuntimeException e19) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                        break;
                    }
                }
                break;
            case 3051:
                l H039 = p.H0(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                int readInt51 = parcel.readInt();
                if (H039 != null && readInt50 >= 0) {
                    P0(H039, readInt49, 33, S0(new gh.c(readInt50, readInt51, 4)));
                    return true;
                }
                break;
            case 3052:
                l H040 = p.H0(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                int readInt53 = parcel.readInt();
                if (H040 != null) {
                    P0(H040, readInt52, 34, S0(new l2.u(readInt53, 7)));
                    return true;
                }
                break;
            case 3053:
                l H041 = p.H0(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                int readInt55 = parcel.readInt();
                if (H041 != null) {
                    P0(H041, readInt54, 34, S0(new l2.u(readInt55, 6)));
                    return true;
                }
                break;
            case 3054:
                l H042 = p.H0(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                final boolean z11 = parcel.readInt() != 0;
                final int readInt57 = parcel.readInt();
                if (H042 != null) {
                    P0(H042, readInt56, 34, S0(new h2.j() {
                        @Override
                        public final void accept(Object obj) {
                            ((g1) obj).J(readInt57, z11);
                        }
                    }));
                    return true;
                }
                break;
            case 3055:
                l H043 = p.H0(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                Bundle bundle11 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                if (H043 != null && bundle11 != null && readInt59 >= 0 && (x22 = this.f53066b.x(H043.asBinder())) != null) {
                    try {
                        final e2.l0 a20 = e2.l0.a(x22.f53335c, bundle11);
                        Q0(x22, readInt58, 20, new t0(new org.telegram.ui.web.a0(9, new a1() {
                            @Override
                            public final Object i(d0 d0Var3, v vVar, int i112) {
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
                l H044 = p.H0(parcel.readStrongBinder());
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (H044 != null && readStrongBinder3 != null && readInt61 >= 0 && readInt62 >= readInt61 && (x23 = this.f53066b.x(H044.asBinder())) != null) {
                    try {
                        h9.i0 a21 = e2.g.a(readStrongBinder3);
                        h9.f0 p12 = h9.i0.p();
                        for (int i13 = 0; i13 < a21.size(); i13++) {
                            Bundle bundle12 = (Bundle) a21.get(i13);
                            bundle12.getClass();
                            p12.c(e2.l0.a(x23.f53335c, bundle12));
                        }
                        Q0(x23, readInt60, 20, new t0(new org.telegram.ui.web.a0(9, new m3(p12.f(), 8), new n0(this, readInt61, readInt62)), 1));
                        break;
                    } catch (RuntimeException e21) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                        break;
                    }
                }
                break;
            case 3057:
                l H045 = p.H0(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                Bundle bundle13 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                boolean z12 = parcel.readInt() != 0;
                if (H045 != null && bundle13 != null) {
                    try {
                        P0(H045, readInt63, 35, S0(new ab.y(10, e2.e.a(bundle13), z12)));
                        break;
                    } catch (RuntimeException e22) {
                        h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e22);
                        break;
                    }
                }
                break;
            case 3058:
                l H046 = p.H0(parcel.readStrongBinder());
                int readInt64 = parcel.readInt();
                if (H046 != null) {
                    P0(H046, readInt64, 24, S0(new org.telegram.utils.twidget.a(19)));
                    return true;
                }
                break;
            case 3059:
                l H047 = p.H0(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                if (H047 != null) {
                    P0(H047, readInt65, 24, S0(new r0(6)));
                    return true;
                }
                break;
            case 3060:
                l H048 = p.H0(parcel.readStrongBinder());
                int readInt66 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                N0(H048, readInt66, (Bundle) ya.a(parcel, creator2), (Bundle) ya.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                l H049 = p.H0(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                Surface surface2 = (Surface) ya.a(parcel, Surface.CREATOR);
                int readInt68 = parcel.readInt();
                int readInt69 = parcel.readInt();
                if (H049 != null) {
                    P0(H049, readInt67, 27, S0(new us(this, surface2, readInt68, readInt69)));
                    return true;
                }
                break;
            case 3062:
                l H050 = p.H0(parcel.readStrongBinder());
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                int readInt72 = parcel.readInt();
                if (H050 != null) {
                    P0(H050, readInt70, 27, S0(new n0(this, readInt71, readInt72)));
                    return true;
                }
                break;
            default:
                switch (i7) {
                    case 4001:
                        l H051 = p.H0(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        Bundle bundle14 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                        if (H051 != null) {
                            if (bundle14 != null) {
                                try {
                                    a14 = q.a(bundle14);
                                } catch (RuntimeException e23) {
                                    h2.a.m("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e23);
                                    break;
                                }
                            }
                            J0(H051, readInt73, null, 50000, new t0(new r0(a14, 8), 0));
                            break;
                        }
                        break;
                    case 4002:
                        l H052 = p.H0(parcel.readStrongBinder());
                        int readInt74 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (H052 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                h2.a.l("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            J0(H052, readInt74, null, 50004, new t0(new org.telegram.utils.twidget.a(readString2, 27), 0));
                            return true;
                        }
                        break;
                    case 4003:
                        l H053 = p.H0(parcel.readStrongBinder());
                        int readInt75 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt76 = parcel.readInt();
                        int readInt77 = parcel.readInt();
                        Bundle bundle15 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                        if (H053 != null) {
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
                                J0(H053, readInt75, null, 50003, new t0(new org.telegram.utils.twidget.a(readString3, readInt76, readInt77, a13), 0));
                                break;
                            }
                        }
                        break;
                    case 4004:
                        l H054 = p.H0(parcel.readStrongBinder());
                        int readInt78 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle16 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                        if (H054 != null) {
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
                                J0(H054, readInt78, null, 50005, new t0(new r0(readString4, 12, a12), 0));
                                break;
                            }
                        }
                        break;
                    case 4005:
                        l H055 = p.H0(parcel.readStrongBinder());
                        int readInt79 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt80 = parcel.readInt();
                        int readInt81 = parcel.readInt();
                        Bundle bundle17 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                        if (H055 != null) {
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
                                J0(H055, readInt79, null, 50006, new t0(new r0(readString5, readInt80, readInt81, a11), 0));
                                break;
                            }
                        }
                        break;
                    case 4006:
                        l H056 = p.H0(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle18 = (Bundle) ya.a(parcel, Bundle.CREATOR);
                        if (H056 != null) {
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
                                J0(H056, readInt82, null, 50001, new t0(new r0(readString6, 10, a10), 0));
                                break;
                            }
                        }
                        break;
                    case 4007:
                        l H057 = p.H0(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (H057 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                h2.a.l("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            J0(H057, readInt83, null, 50002, new t0(new org.telegram.utils.twidget.a(readString7, 17), 0));
                            return true;
                        }
                        break;
                    default:
                        return super.onTransact(i7, parcel, parcel2, i10);
                }
        }
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
