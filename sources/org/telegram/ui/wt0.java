package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class wt0 extends org.telegram.ui.Components.u01 {
    public boolean f39792a;
    public float f39793b;
    public NestedScrollView f39794c;
    public FrameLayout d;

    public wt0(Context context) {
        super(context);
        this.f39792a = false;
        this.f39793b = 1.0f;
    }

    public final void b(int i10, boolean z4) {
        super.setVisibility(i10);
        if (this.f39792a && z4) {
            this.f39794c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f39792a) {
            return this.f39793b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f39792a = true;
            this.f39794c.setVisibility(getVisibility());
            this.f39794c.setAlpha(this.f39793b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39792a) {
            this.f39792a = false;
            this.f39794c.setVisibility(8);
            super.setAlpha(this.f39793b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f39793b = f10;
        if (this.f39792a) {
            this.f39794c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f39794c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f39792a) {
            this.f39794c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
