package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.k6;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.o5;
import w7.b6;
public final class h0 extends FrameLayout {
    public final nh.p f53773a;
    public final ImageView f53774b;
    public final TL_keyboard.KeyboardButton f53775c;
    public boolean d;
    public boolean e;
    public boolean f53776f;
    public boolean h;
    public final j0 f53777n;

    public h0(j0 j0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.f53777n = j0Var;
        this.f53775c = keyboardButton;
        nh.p pVar = new nh.p(context);
        this.f53773a = pVar;
        pVar.f13892r = false;
        pVar.setTextSize(1, 14.0f);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        zs.i(pVar);
        addView(pVar, b6.e(-2, -2, 17));
        zs.i(pVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new o5(keyboardButton.style.icon, pVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(k6.m(keyboardButton.text, pVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.f53774b = imageView;
        a7.t(imageView, t6.Mf, j0Var.f53818a, PorterDuff.Mode.SRC_ATOP);
        if (sf.c.b(keyboardButton)) {
            imageView.setImageResource(2131230899);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, b6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        pVar.setText(spannableStringBuilder);
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
        int r12;
        int k10;
        int L = org.telegram.messenger.i0.L(21.0f);
        int L2 = org.telegram.messenger.i0.L(11.0f);
        int i16 = t6.Nf;
        p6 p6Var = this.f53777n.f53818a;
        int w02 = t6.w0(i16, p6Var);
        int w03 = t6.w0(t6.Of, p6Var);
        int w04 = t6.w0(t6.Mf, p6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.f53775c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = t6.r1(0.8f, t6.w0(t6.Rl, p6Var));
                k10 = i0.b.k(t6.w0(t6.f21020i6, p6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = t6.r1(0.8f, t6.w0(t6.Sl, p6Var));
                k10 = i0.b.k(t6.w0(t6.f21020i6, p6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = t6.r1(0.8f, t6.w0(t6.Tl, p6Var));
                k10 = i0.b.k(t6.w0(t6.f21020i6, p6Var), r12);
            }
            i10 = r12;
            i11 = k10;
            w04 = -1;
            this.f53774b.setColorFilter(w04);
            this.f53773a.setTextColor(w04);
            z10 = this.d;
            if (!z10 && this.e) {
                i12 = L;
            } else {
                i12 = L2;
            }
            z11 = this.f53776f;
            if (!z11 && this.e) {
                i13 = L;
            } else {
                i13 = L2;
            }
            if (!z11 && this.h) {
                i14 = L;
            } else {
                i14 = L2;
            }
            if (!z10 && this.h) {
                i15 = L;
            } else {
                i15 = L2;
            }
            setBackground(t6.k0(i12, i13, i14, i15, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.f53774b.setColorFilter(w04);
        this.f53773a.setTextColor(w04);
        z10 = this.d;
        if (!z10) {
        }
        i12 = L2;
        z11 = this.f53776f;
        if (!z11) {
        }
        i13 = L2;
        if (!z11) {
        }
        i14 = L2;
        if (!z10) {
        }
        i15 = L2;
        setBackground(t6.k0(i12, i13, i14, i15, i10, i11, i11));
    }
}
