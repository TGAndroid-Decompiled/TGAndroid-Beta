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
public final class n implements fy {
    public final p f48587a;

    public n(p pVar) {
        this.f48587a = pVar;
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
        p pVar = this.f48587a;
        if (i10 != 0 && (focusedEditTextOrNull = pVar.f48623r.getFocusedEditTextOrNull()) != null) {
            pVar.B = focusedEditTextOrNull;
            pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        pVar.f48627y = z10;
        pVar.S();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 L = p.L(this.f48587a);
        if (L == null || L.length() == 0) {
            return false;
        }
        L.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        p pVar = this.f48587a;
        d1 L = p.L(pVar);
        if (L != null) {
            int M = p.M(pVar, L);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, L.getPaint().getFontMetricsInt(), false, (int[]) null);
                L.setText(L.getText().insert(M, replaceEmoji));
                int length = M + replaceEmoji.length();
                L.setSelection(length, length);
                if (L == pVar.B) {
                    pVar.C = length;
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
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        p pVar = this.f48587a;
        d1 L = p.L(pVar);
        if (L != null) {
            int M = p.M(pVar, L);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new y5(document, L.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new y5(j10, L.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.g();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                L.setText(L.getText().insert(M, spannableString));
                int length = M + spannableString.length();
                L.setSelection(length, length);
                if (L == pVar.B) {
                    pVar.C = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f48587a.f48627y;
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
    public final void o(s41 s41Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
