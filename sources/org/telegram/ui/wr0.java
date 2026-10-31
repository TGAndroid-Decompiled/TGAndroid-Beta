package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class wr0 extends org.telegram.ui.Components.a01 {
    public boolean f43356a;
    public float f43357b;
    public NestedScrollView f43358c;
    public FrameLayout d;

    public wr0(Context context) {
        super(context);
        this.f43356a = false;
        this.f43357b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f43356a && z10) {
            this.f43358c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f43356a) {
            return this.f43357b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f43356a = true;
            this.f43358c.setVisibility(getVisibility());
            this.f43358c.setAlpha(this.f43357b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43356a) {
            this.f43356a = false;
            this.f43358c.setVisibility(8);
            super.setAlpha(this.f43357b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f43357b = f7;
        if (this.f43356a) {
            this.f43358c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f43358c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f43356a) {
            this.f43358c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
