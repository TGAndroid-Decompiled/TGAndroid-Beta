package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class z1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.p6, e3 {
    public final h70 f46151a;
    public final FrameLayout f46152b;
    public final ImageView f46153c;
    public int d;

    public z1(Context context, h70 h70Var) {
        super(context);
        this.f46151a = h70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46152b = frameLayout;
        addView(frameLayout, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f46153c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        updateColors();
    }

    @Override
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override
    public int getBoundRight() {
        if (this.d > getMeasuredWidth()) {
            return getMeasuredWidth();
        }
        return (getMeasuredWidth() + this.d) / 2;
    }

    @Override
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = this.d;
        if (i15 > i14) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        FrameLayout frameLayout = this.f46152b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        li.r a2;
        ImageView imageView = this.f46153c;
        imageView.setImageBitmap(null);
        h70 h70Var = this.f46151a;
        h70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        h70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f7), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        h70Var.getClass();
        float f10 = 36;
        this.d = AndroidUtilities.dp(f10);
        if (pageblockmath != null && (a2 = li.r.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f17436a);
            int i10 = a2.f17437b;
            h70Var.getClass();
            int dp2 = AndroidUtilities.dp(f10) + i10;
            this.d = dp2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.f17438c));
        }
    }

    @Override
    public final void updateColors() {
        this.f46153c.setColorFilter(new PorterDuffColorFilter(this.f46151a.b(), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
