package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class tu0 extends org.telegram.ui.Components.r01 {
    public boolean f37867a;
    public float f37868b;
    public NestedScrollView f37869c;
    public FrameLayout d;

    public tu0(Context context) {
        super(context);
        this.f37867a = false;
        this.f37868b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37867a && z10) {
            this.f37869c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37867a) {
            return this.f37868b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37867a = true;
            this.f37869c.setVisibility(getVisibility());
            this.f37869c.setAlpha(this.f37868b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37867a) {
            this.f37867a = false;
            this.f37869c.setVisibility(8);
            super.setAlpha(this.f37868b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37868b = f7;
        if (this.f37867a) {
            this.f37869c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37869c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37867a) {
            this.f37869c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
