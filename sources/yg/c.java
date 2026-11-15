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
import c8.ja;
import fi.w3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public abstract class c extends FrameLayout {
    public final e6 f60643a;
    public final t8 f60644b;
    public final i9 f60645c;
    public final w3 d;
    public final j5 f60646e;
    public final RadioButton f60647f;
    public final Paint h;
    public boolean f60648n;
    public final View f60649r;

    public c(Context context, e6 e6Var) {
        super(context);
        int i7;
        t8 t8Var = new t8((e6) null);
        this.f60644b = t8Var;
        this.h = new Paint(1);
        this.f60643a = e6Var;
        View view = new View(context);
        this.f60649r = view;
        addView(view, ja.o(-1, -1));
        q6.h(j6.f28922h5, view, e6Var);
        t8Var.f39600r = g0.L(40.0f);
        i9 i9Var = new i9(context);
        this.f60645c = i9Var;
        i9Var.setRoundRadius(g0.L(20.0f));
        addView(i9Var);
        w3 w3Var = new w3(context, 5);
        this.d = w3Var;
        ns.i(w3Var);
        ns.i(i9Var);
        w3Var.setTextSize(16);
        int i10 = j6.f28957j5;
        q6.X(w3Var, i10, e6Var);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        w3Var.setGravity(i7);
        addView(w3Var);
        j5 j5Var = new j5(context);
        this.f60646e = j5Var;
        j5Var.setTextSize(14);
        q6.X(j5Var, i10, e6Var);
        j5Var.setGravity(hd.f24104a0 ? 5 : 3);
        addView(j5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f60647f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        q6.O(radioButton, j6.f28959j7, j6.E5, e6Var);
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
        RadioButton radioButton = this.f60647f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
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
        if (hd.f24104a0) {
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
        this.f60645c.setLayoutParams(ja.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z10 = hd.f24104a0;
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
        if (hd.f24104a0) {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(ja.d(-1, -2.0f, i17, f12, 0.0f, f13, 0.0f));
        boolean z11 = hd.f24104a0;
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
        if (hd.f24104a0) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f60646e.setLayoutParams(ja.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z12 = hd.f24104a0;
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
        this.f60647f.setLayoutParams(ja.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f60648n) {
            int w02 = j6.w0(j6.f28850d7, this.f60643a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i7 = 105;
            } else {
                i7 = 70;
            }
            if (this.f60645c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (hd.f24104a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
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

    public void setDivider(boolean z10) {
        this.f60648n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w3 w3Var = this.d;
        j5 j5Var = this.f60646e;
        if (isEmpty) {
            w3Var.setTranslationY(0.0f);
            j5Var.setVisibility(8);
        } else {
            w3Var.setTranslationY(g0.L(-9.0f));
            j5Var.setTranslationY(g0.L(12.0f));
            j5Var.l(charSequence, false);
            j5Var.setVisibility(0);
        }
        if (this.f60645c.getVisibility() == 8) {
            if (hd.f24104a0) {
                w3Var.setTranslationX(g0.L(40.0f));
                j5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            w3Var.setTranslationX(g0.L(-40.0f));
            j5Var.setTranslationX(g0.L(-40.0f));
        }
    }
}
