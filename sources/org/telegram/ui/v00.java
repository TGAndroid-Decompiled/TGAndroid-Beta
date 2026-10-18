package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class v00 extends s4.r0 {
    public final g10 f42059a;

    public v00(g10 g10Var) {
        this.f42059a = g10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f42059a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        g10 g10Var = this.f42059a;
        ci.h3 h3Var = g10Var.m0;
        s4.b0 b0Var = g10Var.f37029j0;
        ne.b bVar = g10Var.f37016a;
        fz fzVar = g10Var.f37033n0;
        if (recyclerView.getAdapter() != null && g10Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!g10Var.M && abs > 0 && N0 >= h - 10 && !g10Var.N) {
                AndroidUtilities.runOnUIThread(new fz(this, 2));
            }
            if (g10Var.d == g10Var.U) {
                if (i11 != 0 && !g10Var.f37024f.isEmpty() && TextUtils.isEmpty(g10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(fzVar);
                    AndroidUtilities.runOnUIThread(fzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.b1 K = recyclerView.K(L0);
                if (K != null && K.f45913f == 0) {
                    View view = K.f45910a;
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        if (t7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = t7Var.f23197b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            h3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) h3Var.d, formatDateChat)) {
                                h3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.p6) h3Var.f5391b).t(formatDateChat, true, true);
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
            View pinnedHeader = g10Var.f37018b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) h3Var.d, charSequence)) {
                        h3Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) h3Var.f5391b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(fzVar);
                        AndroidUtilities.runOnUIThread(fzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            bVar.a(false, true);
        }
    }
}
