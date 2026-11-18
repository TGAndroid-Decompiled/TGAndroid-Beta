package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class uj extends FrameLayout {
    public final int f52583a;
    public final bn f52584b;

    public uj(bn bnVar, Context context, int i7) {
        super(context);
        this.f52583a = i7;
        this.f52584b = bnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        int i13;
        switch (this.f52583a) {
            case 1:
                bn bnVar = this.f52584b;
                if (view == bnVar.j3) {
                    ImageView imageView = bnVar.f46031h3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i13 = 66;
                    } else {
                        i13 = 18;
                    }
                    ImageView imageView2 = bnVar.f46044i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i13 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13);
                }
                super.measureChildWithMargins(view, i7, i10, i11, i12);
                return;
            default:
                super.measureChildWithMargins(view, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f52583a) {
            case 2:
                super.setTranslationY(f10);
                this.f52584b.f46093m1.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        switch (this.f52583a) {
            case 0:
                super.setVisibility(i7);
                m6.n nVar = this.f52584b.f46066jd;
                boolean z11 = false;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z11 = true;
                }
                nVar.h(2, z10, z11);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
