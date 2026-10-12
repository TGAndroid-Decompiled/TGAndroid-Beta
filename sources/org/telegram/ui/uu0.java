package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class uu0 extends org.telegram.ui.Components.b21 {
    public boolean f42593a;
    public float f42594b;
    public NestedScrollView f42595c;
    public FrameLayout d;

    public uu0(Context context) {
        super(context);
        this.f42593a = false;
        this.f42594b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f42593a && z10) {
            this.f42595c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f42593a) {
            return this.f42594b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f42593a = true;
            this.f42595c.setVisibility(getVisibility());
            this.f42595c.setAlpha(this.f42594b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42593a) {
            this.f42593a = false;
            this.f42595c.setVisibility(8);
            super.setAlpha(this.f42594b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f42594b = f7;
        if (this.f42593a) {
            this.f42595c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f42595c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f42593a) {
            this.f42595c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
