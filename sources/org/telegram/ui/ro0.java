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
public final class ro0 implements View.OnClickListener {
    public final int f41261a;
    public final PhotoViewer f41262b;

    public ro0(PhotoViewer photoViewer, int i10) {
        this.f41261a = i10;
        this.f41262b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.u61 u61Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        sr0 sr0Var;
        ag.v vVar;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.oj b10;
        es0 es0Var;
        float f7 = 1.0f;
        boolean z10 = true;
        switch (this.f41261a) {
            case 0:
                PhotoViewer photoViewer = this.f41262b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0();
                photoViewer.h3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f41262b;
                if (photoViewer2.I1.a()) {
                    Activity activity = photoViewer2.D;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.f33622v2);
                        alertDialog$Builder.f20134a.T = org.telegram.messenger.cd.L0(2131751406, "DiscardChanges");
                        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131689472, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new yo0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        photoViewer2.V2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.h3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f41262b;
                photoViewer3.Y7 = photoViewer3.f33440a8;
                photoViewer3.S0();
                photoViewer3.b3(false);
                photoViewer3.s2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f41262b;
                Object obj = photoViewer4.f33494g7.get(photoViewer4.P4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).f19521s = photoViewer4.p1();
                }
                photoViewer4.b3(false);
                photoViewer4.s2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f41262b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f41262b;
                photoViewer6.f33625v5.m(false, true);
                photoViewer6.f33635w5.m(false, true);
                photoViewer6.h3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f41262b;
                photoViewer7.f33625v5.m(false, true);
                photoViewer7.f33635w5.m(false, true);
                photoViewer7.n0();
                photoViewer7.h3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f41262b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.h3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f41262b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.G0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f41262b;
                if (!photoViewer10.f33579q5.f29346b.Q && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.f33494g7.size() && (photoViewer10.f33494g7.get(photoViewer10.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) photoViewer10.f33494g7.get(photoViewer10.P4);
                    long time = photoViewer10.f33579q5.getTime();
                    String A1 = PhotoViewer.A1();
                    photoViewer10.f33579q5.f29346b.setLoading(true);
                    Utilities.e.c(new ag.a3(photoViewer10, A1, efVar, time, 11));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f41262b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.K1()) {
                    photoViewer11.f33582r = !photoViewer11.f33582r;
                    ArrayList arrayList = photoViewer11.f33497h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((vh.p2) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f33582r) {
                        final vh.p2 p2Var = new vh.p2(photoViewer11.D, 3);
                        p2Var.p(true);
                        p2Var.s(org.telegram.messenger.cd.L0(2131751210, null));
                        p2Var.h = vh.p2.a(p2Var.getText(), p2Var.getTextPaint());
                        p2Var.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
                        p2Var.l(0.0f, 22.0f);
                        p2Var.f51740l0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f33497h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(p2Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f33497h1;
                                        vh.p2 p2Var2 = p2Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(p2Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f33506i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(p2Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f33497h1 == null) {
                            photoViewer11.f33497h1 = new ArrayList();
                        }
                        photoViewer11.f33470e0.addView(p2Var, w7.b6.e(-1, 200, 83));
                        photoViewer11.f33497h1.add(p2Var);
                        p2Var.u();
                    }
                    photoViewer11.A3();
                    photoViewer11.E3();
                    if (photoViewer11.f33582r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f23905y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f33494g7.get(photoViewer11.P4);
                    if (obj3 instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj3).f19521s = photoViewer11.p1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f41262b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean T1 = photoViewer12.T1();
                boolean z11 = !T1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.f33494g7.size()) {
                    Object obj4 = photoViewer12.f33494g7.get(photoViewer12.P4);
                    if (obj4 instanceof org.telegram.messenger.ef) {
                        ((org.telegram.messenger.ef) obj4).O = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.tz.f18154i1 = T1;
                        edit.putBoolean("photoLiveDefault", T1).apply();
                        es0 es0Var2 = photoViewer12.d;
                        if (es0Var2 != null) {
                            es0Var2.m();
                        }
                    }
                }
                photoViewer12.f33480f1.a(!photoViewer12.T1(), true);
                ViewPropertyAnimator animate = photoViewer12.S7.animate();
                if (photoViewer12.T1()) {
                    f7 = 0.45f;
                }
                animate.alpha(f7).start();
                if (photoViewer12.T1() && (u61Var = photoViewer12.F2) != null) {
                    u61Var.g0();
                }
                photoViewer12.f33470e0.invalidate();
                if (photoViewer12.f33497h1 == null) {
                    photoViewer12.f33497h1 = new ArrayList();
                }
                if (photoViewer12.f33506i1 == null) {
                    photoViewer12.f33506i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f33497h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((vh.p2) obj5).e(true);
                }
                final vh.p2 p2Var2 = new vh.p2(photoViewer12.D, 3);
                if (photoViewer12.T1()) {
                    i11 = 2131748846;
                } else {
                    i11 = 2131748845;
                }
                p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i11, null)));
                p2Var2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                p2Var2.l(0.0f, 28.0f);
                p2Var2.f51740l0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f33497h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(p2Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f33497h1;
                                vh.p2 p2Var22 = p2Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(p2Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f33506i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(p2Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f33470e0.addView(p2Var2, w7.b6.e(-1, 200, 83));
                photoViewer12.f33497h1.add(p2Var2);
                photoViewer12.f33506i1.add(p2Var2);
                p2Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f41262b;
                if (photoViewer13.d != null && !photoViewer13.K1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f41262b;
                if (photoViewer14.d != null && !photoViewer14.K1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f41262b;
                ArrayList arrayList3 = photoViewer15.f33494g7;
                if (!photoViewer15.f33627v7) {
                    sr0 sr0Var2 = photoViewer15.f33607t5;
                    if (!sr0Var2.Q && sr0Var2.m0 != 1 && (i12 = photoViewer15.P4) >= 0 && i12 < arrayList3.size() && !photoViewer15.p5.V) {
                        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(zeVar.f19511i);
                        boolean z12 = !isEmpty;
                        sr0 sr0Var3 = photoViewer15.f33607t5;
                        int i16 = sr0Var3.m0;
                        if (i16 == 0) {
                            sr0Var3.setCancelState(true);
                            jg.v2 v2Var = photoViewer15.p5;
                            org.telegram.ui.Components.ll llVar = new org.telegram.ui.Components.ll(photoViewer15, z12, zeVar, 2);
                            v2Var.getClass();
                            v2Var.setOnClickListener(new ag.t0(6, v2Var, llVar));
                            TextView textView = v2Var.M;
                            textView.setText(org.telegram.messenger.cd.L0(2131745692, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            ValueAnimator valueAnimator = v2Var.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            v2Var.Q = v2Var.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            v2Var.N = ofFloat;
                            ofFloat.addUpdateListener(new bg.k(v2Var, 7));
                            v2Var.N.setRepeatCount(-1);
                            v2Var.N.setRepeatMode(1);
                            v2Var.N.setDuration(2400L);
                            v2Var.N.setInterpolator(new LinearInterpolator());
                            v2Var.N.start();
                            photoViewer15.f33470e0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            sr0Var3.setCutOutState(true);
                            photoViewer15.a3(false, true);
                            photoViewer15.p5.f();
                            photoViewer15.f33470e0.invalidate();
                            return;
                        } else {
                            photoViewer15.p5.l();
                            photoViewer15.p5.getThanosEffect();
                            jg.v2 v2Var2 = photoViewer15.p5;
                            v2Var2.L = false;
                            v2Var2.E = null;
                            ImageReceiver imageReceiver = photoViewer15.C4;
                            if (isEmpty || (bitmap = v2Var2.K) == null) {
                                bitmap = v2Var2.I;
                            }
                            imageReceiver.v0(bitmap);
                            photoViewer15.f33607t5.setCutOutState(true);
                            photoViewer15.a3(false, true);
                            photoViewer15.n0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f41262b;
                photoViewer16.f33625v5.m(true, true);
                photoViewer16.f33635w5.m(false, true);
                jg.v2 v2Var3 = photoViewer16.p5;
                if (v2Var3 != null) {
                    v2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                dr0 dr0Var = photoViewer16.N1;
                if (dr0Var != null) {
                    dr0Var.setEraser(true);
                }
                photoViewer16.h3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f41262b;
                photoViewer17.f33625v5.m(false, true);
                photoViewer17.f33635w5.m(true, true);
                jg.v2 v2Var4 = photoViewer17.p5;
                if (v2Var4 != null) {
                    v2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                dr0 dr0Var2 = photoViewer17.N1;
                if (dr0Var2 != null) {
                    dr0Var2.setEraser(false);
                }
                photoViewer17.h3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f41262b;
                dr0 dr0Var3 = photoViewer18.N1;
                if (dr0Var3 != null) {
                    ig.t1 t1Var = dr0Var3.f9878b;
                    if (t1Var.a()) {
                        t1Var.c();
                        return;
                    }
                }
                photoViewer18.h3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer18.f33494g7.get(photoViewer18.P4)).f19511i);
                jg.v2 v2Var5 = photoViewer18.p5;
                if (v2Var5 != null && !v2Var5.G) {
                    v2Var5.L = false;
                    v2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = v2Var5.K) == null) {
                    bitmap2 = v2Var5.I;
                }
                imageReceiver2.v0(bitmap2);
                jg.v2 v2Var6 = photoViewer18.p5;
                if (v2Var6 == null || !v2Var6.G) {
                    photoViewer18.f33607t5.setCutOutState(true);
                }
                photoViewer18.d3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f41262b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.f33654y5.m(!sr0Var.f41638s0, true);
                    jg.v2 v2Var7 = photoViewer19.p5;
                    if (!photoViewer19.f33654y5.f41638s0 || photoViewer19.f33625v5.f41638s0 || photoViewer19.f33635w5.f41638s0) {
                        z10 = false;
                    }
                    v2Var7.setOutlineVisible(z10);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f41262b;
                un unVar = photoViewer20.l4;
                if (unVar != null && (jjVar = unVar.F5) != null && jjVar.p5() && !org.telegram.messenger.w3.z(photoViewer20.T, 24, org.telegram.messenger.jj.B0(photoViewer20.l4.F5.f16337k))) {
                    if (photoViewer20.f33542m4 == null || (b10 = photoViewer20.l4.f42459w5) == null) {
                        b10 = org.telegram.messenger.oj.b(photoViewer20.l4.F5.f16337k.suggested_post);
                    }
                    if (!rh.e6.T(photoViewer20.T, b10.f17275a)) {
                        un unVar2 = photoViewer20.l4;
                        if (unVar2 != null) {
                            unVar2.mc(b10);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.U1.o()) {
                    org.telegram.ui.Components.f6 f6Var = photoViewer20.U1.f51360w;
                    float f10 = -photoViewer20.W1;
                    photoViewer20.W1 = f10;
                    org.telegram.messenger.i0.F3(f10, f6Var, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    if (!org.telegram.messenger.vp.r1(photoViewer20.T).A3() && org.telegram.messenger.vp.r1(photoViewer20.T).V4 > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.W2(photoViewer20.f33470e0);
                        return;
                    }
                    return;
                }
                un unVar3 = photoViewer20.l4;
                if (unVar3 != null && unVar3.c() && ((vVar = photoViewer20.l4.X1) == null || vVar.B3 == null)) {
                    photoViewer20.c3();
                    return;
                } else {
                    photoViewer20.z2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f41262b.f33432a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f41262b;
                if (photoViewer21.D != null && (es0Var = photoViewer21.d) != null) {
                    es0Var.W();
                    photoViewer21.H0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f41262b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.u0();
                if (!photoViewer22.K1()) {
                    if (photoViewer22.f33584r1) {
                        if (photoViewer22.f33531k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.k61) {
                                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) textureView;
                                if (k61Var.getVideoWidth() <= 0 || k61Var.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer23 = this.f41262b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.P0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f41262b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.O0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f41262b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.u0();
                if (!photoViewer25.K1()) {
                    if (photoViewer25.f33584r1) {
                        if (photoViewer25.f33531k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.k61) {
                                org.telegram.ui.Components.k61 k61Var2 = (org.telegram.ui.Components.k61) textureView2;
                                if (k61Var2.getVideoWidth() <= 0 || k61Var2.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer26 = this.f41262b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.K1()) {
                        if (photoViewer26.f33584r1) {
                            if (photoViewer26.f33531k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.k61) {
                                    org.telegram.ui.Components.k61 k61Var3 = (org.telegram.ui.Components.k61) textureView3;
                                    if (k61Var3.getVideoWidth() <= 0 || k61Var3.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer27 = this.f41262b;
                if (photoViewer27.f33571p6 == null) {
                    qo0 qo0Var = new qo0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.f24615b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.P0(stateOrientation, photoViewer27.C1.f24615b.getStateMirror(), qo0Var);
                        return;
                    }
                    qo0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f41262b;
                if (photoViewer28.f33615u4 == 1) {
                    eg.q qVar = photoViewer28.C1.f24615b;
                    eg.c cVar = qVar.G;
                    if (cVar.f6522a.isInProgress() || cVar.h || qVar.f6583a.f23958e0) {
                        return;
                    }
                }
                photoViewer28.n0();
                photoViewer28.h3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f41262b;
                float f11 = -photoViewer29.C1.f24615b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.P0(f11, photoViewer29.C1.f24615b.getStateMirror(), new qo0(photoViewer29, 8));
                return;
        }
    }
}
