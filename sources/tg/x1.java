package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.kq;
public abstract class x1 extends hi.e {
    public final fa m0;
    public final RectF f58292n0;
    public int f58293o0;
    public final i2 f58294p0;
    public final i6 f58295q0;
    public int f58296r0;
    public boolean f58297s0;

    public x1(i2 i2Var, ContextThemeWrapper contextThemeWrapper, i6 i6Var, ba baVar) {
        super(contextThemeWrapper, i6Var, false);
        this.f58292n0 = new RectF();
        this.f58296r0 = 8;
        this.f58295q0 = i6Var;
        this.f58294p0 = i2Var;
        this.m0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.f14350r);
        setForeground(n6.a0(n6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f14345i0;
        RectF rectF = this.f58292n0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f58297s0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public void setAlpha(float f10) {
        f2[] f2VarArr;
        i2 i2Var = this.f58294p0;
        super.setAlpha((!i2Var.E || (f2VarArr = i2Var.I) == null || f2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f58293o0 = 2;
        i(gd.N0(2131752577, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f58293o0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(2131231752, 0);
        kqVar.c(org.telegram.messenger.g0.L(22.0f));
        kqVar.f36853r = org.telegram.messenger.g0.L(1.0f);
        kqVar.f36854s = org.telegram.messenger.g0.L(2.0f);
        kqVar.H = 1.2f;
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745484, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f58293o0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(2131231731, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.f36853r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745482, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f58293o0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(2131231762, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.f36853r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745481, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i7) {
        this.f58296r0 = i7;
        setForeground(n6.a0(n6.w0(n6.f29543i6, this.f58295q0), i7, i7));
    }

    public void setRestoreState(boolean z10) {
        this.f58293o0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(2131231732, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.f36853r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745480, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f58293o0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f58293o0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        kq kqVar = new kq(2131232536, 0);
        kqVar.c(org.telegram.messenger.g0.L(20.0f));
        kqVar.f36853r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131745478, null));
        i(spannableStringBuilder, z10, true);
    }

    @Override
    public void setVisibility(int i7) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i7);
        }
    }
}
