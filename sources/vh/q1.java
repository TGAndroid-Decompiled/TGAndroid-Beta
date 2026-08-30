package vh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ky;
import org.telegram.ui.StickersActivity;
public final class q1 implements ky {
    public final y1 f46083a;

    public q1(y1 y1Var) {
        this.f46083a = y1Var;
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
        boolean z4 = false;
        y1 y1Var = this.f46083a;
        if (i10 != 0 && (focusedEditTextOrNull = y1Var.M.getFocusedEditTextOrNull()) != null) {
            y1Var.O0 = focusedEditTextOrNull;
            y1Var.P0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z4 = true;
        }
        y1Var.f46323z0 = z4;
        y1Var.e0(z4);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 a02 = y1.a0(this.f46083a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        y1 y1Var = this.f46083a;
        d1 a02 = y1.a0(y1Var);
        if (a02 != null) {
            int b02 = y1.b0(y1Var, a02);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
                a02.setText(a02.getText().insert(b02, replaceEmoji));
                int length = b02 + replaceEmoji.length();
                a02.setSelection(length, length);
                if (a02 == y1Var.O0) {
                    y1Var.P0 = length;
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
        this.f46083a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f46083a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        org.telegram.ui.Components.u5 u5Var;
        y1 y1Var = this.f46083a;
        d1 a02 = y1.a0(y1Var);
        if (a02 != null) {
            int b02 = y1.b0(y1Var, a02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    u5Var = new org.telegram.ui.Components.u5(document, a02.getPaint().getFontMetricsInt());
                } else {
                    u5Var = new org.telegram.ui.Components.u5(j10, a02.getPaint().getFontMetricsInt());
                }
                u5Var.cacheType = org.telegram.ui.Components.l5.g();
                spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                a02.setText(a02.getText().insert(b02, spannableString));
                int length = b02 + spannableString.length();
                a02.setSelection(length, length);
                if (a02 == y1Var.O0) {
                    y1Var.P0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f46083a.f46323z0;
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
    public final void o(e51 e51Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
