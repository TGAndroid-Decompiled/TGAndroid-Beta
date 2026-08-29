package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y5;
public final class j0 extends FrameLayout {
    public final gh.s f45840a;
    public final ImageView f45841b;
    public final TL_keyboard.KeyboardButton f45842c;
    public boolean d;
    public boolean f45843e;
    public boolean f45844f;
    public boolean h;
    public final l0 f45845n;

    public j0(l0 l0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f45845n = l0Var;
        this.f45842c = keyboardButton;
        gh.s sVar = new gh.s(context);
        this.f45840a = sVar;
        sVar.f7459f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, f6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(sVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new y5(keyboardButton.style.icon, sVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, sVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.f45841b = imageView;
        imageView.setColorFilter(g6.v0(g6.Xe, l0Var.f45878a));
        if (kf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, f6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        sVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i16 = g6.Ye;
        c6 c6Var = this.f45845n.f45878a;
        int v02 = g6.v0(i16, c6Var);
        int v03 = g6.v0(g6.Ze, c6Var);
        int v04 = g6.v0(g6.Xe, c6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f45842c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = g6.l1(0.8f, g6.v0(g6.dl, c6Var));
                h = i0.a.h(g6.v0(g6.f23152i6, c6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = g6.l1(0.8f, g6.v0(g6.el, c6Var));
                h = i0.a.h(g6.v0(g6.f23152i6, c6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = g6.l1(0.8f, g6.v0(g6.fl, c6Var));
                h = i0.a.h(g6.v0(g6.f23152i6, c6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f45841b.setColorFilter(v04);
            this.f45840a.setTextColor(v04);
            z10 = this.d;
            if (!z10 && this.f45843e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z11 = this.f45844f;
            if (!z11 && this.f45843e) {
                i13 = dp;
            } else {
                i13 = dp2;
            }
            if (!z11 && this.h) {
                i14 = dp;
            } else {
                i14 = dp2;
            }
            if (!z10 && this.h) {
                i15 = dp;
            } else {
                i15 = dp2;
            }
            setBackground(g6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f45841b.setColorFilter(v04);
        this.f45840a.setTextColor(v04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = dp2;
        z11 = this.f45844f;
        if (!z11) {
        }
        i13 = dp2;
        if (!z11) {
        }
        i14 = dp2;
        if (!z10) {
        }
        i15 = dp2;
        setBackground(g6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
