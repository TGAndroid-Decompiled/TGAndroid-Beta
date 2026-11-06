package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class w extends FrameLayout {
    public final RadioButton f59371a;
    public final Drawable f59372b;
    public final Drawable f59373c;
    public final j6 d;
    public final j6 f59374e;
    public final TextView f59375f;
    public final SpannableString h;
    public final SpannableString f59376n;
    public TL_stars.TL_starsGiveawayOption f59377r;
    public int f59378s;
    public final w5 f59379w;

    public w(Context context, f6 f6Var) {
        super(context);
        this.f59379w = new w5(this, 0L, 500L, xq.h);
        Drawable h = jg.g.h(context, 2131232753);
        this.f59372b = h;
        r6.y(this, h, k6.f27921h5, f6Var, PorterDuff.Mode.SRC_IN);
        this.f59373c = jg.g.h(context, 2131232752);
        setWillNotDraw(false);
        j6 j6Var = new j6(context, false, false, false);
        this.d = j6Var;
        r6.Z(j6Var, k6.G6, f6Var);
        j6Var.setTypeface(g0.o());
        j6Var.setTextSize(g0.L(16.0f));
        addView(j6Var, ha.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new b80(g0.L(90.0f), j6Var), 0, 1, 33);
        j6 j6Var2 = new j6(context, false, true, true);
        this.f59374e = j6Var2;
        int i7 = k6.f28258z6;
        r6.Z(j6Var2, i7, f6Var);
        j6Var2.setTextSize(g0.L(13.0f));
        addView(j6Var2, ha.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f59376n = spannableString2;
        spannableString2.setSpan(new b80(g0.L(70.0f), j6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f59375f = textView;
        r6.V(textView, i7, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f59371a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.f27958j7, k6.E5, f6Var);
        addView(radioButton, ha.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f59377r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f59379w.e(false, this.f59378s);
        float L = g0.L(24.0f);
        float L2 = g0.L(24.0f);
        float L3 = g0.L(2.5f);
        float L4 = g0.L(64.0f);
        float L5 = g0.L(8.0f);
        for (int ceil = ((int) Math.ceil(e10)) - 1; ceil >= 0; ceil--) {
            float i7 = Utilities.i(e10 - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - i7)) * L3 * 1.0f) + L4;
            int i10 = (int) f10;
            int i11 = (int) L5;
            int i12 = (int) (f10 + L);
            int i13 = (int) (L5 + L2);
            Drawable drawable = this.f59372b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f59373c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((L3 * e10) + g0.L(22.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), 1073741824));
    }
}
