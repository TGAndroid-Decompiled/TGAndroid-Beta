package th;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.y5;
import org.telegram.ui.StickersActivity;
public final class p1 implements fy {
    public final x1 f48629a;

    public p1(x1 x1Var) {
        this.f48629a = x1Var;
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
        boolean z10 = false;
        x1 x1Var = this.f48629a;
        if (i10 != 0 && (focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull()) != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        x1Var.f48879y0 = z10;
        x1Var.e0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 a02 = x1.a0(this.f48629a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        x1 x1Var = this.f48629a;
        d1 a02 = x1.a0(x1Var);
        if (a02 != null) {
            int b02 = x1.b0(x1Var, a02);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
                a02.setText(a02.getText().insert(b02, replaceEmoji));
                int length = b02 + replaceEmoji.length();
                a02.setSelection(length, length);
                if (a02 == x1Var.N0) {
                    x1Var.O0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void t(ArrayList arrayList) {
        this.f48629a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f48629a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        x1 x1Var = this.f48629a;
        d1 a02 = x1.a0(x1Var);
        if (a02 != null) {
            int b02 = x1.b0(x1Var, a02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new y5(document, a02.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new y5(j10, a02.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.g();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                a02.setText(a02.getText().insert(b02, spannableString));
                int length = b02 + spannableString.length();
                a02.setSelection(length, length);
                if (a02 == x1Var.N0) {
                    x1Var.O0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f48629a.f48879y0;
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
    public final void o(s41 s41Var) {
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
