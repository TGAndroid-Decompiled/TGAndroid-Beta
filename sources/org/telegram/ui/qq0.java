package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qq0 implements org.telegram.ui.Cells.s5 {
    public final rq0 f36970a;

    public qq0(rq0 rq0Var) {
        this.f36970a = rq0Var;
    }

    @Override
    public final void a(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        tq0 tq0Var = this.f36970a.d;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = tq0Var.f38189b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && tq0Var.H > 0 && tq0Var.f38189b.size() >= tq0Var.H) {
                b();
                return;
            }
            if (tq0Var.e && !containsKey) {
                i10 = tq0Var.f38191c.size();
            }
            t5Var.b(i10, z10, true);
            tq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(tq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) tq0Var.f38195f.get(intValue);
            boolean containsKey2 = tq0Var.f38189b.containsKey(searchImage.f15826id);
            z10 = !containsKey2;
            if (!containsKey2 && tq0Var.H > 0 && tq0Var.f38189b.size() >= tq0Var.H) {
                b();
                return;
            }
            if (tq0Var.e && !containsKey2) {
                i10 = tq0Var.f38191c.size();
            }
            t5Var.b(i10, z10, true);
            tq0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        tq0Var.i0(i11);
        tq0Var.f38211s0.a();
    }

    public final void b() {
        wn wnVar;
        TLRPC.Chat chat;
        tq0 tq0Var = this.f36970a.d;
        if (tq0Var.I && (wnVar = tq0Var.U) != null && (chat = wnVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && tq0Var.W != 2) {
            org.telegram.ui.Components.e5.u0(tq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (tq0Var.W == 1) {
                tq0Var.W = 2;
            }
        }
    }
}
