package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class v10 extends org.telegram.ui.Cells.i7 {
    public final w10 f40543l0;

    public v10(w10 w10Var, Context context) {
        super(context, 1, null);
        this.f40543l0 = w10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        w10 w10Var = this.f40543l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            b20 b20Var = w10Var.v;
            String str = b20Var.Q;
            long j10 = b20Var.E;
            long j11 = b20Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, b20Var.f34187y);
            b20 b20Var2 = w10Var.v;
            playlistGlobalSearchParams.endReached = b20Var2.N;
            playlistGlobalSearchParams.nextSearchRate = b20Var2.v;
            playlistGlobalSearchParams.totalCount = b20Var2.O;
            playlistGlobalSearchParams.folderId = b20Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(w10Var.v.f34169f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = w10Var.v.f34169f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
