package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class zz0 extends ClickableSpan {
    public final TLRPC.TL_username f40883a;
    public final String f40884b;
    public final g01 f40885c;

    public zz0(g01 g01Var, TLRPC.TL_username tL_username, String str) {
        this.f40885c = g01Var;
        this.f40883a = tL_username;
        this.f40884b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f40885c.e;
        TLRPC.TL_username tL_username = this.f40883a;
        if (!tL_username.editable) {
            if (profileActivity.f32069f5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new sb0(18, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f40884b;
        TLRPC.Chat chat = profileActivity.B2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.J.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
