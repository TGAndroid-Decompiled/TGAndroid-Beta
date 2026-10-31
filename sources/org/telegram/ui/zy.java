package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zy implements Runnable {
    public final int f44251a;
    public final Object f44252b;

    public zy(Object obj, int i10) {
        this.f44251a = i10;
        this.f44252b = obj;
    }

    @Override
    public final void run() {
        int i10;
        r60 r60Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f44251a;
        Object obj = this.f44252b;
        switch (i11) {
            case 0:
                ((gz) obj).f36324a.getBackground().setState(new int[0]);
                return;
            case 1:
                z00 z00Var = (z00) obj;
                org.telegram.messenger.i0.r(z00Var.f43956n0);
                z00Var.f43939a.a(false, true);
                return;
            case 2:
                z00 z00Var2 = ((o00) obj).f40089a;
                z00Var2.h(z00Var2.E, z00Var2.F, z00Var2.H, z00Var2.G, z00Var2.D, z00Var2.J, z00Var2.f43964x, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((ag.b1) obj).f469f3).getMessagesController().g3();
                return;
            case 4:
                b10 b10Var = (b10) obj;
                b10Var.f35938s.a();
                b10Var.f35936n.invalidate();
                b10Var.H.f0(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.sz) obj).f30386f;
                if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q()) {
                    ArrayList S0 = filtersSetupActivity.getMessagesController().S0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < S0.size()) {
                            if (((org.telegram.messenger.ap) S0.get(i12)).e() && i12 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33332b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.ap) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.ap) arrayList.get(i13)).f14648f = i13;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.f0(true);
                                }
                                filtersSetupActivity.f33331a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i10];
                                objArr[0] = org.telegram.messenger.cd.L0(2131750808, null);
                                a02.J(2131624017, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("LimitReachedReorderFolder", null, 2131748954, objArr)), org.telegram.messenger.cd.L0(2131747048, null), 5000, false, new a10(filtersSetupActivity, 2)).j();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                filtersSetupActivity.e0(null);
                return;
            case 6:
                b50 b50Var = ((o20) obj).f40118b;
                b50Var.f35996a4 = null;
                b50Var.M1(b50Var.f36093w3, true);
                return;
            case 7:
                j40 j40Var = (j40) obj;
                b50 b50Var2 = j40Var.f38426f;
                a30 a30Var = b50Var2.f36026i1;
                org.telegram.messenger.ic icVar = j40Var.d;
                if (icVar != null) {
                    a30Var.K0 = icVar;
                    a30Var.f30941q1 = null;
                    a30Var.f30942r1 = null;
                    j40Var.d = null;
                }
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(b50Var2.f36036k1.f14863a).L0(Long.valueOf(-j40Var.e));
                org.telegram.messenger.ic a2 = org.telegram.messenger.ic.a(0, L0);
                org.telegram.messenger.ic a10 = org.telegram.messenger.ic.a(1, L0);
                if (org.telegram.messenger.ic.e(j40Var.f38424b) == null) {
                    a10 = org.telegram.messenger.ic.e(j40Var.f38425c);
                }
                a30Var.setCreateThumbFromParent(false);
                a30Var.H(null, a2, a10, true);
                j40Var.f38425c = null;
                j40Var.f38424b = null;
                org.telegram.messenger.i0.a4(b50Var2.H1);
                j40Var.a(1.0f);
                return;
            case 8:
                bi.t0 t0Var = (bi.t0) ((g.b) obj).f7142i;
                if (t0Var != null) {
                    t0Var.invalidate();
                    return;
                }
                return;
            case 9:
                c60 c60Var = (c60) obj;
                c60Var.D = null;
                c60Var.E = null;
                c60Var.F = null;
                c60Var.G = null;
                c60Var.I = null;
                c60Var.H = null;
                c60Var.J = 0.0d;
                c60Var.d0(false, true);
                c60Var.d.j(null, null, c60Var.f36396r, null);
                c60Var.f36394f.setAnimation(c60Var.R);
                c60Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(((f60) obj).f37186c), 2131623999, 36);
                return;
            case 11:
                s60 s60Var = (s60) obj;
                r60 r60Var2 = s60Var.I;
                int i14 = org.telegram.ui.ActionBar.t6.f20929d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                int i15 = r60.D;
                r60Var2.a(2131231536, 17, x02, true);
                s60Var.I.c();
                r60 r60Var3 = s60Var.I;
                r60Var3.b(r60Var3.f41146w, 23, true);
                s60Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                return;
            case 12:
                q60 q60Var = (q60) obj;
                q60Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                s60 s60Var2 = (s60) q60Var.f40876b;
                Intro.setPage(s60Var2.H);
                Intro.setDate(((float) (currentTimeMillis - s60Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                r60 r60Var4 = s60Var2.I;
                if (r60Var4 != null && r60Var4.isAlive() && (eGLDisplay = (r60Var = s60Var2.I).f41141c) != null && (eGLSurface = r60Var.f41142f) != null) {
                    try {
                        r60Var.f41140b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                s60 s60Var3 = (s60) ((org.telegram.messenger.ys) obj).f19432c;
                s60Var3.presentFragment(new hf0(), true);
                s60Var3.M = true;
                return;
            case 14:
                ((r60) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                x60 x60Var = (x60) obj;
                x60Var.f43455f.e.smoothScrollTo(0, x60Var.getHeight());
                return;
            case 16:
                ((gf.e) obj).b();
                return;
            case 17:
                n90 n90Var = (n90) obj;
                LaunchActivity launchActivity = n90Var.f39882c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.E();
                if (z10 != launchActivity.O0) {
                    n90Var.requestLayout();
                    return;
                }
                return;
            case 18:
                ((o90) obj).f40204a.C0.setVisibility(8);
                return;
            case 19:
                sa0 sa0Var = (sa0) obj;
                qh.x0 x0Var = sa0Var.d;
                if (x0Var != null) {
                    sa0Var.h0(x0Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.tk0 currentListView = ((yb0) ((wb0) obj).f42922i0).S0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((bd0) obj).f36177b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                ed0 ed0Var = (ed0) obj;
                org.telegram.ui.Components.ei0 ei0Var = ed0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ed0Var.f37023a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    hf0.Z0(ed0Var.D, editTextBoldCursor2);
                    ei0Var.getAnimatedDrawable().N(0, false, false);
                    ei0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.ei0) obj).d();
                return;
            case 24:
                ((ld0) ((org.telegram.ui.ActionBar.n0) obj).H1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ld0 ld0Var = (ld0) ((e6.r) obj).f6309b;
                double d = ld0Var.Q;
                ke0 ke0Var = ld0Var.f39184w;
                ld0Var.Q = currentTimeMillis2;
                int i16 = (int) (ld0Var.P - (currentTimeMillis2 - d));
                ld0Var.P = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    ke0Var.setTextSize(1, 13.0f);
                    int i20 = ld0Var.E;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            ke0Var.setText(org.telegram.messenger.cd.a0(null, null, 2131745314, Integer.valueOf(i18), Integer.valueOf(i19)));
                            return;
                        }
                        return;
                    }
                    ke0Var.setText(org.telegram.messenger.cd.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                    return;
                }
                ld0Var.q();
                int i21 = ld0Var.E;
                if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                    ke0Var.setTextSize(1, 15.0f);
                    int i22 = ld0Var.E;
                    if (i22 == 4) {
                        ke0Var.setText(org.telegram.messenger.cd.L0(2131746194, null));
                    } else if (i22 == 15) {
                        ke0Var.setText(org.telegram.messenger.cd.L0(2131751448, null));
                    } else if (i22 != 11 && i22 != 3) {
                        ke0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131746195, null), true, 0.0f, 0.0f));
                    } else {
                        ke0Var.setText(org.telegram.messenger.cd.L0(2131746193, null));
                    }
                    int i23 = org.telegram.ui.ActionBar.t6.P9;
                    org.telegram.ui.ActionBar.a7.V(ke0Var, i23, null);
                    ke0Var.setTag(2131296386, Integer.valueOf(i23));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                me0 me0Var = ((le0) obj).f39224b;
                double d10 = currentTimeMillis3 - me0Var.f39662d0;
                me0Var.f39662d0 = currentTimeMillis3;
                int i24 = (int) (me0Var.f39659b0 - d10);
                me0Var.f39659b0 = i24;
                if (i24 <= 1000) {
                    me0.o(me0Var);
                    me0Var.f39683w.setVisibility(8);
                    ke0 ke0Var2 = me0Var.f39685y;
                    if (ke0Var2 != null) {
                        ke0Var2.setVisibility(0);
                    }
                    me0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                me0 me0Var2 = ((le0) obj).f39224b;
                double d11 = me0Var2.f39661c0;
                ke0 ke0Var3 = me0Var2.f39683w;
                me0Var2.f39661c0 = currentTimeMillis4;
                int i25 = (int) (me0Var2.f39657a0 - (currentTimeMillis4 - d11));
                me0Var2.f39657a0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = me0Var2.f39668i0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (me0Var2.f39667h0 == 2 && (i29 == 2 || i29 == 17 || i29 == 16)) {
                            ke0Var3.setText(org.telegram.messenger.cd.a0("ResendSmsAvailableIn", null, 2131746136, Integer.valueOf(i27), Integer.valueOf(i28)));
                            return;
                        } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                            ke0Var3.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, Integer.valueOf(i27), Integer.valueOf(i28)));
                            return;
                        } else {
                            return;
                        }
                    }
                    ke0Var3.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                    return;
                }
                me0Var2.u();
                int i30 = me0Var2.f39668i0;
                if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                    if (i30 == 4) {
                        ke0Var3.setText(org.telegram.messenger.cd.L0(2131746194, "RequestCallButton"));
                    } else if (i30 != 11 && i30 != 3) {
                        ke0Var3.setText(org.telegram.messenger.cd.L0(2131746192, "RequestSmsButton"));
                    } else {
                        ke0Var3.setText(org.telegram.messenger.cd.L0(2131746193, null));
                    }
                    int i31 = org.telegram.ui.ActionBar.t6.P9;
                    org.telegram.ui.ActionBar.a7.V(ke0Var3, i31, null);
                    ke0Var3.setTag(2131296386, Integer.valueOf(i31));
                    return;
                }
                return;
            case 28:
                ((w50) obj).run();
                return;
            default:
                rf0.j((rf0) obj);
                return;
        }
    }
}
