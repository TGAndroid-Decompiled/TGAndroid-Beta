package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.u5;
public final class w extends FrameLayout {
    public final RadioButton f60705a;
    public final Drawable f60706b;
    public final Drawable f60707c;
    public final h6 d;
    public final h6 f60708e;
    public final TextView f60709f;
    public final SpannableString h;
    public final SpannableString f60710n;
    public TL_stars.TL_starsGiveawayOption f60711r;
    public int f60712s;
    public final u5 f60713w;

    public w(Context context, e6 e6Var) {
        super(context);
        this.f60713w = new u5(this, 0L, 500L, er.h);
        Drawable g10 = i5.c.g(context, 2131232754);
        this.f60706b = g10;
        q6.x(this, g10, j6.f28922h5, e6Var, PorterDuff.Mode.SRC_IN);
        this.f60707c = i5.c.g(context, 2131232753);
        setWillNotDraw(false);
        h6 h6Var = new h6(context, false, false, false);
        this.d = h6Var;
        q6.Y(h6Var, j6.G6, e6Var);
        h6Var.setTypeface(g0.o());
        h6Var.setTextSize(g0.L(16.0f));
        addView(h6Var, ja.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new e80(g0.L(90.0f), h6Var), 0, 1, 33);
        h6 h6Var2 = new h6(context, false, true, true);
        this.f60708e = h6Var2;
        int i7 = j6.f29260z6;
        q6.Y(h6Var2, i7, e6Var);
        h6Var2.setTextSize(g0.L(13.0f));
        addView(h6Var2, ja.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f60710n = spannableString2;
        spannableString2.setSpan(new e80(g0.L(70.0f), h6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f60709f = textView;
        q6.U(textView, i7, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f60705a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        q6.O(radioButton, j6.f28959j7, j6.E5, e6Var);
        addView(radioButton, ja.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f60711r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f60713w.e(false, this.f60712s);
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
            Drawable drawable = this.f60706b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f60707c;
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
