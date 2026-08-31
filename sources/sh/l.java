package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.p9;
public final class l extends FrameLayout {
    public static final int f47497n = 0;
    public final g6 f47498a;
    public final p9 f47499b;
    public final ImageView f47500c;
    public final TextView d;
    public final TextView f47501e;
    public final TextView f47502f;
    public final g90 h;

    public l(Activity activity, g6 g6Var) {
        super(activity);
        this.f47498a = g6Var;
        LinearLayout h = l.d.h(activity, 0);
        h.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        e6.b(h, 0.025f, 1.4f);
        addView(h, c6.e(-1, -1, 119));
        int i10 = k6.Oh;
        setBackground(k6.Y(k6.l1(0.1f, k6.v0(i10, g6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        h.addView(linearLayout, c6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.G6;
        textView.setTextColor(k6.v0(i11, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, c6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f47502f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(k6.v0(i10, g6Var));
        e6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(k6.b0(AndroidUtilities.dp(9.0f), k6.l1(0.1f, k6.v0(i10, g6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, c6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f47501e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(k6.v0(i11, g6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, c6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        g90 g90Var = new g90(activity, null);
        this.h = g90Var;
        g90Var.setTextSize(1, 13.0f);
        g90Var.setLinkTextColor(k6.v0(k6.f21720gc, g6Var));
        g90Var.setTextColor(k6.v0(i11, g6Var));
        linearLayout.addView(g90Var, c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(g90Var);
        p9 p9Var = new p9(activity);
        this.f47499b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        p9Var.setVisibility(8);
        h.addView(p9Var, c6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f47500c = imageView;
        imageView.setBackground(k6.f0(5, k6.l1(0.2f, k6.v0(k6.W5, g6Var)), -1));
        e6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.f21667de, g6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new eg.m(26));
        imageView.setVisibility(8);
        h.addView(imageView, c6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.xn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.lf r26, org.telegram.ui.lf r27) {
        throw new UnsupportedOperationException("Method not decompiled: sh.l.a(org.telegram.ui.xn, org.telegram.messenger.MessageObject, org.telegram.ui.lf, org.telegram.ui.lf):void");
    }
}
