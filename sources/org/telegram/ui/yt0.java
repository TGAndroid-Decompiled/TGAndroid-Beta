package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class yt0 extends org.telegram.ui.Components.v01 {
    public boolean f43704a;
    public float f43705b;
    public NestedScrollView f43706c;
    public FrameLayout d;

    public yt0(Context context) {
        super(context);
        this.f43704a = false;
        this.f43705b = 1.0f;
    }

    public final void b(int i10, boolean z4) {
        super.setVisibility(i10);
        if (this.f43704a && z4) {
            this.f43706c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43704a) {
            return this.f43705b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43704a = true;
            this.f43706c.setVisibility(getVisibility());
            this.f43706c.setAlpha(this.f43705b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43704a) {
            this.f43704a = false;
            this.f43706c.setVisibility(8);
            super.setAlpha(this.f43705b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f43705b = f10;
        if (this.f43704a) {
            this.f43706c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43706c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f43704a) {
            this.f43706c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
