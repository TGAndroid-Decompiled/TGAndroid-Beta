package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.d4;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public abstract class c extends FrameLayout {
    public final f6 f59431a;
    public final w8 f59432b;
    public final l9 f59433c;
    public final d4 d;
    public final k5 f59434e;
    public final RadioButton f59435f;
    public final Paint h;
    public boolean f59436n;
    public final View f59437r;

    public c(Context context, f6 f6Var) {
        super(context);
        int i7;
        w8 w8Var = new w8((f6) null);
        this.f59432b = w8Var;
        this.h = new Paint(1);
        this.f59431a = f6Var;
        View view = new View(context);
        this.f59437r = view;
        addView(view, ha.o(-1, -1));
        r6.i(k6.f27925h5, view, f6Var);
        w8Var.f39872r = g0.L(40.0f);
        l9 l9Var = new l9(context);
        this.f59433c = l9Var;
        l9Var.setRoundRadius(g0.L(20.0f));
        addView(l9Var);
        d4 d4Var = new d4(context, 5);
        this.d = d4Var;
        qs.i(d4Var);
        qs.i(l9Var);
        d4Var.setTextSize(16);
        int i10 = k6.f27960j5;
        r6.Y(d4Var, i10, f6Var);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        d4Var.setGravity(i7);
        addView(d4Var);
        k5 k5Var = new k5(context);
        this.f59434e = k5Var;
        k5Var.setTextSize(14);
        r6.Y(k5Var, i10, f6Var);
        k5Var.setGravity(id.f23157a0 ? 5 : 3);
        addView(k5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f59435f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.f27962j7, k6.E5, f6Var);
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

    public void c(boolean z9, boolean z10) {
        RadioButton radioButton = this.f59435f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z9, true);
        }
    }

    public void d() {
        int i7;
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
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i16 = i7 | 16;
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
        this.f59433c.setLayoutParams(ha.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z9 = id.f23157a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        int i18 = 70;
        if (z9) {
            f12 = 20.0f;
        } else {
            if (b()) {
                i11 = 105;
            } else {
                i11 = 70;
            }
            f12 = i11;
        }
        if (id.f23157a0) {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(ha.d(-1, -2.0f, i17, f12, 0.0f, f13, 0.0f));
        boolean z10 = id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 16;
        if (z10) {
            f14 = 20.0f;
        } else {
            if (b()) {
                i13 = 105;
            } else {
                i13 = 70;
            }
            f14 = i13;
        }
        if (id.f23157a0) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f59434e.setLayoutParams(ha.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z11 = id.f23157a0;
        if (z11) {
            i15 = 5;
        }
        int i20 = i15 | 16;
        if (z11) {
            f16 = 15.0f;
        } else {
            f16 = 20.0f;
        }
        if (z11) {
            f17 = 20.0f;
        } else {
            f17 = 15.0f;
        }
        this.f59435f.setLayoutParams(ha.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f59436n) {
            int w02 = k6.w0(k6.f27853d7, this.f59431a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i7 = 105;
            } else {
                i7 = 70;
            }
            if (this.f59433c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (id.f23157a0) {
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z9) {
        this.f59436n = z9;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        d4 d4Var = this.d;
        k5 k5Var = this.f59434e;
        if (isEmpty) {
            d4Var.setTranslationY(0.0f);
            k5Var.setVisibility(8);
        } else {
            d4Var.setTranslationY(g0.L(-9.0f));
            k5Var.setTranslationY(g0.L(12.0f));
            k5Var.l(charSequence, false);
            k5Var.setVisibility(0);
        }
        if (this.f59433c.getVisibility() == 8) {
            if (id.f23157a0) {
                d4Var.setTranslationX(g0.L(40.0f));
                k5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            d4Var.setTranslationX(g0.L(-40.0f));
            k5Var.setTranslationX(g0.L(-40.0f));
        }
    }
}
