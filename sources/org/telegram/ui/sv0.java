package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class sv0 extends org.telegram.ui.ActionBar.j {
    public final aw0 f41822a;

    public sv0(aw0 aw0Var) {
        this.f41822a = aw0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        aw0 aw0Var = this.f41822a;
        boolean[] zArr = aw0Var.f36107w;
        CharSequence[] charSequenceArr = aw0Var.v;
        zn znVar = aw0Var.f36087f;
        if (i10 == -1) {
            if (aw0Var.h0(true)) {
                aw0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i18 = 0;
            if (aw0Var.f36084d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.lo.b0(aw0Var.E)};
                i15 = ((org.telegram.ui.ActionBar.n2) aw0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i15).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i19 = 0; i19 < size; i19++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i19);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = aw0Var.H;
                todoList.others_can_complete = aw0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (aw0Var.f36100r != null) {
                    int i20 = 0;
                    i16 = 0;
                    while (true) {
                        int[] iArr = aw0Var.f36100r;
                        if (i20 >= iArr.length) {
                            break;
                        }
                        i16 = Math.max(i16, iArr[i20]);
                        i20++;
                    }
                } else {
                    i16 = 0;
                }
                for (int i21 = 0; i21 < charSequenceArr.length; i21++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.lo.b0(charSequenceArr[i21]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.lo.b0(charSequenceArr[i21])};
                        i17 = ((org.telegram.ui.ActionBar.n2) aw0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i17).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i22);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = aw0Var.f36100r;
                        if (iArr2 != null && i21 < iArr2.length) {
                            todoItem.f20187id = iArr2[i21];
                        } else {
                            i16++;
                            todoItem.f20187id = i16;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (znVar.c()) {
                    org.telegram.ui.Components.g5.K(znVar.getParentActivity(), znVar.a(), new ls0(1, this, tL_messageMediaToDo));
                    return;
                }
                aw0Var.f36086e0.a(tL_messageMediaToDo);
                aw0Var.finishFragment();
            } else if (!aw0Var.L || aw0Var.f36078a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.lo.b0(aw0Var.E)};
                i11 = ((org.telegram.ui.ActionBar.n2) aw0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i11).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i23);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = aw0Var.K;
                tL_poll.quiz = aw0Var.L;
                tL_poll.public_voters = !aw0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(aw0Var.f36095n);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.lo.b0(charSequenceArr[i24]))) {
                        i14 = i18;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i18] = org.telegram.ui.Components.lo.b0(charSequenceArr[i24]);
                        i13 = ((org.telegram.ui.ActionBar.n2) aw0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i13).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i18];
                        int size4 = entities4.size();
                        int i25 = i18;
                        while (i25 < size4) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i25);
                            int i26 = i18;
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                            i25++;
                            i18 = i26;
                        }
                        i14 = i18;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i14] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((aw0Var.K || aw0Var.L) && zArr[i24]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i18 = i14;
                }
                int i27 = i18;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence b02 = org.telegram.ui.Components.lo.b0(aw0Var.F);
                if (b02 != null) {
                    tL_messageMediaPoll.results.solution = b02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i27] = b02;
                    i12 = ((org.telegram.ui.ActionBar.n2) aw0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (znVar.c()) {
                    org.telegram.ui.Components.g5.K(znVar.getParentActivity(), znVar.a(), new ls0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                aw0Var.f36086e0.a(tL_messageMediaPoll);
                aw0Var.finishFragment();
            } else {
                int i28 = 0;
                while (i18 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.lo.b0(charSequenceArr[i18])) && zArr[i18]) {
                        i28++;
                    }
                    i18++;
                }
                if (i28 <= 0) {
                    aw0Var.f36082c.getChildCount();
                    for (int i29 = aw0Var.f36096n0; i29 < aw0Var.f36096n0 + aw0Var.f36111y; i29++) {
                        s4.d1 K = aw0Var.f36082c.K(i29);
                        if (K != null) {
                            View view = K.f47702a;
                            if (view instanceof org.telegram.ui.Cells.d6) {
                                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    aw0Var.h.f(d6Var.getCheckBox(), true);
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
