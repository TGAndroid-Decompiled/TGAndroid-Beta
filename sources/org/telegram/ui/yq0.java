package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yq0 implements org.telegram.ui.Cells.s5 {
    public final zq0 f44397a;

    public yq0(zq0 zq0Var) {
        this.f44397a = zq0Var;
    }

    public final void a() {
        zn znVar;
        TLRPC.Chat chat;
        br0 br0Var = this.f44397a.d;
        if (br0Var.I && (znVar = br0Var.U) != null && (chat = znVar.f44751e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && br0Var.W != 2) {
            org.telegram.ui.Components.g5.t0(br0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (br0Var.W == 1) {
                br0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        br0 br0Var = this.f44397a.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = br0Var.f36389b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && br0Var.H > 0 && br0Var.f36389b.size() >= br0Var.H) {
                a();
                return;
            }
            if (br0Var.f36394e && !containsKey) {
                i10 = br0Var.f36391c.size();
            }
            t5Var.b(i10, z10, true);
            br0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(br0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f36396f.get(intValue);
            boolean containsKey2 = br0Var.f36389b.containsKey(searchImage.f17246id);
            z10 = !containsKey2;
            if (!containsKey2 && br0Var.H > 0 && br0Var.f36389b.size() >= br0Var.H) {
                a();
                return;
            }
            if (br0Var.f36394e && !containsKey2) {
                i10 = br0Var.f36391c.size();
            }
            t5Var.b(i10, z10, true);
            br0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        br0Var.i0(i11);
        br0Var.f36412s0.a();
    }
}
