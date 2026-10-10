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
public final class ry extends s4.w {
    public s4.d1 d;
    public boolean f41583e;
    public boolean f41584f;
    public final sy f41585g;
    public final ty h;

    public ry(ty tyVar, sy syVar) {
        this.h = tyVar;
        this.f41585g = syVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f41584f) {
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
            AndroidUtilities.runOnUIThread(new nh(1, s2Var), this.f41585g.f41843x.f47795e);
            tyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.d1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ry.e(androidx.recyclerview.widget.RecyclerView, s4.d1):int");
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
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.f42197a1;
        View view = d1Var2.f47702a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && tyVar.d4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                sy syVar = this.f41585g;
                if (syVar.f41834a.getItemAnimator() == null) {
                    syVar.f41834a.setItemAnimator(syVar.f41843x);
                }
                ax axVar = syVar.d;
                ty tyVar2 = axVar.R;
                int i11 = axVar.F;
                ArrayList O3 = tyVar2.O3(i11, axVar.h, axVar.f10722r, false);
                int G = axVar.G(b10);
                int G2 = axVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) O3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(G2);
                int i12 = axVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (axVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20046id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20046id, dialogFilter.pinnedDialogs.get(dialog3.f20046id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20046id, i14);
                }
                Collections.swap(O3, G, G2);
                axVar.W(null);
                int i15 = tyVar.f42218e0[0].f41841s;
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
                if (tyVar.f42218e0[0].f41841s == i10) {
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
            this.f41585g.f41834a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f47702a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f22879w = false;
            }
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
        int i10;
        ty tyVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47702a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            sy syVar = this.f41585g;
            if (isFolderDialogId) {
                py pyVar = syVar.f41834a;
                int i12 = py.f40957t3;
                pyVar.A1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!tyVar.getMessagesController().isPromoDialog(dialogId, false) && tyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    tyVar.M2 = i11;
                    tyVar.o4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(tyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                tyVar.o4(arrayList2, 111, true, false, null);
                return;
            }
            tyVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, syVar.d.h(), d1Var.b(), 5);
            tyVar.x4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (tyVar.V0 == null) {
                    py pyVar2 = syVar.f41834a;
                    ?? obj = new Object();
                    obj.f25274a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f25275b = paint;
                    obj.f25277e = 0L;
                    obj.f25278f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f25276c = pyVar2;
                    tyVar.V0 = obj;
                }
                org.telegram.ui.Components.ce0 ce0Var = tyVar.V0;
                ce0Var.d = a0Var;
                ce0Var.h = 0.0f;
                ce0Var.f25279g = 0.0f;
                ce0Var.f25277e = System.currentTimeMillis();
                ce0Var.f25276c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        tyVar.W0 = null;
    }
}
