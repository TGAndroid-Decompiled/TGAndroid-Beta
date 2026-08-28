package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f42457a;
    public final int f42458b;
    public final Object f42459c;
    public final Object d;

    public rl(int i9, Object obj, Object obj2, int i10) {
        this.f42457a = i10;
        this.f42458b = i9;
        this.f42459c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y01((org.telegram.ui.Components.a11) this.f42459c, (org.telegram.ui.Components.bp) this.d, this.f42458b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f42459c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = org.telegram.ui.Components.i21.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.i21.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.i0(3);
        }
        int i9 = this.f42458b;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i9;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        dy dyVar = ((hx) this.f42459c).f38949b0;
        ArrayList arrayList = dyVar.N1;
        if (arrayList != null && (i9 = this.f42458b) >= 0 && i9 < arrayList.size()) {
            dyVar.N1.add(i9, dialog);
            dyVar.f37629a0[0].q(true);
        }
    }

    private final void e() {
        ay ayVar = (ay) this.f42459c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        cy cyVar = ayVar.f36576g;
        dy dyVar = ayVar.h;
        dyVar.O1 = true;
        dyVar.getMessagesController().addDialogToFolder(dialog.f22384id, 0, this.f42458b, 0L);
        dyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = dyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = dyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                dyVar.A4(true, true);
                cyVar.f37359x.D();
                cyVar.q(true);
                dyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    dyVar.A4(true, true);
                    cyVar.q(true);
                    dyVar.o3();
                    return;
                }
                if (!dyVar.N1.isEmpty()) {
                    dyVar.N1.remove(0);
                }
                cyVar.f37359x.D();
                cyVar.q(true);
                return;
            }
            return;
        }
        cyVar.q(false);
    }

    private final void f() {
        o50 o50Var = (o50) this.f42459c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new gh.x(o50Var, this.f42458b, 6));
        c2VarArr[0].show();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rl.run():void");
    }

    public rl(Object obj, int i9, Object obj2, int i10) {
        this.f42457a = i10;
        this.f42459c = obj;
        this.f42458b = i9;
        this.d = obj2;
    }

    public rl(Object obj, Object obj2, int i9, int i10) {
        this.f42457a = i10;
        this.f42459c = obj;
        this.d = obj2;
        this.f42458b = i9;
    }
}
