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
public final class zq0 implements Utilities.Callback {
    public final int f44005a;
    public final PhotoViewer f44006b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f44005a = i10;
        this.f44006b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f10;
        float f11;
        float f12;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        switch (this.f44005a) {
            case 0:
                PhotoViewer photoViewer = this.f44006b;
                eg.l3 l3Var = (eg.l3) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f34255d7.get(photoViewer.M4)).filterPath);
                    eg.o3 o3Var = photoViewer.f34333m5;
                    o3Var.I = true;
                    o3Var.B = l3Var;
                    Bitmap bitmap = photoViewer.z4.getBitmap();
                    photoViewer.z4.getOrientation();
                    eg.l3 l3Var2 = o3Var.B;
                    if (l3Var2 == null) {
                        b10 = o3Var.F;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = o3Var.e(bitmap);
                    } else {
                        b10 = l3Var2.b();
                    }
                    photoViewer.z4.setImageBitmap(b10);
                    photoViewer.f34370q5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f34370q5.post(new tq0(photoViewer, 9));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.qc.F(this.f44006b.f34230b0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f44006b;
                photoViewer2.I1.f5109e2 = photoViewer2.H1.c();
                photoViewer2.f34230b0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.I1.f5113g2);
                if ((photoViewer2.I1.P0 instanceof eg.z3) && max > 0) {
                    f10 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.I1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f34363p7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f34363p7 = null;
                }
                if (photoViewer2.f34379r4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.W5, f10);
                photoViewer2.f34363p7 = ofFloat;
                ofFloat.addUpdateListener(new sq0(photoViewer2, 9));
                photoViewer2.f34363p7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f34363p7;
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                valueAnimator2.setInterpolator(prVar);
                photoViewer2.f34363p7.start();
                AnimatorSet animatorSet = photoViewer2.G1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.G1 = animatorSet2;
                eg.r2 r2Var = photoViewer2.I1.f5116i1;
                Property property = View.TRANSLATION_Y;
                int i11 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r2Var, property, i11 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.I1.Z0, property, Math.min(0, AndroidUtilities.dp(40.0f) + i11));
                eg.i0 i0Var = photoViewer2.I1.f5104c1;
                Property property2 = View.ALPHA;
                float f13 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i0Var, property2, f11);
                eg.z1 z1Var = photoViewer2.I1.f5133x0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(z1Var, property2, f12);
                eg.d2 d2Var = photoViewer2.I1.f5135y0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f13 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(d2Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(prVar);
                animatorSet2.start();
                mt0 mt0Var = photoViewer2.I1;
                eg.i2 i2Var = mt0Var.f5127r1;
                if (i2Var != null) {
                    if (mt0Var.f5109e2) {
                        i2Var.a(R.drawable.input_smile);
                    } else if (mt0Var.f5107d2) {
                        i2Var.a(R.drawable.input_keyboard);
                    } else {
                        i2Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = mt0Var.f5131v1;
                if (!mt0Var.f5109e2 && !mt0Var.f5107d2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AndroidUtilities.updateViewShow(textView, z4, false, 1.0f, true, null);
                ImageView imageView = mt0Var.f5129t1;
                if (!mt0Var.f5109e2 && !mt0Var.f5107d2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z10, false, 1.0f, true, null);
                TextView textView2 = mt0Var.f5134x1;
                if (!mt0Var.f5109e2 && !mt0Var.f5107d2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z11, false, 1.0f, true, null);
                TextView textView3 = mt0Var.f5132w1;
                if (!mt0Var.f5109e2 && !mt0Var.f5107d2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z12, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f44006b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f34343n5.f30401b.K && (i10 = photoViewer3.M4) >= 0 && i10 < photoViewer3.f34255d7.size() && (photoViewer3.f34255d7.get(photoViewer3.M4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.qf0 qf0Var = photoViewer3.f34343n5;
                    qh.c3 c3Var = qf0Var.h;
                    if (c3Var != null) {
                        c3Var.dismiss();
                        qf0Var.h = null;
                    }
                    photoViewer3.f34343n5.f30401b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new b30(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f34255d7.get(photoViewer3.M4), PhotoViewer.y1(), 19));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f44006b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f34255d7.get(photoViewer4.M4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.M4)) {
                    photoViewer4.M2();
                }
                photoViewer4.S1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f44006b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.N7.setTranslationY(photoViewer5.M0.getTranslationY() - (photoViewer5.R1.getAlpha() * l.d.c(46.0f, photoViewer5.R1.getEditTextHeight(), 0)));
                }
                photoViewer5.f34231b1.setTranslationY(photoViewer5.R1.getAlpha() * (-l.d.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f34241c1.setTranslationY(photoViewer5.R1.getAlpha() * (-l.d.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f34249d1.setTranslationY(photoViewer5.R1.getAlpha() * (-l.d.c(46.0f, num2.intValue(), 0)));
                org.telegram.ui.Components.zh zhVar = photoViewer5.R1.J;
                if (zhVar != null) {
                    zhVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f44006b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f34255d7.get(photoViewer6.M4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.M4)) {
                    photoViewer6.M2();
                }
                photoViewer6.R1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                org.telegram.ui.Components.zh zhVar2 = this.f44006b.S1.J;
                if (zhVar2 != null) {
                    zhVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f44006b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f44006b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
