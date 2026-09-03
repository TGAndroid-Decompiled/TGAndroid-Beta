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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
public final class uq0 implements View.OnClickListener {
    public final int f38903a;
    public final PhotoViewer f38904b;

    public uq0(PhotoViewer photoViewer, int i10) {
        this.f38903a = i10;
        this.f38904b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.i71 i71Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        zt0 zt0Var;
        nh.t2 t2Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        ou0 ou0Var;
        float f10 = 1.0f;
        boolean z4 = true;
        switch (this.f38903a) {
            case 0:
                PhotoViewer photoViewer = this.f38904b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.m0();
                photoViewer.e3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38904b;
                if (photoViewer2.F1.d()) {
                    Activity activity = photoViewer2.f31887y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f31835s2);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f19478a.O = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new br0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f38904b;
                photoViewer3.U7 = photoViewer3.W7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38904b;
                Object obj = photoViewer4.f31704d7.get(photoViewer4.M4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38904b;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38904b;
                photoViewer6.f31838s5.m(false, true);
                photoViewer6.f31846t5.m(false, true);
                photoViewer6.e3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38904b;
                photoViewer7.f31838s5.m(false, true);
                photoViewer7.f31846t5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38904b;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer8.e3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f38904b;
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer9.F0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f38904b;
                if (!photoViewer10.f31791n5.f27845b.K && (i10 = photoViewer10.M4) >= 0 && i10 < photoViewer10.f31704d7.size() && (photoViewer10.f31704d7.get(photoViewer10.M4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f31704d7.get(photoViewer10.M4);
                    long time = photoViewer10.f31791n5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f31791n5.f27845b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.di(photoViewer10, y12, photoEntry, time, 10));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f38904b;
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f31822r = !photoViewer11.f31822r;
                    ArrayList arrayList = photoViewer11.f31707e1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((ph.f3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f31822r) {
                        final ph.f3 f3Var = new ph.f3(photoViewer11.f31887y, 3);
                        f3Var.p(true);
                        f3Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        f3Var.h = ph.f3.a(f3Var.getText(), f3Var.getTextPaint());
                        f3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        f3Var.l(0.0f, 22.0f);
                        f3Var.f41662i0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f31707e1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(f3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f31707e1;
                                        ph.f3 f3Var2 = f3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(f3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f31716f1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(f3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f31707e1 == null) {
                            photoViewer11.f31707e1 = new ArrayList();
                        }
                        photoViewer11.f31679b0.addView(f3Var, k7.b6.e(-1, 200, 83));
                        photoViewer11.f31707e1.add(f3Var);
                        f3Var.u();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f31822r) {
                        CheckBox checkBox = photoViewer11.K0;
                        if (!checkBox.f22923x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f31704d7.get(photoViewer11.M4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f38904b;
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                boolean P1 = photoViewer12.P1();
                boolean z10 = !P1;
                int i14 = photoViewer12.M4;
                if (i14 >= 0 && i14 < photoViewer12.f31704d7.size()) {
                    Object obj4 = photoViewer12.f31704d7.get(photoViewer12.M4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        ou0 ou0Var2 = photoViewer12.d;
                        if (ou0Var2 != null) {
                            ou0Var2.m();
                        }
                    }
                }
                photoViewer12.f31690c1.a(!photoViewer12.P1(), true);
                ViewPropertyAnimator animate = photoViewer12.O7.animate();
                if (photoViewer12.P1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer12.P1() && (i71Var = photoViewer12.C2) != null) {
                    i71Var.B();
                }
                photoViewer12.f31679b0.invalidate();
                if (photoViewer12.f31707e1 == null) {
                    photoViewer12.f31707e1 = new ArrayList();
                }
                if (photoViewer12.f31716f1 == null) {
                    photoViewer12.f31716f1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f31707e1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((ph.f3) obj5).e(true);
                }
                final ph.f3 f3Var2 = new ph.f3(photoViewer12.f31887y, 3);
                if (photoViewer12.P1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                f3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                f3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                f3Var2.l(0.0f, 28.0f);
                f3Var2.f41662i0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f31707e1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(f3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f31707e1;
                                ph.f3 f3Var22 = f3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(f3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f31716f1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(f3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f31679b0.addView(f3Var2, k7.b6.e(-1, 200, 83));
                photoViewer12.f31707e1.add(f3Var2);
                photoViewer12.f31716f1.add(f3Var2);
                f3Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f38904b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f38904b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f38904b;
                ArrayList arrayList3 = photoViewer15.f31704d7;
                if (!photoViewer15.f31839s7) {
                    zt0 zt0Var2 = photoViewer15.f31818q5;
                    if (!zt0Var2.K && zt0Var2.f4435g0 != 1 && (i12 = photoViewer15.M4) >= 0 && i12 < arrayList3.size() && !photoViewer15.f31781m5.S) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.M4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z11 = !isEmpty;
                        zt0 zt0Var3 = photoViewer15.f31818q5;
                        int i16 = zt0Var3.f4435g0;
                        if (i16 == 0) {
                            zt0Var3.setCancelState(true);
                            dg.q3 q3Var = photoViewer15.f31781m5;
                            org.telegram.ui.Components.kl klVar = new org.telegram.ui.Components.kl(photoViewer15, z11, mediaEditState, 2);
                            q3Var.getClass();
                            q3Var.setOnClickListener(new cg.n(1, q3Var, klVar));
                            TextView textView = q3Var.J;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                            ValueAnimator valueAnimator = q3Var.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            q3Var.N = q3Var.O;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            q3Var.K = ofFloat;
                            ofFloat.addUpdateListener(new dg.o1(q3Var, 4));
                            q3Var.K.setRepeatCount(-1);
                            q3Var.K.setRepeatMode(1);
                            q3Var.K.setDuration(2400L);
                            q3Var.K.setInterpolator(new LinearInterpolator());
                            q3Var.K.start();
                            photoViewer15.f31679b0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            zt0Var3.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.f31781m5.f();
                            photoViewer15.f31679b0.invalidate();
                            return;
                        } else {
                            photoViewer15.f31781m5.l();
                            photoViewer15.f31781m5.getThanosEffect();
                            dg.q3 q3Var2 = photoViewer15.f31781m5;
                            q3Var2.I = false;
                            q3Var2.B = null;
                            ImageReceiver imageReceiver = photoViewer15.z4;
                            if (isEmpty || (bitmap = q3Var2.H) == null) {
                                bitmap = q3Var2.F;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f31818q5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.m0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f38904b;
                photoViewer16.f31838s5.m(true, true);
                photoViewer16.f31846t5.m(false, true);
                dg.q3 q3Var3 = photoViewer16.f31781m5;
                if (q3Var3 != null) {
                    q3Var3.setOutlineVisible(false);
                }
                photoViewer16.J1 = true;
                lt0 lt0Var = photoViewer16.K1;
                if (lt0Var != null) {
                    lt0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f38904b;
                photoViewer17.f31838s5.m(false, true);
                photoViewer17.f31846t5.m(true, true);
                dg.q3 q3Var4 = photoViewer17.f31781m5;
                if (q3Var4 != null) {
                    q3Var4.setOutlineVisible(false);
                }
                photoViewer17.J1 = false;
                lt0 lt0Var2 = photoViewer17.K1;
                if (lt0Var2 != null) {
                    lt0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f38904b;
                lt0 lt0Var3 = photoViewer18.K1;
                if (lt0Var3 != null) {
                    cg.i2 i2Var = lt0Var3.f4734b;
                    if (i2Var.a()) {
                        i2Var.c();
                        return;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.f31781m5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f31704d7.get(photoViewer18.M4)).filterPath);
                dg.q3 q3Var5 = photoViewer18.f31781m5;
                if (q3Var5 != null && !q3Var5.D) {
                    q3Var5.I = false;
                    q3Var5.B = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.z4;
                if (isEmpty2 || (bitmap2 = q3Var5.H) == null) {
                    bitmap2 = q3Var5.F;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                dg.q3 q3Var6 = photoViewer18.f31781m5;
                if (q3Var6 == null || !q3Var6.D) {
                    photoViewer18.f31818q5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f38904b;
                if (photoViewer19.f31781m5 != null) {
                    photoViewer19.f31863v5.m(!zt0Var.m0, true);
                    photoViewer19.f31781m5.setOutlineVisible((!photoViewer19.f31863v5.m0 || photoViewer19.f31838s5.m0 || photoViewer19.f31846t5.m0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f38904b;
                zn znVar = photoViewer20.f31746i4;
                if (znVar != null && (messageObject = znVar.f40666m5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.Q, photoViewer20.f31746i4.f40666m5.getDialogId())) {
                    if (photoViewer20.f31755j4 == null || (of2 = photoViewer20.f31746i4.f40555d5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.f31746i4.f40666m5.messageOwner.suggested_post);
                    }
                    if (!lh.t7.U(photoViewer20.Q, of2.amount)) {
                        zn znVar2 = photoViewer20.f31746i4;
                        if (znVar2 != null) {
                            znVar2.Tb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.R1.o()) {
                    org.telegram.ui.Components.k6 k6Var = photoViewer20.R1.v;
                    float f11 = -photoViewer20.T1;
                    photoViewer20.T1 = f11;
                    AndroidUtilities.shakeViewSpring(k6Var, f11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.Q).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.Q).captionLengthLimitPremium > photoViewer20.R1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f31679b0);
                        return;
                    }
                    return;
                }
                zn znVar3 = photoViewer20.f31746i4;
                if (znVar3 != null && znVar3.c() && ((t2Var = photoViewer20.f31746i4.G1) == null || t2Var.E1 == null)) {
                    photoViewer20.Z2();
                    return;
                } else {
                    photoViewer20.w2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f38904b.f31669a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f38904b;
                if (photoViewer21.f31887y != null && (ou0Var = photoViewer21.d) != null) {
                    ou0Var.V();
                    photoViewer21.G0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f38904b;
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f31796o1) {
                        if (photoViewer22.f31732g8) {
                            TextureView textureView = photoViewer22.f31890y2;
                            if (textureView instanceof org.telegram.ui.Components.w61) {
                                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) textureView;
                                if (w61Var.getVideoWidth() <= 0 || w61Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.e3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f38904b;
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f38904b;
                Drawable[] drawableArr9 = PhotoViewer.Q8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f38904b;
                Drawable[] drawableArr10 = PhotoViewer.Q8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f31796o1) {
                        if (photoViewer25.f31732g8) {
                            TextureView textureView2 = photoViewer25.f31890y2;
                            if (textureView2 instanceof org.telegram.ui.Components.w61) {
                                org.telegram.ui.Components.w61 w61Var2 = (org.telegram.ui.Components.w61) textureView2;
                                if (w61Var2.getVideoWidth() <= 0 || w61Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.e3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f38904b;
                Drawable[] drawableArr11 = PhotoViewer.Q8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f31796o1) {
                            if (photoViewer26.f31732g8) {
                                TextureView textureView3 = photoViewer26.f31890y2;
                                if (textureView3 instanceof org.telegram.ui.Components.w61) {
                                    org.telegram.ui.Components.w61 w61Var3 = (org.telegram.ui.Components.w61) textureView3;
                                    if (w61Var3.getVideoWidth() <= 0 || w61Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.e3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f38904b;
                if (photoViewer27.f31782m6 == null) {
                    tq0 tq0Var = new tq0(photoViewer27, 29);
                    if (!photoViewer27.G2) {
                        float stateOrientation = photoViewer27.O2 - photoViewer27.f31898z1.f31372b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.f31898z1.f31372b.getStateMirror(), tq0Var);
                        return;
                    }
                    tq0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f38904b;
                if (photoViewer28.f31827r4 == 1) {
                    yf.n nVar = photoViewer28.f31898z1.f31372b;
                    yf.b bVar = nVar.D;
                    if (bVar.f47255a.isInProgress() || bVar.h || nVar.f47310a.f22972b0) {
                        return;
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f38904b;
                float f12 = -photoViewer29.f31898z1.f31372b.getStateOrientation();
                if (Math.abs(f12) > 180.0f) {
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    } else {
                        f12 = -(360.0f - f12);
                    }
                }
                photoViewer29.O0(f12, photoViewer29.f31898z1.f31372b.getStateMirror(), new tq0(photoViewer29, 8));
                return;
        }
    }
}
