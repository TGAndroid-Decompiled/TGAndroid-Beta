package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends org.telegram.ui.ActionBar.k {
    public final at0 f41641a;

    public ss0(at0 at0Var) {
        this.f41641a = at0Var;
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
        at0 at0Var = this.f41641a;
        boolean[] zArr = at0Var.f35739x;
        CharSequence[] charSequenceArr = at0Var.f35737w;
        un unVar = at0Var.f35717f;
        if (i10 == -1) {
            if (at0Var.l0(true)) {
                at0Var.finishFragment();
            }
        } else if (i10 == 1) {
            int i18 = 0;
            if (at0Var.f35715d0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.jn.b0(at0Var.E)};
                i15 = ((org.telegram.ui.ActionBar.k2) at0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.ui.b0(i15).W(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = W.size();
                for (int i19 = 0; i19 < size; i19++) {
                    TLRPC.MessageEntity messageEntity = W.get(i19);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = at0Var.H;
                todoList.others_can_complete = at0Var.J;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                if (at0Var.f35730r != null) {
                    int i20 = 0;
                    i16 = 0;
                    while (true) {
                        int[] iArr = at0Var.f35730r;
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
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i21]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.jn.b0(charSequenceArr[i21])};
                        i17 = ((org.telegram.ui.ActionBar.k2) at0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.ui.b0(i17).W(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = W2.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            TLRPC.MessageEntity messageEntity2 = W2.get(i22);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = W2;
                        int[] iArr2 = at0Var.f35730r;
                        if (iArr2 != null && i21 < iArr2.length) {
                            todoItem.f19940id = iArr2[i21];
                        } else {
                            i16++;
                            todoItem.f19940id = i16;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (unVar.c()) {
                    org.telegram.ui.Components.s4.K(unVar.getParentActivity(), unVar.a(), new ep0(4, this, tL_messageMediaToDo));
                    return;
                }
                at0Var.f35716e0.a(tL_messageMediaToDo);
                at0Var.finishFragment();
            } else if (!at0Var.L || at0Var.f35709a.getAlpha() == 1.0f) {
                CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.jn.b0(at0Var.E)};
                i11 = ((org.telegram.ui.ActionBar.k2) at0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.ui.b0(i11).W(charSequenceArr4, true, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = W3.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    TLRPC.MessageEntity messageEntity3 = W3.get(i23);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = at0Var.K;
                tL_poll.quiz = at0Var.L;
                tL_poll.public_voters = !at0Var.G;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = W3;
                ArrayList arrayList = new ArrayList(at0Var.f35725n);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i24]))) {
                        i14 = i18;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i18] = org.telegram.ui.Components.jn.b0(charSequenceArr[i24]);
                        i13 = ((org.telegram.ui.ActionBar.k2) at0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.ui.b0(i13).W(charSequenceArr5, true, true);
                        CharSequence charSequence4 = charSequenceArr5[i18];
                        int size4 = W4.size();
                        int i25 = i18;
                        while (i25 < size4) {
                            TLRPC.MessageEntity messageEntity4 = W4.get(i25);
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
                        tL_pollAnswer.text.entities = W4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i14] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((at0Var.K || at0Var.L) && zArr[i24]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i18 = i14;
                }
                int i27 = i18;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence b02 = org.telegram.ui.Components.jn.b0(at0Var.F);
                if (b02 != null) {
                    tL_messageMediaPoll.results.solution = b02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i27] = b02;
                    i12 = ((org.telegram.ui.ActionBar.k2) at0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.ui.b0(i12).W(charSequenceArr6, true, true);
                    if (W5 != null && !W5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = W5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (unVar.c()) {
                    org.telegram.ui.Components.s4.K(unVar.getParentActivity(), unVar.a(), new ep0(this, tL_messageMediaPoll, arrayList));
                    return;
                }
                at0Var.f35716e0.a(tL_messageMediaPoll);
                at0Var.finishFragment();
            } else {
                int i28 = 0;
                while (i18 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i18])) && zArr[i18]) {
                        i28++;
                    }
                    i18++;
                }
                if (i28 <= 0) {
                    for (int i29 = at0Var.f35726n0; i29 < at0Var.f35726n0 + at0Var.D; i29++) {
                        s4.c1 K = at0Var.f35713c.K(i29);
                        if (K != null) {
                            View view = K.f47898a;
                            if (view instanceof org.telegram.ui.Cells.e6) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                                if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f)) {
                                    at0Var.h.f(e6Var.getCheckBox(), true);
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
