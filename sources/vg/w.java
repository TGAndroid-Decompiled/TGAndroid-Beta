package vg;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qr;
import w7.y5;
public final class w extends FrameLayout {
    public final RadioButton f44611a;
    public final Drawable f44612b;
    public final Drawable f44613c;
    public final p6 d;
    public final p6 e;
    public final TextView f44614f;
    public final SpannableString h;
    public final SpannableString f44615n;
    public TL_stars.TL_starsGiveawayOption f44616r;
    public int f44617s;
    public final e6 v;

    public w(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = new e6(this, 0L, 500L, qr.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f44612b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19133h5, e6Var), PorterDuff.Mode.SRC_IN));
        this.f44613c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        p6 p6Var = new p6(context, false, false, false);
        this.d = p6Var;
        p6Var.setTextColor(j6.v0(j6.G6, e6Var));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(p6Var, y5.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new q90(AndroidUtilities.dp(90.0f), p6Var), 0, 1, 33);
        p6 p6Var2 = new p6(context, false, true, true);
        this.e = p6Var2;
        int i10 = j6.f19464z6;
        p6Var2.setTextColor(j6.v0(i10, e6Var));
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(p6Var2, y5.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f44615n = spannableString2;
        spannableString2.setSpan(new q90(AndroidUtilities.dp(70.0f), p6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f44614f = textView;
        wh.m(i10, e6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, y5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f44611a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.v0(j6.f19171j7, e6Var), j6.v0(j6.E5, e6Var));
        addView(radioButton, y5.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f44616r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f44617s, false);
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
            Drawable drawable = this.f44612b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f44613c;
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
