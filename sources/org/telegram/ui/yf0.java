package org.telegram.ui;

import android.content.Context;
public final class yf0 extends sg.e {
    public final int f40140b0;

    public yf0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.f40140b0 = i12;
    }

    @Override
    public void k() {
        switch (this.f40140b0) {
            case 4:
                return;
            default:
                super.k();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f40140b0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40140b0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    private final void l() {
    }
}
