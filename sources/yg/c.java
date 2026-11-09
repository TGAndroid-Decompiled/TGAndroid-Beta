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
import di.e4;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public abstract class c extends FrameLayout {
    public final g6 f59441a;
    public final w8 f59442b;
    public final l9 f59443c;
    public final e4 d;
    public final l5 f59444e;
    public final RadioButton f59445f;
    public final Paint h;
    public boolean f59446n;
    public final View f59447r;

    public c(Context context, g6 g6Var) {
        super(context);
        int i7;
        w8 w8Var = new w8((g6) null);
        this.f59442b = w8Var;
        this.h = new Paint(1);
        this.f59441a = g6Var;
        View view = new View(context);
        this.f59447r = view;
        addView(view, ha.o(-1, -1));
        s6.h(l6.f27938h5, view, g6Var);
        w8Var.f39984r = g0.L(40.0f);
        l9 l9Var = new l9(context);
        this.f59443c = l9Var;
        l9Var.setRoundRadius(g0.L(20.0f));
        addView(l9Var);
        e4 e4Var = new e4(context, 5);
        this.d = e4Var;
        qs.i(e4Var);
        qs.i(l9Var);
        e4Var.setTextSize(16);
        int i10 = l6.f27973j5;
        s6.X(e4Var, i10, g6Var);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        e4Var.setGravity(i7);
        addView(e4Var);
        l5 l5Var = new l5(context);
        this.f59444e = l5Var;
        l5Var.setTextSize(14);
        s6.X(l5Var, i10, g6Var);
        l5Var.setGravity(id.f23157a0 ? 5 : 3);
        addView(l5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f59445f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        s6.O(radioButton, l6.f27975j7, l6.E5, g6Var);
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
        RadioButton radioButton = this.f59445f;
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
        this.f59443c.setLayoutParams(ha.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
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
        this.f59444e.setLayoutParams(ha.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
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
        this.f59445f.setLayoutParams(ha.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f59446n) {
            int w02 = l6.w0(l6.f27866d7, this.f59441a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i7 = 105;
            } else {
                i7 = 70;
            }
            if (this.f59443c.getVisibility() == 8) {
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
        this.f59446n = z9;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        e4 e4Var = this.d;
        l5 l5Var = this.f59444e;
        if (isEmpty) {
            e4Var.setTranslationY(0.0f);
            l5Var.setVisibility(8);
        } else {
            e4Var.setTranslationY(g0.L(-9.0f));
            l5Var.setTranslationY(g0.L(12.0f));
            l5Var.l(charSequence, false);
            l5Var.setVisibility(0);
        }
        if (this.f59443c.getVisibility() == 8) {
            if (id.f23157a0) {
                e4Var.setTranslationX(g0.L(40.0f));
                l5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            e4Var.setTranslationX(g0.L(-40.0f));
            l5Var.setTranslationX(g0.L(-40.0f));
        }
    }
}
