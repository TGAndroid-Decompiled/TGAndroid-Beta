package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.e11 {
    public boolean f37229a;
    public float f37230b;
    public NestedScrollView f37231c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f37229a = false;
        this.f37230b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f37229a && z10) {
            this.f37231c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f37229a) {
            return this.f37230b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f37229a = true;
            this.f37231c.setVisibility(getVisibility());
            this.f37231c.setAlpha(this.f37230b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37229a) {
            this.f37229a = false;
            this.f37231c.setVisibility(8);
            super.setAlpha(this.f37230b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f37230b = f7;
        if (this.f37229a) {
            this.f37231c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f37231c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f37229a) {
            this.f37231c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
