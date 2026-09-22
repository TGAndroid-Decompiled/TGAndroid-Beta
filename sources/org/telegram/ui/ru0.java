package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.g11 {
    public boolean f37251a;
    public float f37252b;
    public NestedScrollView f37253c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f37251a = false;
        this.f37252b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37251a && z10) {
            this.f37253c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37251a) {
            return this.f37252b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37251a = true;
            this.f37253c.setVisibility(getVisibility());
            this.f37253c.setAlpha(this.f37252b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37251a) {
            this.f37251a = false;
            this.f37253c.setVisibility(8);
            super.setAlpha(this.f37252b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37252b = f7;
        if (this.f37251a) {
            this.f37253c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37253c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37251a) {
            this.f37253c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
