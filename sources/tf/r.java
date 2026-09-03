package tf;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.cy;
import org.telegram.ui.qy;
public final class r implements x, jl0 {
    public final z f44885a;

    public r(z zVar) {
        this.f44885a = zVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.f44885a;
        int i10 = zVar.f44970p0;
        zVar.f44971q0 = arrayList;
        zVar.f44977u0 = hVar;
        for (int i11 = 0; i11 < zVar.f44971q0.size(); i11++) {
            y yVar = (y) zVar.f44971q0.get(i11);
            TLObject tLObject = yVar.f44942a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) yVar.f44942a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) yVar.f44942a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.f44942a, true);
            }
        }
        zVar.G(null);
        zVar.l();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        cy cyVar = this.f44885a.R;
        if (cyVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            qy qyVar = cyVar.f33255a;
            if (qyVar.getParentActivity() != null && (user = qyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(cyVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qyVar.getThemedColor(j6.f20116q7));
                }
            }
        }
        return true;
    }
}
