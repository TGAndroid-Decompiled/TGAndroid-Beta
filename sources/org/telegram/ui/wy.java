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
public final class wy extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f41379f;
    public final xy f41380g;
    public final yy h;

    public wy(yy yyVar, xy xyVar) {
        this.h = yyVar;
        this.f41380g = xyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f41379f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        yy yyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (yyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new rh(1, s2Var), this.f41380g.f41687x.e);
            yyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.b1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.e(androidx.recyclerview.widget.RecyclerView, s4.b1):int");
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        char c10;
        int i10;
        yy yyVar = this.h;
        ArrayList arrayList = yyVar.f41984a1;
        View view = b1Var2.f44838a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && yyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                xy xyVar = this.f41380g;
                if (xyVar.f41679a.getItemAnimator() == null) {
                    xyVar.f41679a.setItemAnimator(xyVar.f41687x);
                }
                fx fxVar = xyVar.d;
                yy yyVar2 = fxVar.R;
                int i11 = fxVar.F;
                ArrayList P3 = yyVar2.P3(i11, fxVar.h, fxVar.f10668r, false);
                int G = fxVar.G(b10);
                int G2 = fxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(G2);
                int i12 = fxVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (fxVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f18920id);
                    dialogFilter.pinnedDialogs.put(dialog2.f18920id, dialogFilter.pinnedDialogs.get(dialog3.f18920id));
                    dialogFilter.pinnedDialogs.put(dialog3.f18920id, i14);
                }
                Collections.swap(P3, G, G2);
                fxVar.W(null);
                int i15 = yyVar.f42004e0[0].f41685s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        yyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = yyVar.getMessagesController().selectedDialogFilter;
                if (yyVar.f42004e0[0].f41685s == i10) {
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
    public final void p(s4.b1 b1Var, int i10) {
        if (b1Var != null) {
            this.f41380g.f41679a.d1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f21610w = false;
            }
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
        int i10;
        yy yyVar = this.h;
        if (b1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) b1Var.f44838a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            xy xyVar = this.f41380g;
            if (isFolderDialogId) {
                uy uyVar = xyVar.f41679a;
                int i12 = uy.f40506t3;
                uyVar.A1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!yyVar.getMessagesController().isPromoDialog(dialogId, false) && yyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    yyVar.N2 = i11;
                    yyVar.p4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(yyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                yyVar.p4(arrayList2, 111, true, false, null);
                return;
            }
            yyVar.W0 = s2Var;
            i2.z zVar = new i2.z(this, dialog, xyVar.d.h(), b1Var.b(), 5);
            yyVar.y4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (yyVar.V0 == null) {
                    uy uyVar2 = xyVar.f41679a;
                    ?? obj = new Object();
                    obj.f23216a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f23217b = paint;
                    obj.e = 0L;
                    obj.f23219f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f23218c = uyVar2;
                    yyVar.V0 = obj;
                }
                org.telegram.ui.Components.ae0 ae0Var = yyVar.V0;
                ae0Var.d = zVar;
                ae0Var.h = 0.0f;
                ae0Var.f23220g = 0.0f;
                ae0Var.e = System.currentTimeMillis();
                ae0Var.f23218c.invalidate();
                return;
            }
            zVar.run();
            return;
        }
        yyVar.W0 = null;
    }
}
