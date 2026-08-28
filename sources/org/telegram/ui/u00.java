package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class u00 extends f2.d1 {
    public final f10 f43094a;

    public u00(f10 f10Var) {
        this.f43094a = f10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(this.f43094a.G.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        MessageObject messageObject;
        f10 f10Var = this.f43094a;
        ih.b3 b3Var = f10Var.f38098i0;
        f2.m0 m0Var = f10Var.f38095f0;
        td.a aVar = f10Var.f38085a;
        o00 o00Var = f10Var.f38099j0;
        if (recyclerView.getAdapter() != null && f10Var.d != null) {
            int L0 = m0Var.L0();
            int N0 = m0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!f10Var.I && abs > 0 && N0 >= h - 10 && !f10Var.J) {
                AndroidUtilities.runOnUIThread(new o00(this, 1));
            }
            if (f10Var.d == f10Var.Q) {
                if (i10 != 0 && !f10Var.f38094f.isEmpty() && TextUtils.isEmpty(f10Var.M)) {
                    AndroidUtilities.cancelRunOnUIThread(o00Var);
                    AndroidUtilities.runOnUIThread(o00Var, 1650L);
                    aVar.a(true, true);
                }
                f2.q1 K = recyclerView.K(L0);
                if (K != null && K.f5505f == 0) {
                    View view = K.f5501a;
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        if (s7Var.f25283e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = s7Var.f25281b[0];
                        }
                        if (messageObject != null) {
                            int i11 = messageObject.messageOwner.date;
                            b3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i11);
                            if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
                                b3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.i6) b3Var.f11259b).q(formatDateChat, true, true);
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
            View pinnedHeader = f10Var.f38087b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) b3Var.d, charSequence)) {
                        b3Var.d = charSequence;
                        ((org.telegram.ui.Components.i6) b3Var.f11259b).q(charSequence, true, true);
                    }
                    if (i10 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(o00Var);
                        AndroidUtilities.runOnUIThread(o00Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(o00Var);
            aVar.a(false, true);
        }
    }
}
