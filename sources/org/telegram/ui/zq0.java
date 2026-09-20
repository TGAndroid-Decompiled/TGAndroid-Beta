package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zq0 implements org.telegram.ui.Cells.t5 {
    public final ar0 f40590a;

    public zq0(ar0 ar0Var) {
        this.f40590a = ar0Var;
    }

    @Override
    public final void a(org.telegram.ui.Cells.u5 u5Var) {
        boolean z10;
        int intValue = ((Integer) u5Var.getTag()).intValue();
        cr0 cr0Var = this.f40590a.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = cr0Var.f32834b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && cr0Var.H > 0 && cr0Var.f32834b.size() >= cr0Var.H) {
                b();
                return;
            }
            if (cr0Var.e && !containsKey) {
                i10 = cr0Var.f32836c.size();
            }
            u5Var.b(i10, z10, true);
            cr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(cr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f32840f.get(intValue);
            boolean containsKey2 = cr0Var.f32834b.containsKey(searchImage.f15816id);
            z10 = !containsKey2;
            if (!containsKey2 && cr0Var.H > 0 && cr0Var.f32834b.size() >= cr0Var.H) {
                b();
                return;
            }
            if (cr0Var.e && !containsKey2) {
                i10 = cr0Var.f32836c.size();
            }
            u5Var.b(i10, z10, true);
            cr0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        cr0Var.i0(i11);
        cr0Var.f32856s0.a();
    }

    public final void b() {
        zn znVar;
        TLRPC.Chat chat;
        cr0 cr0Var = this.f40590a.d;
        if (cr0Var.I && (znVar = cr0Var.U) != null && (chat = znVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && cr0Var.W != 2) {
            org.telegram.ui.Components.d5.u0(cr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (cr0Var.W == 1) {
                cr0Var.W = 2;
            }
        }
    }
}
