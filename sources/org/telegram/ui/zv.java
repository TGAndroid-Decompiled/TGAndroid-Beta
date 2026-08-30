package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zv implements View.OnLongClickListener {
    public final int f40865a;
    public final oy f40866b;

    public zv(oy oyVar, int i10) {
        this.f40865a = i10;
        this.f40866b = oyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f40865a) {
            case 0:
                oy oyVar = this.f40866b;
                oyVar.r4(oyVar.F2, 104, true, true, null);
                return true;
            case 1:
                oy oyVar2 = this.f40866b;
                ArrayList arrayList = oyVar2.F2;
                if (oyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z4 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z4 = false;
                    }
                    TLRPC.Chat chat = oyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z4 = false;
                    }
                }
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(oyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mv(oyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new mv(oyVar2, 20), z4);
                H.Z();
                return true;
            case 2:
                this.f40866b.p4(view);
                return true;
            default:
                oy oyVar3 = this.f40866b;
                oyVar3.getContactsController().loadGlobalPrivacySetting();
                oyVar3.K4();
                return true;
        }
    }
}
