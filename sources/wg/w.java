package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.s6;
import w7.a6;
public final class w extends FrameLayout {
    public final RadioButton f47615a;
    public final Drawable f47616b;
    public final Drawable f47617c;
    public final s6 d;
    public final s6 e;
    public final TextView f47618f;
    public final SpannableString h;
    public final SpannableString f47619n;
    public TL_stars.TL_starsGiveawayOption f47620r;
    public int f47621s;
    public final g6 v;

    public w(Context context, c6 c6Var) {
        super(context);
        this.v = new g6(this, 0L, 500L, es.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f47616b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var), PorterDuff.Mode.SRC_IN));
        this.f47617c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        s6 s6Var = new s6(context, false, false, false);
        this.d = s6Var;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(s6Var, a6.a(20.0f, 64.0f, 8.0f, 80.0f, 0.0f, -1, 51));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ia0(AndroidUtilities.dp(90.0f), s6Var), 0, 1, 33);
        s6 s6Var2 = new s6(context, false, true, true);
        this.e = s6Var2;
        int i10 = org.telegram.ui.ActionBar.g6.f20305z6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(s6Var2, a6.a(14.0f, 64.0f, 31.0f, 80.0f, 0.0f, -1, 51));
        SpannableString spannableString2 = new SpannableString("x");
        this.f47619n = spannableString2;
        spannableString2.setSpan(new ia0(AndroidUtilities.dp(70.0f), s6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f47618f = textView;
        yh.n(i10, c6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, a6.a(-2.0f, 0.0f, 0.0f, 19.0f, 0.0f, -2, 21));
        RadioButton radioButton = new RadioButton(context);
        this.f47615a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20009j7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        addView(radioButton, a6.a(20.0f, 22.0f, 0.0f, 0.0f, 0.0f, 20, 19));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f47620r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f47621s, false);
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float dp4 = AndroidUtilities.dp(64.0f);
        float dp5 = AndroidUtilities.dp(8.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f7 = (((ceil - 1) - (1.0f - clamp)) * dp3 * 1.0f) + dp4;
            int i10 = (int) f7;
            int i11 = (int) dp5;
            int i12 = (int) (f7 + dp);
            int i13 = (int) (dp5 + dp2);
            Drawable drawable = this.f47616b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f47617c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((dp3 * d) + AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
