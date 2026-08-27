package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class tv implements View.OnLongClickListener {

    public final int f43018a;

    public final gy f43019b;

    public tv(gy gyVar, int i10) {
        this.f43018a = i10;
        this.f43019b = gyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f43018a) {
            case 0:
                gy gyVar = this.f43019b;
                gyVar.r4(gyVar.E2, 104, true, true, null);
                return true;
            case 1:
                gy gyVar2 = this.f43019b;
                ArrayList arrayList = gyVar2.E2;
                if (gyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long jLongValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = gyVar2.getMessagesController().getChat(Long.valueOf(-jLongValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(gyVar2, view);
                b70VarH.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gv(gyVar2, 19), false);
                b70VarH.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new gv(gyVar2, 20), z10);
                b70VarH.Z();
                return true;
            case 2:
                this.f43019b.p4(view);
                return true;
            default:
                gy gyVar3 = this.f43019b;
                gyVar3.getContactsController().loadGlobalPrivacySetting();
                gyVar3.K4();
                return true;
        }
    }
}
