package vf;

import android.text.TextUtils;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_account;
public final class p {
    public TL_account.TL_businessChatLink f49165a;

    public final boolean equals(Object obj) {
        TL_account.TL_businessChatLink tL_businessChatLink = this.f49165a;
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = ((p) obj).f49165a;
            if (tL_businessChatLink.views == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && MediaDataController.entitiesEqual(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                return true;
            }
        }
        return false;
    }
}
