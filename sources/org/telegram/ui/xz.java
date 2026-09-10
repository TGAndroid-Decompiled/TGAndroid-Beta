package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public abstract class xz extends FrameLayout {
    public FrameLayout f38842a;
    public org.telegram.ui.ActionBar.l5 f38843b;
    public org.telegram.ui.ActionBar.l5 f38844c;
    public ImageView d;
    public bi.la e;
    public di.h f38845f;
    public di.h h;
    public TextView f38846n;
    public org.telegram.ui.ActionBar.p2 f38847r;
    public String f38848s;
    public float v;
    public ValueAnimator f38849w;
    public org.telegram.ui.ActionBar.p1 f38850x;
    public float[] f38851y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y3 = frameLayout3.getY() + f7;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y3 -= frameLayout3.getScrollY();
            }
            f7 = y3;
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
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
    }
}
