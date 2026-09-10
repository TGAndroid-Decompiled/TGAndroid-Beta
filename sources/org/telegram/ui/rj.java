package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class rj extends org.telegram.ui.Components.jo {
    public final eo f36379v0;

    public rj(eo eoVar, Context context, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, eoVar2, z10, f6Var);
        this.f36379v0 = eoVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        eo eoVar = this.f36379v0;
        if (!eoVar.Oa && !eoVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
            if (!z10 && eoVar.f32367j0 != null && !eoVar.f32481s3) {
                if (!eoVar.F9() || eoVar.f32346h4) {
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
        eo eoVar = this.f36379v0;
        TLRPC.User user = eoVar.f32318f;
        if (user != null && user.linked_community_id != 0) {
            eoVar.showDialog(new ei.k0(eoVar, eoVar.f32318f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            eoVar.showDialog(new ei.k0(eoVar, eoVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        eo eoVar = this.f36379v0;
        if (eoVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        eoVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36379v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
