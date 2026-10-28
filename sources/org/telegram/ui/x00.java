package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class x00 extends s4.u0 {
    public final j10 f45438a;

    public x00(j10 j10Var) {
        this.f45438a = j10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f45438a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        j10 j10Var = this.f45438a;
        a10 a10Var = j10Var.m0;
        s4.c0 c0Var = j10Var.f40333j0;
        oe.b bVar = j10Var.f40320a;
        r00 r00Var = j10Var.f40337n0;
        if (recyclerView.getAdapter() != null && j10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!j10Var.M && abs > 0 && N0 >= h - 10 && !j10Var.N) {
                AndroidUtilities.runOnUIThread(new r00(this, 1));
            }
            if (j10Var.d == j10Var.U) {
                if (i11 != 0 && !j10Var.f40328f.isEmpty() && TextUtils.isEmpty(j10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(r00Var);
                    AndroidUtilities.runOnUIThread(r00Var, 1650L);
                    bVar.a(true, true);
                }
                s4.e1 K = recyclerView.K(L0);
                if (K != null && K.f47776f == 0) {
                    View view = K.f47773a;
                    if (view instanceof org.telegram.ui.Cells.x7) {
                        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                        if (x7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = x7Var.f25722b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            a10Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals(a10Var.f37642c, formatDateChat)) {
                                a10Var.f37642c = formatDateChat;
                                a10Var.f37640a.t(formatDateChat, true, true);
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
            View pinnedHeader = j10Var.f40322b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(a10Var.f37642c, charSequence)) {
                        a10Var.f37642c = charSequence;
                        a10Var.f37640a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(r00Var);
                        AndroidUtilities.runOnUIThread(r00Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            bVar.a(false, true);
        }
    }
}
