package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wp0 implements org.telegram.ui.Cells.s5 {
    public final xp0 f44237a;

    public wp0(xp0 xp0Var) {
        this.f44237a = xp0Var;
    }

    public final void a() {
        qn qnVar;
        TLRPC.Chat chat;
        zp0 zp0Var = this.f44237a.d;
        if (zp0Var.E && (qnVar = zp0Var.Q) != null && (chat = qnVar.f41890e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && zp0Var.S != 2) {
            org.telegram.ui.Components.y4.u0(zp0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (zp0Var.S == 1) {
                zp0Var.S = 2;
            }
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        zp0 zp0Var = this.f44237a.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        int i9 = -1;
        int i10 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = zp0Var.f45208b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && zp0Var.D > 0 && zp0Var.f45208b.size() >= zp0Var.D) {
                a();
                return;
            }
            if (zp0Var.f45213e && !containsKey) {
                i9 = zp0Var.f45210c.size();
            }
            t5Var.b(i9, z10, true);
            zp0Var.X(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(zp0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f45215f.get(intValue);
            boolean containsKey2 = zp0Var.f45208b.containsKey(searchImage.f19643id);
            z10 = !containsKey2;
            if (!containsKey2 && zp0Var.D > 0 && zp0Var.f45208b.size() >= zp0Var.D) {
                a();
                return;
            }
            if (zp0Var.f45213e && !containsKey2) {
                i9 = zp0Var.f45210c.size();
            }
            t5Var.b(i9, z10, true);
            zp0Var.X(intValue, searchImage);
        }
        if (!z10) {
            i10 = 2;
        }
        zp0Var.h0(i10);
        zp0Var.f45225o0.a();
    }
}
