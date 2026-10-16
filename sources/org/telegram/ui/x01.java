package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class x01 extends ClickableSpan {
    public final TLRPC.TL_username f41394a;
    public final String f41395b;
    public final e11 f41396c;

    public x01(e11 e11Var, TLRPC.TL_username tL_username, String str) {
        this.f41396c = e11Var;
        this.f41394a = tL_username;
        this.f41395b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f41396c.e;
        TLRPC.TL_username tL_username = this.f41394a;
        if (!tL_username.editable) {
            if (profileActivity.f32294i5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new ec0(18, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f41395b;
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
