package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.q01 {
    public boolean f37188a;
    public float f37189b;
    public NestedScrollView f37190c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f37188a = false;
        this.f37189b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37188a && z10) {
            this.f37190c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37188a) {
            return this.f37189b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37188a = true;
            this.f37190c.setVisibility(getVisibility());
            this.f37190c.setAlpha(this.f37189b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37188a) {
            this.f37188a = false;
            this.f37190c.setVisibility(8);
            super.setAlpha(this.f37189b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37189b = f7;
        if (this.f37188a) {
            this.f37190c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37190c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37188a) {
            this.f37190c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
