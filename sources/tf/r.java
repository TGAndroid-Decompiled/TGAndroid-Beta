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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.oy;
import org.telegram.ui.zx;
public final class r implements x, kl0 {
    public final z f44823a;

    public r(z zVar) {
        this.f44823a = zVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.f44823a;
        int i10 = zVar.f44908p0;
        zVar.f44909q0 = arrayList;
        zVar.f44915u0 = hVar;
        for (int i11 = 0; i11 < zVar.f44909q0.size(); i11++) {
            y yVar = (y) zVar.f44909q0.get(i11);
            TLObject tLObject = yVar.f44880a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) yVar.f44880a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) yVar.f44880a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.f44880a, true);
            }
        }
        zVar.G(null);
        zVar.l();
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User user;
        zx zxVar = this.f44823a.R;
        if (zxVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            oy oyVar = zxVar.f40873a;
            if (oyVar.getParentActivity() != null && (user = oyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(zxVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                oyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(oyVar.getThemedColor(j6.f20141q7));
                }
            }
        }
        return true;
    }
}
