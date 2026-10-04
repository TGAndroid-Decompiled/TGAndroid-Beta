package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tq0 implements org.telegram.ui.Cells.s5 {
    public final uq0 f40949a;

    public tq0(uq0 uq0Var) {
        this.f40949a = uq0Var;
    }

    @Override
    public final void a(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        wq0 wq0Var = this.f40949a.d;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = wq0Var.f42602b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && wq0Var.H > 0 && wq0Var.f42602b.size() >= wq0Var.H) {
                b();
                return;
            }
            if (wq0Var.f42607e && !containsKey) {
                i10 = wq0Var.f42604c.size();
            }
            t5Var.b(i10, z10, true);
            wq0Var.X(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(wq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) wq0Var.f42609f.get(intValue);
            boolean containsKey2 = wq0Var.f42602b.containsKey(searchImage.f17255id);
            z10 = !containsKey2;
            if (!containsKey2 && wq0Var.H > 0 && wq0Var.f42602b.size() >= wq0Var.H) {
                b();
                return;
            }
            if (wq0Var.f42607e && !containsKey2) {
                i10 = wq0Var.f42604c.size();
            }
            t5Var.b(i10, z10, true);
            wq0Var.X(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        wq0Var.i0(i11);
        wq0Var.f42625s0.a();
    }

    public final void b() {
        yn ynVar;
        TLRPC.Chat chat;
        wq0 wq0Var = this.f40949a.d;
        if (wq0Var.I && (ynVar = wq0Var.U) != null && (chat = ynVar.f43322e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && wq0Var.W != 2) {
            org.telegram.ui.Components.e5.u0(wq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (wq0Var.W == 1) {
                wq0Var.W = 2;
            }
        }
    }
}
