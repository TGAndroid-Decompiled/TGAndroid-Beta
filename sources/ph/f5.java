package ph;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
public final class f5 extends FrameLayout {
    public View f41688a;
    public ArrayList f41689b;
    public e5 f41690c;
    public String d;
    public boolean e;
    public Utilities.Callback f41691f;
    public boolean h;
    public float f41692n;
    public boolean f41693r;
    public ValueAnimator f41694s;

    public final void a(int i10, int i11, String str) {
        d5 d5Var = new d5(this, getContext(), i10, i11);
        d5Var.setContentDescription(str);
        this.f41689b.add(d5Var);
        addView(d5Var);
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f41693r == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.f41694s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f41693r = z4;
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f41692n;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f41694s = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 18));
            if (this.f41693r) {
                this.f41694s.setDuration(450L);
                this.f41694s.setInterpolator(new LinearInterpolator());
            } else {
                this.f41694s.setDuration(350L);
                this.f41694s.setInterpolator(mr.h);
            }
            this.f41694s.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.f41692n = f10;
        e();
    }

    public final boolean c() {
        ArrayList arrayList = this.f41689b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            d5 d5Var = (d5) arrayList.get(i10);
            if (d5Var.f41492a == 4) {
                if (d5Var.getVisibility() == 0) {
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
        ArrayList arrayList = this.f41689b;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d5 d5Var = (d5) arrayList.get(i12);
            if (d5Var.f41492a == i10) {
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                d5Var.setVisibility(i11);
            }
        }
    }

    public final void e() {
        View view = this.f41688a;
        view.setAlpha(this.f41692n);
        view.setTranslationY((1.0f - this.f41692n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f10 = this.f41692n;
            if (this.f41693r) {
                f10 = mr.h.getInterpolation(AndroidUtilities.cascade(f10, i10 - 1, getChildCount() - 1, 3.0f));
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
        ArrayList arrayList = this.f41689b;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        this.f41688a.layout(0, 0, i15, i16);
        e5 e5Var = this.f41690c;
        e5Var.layout(i15 - e5Var.getMeasuredWidth(), (i16 - this.f41690c.getMeasuredHeight()) / 2, i15, (this.f41690c.getMeasuredHeight() + i16) / 2);
        int dp = (i15 - AndroidUtilities.dp(32.33f)) - this.f41690c.getMeasuredWidth();
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((d5) arrayList.get(i18)).getVisibility() == 0) {
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
            if (((d5) arrayList.get(i20)).getVisibility() == 0) {
                ((d5) arrayList.get(i20)).layout(i19, x10, AndroidUtilities.dp(40.0f) + i19, dp2);
                i19 = org.telegram.messenger.y3.C(40.0f, min, i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f41691f = callback;
    }

    public void setShareEnabled(boolean z4) {
        if (this.h != z4) {
            this.h = z4;
            e5 e5Var = this.f41690c;
            e5Var.f41611s = z4;
            e5Var.invalidate();
        }
    }
}
