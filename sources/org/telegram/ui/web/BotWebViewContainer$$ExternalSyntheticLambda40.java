package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.TopicsFragment;

public final class BotWebViewContainer$$ExternalSyntheticLambda40 implements MultiContactsSelectorBottomSheet.SelectorListener, DialogsActivity.DialogsActivityDelegate {
    public final BotWebViewContainer f$0;
    public final boolean[] f$1;
    public final String f$2;
    public final TL_keyboard.TL_buttonTypeRequestPeer f$3;

    public BotWebViewContainer$$ExternalSyntheticLambda40(BotWebViewContainer botWebViewContainer, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f$0 = botWebViewContainer;
        this.f$1 = zArr;
        this.f$2 = str;
        this.f$3 = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        BotWebViewContainer botWebViewContainer = this.f$0;
        botWebViewContainer.getClass();
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            this.f$1[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            MessagesController.getInstance(botWebViewContainer.currentAccount);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
            String str = this.f$2;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.f$3.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(botWebViewContainer.currentAccount).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new BotWebViewContainer$$ExternalSyntheticLambda28(botWebViewContainer, str, 2));
        }
        dialogsActivity.finishFragment();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onUserSelected(ArrayList arrayList) {
        BotWebViewContainer botWebViewContainer = this.f$0;
        botWebViewContainer.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        this.f$1[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        MessagesController.getInstance(botWebViewContainer.currentAccount);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
        String str = this.f$2;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.f$3.button_id;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(botWebViewContainer.currentAccount).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new BotWebViewContainer$$ExternalSyntheticLambda28(botWebViewContainer, str, 1));
    }
}
