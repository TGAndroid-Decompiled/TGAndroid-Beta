package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class zt0 extends org.telegram.ui.Components.r11 {
    public boolean f44206a;
    public float f44207b;
    public NestedScrollView f44208c;
    public FrameLayout d;

    public zt0(Context context) {
        super(context);
        this.f44206a = false;
        this.f44207b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f44206a && z10) {
            this.f44208c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f44206a) {
            return this.f44207b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f44206a = true;
            this.f44208c.setVisibility(getVisibility());
            this.f44208c.setAlpha(this.f44207b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44206a) {
            this.f44206a = false;
            this.f44208c.setVisibility(8);
            super.setAlpha(this.f44207b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f44207b = f7;
        if (this.f44206a) {
            this.f44208c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f44208c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f44206a) {
            this.f44208c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
