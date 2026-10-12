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
public final class ty extends s4.w {
    public s4.d1 d;
    public boolean f42314e;
    public boolean f42315f;
    public final uy f42316g;
    public final vy h;

    public ty(vy vyVar, uy uyVar) {
        this.h = vyVar;
        this.f42316g = uyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f42315f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        vy vyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (vyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new rh(1, s2Var), this.f42316g.f42622x.f47990e);
            vyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.d1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.e(androidx.recyclerview.widget.RecyclerView, s4.d1):int");
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
        vy vyVar = this.h;
        ArrayList arrayList = vyVar.f42884a1;
        View view = d1Var2.f47897a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) vyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && vyVar.d4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                uy uyVar = this.f42316g;
                if (uyVar.f42613a.getItemAnimator() == null) {
                    uyVar.f42613a.setItemAnimator(uyVar.f42622x);
                }
                cx cxVar = uyVar.d;
                vy vyVar2 = cxVar.R;
                int i11 = cxVar.F;
                ArrayList O3 = vyVar2.O3(i11, cxVar.h, cxVar.f10720r, false);
                int G = cxVar.G(b10);
                int G2 = cxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) O3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(G2);
                int i12 = cxVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (cxVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f19807id);
                    dialogFilter.pinnedDialogs.put(dialog2.f19807id, dialogFilter.pinnedDialogs.get(dialog3.f19807id));
                    dialogFilter.pinnedDialogs.put(dialog3.f19807id, i14);
                }
                Collections.swap(O3, G, G2);
                cxVar.W(null);
                int i15 = vyVar.f42905e0[0].f42620s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        vyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = vyVar.getMessagesController().selectedDialogFilter;
                if (vyVar.f42905e0[0].f42620s == i10) {
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
            this.f42316g.f42613a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f47897a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f22639w = false;
            }
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
        int i10;
        vy vyVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47897a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            uy uyVar = this.f42316g;
            if (isFolderDialogId) {
                ry ryVar = uyVar.f42613a;
                int i12 = ry.f41749t3;
                ryVar.A1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) vyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!vyVar.getMessagesController().isPromoDialog(dialogId, false) && vyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    vyVar.M2 = i11;
                    vyVar.o4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(vyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                vyVar.o4(arrayList2, 111, true, false, null);
                return;
            }
            vyVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, uyVar.d.h(), d1Var.b(), 5);
            vyVar.x4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (vyVar.V0 == null) {
                    ry ryVar2 = uyVar.f42613a;
                    ?? obj = new Object();
                    obj.f26040a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26041b = paint;
                    obj.f26043e = 0L;
                    obj.f26044f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f26042c = ryVar2;
                    vyVar.V0 = obj;
                }
                org.telegram.ui.Components.fe0 fe0Var = vyVar.V0;
                fe0Var.d = a0Var;
                fe0Var.h = 0.0f;
                fe0Var.f26045g = 0.0f;
                fe0Var.f26043e = System.currentTimeMillis();
                fe0Var.f26042c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        vyVar.W0 = null;
    }
}
