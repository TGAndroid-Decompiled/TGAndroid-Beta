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
import ci.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
public abstract class c extends FrameLayout {
    public final d6 f48973a;
    public final h9 f48974b;
    public final w9 f48975c;
    public final l4 d;
    public final j5 e;
    public final RadioButton f48976f;
    public final Paint h;
    public boolean f48977n;
    public final View f48978r;

    public c(Context context, d6 d6Var) {
        super(context);
        int i10;
        h9 h9Var = new h9((d6) null);
        this.f48974b = h9Var;
        this.h = new Paint(1);
        this.f48973a = d6Var;
        View view = new View(context);
        this.f48978r = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.f21057h5, d6Var));
        h9Var.f26824r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.f48975c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        l4 l4Var = new l4(context, 5);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        l4Var.setTextSize(16);
        int i11 = h6.f21092j5;
        l4Var.setTextColor(h6.w0(i11, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l4Var.setGravity(i10);
        addView(l4Var);
        j5 j5Var = new j5(context);
        this.e = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(h6.w0(i11, d6Var));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f48976f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.w0(h6.f21094j7, d6Var), h6.w0(h6.E5, d6Var));
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
        RadioButton radioButton = this.f48976f;
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
        this.f48975c.setLayoutParams(z5.a(40.0f, f17, 0.0f, f10, 0.0f, 40, i17));
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
        this.f48976f.setLayoutParams(z5.a(22.0f, f15, 0.0f, f16, 0.0f, 22, i21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f48977n) {
            int w02 = h6.w0(h6.f20987d7, this.f48973a);
            Paint paint = this.h;
            paint.setColor(w02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f48975c.getVisibility() == 8) {
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
        yq yqVar = new yq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
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
        this.f48977n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        l4 l4Var = this.d;
        j5 j5Var = this.e;
        if (isEmpty) {
            l4Var.setTranslationY(0.0f);
            j5Var.setVisibility(8);
        } else {
            l4Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            j5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            j5Var.l(charSequence, false);
            j5Var.setVisibility(0);
        }
        if (this.f48975c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                l4Var.setTranslationX(AndroidUtilities.dp(40.0f));
                j5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            l4Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            j5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
