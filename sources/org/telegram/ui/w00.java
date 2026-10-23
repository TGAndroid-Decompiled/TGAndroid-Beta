package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class w00 extends s4.r0 {
    public final i10 f42883a;

    public w00(i10 i10Var) {
        this.f42883a = i10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f42883a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        i10 i10Var = this.f42883a;
        z00 z00Var = i10Var.m0;
        s4.b0 b0Var = i10Var.f38023j0;
        ne.b bVar = i10Var.f38010a;
        fz fzVar = i10Var.f38027n0;
        if (recyclerView.getAdapter() != null && i10Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!i10Var.M && abs > 0 && N0 >= h - 10 && !i10Var.N) {
                AndroidUtilities.runOnUIThread(new fz(this, 2));
            }
            if (i10Var.d == i10Var.U) {
                if (i11 != 0 && !i10Var.f38018f.isEmpty() && TextUtils.isEmpty(i10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(fzVar);
                    AndroidUtilities.runOnUIThread(fzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.b1 K = recyclerView.K(L0);
                if (K != null && K.f46346f == 0) {
                    View view = K.f46343a;
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        if (t7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = t7Var.f23705b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            z00Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals(z00Var.f44025c, formatDateChat)) {
                                z00Var.f44025c = formatDateChat;
                                z00Var.f44023a.t(formatDateChat, true, true);
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
            View pinnedHeader = i10Var.f38012b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(z00Var.f44025c, charSequence)) {
                        z00Var.f44025c = charSequence;
                        z00Var.f44023a.t(charSequence, true, true);
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
