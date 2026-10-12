package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class r10 extends s4.r0 {
    public final c20 f39570a;

    public r10(c20 c20Var) {
        this.f39570a = c20Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f39570a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        c20 c20Var = this.f39570a;
        bi.d4 d4Var = c20Var.m0;
        s4.b0 b0Var = c20Var.f34692j0;
        ne.b bVar = c20Var.f34679a;
        zz zzVar = c20Var.f34696n0;
        if (recyclerView.getAdapter() != null && c20Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!c20Var.M && abs > 0 && N0 >= h - 10 && !c20Var.N) {
                AndroidUtilities.runOnUIThread(new zz(this, 2));
            }
            if (c20Var.d == c20Var.U) {
                if (i11 != 0 && !c20Var.f34687f.isEmpty() && TextUtils.isEmpty(c20Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(zzVar);
                    AndroidUtilities.runOnUIThread(zzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.b1 K = recyclerView.K(L0);
                if (K != null && K.f44841f == 0) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f22536b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            d4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) d4Var.d, formatDateChat)) {
                                d4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.r6) d4Var.f2945b).t(formatDateChat, true, true);
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
            View pinnedHeader = c20Var.f34681b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) d4Var.d, charSequence)) {
                        d4Var.d = charSequence;
                        ((org.telegram.ui.Components.r6) d4Var.f2945b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(zzVar);
                        AndroidUtilities.runOnUIThread(zzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(zzVar);
            bVar.a(false, true);
        }
    }
}
