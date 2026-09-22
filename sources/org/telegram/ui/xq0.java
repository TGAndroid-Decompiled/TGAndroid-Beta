package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements org.telegram.ui.Cells.s5 {
    public final yq0 f39678a;

    public xq0(yq0 yq0Var) {
        this.f39678a = yq0Var;
    }

    public final void a() {
        bo boVar;
        TLRPC.Chat chat;
        ar0 ar0Var = this.f39678a.d;
        if (ar0Var.I && (boVar = ar0Var.U) != null && (chat = boVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && ar0Var.W != 2) {
            org.telegram.ui.Components.c5.u0(ar0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (ar0Var.W == 1) {
                ar0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        ar0 ar0Var = this.f39678a.d;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = ar0Var.f31895b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && ar0Var.H > 0 && ar0Var.f31895b.size() >= ar0Var.H) {
                a();
                return;
            }
            if (ar0Var.e && !containsKey) {
                i10 = ar0Var.f31897c.size();
            }
            t5Var.b(i10, z10, true);
            ar0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(ar0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) ar0Var.f31901f.get(intValue);
            boolean containsKey2 = ar0Var.f31895b.containsKey(searchImage.f15595id);
            z10 = !containsKey2;
            if (!containsKey2 && ar0Var.H > 0 && ar0Var.f31895b.size() >= ar0Var.H) {
                a();
                return;
            }
            if (ar0Var.e && !containsKey2) {
                i10 = ar0Var.f31897c.size();
            }
            t5Var.b(i10, z10, true);
            ar0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        ar0Var.i0(i11);
        ar0Var.f31917s0.a();
    }
}
