package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import ci.k4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
import w7.z5;
public abstract class c extends FrameLayout {
    public final g6 f49399a;
    public final h9 f49400b;
    public final w9 f49401c;
    public final k4 d;
    public final n5 e;
    public final RadioButton f49402f;
    public final Paint h;
    public boolean f49403n;
    public final View f49404r;

    public c(Context context, g6 g6Var) {
        super(context);
        int i10;
        h9 h9Var = new h9((g6) null);
        this.f49400b = h9Var;
        this.h = new Paint(1);
        this.f49399a = g6Var;
        View view = new View(context);
        this.f49404r = view;
        addView(view, z5.n(-1, -1));
        r6.i(k6.f21254h5, view, g6Var);
        h9Var.f26851r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.f49401c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        k4 k4Var = new k4(context, 5);
        this.d = k4Var;
        NotificationCenter.listenEmojiLoading(k4Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        k4Var.setTextSize(16);
        int i11 = k6.f21289j5;
        r6.Z(k4Var, i11, g6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k4Var.setGravity(i10);
        addView(k4Var);
        n5 n5Var = new n5(context);
        this.e = n5Var;
        n5Var.setTextSize(14);
        r6.Z(n5Var, i11, g6Var);
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(n5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f49402f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        r6.Q(radioButton, k6.f21291j7, k6.E5, g6Var);
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
        RadioButton radioButton = this.f49402f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        int i16 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 16;
        if (b()) {
            f7 = 53.0f;
        } else {
            f7 = 16.0f;
        }
        if (b()) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f49401c.setLayoutParams(z5.d(40, 40.0f, i17, f7, 0.0f, f10, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 16;
        int i19 = 70;
        if (z10) {
            f11 = 20.0f;
        } else {
            if (b()) {
                i12 = 105;
            } else {
                i12 = 70;
            }
            f11 = i12;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i15 = 105;
            } else {
                i15 = 70;
            }
            f12 = i15;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(z5.d(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 16;
        if (z11) {
            f13 = 20.0f;
        } else {
            if (b()) {
                i14 = 105;
            } else {
                i14 = 70;
            }
            f13 = i14;
        }
        if (LocaleController.isRTL) {
            if (b()) {
                i19 = 105;
            }
            f14 = i19;
        } else {
            f14 = 20.0f;
        }
        this.e.setLayoutParams(z5.d(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i16 = 5;
        }
        int i21 = i16 | 16;
        if (z12) {
            f15 = 15.0f;
        } else {
            f15 = 20.0f;
        }
        if (z12) {
            f16 = 20.0f;
        } else {
            f16 = 15.0f;
        }
        this.f49402f.setLayoutParams(z5.d(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f49403n) {
            int w02 = k6.w0(k6.f21184d7, this.f49399a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f49401c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(a2), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        xq xqVar = new xq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), 1073741824));
    }

    public void setDivider(boolean z10) {
        this.f49403n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        k4 k4Var = this.d;
        n5 n5Var = this.e;
        if (isEmpty) {
            k4Var.setTranslationY(0.0f);
            n5Var.setVisibility(8);
        } else {
            k4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            n5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            n5Var.l(charSequence, false);
            n5Var.setVisibility(0);
        }
        if (this.f49401c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                k4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                n5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            k4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            n5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
