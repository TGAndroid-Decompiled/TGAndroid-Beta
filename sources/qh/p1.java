package qh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.wx;
import org.telegram.ui.StickersActivity;
public final class p1 implements wx {
    public final x1 f46612a;

    public p1(x1 x1Var) {
        this.f46612a = x1Var;
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
    public final void i(int i9) {
        d1 focusedEditTextOrNull;
        boolean z10 = false;
        x1 x1Var = this.f46612a;
        if (i9 != 0 && (focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull()) != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i9 != 0) {
            z10 = true;
        }
        x1Var.f46825y0 = z10;
        x1Var.d0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        d1 Z = x1.Z(this.f46612a);
        if (Z == null || Z.length() == 0) {
            return false;
        }
        Z.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        x1 x1Var = this.f46612a;
        d1 Z = x1.Z(x1Var);
        if (Z != null) {
            int a02 = x1.a0(x1Var, Z);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, Z.getPaint().getFontMetricsInt(), false, (int[]) null);
                Z.setText(Z.getText().insert(a02, replaceEmoji));
                int length = a02 + replaceEmoji.length();
                Z.setSelection(length, length);
                if (Z == x1Var.N0) {
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
        this.f46612a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f46612a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.t5 t5Var;
        x1 x1Var = this.f46612a;
        d1 Z = x1.Z(x1Var);
        if (Z != null) {
            int a02 = x1.a0(x1Var, Z);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    t5Var = new org.telegram.ui.Components.t5(document, Z.getPaint().getFontMetricsInt());
                } else {
                    t5Var = new org.telegram.ui.Components.t5(j10, Z.getPaint().getFontMetricsInt());
                }
                t5Var.cacheType = org.telegram.ui.Components.k5.g();
                spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                Z.setText(Z.getText().insert(a02, spannableString));
                int length = a02 + spannableString.length();
                Z.setSelection(length, length);
                if (Z == x1Var.N0) {
                    x1Var.O0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f46612a.f46825y0;
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
    public final void o(h41 h41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i9) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
    }
}
