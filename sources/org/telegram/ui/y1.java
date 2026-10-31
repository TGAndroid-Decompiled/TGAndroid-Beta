package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class y1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6, c3 {
    public final m60 f43677a;
    public final FrameLayout f43678b;
    public final ImageView f43679c;
    public int d;

    public y1(Context context, m60 m60Var) {
        super(context);
        this.f43677a = m60Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43678b = frameLayout;
        addView(frameLayout, w7.b6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f43679c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.b6.c(-2.0f, -2));
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
        FrameLayout frameLayout = this.f43678b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        bi.u a2;
        ImageView imageView = this.f43679c;
        imageView.setImageBitmap(null);
        m60 m60Var = this.f43677a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        m60Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.i0.L(f7), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        m60Var.getClass();
        float f10 = 36;
        this.d = org.telegram.messenger.i0.L(f10);
        if (pageblockmath != null && (a2 = bi.u.a(pageblockmath.source, org.telegram.messenger.i0.L(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f3369a);
            int i10 = a2.f3370b;
            m60Var.getClass();
            int L2 = org.telegram.messenger.i0.L(f10) + i10;
            this.d = L2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a2.f3371c));
        }
    }

    @Override
    public final void updateColors() {
        ((h4) this.f43677a).getClass();
        this.f43679c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
