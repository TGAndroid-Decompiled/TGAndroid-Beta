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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class w extends FrameLayout {
    public final RadioButton f59501a;
    public final Drawable f59502b;
    public final Drawable f59503c;
    public final i6 d;
    public final i6 f59504e;
    public final TextView f59505f;
    public final SpannableString h;
    public final SpannableString f59506n;
    public TL_stars.TL_starsGiveawayOption f59507r;
    public int f59508s;
    public final v5 f59509w;

    public w(Context context, h6 h6Var) {
        super(context);
        this.f59509w = new v5(this, 0L, 500L, wq.h);
        Drawable h = jg.g.h(context, 2131232753);
        this.f59502b = h;
        t6.x(this, h, m6.f27963h5, h6Var, PorterDuff.Mode.SRC_IN);
        this.f59503c = jg.g.h(context, 2131232752);
        setWillNotDraw(false);
        i6 i6Var = new i6(context, false, false, false);
        this.d = i6Var;
        t6.Y(i6Var, m6.G6, h6Var);
        i6Var.setTypeface(g0.o());
        i6Var.setTextSize(g0.L(16.0f));
        addView(i6Var, ha.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new b80(g0.L(90.0f), i6Var), 0, 1, 33);
        i6 i6Var2 = new i6(context, false, true, true);
        this.f59504e = i6Var2;
        int i7 = m6.f28300z6;
        t6.Y(i6Var2, i7, h6Var);
        i6Var2.setTextSize(g0.L(13.0f));
        addView(i6Var2, ha.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f59506n = spannableString2;
        spannableString2.setSpan(new b80(g0.L(70.0f), i6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f59505f = textView;
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f59501a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        t6.O(radioButton, m6.f28000j7, m6.E5, h6Var);
        addView(radioButton, ha.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f59507r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f59509w.e(false, this.f59508s);
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
            Drawable drawable = this.f59502b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f59503c;
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
