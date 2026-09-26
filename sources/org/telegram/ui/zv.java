package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zv implements View.OnLongClickListener {
    public final int f40583a;
    public final qy f40584b;

    public zv(qy qyVar, int i10) {
        this.f40583a = i10;
        this.f40584b = qyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f40583a) {
            case 0:
                qy qyVar = this.f40584b;
                qyVar.r4(qyVar.I2, 104, true, true, null);
                return true;
            case 1:
                qy qyVar2 = this.f40584b;
                ArrayList arrayList = qyVar2.I2;
                if (qyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = qyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(qyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new lv(qyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new lv(qyVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f40584b.p4(view);
                return true;
            default:
                qy qyVar3 = this.f40584b;
                qyVar3.getContactsController().loadGlobalPrivacySetting();
                qyVar3.K4();
                return true;
        }
    }
}
