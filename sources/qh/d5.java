package qh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public final class d5 extends FrameLayout {
    public View f45226a;
    public ArrayList f45227b;
    public c5 f45228c;
    public String d;
    public boolean f45229e;
    public Utilities.Callback f45230f;
    public boolean h;
    public float f45231n;
    public boolean f45232r;
    public ValueAnimator f45233s;

    public final void a(int i10, int i11, String str) {
        b5 b5Var = new b5(this, getContext(), i10, i11);
        b5Var.setContentDescription(str);
        this.f45227b.add(b5Var);
        addView(b5Var);
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f45232r == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.f45233s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f45232r = z4;
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f45231n;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f45233s = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 18));
            if (this.f45232r) {
                this.f45233s.setDuration(450L);
                this.f45233s.setInterpolator(new LinearInterpolator());
            } else {
                this.f45233s.setDuration(350L);
                this.f45233s.setInterpolator(pr.h);
            }
            this.f45233s.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.f45231n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f45227b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            b5 b5Var = (b5) arrayList.get(i10);
            if (b5Var.f45022a == 4) {
                if (b5Var.getVisibility() == 0) {
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z4) {
        int i11;
        ArrayList arrayList = this.f45227b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b5 b5Var = (b5) arrayList.get(i12);
            if (b5Var.f45022a == i10) {
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                b5Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f45226a;
        view.setAlpha(this.f45231n);
        view.setTranslationY((1.0f - this.f45231n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f10 = this.f45231n;
            if (this.f45232r) {
                f10 = pr.h.getInterpolation(AndroidUtilities.cascade(f10, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int z10;
        float f10;
        int i14;
        ArrayList arrayList = this.f45227b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f45226a.layout(0, 0, i15, i16);
        c5 c5Var = this.f45228c;
        c5Var.layout(i15 - c5Var.getMeasuredWidth(), (i16 - this.f45228c.getMeasuredHeight()) / 2, i15, (this.f45228c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f45228c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((b5) arrayList.get(i18)).getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 2) {
            z10 = 0;
        } else {
            z10 = org.telegram.ui.b.z(40.0f, i17, dp) / (i17 - 1);
        }
        if (c()) {
            f10 = 20.0f;
        } else {
            f10 = 30.0f;
        }
        int min = Math.min(AndroidUtilities.dp(f10), z10);
        int x10 = org.telegram.ui.b.x(40.0f, i16, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i16) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        if (!c()) {
            i14 = (org.telegram.ui.b.z(40.0f, i17, dp) - ((i17 - 1) * min)) / 2;
        } else {
            i14 = 0;
        }
        int i19 = dp3 + i14;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            if (((b5) arrayList.get(i20)).getVisibility() == 0) {
                ((b5) arrayList.get(i20)).layout(i19, x10, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.y3.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f45230f = callback;
    }

    public void setShareEnabled(boolean z4) {
        if (this.h != z4) {
            this.h = z4;
            c5 c5Var = this.f45228c;
            c5Var.f45177s = z4;
            c5Var.invalidate();
        }
    }
}
