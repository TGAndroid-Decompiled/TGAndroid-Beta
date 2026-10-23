package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class t00 extends s4.r0 {
    public final e10 f41570a;

    public t00(e10 e10Var) {
        this.f41570a = e10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f41570a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        e10 e10Var = this.f41570a;
        ci.i3 i3Var = e10Var.m0;
        s4.b0 b0Var = e10Var.f36509j0;
        ne.b bVar = e10Var.f36496a;
        dz dzVar = e10Var.f36513n0;
        if (recyclerView.getAdapter() != null && e10Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!e10Var.M && abs > 0 && N0 >= h - 10 && !e10Var.N) {
                AndroidUtilities.runOnUIThread(new dz(this, 2));
            }
            if (e10Var.d == e10Var.U) {
                if (i11 != 0 && !e10Var.f36504f.isEmpty() && TextUtils.isEmpty(e10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(dzVar);
                    AndroidUtilities.runOnUIThread(dzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.b1 K = recyclerView.K(L0);
                if (K != null && K.f45924f == 0) {
                    View view = K.f45921a;
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        if (t7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = t7Var.f23205b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            i3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) i3Var.d, formatDateChat)) {
                                i3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.p6) i3Var.f5485b).t(formatDateChat, true, true);
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
            View pinnedHeader = e10Var.f36498b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) i3Var.d, charSequence)) {
                        i3Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) i3Var.f5485b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(dzVar);
                        AndroidUtilities.runOnUIThread(dzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            bVar.a(false, true);
        }
    }
}
