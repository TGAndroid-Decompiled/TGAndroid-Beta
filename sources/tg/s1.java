package tg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x9;
public abstract class s1 extends fi.d {
    public final ba f55955k0;
    public final RectF f55956l0;
    public int m0;
    public final c2 f55957n0;
    public final h6 f55958o0;
    public int f55959p0;
    public boolean f55960q0;

    public s1(c2 c2Var, ContextThemeWrapper contextThemeWrapper, h6 h6Var, x9 x9Var) {
        super(contextThemeWrapper, h6Var, false);
        this.f55956l0 = new RectF();
        this.f55959p0 = 8;
        this.f55958o0 = h6Var;
        this.f55957n0 = c2Var;
        this.f55955k0 = new ba(x9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.g0.o());
        removeView(this.f11767r);
        setForeground(m6.a0(m6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z9 = this.f11762g0;
        RectF rectF = this.f55956l0;
        if (z9) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f55960q0) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public void setAlpha(float f10) {
        z1[] z1VarArr;
        c2 c2Var = this.f55957n0;
        super.setAlpha((!c2Var.D || (z1VarArr = c2Var.H) == null || z1VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z9) {
        this.m0 = 2;
        i(id.M0(2131752589, null), z9, true);
    }

    public void setCutOutState(boolean z9) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(2131231748, 0);
        wpVar.c(org.telegram.messenger.g0.L(22.0f));
        wpVar.f40038r = org.telegram.messenger.g0.L(1.0f);
        wpVar.f40039s = org.telegram.messenger.g0.L(2.0f);
        wpVar.G = 1.2f;
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745680, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setEraseState(boolean z9) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(2131231727, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.f40038r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745678, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setOutlineState(boolean z9) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(2131231758, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.f40038r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745677, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setRad(int i7) {
        this.f55959p0 = i7;
        setForeground(m6.a0(m6.w0(m6.f27982i6, this.f55958o0), i7, i7));
    }

    public void setRestoreState(boolean z9) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(2131231728, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.f40038r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745676, null));
        i(spannableStringBuilder, z9, true);
    }

    public void setUndoCutState(boolean z9) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z9) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wp wpVar = new wp(2131232531, 0);
        wpVar.c(org.telegram.messenger.g0.L(20.0f));
        wpVar.f40038r = org.telegram.messenger.g0.L(-3.0f);
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131745674, null));
        i(spannableStringBuilder, z9, true);
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
