package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.u5;
public final class j0 extends FrameLayout {
    public final ih.s f43623a;
    public final ImageView f43624b;
    public final TL_keyboard.KeyboardButton f43625c;
    public boolean d;
    public boolean e;
    public boolean f43626f;
    public boolean h;
    public final l0 f43627n;

    public j0(l0 l0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f43627n = l0Var;
        this.f43625c = keyboardButton;
        ih.s sVar = new ih.s(context);
        this.f43623a = sVar;
        sVar.f7638f = false;
        sVar.setTextSize(1, 14.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, b6.e(-2, -2, 17));
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
        this.f43624b = imageView;
        imageView.setColorFilter(j6.v0(j6.Xe, l0Var.f43657a));
        if (lf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, b6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
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
        int i16 = j6.Ye;
        f6 f6Var = this.f43627n.f43657a;
        int v02 = j6.v0(i16, f6Var);
        int v03 = j6.v0(j6.Ze, f6Var);
        int v04 = j6.v0(j6.Xe, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f43625c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = j6.l1(0.8f, j6.v0(j6.dl, f6Var));
                h = i0.a.h(j6.v0(j6.f19971i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = j6.l1(0.8f, j6.v0(j6.el, f6Var));
                h = i0.a.h(j6.v0(j6.f19971i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = j6.l1(0.8f, j6.v0(j6.fl, f6Var));
                h = i0.a.h(j6.v0(j6.f19971i6, f6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.f43624b.setColorFilter(v04);
            this.f43623a.setTextColor(v04);
            z4 = this.d;
            if (!z4 && this.e) {
                i12 = dp;
            } else {
                i12 = dp2;
            }
            z10 = this.f43626f;
            if (!z10 && this.e) {
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
            setBackground(j6.i0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.f43624b.setColorFilter(v04);
        this.f43623a.setTextColor(v04);
        z4 = this.d;
        if (!z4) {
        }
        i12 = dp2;
        z10 = this.f43626f;
        if (!z10) {
        }
        i13 = dp2;
        if (!z10) {
        }
        i14 = dp2;
        if (!z4) {
        }
        i15 = dp2;
        setBackground(j6.i0(i12, i13, i14, i15, i10, i11, i11));
    }
}
