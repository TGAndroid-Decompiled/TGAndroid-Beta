package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class qu0 extends org.telegram.ui.Components.p01 {
    public boolean f40006a;
    public float f40007b;
    public NestedScrollView f40008c;
    public FrameLayout d;

    public qu0(Context context) {
        super(context);
        this.f40006a = false;
        this.f40007b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f40006a && z10) {
            this.f40008c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f40006a) {
            return this.f40007b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f40006a = true;
            this.f40008c.setVisibility(getVisibility());
            this.f40008c.setAlpha(this.f40007b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40006a) {
            this.f40006a = false;
            this.f40008c.setVisibility(8);
            super.setAlpha(this.f40007b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f40007b = f7;
        if (this.f40006a) {
            this.f40008c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f40008c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f40006a) {
            this.f40008c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
