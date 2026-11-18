package tg;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bj;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.x5;
public final class a0 implements rx {
    public final g0 f57725a;

    public a0(g0 g0Var) {
        this.f57725a = g0Var;
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
        b editText = ((m2) this.f57725a.C0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        m2 m2Var;
        b editText;
        g6[] g6VarArr;
        j jVar = this.f57725a.C0;
        if (!(jVar instanceof m2) || (editText = (m2Var = (m2) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = j6.m(str, m2Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.f24176b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void n() {
        g0 g0Var = this.f57725a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var.getContext(), g0Var.A1);
        String M0 = gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = gd.M0(2131752058, null);
        alertDialog$Builder.k(gd.M0(2131752088, null), new org.telegram.ui.ActionBar.p(this, 28));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        x5 x5Var;
        b editText = ((m2) this.f57725a.C0).getEditText();
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
                x5Var = new x5(document, editText.getPaint().getFontMetricsInt());
            } else {
                x5Var = new x5(j3, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            a8.g(e10, true);
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
    public final void i(int i7) {
    }

    @Override
    public final void o(h41 h41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i7) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j3) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, bj bjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
