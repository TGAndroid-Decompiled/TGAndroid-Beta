package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yq0 implements org.telegram.ui.Cells.r5 {
    public final zq0 f43191a;

    public yq0(zq0 zq0Var) {
        this.f43191a = zq0Var;
    }

    public final void a() {
        co coVar;
        TLRPC.Chat chat;
        br0 br0Var = this.f43191a.d;
        if (br0Var.I && (coVar = br0Var.U) != null && (chat = coVar.f35237e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && br0Var.W != 2) {
            org.telegram.ui.Components.e5.u0(br0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (br0Var.W == 1) {
                br0Var.W = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        br0 br0Var = this.f43191a.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = br0Var.f34883b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && br0Var.H > 0 && br0Var.f34883b.size() >= br0Var.H) {
                a();
                return;
            }
            if (br0Var.f34888e && !containsKey) {
                i10 = br0Var.f34885c.size();
            }
            s5Var.b(i10, z10, true);
            br0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(br0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f34890f.get(intValue);
            boolean containsKey2 = br0Var.f34883b.containsKey(searchImage.f17074id);
            z10 = !containsKey2;
            if (!containsKey2 && br0Var.H > 0 && br0Var.f34883b.size() >= br0Var.H) {
                a();
                return;
            }
            if (br0Var.f34888e && !containsKey2) {
                i10 = br0Var.f34885c.size();
            }
            s5Var.b(i10, z10, true);
            br0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        br0Var.i0(i11);
        br0Var.f34906s0.a();
    }
}
