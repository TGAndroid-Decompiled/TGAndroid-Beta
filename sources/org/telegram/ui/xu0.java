package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class xu0 extends org.telegram.ui.Components.s11 {
    public boolean f41663a;
    public float f41664b;
    public NestedScrollView f41665c;
    public FrameLayout d;

    public xu0(Context context) {
        super(context);
        this.f41663a = false;
        this.f41664b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41663a && z10) {
            this.f41665c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41663a) {
            return this.f41664b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41663a = true;
            this.f41665c.setVisibility(getVisibility());
            this.f41665c.setAlpha(this.f41664b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41663a) {
            this.f41663a = false;
            this.f41665c.setVisibility(8);
            super.setAlpha(this.f41664b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f41664b = f7;
        if (this.f41663a) {
            this.f41665c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41665c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f41663a) {
            this.f41665c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
