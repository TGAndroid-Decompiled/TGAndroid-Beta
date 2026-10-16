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
import bi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.z5;
public abstract class c extends FrameLayout {
    public final c6 f47564a;
    public final k9 f47565b;
    public final z9 f47566c;
    public final l5 d;
    public final h5 e;
    public final RadioButton f47567f;
    public final Paint h;
    public boolean f47568n;
    public final View f47569r;

    public c(Context context, c6 c6Var) {
        super(context);
        int i10;
        k9 k9Var = new k9((c6) null);
        this.f47565b = k9Var;
        this.h = new Paint(1);
        this.f47564a = c6Var;
        View view = new View(context);
        this.f47569r = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
        k9Var.f26294r = AndroidUtilities.dp(40.0f);
        z9 z9Var = new z9(context);
        this.f47566c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(z9Var);
        l5 l5Var = new l5(context, 5);
        this.d = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        NotificationCenter.listenEmojiLoading(z9Var);
        l5Var.setTextSize(16);
        int i11 = g6.f19707j5;
        l5Var.setTextColor(g6.w0(i11, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        addView(l5Var);
        h5 h5Var = new h5(context);
        this.e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(g6.w0(i11, c6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f47567f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.w0(g6.f19709j7, c6Var), g6.w0(g6.E5, c6Var));
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
        RadioButton radioButton = this.f47567f;
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
        float f17 = 53.0f;
        if (b()) {
            f7 = 53.0f;
        } else {
            f7 = 53.0f;
            f17 = 16.0f;
        }
        if (b()) {
            f10 = f7;
        } else {
            f10 = 16.0f;
        }
        this.f47566c.setLayoutParams(z5.a(40.0f, f17, 0.0f, f10, 0.0f, 40, i17));
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
        this.d.setLayoutParams(z5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, i18));
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
        this.e.setLayoutParams(z5.a(-2.0f, f13, 0.0f, f14, 0.0f, -1, i20));
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
        this.f47567f.setLayoutParams(z5.a(22.0f, f15, 0.0f, f16, 0.0f, 22, i21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f47568n) {
            int w02 = g6.w0(g6.f19602d7, this.f47564a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f47566c.getVisibility() == 8) {
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
        br brVar = new br(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
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
        this.f47568n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        l5 l5Var = this.d;
        h5 h5Var = this.e;
        if (isEmpty) {
            l5Var.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            l5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.f47566c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                l5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            l5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            h5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
