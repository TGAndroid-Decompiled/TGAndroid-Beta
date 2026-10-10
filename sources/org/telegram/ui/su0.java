package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class su0 extends org.telegram.ui.Components.w11 {
    public boolean f41816a;
    public float f41817b;
    public NestedScrollView f41818c;
    public FrameLayout d;

    public su0(Context context) {
        super(context);
        this.f41816a = false;
        this.f41817b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41816a && z10) {
            this.f41818c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41816a) {
            return this.f41817b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41816a = true;
            this.f41818c.setVisibility(getVisibility());
            this.f41818c.setAlpha(this.f41817b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41816a) {
            this.f41816a = false;
            this.f41818c.setVisibility(8);
            super.setAlpha(this.f41817b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f41817b = f7;
        if (this.f41816a) {
            this.f41818c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41818c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f41816a) {
            this.f41818c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
