package ph;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.qk0;
public final class j5 implements ia, g5.h0, OnSuccessListener, ra.m, r4.h, o4.m0, tf.j1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, vh.g0, vh.c1 {
    public final int f41781a;
    public Object f41782b;

    public j5(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f41781a = i10;
        this.f41782b = obj;
    }

    @Override
    public void A(g5.j0 j0Var, long j10, long j11) {
        int size;
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.f41782b;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43289n.getClass();
        gVar.f43293r.n(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f6409f;
        s4.c cVar2 = gVar.I;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f43995m.size();
        }
        long j13 = cVar.b(0).f44011b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).f44011b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f43995m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                } else {
                    gVar.N = 0;
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.f43289n.n3(p0Var.f6408c)) {
                gVar.E.postDelayed(gVar.f43297w, Math.min((gVar.N - 1) * 1000, 5000));
                return;
            }
            gVar.D = new IOException();
            return;
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.f43296u) {
            try {
                if (p0Var.f6407b.f6401a == gVar.G) {
                    Uri uri2 = gVar.I.f43993k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.f6458c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == 0) {
            s4.c cVar3 = gVar.I;
            if (cVar3.d) {
                b6.h hVar = cVar3.f43991i;
                if (hVar != null) {
                    String str = hVar.f1598b;
                    if (!h5.d0.a(str, "urn:mpeg:dash:utc:direct:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                    gVar.u(true);
                                    return;
                                }
                                gVar.t();
                                return;
                            }
                            g5.p0 p0Var2 = new g5.p0(gVar.A, Uri.parse(hVar.f1599c), 5, new z9.d(21));
                            gVar.B.f(p0Var2, new r4.d(gVar), 1);
                            gVar.f43293r.t(new o4.j(p0Var2.f6407b), p0Var2.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        g5.p0 p0Var3 = new g5.p0(gVar.A, Uri.parse(hVar.f1599c), 5, new Object());
                        gVar.B.f(p0Var3, new r4.d(gVar), 1);
                        gVar.f43293r.t(new o4.j(p0Var3.f6407b), p0Var3.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    }
                    try {
                        gVar.M = h5.d0.J(hVar.f1599c) - gVar.L;
                        gVar.u(true);
                        return;
                    } catch (j3.r1 e) {
                        h5.a.p("DashMediaSource", "Failed to resolve time offset.", e);
                        gVar.u(true);
                        return;
                    }
                }
                gVar.t();
                return;
            }
            gVar.u(true);
            return;
        }
        gVar.P += i10;
        gVar.u(true);
    }

    @Override
    public void B(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.G = f10;
        u6Var.f42418j = true;
        l5Var.c();
    }

    @Override
    public void C(long j10, boolean z4) {
        l5 l5Var = (l5) this.f41782b;
        if (!z4) {
            l5Var.m(j10);
            return;
        }
        i71 i71Var = l5Var.e;
        if (i71Var != null) {
            i71Var.L(j10, true);
        } else if (l5Var.j()) {
            l5Var.B.m(j10, true);
        } else {
            i71 i71Var2 = l5Var.f41910y;
            if (i71Var2 != null) {
                i71Var2.L(j10, false);
            }
        }
    }

    @Override
    public void D0(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.f42438t0 = f10;
        u6Var.f42418j = true;
        l5Var.y(true);
    }

    @Override
    public vh.a E() {
        return ((vh.w0) this.f41782b).f46283a;
    }

    @Override
    public boolean F(vh.d1 d1Var) {
        return false;
    }

    @Override
    public void G(vh.d1 d1Var) {
        vh.a aVar;
        vh.a5 a5Var = (vh.a5) this.f41782b;
        vh.y4 y4Var = a5Var.f45806s;
        if (y4Var != null && (aVar = a5Var.f46283a) != null) {
            vh.r3 r3Var = ((vh.x2) y4Var).f46278a;
            ArrayList arrayList = r3Var.f46120i3;
            long j10 = aVar.f45790t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((vh.a) arrayList.get(i11)).f45781k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    vh.c2 c2Var = r3Var.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    vh.a aVar2 = new vh.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f45781k;
                    ArrayList arrayList3 = aVar2.f45781k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        android.support.v4.media.a.u(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    r3Var.s4();
                    r3Var.V2.N(false);
                    vh.c2 c2Var2 = r3Var.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    r3Var.post(new vh.j2(r3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void G0(int i10, long j10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var != null && (arrayList = u6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((u6) l5Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void H() {
        l5 l5Var = (l5) this.f41782b;
        l5Var.s(null, null, true);
        da daVar = ((s9) l5Var).f42313z0;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.s(null, null, true);
        }
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            h9Var.q0();
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.setHasRoundVideo(false);
        }
        u6 u6Var = daVar.H1;
        if (u6Var != null) {
            File file = u6Var.f42428o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.H1.f42428o0 = null;
            }
            if (daVar.H1.f42430p0 != null) {
                try {
                    new File(daVar.H1.f42430p0).delete();
                } catch (Exception unused2) {
                }
                daVar.H1.f42430p0 = null;
            }
        }
    }

    @Override
    public a0.h I() {
        return null;
    }

    @Override
    public void I0(long j10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.D = j10;
        u6Var.f42418j = true;
        l5Var.w(true);
    }

    @Override
    public void J(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.f42436s0 = f10;
        u6Var.f42418j = true;
        l5Var.y(true);
    }

    @Override
    public void K(boolean z4) {
        l5 l5Var = (l5) this.f41782b;
        if (l5Var.j()) {
            l5Var.B.getClass();
        }
        l5Var.x(-4, z4);
    }

    @Override
    public boolean L() {
        vh.w0 w0Var = (vh.w0) this.f41782b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.f46283a;
            if (m3Var.f46014a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        vh.w0 w0Var = (vh.w0) this.f41782b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.f46283a;
            vh.c2 c2Var = m3Var.f46014a.G3;
            if (c2Var != null) {
                c2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void N(Editable editable) {
        ((vh.a5) this.f41782b).h();
    }

    @Override
    public void O(vh.d1 d1Var, int i10, int i11) {
        vh.y4 y4Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        vh.a5 a5Var = (vh.a5) this.f41782b;
        if (!a5Var.f45807w && i10 != i11 && (y4Var = a5Var.f45806s) != null && (textSelectionHelper = ((vh.x2) y4Var).f46278a.getTextSelectionHelper()) != null) {
            d1Var.post(new org.telegram.messenger.p6(this, d1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public void P() {
        vh.w0 w0Var = (vh.w0) this.f41782b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.f46283a;
            vh.r3 r3Var = m3Var.f46014a;
            vh.c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.f46112e3.onContentChanged();
        }
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public boolean R(boolean z4) {
        return false;
    }

    @Override
    public long S() {
        return 0L;
    }

    @Override
    public void T(ArrayList arrayList) {
        tf.u0 u0Var = (tf.u0) this.f41782b;
        String str = u0Var.W;
        if (str != null) {
            u0Var.U(str, u0Var.Z, u0Var.f44837a0, u0Var.Y, u0Var.X);
        }
    }

    @Override
    public long U(long j10) {
        return 1L;
    }

    @Override
    public void V(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var != null && (arrayList = u6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((u6) l5Var.d.T.get(i10)).P = f10;
        }
    }

    @Override
    public long W(long j10, long j11) {
        return 1L;
    }

    public q5.o X() {
        q5.o oVar = (q5.o) this.f41782b;
        if (oVar.f42839a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f42842f) && oVar.f42842f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void Y(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.P = f10;
        l5Var.c();
    }

    @Override
    public void Z(o4.n0 n0Var) {
        t4.r rVar = (t4.r) n0Var;
        t4.l lVar = (t4.l) this.f41782b;
        lVar.D.Z(lVar);
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    @Override
    public void a0() {
        vh.w0 w0Var = (vh.w0) this.f41782b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.f46283a;
            vh.r3.O1(m3Var.f46014a);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f41781a) {
            case 11:
                u5.r rVar = new u5.r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) this.f41782b);
                iVar.R0(M0, 7);
                return;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.f46468a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, (l5.e) this.f41782b);
                iVar2.J0(I0, 1);
                return;
        }
    }

    @Override
    public void b(int i10) {
        y yVar = ((l5) this.f41782b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                x xVar = (x) obj;
                if (xVar.f42518a == i10) {
                    xVar.f42519b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void b0(float f10, boolean z4) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var != null) {
            u6Var.Z = f10;
            u6Var.f42418j = true;
            i71 i71Var = l5Var.e;
            if (i71Var != null && i71Var.p() != -9223372036854775807L) {
                l5Var.m(f10 * ((float) l5Var.e.p()));
            }
        }
    }

    @Override
    public void c(vh.d1 d1Var) {
        switch (this.f41781a) {
            case 14:
                vh.m3 m3Var = ((vh.w0) this.f41782b).P;
                if (m3Var != null) {
                    vh.r3 r3Var = m3Var.f46014a;
                    vh.r3.M1(r3Var, d1Var);
                    r3Var.f46112e3.e(d1Var, true);
                    return;
                }
                return;
            default:
                vh.y4 y4Var = ((vh.a5) this.f41782b).f45806s;
                if (y4Var != null) {
                    vh.r3 r3Var2 = ((vh.x2) y4Var).f46278a;
                    vh.r3.M1(r3Var2, d1Var);
                    r3Var2.f46112e3.e(d1Var, true);
                    return;
                }
                return;
        }
    }

    public l7.w0 c0(n7.qa r41) {
        throw new UnsupportedOperationException("Method not decompiled: ph.j5.c0(n7.qa):l7.w0");
    }

    @Override
    public boolean d() {
        return false;
    }

    public pb.d d0(cb.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: ph.j5.d0(cb.m):pb.d");
    }

    @Override
    public void e0(long j10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.f42434r0 = j10;
        u6Var.f42418j = true;
        l5Var.y(true);
    }

    @Override
    public androidx.lifecycle.p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void f0(boolean z4) {
        dg.b3 b3Var;
        da daVar = ((s9) ((l5) this.f41782b)).f42313z0;
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            dg.b3 b3Var2 = null;
            if (!z4 && (h9Var.getSelectedEntity() instanceof dg.b3)) {
                daVar.f41531s1.D0(null, true);
            } else if (z4 && !(daVar.f41531s1.getSelectedEntity() instanceof dg.b3)) {
                w4 w4Var = daVar.f41531s1.O0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < w4Var.getChildCount()) {
                        View childAt = w4Var.getChildAt(i11);
                        if (childAt instanceof dg.b3) {
                            b3Var = (dg.b3) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b3Var = null;
                        break;
                    }
                }
                if (b3Var != null) {
                    h9 h9Var2 = daVar.f41531s1;
                    w4 w4Var2 = h9Var2.O0;
                    while (true) {
                        if (i10 >= w4Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = w4Var2.getChildAt(i10);
                        if (childAt2 instanceof dg.b3) {
                            b3Var2 = (dg.b3) childAt2;
                            break;
                        }
                        i10++;
                    }
                    h9Var2.D0(b3Var2, true);
                }
            }
        }
    }

    @Override
    public void g(int i10) {
        ((tf.u0) this.f41782b).l();
    }

    public void g0() {
        t4.r[] rVarArr;
        t4.r[] rVarArr2;
        t4.l lVar = (t4.l) this.f41782b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (t4.r rVar : lVar.G) {
            rVar.d();
            i11 += rVar.V.f16421a;
        }
        o4.s0[] s0VarArr = new o4.s0[i11];
        int i12 = 0;
        for (t4.r rVar2 : lVar.G) {
            rVar2.d();
            int i13 = rVar2.V.f16421a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new o4.t0(s0VarArr);
        lVar.D.n(lVar);
    }

    @Override
    public void h() {
        vh.w0 w0Var = (vh.w0) this.f41782b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.r3.P1(m3Var.f46014a, w0Var.f46283a);
        }
    }

    public byte h0() {
        int read = ((com.google.firebase.messaging.d) this.f41782b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int i0() {
        return ((h0() & 255) << 24) | ((h0() & 255) << 16) | ((h0() & 255) << 8) | (h0() & 255);
    }

    @Override
    public long j(long j10, long j11) {
        return 0L;
    }

    public int j0() {
        return ((h0() & Byte.MAX_VALUE) << 21) | ((h0() & Byte.MAX_VALUE) << 14) | ((h0() & Byte.MAX_VALUE) << 7) | (h0() & Byte.MAX_VALUE);
    }

    @Override
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    public void k0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f41782b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public s4.j l(long j10) {
        return (s4.j) this.f41782b;
    }

    @Override
    public c4.e m(g5.j0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: ph.j5.m(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public boolean o(vh.d1 d1Var) {
        return false;
    }

    @Override
    public void o0(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var != null && (arrayList = u6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((u6) l5Var.d.T.get(i10)).V = f10;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        com.google.android.gms.internal.cast.d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        r5.a aVar = (r5.a) this.f41782b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.o0.f3115j) {
            Context context = aVar.f43334a;
            u5.s sVar = aVar.f43337f;
            com.google.android.gms.internal.cast.o0 o0Var = new com.google.android.gms.internal.cast.o0(context, sVar, aVar.f43336c, aVar.f43340j, aVar.f43338g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z4) {
                    i10 = 0;
                    z4 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k10 = vh.v2.k(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            o0Var.h = i11;
            y2.q.b(context);
            o0Var.f3120g = y2.q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), com.google.android.gms.internal.cast.z.f3218a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.f2885c = new qk0(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 14);
                e.d = new y5.c[]{q5.y.f42881c};
                e.f2884b = false;
                e.f2883a = 8426;
                Task e6 = sVar.e(0, e.e());
                ?? obj2 = new Object();
                obj2.f6994b = o0Var;
                obj2.f6995c = packageName;
                obj2.f6993a = i10;
                obj2.d = sharedPreferences;
                e6.addOnSuccessListener(obj2);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.d2.f3019i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.f3021k == null) {
                            com.google.android.gms.internal.cast.d2.f3021k = new com.google.android.gms.internal.cast.d2(sharedPreferences, o0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.f3021k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f3024c;
                SharedPreferences sharedPreferences2 = d2Var.f3023b;
                HashSet hashSet = d2Var.f3025f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f3026g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.f3020j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b11 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    b6.m.h(d2Var.e);
                    b6.m.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.d2.a(com.google.android.gms.internal.cast.d1.CAST_CONTEXT);
            }
        }
    }

    public void p(HashMap hashMap) {
        if (((SparseArray) this.f41782b) == null) {
            this.f41782b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f41782b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public long q(long j10, long j11) {
        return 0L;
    }

    @Override
    public void r0(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.F = f10;
        u6Var.f42418j = true;
        l5Var.w(true);
    }

    @Override
    public void s(g5.j0 j0Var, long j10, long j11, boolean z4) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.f41782b;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43289n.getClass();
        gVar.f43293r.l(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public Object s2() {
        Constructor constructor = (Constructor) this.f41782b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            k7.a8 a8Var = ua.c.f45204a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e6);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void t0(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.E = f10;
        u6Var.f42418j = true;
        l5Var.w(true);
    }

    @Override
    public org.telegram.ui.Cells.m9 u() {
        vh.m3 m3Var = ((vh.w0) this.f41782b).P;
        if (m3Var == null) {
            return null;
        }
        return m3Var.f46014a.getTextSelectionHelper();
    }

    @Override
    public void u0(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var != null && (arrayList = u6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((u6) l5Var.d.T.get(i10)).W = f10;
        }
    }

    @Override
    public void v(float f10) {
        l5 l5Var = (l5) this.f41782b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.f42440u0 = f10;
        u6Var.f42418j = true;
        l5Var.c();
    }

    @Override
    public void v0(float f10) {
        u6 u6Var = ((l5) this.f41782b).d;
        if (u6Var == null) {
            return;
        }
        u6Var.f42399a0 = f10;
        u6Var.f42418j = true;
    }

    @Override
    public boolean w() {
        return true;
    }

    @Override
    public void w0() {
        ((l5) this.f41782b).p(null);
    }

    @Override
    public androidx.lifecycle.p0 x(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f41782b) {
            if (cVar.f45554a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void y(CharSequence charSequence) {
        vh.m3 m3Var = ((vh.w0) this.f41782b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f46014a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public org.telegram.ui.Cells.l9 z() {
        return (vh.w0) this.f41782b;
    }

    public j5(Object obj, int i10) {
        this.f41781a = i10;
        this.f41782b = obj;
    }

    public j5(MediaInfo mediaInfo) {
        this.f41781a = 1;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f41782b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public j5(l6.a aVar) {
        this.f41781a = 18;
        b6.m.h(aVar);
        this.f41782b = aVar;
    }

    public j5(JSONObject jSONObject) {
        this.f41781a = 1;
        this.f41782b = new q5.o(jSONObject);
    }

    public j5(int i10) {
        this.f41781a = i10;
        switch (i10) {
            case 7:
                this.f41782b = new j5(9);
                return;
            case 9:
                this.f41782b = new o2.o(rb.a.h, 20);
                return;
            case 13:
                return;
            default:
                this.f41782b = new h5.w(10);
                return;
        }
    }

    public j5(v1.c[] initializers) {
        this.f41781a = 12;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f41782b = initializers;
    }

    @Override
    public void r() {
    }

    @Override
    public void D(CharSequence charSequence) {
    }

    @Override
    public long e(long j10, long j11) {
        return j11;
    }

    @Override
    public void i(int i10, int i11) {
    }
}
