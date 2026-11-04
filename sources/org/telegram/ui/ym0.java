package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
public final class ym0 implements View.OnClickListener {
    public final int f52367a;
    public final PhotoViewer f52368b;

    public ym0(PhotoViewer photoViewer, int i3) {
        this.f52367a = i3;
        this.f52368b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        org.telegram.ui.Components.m51 m51Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        yp0 yp0Var;
        ei.x2 x2Var;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.ej b10;
        kq0 kq0Var;
        float f10 = 1.0f;
        boolean z10 = true;
        switch (this.f52367a) {
            case 0:
                PhotoViewer photoViewer = this.f52368b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.n0();
                photoViewer.h3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f52368b;
                if (photoViewer2.J1.a()) {
                    Activity activity = photoViewer2.E;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.f41570w2);
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131751406, "DiscardChanges");
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new gn0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        photoViewer2.V2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.h3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f52368b;
                photoViewer3.Z7 = photoViewer3.f41390b8;
                photoViewer3.S0();
                photoViewer3.b3(false);
                photoViewer3.s2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f52368b;
                Object obj = photoViewer4.h7.get(photoViewer4.Q4);
                if (obj instanceof org.telegram.messenger.se) {
                    ((org.telegram.messenger.se) obj).f25325s = photoViewer4.p1();
                }
                photoViewer4.b3(false);
                photoViewer4.s2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f52368b;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer5.z2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f52368b;
                photoViewer6.f41573w5.m(false, true);
                photoViewer6.f41583x5.m(false, true);
                photoViewer6.h3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f52368b;
                photoViewer7.f41573w5.m(false, true);
                photoViewer7.f41583x5.m(false, true);
                photoViewer7.n0();
                photoViewer7.h3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f52368b;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer8.h3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f52368b;
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer9.G0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f52368b;
                if (!photoViewer10.r5.f36807b.R && (i3 = photoViewer10.Q4) >= 0 && i3 < photoViewer10.h7.size() && (photoViewer10.h7.get(photoViewer10.Q4) instanceof org.telegram.messenger.ye)) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) photoViewer10.h7.get(photoViewer10.Q4);
                    long time = photoViewer10.r5.getTime();
                    String A1 = PhotoViewer.A1();
                    photoViewer10.r5.f36807b.setLoading(true);
                    Utilities.f21387e.c(new ci.l2(photoViewer10, A1, yeVar, time, 23));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f52368b;
                Drawable[] drawableArr5 = PhotoViewer.V8;
                if (!photoViewer11.K1()) {
                    photoViewer11.f41522r = !photoViewer11.f41522r;
                    ArrayList arrayList = photoViewer11.f41446i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            ((gi.l3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.f41522r) {
                        final gi.l3 l3Var = new gi.l3(photoViewer11.E, 3);
                        l3Var.r(true);
                        l3Var.u(org.telegram.messenger.bd.M0(2131751210, null));
                        l3Var.h = gi.l3.a(l3Var.getText(), l3Var.getTextPaint());
                        l3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        l3Var.o(0.0f, 22.0f);
                        l3Var.f13100r0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f41446i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(l3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f41446i1;
                                        gi.l3 l3Var2 = l3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(l3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f41454j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(l3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f41446i1 == null) {
                            photoViewer11.f41446i1 = new ArrayList();
                        }
                        photoViewer11.f41420f0.addView(l3Var, b8.mf.e(-1, 200, 83));
                        photoViewer11.f41446i1.add(l3Var);
                        l3Var.w();
                    }
                    photoViewer11.A3();
                    photoViewer11.E3();
                    if (photoViewer11.f41522r) {
                        CheckBox checkBox = photoViewer11.O0;
                        if (!checkBox.f31319y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.h7.get(photoViewer11.Q4);
                    if (obj3 instanceof org.telegram.messenger.se) {
                        ((org.telegram.messenger.se) obj3).f25325s = photoViewer11.p1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f52368b;
                Drawable[] drawableArr6 = PhotoViewer.V8;
                boolean T1 = photoViewer12.T1();
                boolean z11 = !T1;
                int i13 = photoViewer12.Q4;
                if (i13 >= 0 && i13 < photoViewer12.h7.size()) {
                    Object obj4 = photoViewer12.h7.get(photoViewer12.Q4);
                    if (obj4 instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj4).O = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.az.f21636i1 = T1;
                        edit.putBoolean("photoLiveDefault", T1).apply();
                        kq0 kq0Var2 = photoViewer12.d;
                        if (kq0Var2 != null) {
                            kq0Var2.m();
                        }
                    }
                }
                photoViewer12.f41430g1.a(!photoViewer12.T1(), true);
                ViewPropertyAnimator animate = photoViewer12.T7.animate();
                if (photoViewer12.T1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer12.T1() && (m51Var = photoViewer12.G2) != null) {
                    m51Var.g0();
                }
                photoViewer12.f41420f0.invalidate();
                if (photoViewer12.f41446i1 == null) {
                    photoViewer12.f41446i1 = new ArrayList();
                }
                if (photoViewer12.f41454j1 == null) {
                    photoViewer12.f41454j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f41446i1;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    ((gi.l3) obj5).f(true);
                }
                final gi.l3 l3Var2 = new gi.l3(photoViewer12.E, 3);
                if (photoViewer12.T1()) {
                    i10 = 2131748844;
                } else {
                    i10 = 2131748843;
                }
                l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i10, null)));
                l3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l3Var2.o(0.0f, 28.0f);
                l3Var2.f13100r0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f41446i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(l3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f41446i1;
                                gi.l3 l3Var22 = l3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(l3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f41454j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(l3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f41420f0.addView(l3Var2, b8.mf.e(-1, 200, 83));
                photoViewer12.f41446i1.add(l3Var2);
                photoViewer12.f41454j1.add(l3Var2);
                l3Var2.w();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f52368b;
                if (photoViewer13.d != null && !photoViewer13.K1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f52368b;
                if (photoViewer14.d != null && !photoViewer14.K1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f52368b;
                ArrayList arrayList3 = photoViewer15.h7;
                if (!photoViewer15.f41575w7) {
                    yp0 yp0Var2 = photoViewer15.f41554u5;
                    if (!yp0Var2.R && yp0Var2.f56254n0 != 1 && (i11 = photoViewer15.Q4) >= 0 && i11 < arrayList3.size() && !photoViewer15.f41518q5.W) {
                        org.telegram.messenger.se seVar = (org.telegram.messenger.se) arrayList3.get(photoViewer15.Q4);
                        boolean isEmpty = TextUtils.isEmpty(seVar.f25315i);
                        boolean z12 = !isEmpty;
                        yp0 yp0Var3 = photoViewer15.f41554u5;
                        int i15 = yp0Var3.f56254n0;
                        if (i15 == 0) {
                            yp0Var3.setCancelState(true);
                            ug.c2 c2Var = photoViewer15.f41518q5;
                            gi.nb nbVar = new gi.nb(photoViewer15, z12, seVar, 3);
                            c2Var.getClass();
                            c2Var.setOnClickListener(new org.telegram.ui.web.d(3, c2Var, nbVar));
                            TextView textView = c2Var.N;
                            textView.setText(org.telegram.messenger.bd.M0(2131745685, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            ValueAnimator valueAnimator = c2Var.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            c2Var.R = c2Var.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            c2Var.O = ofFloat;
                            ofFloat.addUpdateListener(new gi.j3(c2Var, 29));
                            c2Var.O.setRepeatCount(-1);
                            c2Var.O.setRepeatMode(1);
                            c2Var.O.setDuration(2400L);
                            c2Var.O.setInterpolator(new LinearInterpolator());
                            c2Var.O.start();
                            photoViewer15.f41420f0.invalidate();
                            return;
                        } else if (i15 == 2) {
                            yp0Var3.setCutOutState(true);
                            photoViewer15.a3(false, true);
                            photoViewer15.f41518q5.f();
                            photoViewer15.f41420f0.invalidate();
                            return;
                        } else {
                            photoViewer15.f41518q5.l();
                            photoViewer15.f41518q5.getThanosEffect();
                            ug.c2 c2Var2 = photoViewer15.f41518q5;
                            c2Var2.M = false;
                            c2Var2.F = null;
                            ImageReceiver imageReceiver = photoViewer15.D4;
                            if (isEmpty || (bitmap = c2Var2.L) == null) {
                                bitmap = c2Var2.J;
                            }
                            imageReceiver.v0(bitmap);
                            photoViewer15.f41554u5.setCutOutState(true);
                            photoViewer15.a3(false, true);
                            photoViewer15.n0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f52368b;
                photoViewer16.f41573w5.m(true, true);
                photoViewer16.f41583x5.m(false, true);
                ug.c2 c2Var3 = photoViewer16.f41518q5;
                if (c2Var3 != null) {
                    c2Var3.setOutlineVisible(false);
                }
                photoViewer16.N1 = true;
                kp0 kp0Var = photoViewer16.O1;
                if (kp0Var != null) {
                    kp0Var.setEraser(true);
                }
                photoViewer16.h3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f52368b;
                photoViewer17.f41573w5.m(false, true);
                photoViewer17.f41583x5.m(true, true);
                ug.c2 c2Var4 = photoViewer17.f41518q5;
                if (c2Var4 != null) {
                    c2Var4.setOutlineVisible(false);
                }
                photoViewer17.N1 = false;
                kp0 kp0Var2 = photoViewer17.O1;
                if (kp0Var2 != null) {
                    kp0Var2.setEraser(false);
                }
                photoViewer17.h3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f52368b;
                kp0 kp0Var3 = photoViewer18.O1;
                if (kp0Var3 != null) {
                    tg.k1 k1Var = kp0Var3.f56168b;
                    if (k1Var.a()) {
                        k1Var.c();
                        return;
                    }
                }
                photoViewer18.h3(0);
                photoViewer18.f41518q5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.se) photoViewer18.h7.get(photoViewer18.Q4)).f25315i);
                ug.c2 c2Var5 = photoViewer18.f41518q5;
                if (c2Var5 != null && !c2Var5.H) {
                    c2Var5.M = false;
                    c2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.D4;
                if (isEmpty2 || (bitmap2 = c2Var5.L) == null) {
                    bitmap2 = c2Var5.J;
                }
                imageReceiver2.v0(bitmap2);
                ug.c2 c2Var6 = photoViewer18.f41518q5;
                if (c2Var6 == null || !c2Var6.H) {
                    photoViewer18.f41554u5.setCutOutState(true);
                }
                photoViewer18.d3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f52368b;
                if (photoViewer19.f41518q5 != null) {
                    photoViewer19.f41602z5.m(!yp0Var.f52378t0, true);
                    ug.c2 c2Var7 = photoViewer19.f41518q5;
                    if (!photoViewer19.f41602z5.f52378t0 || photoViewer19.f41573w5.f52378t0 || photoViewer19.f41583x5.f52378t0) {
                        z10 = false;
                    }
                    c2Var7.setOutlineVisible(z10);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f52368b;
                wm wmVar = photoViewer20.f41481m4;
                if (wmVar != null && (ziVar = wmVar.G5) != null && ziVar.q5() && !org.telegram.messenger.t3.z(photoViewer20.U, 24, org.telegram.messenger.zi.B0(photoViewer20.f41481m4.G5.f26868k))) {
                    if (photoViewer20.n4 == null || (b10 = photoViewer20.f41481m4.f51540x5) == null) {
                        b10 = org.telegram.messenger.ej.b(photoViewer20.f41481m4.G5.f26868k.suggested_post);
                    }
                    if (!ci.e9.T(photoViewer20.U, b10.f22361a)) {
                        wm wmVar2 = photoViewer20.f41481m4;
                        if (wmVar2 != null) {
                            wmVar2.wc(b10);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.V1.o()) {
                    org.telegram.ui.Components.h6 h6Var = photoViewer20.V1.f13164w;
                    float f11 = -photoViewer20.X1;
                    photoViewer20.X1 = f11;
                    org.telegram.messenger.g0.G3(f11, h6Var, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    if (!org.telegram.messenger.hp.s1(photoViewer20.U).D3() && org.telegram.messenger.hp.s1(photoViewer20.U).U4 > photoViewer20.V1.getCodePointCount()) {
                        photoViewer20.W2(photoViewer20.f41420f0);
                        return;
                    }
                    return;
                }
                wm wmVar3 = photoViewer20.f41481m4;
                if (wmVar3 != null && wmVar3.c() && ((x2Var = photoViewer20.f41481m4.Y1) == null || x2Var.C3 == null)) {
                    photoViewer20.c3();
                    return;
                } else {
                    photoViewer20.z2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f52368b.f41371a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f52368b;
                if (photoViewer21.E != null && (kq0Var = photoViewer21.d) != null) {
                    kq0Var.W();
                    photoViewer21.H0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f52368b;
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer22.u0();
                if (!photoViewer22.K1()) {
                    if (photoViewer22.f41533s1) {
                        if (photoViewer22.f41478l8) {
                            TextureView textureView = photoViewer22.C2;
                            if (textureView instanceof org.telegram.ui.Components.b51) {
                                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) textureView;
                                if (b51Var.getVideoWidth() <= 0 || b51Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.h3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f52368b;
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer23.P0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f52368b;
                Drawable[] drawableArr9 = PhotoViewer.V8;
                photoViewer24.O0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f52368b;
                Drawable[] drawableArr10 = PhotoViewer.V8;
                photoViewer25.u0();
                if (!photoViewer25.K1()) {
                    if (photoViewer25.f41533s1) {
                        if (photoViewer25.f41478l8) {
                            TextureView textureView2 = photoViewer25.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.b51) {
                                org.telegram.ui.Components.b51 b51Var2 = (org.telegram.ui.Components.b51) textureView2;
                                if (b51Var2.getVideoWidth() <= 0 || b51Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.h3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f52368b;
                Drawable[] drawableArr11 = PhotoViewer.V8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.K1()) {
                        if (photoViewer26.f41533s1) {
                            if (photoViewer26.f41478l8) {
                                TextureView textureView3 = photoViewer26.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.b51) {
                                    org.telegram.ui.Components.b51 b51Var3 = (org.telegram.ui.Components.b51) textureView3;
                                    if (b51Var3.getVideoWidth() <= 0 || b51Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.h3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f52368b;
                if (photoViewer27.f41519q6 == null) {
                    xm0 xm0Var = new xm0(photoViewer27, 29);
                    if (!photoViewer27.K2) {
                        float stateOrientation = photoViewer27.S2 - photoViewer27.D1.f31808b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.P0(stateOrientation, photoViewer27.D1.f31808b.getStateMirror(), xm0Var);
                        return;
                    }
                    xm0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f52368b;
                if (photoViewer28.f41562v4 == 1) {
                    pg.m mVar = photoViewer28.D1.f31808b;
                    pg.b bVar = mVar.H;
                    if (bVar.f53450a.isInProgress() || bVar.h || mVar.f53511a.f31379f0) {
                        return;
                    }
                }
                photoViewer28.n0();
                photoViewer28.h3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f52368b;
                float f12 = -photoViewer29.D1.f31808b.getStateOrientation();
                if (Math.abs(f12) > 180.0f) {
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    } else {
                        f12 = -(360.0f - f12);
                    }
                }
                photoViewer29.P0(f12, photoViewer29.D1.f31808b.getStateMirror(), new xm0(photoViewer29, 8));
                return;
        }
    }
}
