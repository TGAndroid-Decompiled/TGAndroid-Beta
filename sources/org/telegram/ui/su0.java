package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class su0 extends org.telegram.ui.Components.v11 {
    public boolean f41770a;
    public float f41771b;
    public NestedScrollView f41772c;
    public FrameLayout d;

    public su0(Context context) {
        super(context);
        this.f41770a = false;
        this.f41771b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41770a && z10) {
            this.f41772c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41770a) {
            return this.f41771b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41770a = true;
            this.f41772c.setVisibility(getVisibility());
            this.f41772c.setAlpha(this.f41771b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41770a) {
            this.f41770a = false;
            this.f41772c.setVisibility(8);
            super.setAlpha(this.f41771b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f41771b = f7;
        if (this.f41770a) {
            this.f41772c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41772c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f41770a) {
            this.f41772c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
