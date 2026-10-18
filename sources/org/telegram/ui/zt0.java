package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class zt0 extends org.telegram.ui.Components.n11 {
    public boolean f43824a;
    public float f43825b;
    public NestedScrollView f43826c;
    public FrameLayout d;

    public zt0(Context context) {
        super(context);
        this.f43824a = false;
        this.f43825b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f43824a && z10) {
            this.f43826c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43824a) {
            return this.f43825b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43824a = true;
            this.f43826c.setVisibility(getVisibility());
            this.f43826c.setAlpha(this.f43825b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43824a) {
            this.f43824a = false;
            this.f43826c.setVisibility(8);
            super.setAlpha(this.f43825b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f43825b = f7;
        if (this.f43824a) {
            this.f43826c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43826c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f43824a) {
            this.f43826c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
