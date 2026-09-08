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
    public boolean f40595e;
    public boolean f40596f;
    public final ty f40597g;
    public final uy h;

    public sy(uy uyVar, ty tyVar) {
        this.h = uyVar;
        this.f40597g = tyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f40596f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        uy uyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (uyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new jh(1, r2Var), this.f40597g.f40894x.f45857e);
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
        ArrayList arrayList = uyVar.f41265a1;
        View view = c1Var2.f45766a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && uyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ty tyVar = this.f40597g;
                if (tyVar.f40885a.getItemAnimator() == null) {
                    tyVar.f40885a.setItemAnimator(tyVar.f40894x);
                }
                bx bxVar = tyVar.d;
                uy uyVar2 = bxVar.R;
                int i11 = bxVar.F;
                ArrayList R3 = uyVar2.R3(i11, bxVar.h, bxVar.f11198r, false);
                int G = bxVar.G(b10);
                int G2 = bxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = bxVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (bxVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f19900id);
                    dialogFilter.pinnedDialogs.put(dialog2.f19900id, dialogFilter.pinnedDialogs.get(dialog3.f19900id));
                    dialogFilter.pinnedDialogs.put(dialog3.f19900id, i14);
                }
                Collections.swap(R3, G, G2);
                bxVar.W(null);
                int i15 = uyVar.f41286e0[0].f40892s;
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
                if (uyVar.f41286e0[0].f40892s == i10) {
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
            this.f40597g.f40885a.c1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f45766a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f22670w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        uy uyVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f45766a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ty tyVar = this.f40597g;
            if (isFolderDialogId) {
                qy qyVar = tyVar.f40885a;
                int i12 = qy.f40025v3;
                qyVar.y1(false, r2Var);
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
                    uyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                uyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            uyVar.W0 = r2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, tyVar.d.h(), c1Var.b(), 5);
            uyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (uyVar.V0 == null) {
                    qy qyVar2 = tyVar.f40885a;
                    ?? obj = new Object();
                    obj.f24699a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f24700b = paint;
                    obj.f24702e = 0L;
                    obj.f24703f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f24701c = qyVar2;
                    uyVar.V0 = obj;
                }
                org.telegram.ui.Components.bd0 bd0Var = uyVar.V0;
                bd0Var.d = a0Var;
                bd0Var.h = 0.0f;
                bd0Var.f24704g = 0.0f;
                bd0Var.f24702e = System.currentTimeMillis();
                bd0Var.f24701c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        uyVar.W0 = null;
    }
}
