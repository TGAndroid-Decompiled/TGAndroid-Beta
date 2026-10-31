package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class qx0 extends ClickableSpan {
    public final TLRPC.TL_username f41083a;
    public final String f41084b;
    public final xx0 f41085c;

    public qx0(xx0 xx0Var, TLRPC.TL_username tL_username, String str) {
        this.f41085c = xx0Var;
        this.f41083a = tL_username;
        this.f41084b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f41085c.e;
        TLRPC.TL_username tL_username = this.f41083a;
        if (!tL_username.editable) {
            if (profileActivity.f33836i5 != this) {
                profileActivity.d5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new ul0(8, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.d5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.f41084b;
        TLRPC.Chat chat = profileActivity.D2;
        if (chat != null && chat.noforwards) {
            return;
        }
        org.telegram.messenger.i0.g(str);
        profileActivity.L.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
