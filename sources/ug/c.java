package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import w7.a6;
public abstract class c extends FrameLayout {
    public final f6 f42675a;
    public final g9 f42676b;
    public final w9 f42677c;
    public final f4 d;
    public final l5 e;
    public final RadioButton f42678f;
    public final Paint h;
    public boolean f42679n;

    public c(Context context, f6 f6Var) {
        super(context);
        int i10;
        g9 g9Var = new g9((f6) null);
        this.f42676b = g9Var;
        this.h = new Paint(1);
        this.f42675a = f6Var;
        View view = new View(context);
        addView(view, a6.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
        g9Var.f23288r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.f42677c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        f4 f4Var = new f4(context, 4);
        this.d = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        f4Var.setTextSize(16);
        int i11 = j6.f18034j5;
        f4Var.setTextColor(j6.v0(i11, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        f4Var.setGravity(i10);
        addView(f4Var);
        l5 l5Var = new l5(context);
        this.e = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTextColor(j6.v0(i11, f6Var));
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f42678f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.v0(j6.f18036j7, f6Var), j6.v0(j6.E5, f6Var));
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
        RadioButton radioButton = this.f42678f;
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
        this.f42677c.setLayoutParams(a6.d(40, 40.0f, i17, f7, 0.0f, f10, 0.0f));
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
        this.d.setLayoutParams(a6.d(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
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
        this.e.setLayoutParams(a6.d(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
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
        this.f42678f.setLayoutParams(a6.d(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f42679n) {
            int v02 = j6.v0(j6.f17929d7, this.f42675a);
            Paint paint = this.h;
            paint.setColor(v02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f42677c.getVisibility() == 8) {
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
        uq uqVar = new uq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
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
        this.f42679n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        f4 f4Var = this.d;
        l5 l5Var = this.e;
        if (isEmpty) {
            f4Var.setTranslationY(0.0f);
            l5Var.setVisibility(8);
        } else {
            f4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            l5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            l5Var.l(charSequence, false);
            l5Var.setVisibility(0);
        }
        if (this.f42677c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                f4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                l5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            f4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            l5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
