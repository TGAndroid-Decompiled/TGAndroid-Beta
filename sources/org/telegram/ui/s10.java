package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class s10 extends org.telegram.ui.Cells.i7 {
    public final t10 f41781l0;

    public s10(t10 t10Var, Context context) {
        super(context, 1, null);
        this.f41781l0 = t10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        t10 t10Var = this.f41781l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            y10 y10Var = t10Var.v;
            String str = y10Var.Q;
            long j3 = y10Var.E;
            long j10 = y10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, y10Var.f44273y);
            y10 y10Var2 = t10Var.v;
            playlistGlobalSearchParams.endReached = y10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = y10Var2.v;
            playlistGlobalSearchParams.totalCount = y10Var2.O;
            playlistGlobalSearchParams.folderId = y10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(t10Var.v.f44255f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = t10Var.v.f44255f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
