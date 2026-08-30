package rh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.p9;
public final class m extends FrameLayout {
    public static final int f43600n = 0;
    public final f6 f43601a;
    public final p9 f43602b;
    public final ImageView f43603c;
    public final TextView d;
    public final TextView e;
    public final TextView f43604f;
    public final e90 h;

    public m(Activity activity, f6 f6Var) {
        super(activity);
        this.f43601a = f6Var;
        LinearLayout h = kh.a2.h(activity, 0);
        h.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        d6.b(h, 0.025f, 1.4f);
        addView(h, b6.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, f6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        h.addView(linearLayout, b6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, b6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, b6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f43604f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, f6Var));
        d6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, f6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, b6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        e90 e90Var = new e90(activity, null);
        this.h = e90Var;
        e90Var.setTextSize(1, 13.0f);
        e90Var.setLinkTextColor(j6.v0(j6.f19966gc, f6Var));
        e90Var.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(e90Var, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(e90Var);
        p9 p9Var = new p9(activity);
        this.f43602b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        p9Var.setVisibility(8);
        h.addView(p9Var, b6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f43603c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, f6Var)), -1));
        d6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19914de, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new dg.m(26));
        imageView.setVisibility(8);
        h.addView(imageView, b6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.xn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.lf r26, org.telegram.ui.lf r27) {
        throw new UnsupportedOperationException("Method not decompiled: rh.m.a(org.telegram.ui.xn, org.telegram.messenger.MessageObject, org.telegram.ui.lf, org.telegram.ui.lf):void");
    }
}
