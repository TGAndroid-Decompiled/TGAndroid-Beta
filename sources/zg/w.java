package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
public final class w extends FrameLayout {
    public final RadioButton f60534a;
    public final Drawable f60535b;
    public final Drawable f60536c;
    public final h6 d;
    public final h6 f60537e;
    public final TextView f60538f;
    public final SpannableString h;
    public final SpannableString f60539n;
    public TL_stars.TL_starsGiveawayOption f60540r;
    public int f60541s;
    public final u5 f60542w;

    public w(Context context, e6 e6Var) {
        super(context);
        this.f60542w = new u5(this, 0L, 500L, xq.h);
        Drawable g7 = p1.g(context, 2131232751);
        this.f60535b = g7;
        r6.y(this, g7, k6.f27954h5, e6Var, PorterDuff.Mode.SRC_IN);
        this.f60536c = p1.g(context, 2131232750);
        setWillNotDraw(false);
        h6 h6Var = new h6(context, false, false, false);
        this.d = h6Var;
        r6.Z(h6Var, k6.G6, e6Var);
        h6Var.setTypeface(g0.o());
        h6Var.setTextSize(g0.L(16.0f));
        addView(h6Var, mf.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new x70(g0.L(90.0f), h6Var), 0, 1, 33);
        h6 h6Var2 = new h6(context, false, true, true);
        this.f60537e = h6Var2;
        int i3 = k6.f28290z6;
        r6.Z(h6Var2, i3, e6Var);
        h6Var2.setTextSize(g0.L(13.0f));
        addView(h6Var2, mf.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f60539n = spannableString2;
        spannableString2.setSpan(new x70(g0.L(70.0f), h6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f60538f = textView;
        r6.V(textView, i3, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f60534a = radioButton;
        radioButton.setSize(g0.L(20.0f));
        r6.P(radioButton, k6.f27990j7, k6.E5, e6Var);
        addView(radioButton, mf.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f60540r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.f60542w.e(false, this.f60541s);
        float L = g0.L(24.0f);
        float L2 = g0.L(24.0f);
        float L3 = g0.L(2.5f);
        float L4 = g0.L(64.0f);
        float L5 = g0.L(8.0f);
        for (int ceil = ((int) Math.ceil(e10)) - 1; ceil >= 0; ceil--) {
            float i3 = Utilities.i(e10 - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - i3)) * L3 * 1.0f) + L4;
            int i10 = (int) f10;
            int i11 = (int) L5;
            int i12 = (int) (f10 + L);
            int i13 = (int) (L5 + L2);
            Drawable drawable = this.f60535b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i3 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f60536c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((L3 * e10) + g0.L(22.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), 1073741824));
    }
}
