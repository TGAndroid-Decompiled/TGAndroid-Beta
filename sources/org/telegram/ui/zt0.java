package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class zt0 extends org.telegram.ui.Components.n11 {
    public boolean f43802a;
    public float f43803b;
    public NestedScrollView f43804c;
    public FrameLayout d;

    public zt0(Context context) {
        super(context);
        this.f43802a = false;
        this.f43803b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f43802a && z10) {
            this.f43804c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43802a) {
            return this.f43803b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43802a = true;
            this.f43804c.setVisibility(getVisibility());
            this.f43804c.setAlpha(this.f43803b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43802a) {
            this.f43802a = false;
            this.f43804c.setVisibility(8);
            super.setAlpha(this.f43803b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f43803b = f7;
        if (this.f43802a) {
            this.f43804c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43804c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f43802a) {
            this.f43804c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
