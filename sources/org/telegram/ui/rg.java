package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rg implements ys0, tx {
    public final boolean f41083a;
    public final int f41084b;
    public final Object f41085c;
    public final Object d;

    public rg(un unVar, boolean z10, org.telegram.messenger.kj kjVar, int i10) {
        this.f41085c = unVar;
        this.f41083a = z10;
        this.d = kjVar;
        this.f41084b = i10;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        un unVar = (un) this.f41085c;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.d;
        if (this.f41083a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = unVar.getMessagesController().i1(org.telegram.messenger.kj.B0(kjVar.f16690k));
            tL_messages_appendTodoList.msg_id = kjVar.f1();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f41084b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f19941id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f19941id <= i12) {
                        todoItem.f19941id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f19941id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = kjVar.f16690k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            kjVar.f16690k.media = messageMedia;
            unVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = kjVar.f16690k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        kjVar.f16690k.media = messageMedia;
        unVar.getSendMessagesHelper().t(kjVar, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41085c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.D1;
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f41083a);
        if (org.telegram.messenger.o5.C(j10)) {
            bundle.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f41084b;
        if (!org.telegram.messenger.wp.r1(i12).E(bundle, zxVar, null, null)) {
            return true;
        }
        org.telegram.messenger.at.f(i12).k(org.telegram.messenger.at.f14786t, new Object[0]);
        org.telegram.messenger.vi.b0(i12).Q1(j10, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).U(new un(bundle), true, false);
        return true;
    }

    public rg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f41085c = launchActivity;
        this.f41083a = z10;
        this.f41084b = i10;
        this.d = str;
    }
}
