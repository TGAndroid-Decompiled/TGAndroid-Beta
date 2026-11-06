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
public final class x1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6, c3 {
    public final o50 f51697a;
    public final FrameLayout f51698b;
    public final ImageView f51699c;
    public int d;

    public x1(Context context, o50 o50Var) {
        super(context);
        this.f51697a = o50Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51698b = frameLayout;
        addView(frameLayout, c8.ha.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f51699c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ha.c(-2.0f, -2));
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = this.d;
        if (i14 > i13) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        FrameLayout frameLayout = this.f51698b;
        frameLayout.layout((i13 - i14) / 2, 0, (i13 + i14) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        li.q a10;
        ImageView imageView = this.f51699c;
        imageView.setImageBitmap(null);
        o50 o50Var = this.f51697a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        o50Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.g0.L(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        o50Var.getClass();
        float f11 = 36;
        this.d = org.telegram.messenger.g0.L(f11);
        if (pageblockmath != null && (a10 = li.q.a(pageblockmath.source, org.telegram.messenger.g0.L(20.0f), false)) != null) {
            imageView.setImageBitmap(a10.f18778a);
            int i7 = a10.f18779b;
            o50Var.getClass();
            int L2 = org.telegram.messenger.g0.L(f11) + i7;
            this.d = L2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a10.f18780c));
        }
    }

    @Override
    public final void updateColors() {
        ((g4) this.f51697a).getClass();
        this.f51699c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
