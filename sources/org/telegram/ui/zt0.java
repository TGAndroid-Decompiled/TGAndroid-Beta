package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class zt0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public final FrameLayout f45252a;

    public final ag.d f45253b;

    public final org.telegram.ui.ActionBar.h5[] f45254c;
    public final org.telegram.ui.Components.j6 d;

    public AnimatorSet f45255e;

    public AnimatorSet f45256f;
    public boolean h;

    public ValueAnimator f45257n;

    public float f45258r;

    public int f45259s;

    public zt0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f45252a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        ag.d dVar = new ag.d(activity, 24);
        this.f45253b = dVar;
        dVar.setPivotX(AndroidUtilities.dp(16.0f));
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        dVar.setClipToPadding(false);
        frameLayout.addView(dVar, h7.z5.e(-1, -1, 119));
        this.f45254c = new org.telegram.ui.ActionBar.h5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f45254c[i10] = new org.telegram.ui.ActionBar.h5(activity);
            this.f45254c[i10].setGravity(19);
            this.f45254c[i10].setTextColor(-1);
            this.f45254c[i10].setTextSize(20);
            this.f45254c[i10].setTypeface(AndroidUtilities.bold());
            this.f45254c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f45254c[i10].setScrollNonFitText(true);
            this.f45253b.addView(this.f45254c[i10], h7.z5.e(-1, -2, 19));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, true, false, false);
        this.d = j6Var;
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.er.h);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(19);
        j6Var.setTextColor(-1);
        j6Var.setEllipsizeByGradient(true);
        j6Var.setImportantForAccessibility(1);
        j6Var.setAccessibilityLiveRegion(1);
        this.f45252a.addView(j6Var, h7.z5.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !zIsEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f45256f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            int iDp = AndroidUtilities.dp((!zIsEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
            ag.d dVar = this.f45253b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<org.telegram.ui.Components.j6, Float>) View.ALPHA, !zIsEmpty ? 1.0f : 0.0f));
                float[] fArr = {iDp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<org.telegram.ui.Components.j6, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<ag.d, Float>) property, zIsEmpty ? 0.0f : AndroidUtilities.dp(-12.0f)));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<ag.d, Float>) View.SCALE_X, !zIsEmpty ? 0.87f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<ag.d, Float>) View.SCALE_Y, zIsEmpty ? 1.0f : 0.87f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f45256f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f45256f.setInterpolator(org.telegram.ui.Components.er.h);
                this.f45256f.start();
            } else {
                j6Var.setAlpha(!zIsEmpty ? 1.0f : 0.0f);
                j6Var.setTranslationY(iDp);
                dVar.setTranslationY(zIsEmpty ? 0.0f : AndroidUtilities.dp(-12.0f));
                dVar.setScaleX(!zIsEmpty ? 0.87f : 1.0f);
                dVar.setScaleY(zIsEmpty ? 1.0f : 0.87f);
            }
        }
        j6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        j6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f45254c;
        h5VarArr[0].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        h5VarArr[1].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z10 ? 1912602624 : 0);
        this.d.getDrawable().p(AndroidUtilities.dpf2(0.66f), 1.0f, z10 ? 1912602624 : 0);
    }

    public final void c(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f45254c;
        boolean zEquals = true;
        h5VarArr[1].setAlpha(0.0f);
        h5VarArr[1].setVisibility(8);
        CharSequence text = h5VarArr[0].getText();
        if (text != null || charSequence != null) {
            zEquals = (text == null) != (charSequence == null) ? false : TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!zEquals) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
            h5Var.N = 0.0f;
            h5Var.b();
        }
        h5VarArr[0].k(charSequence);
        h5VarArr[0].setAlpha(1.0f);
        h5VarArr[0].setTranslationX(0.0f);
        h5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f45254c;
        CharSequence text = h5VarArr[0].getText();
        if (text == null ? false : TextUtils.equals(text.toString(), charSequence.toString())) {
            return;
        }
        AnimatorSet animatorSet = this.f45255e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f45255e = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5Var.getClass();
        h5Var.N = h5Var2.N;
        h5Var.b();
        h5VarArr[1].k(h5VarArr[0].getText());
        h5VarArr[1].setRightPadding((int) this.f45258r);
        org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[0];
        h5Var3.N = 0.0f;
        h5Var3.b();
        h5VarArr[0].k(charSequence);
        float fDp = AndroidUtilities.dp(8.0f) * (z11 ? 1 : -1);
        h5VarArr[1].setTranslationX(0.0f);
        h5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            h5VarArr[0].setTranslationX(0.0f);
            h5VarArr[0].setTranslationY(-fDp);
        } else {
            h5VarArr[0].setTranslationX(-fDp);
            h5VarArr[0].setTranslationY(0.0f);
        }
        h5VarArr[0].setAlpha(0.0f);
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr[0].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[0], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 1.0f));
        org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[1];
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(h5Var4, (Property<org.telegram.ui.ActionBar.h5, Float>) (z10 ? property3 : property2), fDp));
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[0];
        if (z10) {
            property2 = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var5, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45255e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f45255e.addListener(new f50(this, 17));
        this.f45255e.setDuration(320L);
        this.f45255e.setInterpolator(org.telegram.ui.Components.er.h);
        this.f45255e.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f45254c;
            h5VarArr[0].invalidate();
            h5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f45252a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f45259s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.f45259s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f45252a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i12, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
