package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.q6;
import w7.z5;
public final class w extends FrameLayout {
    public final RadioButton f49453a;
    public final Drawable f49454b;
    public final Drawable f49455c;
    public final q6 d;
    public final q6 e;
    public final TextView f49456f;
    public final SpannableString h;
    public final SpannableString f49457n;
    public TL_stars.TL_starsGiveawayOption f49458r;
    public int f49459s;
    public final f6 v;

    public w(Context context, g6 g6Var) {
        super(context);
        this.v = new f6(this, 0L, 500L, bs.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f49454b = mutate;
        r6.z(this, mutate, k6.f21254h5, g6Var, PorterDuff.Mode.SRC_IN);
        this.f49455c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        q6 q6Var = new q6(context, false, false, false);
        this.d = q6Var;
        r6.a0(q6Var, k6.G6, g6Var);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(q6Var, z5.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new da0(AndroidUtilities.dp(90.0f), q6Var), 0, 1, 33);
        q6 q6Var2 = new q6(context, false, true, true);
        this.e = q6Var2;
        int i10 = k6.f21588z6;
        r6.a0(q6Var2, i10, g6Var);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(q6Var2, z5.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f49457n = spannableString2;
        spannableString2.setSpan(new da0(AndroidUtilities.dp(70.0f), q6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f49456f = textView;
        r6.W(textView, i10, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f49453a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        r6.Q(radioButton, k6.f21291j7, k6.E5, g6Var);
        addView(radioButton, z5.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f49458r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f49459s, false);
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
            Drawable drawable = this.f49454b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f49455c;
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
