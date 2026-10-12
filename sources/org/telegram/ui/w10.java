package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class w10 extends org.telegram.ui.Cells.j7 {
    public final x10 f41125l0;

    public w10(x10 x10Var, Context context) {
        super(context, 1, null);
        this.f41125l0 = x10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        x10 x10Var = this.f41125l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            c20 c20Var = x10Var.v;
            String str = c20Var.Q;
            long j10 = c20Var.E;
            long j11 = c20Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, c20Var.f34705y);
            c20 c20Var2 = x10Var.v;
            playlistGlobalSearchParams.endReached = c20Var2.N;
            playlistGlobalSearchParams.nextSearchRate = c20Var2.v;
            playlistGlobalSearchParams.totalCount = c20Var2.O;
            playlistGlobalSearchParams.folderId = c20Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(x10Var.v.f34687f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = x10Var.v.f34687f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
