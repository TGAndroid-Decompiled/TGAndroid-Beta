package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class w00 extends f2.a1 {
    public final h10 f43807a;

    public w00(h10 h10Var) {
        this.f43807a = h10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f43807a.G.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        h10 h10Var = this.f43807a;
        lh.z2 z2Var = h10Var.f38731i0;
        f2.j0 j0Var = h10Var.f38728f0;
        vd.a aVar = h10Var.f38718a;
        q00 q00Var = h10Var.f38732j0;
        if (recyclerView.getAdapter() != null && h10Var.d != null) {
            int L0 = j0Var.L0();
            int N0 = j0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!h10Var.I && abs > 0 && N0 >= h - 10 && !h10Var.J) {
                AndroidUtilities.runOnUIThread(new q00(this, 1));
            }
            if (h10Var.d == h10Var.Q) {
                if (i11 != 0 && !h10Var.f38727f.isEmpty() && TextUtils.isEmpty(h10Var.M)) {
                    AndroidUtilities.cancelRunOnUIThread(q00Var);
                    AndroidUtilities.runOnUIThread(q00Var, 1650L);
                    aVar.a(true, true);
                }
                f2.n1 K = recyclerView.K(L0);
                if (K != null && K.f6436f == 0) {
                    View view = K.f6432a;
                    if (view instanceof org.telegram.ui.Cells.q7) {
                        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                        if (q7Var.f25075e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = q7Var.f25073b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            z2Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) z2Var.d, formatDateChat)) {
                                z2Var.d = formatDateChat;
                                ((org.telegram.ui.Components.n6) z2Var.f16451b).q(formatDateChat, true, true);
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
            View pinnedHeader = h10Var.f38720b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.s3) {
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) pinnedHeader;
                CharSequence text = s3Var.getText();
                if (!TextUtils.isEmpty(text) && s3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) z2Var.d, charSequence)) {
                        z2Var.d = charSequence;
                        ((org.telegram.ui.Components.n6) z2Var.f16451b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(q00Var);
                        AndroidUtilities.runOnUIThread(q00Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(q00Var);
            aVar.a(false, true);
        }
    }
}
