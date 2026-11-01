package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class vr0 extends org.telegram.ui.Components.b01 {
    public boolean f42596a;
    public float f42597b;
    public NestedScrollView f42598c;
    public FrameLayout d;

    public vr0(Context context) {
        super(context);
        this.f42596a = false;
        this.f42597b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f42596a && z10) {
            this.f42598c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f42596a) {
            return this.f42597b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f42596a = true;
            this.f42598c.setVisibility(getVisibility());
            this.f42598c.setAlpha(this.f42597b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42596a) {
            this.f42596a = false;
            this.f42598c.setVisibility(8);
            super.setAlpha(this.f42597b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f42597b = f7;
        if (this.f42596a) {
            this.f42598c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f42598c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f42596a) {
            this.f42598c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
