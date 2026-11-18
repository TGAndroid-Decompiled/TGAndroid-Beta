package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p80;
public final class w extends FrameLayout {
    public final RadioButton f61272a;
    public final Drawable f61273b;
    public final Drawable f61274c;
    public final n6 d;
    public final n6 f61275e;
    public final TextView f61276f;
    public final SpannableString h;
    public final SpannableString f61277n;
    public TL_stars.TL_starsGiveawayOption f61278r;
    public int f61279s;
    public final c6 f61280w;

    public w(Context context, i6 i6Var) {
        super(context);
        this.f61280w = new c6(this, 0L, 500L, lr.h);
        Drawable g10 = i5.c.g(context, 2131232755);
        this.f61273b = g10;
        u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29469h5, i6Var, PorterDuff.Mode.SRC_IN);
        this.f61274c = i5.c.g(context, 2131232754);
        setWillNotDraw(false);
        n6 n6Var = new n6(context, false, false, false);
        this.d = n6Var;
        u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n6Var.setTypeface(g0.o());
        n6Var.setTextSize(g0.L(16.0f));
        addView(n6Var, ma.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new p80(g0.L(90.0f), n6Var), 0, 1, 33);
        n6 n6Var2 = new n6(context, false, true, true);
        this.f61275e = n6Var2;
        int i7 = org.telegram.ui.ActionBar.n6.f29807z6;
        u6.Y(n6Var2, i7, i6Var);
        n6Var2.setTextSize(g0.L(13.0f));
        addView(n6Var2, ma.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f61277n = spannableString2;
        spannableString2.setSpan(new p80(g0.L(70.0f), n6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f61276f = textView;
        u6.U(textView, i7, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f61272a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        u6.O(radioButton, org.telegram.ui.ActionBar.n6.f29506j7, org.telegram.ui.ActionBar.n6.E5, i6Var);
        addView(radioButton, ma.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f61278r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f61280w.e(false, this.f61279s);
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
            Drawable drawable = this.f61273b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f61274c;
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
