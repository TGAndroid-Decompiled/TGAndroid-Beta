package vh;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x41;
public final class u3 implements vx {
    public final b4 f52019a;

    public u3(b4 b4Var) {
        this.f52019a = b4Var;
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
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        jg.b editText = ((jg.g3) this.f52019a.f50993s0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        jg.g3 g3Var;
        jg.b editText;
        org.telegram.messenger.h6[] h6VarArr;
        jg.j jVar = this.f52019a.f50993s0;
        if (!(jVar instanceof jg.g3) || (editText = (g3Var = (jg.g3) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, g3Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.h6.class)) != null) {
                for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                    h6Var.f16025b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void n() {
        b4 b4Var = this.f52019a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b4Var.getContext(), b4Var.f50988p1);
        String L0 = dd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = dd.L0(2131752069, null);
        alertDialog$Builder.k(dd.L0(2131752099, null), new rh.d0(this, 28));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        jg.b editText = ((jg.g3) this.f52019a.f50993s0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                o5Var = new org.telegram.ui.Components.o5(document.f19800id, 1.0f, editText.getPaint().getFontMetricsInt());
                o5Var.document = document;
            } else {
                o5Var = new org.telegram.ui.Components.o5(j10, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void i(int i10) {
    }

    @Override
    public final void o(x41 x41Var) {
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
    public final void q() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, gj gjVar, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
