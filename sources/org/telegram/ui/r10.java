package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class r10 extends org.telegram.ui.Cells.i7 {
    public final s10 f40033l0;

    public r10(s10 s10Var, Context context) {
        super(context, 1, null);
        this.f40033l0 = s10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        s10 s10Var = this.f40033l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            x10 x10Var = s10Var.v;
            String str = x10Var.Q;
            long j3 = x10Var.E;
            long j10 = x10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, x10Var.f42562y);
            x10 x10Var2 = s10Var.v;
            playlistGlobalSearchParams.endReached = x10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = x10Var2.v;
            playlistGlobalSearchParams.totalCount = x10Var2.O;
            playlistGlobalSearchParams.folderId = x10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(s10Var.v.f42544f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = s10Var.v.f42544f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
