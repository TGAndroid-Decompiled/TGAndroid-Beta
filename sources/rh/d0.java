package rh;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dd;
import org.telegram.messenger.fe;
import org.telegram.messenger.k20;
import org.telegram.messenger.l20;
import org.telegram.messenger.p20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.mb0;
import org.telegram.ui.pm0;
public final class d0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, rf.l, fe.e, p20, pm0, t0.e, jk0, l20, ik0, th.m5, th.i7, nh.m, r0.m, qa.a, vj0, ig.s1, CameraController.VideoTakeCallback {
    public final int f46762a;
    public final Object f46763b;

    public d0(Object obj, int i10) {
        this.f46762a = i10;
        this.f46763b = obj;
    }

    @Override
    public void B() {
        float f7;
        vh.s7 s7Var = (vh.s7) this.f46763b;
        TextView textView = s7Var.X0;
        boolean a2 = s7Var.m0.a();
        ImageView imageView = s7Var.W0;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f46763b;
        if (z10) {
            long j10 = i10;
            if (e0Var.f46802z1 != j10) {
                e0Var.f46802z1 = j10;
                e0Var.f46792p1.setText(e0.K0(j10));
            }
            e0Var.J0(true);
        }
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int a2;
        th.o7 o7Var = (th.o7) this.f46763b;
        int i10 = 0;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o7Var.f49353w.getLayoutParams();
        if (!o7Var.f49310c) {
            i10 = j1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (o7Var.f49310c) {
            a2 = j1Var.f46143a.f(2).d;
        } else {
            a2 = j1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = I0.f7766a;
        marginLayoutParams.rightMargin = I0.f7768c;
        th.c7 c7Var = o7Var.f49344s;
        if (c7Var != null) {
            c7Var.requestLayout();
        }
        th.d7 d7Var = o7Var.f49353w;
        if (d7Var != null) {
            d7Var.requestLayout();
        }
        return r0.j1.f46142b;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        th.p1 p1Var = (th.p1) this.f46763b;
        mb0 mb0Var = p1Var.f49097c;
        ArrayList arrayList = p1Var.f49105r;
        th.i0 i0Var = ((th.g0) view).f48999f;
        int i14 = p1Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= i0Var.f49068f.size()) {
                break;
            }
            th.h0 h0Var = (th.h0) i0Var.f49068f.get(i16);
            long j12 = h0Var.f49024g;
            if (j12 > 0 && currentTime - h0Var.d <= th.o.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(h0Var.f49020a));
            }
            i16++;
        }
        th.s0 s0Var = p1Var.P;
        if (s0Var != null) {
            j10 = s0Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            th.h0 h0Var2 = (th.h0) arrayList.get(i17);
            if (!h0Var2.f49021b && h0Var2.e && h0Var2.f49024g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(h0Var2.f49020a))) {
                    j11 = j10;
                    if (p1Var.f49108x != i0Var.f49066b || (i13 = p1Var.f49109y) == 0 || h0Var2.f49020a < i13) {
                        i11 = h0Var2.f49020a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i18++;
            }
            i17++;
            j10 = j11;
        }
        j11 = j10;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    th.h0 h0Var3 = (th.h0) arrayList.get(i15);
                    if (h0Var3.f49021b || !h0Var3.e || h0Var3.f49024g >= j11) {
                        if (hashSet.contains(Integer.valueOf(h0Var3.f49020a))) {
                            i12 = h0Var3.f49020a;
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                    i15++;
                } else {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        p1Var.f49108x = i0Var.f49066b;
        p1Var.f49109y = i12;
        p1Var.D = true;
        s4.l0 itemAnimator = mb0Var.getItemAnimator();
        mb0Var.setItemAnimator(null);
        p1Var.d.i1(i18, mb0Var.getHeight() / 2, true);
        p1Var.e.g(i18);
        mb0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void c(boolean z10) {
        th.x3 x3Var = (th.x3) this.f46763b;
        if (x3Var != null) {
            x3Var.c();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        int i10 = this.f46762a;
        Object obj2 = this.f46763b;
        switch (i10) {
            case 11:
                Long l4 = (Long) number;
                return th.j0.a((th.j0) obj2, (Long) obj);
            default:
                vq0 vq0Var = (vq0) obj2;
                Integer num = (Integer) obj;
                if (((Integer) number).intValue() == -1) {
                    new uh.l(vq0Var.f50273a, dd.L0(2131746708, null), new ph.h1(vq0Var, 18)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void e(int i10) {
        switch (this.f46762a) {
            case 5:
                k20 k20Var = (k20) this.f46763b;
                if (i10 == 1) {
                    k20Var.a(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    k20Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 6:
                ih.s sVar = (ih.s) this.f46763b;
                if (i10 == 1) {
                    sVar.a(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    sVar.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                q70 q70Var = (q70) this.f46763b;
                if (i10 == 1) {
                    q70Var.a(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    q70Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean f(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: rh.d0.f(int, android.view.View):boolean");
    }

    @Override
    public void g() {
        ((vh.c1) this.f46763b).invalidate();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f46762a) {
            case 1:
                ((r20) this.f46763b).a(x1Var.h(i10, true, true));
                return;
            case 13:
                ((Runnable) this.f46763b).run();
                return;
            case 23:
                vh.o8 o8Var = ((vh.e8) ((vh.p) this.f46763b)).R1;
                vh.d8 d8Var = o8Var.X0;
                if (d8Var != null) {
                    d8Var.s(null, null, true);
                }
                vh.s7 s7Var = o8Var.f51687v1;
                if (s7Var != null) {
                    s7Var.n0();
                }
                vh.e8 e8Var = o8Var.f51628c1;
                if (e8Var != null) {
                    e8Var.setHasRoundVideo(false);
                }
                vh.n5 n5Var = o8Var.K1;
                if (n5Var != null) {
                    File file = n5Var.f51559o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        o8Var.K1.f51559o0 = null;
                    }
                    if (o8Var.K1.f51561p0 != null) {
                        try {
                            new File(o8Var.K1.f51561p0).delete();
                        } catch (Exception unused2) {
                        }
                        o8Var.K1.f51561p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((vh.u3) this.f46763b).f52019a.Y1.r();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(qa.b bVar) {
        u9.a aVar = (u9.a) this.f46763b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f50206b.set((u9.a) bVar.get());
    }

    @Override
    public void j(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f46763b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.i0.L(7.0f)) - (org.telegram.messenger.i0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.i0.L(7.0f)) - (org.telegram.messenger.i0.L(14.0f) * pow), org.telegram.messenger.i0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f46762a) {
            case 4:
                e6.b((e6) this.f46763b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
            case 8:
                e8 e8Var = (e8) this.f46763b;
                b51 b51Var = (b51) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                if (b51Var.G instanceof TL_stars.StarsTransaction) {
                    h8.k1(e8Var.getContext(), false, 0L, e8Var.f46890c, (TL_stars.StarsTransaction) b51Var.G, e8Var.f46889b);
                    return;
                }
                return;
            default:
                vh.k7 k7Var = (vh.k7) this.f46763b;
                b51 b51Var2 = (b51) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                int i10 = b51Var2.d;
                vh.n5 n5Var = (vh.n5) b51Var2.G;
                k7Var.c(false, true);
                vh.o8 o8Var = k7Var.O;
                if (n5Var != o8Var.K1 && !o8Var.X1) {
                    o8Var.f51631d1.setSelected(i10);
                    o8Var.X1 = true;
                    org.telegram.utils.twidget.v vVar = new org.telegram.utils.twidget.v(o8Var, i10, 9);
                    vh.s7 s7Var = o8Var.f51687v1;
                    vh.n5 n5Var2 = o8Var.K1;
                    if (s7Var != null && n5Var2 != null) {
                        if (!s7Var.r0()) {
                            vVar.run();
                            return;
                        }
                        n5Var2.f();
                        boolean r02 = s7Var.r0();
                        boolean z10 = s7Var.f51003x0.getPainting().E;
                        Utilities.f14523g.c(new fe(o8Var, s7Var, n5Var2.f51548i0, n5Var2.f51550j0, n5Var2, z10, r02, vVar, 1));
                        return;
                    }
                    vVar.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void l(long j10) {
        ((p3) this.f46763b).h();
    }

    @Override
    public void m(nh.i iVar, float f7, float f10) {
        th.i6 i6Var;
        th.h6 h6Var = (th.h6) this.f46763b;
        if (!h6Var.v.f49091y) {
            iVar.f13853q = new th.g6(h6Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(i6Var.getHeight(), 2.0d) + Math.pow(i6Var.getWidth(), 2.0d));
            ArrayList arrayList = h6Var.f49050i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((nh.i) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean o(m2.t tVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f46763b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((t0.h) tVar.f12685b).c();
                Parcelable parcelable = (Parcelable) ((t0.h) tVar.f12685b).f();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = (t0.h) tVar.f12685b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            dVar = new j2.k(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f46122b = clipData;
            eVar.f46123c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.d());
        dVar.setExtras(bundle);
        if (r0.h0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        vh.o7 o7Var = (vh.o7) this.f46763b;
        vh.o8 o8Var = o7Var.f51618a;
        vh.r4 r4Var = o8Var.O0;
        int i10 = o8Var.f51626c;
        if (r4Var != null) {
            r4Var.g(true);
        }
        if (o8Var.p0()) {
            o8Var.f51676s.d();
        }
        if (o8Var.G1 != null && o8Var.B0 != null) {
            o8Var.Q1 = false;
            o8Var.R1 = false;
            vh.o4 o4Var = o8Var.C0;
            if (o4Var != null) {
                o4Var.c(false);
            }
            if (j10 <= 800) {
                o8Var.g(false, true);
                o8Var.c0(false);
                o8Var.J0.b(false, true);
                vh.r4 r4Var2 = o8Var.O0;
                if (r4Var2 != null) {
                    r4Var2.g(true);
                }
                try {
                    o8Var.G1.delete();
                    o8Var.G1 = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                }
                return;
            }
            o8Var.h0(false, true);
            vh.n5 o10 = vh.n5.o(o8Var.G1, str, j10);
            o10.J0 = o8Var.f51686v0;
            o10.K0 = o8Var.f51690w0;
            o10.B();
            o8Var.g(false, true);
            o8Var.c0(false);
            o8Var.J0.b(false, true);
            vh.r4 r4Var3 = o8Var.O0;
            if (r4Var3 != null) {
                r4Var3.g(true);
            }
            if (o8Var.A0.j()) {
                o8Var.G1 = null;
                o10.P = 1.0f;
                if (o8Var.A0.l(o10)) {
                    vh.n5 a2 = vh.n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
                    o8Var.K1 = a2;
                    vh.x6.a(i10, a2);
                    o8Var.L1 = false;
                    int videoWidth = o8Var.B0.getVideoWidth();
                    int videoHeight = o8Var.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        vh.n5 n5Var = o8Var.K1;
                        n5Var.f51552k0 = videoWidth;
                        n5Var.f51554l0 = videoHeight;
                        n5Var.A();
                    }
                }
                o8Var.l0(true);
                return;
            }
            o8Var.K1 = o10;
            vh.x6.a(i10, o10);
            o8Var.L1 = false;
            int videoWidth2 = o8Var.B0.getVideoWidth();
            int videoHeight2 = o8Var.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                vh.n5 n5Var2 = o8Var.K1;
                n5Var2.f51552k0 = videoWidth2;
                n5Var2.f51554l0 = videoHeight2;
                n5Var2.A();
            }
            o8Var.K(new vh.m7(o7Var, 3), 0L);
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        View view = ((g4) this.f46763b).f46968b;
        if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).U();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
