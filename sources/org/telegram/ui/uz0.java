package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class uz0 extends ClickableSpan {
    public final TLRPC.TL_username f42071a;
    public final String f42072b;
    public final b01 f42073c;

    public uz0(b01 b01Var, TLRPC.TL_username tL_username, String str) {
        this.f42073c = b01Var;
        this.f42071a = tL_username;
        this.f42072b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f42073c.e;
        TLRPC.TL_username tL_username = this.f42071a;
        if (!tL_username.editable) {
            if (profileActivity.f33652k5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new x40(25, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f42072b;
        TLRPC.Chat chat = profileActivity.F2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.M.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
