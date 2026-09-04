package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class t01 extends ClickableSpan {
    public final TLRPC.TL_username f40584a;
    public final String f40585b;
    public final a11 f40586c;

    public t01(a11 a11Var, TLRPC.TL_username tL_username, String str) {
        this.f40586c = a11Var;
        this.f40584a = tL_username;
        this.f40585b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f40586c.f34291e;
        TLRPC.TL_username tL_username = this.f40584a;
        if (!tL_username.editable) {
            if (profileActivity.f33921i5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new bc0(18, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f40585b;
        TLRPC.Chat chat = profileActivity.E2;
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
