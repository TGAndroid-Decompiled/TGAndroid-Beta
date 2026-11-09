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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class w extends FrameLayout {
    public final RadioButton f59503a;
    public final Drawable f59504b;
    public final Drawable f59505c;
    public final j6 d;
    public final j6 f59506e;
    public final TextView f59507f;
    public final SpannableString h;
    public final SpannableString f59508n;
    public TL_stars.TL_starsGiveawayOption f59509r;
    public int f59510s;
    public final w5 f59511w;

    public w(Context context, g6 g6Var) {
        super(context);
        this.f59511w = new w5(this, 0L, 500L, xq.h);
        Drawable h = jg.g.h(context, 2131232753);
        this.f59504b = h;
        s6.x(this, h, l6.f27938h5, g6Var, PorterDuff.Mode.SRC_IN);
        this.f59505c = jg.g.h(context, 2131232752);
        setWillNotDraw(false);
        j6 j6Var = new j6(context, false, false, false);
        this.d = j6Var;
        s6.Y(j6Var, l6.G6, g6Var);
        j6Var.setTypeface(g0.o());
        j6Var.setTextSize(g0.L(16.0f));
        addView(j6Var, ha.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new c80(g0.L(90.0f), j6Var), 0, 1, 33);
        j6 j6Var2 = new j6(context, false, true, true);
        this.f59506e = j6Var2;
        int i7 = l6.f28275z6;
        s6.Y(j6Var2, i7, g6Var);
        j6Var2.setTextSize(g0.L(13.0f));
        addView(j6Var2, ha.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f59508n = spannableString2;
        spannableString2.setSpan(new c80(g0.L(70.0f), j6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f59507f = textView;
        s6.U(textView, i7, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f59503a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        s6.O(radioButton, l6.f27975j7, l6.E5, g6Var);
        addView(radioButton, ha.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f59509r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f59511w.e(false, this.f59510s);
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
            Drawable drawable = this.f59504b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f59505c;
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
