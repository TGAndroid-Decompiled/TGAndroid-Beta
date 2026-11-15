package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ui extends org.telegram.ui.Components.sn {
    public final an B0;

    public ui(an anVar, Context context, an anVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, anVar2, z10, e6Var);
        this.B0 = anVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        an anVar = this.B0;
        if (!anVar.f45276lb && !anVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
            if (!z10 && anVar.f45253k0 != null && !anVar.H3) {
                if (!anVar.fa() || anVar.f45408w4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        an anVar = this.B0;
        TLRPC.User user = anVar.f45187f;
        if (user != null && user.linked_community_id != 0) {
            anVar.showDialog(new li.d0(anVar, anVar.f45187f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = anVar.f45173e;
        if (chat != null && chat.linked_community_id != 0) {
            anVar.showDialog(new li.d0(anVar, anVar.f45173e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        an anVar = this.B0;
        if (anVar.ea()) {
            str = "";
        } else {
            str = null;
        }
        anVar.Oa(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.f45204g4 == 3) {
            return true;
        }
        return false;
    }
}
