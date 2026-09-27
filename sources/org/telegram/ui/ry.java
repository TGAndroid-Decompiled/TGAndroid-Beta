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
public final class ry extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f37246f;
    public final sy f37247g;
    public final ty h;

    public ry(ty tyVar, sy syVar) {
        this.h = tyVar;
        this.f37247g = syVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f37246f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ty tyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (tyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new mh(1, s2Var), this.f37247g.f37601x.e);
            tyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.c1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ry.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.f37956a1;
        View view = c1Var2.f43005a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && tyVar.p4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                sy syVar = this.f37247g;
                if (syVar.f37593a.getItemAnimator() == null) {
                    syVar.f37593a.setItemAnimator(syVar.f37601x);
                }
                xw xwVar = syVar.d;
                ty tyVar2 = xwVar.R;
                int i11 = xwVar.F;
                ArrayList a42 = tyVar2.a4(i11, xwVar.h, xwVar.f9844r, false);
                int G = xwVar.G(b10);
                int G2 = xwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) a42.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) a42.get(G2);
                int i12 = xwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (xwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f18333id);
                    dialogFilter.pinnedDialogs.put(dialog2.f18333id, dialogFilter.pinnedDialogs.get(dialog3.f18333id));
                    dialogFilter.pinnedDialogs.put(dialog3.f18333id, i14);
                }
                Collections.swap(a42, G, G2);
                xwVar.W(null);
                int i15 = tyVar.f37976e0[0].f37599s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        tyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = tyVar.getMessagesController().selectedDialogFilter;
                if (tyVar.f37976e0[0].f37599s == i10) {
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
            this.f37247g.f37593a.e1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f43005a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f21032w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        ty tyVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f43005a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            sy syVar = this.f37247g;
            if (isFolderDialogId) {
                py pyVar = syVar.f37593a;
                int i12 = py.f36563v3;
                pyVar.A1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!tyVar.getMessagesController().isPromoDialog(dialogId, false) && tyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    tyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    tyVar.A4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(tyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                tyVar.A4(arrayList2, 111, true, false, null);
                return;
            }
            tyVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, syVar.d.h(), c1Var.b(), 5);
            tyVar.J4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (tyVar.V0 == null) {
                    py pyVar2 = syVar.f37593a;
                    ?? obj = new Object();
                    obj.f26025a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26026b = paint;
                    obj.e = 0L;
                    obj.f26028f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f26027c = pyVar2;
                    tyVar.V0 = obj;
                }
                org.telegram.ui.Components.ld0 ld0Var = tyVar.V0;
                ld0Var.d = a0Var;
                ld0Var.h = 0.0f;
                ld0Var.f26029g = 0.0f;
                ld0Var.e = System.currentTimeMillis();
                ld0Var.f26027c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        tyVar.W0 = null;
    }
}
