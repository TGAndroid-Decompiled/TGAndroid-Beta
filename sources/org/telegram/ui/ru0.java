package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ru0 extends org.telegram.ui.Components.d11 {
    public boolean f36453a;
    public float f36454b;
    public NestedScrollView f36455c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.f36453a = false;
        this.f36454b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f36453a && z10) {
            this.f36455c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f36453a) {
            return this.f36454b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f36453a = true;
            this.f36455c.setVisibility(getVisibility());
            this.f36455c.setAlpha(this.f36454b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36453a) {
            this.f36453a = false;
            this.f36455c.setVisibility(8);
            super.setAlpha(this.f36454b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f36454b = f7;
        if (this.f36453a) {
            this.f36455c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f36455c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f36453a) {
            this.f36455c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
