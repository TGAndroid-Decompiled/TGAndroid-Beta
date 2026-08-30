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
public final class n implements ky {
    public final p f46021a;

    public n(p pVar) {
        this.f46021a = pVar;
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
        p pVar = this.f46021a;
        if (i10 != 0 && (focusedEditTextOrNull = pVar.f46059r.getFocusedEditTextOrNull()) != null) {
            pVar.C = focusedEditTextOrNull;
            pVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z4 = true;
        }
        pVar.f46063y = z4;
        pVar.S();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 M = p.M(this.f46021a);
        if (M == null || M.length() == 0) {
            return false;
        }
        M.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        p pVar = this.f46021a;
        d1 M = p.M(pVar);
        if (M != null) {
            int N = p.N(pVar, M);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, M.getPaint().getFontMetricsInt(), false, (int[]) null);
                M.setText(M.getText().insert(N, replaceEmoji));
                int length = N + replaceEmoji.length();
                M.setSelection(length, length);
                if (M == pVar.C) {
                    pVar.D = length;
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
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        org.telegram.ui.Components.u5 u5Var;
        p pVar = this.f46021a;
        d1 M = p.M(pVar);
        if (M != null) {
            int N = p.N(pVar, M);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    u5Var = new org.telegram.ui.Components.u5(document, M.getPaint().getFontMetricsInt());
                } else {
                    u5Var = new org.telegram.ui.Components.u5(j10, M.getPaint().getFontMetricsInt());
                }
                u5Var.cacheType = org.telegram.ui.Components.l5.g();
                spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                M.setText(M.getText().insert(N, spannableString));
                int length = N + spannableString.length();
                M.setSelection(length, length);
                if (M == pVar.C) {
                    pVar.D = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f46021a.f46063y;
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
    public final void w() {
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
    public final void t(ArrayList arrayList) {
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
