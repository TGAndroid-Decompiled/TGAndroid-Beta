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
public final class zx extends s4.w {
    public s4.e1 d;
    public boolean e;
    public boolean f46381f;
    public final ay f46382g;
    public final cy h;

    public zx(cy cyVar, ay ayVar) {
        this.h = cyVar;
        this.f46382g = ayVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f46381f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        cy cyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (cyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, p2Var), this.f46382g.f37921x.e);
            cyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.e1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.e(androidx.recyclerview.widget.RecyclerView, s4.e1):int");
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
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        char c10;
        int i10;
        cy cyVar = this.h;
        ArrayList arrayList = cyVar.f38566a1;
        View view = e1Var2.f47738a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && cyVar.o4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                ay ayVar = this.f46382g;
                if (ayVar.f37913a.getItemAnimator() == null) {
                    ayVar.f37913a.setItemAnimator(ayVar.f37921x);
                }
                gw gwVar = ayVar.d;
                cy cyVar2 = gwVar.R;
                int i11 = gwVar.F;
                ArrayList Z3 = cyVar2.Z3(i11, gwVar.h, gwVar.f14173r, false);
                int H = gwVar.H(b10);
                int H2 = gwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) Z3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) Z3.get(H2);
                int i12 = gwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (gwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f22031id);
                    dialogFilter.pinnedDialogs.put(dialog2.f22031id, dialogFilter.pinnedDialogs.get(dialog3.f22031id));
                    dialogFilter.pinnedDialogs.put(dialog3.f22031id, i14);
                }
                Collections.swap(Z3, H, H2);
                gwVar.X(null);
                int i15 = cyVar.f38586e0[0].f37919s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        cyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = cyVar.getMessagesController().selectedDialogFilter;
                if (cyVar.f38586e0[0].f37919s == i10) {
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
    public final void p(s4.e1 e1Var, int i10) {
        if (e1Var != null) {
            this.f46382g.f37913a.d1(false);
        }
        this.d = e1Var;
        if (e1Var != null) {
            View view = e1Var.f47738a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).f24739w = false;
            }
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
        int i10;
        cy cyVar = this.h;
        if (e1Var != null) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.f47738a;
            long dialogId = p2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ay ayVar = this.f46382g;
            if (isFolderDialogId) {
                wx wxVar = ayVar.f37913a;
                int i12 = wx.C3;
                wxVar.F1(false, p2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) && cyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    cyVar.N2 = i11;
                    cyVar.z4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                cyVar.z4(arrayList2, 111, true, false, null);
                return;
            }
            cyVar.W0 = p2Var;
            i2.b0 b0Var = new i2.b0(this, dialog, ayVar.d.h(), e1Var.b(), 5);
            cyVar.I4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (cyVar.V0 == null) {
                    wx wxVar2 = ayVar.f37913a;
                    ?? obj = new Object();
                    obj.f32971a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f32972b = paint;
                    obj.e = 0L;
                    obj.f32974f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f32973c = wxVar2;
                    cyVar.V0 = obj;
                }
                org.telegram.ui.Components.td0 td0Var = cyVar.V0;
                td0Var.d = b0Var;
                td0Var.h = 0.0f;
                td0Var.f32975g = 0.0f;
                td0Var.e = System.currentTimeMillis();
                td0Var.f32973c.invalidate();
                return;
            }
            b0Var.run();
            return;
        }
        cyVar.W0 = null;
    }
}
