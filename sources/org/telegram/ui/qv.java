package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qv implements View.OnLongClickListener {
    public final int f40529a;
    public final ey f40530b;

    public qv(ey eyVar, int i10) {
        this.f40529a = i10;
        this.f40530b = eyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        switch (this.f40529a) {
            case 0:
                ey eyVar = this.f40530b;
                ArrayList arrayList = eyVar.I2;
                if (eyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != eyVar.getUserConfig().getClientUserId()) {
                        z12 = false;
                    }
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat chat = eyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z13 = false;
                    }
                }
                if (eyVar.Y3() && eyVar.l3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = eyVar.D2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((MediaController.PhotoEntry) obj).hasVideoEditsLostAsDocument()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = eyVar.D2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(eyVar, view);
                int i14 = R.drawable.msg_sendfile;
                if (z11) {
                    i10 = R.string.SendAsFiles;
                } else {
                    i10 = R.string.SendAsFile;
                }
                H.l(i14, LocaleController.getString(i10), new ev(eyVar, 20), z10);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ev(eyVar, 21), false);
                int i15 = R.drawable.msg_calendar2;
                if (z12) {
                    i11 = R.string.SetReminder;
                } else {
                    i11 = R.string.ScheduleMessage;
                }
                H.l(i15, LocaleController.getString(i11), new org.telegram.ui.Components.b60(10, eyVar, z12), z13);
                H.Z();
                return true;
            case 1:
                ey eyVar2 = this.f40530b;
                eyVar2.p4(eyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f40530b.n4(view);
                return true;
            default:
                ey eyVar3 = this.f40530b;
                eyVar3.getContactsController().loadGlobalPrivacySetting();
                eyVar3.I4();
                return true;
        }
    }
}
