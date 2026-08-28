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
public final class zf1 extends ScrollView {
    public final int[] f45134a;
    public final Rect f45135b;
    public boolean f45136c;
    public int d;
    public final ag1 f45137e;

    public zf1(ag1 ag1Var, Context context) {
        super(context);
        this.f45137e = ag1Var;
        this.f45134a = new int[2];
        this.f45135b = new Rect();
        this.f45136c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f45136c = false;
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i9, i10, i11, i12);
        ag1 ag1Var = this.f45137e;
        TextView textView = ag1Var.f36485c;
        if (textView != null) {
            int[] iArr = this.f45134a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = ag1Var.f36485c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ag1Var.f36485c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = ag1Var.f36485c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = ag1Var.G;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ag1Var.G = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ag1Var.G = animatorSet2;
                kh.h6 h6Var = ag1Var.f36497y;
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                ag1Var.G.setDuration(150L);
                ag1Var.G.addListener(new te1(this, 1));
                ag1Var.G.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f45136c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (Build.VERSION.SDK_INT < 23) {
            int dp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = dp;
            int i9 = this.d;
            if (i9 != 0) {
                rect.top -= i9;
                rect.bottom = dp - i9;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestLayout() {
        this.f45136c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f45135b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
