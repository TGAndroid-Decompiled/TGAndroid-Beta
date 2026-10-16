package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uj extends org.telegram.ui.Components.ro {
    public final fo f40417v0;

    public uj(fo foVar, Context context, fo foVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, foVar2, z10, c6Var);
        this.f40417v0 = foVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        fo foVar = this.f40417v0;
        if (!foVar.Pa && !foVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.m2) foVar).inBubbleMode;
            if (!z10 && foVar.f35684j0 != null && !foVar.f35799s3) {
                if (!foVar.K9() || foVar.f35665h4) {
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
        fo foVar = this.f40417v0;
        TLRPC.User user = foVar.f35636f;
        if (user != null && user.linked_community_id != 0) {
            foVar.showDialog(new gi.k0(foVar, foVar.f35636f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            foVar.showDialog(new gi.k0(foVar, foVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        fo foVar = this.f40417v0;
        if (foVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        foVar.qa(str);
    }

    @Override
    public final boolean o() {
        if (this.f40417v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
