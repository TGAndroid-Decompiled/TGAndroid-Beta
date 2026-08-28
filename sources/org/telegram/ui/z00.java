package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class z00 extends org.telegram.ui.Cells.h7 {
    public final a10 f44991h0;

    public z00(a10 a10Var, Context context) {
        super(context, 1, null);
        this.f44991h0 = a10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        a10 a10Var = this.f44991h0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            f10 f10Var = a10Var.v;
            String str = f10Var.M;
            long j10 = f10Var.A;
            long j11 = f10Var.D;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, f10Var.f38108y);
            f10 f10Var2 = a10Var.v;
            playlistGlobalSearchParams.endReached = f10Var2.J;
            playlistGlobalSearchParams.nextSearchRate = f10Var2.v;
            playlistGlobalSearchParams.totalCount = f10Var2.K;
            playlistGlobalSearchParams.folderId = f10Var2.F ? 1 : 0;
            return MediaController.getInstance().setPlaylist(a10Var.v.f38094f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = a10Var.v.f38094f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
