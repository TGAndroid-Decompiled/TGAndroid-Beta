package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public abstract class tz extends FrameLayout {
    public FrameLayout f38614a;
    public org.telegram.ui.ActionBar.k5 f38615b;
    public org.telegram.ui.ActionBar.k5 f38616c;
    public ImageView d;
    public sz e;
    public gg.q f38617f;
    public gg.q h;
    public TextView f38618n;
    public org.telegram.ui.ActionBar.p2 f38619r;
    public String f38620s;
    public float v;
    public ValueAnimator f38621w;
    public org.telegram.ui.ActionBar.p1 f38622x;
    public float[] f38623y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y10 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y10 -= frameLayout3.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z4 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z4) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
    }
}
