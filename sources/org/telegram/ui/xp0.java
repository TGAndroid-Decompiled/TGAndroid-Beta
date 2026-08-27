package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class xp0 implements org.telegram.ui.Cells.p5 {

    public final yp0 f44592a;

    public xp0(yp0 yp0Var) {
        this.f44592a = yp0Var;
    }

    public final void a() {
        rn rnVar;
        TLRPC.Chat chat;
        aq0 aq0Var = this.f44592a.d;
        if (!aq0Var.E || (rnVar = aq0Var.Q) == null || (chat = rnVar.f42026e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || aq0Var.S == 2) {
            return;
        }
        org.telegram.ui.Components.y4.u0(aq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (aq0Var.S == 1) {
            aq0Var.S = 2;
        }
    }

    @Override
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int iIntValue = ((Integer) q5Var.getTag()).intValue();
        aq0 aq0Var = this.f44592a.d;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        int size = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(iIntValue);
            boolean zContainsKey = aq0Var.f36598b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !zContainsKey;
            if (!zContainsKey && aq0Var.D > 0 && aq0Var.f36598b.size() >= aq0Var.D) {
                a();
                return;
            }
            if (aq0Var.f36603e && !zContainsKey) {
                size = aq0Var.f36600c.size();
            }
            q5Var.b(size, z10, true);
            aq0Var.Y(iIntValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(aq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) aq0Var.f36605f.get(iIntValue);
            boolean zContainsKey2 = aq0Var.f36598b.containsKey(searchImage.f19616id);
            z10 = !zContainsKey2;
            if (!zContainsKey2 && aq0Var.D > 0 && aq0Var.f36598b.size() >= aq0Var.D) {
                a();
                return;
            }
            if (aq0Var.f36603e && !zContainsKey2) {
                size = aq0Var.f36600c.size();
            }
            q5Var.b(size, z10, true);
            aq0Var.Y(iIntValue, searchImage);
        }
        aq0Var.i0(z10 ? 1 : 2);
        aq0Var.f36615o0.a();
    }
}
