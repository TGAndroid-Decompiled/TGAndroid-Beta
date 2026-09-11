package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yg implements yv0, oy {
    public final boolean f43105a;
    public final int f43106b;
    public final Object f43107c;
    public final Object d;

    public yg(co coVar, boolean z10, MessageObject messageObject, int i10) {
        this.f43107c = coVar;
        this.f43105a = z10;
        this.d = messageObject;
        this.f43106b = i10;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        int i10;
        co coVar = (co) this.f43107c;
        MessageObject messageObject = (MessageObject) this.d;
        if (this.f43105a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = coVar.getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_appendTodoList.msg_id = messageObject.getId();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f43106b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f20014id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f20014id <= i12) {
                        todoItem.f20014id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f20014id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            coVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        coVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f43107c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.B1;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f43105a);
        if (DialogObject.isEncryptedDialog(j3)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
        } else if (DialogObject.isUserDialog(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i12 = this.f43106b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, uyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j3, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new co(bundle), true, false);
        }
        return true;
    }

    public yg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f43107c = launchActivity;
        this.f43105a = z10;
        this.f43106b = i10;
        this.d = str;
    }
}
