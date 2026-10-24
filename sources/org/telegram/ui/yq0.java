package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class yq0 implements Utilities.Callback {
    public final int f43936a;
    public final PhotoViewer f43937b;

    public yq0(PhotoViewer photoViewer, int i10) {
        this.f43936a = i10;
        this.f43937b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f7;
        int i10;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        switch (this.f43936a) {
            case 0:
                PhotoViewer photoViewer = this.f43937b;
                rg.l2 l2Var = (rg.l2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f33606g7.get(photoViewer.P4)).filterPath);
                    rg.o2 o2Var = photoViewer.p5;
                    o2Var.L = true;
                    o2Var.E = l2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    rg.l2 l2Var2 = o2Var.E;
                    if (l2Var2 == null) {
                        b10 = o2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = o2Var.e(bitmap);
                    } else {
                        b10 = l2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f33719t5.setUndoCutState(true);
                    photoViewer.c3(true, true);
                    photoViewer.f33719t5.post(new sq0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.vc.F(this.f43937b.f33582e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f43937b;
                photoViewer2.L1.f45896h2 = photoViewer2.K1.c();
                photoViewer2.f33582e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f45900j2);
                if ((photoViewer2.L1.S0 instanceof rg.w2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f33712s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f33712s7 = null;
                }
                if (photoViewer2.f33727u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f33712s7 = ofFloat;
                ofFloat.addUpdateListener(new rq0(photoViewer2, 9));
                photoViewer2.f33712s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f33712s7;
                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
                valueAnimator2.setInterpolator(zrVar);
                photoViewer2.f33712s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                rg.x1 x1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f45885c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                ei.m5 m5Var = photoViewer2.L1.f45891f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m5Var, property2, f10);
                rg.g1 g1Var = photoViewer2.L1.A0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g1Var, property2, f11);
                rg.k1 k1Var = photoViewer2.L1.B0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(k1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(zrVar);
                animatorSet2.start();
                it0 it0Var = photoViewer2.L1;
                rg.p1 p1Var = it0Var.f45914u1;
                if (p1Var != null) {
                    if (it0Var.f45896h2) {
                        p1Var.a(R.drawable.input_smile);
                    } else if (it0Var.f45894g2) {
                        p1Var.a(R.drawable.input_keyboard);
                    } else {
                        p1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = it0Var.f45918y1;
                if (!it0Var.f45896h2 && !it0Var.f45894g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = it0Var.f45916w1;
                if (!it0Var.f45896h2 && !it0Var.f45894g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = it0Var.A1;
                if (!it0Var.f45896h2 && !it0Var.f45894g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = it0Var.f45919z1;
                if (!it0Var.f45896h2 && !it0Var.f45894g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f43937b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f33691q5.f27028b.Q && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.f33606g7.size() && (photoViewer3.f33606g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.hg0 hg0Var = photoViewer3.f33691q5;
                    ei.u3 u3Var = hg0Var.h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        hg0Var.h = null;
                    }
                    photoViewer3.f33691q5.f27028b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new in0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f33606g7.get(photoViewer3.P4), PhotoViewer.z1(), 2));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f43937b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f33606g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.O2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f43937b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * i2.o1.g(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f33583e1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                photoViewer5.f33592f1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                photoViewer5.f33600g1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                ei.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f43937b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f33606g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.O2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                ei.i iVar2 = this.f43937b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f43937b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f43937b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
