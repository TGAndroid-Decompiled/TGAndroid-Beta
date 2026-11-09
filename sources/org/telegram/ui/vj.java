package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class vj extends FrameLayout {
    public final int f50710a;
    public final cn f50711b;

    public vj(cn cnVar, Context context, int i7) {
        super(context);
        this.f50710a = i7;
        this.f50711b = cnVar;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        int i13;
        switch (this.f50710a) {
            case 1:
                cn cnVar = this.f50711b;
                if (view == cnVar.f44489i3) {
                    ImageView imageView = cnVar.f44462g3;
                    if (imageView != null && imageView.getVisibility() != 8) {
                        i13 = 66;
                    } else {
                        i13 = 18;
                    }
                    ImageView imageView2 = cnVar.f44476h3;
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
        switch (this.f50710a) {
            case 2:
                super.setTranslationY(f10);
                this.f50711b.l1.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        boolean z9;
        switch (this.f50710a) {
            case 0:
                super.setVisibility(i7);
                m6.n nVar = this.f50711b.f44485hd;
                boolean z10 = false;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (getMeasuredWidth() > 0) {
                    z10 = true;
                }
                nVar.h(2, z9, z10);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
