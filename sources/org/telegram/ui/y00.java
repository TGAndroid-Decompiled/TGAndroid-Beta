package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class y00 extends org.telegram.ui.Cells.h7 {
    public final z00 f43308l0;

    public y00(z00 z00Var, Context context) {
        super(context, 1, null);
        this.f43308l0 = z00Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        z00 z00Var = this.f43308l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            e10 e10Var = z00Var.v;
            String str = e10Var.Q;
            long j10 = e10Var.E;
            long j11 = e10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, e10Var.f36520y);
            e10 e10Var2 = z00Var.v;
            playlistGlobalSearchParams.endReached = e10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = e10Var2.v;
            playlistGlobalSearchParams.totalCount = e10Var2.O;
            playlistGlobalSearchParams.folderId = e10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(z00Var.v.f36502f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = z00Var.v.f36502f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
