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
import c8.ma;
import fi.u3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;
public abstract class c extends FrameLayout {
    public final h6 f61252a;
    public final b9 f61253b;
    public final q9 f61254c;
    public final u3 d;
    public final m5 f61255e;
    public final RadioButton f61256f;
    public final Paint h;
    public boolean f61257n;
    public final View f61258r;

    public c(Context context, h6 h6Var) {
        super(context);
        int i7;
        b9 b9Var = new b9((h6) null);
        this.f61253b = b9Var;
        this.h = new Paint(1);
        this.f61252a = h6Var;
        View view = new View(context);
        this.f61258r = view;
        addView(view, ma.o(-1, -1));
        t6.h(m6.f29451h5, view, h6Var);
        b9Var.f33811r = g0.L(40.0f);
        q9 q9Var = new q9(context);
        this.f61254c = q9Var;
        q9Var.setRoundRadius(g0.L(20.0f));
        addView(q9Var);
        u3 u3Var = new u3(context, 5);
        this.d = u3Var;
        ks.i(u3Var);
        ks.i(q9Var);
        u3Var.setTextSize(16);
        int i10 = m6.f29486j5;
        t6.X(u3Var, i10, h6Var);
        if (gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        u3Var.setGravity(i7);
        addView(u3Var);
        m5 m5Var = new m5(context);
        this.f61255e = m5Var;
        m5Var.setTextSize(14);
        t6.X(m5Var, i10, h6Var);
        m5Var.setGravity(gd.f24241a0 ? 5 : 3);
        addView(m5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f61256f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        t6.O(radioButton, m6.f29488j7, m6.E5, h6Var);
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
        RadioButton radioButton = this.f61256f;
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
        if (gd.f24241a0) {
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
        this.f61254c.setLayoutParams(ma.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z10 = gd.f24241a0;
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
        if (gd.f24241a0) {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(ma.d(-1, -2.0f, i17, f12, 0.0f, f13, 0.0f));
        boolean z11 = gd.f24241a0;
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
        if (gd.f24241a0) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f61255e.setLayoutParams(ma.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z12 = gd.f24241a0;
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
        this.f61256f.setLayoutParams(ma.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f61257n) {
            int w02 = m6.w0(m6.f29379d7, this.f61252a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i7 = 105;
            } else {
                i7 = 70;
            }
            if (this.f61254c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (gd.f24241a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        nq nqVar = new nq(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
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

    public void setCellBackgroundVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f61258r.setVisibility(i7);
    }

    public void setDivider(boolean z10) {
        this.f61257n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u3 u3Var = this.d;
        m5 m5Var = this.f61255e;
        if (isEmpty) {
            u3Var.setTranslationY(0.0f);
            m5Var.setVisibility(8);
        } else {
            u3Var.setTranslationY(g0.L(-9.0f));
            m5Var.setTranslationY(g0.L(12.0f));
            m5Var.l(charSequence, false);
            m5Var.setVisibility(0);
        }
        if (this.f61254c.getVisibility() == 8) {
            if (gd.f24241a0) {
                u3Var.setTranslationX(g0.L(40.0f));
                m5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            u3Var.setTranslationX(g0.L(-40.0f));
            m5Var.setTranslationX(g0.L(-40.0f));
        }
    }

    public void setSubtitleColorKey(int i7) {
        t6.X(this.f61255e, i7, this.f61252a);
    }
}
