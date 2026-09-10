package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class t10 extends org.telegram.ui.Cells.k7 {
    public final u10 f36812l0;

    public t10(u10 u10Var, Context context) {
        super(context, 1, null);
        this.f36812l0 = u10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        u10 u10Var = this.f36812l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            z10 z10Var = u10Var.v;
            String str = z10Var.Q;
            long j3 = z10Var.E;
            long j10 = z10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, z10Var.f39186y);
            z10 z10Var2 = u10Var.v;
            playlistGlobalSearchParams.endReached = z10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = z10Var2.v;
            playlistGlobalSearchParams.totalCount = z10Var2.O;
            playlistGlobalSearchParams.folderId = z10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(u10Var.v.f39168f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = u10Var.v.f39168f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
