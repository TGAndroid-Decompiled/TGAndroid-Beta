package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
public abstract class c extends FrameLayout {
    public final u6 f51761a;
    public final j9 f51762b;
    public final y9 f51763c;
    public final l4 d;
    public final b6 e;
    public final RadioButton f51764f;
    public final Paint h;
    public boolean f51765n;
    public final View f51766r;

    public c(Context context, u6 u6Var) {
        super(context);
        int i10;
        j9 j9Var = new j9((u6) null);
        this.f51762b = j9Var;
        this.h = new Paint(1);
        this.f51761a = u6Var;
        View view = new View(context);
        this.f51766r = view;
        addView(view, gb1.r(-1, -1));
        f7.i(y6.f23427h5, view, u6Var);
        j9Var.f29544r = AndroidUtilities.dp(40.0f);
        y9 y9Var = new y9(context);
        this.f51763c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var);
        l4 l4Var = new l4(context, 5);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        NotificationCenter.listenEmojiLoading(y9Var);
        l4Var.setTextSize(16);
        int i11 = y6.f23464j5;
        f7.Y(l4Var, i11, u6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l4Var.setGravity(i10);
        addView(l4Var);
        b6 b6Var = new b6(context);
        this.e = b6Var;
        b6Var.setTextSize(14);
        f7.Y(b6Var, i11, u6Var);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(b6Var);
        RadioButton radioButton = new RadioButton(context);
        this.f51764f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        f7.P(radioButton, y6.f23466j7, y6.E5, u6Var);
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
        RadioButton radioButton = this.f51764f;
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
        this.f51763c.setLayoutParams(gb1.h(40, 40.0f, i17, f7, 0.0f, f10, 0.0f));
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
        this.d.setLayoutParams(gb1.h(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
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
        this.e.setLayoutParams(gb1.h(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
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
        this.f51764f.setLayoutParams(gb1.h(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f51765n) {
            int w02 = y6.w0(y6.f23357d7, this.f51761a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f51763c.getVisibility() == 8) {
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
        zq zqVar = new zq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
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
        this.f51765n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        l4 l4Var = this.d;
        b6 b6Var = this.e;
        if (isEmpty) {
            l4Var.setTranslationY(0.0f);
            b6Var.setVisibility(8);
        } else {
            l4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            b6Var.setTranslationY(AndroidUtilities.dp(12.0f));
            b6Var.l(charSequence, false);
            b6Var.setVisibility(0);
        }
        if (this.f51763c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                l4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                b6Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            l4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            b6Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
