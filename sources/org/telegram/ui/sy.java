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
public final class sy extends s4.v {
    public s4.c1 d;
    public boolean f40636e;
    public boolean f40637f;
    public final ty f40638g;
    public final uy h;

    public sy(uy uyVar, ty tyVar) {
        this.h = uyVar;
        this.f40638g = tyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f40637f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        uy uyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (uyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new gh(1, s2Var), this.f40638g.f40999x.f46622e);
            uyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.c1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        char c10;
        int i10;
        uy uyVar = this.h;
        ArrayList arrayList = uyVar.f41379a1;
        View view = c1Var2.f46531a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && uyVar.p4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ty tyVar = this.f40638g;
                if (tyVar.f40990a.getItemAnimator() == null) {
                    tyVar.f40990a.setItemAnimator(tyVar.f40999x);
                }
                zw zwVar = tyVar.d;
                uy uyVar2 = zwVar.R;
                int i11 = zwVar.F;
                ArrayList a42 = uyVar2.a4(i11, zwVar.h, zwVar.f10712r, false);
                int G = zwVar.G(b10);
                int G2 = zwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) a42.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) a42.get(G2);
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
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20046id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20046id, dialogFilter.pinnedDialogs.get(dialog3.f20046id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20046id, i14);
                }
                Collections.swap(a42, G, G2);
                zwVar.W(null);
                int i15 = uyVar.f41400e0[0].f40997s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        uyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = uyVar.getMessagesController().selectedDialogFilter;
                if (uyVar.f41400e0[0].f40997s == i10) {
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
    public final void p(s4.c1 c1Var, int i10) {
        if (c1Var != null) {
            this.f40638g.f40990a.e1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f46531a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f22883w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        uy uyVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f46531a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ty tyVar = this.f40638g;
            if (isFolderDialogId) {
                qy qyVar = tyVar.f40990a;
                int i12 = qy.C3;
                qyVar.B1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!uyVar.getMessagesController().isPromoDialog(dialogId, false) && uyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    uyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    uyVar.A4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                uyVar.A4(arrayList2, 111, true, false, null);
                return;
            }
            uyVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, tyVar.d.h(), c1Var.b(), 5);
            uyVar.J4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (uyVar.V0 == null) {
                    qy qyVar2 = tyVar.f40990a;
                    ?? obj = new Object();
                    obj.f28946a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f28947b = paint;
                    obj.f28949e = 0L;
                    obj.f28950f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f28948c = qyVar2;
                    uyVar.V0 = obj;
                }
                org.telegram.ui.Components.nd0 nd0Var = uyVar.V0;
                nd0Var.d = a0Var;
                nd0Var.h = 0.0f;
                nd0Var.f28951g = 0.0f;
                nd0Var.f28949e = System.currentTimeMillis();
                nd0Var.f28948c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        uyVar.W0 = null;
    }
}
