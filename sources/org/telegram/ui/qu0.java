package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class qu0 extends org.telegram.ui.Components.p01 {
    public boolean f39980a;
    public float f39981b;
    public NestedScrollView f39982c;
    public FrameLayout d;

    public qu0(Context context) {
        super(context);
        this.f39980a = false;
        this.f39981b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f39980a && z10) {
            this.f39982c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f39980a) {
            return this.f39981b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f39980a = true;
            this.f39982c.setVisibility(getVisibility());
            this.f39982c.setAlpha(this.f39981b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39980a) {
            this.f39980a = false;
            this.f39982c.setVisibility(8);
            super.setAlpha(this.f39981b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f39981b = f7;
        if (this.f39980a) {
            this.f39982c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f39982c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f39980a) {
            this.f39982c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
