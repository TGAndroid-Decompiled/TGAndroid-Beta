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
public final class xq0 implements Utilities.Callback {
    public final int f43232a;
    public final PhotoViewer f43233b;

    public xq0(PhotoViewer photoViewer, int i10) {
        this.f43232a = i10;
        this.f43233b = photoViewer;
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
        switch (this.f43232a) {
            case 0:
                PhotoViewer photoViewer = this.f43233b;
                rg.j2 j2Var = (rg.j2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f33290g7.get(photoViewer.P4)).filterPath);
                    rg.m2 m2Var = photoViewer.p5;
                    m2Var.L = true;
                    m2Var.E = j2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    rg.j2 j2Var2 = m2Var.E;
                    if (j2Var2 == null) {
                        b10 = m2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = m2Var.e(bitmap);
                    } else {
                        b10 = j2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f33403t5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f33403t5.post(new rq0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.xc.F(this.f43233b.f33266e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f43233b;
                photoViewer2.L1.f45506h2 = photoViewer2.K1.c();
                photoViewer2.f33266e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f45510j2);
                if ((photoViewer2.L1.S0 instanceof rg.v2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f33396s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f33396s7 = null;
                }
                if (photoViewer2.f33411u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f33396s7 = ofFloat;
                ofFloat.addUpdateListener(new qq0(photoViewer2, 9));
                photoViewer2.f33396s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f33396s7;
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                valueAnimator2.setInterpolator(bsVar);
                photoViewer2.f33396s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new qq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                rg.w1 w1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f45495c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                ei.m5 m5Var = photoViewer2.L1.f45501f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m5Var, property2, f10);
                rg.f1 f1Var = photoViewer2.L1.A0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f1Var, property2, f11);
                rg.j1 j1Var = photoViewer2.L1.B0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(j1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(bsVar);
                animatorSet2.start();
                it0 it0Var = photoViewer2.L1;
                rg.o1 o1Var = it0Var.f45524u1;
                if (o1Var != null) {
                    if (it0Var.f45506h2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (it0Var.f45504g2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = it0Var.f45528y1;
                if (!it0Var.f45506h2 && !it0Var.f45504g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = it0Var.f45526w1;
                if (!it0Var.f45506h2 && !it0Var.f45504g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = it0Var.A1;
                if (!it0Var.f45506h2 && !it0Var.f45504g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = it0Var.f45529z1;
                if (!it0Var.f45506h2 && !it0Var.f45504g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f43233b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f33375q5.f25584b.N && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.f33290g7.size() && (photoViewer3.f33290g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.dg0 dg0Var = photoViewer3.f33375q5;
                    ei.u3 u3Var = dg0Var.h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        dg0Var.h = null;
                    }
                    photoViewer3.f33375q5.f25584b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new gn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f33290g7.get(photoViewer3.P4), PhotoViewer.y1(), 2));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f43233b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f33290g7.get(photoViewer4.P4);
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
                PhotoViewer photoViewer5 = this.f43233b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f33267e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f33276f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f33284g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                ei.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f43233b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f33290g7.get(photoViewer6.P4);
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
                ei.i iVar2 = this.f43233b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f43233b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f43233b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
