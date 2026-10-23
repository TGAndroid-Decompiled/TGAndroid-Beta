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
    public final int f44191a;
    public final PhotoViewer f44192b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f44191a = i10;
        this.f44192b = photoViewer;
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
        switch (this.f44191a) {
            case 0:
                PhotoViewer photoViewer = this.f44192b;
                rg.l2 l2Var = (rg.l2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f33604g7.get(photoViewer.P4)).filterPath);
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
                    photoViewer.f33717t5.setUndoCutState(true);
                    photoViewer.c3(true, true);
                    photoViewer.f33717t5.post(new tq0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.xc.F(this.f44192b.f33580e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f44192b;
                photoViewer2.L1.f45897h2 = photoViewer2.K1.c();
                photoViewer2.f33580e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f45901j2);
                if ((photoViewer2.L1.S0 instanceof rg.w2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f33710s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f33710s7 = null;
                }
                if (photoViewer2.f33725u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f33710s7 = ofFloat;
                ofFloat.addUpdateListener(new sq0(photoViewer2, 9));
                photoViewer2.f33710s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f33710s7;
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                valueAnimator2.setInterpolator(bsVar);
                photoViewer2.f33710s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                rg.x1 x1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f45886c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                ei.m5 m5Var = photoViewer2.L1.f45892f1;
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
                animatorSet2.setInterpolator(bsVar);
                animatorSet2.start();
                jt0 jt0Var = photoViewer2.L1;
                rg.p1 p1Var = jt0Var.f45915u1;
                if (p1Var != null) {
                    if (jt0Var.f45897h2) {
                        p1Var.a(R.drawable.input_smile);
                    } else if (jt0Var.f45895g2) {
                        p1Var.a(R.drawable.input_keyboard);
                    } else {
                        p1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = jt0Var.f45919y1;
                if (!jt0Var.f45897h2 && !jt0Var.f45895g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = jt0Var.f45917w1;
                if (!jt0Var.f45897h2 && !jt0Var.f45895g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = jt0Var.A1;
                if (!jt0Var.f45897h2 && !jt0Var.f45895g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = jt0Var.f45920z1;
                if (!jt0Var.f45897h2 && !jt0Var.f45895g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f44192b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f33689q5.f27314b.Q && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.f33604g7.size() && (photoViewer3.f33604g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.ig0 ig0Var = photoViewer3.f33689q5;
                    ei.u3 u3Var = ig0Var.h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        ig0Var.h = null;
                    }
                    photoViewer3.f33689q5.f27314b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new jn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f33604g7.get(photoViewer3.P4), PhotoViewer.z1(), 2));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f44192b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f33604g7.get(photoViewer4.P4);
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
                PhotoViewer photoViewer5 = this.f44192b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * i2.o1.g(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f33581e1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                photoViewer5.f33590f1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                photoViewer5.f33598g1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.o1.g(46.0f, num2.intValue(), 0)));
                ei.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f44192b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f33604g7.get(photoViewer6.P4);
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
                ei.i iVar2 = this.f44192b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f44192b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f44192b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
