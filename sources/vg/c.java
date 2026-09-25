package vg;

import ai.z5;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import w7.y5;
public abstract class c extends FrameLayout {
    public final d6 f44589a;
    public final h9 f44590b;
    public final w9 f44591c;
    public final z5 d;
    public final h5 e;
    public final RadioButton f44592f;
    public final Paint h;
    public boolean f44593n;

    public c(Context context, d6 d6Var) {
        super(context);
        int i10;
        h9 h9Var = new h9((d6) null);
        this.f44590b = h9Var;
        this.h = new Paint(1);
        this.f44589a = d6Var;
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(h6.v0(h6.f19130h5, d6Var));
        h9Var.f24686r = AndroidUtilities.dp(40.0f);
        w9 w9Var = new w9(context);
        this.f44591c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        z5 z5Var = new z5(context, 5);
        this.d = z5Var;
        NotificationCenter.listenEmojiLoading(z5Var);
        NotificationCenter.listenEmojiLoading(w9Var);
        z5Var.setTextSize(16);
        int i11 = h6.f19166j5;
        z5Var.setTextColor(h6.v0(i11, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z5Var.setGravity(i10);
        addView(z5Var);
        h5 h5Var = new h5(context);
        this.e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(h6.v0(i11, d6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f44592f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.v0(h6.f19168j7, d6Var), h6.v0(h6.E5, d6Var));
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
        RadioButton radioButton = this.f44592f;
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
        this.f44591c.setLayoutParams(y5.d(40, 40.0f, i17, f7, 0.0f, f10, 0.0f));
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
        this.d.setLayoutParams(y5.d(-1, -2.0f, i18, f11, 0.0f, f12, 0.0f));
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
        this.e.setLayoutParams(y5.d(-1, -2.0f, i20, f13, 0.0f, f14, 0.0f));
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
        this.f44592f.setLayoutParams(y5.d(22, 22.0f, i21, f15, 0.0f, f16, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f44593n) {
            int v02 = h6.v0(h6.f19061d7, this.f44589a);
            Paint paint = this.h;
            paint.setColor(v02);
            if (b()) {
                i10 = 105;
            } else {
                i10 = 70;
            }
            if (this.f44591c.getVisibility() == 8) {
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
        pq pqVar = new pq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
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
        this.f44593n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        z5 z5Var = this.d;
        h5 h5Var = this.e;
        if (isEmpty) {
            z5Var.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            z5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.f44591c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                z5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(40.0f));
                return;
            }
            z5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            h5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
        }
    }
}
