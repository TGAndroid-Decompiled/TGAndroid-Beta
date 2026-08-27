package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

public final class x00 extends f2.b1 {

    public final i10 f44232a;

    public x00(i10 i10Var) {
        this.f44232a = i10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f44232a.G.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i10 i10Var = this.f44232a;
        jh.a3 a3Var = i10Var.f38947i0;
        f2.k0 k0Var = i10Var.f38944f0;
        ud.a aVar = i10Var.f38934a;
        r00 r00Var = i10Var.f38948j0;
        if (recyclerView.getAdapter() == null || i10Var.d == null) {
            return;
        }
        int iL0 = k0Var.L0();
        int iN0 = k0Var.N0();
        int iAbs = Math.abs(iN0 - iL0) + 1;
        int iH = recyclerView.getAdapter().h();
        if (!i10Var.I && iAbs > 0 && iN0 >= iH - 10 && !i10Var.J) {
            AndroidUtilities.runOnUIThread(new r00(this, 1));
        }
        if (i10Var.d != i10Var.Q) {
            View pinnedHeader = i10Var.f38936b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.s3) {
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) pinnedHeader;
                CharSequence text = s3Var.getText();
                if (!TextUtils.isEmpty(text) && s3Var.getAlpha() > 0.0f) {
                    String string = text.toString();
                    if (!TextUtils.equals((String) a3Var.d, string)) {
                        a3Var.d = string;
                        ((org.telegram.ui.Components.i6) a3Var.f13031b).q(string, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(r00Var);
                        AndroidUtilities.runOnUIThread(r00Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            aVar.a(false, true);
            return;
        }
        if (i11 != 0 && !i10Var.f38943f.isEmpty() && TextUtils.isEmpty(i10Var.M)) {
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            AndroidUtilities.runOnUIThread(r00Var, 1650L);
            aVar.a(true, true);
        }
        f2.o1 o1VarK = recyclerView.K(iL0);
        if (o1VarK == null || o1VarK.f5793f != 0) {
            return;
        }
        View view = o1VarK.f5789a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            MessageObject messageObject = p7Var.f24995e <= 0 ? null : p7Var.f24993b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                a3Var.getClass();
                String dateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) a3Var.d, dateChat)) {
                    return;
                }
                a3Var.d = dateChat;
                ((org.telegram.ui.Components.i6) a3Var.f13031b).q(dateChat, true, true);
            }
        }
    }
}
