package org.telegram.ui;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class su0 implements org.telegram.ui.Components.xx {

    public final yu0 f42692a;

    public su0(yu0 yu0Var) {
        this.f42692a = yu0Var;
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
        boolean z10 = i10 != 0;
        yu0 yu0Var = this.f42692a;
        yu0Var.f44948x0 = z10;
        yu0Var.f44923e.requestLayout();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        EditTextBoldCursor editField = this.f42692a.X.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        EditTextBoldCursor editField = this.f42692a.X.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
            editField.setText(editField.getText().insert(selectionEnd, charSequenceReplaceEmoji));
            int length = selectionEnd + charSequenceReplaceEmoji.length();
            editField.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void n() {
        yu0 yu0Var = this.f42692a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getParentActivity(), 0, ((org.telegram.ui.ActionBar.n2) yu0Var).resourceProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new dl0(this, 5));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        yu0 yu0Var = this.f42692a;
        EditTextBoldCursor editField = yu0Var.X.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.t5 t5Var = document != null ? new org.telegram.ui.Components.t5(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.t5(j10, editField.getPaint().getFontMetricsInt());
            t5Var.cacheType = yu0Var.N.f34983c;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final boolean z() {
        return this.f42692a.f44948x0;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(org.telegram.ui.Components.j41 j41Var) {
    }

    @Override
    public final void q() {
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
    public final void u() {
    }

    @Override
    public final void w() {
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
