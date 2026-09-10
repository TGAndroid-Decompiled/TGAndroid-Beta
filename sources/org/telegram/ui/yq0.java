package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yq0 implements org.telegram.ui.Cells.s5 {
    public final zq0 f39099a;

    public yq0(zq0 zq0Var) {
        this.f39099a = zq0Var;
    }

    @Override
    public final void a(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        br0 br0Var = this.f39099a.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = br0Var.f31365b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && br0Var.H > 0 && br0Var.f31365b.size() >= br0Var.H) {
                b();
                return;
            }
            if (br0Var.e && !containsKey) {
                i10 = br0Var.f31367c.size();
            }
            t5Var.b(i10, z10, true);
            br0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(br0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f31371f.get(intValue);
            boolean containsKey2 = br0Var.f31365b.containsKey(searchImage.f14639id);
            z10 = !containsKey2;
            if (!containsKey2 && br0Var.H > 0 && br0Var.f31365b.size() >= br0Var.H) {
                b();
                return;
            }
            if (br0Var.e && !containsKey2) {
                i10 = br0Var.f31367c.size();
            }
            t5Var.b(i10, z10, true);
            br0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        br0Var.i0(i11);
        br0Var.f31387s0.a();
    }

    public final void b() {
        eo eoVar;
        TLRPC.Chat chat;
        br0 br0Var = this.f39099a.d;
        if (br0Var.I && (eoVar = br0Var.U) != null && (chat = eoVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && br0Var.W != 2) {
            org.telegram.ui.Components.d5.u0(br0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (br0Var.W == 1) {
                br0Var.W = 2;
            }
        }
    }
}
