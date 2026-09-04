package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class rv0 extends org.telegram.ui.ActionBar.j {
    public final zv0 f40246a;

    public rv0(zv0 zv0Var) {
        this.f40246a = zv0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zv0 zv0Var = this.f40246a;
        boolean[] zArr = zv0Var.f43556w;
        CharSequence[] charSequenceArr = zv0Var.v;
        co coVar = zv0Var.f43536f;
        if (i10 == -1) {
            if (zv0Var.h0(true)) {
                zv0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i17 = 0;
            if (zv0Var.f43533d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.tn.Y(zv0Var.E)};
                i14 = ((org.telegram.ui.ActionBar.n2) zv0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i18 = 0; i18 < size; i18++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i18);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = zv0Var.H;
                todoList.others_can_complete = zv0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (zv0Var.f43549r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = zv0Var.f43549r;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        i15 = Math.max(i15, iArr[i19]);
                        i19++;
                    }
                } else {
                    i15 = 0;
                }
                for (int i20 = 0; i20 < charSequenceArr.length; i20++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.tn.Y(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.tn.Y(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.n2) zv0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i16).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i21);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = zv0Var.f43549r;
                        if (iArr2 != null && i20 < iArr2.length) {
                            todoItem.f20014id = iArr2[i20];
                        } else {
                            i15++;
                            todoItem.f20014id = i15;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (coVar.c()) {
                    org.telegram.ui.Components.e5.L(coVar.getParentActivity(), coVar.a(), new qv0(0, this, tL_messageMediaToDo));
                    return;
                }
                zv0Var.f43535e0.b(tL_messageMediaToDo);
                zv0Var.finishFragment();
            } else if (!zv0Var.L || zv0Var.f43527a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.tn.Y(zv0Var.E)};
                i11 = ((org.telegram.ui.ActionBar.n2) zv0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i11).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i22 = 0; i22 < size3; i22++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i22);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = zv0Var.K;
                tL_poll.quiz = zv0Var.L;
                tL_poll.public_voters = !zv0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(zv0Var.f43544n);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.tn.Y(charSequenceArr[i23]))) {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i17] = org.telegram.ui.Components.tn.Y(charSequenceArr[i23]);
                        i13 = ((org.telegram.ui.ActionBar.n2) zv0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i13).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i17];
                        int size4 = entities4.size();
                        for (int i24 = 0; i24 < size4; i24++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i24);
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        tL_pollAnswer.option = r10;
                        byte[] bArr = {(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((zv0Var.K || zv0Var.L) && zArr[i23]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i17 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = org.telegram.ui.Components.tn.Y(zv0Var.F);
                if (Y != null) {
                    tL_messageMediaPoll.results.solution = Y.toString();
                    CharSequence[] charSequenceArr6 = {Y};
                    i12 = ((org.telegram.ui.ActionBar.n2) zv0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (coVar.c()) {
                    org.telegram.ui.Components.e5.L(coVar.getParentActivity(), coVar.a(), new qv0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                zv0Var.f43535e0.b(tL_messageMediaPoll);
                zv0Var.finishFragment();
            } else {
                int i25 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.tn.Y(charSequenceArr[i17])) && zArr[i17]) {
                        i25++;
                    }
                    i17++;
                }
                if (i25 <= 0) {
                    zv0Var.f43531c.getChildCount();
                    for (int i26 = zv0Var.f43545n0; i26 < zv0Var.f43545n0 + zv0Var.f43560y; i26++) {
                        s4.c1 K = zv0Var.f43531c.K(i26);
                        if (K != null) {
                            View view = K.f45738a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    zv0Var.h.f(c6Var.getCheckBox(), true);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
}
