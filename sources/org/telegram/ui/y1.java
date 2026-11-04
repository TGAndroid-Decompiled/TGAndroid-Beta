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
public final class y1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5, d3 {
    public final i50 f52154a;
    public final FrameLayout f52155b;
    public final ImageView f52156c;
    public int d;

    public y1(Context context, i50 i50Var) {
        super(context);
        this.f52154a = i50Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52155b = frameLayout;
        addView(frameLayout, b8.mf.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f52156c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b8.mf.c(-2.0f, -2));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = this.d;
        if (i14 > i13) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        FrameLayout frameLayout = this.f52155b;
        frameLayout.layout((i13 - i14) / 2, 0, (i13 + i14) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        mi.q a10;
        ImageView imageView = this.f52156c;
        imageView.setImageBitmap(null);
        i50 i50Var = this.f52154a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        i50Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.g0.L(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        i50Var.getClass();
        float f11 = 36;
        this.d = org.telegram.messenger.g0.L(f11);
        if (pageblockmath != null && (a10 = mi.q.a(pageblockmath.source, org.telegram.messenger.g0.L(20.0f), false)) != null) {
            imageView.setImageBitmap(a10.f19824a);
            int i3 = a10.f19825b;
            i50Var.getClass();
            int L2 = org.telegram.messenger.g0.L(f11) + i3;
            this.d = L2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a10.f19826c));
        }
    }

    @Override
    public final void updateColors() {
        ((i4) this.f52154a).getClass();
        this.f52156c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
