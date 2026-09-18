package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zq0 implements org.telegram.ui.Cells.r5 {
    public final ar0 f40332a;

    public zq0(ar0 ar0Var) {
        this.f40332a = ar0Var;
    }

    public final void a() {
        bo boVar;
        TLRPC.Chat chat;
        cr0 cr0Var = this.f40332a.d;
        if (cr0Var.I && (boVar = cr0Var.U) != null && (chat = boVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && cr0Var.W != 2) {
            org.telegram.ui.Components.c5.u0(cr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (cr0Var.W == 1) {
                cr0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        cr0 cr0Var = this.f40332a.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = cr0Var.f32877b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && cr0Var.H > 0 && cr0Var.f32877b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey) {
                i10 = cr0Var.f32879c.size();
            }
            s5Var.b(i10, z10, true);
            cr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(cr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f32883f.get(intValue);
            boolean containsKey2 = cr0Var.f32877b.containsKey(searchImage.f15607id);
            z10 = !containsKey2;
            if (!containsKey2 && cr0Var.H > 0 && cr0Var.f32877b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey2) {
                i10 = cr0Var.f32879c.size();
            }
            s5Var.b(i10, z10, true);
            cr0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        cr0Var.i0(i11);
        cr0Var.f32899s0.a();
    }
}
