package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

public final class qt0 extends org.telegram.ui.Components.zz0 {

    public boolean f41743a;

    public float f41744b;

    public NestedScrollView f41745c;
    public FrameLayout d;

    public qt0(Context context) {
        super(context);
        this.f41743a = false;
        this.f41744b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f41743a && z10) {
            this.f41745c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        return this.f41743a ? this.f41744b : super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null || getParent() != this.d) {
            return;
        }
        this.f41743a = true;
        this.f41745c.setVisibility(getVisibility());
        this.f41745c.setAlpha(this.f41744b);
        super.setAlpha(1.0f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41743a) {
            this.f41743a = false;
            this.f41745c.setVisibility(8);
            super.setAlpha(this.f41744b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f41744b = f10;
        if (this.f41743a) {
            this.f41745c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41745c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f41743a) {
            this.f41745c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
