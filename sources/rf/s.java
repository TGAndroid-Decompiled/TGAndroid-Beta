package rf;

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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.fy;
import org.telegram.ui.qx;
public final class s implements y, bl0 {
    public final a0 f47346a;

    public s(a0 a0Var) {
        this.f47346a = a0Var;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        a0 a0Var = this.f47346a;
        int i10 = a0Var.f47155o0;
        a0Var.f47156p0 = arrayList;
        a0Var.f47162t0 = hVar;
        for (int i11 = 0; i11 < a0Var.f47156p0.size(); i11++) {
            z zVar = (z) a0Var.f47156p0.get(i11);
            TLObject tLObject = zVar.f47408a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) zVar.f47408a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) zVar.f47408a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) zVar.f47408a, true);
            }
        }
        a0Var.G(null);
        a0Var.l();
    }

    @Override
    public boolean c(int i10, View view) {
        TLRPC.User user;
        qx qxVar = this.f47346a.Q;
        if (qxVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            fy fyVar = qxVar.f41793a;
            if (fyVar.getParentActivity() != null && (user = fyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(qxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                fyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(fyVar.getThemedColor(g6.f23295q7));
                }
            }
        }
        return true;
    }
}
