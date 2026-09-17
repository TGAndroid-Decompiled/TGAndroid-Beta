package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class qu0 extends org.telegram.ui.Components.p01 {
    public boolean f40007a;
    public float f40008b;
    public NestedScrollView f40009c;
    public FrameLayout d;

    public qu0(Context context) {
        super(context);
        this.f40007a = false;
        this.f40008b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f40007a && z10) {
            this.f40009c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f40007a) {
            return this.f40008b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f40007a = true;
            this.f40009c.setVisibility(getVisibility());
            this.f40009c.setAlpha(this.f40008b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40007a) {
            this.f40007a = false;
            this.f40009c.setVisibility(8);
            super.setAlpha(this.f40008b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f40008b = f7;
        if (this.f40007a) {
            this.f40009c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f40009c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f40007a) {
            this.f40009c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
