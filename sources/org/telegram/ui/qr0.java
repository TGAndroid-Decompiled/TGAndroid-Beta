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
public final class qr0 implements Utilities.Callback {
    public final int f37012a;
    public final PhotoViewer f37013b;

    public qr0(PhotoViewer photoViewer, int i10) {
        this.f37012a = i10;
        this.f37013b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f7;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        switch (this.f37012a) {
            case 0:
                PhotoViewer photoViewer = this.f37013b;
                qg.m2 m2Var = (qg.m2) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f30974g7.get(photoViewer.P4)).filterPath);
                    qg.p2 p2Var = photoViewer.p5;
                    p2Var.L = true;
                    p2Var.E = m2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    qg.m2 m2Var2 = p2Var.E;
                    if (m2Var2 == null) {
                        b10 = p2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = p2Var.e(bitmap);
                    } else {
                        b10 = m2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f31086t5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f31086t5.post(new kr0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.vc.F(this.f37013b.f30950e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f37013b;
                photoViewer2.L1.f41551h2 = photoViewer2.K1.c();
                photoViewer2.f30950e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f41555j2);
                if ((photoViewer2.L1.S0 instanceof qg.x2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f31079s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f31079s7 = null;
                }
                if (photoViewer2.f31094u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f31079s7 = ofFloat;
                ofFloat.addUpdateListener(new jr0(photoViewer2, 9));
                photoViewer2.f31079s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f31079s7;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                valueAnimator2.setInterpolator(qrVar);
                photoViewer2.f31079s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new jr0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                qg.z1 z1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                int i11 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z1Var, property, i11 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f41540c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i11));
                ci.x5 x5Var = photoViewer2.L1.f41546f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x5Var, property2, f10);
                qg.i1 i1Var = photoViewer2.L1.A0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i1Var, property2, f11);
                qg.m1 m1Var = photoViewer2.L1.B0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(m1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(qrVar);
                animatorSet2.start();
                cu0 cu0Var = photoViewer2.L1;
                qg.r1 r1Var = cu0Var.f41569u1;
                if (r1Var != null) {
                    if (cu0Var.f41551h2) {
                        r1Var.a(R.drawable.input_smile);
                    } else if (cu0Var.f41549g2) {
                        r1Var.a(R.drawable.input_keyboard);
                    } else {
                        r1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = cu0Var.f41573y1;
                if (!cu0Var.f41551h2 && !cu0Var.f41549g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = cu0Var.f41571w1;
                if (!cu0Var.f41551h2 && !cu0Var.f41549g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = cu0Var.A1;
                if (!cu0Var.f41551h2 && !cu0Var.f41549g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = cu0Var.f41574z1;
                if (!cu0Var.f41551h2 && !cu0Var.f41549g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f37013b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f31058q5.f25622b.N && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.f30974g7.size() && (photoViewer3.f30974g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.kf0 kf0Var = photoViewer3.f31058q5;
                    ci.b4 b4Var = kf0Var.h;
                    if (b4Var != null) {
                        b4Var.dismiss();
                        kf0Var.h = null;
                    }
                    photoViewer3.f31058q5.f25622b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.kn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f30974g7.get(photoViewer3.P4), PhotoViewer.y1(), 28));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f37013b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f30974g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.M2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f37013b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.Q7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * hg.k0.f(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f30951e1.setTranslationY(photoViewer5.U1.getAlpha() * (-hg.k0.f(46.0f, num2.intValue(), 0)));
                photoViewer5.f30960f1.setTranslationY(photoViewer5.U1.getAlpha() * (-hg.k0.f(46.0f, num2.intValue(), 0)));
                photoViewer5.f30968g1.setTranslationY(photoViewer5.U1.getAlpha() * (-hg.k0.f(46.0f, num2.intValue(), 0)));
                ci.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f37013b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f30974g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.M2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                ci.i iVar2 = this.f37013b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f37013b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f37013b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
