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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;
public abstract class c extends FrameLayout {
    public final i6 f61211a;
    public final b9 f61212b;
    public final q9 f61213c;
    public final u3 d;
    public final n5 f61214e;
    public final RadioButton f61215f;
    public final Paint h;
    public boolean f61216n;
    public final View f61217r;

    public c(Context context, i6 i6Var) {
        super(context);
        int i7;
        b9 b9Var = new b9((i6) null);
        this.f61212b = b9Var;
        this.h = new Paint(1);
        this.f61211a = i6Var;
        View view = new View(context);
        this.f61217r = view;
        addView(view, ma.o(-1, -1));
        u6.h(n6.f29467h5, view, i6Var);
        b9Var.f33603r = g0.L(40.0f);
        q9 q9Var = new q9(context);
        this.f61213c = q9Var;
        q9Var.setRoundRadius(g0.L(20.0f));
        addView(q9Var);
        u3 u3Var = new u3(context, 5);
        this.d = u3Var;
        ks.i(u3Var);
        ks.i(q9Var);
        u3Var.setTextSize(16);
        int i10 = n6.f29502j5;
        u6.X(u3Var, i10, i6Var);
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        u3Var.setGravity(i7);
        addView(u3Var);
        n5 n5Var = new n5(context);
        this.f61214e = n5Var;
        n5Var.setTextSize(14);
        u6.X(n5Var, i10, i6Var);
        n5Var.setGravity(gd.f24213a0 ? 5 : 3);
        addView(n5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f61215f = radioButton;
        radioButton.setSize(g0.L(20.0f));
        u6.O(radioButton, n6.f29504j7, n6.E5, i6Var);
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
        RadioButton radioButton = this.f61215f;
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
        if (gd.f24213a0) {
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
        this.f61213c.setLayoutParams(ma.d(40, 40.0f, i16, f10, 0.0f, f11, 0.0f));
        boolean z10 = gd.f24213a0;
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
        if (gd.f24213a0) {
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
        boolean z11 = gd.f24213a0;
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
        if (gd.f24213a0) {
            if (b()) {
                i18 = 105;
            }
            f15 = i18;
        } else {
            f15 = 20.0f;
        }
        this.f61214e.setLayoutParams(ma.d(-1, -2.0f, i19, f14, 0.0f, f15, 0.0f));
        boolean z12 = gd.f24213a0;
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
        this.f61215f.setLayoutParams(ma.d(22, 22.0f, i20, f16, 0.0f, f17, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f61216n) {
            int w02 = n6.w0(n6.f29395d7, this.f61211a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i7 = 105;
            } else {
                i7 = 70;
            }
            if (this.f61213c.getVisibility() == 8) {
                i7 -= 40;
            }
            int a10 = a() + i7;
            if (gd.f24213a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - g0.L(a10), getHeight(), paint);
            } else {
                canvas.drawRect(g0.L(a10), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        lq lqVar = new lq(2, drawable);
        drawable.setBounds(0, g0.L(1.0f), g0.L(11.0f), g0.L(12.0f));
        spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
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
        this.f61217r.setVisibility(i7);
    }

    public void setDivider(boolean z10) {
        this.f61216n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u3 u3Var = this.d;
        n5 n5Var = this.f61214e;
        if (isEmpty) {
            u3Var.setTranslationY(0.0f);
            n5Var.setVisibility(8);
        } else {
            u3Var.setTranslationY(g0.L(-9.0f));
            n5Var.setTranslationY(g0.L(12.0f));
            n5Var.l(charSequence, false);
            n5Var.setVisibility(0);
        }
        if (this.f61213c.getVisibility() == 8) {
            if (gd.f24213a0) {
                u3Var.setTranslationX(g0.L(40.0f));
                n5Var.setTranslationX(g0.L(40.0f));
                return;
            }
            u3Var.setTranslationX(g0.L(-40.0f));
            n5Var.setTranslationX(g0.L(-40.0f));
        }
    }

    public void setSubtitleColorKey(int i7) {
        u6.X(this.f61214e, i7, this.f61211a);
    }
}
