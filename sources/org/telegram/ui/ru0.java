package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.f11 {
    public boolean f37134a;
    public float f37135b;
    public NestedScrollView f37136c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f37134a = false;
        this.f37135b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37134a && z10) {
            this.f37136c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37134a) {
            return this.f37135b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37134a = true;
            this.f37136c.setVisibility(getVisibility());
            this.f37136c.setAlpha(this.f37135b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37134a) {
            this.f37134a = false;
            this.f37136c.setVisibility(8);
            super.setAlpha(this.f37135b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37135b = f7;
        if (this.f37134a) {
            this.f37136c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37136c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37134a) {
            this.f37136c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
