package uf;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.ay;
import org.telegram.ui.py;
public final class r implements x, ll0 {
    public final z f48677a;

    public r(z zVar) {
        this.f48677a = zVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.f48677a;
        int i10 = zVar.f48769p0;
        zVar.f48770q0 = arrayList;
        zVar.f48776u0 = hVar;
        for (int i11 = 0; i11 < zVar.f48770q0.size(); i11++) {
            y yVar = (y) zVar.f48770q0.get(i11);
            TLObject tLObject = yVar.f48739a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) yVar.f48739a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) yVar.f48739a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.f48739a, true);
            }
        }
        zVar.G(null);
        zVar.l();
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User user;
        ay ayVar = this.f48677a.R;
        if (ayVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            py pyVar = ayVar.f35264a;
            if (pyVar.getParentActivity() != null && (user = pyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(ayVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                pyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(pyVar.getThemedColor(k6.f21895q7));
                }
            }
        }
        return true;
    }
}
