package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class uv0 extends ClickableSpan {
    public final TLRPC.TL_username f50196a;
    public final String f50197b;
    public final bw0 f50198c;

    public uv0(bw0 bw0Var, TLRPC.TL_username tL_username, String str) {
        this.f50198c = bw0Var;
        this.f50196a = tL_username;
        this.f50197b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f50198c.f44157e;
        TLRPC.TL_username tL_username = this.f50196a;
        if (!tL_username.editable) {
            if (profileActivity.f41790j5 != this) {
                profileActivity.e5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new xy(27, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.e5(null);
        String str = profileActivity.getMessagesController().V2 + "/" + this.f50197b;
        TLRPC.Chat chat = profileActivity.E2;
        if (chat != null && chat.noforwards) {
            return;
        }
        org.telegram.messenger.g0.g(str);
        profileActivity.M.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
