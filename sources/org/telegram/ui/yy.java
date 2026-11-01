package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yy implements Runnable {
    public final int f43745a;
    public final Object f43746b;

    public yy(Object obj, int i10) {
        this.f43745a = i10;
        this.f43746b = obj;
    }

    @Override
    public final void run() {
        int i10;
        q60 q60Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f43745a;
        Object obj = this.f43746b;
        switch (i11) {
            case 0:
                ((fz) obj).f35860a.getBackground().setState(new int[0]);
                return;
            case 1:
                y00 y00Var = (y00) obj;
                org.telegram.messenger.i0.r(y00Var.f43513n0);
                y00Var.f43496a.a(false, true);
                return;
            case 2:
                y00 y00Var2 = ((n00) obj).f39660a;
                y00Var2.h(y00Var2.E, y00Var2.F, y00Var2.H, y00Var2.G, y00Var2.D, y00Var2.J, y00Var2.f43521x, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((ag.b1) obj).f469f3).getMessagesController().g3();
                return;
            case 4:
                a10 a10Var = (a10) obj;
                a10Var.f35522s.a();
                a10Var.f35520n.invalidate();
                a10Var.H.g0(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.sz) obj).f30470f;
                if (!org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q()) {
                    ArrayList S0 = filtersSetupActivity.getMessagesController().S0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < S0.size()) {
                            if (((org.telegram.messenger.bp) S0.get(i12)).e() && i12 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33339b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.bp) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.bp) arrayList.get(i13)).f15003f = i13;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f33338a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i10];
                                objArr[0] = org.telegram.messenger.dd.L0(2131750808, null);
                                a02.J(2131624017, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("LimitReachedReorderFolder", null, 2131748954, objArr)), org.telegram.messenger.dd.L0(2131747048, null), 5000, false, new z00(filtersSetupActivity, 2)).j();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 6:
                a50 a50Var = ((n20) obj).f39678b;
                a50Var.f35580a4 = null;
                a50Var.M1(a50Var.f35677w3, true);
                return;
            case 7:
                i40 i40Var = (i40) obj;
                a50 a50Var2 = i40Var.f37936f;
                z20 z20Var = a50Var2.f35610i1;
                org.telegram.messenger.jc jcVar = i40Var.d;
                if (jcVar != null) {
                    z20Var.K0 = jcVar;
                    z20Var.f31300q1 = null;
                    z20Var.f31301r1 = null;
                    i40Var.d = null;
                }
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(a50Var2.f35620k1.f15043a).L0(Long.valueOf(-i40Var.e));
                org.telegram.messenger.jc a2 = org.telegram.messenger.jc.a(0, L0);
                org.telegram.messenger.jc a10 = org.telegram.messenger.jc.a(1, L0);
                if (org.telegram.messenger.jc.e(i40Var.f37934b) == null) {
                    a10 = org.telegram.messenger.jc.e(i40Var.f37935c);
                }
                z20Var.setCreateThumbFromParent(false);
                z20Var.H(null, a2, a10, true);
                i40Var.f37935c = null;
                i40Var.f37934b = null;
                org.telegram.messenger.i0.a4(a50Var2.H1);
                i40Var.a(1.0f);
                return;
            case 8:
                bi.t0 t0Var = (bi.t0) ((g.b) obj).f7143i;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
            case 9:
                b60 b60Var = (b60) obj;
                b60Var.D = null;
                b60Var.E = null;
                b60Var.F = null;
                b60Var.G = null;
                b60Var.I = null;
                b60Var.H = null;
                b60Var.J = 0.0d;
                b60Var.e0(false, true);
                b60Var.d.j(null, null, b60Var.f35958r, null);
                b60Var.f35956f.setAnimation(b60Var.R);
                b60Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(((e60) obj).f36747c), 2131623999, 36);
                return;
            case 11:
                r60 r60Var = (r60) obj;
                q60 q60Var2 = r60Var.I;
                int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                int i15 = q60.D;
                q60Var2.a(2131231536, 17, x02, true);
                r60Var.I.c();
                q60 q60Var3 = r60Var.I;
                q60Var3.b(q60Var3.f40698w, 23, true);
                r60Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                return;
            case 12:
                p60 p60Var = (p60) obj;
                p60Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r60 r60Var2 = (r60) p60Var.f40377b;
                Intro.setPage(r60Var2.H);
                Intro.setDate(((float) (currentTimeMillis - r60Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                q60 q60Var4 = r60Var2.I;
                if (q60Var4 != null && q60Var4.isAlive() && (eGLDisplay = (q60Var = r60Var2.I).f40693c) != null && (eGLSurface = q60Var.f40694f) != null) {
                    try {
                        q60Var.f40692b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                r60 r60Var3 = (r60) ((org.telegram.messenger.zs) obj).f19760c;
                r60Var3.presentFragment(new gf0(), true);
                r60Var3.M = true;
                return;
            case 14:
                ((q60) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                w60 w60Var = (w60) obj;
                w60Var.f42680f.e.smoothScrollTo(0, w60Var.getHeight());
                return;
            case 16:
                ((gf.e) obj).b();
                return;
            case 17:
                m90 m90Var = (m90) obj;
                LaunchActivity launchActivity = m90Var.f39485c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.E();
                if (z10 != launchActivity.O0) {
                    m90Var.requestLayout();
                    return;
                }
                return;
            case 18:
                ((n90) obj).f39775a.C0.setVisibility(8);
                return;
            case 19:
                ra0 ra0Var = (ra0) obj;
                qh.x0 x0Var = ra0Var.d;
                if (x0Var != null) {
                    ra0Var.i0(x0Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.uk0 currentListView = ((xb0) ((vb0) obj).f42474i0).S0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ad0) obj).f35754b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                dd0 dd0Var = (dd0) obj;
                org.telegram.ui.Components.fi0 fi0Var = dd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = dd0Var.f36561a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    gf0.a1(dd0Var.D, editTextBoldCursor2);
                    fi0Var.getAnimatedDrawable().N(0, false, false);
                    fi0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.fi0) obj).d();
                return;
            case 24:
                ((kd0) ((org.telegram.ui.ActionBar.n0) obj).H1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                kd0 kd0Var = (kd0) ((e6.r) obj).f6309b;
                double d = kd0Var.Q;
                je0 je0Var = kd0Var.f38848w;
                kd0Var.Q = currentTimeMillis2;
                int i16 = (int) (kd0Var.P - (currentTimeMillis2 - d));
                kd0Var.P = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    je0Var.setTextSize(1, 13.0f);
                    int i20 = kd0Var.E;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            je0Var.setText(org.telegram.messenger.dd.a0(null, null, 2131745314, Integer.valueOf(i18), Integer.valueOf(i19)));
                            return;
                        }
                        return;
                    }
                    je0Var.setText(org.telegram.messenger.dd.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                    return;
                }
                kd0Var.q();
                int i21 = kd0Var.E;
                if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                    je0Var.setTextSize(1, 15.0f);
                    int i22 = kd0Var.E;
                    if (i22 == 4) {
                        je0Var.setText(org.telegram.messenger.dd.L0(2131746194, null));
                    } else if (i22 == 15) {
                        je0Var.setText(org.telegram.messenger.dd.L0(2131751448, null));
                    } else if (i22 != 11 && i22 != 3) {
                        je0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.dd.L0(2131746195, null), true, 0.0f, 0.0f));
                    } else {
                        je0Var.setText(org.telegram.messenger.dd.L0(2131746193, null));
                    }
                    int i23 = org.telegram.ui.ActionBar.t6.P9;
                    org.telegram.ui.ActionBar.a7.V(je0Var, i23, null);
                    je0Var.setTag(2131296386, Integer.valueOf(i23));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                le0 le0Var = ((ke0) obj).f38858b;
                double d10 = currentTimeMillis3 - le0Var.f39239d0;
                le0Var.f39239d0 = currentTimeMillis3;
                int i24 = (int) (le0Var.f39236b0 - d10);
                le0Var.f39236b0 = i24;
                if (i24 <= 1000) {
                    le0.o(le0Var);
                    le0Var.f39260w.setVisibility(8);
                    je0 je0Var2 = le0Var.f39262y;
                    if (je0Var2 != null) {
                        je0Var2.setVisibility(0);
                    }
                    le0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                le0 le0Var2 = ((ke0) obj).f38858b;
                double d11 = le0Var2.f39238c0;
                je0 je0Var3 = le0Var2.f39260w;
                le0Var2.f39238c0 = currentTimeMillis4;
                int i25 = (int) (le0Var2.f39234a0 - (currentTimeMillis4 - d11));
                le0Var2.f39234a0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = le0Var2.f39245i0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (le0Var2.f39244h0 == 2 && (i29 == 2 || i29 == 17 || i29 == 16)) {
                            je0Var3.setText(org.telegram.messenger.dd.a0("ResendSmsAvailableIn", null, 2131746136, Integer.valueOf(i27), Integer.valueOf(i28)));
                            return;
                        } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                            je0Var3.setText(org.telegram.messenger.dd.a0("SmsAvailableIn", null, 2131745315, Integer.valueOf(i27), Integer.valueOf(i28)));
                            return;
                        } else {
                            return;
                        }
                    }
                    je0Var3.setText(org.telegram.messenger.dd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                    return;
                }
                le0Var2.u();
                int i30 = le0Var2.f39245i0;
                if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                    if (i30 == 4) {
                        je0Var3.setText(org.telegram.messenger.dd.L0(2131746194, "RequestCallButton"));
                    } else if (i30 != 11 && i30 != 3) {
                        je0Var3.setText(org.telegram.messenger.dd.L0(2131746192, "RequestSmsButton"));
                    } else {
                        je0Var3.setText(org.telegram.messenger.dd.L0(2131746193, null));
                    }
                    int i31 = org.telegram.ui.ActionBar.t6.P9;
                    org.telegram.ui.ActionBar.a7.V(je0Var3, i31, null);
                    je0Var3.setTag(2131296386, Integer.valueOf(i31));
                    return;
                }
                return;
            case 28:
                ((v50) obj).run();
                return;
            default:
                qf0.j((qf0) obj);
                return;
        }
    }
}
