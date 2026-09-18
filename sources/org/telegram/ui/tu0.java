package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class tu0 extends org.telegram.ui.Components.r01 {
    public boolean f37872a;
    public float f37873b;
    public NestedScrollView f37874c;
    public FrameLayout d;

    public tu0(Context context) {
        super(context);
        this.f37872a = false;
        this.f37873b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37872a && z10) {
            this.f37874c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37872a) {
            return this.f37873b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37872a = true;
            this.f37874c.setVisibility(getVisibility());
            this.f37874c.setAlpha(this.f37873b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37872a) {
            this.f37872a = false;
            this.f37874c.setVisibility(8);
            super.setAlpha(this.f37873b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37873b = f7;
        if (this.f37872a) {
            this.f37874c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37874c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37872a) {
            this.f37874c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
