package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class r10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.b6 f42970a;
    public ImageView f42971b;
    public org.telegram.ui.Components.ar f42972c;
    public int d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23483k7));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ImageView imageView = this.f42971b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.f42970a;
        int textHeight = ((i13 - i11) - b6Var.getTextHeight()) / 2;
        float f7 = 23.0f;
        if (LocaleController.isRTL) {
            int measuredWidth2 = getMeasuredWidth() - b6Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f7 = 64.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f7);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = 64.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        b6Var.layout(dp, textHeight, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(20.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.f42970a.measure(org.telegram.messenger.vh.x(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f42971b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void updateColors() {
        ImageView imageView = this.f42971b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof org.telegram.ui.Components.ar) {
                    org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) imageView.getDrawable();
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.N6, false);
                    int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23483k7, false);
                    if (arVar == this.f42972c && x02 == this.d && x03 == this.e) {
                        return;
                    }
                    this.f42972c = arVar;
                    this.d = x02;
                    this.e = x03;
                    Drawable drawable = arVar.f26590a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = arVar.f26591b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                    }
                    imageView.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
