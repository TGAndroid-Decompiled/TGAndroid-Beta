package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class qu0 extends org.telegram.ui.ActionBar.j {

    public final yu0 f41747a;

    public qu0(yu0 yu0Var) {
        this.f41747a = yu0Var;
    }

    @Override
    public final void b(int i10) {
        int iMax;
        yu0 yu0Var = this.f41747a;
        boolean[] zArr = yu0Var.f44945w;
        CharSequence[] charSequenceArr = yu0Var.v;
        rn rnVar = yu0Var.f44925f;
        if (i10 == -1) {
            if (yu0Var.h0(true)) {
                yu0Var.finishFragment();
                return;
            }
            return;
        }
        if (i10 == 1) {
            int i11 = 0;
            if (yu0Var.Z) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.in.Y(yu0Var.A)};
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) yu0Var).currentAccount).getEntities(charSequenceArr2, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = entities.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i12);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = yu0Var.D;
                todoList.others_can_complete = yu0Var.F;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = entities;
                if (yu0Var.f44938r != null) {
                    int i13 = 0;
                    iMax = 0;
                    while (true) {
                        int[] iArr = yu0Var.f44938r;
                        if (i13 >= iArr.length) {
                            break;
                        }
                        iMax = Math.max(iMax, iArr[i13]);
                        i13++;
                    }
                } else {
                    iMax = 0;
                }
                for (int i14 = 0; i14 < charSequenceArr.length; i14++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i14]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.in.Y(charSequenceArr[i14])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) yu0Var).currentAccount).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = entities2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i15);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        int[] iArr2 = yu0Var.f44938r;
                        if (iArr2 == null || i14 >= iArr2.length) {
                            iMax++;
                            todoItem.f22525id = iMax;
                        } else {
                            todoItem.f22525id = iArr2[i14];
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (rnVar.c()) {
                    org.telegram.ui.Components.y4.L(rnVar.getParentActivity(), rnVar.a(), new nl0(9, this, tL_messageMediaToDo));
                    return;
                } else {
                    yu0Var.f44917a0.b(tL_messageMediaToDo);
                    yu0Var.finishFragment();
                    return;
                }
            }
            if (yu0Var.H && yu0Var.f44916a.getAlpha() != 1.0f) {
                int i16 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i11])) && zArr[i11]) {
                        i16++;
                    }
                    i11++;
                }
                if (i16 <= 0) {
                    yu0Var.f44920c.getChildCount();
                    for (int i17 = yu0Var.f44930j0; i17 < yu0Var.f44930j0 + yu0Var.f44949y; i17++) {
                        f2.o1 o1VarK = yu0Var.f44920c.K(i17);
                        if (o1VarK != null) {
                            View view = o1VarK.f5789a;
                            if (view instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                if (z5Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                    yu0Var.h.f(z5Var.getCheckBox(), true);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.in.Y(yu0Var.A)};
            ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) yu0Var).currentAccount).getEntities(charSequenceArr4, true);
            CharSequence charSequence3 = charSequenceArr4[0];
            int size3 = entities3.size();
            for (int i18 = 0; i18 < size3; i18++) {
                TLRPC.MessageEntity messageEntity3 = entities3.get(i18);
                if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                    messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                }
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
            TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
            tL_messageMediaPoll.poll = tL_poll;
            tL_poll.multiple_choice = yu0Var.G;
            tL_poll.quiz = yu0Var.H;
            tL_poll.public_voters = !yu0Var.C;
            tL_poll.question = new TLRPC.TL_textWithEntities();
            tL_messageMediaPoll.poll.question.text = charSequence3.toString();
            tL_messageMediaPoll.poll.question.entities = entities3;
            ArrayList arrayList = new ArrayList(yu0Var.f44933n);
            int i19 = 0;
            while (i19 < charSequenceArr.length) {
                if (!TextUtils.isEmpty(org.telegram.ui.Components.in.Y(charSequenceArr[i19]))) {
                    CharSequence[] charSequenceArr5 = new CharSequence[1];
                    charSequenceArr5[i11] = org.telegram.ui.Components.in.Y(charSequenceArr[i19]);
                    ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) yu0Var).currentAccount).getEntities(charSequenceArr5, true);
                    CharSequence charSequence4 = charSequenceArr5[i11];
                    int size4 = entities4.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        TLRPC.MessageEntity messageEntity4 = entities4.get(i20);
                        if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                            messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                        }
                    }
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_pollAnswer.text = tL_textWithEntities2;
                    tL_textWithEntities2.text = charSequence4.toString();
                    tL_pollAnswer.text.entities = entities4;
                    tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                    if ((yu0Var.G || yu0Var.H) && zArr[i19]) {
                        arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                    }
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                }
                i19++;
                i11 = 0;
            }
            tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
            CharSequence charSequenceY = org.telegram.ui.Components.in.Y(yu0Var.B);
            if (charSequenceY != null) {
                tL_messageMediaPoll.results.solution = charSequenceY.toString();
                ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) yu0Var).currentAccount).getEntities(new CharSequence[]{charSequenceY}, true);
                if (entities5 != null && !entities5.isEmpty()) {
                    tL_messageMediaPoll.results.solution_entities = entities5;
                }
                if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                    tL_messageMediaPoll.results.flags |= 16;
                }
            }
            if (rnVar.c()) {
                org.telegram.ui.Components.y4.L(rnVar.getParentActivity(), rnVar.a(), new nl0(this, tL_messageMediaPoll, arrayList));
            } else {
                yu0Var.f44917a0.b(tL_messageMediaPoll);
                yu0Var.finishFragment();
            }
        }
    }
}
