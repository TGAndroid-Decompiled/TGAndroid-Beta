package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qy extends s4.w {
    public s4.d1 d;
    public boolean f41314e;
    public boolean f41315f;
    public final ry f41316g;
    public final sy h;

    public qy(sy syVar, ry ryVar) {
        this.h = syVar;
        this.f41316g = ryVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f41315f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        sy syVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (syVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new nh(1, s2Var), this.f41316g.f41573x.f47875e);
            syVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.d1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qy.e(androidx.recyclerview.widget.RecyclerView, s4.d1):int");
    }

    @Override
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        char c10;
        int i10;
        sy syVar = this.h;
        ArrayList arrayList = syVar.f41920a1;
        View view = d1Var2.f47782a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) syVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && syVar.d4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ry ryVar = this.f41316g;
                if (ryVar.f41564a.getItemAnimator() == null) {
                    ryVar.f41564a.setItemAnimator(ryVar.f41573x);
                }
                zw zwVar = ryVar.d;
                sy syVar2 = zwVar.R;
                int i11 = zwVar.F;
                ArrayList O3 = syVar2.O3(i11, zwVar.h, zwVar.f10721r, false);
                int G = zwVar.G(b10);
                int G2 = zwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) O3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(G2);
                int i12 = zwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (zwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20072id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20072id, dialogFilter.pinnedDialogs.get(dialog3.f20072id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20072id, i14);
                }
                Collections.swap(O3, G, G2);
                zwVar.W(null);
                int i15 = syVar.f41941e0[0].f41571s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        syVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = syVar.getMessagesController().selectedDialogFilter;
                if (syVar.f41941e0[0].f41571s == i10) {
                    c11 = 1;
                }
                MessagesController.DialogFilter dialogFilter2 = dialogFilterArr2[c11];
                if (!arrayList.contains(dialogFilter2)) {
                    arrayList.add(dialogFilter2);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        if (d1Var != null) {
            this.f41316g.f41564a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f47782a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f22903w = false;
            }
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
        int i10;
        sy syVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47782a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ry ryVar = this.f41316g;
            if (isFolderDialogId) {
                oy oyVar = ryVar.f41564a;
                int i12 = oy.f40677t3;
                oyVar.A1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) syVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!syVar.getMessagesController().isPromoDialog(dialogId, false) && syVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    syVar.M2 = i11;
                    syVar.o4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(syVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                syVar.o4(arrayList2, 111, true, false, null);
                return;
            }
            syVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, ryVar.d.h(), d1Var.b(), 5);
            syVar.x4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (syVar.V0 == null) {
                    oy oyVar2 = ryVar.f41564a;
                    ?? obj = new Object();
                    obj.f25323a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f25324b = paint;
                    obj.f25326e = 0L;
                    obj.f25327f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f25325c = oyVar2;
                    syVar.V0 = obj;
                }
                org.telegram.ui.Components.ce0 ce0Var = syVar.V0;
                ce0Var.d = a0Var;
                ce0Var.h = 0.0f;
                ce0Var.f25328g = 0.0f;
                ce0Var.f25326e = System.currentTimeMillis();
                ce0Var.f25325c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        syVar.W0 = null;
    }
}
