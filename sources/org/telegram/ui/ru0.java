package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.w11 {
    public boolean f41546a;
    public float f41547b;
    public NestedScrollView f41548c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f41546a = false;
        this.f41547b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41546a && z10) {
            this.f41548c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41546a) {
            return this.f41547b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41546a = true;
            this.f41548c.setVisibility(getVisibility());
            this.f41548c.setAlpha(this.f41547b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41546a) {
            this.f41546a = false;
            this.f41548c.setVisibility(8);
            super.setAlpha(this.f41547b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f41547b = f7;
        if (this.f41546a) {
            this.f41548c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41548c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f41546a) {
            this.f41548c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
