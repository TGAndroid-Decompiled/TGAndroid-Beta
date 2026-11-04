package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zf implements er0, nw {
    public final boolean f52669a;
    public final int f52670b;
    public final Object f52671c;
    public final Object d;

    public zf(wm wmVar, boolean z10, org.telegram.messenger.zi ziVar, int i3) {
        this.f52671c = wmVar;
        this.f52669a = z10;
        this.d = ziVar;
        this.f52670b = i3;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i3;
        wm wmVar = (wm) this.f52671c;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
        if (this.f52669a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = wmVar.getMessagesController().j1(org.telegram.messenger.zi.B0(ziVar.f26868k));
            tL_messages_appendTodoList.msg_id = ziVar.f1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i3 = this.f52670b;
                    if (i10 >= i3) {
                        break;
                    }
                    i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).f27148id);
                    i10++;
                }
                while (i3 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i3);
                    if (todoItem.f27148id <= i11) {
                        todoItem.f27148id = i11 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i11 = Math.max(i11, todoItem.f27148id);
                    i3++;
                }
                TLRPC.MessageMedia messageMedia2 = ziVar.f26868k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            ziVar.f26868k.media = messageMedia;
            wmVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = ziVar.f26868k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        ziVar.f26868k.media = messageMedia;
        wmVar.getSendMessagesHelper().t(ziVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f52671c;
        String str = (String) this.d;
        String str2 = LaunchActivity.E1;
        long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f52669a);
        if (org.telegram.messenger.m5.C(j10)) {
            bundle.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.m5.E(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i11 = this.f52670b;
        if (!org.telegram.messenger.hp.s1(i11).E(bundle, uwVar, null, null)) {
            return true;
        }
        org.telegram.messenger.hs.f(i11).k(org.telegram.messenger.hs.f23305t, new Object[0]);
        org.telegram.messenger.li.b0(i11).Q1(j10, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new wm(bundle), true, false);
        return true;
    }

    public zf(LaunchActivity launchActivity, boolean z10, int i3, String str) {
        this.f52671c = launchActivity;
        this.f52669a = z10;
        this.f52670b = i3;
        this.d = str;
    }
}
