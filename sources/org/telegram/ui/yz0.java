package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class yz0 extends ClickableSpan {
    public final TLRPC.TL_username f44015a;
    public final String f44016b;
    public final f01 f44017c;

    public yz0(f01 f01Var, TLRPC.TL_username tL_username, String str) {
        this.f44017c = f01Var;
        this.f44015a = tL_username;
        this.f44016b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f44017c.e;
        TLRPC.TL_username tL_username = this.f44015a;
        if (!tL_username.editable) {
            if (profileActivity.f33960k5 != this) {
                profileActivity.P4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new a50(25, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.P4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f44016b;
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
