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

public final class n implements xx {

    public final p f47287a;

    public n(p pVar) {
        this.f47287a = pVar;
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
        p pVar = this.f47287a;
        if (i10 != 0 && (focusedEditTextOrNull = pVar.f47324r.getFocusedEditTextOrNull()) != null) {
            pVar.B = focusedEditTextOrNull;
            pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        pVar.f47328y = i10 != 0;
        pVar.S();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 d1VarM = p.M(this.f47287a);
        if (d1VarM == null || d1VarM.length() == 0) {
            return false;
        }
        d1VarM.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        p pVar = this.f47287a;
        d1 d1VarM = p.M(pVar);
        if (d1VarM == null) {
            return;
        }
        int iN = p.N(pVar, d1VarM);
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, d1VarM.getPaint().getFontMetricsInt(), false, (int[]) null);
            d1VarM.setText(d1VarM.getText().insert(iN, charSequenceReplaceEmoji));
            int length = iN + charSequenceReplaceEmoji.length();
            d1VarM.setSelection(length, length);
            if (d1VarM == pVar.B) {
                pVar.C = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        p pVar = this.f47287a;
        d1 d1VarM = p.M(pVar);
        if (d1VarM == null) {
            return;
        }
        int iN = p.N(pVar, d1VarM);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.t5 t5Var = document != null ? new org.telegram.ui.Components.t5(document, d1VarM.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.t5(j10, d1VarM.getPaint().getFontMetricsInt());
            t5Var.cacheType = org.telegram.ui.Components.k5.g();
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            d1VarM.setText(d1VarM.getText().insert(iN, spannableString));
            int length = iN + spannableString.length();
            d1VarM.setSelection(length, length);
            if (d1VarM == pVar.B) {
                pVar.C = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean z() {
        return this.f47287a.f47328y;
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
    public final void o(j41 j41Var) {
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
