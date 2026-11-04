package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public abstract class ux extends FrameLayout {
    public float[] E;
    public FrameLayout f50336a;
    public org.telegram.ui.ActionBar.k5 f50337b;
    public org.telegram.ui.ActionBar.k5 f50338c;
    public ImageView d;
    public tx f50339e;
    public ci.ec f50340f;
    public ci.ec h;
    public TextView f50341n;
    public org.telegram.ui.ActionBar.d2 f50342r;
    public String f50343s;
    public float f50344w;
    public ValueAnimator f50345x;
    public org.telegram.ui.ActionBar.f1 f50346y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y9 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y9 -= frameLayout3.getScrollY();
            }
            f10 = y9;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(127.0f), 1073741824));
    }
}
