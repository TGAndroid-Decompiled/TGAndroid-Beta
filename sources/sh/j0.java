package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u5;
public final class j0 extends FrameLayout {
    public final jh.s f47465a;
    public final ImageView f47466b;
    public final TL_keyboard.KeyboardButton f47467c;
    public boolean d;
    public boolean f47468e;
    public boolean f47469f;
    public boolean h;
    public final l0 f47470n;

    public j0(l0 l0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f47470n = l0Var;
        this.f47467c = keyboardButton;
        jh.s sVar = new jh.s(context);
        this.f47465a = sVar;
        sVar.f10189f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, c6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(sVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new u5(keyboardButton.style.icon, sVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, sVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f47466b = imageView;
        imageView.setColorFilter(k6.v0(k6.Xe, l0Var.f47503a));
        if (mf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, c6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        sVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        boolean z4;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = k6.Ye;
        g6 g6Var = this.f47470n.f47503a;
        int v02 = k6.v0(i16, g6Var);
        int v03 = k6.v0(k6.Ze, g6Var);
        int v04 = k6.v0(k6.Xe, g6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f47467c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = k6.l1(0.8f, k6.v0(k6.dl, g6Var));
                h = i0.a.h(k6.v0(k6.f21750i6, g6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = k6.l1(0.8f, k6.v0(k6.el, g6Var));
                h = i0.a.h(k6.v0(k6.f21750i6, g6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = k6.l1(0.8f, k6.v0(k6.fl, g6Var));
                h = i0.a.h(k6.v0(k6.f21750i6, g6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f47466b.setColorFilter(v04);
            this.f47465a.setTextColor(v04);
            z4 = this.d;
            if (!z4 && this.f47468e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z10 = this.f47469f;
            if (!z10 && this.f47468e) {
                i13 = dp;
            } else {
                i13 = dp2;
            }
            if (!z10 && this.h) {
                i14 = dp;
            } else {
                i14 = dp2;
            }
            if (!z4 && this.h) {
                i15 = dp;
            } else {
                i15 = dp2;
            }
            setBackground(k6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f47466b.setColorFilter(v04);
        this.f47465a.setTextColor(v04);
        z4 = this.d;
        if (!z4) {
        }
        i12 = dp2;
        z10 = this.f47469f;
        if (!z10) {
        }
        i13 = dp2;
        if (!z10) {
        }
        i14 = dp2;
        if (!z4) {
        }
        i15 = dp2;
        setBackground(k6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
