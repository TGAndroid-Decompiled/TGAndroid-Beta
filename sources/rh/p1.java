package rh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.xx;
import org.telegram.ui.StickersActivity;

public final class p1 implements xx {

    public final x1 f47330a;

    public p1(x1 x1Var) {
        this.f47330a = x1Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i10) {
        d1 focusedEditTextOrNull;
        x1 x1Var = this.f47330a;
        if (i10 != 0 && (focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull()) != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i10 != 0;
        x1Var.f47581y0 = z10;
        x1Var.e0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 d1VarA0 = x1.a0(this.f47330a);
        if (d1VarA0 == null || d1VarA0.length() == 0) {
            return false;
        }
        d1VarA0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        x1 x1Var = this.f47330a;
        d1 d1VarA0 = x1.a0(x1Var);
        if (d1VarA0 == null) {
            return;
        }
        int iB0 = x1.b0(x1Var, d1VarA0);
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, d1VarA0.getPaint().getFontMetricsInt(), false, (int[]) null);
            d1VarA0.setText(d1VarA0.getText().insert(iB0, charSequenceReplaceEmoji));
            int length = iB0 + charSequenceReplaceEmoji.length();
            d1VarA0.setSelection(length, length);
            if (d1VarA0 == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void t(ArrayList arrayList) {
        this.f47330a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f47330a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        x1 x1Var = this.f47330a;
        d1 d1VarA0 = x1.a0(x1Var);
        if (d1VarA0 == null) {
            return;
        }
        int iB0 = x1.b0(x1Var, d1VarA0);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.t5 t5Var = document != null ? new org.telegram.ui.Components.t5(document, d1VarA0.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.t5(j10, d1VarA0.getPaint().getFontMetricsInt());
            t5Var.cacheType = org.telegram.ui.Components.k5.g();
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            d1VarA0.setText(d1VarA0.getText().insert(iB0, spannableString));
            int length = iB0 + spannableString.length();
            d1VarA0.setSelection(length, length);
            if (d1VarA0 == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean z() {
        return this.f47330a.f47581y0;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(j41 j41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
