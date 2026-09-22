package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.q01 {
    public boolean f37206a;
    public float f37207b;
    public NestedScrollView f37208c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f37206a = false;
        this.f37207b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37206a && z10) {
            this.f37208c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37206a) {
            return this.f37207b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37206a = true;
            this.f37208c.setVisibility(getVisibility());
            this.f37208c.setAlpha(this.f37207b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37206a) {
            this.f37206a = false;
            this.f37208c.setVisibility(8);
            super.setAlpha(this.f37207b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37207b = f7;
        if (this.f37206a) {
            this.f37208c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37208c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37206a) {
            this.f37208c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
