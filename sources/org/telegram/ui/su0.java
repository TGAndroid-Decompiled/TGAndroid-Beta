package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class su0 extends org.telegram.ui.Components.v11 {
    public boolean f41772a;
    public float f41773b;
    public NestedScrollView f41774c;
    public FrameLayout d;

    public su0(Context context) {
        super(context);
        this.f41772a = false;
        this.f41773b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41772a && z10) {
            this.f41774c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41772a) {
            return this.f41773b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41772a = true;
            this.f41774c.setVisibility(getVisibility());
            this.f41774c.setAlpha(this.f41773b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41772a) {
            this.f41772a = false;
            this.f41774c.setVisibility(8);
            super.setAlpha(this.f41773b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f41773b = f7;
        if (this.f41772a) {
            this.f41774c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41774c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f41772a) {
            this.f41774c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
