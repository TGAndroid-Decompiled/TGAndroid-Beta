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
public final class rq0 implements View.OnClickListener {
    public final int f41270a;
    public final PhotoViewer f41271b;

    public rq0(PhotoViewer photoViewer, int i10) {
        this.f41270a = i10;
        this.f41271b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.c81 c81Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        tt0 tt0Var;
        ci.b3 b3Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        hu0 hu0Var;
        float f7 = 1.0f;
        boolean z10 = true;
        switch (this.f41270a) {
            case 0:
                PhotoViewer photoViewer = this.f41271b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0();
                photoViewer.g3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f41271b;
                if (photoViewer2.I1.d()) {
                    Activity activity = photoViewer2.f33457y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f33430v2);
                        alertDialog$Builder.f20605a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f20605a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new yq0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.U2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.g3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f41271b;
                photoViewer3.Y7 = photoViewer3.f33248a8;
                photoViewer3.T0();
                photoViewer3.a3(false);
                photoViewer3.r2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f41271b;
                Object obj = photoViewer4.f33302g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.o1();
                }
                photoViewer4.a3(false);
                photoViewer4.r2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f41271b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f41271b;
                photoViewer6.f33433v5.m(false, true);
                photoViewer6.f33443w5.m(false, true);
                photoViewer6.g3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f41271b;
                photoViewer7.f33433v5.m(false, true);
                photoViewer7.f33443w5.m(false, true);
                photoViewer7.n0();
                photoViewer7.g3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f41271b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.g3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f41271b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.G0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f41271b;
                if (!photoViewer10.f33387q5.f25897b.N && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.f33302g7.size() && (photoViewer10.f33302g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f33302g7.get(photoViewer10.P4);
                    long time = photoViewer10.f33387q5.getTime();
                    String z12 = PhotoViewer.z1();
                    photoViewer10.f33387q5.f25897b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new ai.c3(photoViewer10, z12, photoEntry, time, 23));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f41271b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.J1()) {
                    photoViewer11.f33390r = !photoViewer11.f33390r;
                    ArrayList arrayList = photoViewer11.f33305h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((ei.x3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f33390r) {
                        final ei.x3 x3Var = new ei.x3(photoViewer11.f33457y, 3);
                        x3Var.p(true);
                        x3Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        x3Var.h = ei.x3.a(x3Var.getText(), x3Var.getTextPaint());
                        x3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        x3Var.l(0.0f, 22.0f);
                        x3Var.f10080l0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f33305h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(x3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f33305h1;
                                        ei.x3 x3Var2 = x3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(x3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f33314i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(x3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f33305h1 == null) {
                            photoViewer11.f33305h1 = new ArrayList();
                        }
                        photoViewer11.f33278e0.addView(x3Var, w7.z5.e(-1, 200, 83));
                        photoViewer11.f33305h1.add(x3Var);
                        x3Var.u();
                    }
                    photoViewer11.z3();
                    photoViewer11.D3();
                    if (photoViewer11.f33390r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f24136x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f33302g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.o1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f41271b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean S1 = photoViewer12.S1();
                boolean z11 = !S1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.f33302g7.size()) {
                    Object obj4 = photoViewer12.f33302g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = S1;
                        edit.putBoolean("photoLiveDefault", S1).apply();
                        hu0 hu0Var2 = photoViewer12.d;
                        if (hu0Var2 != null) {
                            hu0Var2.m();
                        }
                    }
                }
                photoViewer12.f33288f1.a(!photoViewer12.S1(), true);
                ViewPropertyAnimator animate = photoViewer12.S7.animate();
                if (photoViewer12.S1()) {
                    f7 = 0.45f;
                }
                animate.alpha(f7).start();
                if (photoViewer12.S1() && (c81Var = photoViewer12.F2) != null) {
                    c81Var.B();
                }
                photoViewer12.f33278e0.invalidate();
                if (photoViewer12.f33305h1 == null) {
                    photoViewer12.f33305h1 = new ArrayList();
                }
                if (photoViewer12.f33314i1 == null) {
                    photoViewer12.f33314i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f33305h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((ei.x3) obj5).e(true);
                }
                final ei.x3 x3Var2 = new ei.x3(photoViewer12.f33457y, 3);
                if (photoViewer12.S1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                x3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                x3Var2.l(0.0f, 28.0f);
                x3Var2.f10080l0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f33305h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(x3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f33305h1;
                                ei.x3 x3Var22 = x3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(x3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f33314i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(x3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f33278e0.addView(x3Var2, w7.z5.e(-1, 200, 83));
                photoViewer12.f33305h1.add(x3Var2);
                photoViewer12.f33314i1.add(x3Var2);
                x3Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f41271b;
                if (photoViewer13.d != null && !photoViewer13.J1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f41271b;
                if (photoViewer14.d != null && !photoViewer14.J1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f41271b;
                ArrayList arrayList3 = photoViewer15.f33302g7;
                if (!photoViewer15.f33435v7) {
                    tt0 tt0Var2 = photoViewer15.f33415t5;
                    if (!tt0Var2.N && tt0Var2.f45326j0 != 1 && (i12 = photoViewer15.P4) >= 0 && i12 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z13 = !isEmpty;
                        tt0 tt0Var3 = photoViewer15.f33415t5;
                        int i16 = tt0Var3.f45326j0;
                        if (i16 == 0) {
                            tt0Var3.setCancelState(true);
                            rg.n2 n2Var = photoViewer15.p5;
                            ei.oc ocVar = new ei.oc(photoViewer15, z13, mediaEditState, 3);
                            n2Var.getClass();
                            n2Var.setOnClickListener(new qg.n(1, n2Var, ocVar));
                            TextView textView = n2Var.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            ValueAnimator valueAnimator = n2Var.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            n2Var.Q = n2Var.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            n2Var.N = ofFloat;
                            ofFloat.addUpdateListener(new ei.i6(n2Var, 20));
                            n2Var.N.setRepeatCount(-1);
                            n2Var.N.setRepeatMode(1);
                            n2Var.N.setDuration(2400L);
                            n2Var.N.setInterpolator(new LinearInterpolator());
                            n2Var.N.start();
                            photoViewer15.f33278e0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            tt0Var3.setCutOutState(true);
                            photoViewer15.Z2(false, true);
                            photoViewer15.p5.f();
                            photoViewer15.f33278e0.invalidate();
                            return;
                        } else {
                            photoViewer15.p5.l();
                            photoViewer15.p5.getThanosEffect();
                            rg.n2 n2Var2 = photoViewer15.p5;
                            n2Var2.L = false;
                            n2Var2.E = null;
                            ImageReceiver imageReceiver = photoViewer15.C4;
                            if (isEmpty || (bitmap = n2Var2.K) == null) {
                                bitmap = n2Var2.I;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f33415t5.setCutOutState(true);
                            photoViewer15.Z2(false, true);
                            photoViewer15.n0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f41271b;
                photoViewer16.f33433v5.m(true, true);
                photoViewer16.f33443w5.m(false, true);
                rg.n2 n2Var3 = photoViewer16.p5;
                if (n2Var3 != null) {
                    n2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                ft0 ft0Var = photoViewer16.N1;
                if (ft0Var != null) {
                    ft0Var.setEraser(true);
                }
                photoViewer16.g3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f41271b;
                photoViewer17.f33433v5.m(false, true);
                photoViewer17.f33443w5.m(true, true);
                rg.n2 n2Var4 = photoViewer17.p5;
                if (n2Var4 != null) {
                    n2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                ft0 ft0Var2 = photoViewer17.N1;
                if (ft0Var2 != null) {
                    ft0Var2.setEraser(false);
                }
                photoViewer17.g3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f41271b;
                ft0 ft0Var3 = photoViewer18.N1;
                if (ft0Var3 != null) {
                    qg.w1 w1Var = ft0Var3.f45680b;
                    if (w1Var.a()) {
                        w1Var.c();
                        return;
                    }
                }
                photoViewer18.g3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f33302g7.get(photoViewer18.P4)).filterPath);
                rg.n2 n2Var5 = photoViewer18.p5;
                if (n2Var5 != null && !n2Var5.G) {
                    n2Var5.L = false;
                    n2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = n2Var5.K) == null) {
                    bitmap2 = n2Var5.I;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                rg.n2 n2Var6 = photoViewer18.p5;
                if (n2Var6 == null || !n2Var6.G) {
                    photoViewer18.f33415t5.setCutOutState(true);
                }
                photoViewer18.c3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f41271b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.f33462y5.m(!tt0Var.f41749p0, true);
                    rg.n2 n2Var7 = photoViewer19.p5;
                    if (!photoViewer19.f33462y5.f41749p0 || photoViewer19.f33433v5.f41749p0 || photoViewer19.f33443w5.f41749p0) {
                        z10 = false;
                    }
                    n2Var7.setOutlineVisible(z10);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f41271b;
                qn qnVar = photoViewer20.l4;
                if (qnVar != null && (messageObject = qnVar.p5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.p5.getDialogId())) {
                    if (photoViewer20.f33350m4 == null || (of2 = photoViewer20.l4.f40693g5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.l4.p5.messageOwner.suggested_post);
                    }
                    if (!ai.ga.U(photoViewer20.T, of2.amount)) {
                        qn qnVar2 = photoViewer20.l4;
                        if (qnVar2 != null) {
                            qnVar2.Yb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.U1.o()) {
                    org.telegram.ui.Components.q6 q6Var = photoViewer20.U1.v;
                    float f10 = -photoViewer20.W1;
                    photoViewer20.W1 = f10;
                    AndroidUtilities.shakeViewSpring(q6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.T).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.T).captionLengthLimitPremium > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.V2(photoViewer20.f33278e0);
                        return;
                    }
                    return;
                }
                qn qnVar3 = photoViewer20.l4;
                if (qnVar3 != null && qnVar3.c() && ((b3Var = photoViewer20.l4.J1) == null || b3Var.K1 == null)) {
                    photoViewer20.b3();
                    return;
                } else {
                    photoViewer20.y2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f41271b.f33240a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f41271b;
                if (photoViewer21.f33457y != null && (hu0Var = photoViewer21.d) != null) {
                    hu0Var.W();
                    photoViewer21.H0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f41271b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.u0();
                if (!photoViewer22.J1()) {
                    if (photoViewer22.f33392r1) {
                        if (photoViewer22.f33339k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.r71) {
                                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) textureView;
                                if (r71Var.getVideoWidth() <= 0 || r71Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.g3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f41271b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.Q0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f41271b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.P0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f41271b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.u0();
                if (!photoViewer25.J1()) {
                    if (photoViewer25.f33392r1) {
                        if (photoViewer25.f33339k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.r71) {
                                org.telegram.ui.Components.r71 r71Var2 = (org.telegram.ui.Components.r71) textureView2;
                                if (r71Var2.getVideoWidth() <= 0 || r71Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.g3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f41271b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.J1()) {
                        if (photoViewer26.f33392r1) {
                            if (photoViewer26.f33339k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.r71) {
                                    org.telegram.ui.Components.r71 r71Var3 = (org.telegram.ui.Components.r71) textureView3;
                                    if (r71Var3.getVideoWidth() <= 0 || r71Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.g3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f41271b;
                if (photoViewer27.f33379p6 == null) {
                    qq0 qq0Var = new qq0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.f29036b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.Q0(stateOrientation, photoViewer27.C1.f29036b.getStateMirror(), qq0Var);
                        return;
                    }
                    qq0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f41271b;
                if (photoViewer28.f33423u4 == 1) {
                    mg.p pVar = photoViewer28.C1.f29036b;
                    mg.c cVar = pVar.G;
                    if (cVar.f16859a.isInProgress() || cVar.h || pVar.f16917a.f24189e0) {
                        return;
                    }
                }
                photoViewer28.n0();
                photoViewer28.g3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f41271b;
                float f11 = -photoViewer29.C1.f29036b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.Q0(f11, photoViewer29.C1.f29036b.getStateMirror(), new qq0(photoViewer29, 8));
                return;
        }
    }
}
