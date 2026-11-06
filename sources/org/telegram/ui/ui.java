package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ui extends org.telegram.ui.Components.kn {
    public final an A0;

    public ui(an anVar, Context context, an anVar2, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, anVar2, z9, f6Var);
        this.A0 = anVar;
    }

    @Override
    public final boolean a() {
        boolean z9;
        an anVar = this.A0;
        if (!anVar.f43811ib && !anVar.isInPreviewMode()) {
            z9 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
            if (!z9 && anVar.f43813j0 != null && !anVar.G3) {
                if (!anVar.da() || anVar.f43965v4) {
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
        an anVar = this.A0;
        TLRPC.User user = anVar.f43761f;
        if (user != null && user.linked_community_id != 0) {
            anVar.showDialog(new ii.d0(anVar, anVar.f43761f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = anVar.f43747e;
        if (chat != null && chat.linked_community_id != 0) {
            anVar.showDialog(new ii.d0(anVar, anVar.f43747e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        an anVar = this.A0;
        if (anVar.ca()) {
            str = "";
        } else {
            str = null;
        }
        anVar.La(str);
    }

    @Override
    public final boolean o() {
        if (this.A0.f43766f4 == 3) {
            return true;
        }
        return false;
    }
}
