package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class xt0 extends org.telegram.ui.Components.o11 {
    public boolean f43259a;
    public float f43260b;
    public NestedScrollView f43261c;
    public FrameLayout d;

    public xt0(Context context) {
        super(context);
        this.f43259a = false;
        this.f43260b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f43259a && z10) {
            this.f43261c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43259a) {
            return this.f43260b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43259a = true;
            this.f43261c.setVisibility(getVisibility());
            this.f43261c.setAlpha(this.f43260b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43259a) {
            this.f43259a = false;
            this.f43261c.setVisibility(8);
            super.setAlpha(this.f43260b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f43260b = f7;
        if (this.f43259a) {
            this.f43261c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43261c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f43259a) {
            this.f43261c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
