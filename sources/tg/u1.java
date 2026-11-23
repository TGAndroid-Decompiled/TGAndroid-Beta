package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.nq;
public abstract class u1 extends hi.e {
    public final ga m0;
    public final RectF f58193n0;
    public int f58194o0;
    public final f2 f58195p0;
    public final h6 f58196q0;
    public int f58197r0;
    public boolean f58198s0;

    public u1(f2 f2Var, ContextThemeWrapper contextThemeWrapper, h6 h6Var, ca caVar) {
        super(contextThemeWrapper, h6Var, false);
        this.f58193n0 = new RectF();
        this.f58197r0 = 8;
        this.f58196q0 = h6Var;
        this.f58195p0 = f2Var;
        this.m0 = new ga(caVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.f14577r);
        setForeground(m6.a0(m6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f14572i0;
        RectF rectF = this.f58193n0;
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
        if (this.f58198s0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public void setAlpha(float f10) {
        c2[] c2VarArr;
        f2 f2Var = this.f58195p0;
        super.setAlpha((!f2Var.E || (c2VarArr = f2Var.I) == null || c2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f58194o0 = 2;
        i(hd.N0(2131752577, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f58194o0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(2131231749, 0);
        nqVar.c(org.telegram.messenger.g0.L(22.0f));
        nqVar.f37951r = org.telegram.messenger.g0.L(1.0f);
        nqVar.f37952s = org.telegram.messenger.g0.L(2.0f);
        nqVar.H = 1.2f;
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131745484, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f58194o0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(2131231728, 0);
        nqVar.c(org.telegram.messenger.g0.L(20.0f));
        nqVar.f37951r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131745482, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f58194o0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(2131231759, 0);
        nqVar.c(org.telegram.messenger.g0.L(20.0f));
        nqVar.f37951r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131745481, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i7) {
        this.f58197r0 = i7;
        setForeground(m6.a0(m6.w0(m6.f29473i6, this.f58196q0), i7, i7));
    }

    public void setRestoreState(boolean z10) {
        this.f58194o0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(2131231729, 0);
        nqVar.c(org.telegram.messenger.g0.L(20.0f));
        nqVar.f37951r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131745480, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f58194o0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f58194o0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(2131232533, 0);
        nqVar.c(org.telegram.messenger.g0.L(20.0f));
        nqVar.f37951r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131745478, null));
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
