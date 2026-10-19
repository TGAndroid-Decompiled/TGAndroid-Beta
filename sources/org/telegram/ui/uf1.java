package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class uf1 extends ScrollView {
    public final int[] f41962a;
    public final Rect f41963b;
    public boolean f41964c;
    public final vf1 d;

    public uf1(vf1 vf1Var, Context context) {
        super(context);
        this.d = vf1Var;
        this.f41962a = new int[2];
        this.f41963b = new Rect();
        this.f41964c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f41964c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        vf1 vf1Var = this.d;
        TextView textView = vf1Var.f42229c;
        if (textView != null) {
            int[] iArr = this.f41962a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = vf1Var.f42229c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (vf1Var.f42229c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = vf1Var.f42229c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = vf1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    vf1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                vf1Var.K = animatorSet2;
                ei.g6 g6Var = vf1Var.f42244y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.n2) vf1Var).actionBar;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                vf1Var.K.setDuration(150L);
                vf1Var.K.addListener(new tf1(this, 0));
                vf1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f41964c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f41964c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f41963b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
