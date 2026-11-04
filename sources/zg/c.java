package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.e4;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
public abstract class c extends FrameLayout {
    public final e6 f60472a;
    public final u8 f60473b;
    public final k9 f60474c;
    public final e4 d;
    public final k5 f60475e;
    public final RadioButton f60476f;
    public final Paint h;
    public boolean f60477n;
    public final View f60478r;

    public c(Context context, e6 e6Var) {
        super(context);
        int i3;
        u8 u8Var = new u8((e6) null);
        this.f60473b = u8Var;
        this.h = new Paint(1);
        this.f60472a = e6Var;
        View view = new View(context);
        this.f60478r = view;
        addView(view, mf.o(-1, -1));
        r6.i(k6.f27954h5, view, e6Var);
        u8Var.f38693r = g0.L(40.0f);
        k9 k9Var = new k9(context);
        this.f60474c = k9Var;
        k9Var.setRoundRadius(g0.L(20.0f));
        addView(k9Var);
        e4 e4Var = new e4(context, 5);
        this.d = e4Var;
        hs.i(e4Var);
        hs.i(k9Var);
        e4Var.setTextSize(16);
        int i10 = k6.f27988j5;
        r6.Y(e4Var, i10, e6Var);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        e4Var.setGravity(i3);
        addView(e4Var);
        k5 k5Var = new k5(context);
        this.f60475e = k5Var;
        k5Var.setTextSize(14);
        r6.Y(k5Var, i10, e6Var);
        k5Var.setGravity(bd.f21784a0 ? 5 : 3);
        addView(k5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f60476f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.f27990j7, k6.E5, e6Var);
        addView(radioButton);
        d();
        if (!b()) {
            radioButton.setVisibility(8);
        }
    }

    public int a() {
        return 0;
    }

    public abstract boolean b();

    public void c(boolean z10, boolean z11) {
        RadioButton radioButton = this.f60476f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        int i3;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i14;
        int i15 = 3;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i16 = i3 | 16;
        if (b()) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (b()) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f60474c.setLayoutParams(mf.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z10 = bd.f21784a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        int i18 = 70;
        if (z10) {
            f12 = 20.0f;
        } else {
            if (b()) {
                i11 = 105;
            } else {
                i11 = 70;
            }
            f12 = i11;
        }
        if (bd.f21784a0) {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(mf.d(-1, -2.0f, i17, f12, 0.0f, f13, 0.0f));
        boolean z11 = bd.f21784a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 16;
        if (z11) {
            f14 = 20.0f;
        } else {
            if (b()) {
                i13 = 105;
            } else {
                i13 = 70;
            }
            f14 = i13;
        }
        if (bd.f21784a0) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f60475e.setLayoutParams(mf.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z12 = bd.f21784a0;
        if (z12) {
            i15 = 5;
        }
        int i20 = i15 | 16;
        if (z12) {
            f16 = 15.0f;
        } else {
            f16 = 20.0f;
        }
        if (z12) {
            f17 = 20.0f;
        } else {
            f17 = 15.0f;
        }
        this.f60476f.setLayoutParams(mf.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        if (this.f60477n) {
            int w02 = k6.w0(k6.f27879d7, this.f60472a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i3 = 105;
            } else {
                i3 = 70;
            }
            if (this.f60474c.getVisibility() == 8) {
                i3 -= 40;
            }
            int a10 = a() + i3;
            if (bd.f21784a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        wp wpVar = new wp(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z10) {
        this.f60477n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        e4 e4Var = this.d;
        k5 k5Var = this.f60475e;
        if (isEmpty) {
            e4Var.setTranslationY(0.0f);
            k5Var.setVisibility(8);
        } else {
            e4Var.setTranslationY(g0.L(-9.0f));
            k5Var.setTranslationY(g0.L(12.0f));
            k5Var.l(charSequence, false);
            k5Var.setVisibility(0);
        }
        if (this.f60474c.getVisibility() == 8) {
            if (bd.f21784a0) {
                e4Var.setTranslationX(g0.L(40.0f));
                k5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            e4Var.setTranslationX(g0.L(-40.0f));
            k5Var.setTranslationX(g0.L(-40.0f));
        }
    }
}
