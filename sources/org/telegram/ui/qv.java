package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qv implements View.OnLongClickListener {
    public final int f42203a;
    public final dy f42204b;

    public qv(dy dyVar, int i9) {
        this.f42203a = i9;
        this.f42204b = dyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f42203a) {
            case 0:
                dy dyVar = this.f42204b;
                dyVar.r4(dyVar.E2, 104, true, true, null);
                return true;
            case 1:
                dy dyVar2 = this.f42204b;
                ArrayList arrayList = dyVar2.E2;
                if (dyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    long longValue = ((Long) arrayList.get(i9)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = dyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(dyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dv(dyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new dv(dyVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f42204b.p4(view);
                return true;
            default:
                dy dyVar3 = this.f42204b;
                dyVar3.getContactsController().loadGlobalPrivacySetting();
                dyVar3.K4();
                return true;
        }
    }
}
