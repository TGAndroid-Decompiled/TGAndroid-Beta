package vh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.gr;
public final class f4 extends FrameLayout {
    public View f51131a;
    public ArrayList f51132b;
    public e4 f51133c;
    public String d;
    public boolean e;
    public q20 f51134f;
    public boolean h;
    public float f51135n;
    public boolean f51136r;
    public ValueAnimator f51137s;

    public final void a(int i10, int i11, String str) {
        d4 d4Var = new d4(this, getContext(), i10, i11);
        d4Var.setContentDescription(str);
        this.f51132b.add(d4Var);
        addView(d4Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f51136r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f51137s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f51136r = z10;
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f51135n;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f51137s = ofFloat;
            ofFloat.addUpdateListener(new c4(0, this));
            if (this.f51136r) {
                this.f51137s.setDuration(450L);
                this.f51137s.setInterpolator(new LinearInterpolator());
            } else {
                this.f51137s.setDuration(350L);
                this.f51137s.setInterpolator(gr.h);
            }
            this.f51137s.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f51135n = f7;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f51132b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            d4 d4Var = (d4) arrayList.get(i10);
            if (d4Var.f51076a == 4) {
                if (d4Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        int i11;
        ArrayList arrayList = this.f51132b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d4 d4Var = (d4) arrayList.get(i12);
            if (d4Var.f51076a == i10) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                d4Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f51131a;
        view.setAlpha(this.f51135n);
        view.setTranslationY((1.0f - this.f51135n) * org.telegram.messenger.i0.L(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.f51135n;
            if (this.f51136r) {
                f7 = gr.h.getInterpolation(org.telegram.messenger.i0.s(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A;
        float f7;
        int i14;
        ArrayList arrayList = this.f51132b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f51131a.layout(0, 0, i15, i16);
        e4 e4Var = this.f51133c;
        e4Var.layout(i15 - e4Var.getMeasuredWidth(), (i16 - this.f51133c.getMeasuredHeight()) / 2, i15, (this.f51133c.getMeasuredHeight() + i16) / 2);
        int L = (i15 - org.telegram.messenger.i0.L(32.33f)) - this.f51133c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((d4) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            A = 0;
        } else {
            A = z20.A(40.0f, i17, L) / (i17 - 1);
        }
        if (c()) {
            f7 = 20.0f;
        } else {
            f7 = 30.0f;
        }
        int min = Math.min(org.telegram.messenger.i0.L(f7), A);
        int y3 = z20.y(40.0f, i16, 2);
        int L2 = (org.telegram.messenger.i0.L(40.0f) + i16) / 2;
        int L3 = org.telegram.messenger.i0.L(12.33f);
        if (!c()) {
            i14 = (z20.A(40.0f, i17, L) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = L3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((d4) arrayList.get(i20)).getVisibility() == 0) {
                ((d4) arrayList.get(i20)).layout(i19, y3, org.telegram.messenger.i0.L(40.0f) + i19, L2);
                i19 = org.telegram.messenger.m5.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
    }

    public void setOnClickListener(q20 q20Var) {
        this.f51134f = q20Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            e4 e4Var = this.f51133c;
            e4Var.f51108s = z10;
            e4Var.invalidate();
        }
    }
}
