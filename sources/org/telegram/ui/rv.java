package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rv implements View.OnLongClickListener {
    public final int f42209a;
    public final fy f42210b;

    public rv(fy fyVar, int i10) {
        this.f42209a = i10;
        this.f42210b = fyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f42209a) {
            case 0:
                fy fyVar = this.f42210b;
                fyVar.r4(fyVar.E2, 104, true, true, null);
                return true;
            case 1:
                fy fyVar2 = this.f42210b;
                ArrayList arrayList = fyVar2.E2;
                if (fyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = fyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(fyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ev(fyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new ev(fyVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f42210b.p4(view);
                return true;
            default:
                fy fyVar3 = this.f42210b;
                fyVar3.getContactsController().loadGlobalPrivacySetting();
                fyVar3.K4();
                return true;
        }
    }
}
