package ph;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.y80;
public final class l extends FrameLayout {
    public static final int f45872n = 0;
    public final c6 f45873a;
    public final t9 f45874b;
    public final ImageView f45875c;
    public final TextView d;
    public final TextView f45876e;
    public final TextView f45877f;
    public final y80 h;

    public l(Activity activity, c6 c6Var) {
        super(activity);
        this.f45873a = c6Var;
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 0);
        f9.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        h6.b(f9, 0.025f, 1.4f);
        addView(f9, f6.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Y(g6.l1(0.1f, g6.v0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f9.addView(linearLayout, f6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, f6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, f6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f45877f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.v0(i10, c6Var));
        h6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.b0(AndroidUtilities.dp(9.0f), g6.l1(0.1f, g6.v0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, f6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f45876e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.v0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, f6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        y80 y80Var = new y80(activity, null);
        this.h = y80Var;
        y80Var.setTextSize(1, 13.0f);
        y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        y80Var.setTextColor(g6.v0(i11, c6Var));
        linearLayout.addView(y80Var, f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(y80Var);
        t9 t9Var = new t9(activity);
        this.f45874b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        t9Var.setVisibility(8);
        f9.addView(t9Var, f6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f45875c = imageView;
        imageView.setBackground(g6.f0(5, g6.l1(0.2f, g6.v0(g6.W5, c6Var)), -1));
        h6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23069de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new bg.n(26));
        imageView.setVisibility(8);
        f9.addView(imageView, f6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.tn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.df r26, org.telegram.ui.df r27) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l.a(org.telegram.ui.tn, org.telegram.messenger.MessageObject, org.telegram.ui.df, org.telegram.ui.df):void");
    }
}
