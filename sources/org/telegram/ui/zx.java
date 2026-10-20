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
public final class zx extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f43819f;
    public final ay f43820g;
    public final cy h;

    public zx(cy cyVar, ay ayVar) {
        this.h = cyVar;
        this.f43820g = ayVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f43819f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        cy cyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (cyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, r2Var), this.f43820g.f35450x.e);
            cyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.b1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.e(androidx.recyclerview.widget.RecyclerView, s4.b1):int");
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
        cy cyVar = this.h;
        ArrayList arrayList = cyVar.f36071a1;
        View view = b1Var2.f45917a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && cyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ay ayVar = this.f43820g;
                if (ayVar.f35442a.getItemAnimator() == null) {
                    ayVar.f35442a.setItemAnimator(ayVar.f35450x);
                }
                jw jwVar = ayVar.d;
                cy cyVar2 = jwVar.R;
                int i11 = jwVar.F;
                ArrayList P3 = cyVar2.P3(i11, jwVar.h, jwVar.f11972r, false);
                int G = jwVar.G(b10);
                int G2 = jwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(G2);
                int i12 = jwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (jwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20280id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20280id, dialogFilter.pinnedDialogs.get(dialog3.f20280id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20280id, i14);
                }
                Collections.swap(P3, G, G2);
                jwVar.W(null);
                int i15 = cyVar.f36091e0[0].f35448s;
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
                if (cyVar.f36091e0[0].f35448s == i10) {
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
            this.f43820g.f35442a.d1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.f45917a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f22915w = false;
            }
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
        int i10;
        cy cyVar = this.h;
        if (b1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.f45917a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ay ayVar = this.f43820g;
            if (isFolderDialogId) {
                xx xxVar = ayVar.f35442a;
                int i12 = xx.f43289t3;
                xxVar.A1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) && cyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    cyVar.N2 = i11;
                    cyVar.p4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                cyVar.p4(arrayList2, 111, true, false, null);
                return;
            }
            cyVar.W0 = r2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, ayVar.d.h(), b1Var.b(), 5);
            cyVar.y4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (cyVar.V0 == null) {
                    xx xxVar2 = ayVar.f35442a;
                    ?? obj = new Object();
                    obj.f30894a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f30895b = paint;
                    obj.e = 0L;
                    obj.f30897f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f30896c = xxVar2;
                    cyVar.V0 = obj;
                }
                org.telegram.ui.Components.ud0 ud0Var = cyVar.V0;
                ud0Var.d = a0Var;
                ud0Var.h = 0.0f;
                ud0Var.f30898g = 0.0f;
                ud0Var.e = System.currentTimeMillis();
                ud0Var.f30896c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        cyVar.W0 = null;
    }
}
