package qh;

import android.text.SpannableString;
import android.text.Spanned;
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
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.my;
public final class q4 implements my {
    public final a5 f45924a;

    public q4(a5 a5Var) {
        this.f45924a = a5Var;
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
        eg.b editText = ((eg.z3) this.f45924a.G0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        eg.z3 z3Var;
        eg.b editText;
        Emoji.EmojiSpan[] emojiSpanArr;
        eg.j jVar = this.f45924a.G0;
        if ((jVar instanceof eg.z3) && (editText = (z3Var = (eg.z3) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, z3Var.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
                int length = selectionEnd + replaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e6) {
                FileLog.e(e6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void n() {
        a5 a5Var = this.f45924a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a5Var.getContext(), 0, a5Var.D1);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new mh.m5(this, 28));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        org.telegram.ui.Components.u5 u5Var;
        eg.b editText = ((eg.z3) this.f45924a.G0).getEditText();
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    u5Var = new org.telegram.ui.Components.u5(document.f20851id, 1.0f, editText.getPaint().getFontMetricsInt());
                    u5Var.document = document;
                } else {
                    u5Var = new org.telegram.ui.Components.u5(j10, 1.0f, editText.getPaint().getFontMetricsInt());
                }
                spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                editText.setText(editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editText.setSelection(length, length);
            } catch (Exception e6) {
                FileLog.e(e6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean z() {
        return false;
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
    public final void i(int i10) {
    }

    @Override
    public final void o(d51 d51Var) {
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
