package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class v00 extends s4.u0 {
    public final h10 f44561a;

    public v00(h10 h10Var) {
        this.f44561a = h10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f44561a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        h10 h10Var = this.f44561a;
        y00 y00Var = h10Var.m0;
        s4.c0 c0Var = h10Var.f39839j0;
        oe.b bVar = h10Var.f39826a;
        p00 p00Var = h10Var.f39843n0;
        if (recyclerView.getAdapter() != null && h10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!h10Var.M && abs > 0 && N0 >= h - 10 && !h10Var.N) {
                AndroidUtilities.runOnUIThread(new p00(this, 1));
            }
            if (h10Var.d == h10Var.U) {
                if (i11 != 0 && !h10Var.f39834f.isEmpty() && TextUtils.isEmpty(h10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(p00Var);
                    AndroidUtilities.runOnUIThread(p00Var, 1650L);
                    bVar.a(true, true);
                }
                s4.e1 K = recyclerView.K(L0);
                if (K != null && K.f47741f == 0) {
                    View view = K.f47738a;
                    if (view instanceof org.telegram.ui.Cells.x7) {
                        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                        if (x7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = x7Var.f25720b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            y00Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals(y00Var.f45918c, formatDateChat)) {
                                y00Var.f45918c = formatDateChat;
                                y00Var.f45916a.t(formatDateChat, true, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            View pinnedHeader = h10Var.f39828b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(y00Var.f45918c, charSequence)) {
                        y00Var.f45918c = charSequence;
                        y00Var.f45916a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(p00Var);
                        AndroidUtilities.runOnUIThread(p00Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(p00Var);
            bVar.a(false, true);
        }
    }
}
