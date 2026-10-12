package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class yu0 extends org.telegram.ui.Components.r11 {
    public boolean f42282a;
    public float f42283b;
    public NestedScrollView f42284c;
    public FrameLayout d;

    public yu0(Context context) {
        super(context);
        this.f42282a = false;
        this.f42283b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f42282a && z10) {
            this.f42284c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f42282a) {
            return this.f42283b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f42282a = true;
            this.f42284c.setVisibility(getVisibility());
            this.f42284c.setAlpha(this.f42283b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42282a) {
            this.f42282a = false;
            this.f42284c.setVisibility(8);
            super.setAlpha(this.f42283b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f42283b = f7;
        if (this.f42282a) {
            this.f42284c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f42284c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f42282a) {
            this.f42284c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
