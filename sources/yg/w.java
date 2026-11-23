package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.r80;
public final class w extends FrameLayout {
    public final RadioButton f61283a;
    public final Drawable f61284b;
    public final Drawable f61285c;
    public final o6 d;
    public final o6 f61286e;
    public final TextView f61287f;
    public final SpannableString h;
    public final SpannableString f61288n;
    public TL_stars.TL_starsGiveawayOption f61289r;
    public int f61290s;
    public final d6 f61291w;

    public w(Context context, h6 h6Var) {
        super(context);
        this.f61291w = new d6(this, 0L, 500L, nr.h);
        Drawable g10 = i5.c.g(context, 2131232755);
        this.f61284b = g10;
        t6.x(this, g10, m6.f29420h5, h6Var, PorterDuff.Mode.SRC_IN);
        this.f61285c = i5.c.g(context, 2131232754);
        setWillNotDraw(false);
        o6 o6Var = new o6(context, false, false, false);
        this.d = o6Var;
        t6.Y(o6Var, m6.G6, h6Var);
        o6Var.setTypeface(g0.o());
        o6Var.setTextSize(g0.L(16.0f));
        addView(o6Var, na.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new r80(g0.L(90.0f), o6Var), 0, 1, 33);
        o6 o6Var2 = new o6(context, false, true, true);
        this.f61286e = o6Var2;
        int i7 = m6.f29758z6;
        t6.Y(o6Var2, i7, h6Var);
        o6Var2.setTextSize(g0.L(13.0f));
        addView(o6Var2, na.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f61288n = spannableString2;
        spannableString2.setSpan(new r80(g0.L(70.0f), o6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f61287f = textView;
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, na.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f61283a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        t6.O(radioButton, m6.f29457j7, m6.E5, h6Var);
        addView(radioButton, na.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f61289r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f61291w.e(false, this.f61290s);
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
            Drawable drawable = this.f61284b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f61285c;
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
