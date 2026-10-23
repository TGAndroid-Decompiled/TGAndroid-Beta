package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class xt0 extends org.telegram.ui.Components.p11 {
    public boolean f43273a;
    public float f43274b;
    public NestedScrollView f43275c;
    public FrameLayout d;

    public xt0(Context context) {
        super(context);
        this.f43273a = false;
        this.f43274b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f43273a && z10) {
            this.f43275c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43273a) {
            return this.f43274b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43273a = true;
            this.f43275c.setVisibility(getVisibility());
            this.f43275c.setAlpha(this.f43274b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43273a) {
            this.f43273a = false;
            this.f43275c.setVisibility(8);
            super.setAlpha(this.f43274b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f43274b = f7;
        if (this.f43273a) {
            this.f43275c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43275c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f43273a) {
            this.f43275c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
