package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zu0 extends org.telegram.ui.ActionBar.j {
    public final hv0 f43790a;

    public zu0(hv0 hv0Var) {
        this.f43790a = hv0Var;
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
        hv0 hv0Var = this.f43790a;
        boolean[] zArr = hv0Var.f37652w;
        CharSequence[] charSequenceArr = hv0Var.v;
        sn snVar = hv0Var.f37632f;
        if (i10 == -1) {
            if (hv0Var.h0(true)) {
                hv0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i18 = 0;
            if (hv0Var.f37630d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.fo.b0(hv0Var.E)};
                i15 = ((org.telegram.ui.ActionBar.n2) hv0Var).currentAccount;
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
                todoList.others_can_append = hv0Var.H;
                todoList.others_can_complete = hv0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (hv0Var.f37645r != null) {
                    int i20 = 0;
                    i16 = 0;
                    while (true) {
                        int[] iArr = hv0Var.f37645r;
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
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(charSequenceArr[i21]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.fo.b0(charSequenceArr[i21])};
                        i17 = ((org.telegram.ui.ActionBar.n2) hv0Var).currentAccount;
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
                        int[] iArr2 = hv0Var.f37645r;
                        if (iArr2 != null && i21 < iArr2.length) {
                            todoItem.f20417id = iArr2[i21];
                        } else {
                            i16++;
                            todoItem.f20417id = i16;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (snVar.c()) {
                    org.telegram.ui.Components.f5.K(snVar.getParentActivity(), snVar.a(), new gn0(5, this, tL_messageMediaToDo));
                    return;
                }
                hv0Var.f37631e0.b(tL_messageMediaToDo);
                hv0Var.finishFragment();
            } else if (!hv0Var.L || hv0Var.f37624a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.fo.b0(hv0Var.E)};
                i11 = ((org.telegram.ui.ActionBar.n2) hv0Var).currentAccount;
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
                tL_poll.multiple_choice = hv0Var.K;
                tL_poll.quiz = hv0Var.L;
                tL_poll.public_voters = !hv0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(hv0Var.f37640n);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(charSequenceArr[i24]))) {
                        i14 = i18;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i18] = org.telegram.ui.Components.fo.b0(charSequenceArr[i24]);
                        i13 = ((org.telegram.ui.ActionBar.n2) hv0Var).currentAccount;
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
                        if ((hv0Var.K || hv0Var.L) && zArr[i24]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i18 = i14;
                }
                int i27 = i18;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence b02 = org.telegram.ui.Components.fo.b0(hv0Var.F);
                if (b02 != null) {
                    tL_messageMediaPoll.results.solution = b02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i27] = b02;
                    i12 = ((org.telegram.ui.ActionBar.n2) hv0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i12).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (snVar.c()) {
                    org.telegram.ui.Components.f5.K(snVar.getParentActivity(), snVar.a(), new gn0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                hv0Var.f37631e0.b(tL_messageMediaPoll);
                hv0Var.finishFragment();
            } else {
                int i28 = 0;
                while (i18 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.fo.b0(charSequenceArr[i18])) && zArr[i18]) {
                        i28++;
                    }
                    i18++;
                }
                if (i28 <= 0) {
                    hv0Var.f37628c.getChildCount();
                    for (int i29 = hv0Var.f37641n0; i29 < hv0Var.f37641n0 + hv0Var.f37656y; i29++) {
                        s4.b1 K = hv0Var.f37628c.K(i29);
                        if (K != null) {
                            View view = K.f45910a;
                            if (view instanceof org.telegram.ui.Cells.c6) {
                                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    hv0Var.h.f(c6Var.getCheckBox(), true);
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
