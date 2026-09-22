package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zq0 implements org.telegram.ui.Cells.t5 {
    public final ar0 f40611a;

    public zq0(ar0 ar0Var) {
        this.f40611a = ar0Var;
    }

    public final void a() {
        zn znVar;
        TLRPC.Chat chat;
        cr0 cr0Var = this.f40611a.d;
        if (cr0Var.I && (znVar = cr0Var.U) != null && (chat = znVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && cr0Var.W != 2) {
            org.telegram.ui.Components.d5.u0(cr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (cr0Var.W == 1) {
                cr0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.u5 u5Var) {
        boolean z10;
        int intValue = ((Integer) u5Var.getTag()).intValue();
        cr0 cr0Var = this.f40611a.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = cr0Var.f32855b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && cr0Var.H > 0 && cr0Var.f32855b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey) {
                i10 = cr0Var.f32857c.size();
            }
            u5Var.b(i10, z10, true);
            cr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(cr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f32861f.get(intValue);
            boolean containsKey2 = cr0Var.f32855b.containsKey(searchImage.f15831id);
            z10 = !containsKey2;
            if (!containsKey2 && cr0Var.H > 0 && cr0Var.f32855b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey2) {
                i10 = cr0Var.f32857c.size();
            }
            u5Var.b(i10, z10, true);
            cr0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        cr0Var.i0(i11);
        cr0Var.f32877s0.a();
    }
}
