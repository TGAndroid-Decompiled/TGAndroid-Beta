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
public final class uy extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f38241f;
    public final vy f38242g;
    public final wy h;

    public uy(wy wyVar, vy vyVar) {
        this.h = wyVar;
        this.f38242g = vyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f38241f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        wy wyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (wyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new kh(1, r2Var), this.f38242g.f38530x.e);
            wyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.c1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
        wy wyVar = this.h;
        ArrayList arrayList = wyVar.f39195a1;
        View view = c1Var2.f42697a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && wyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                vy vyVar = this.f38242g;
                if (vyVar.f38522a.getItemAnimator() == null) {
                    vyVar.f38522a.setItemAnimator(vyVar.f38530x);
                }
                dx dxVar = vyVar.d;
                wy wyVar2 = dxVar.R;
                int i11 = dxVar.F;
                ArrayList R3 = wyVar2.R3(i11, dxVar.h, dxVar.f9857r, false);
                int G = dxVar.G(b10);
                int G2 = dxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = dxVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (dxVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f18125id);
                    dialogFilter.pinnedDialogs.put(dialog2.f18125id, dialogFilter.pinnedDialogs.get(dialog3.f18125id));
                    dialogFilter.pinnedDialogs.put(dialog3.f18125id, i14);
                }
                Collections.swap(R3, G, G2);
                dxVar.W(null);
                int i15 = wyVar.f39215e0[0].f38528s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        wyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = wyVar.getMessagesController().selectedDialogFilter;
                if (wyVar.f39215e0[0].f38528s == i10) {
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
            this.f38242g.f38522a.e1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f42697a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f20778w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        wy wyVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f42697a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            vy vyVar = this.f38242g;
            if (isFolderDialogId) {
                sy syVar = vyVar.f38522a;
                int i12 = sy.f37567v3;
                syVar.A1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!wyVar.getMessagesController().isPromoDialog(dialogId, false) && wyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    wyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    wyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(wyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                wyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            wyVar.W0 = r2Var;
            i2.z zVar = new i2.z(this, dialog, vyVar.d.h(), c1Var.b(), 5);
            wyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (wyVar.V0 == null) {
                    sy syVar2 = vyVar.f38522a;
                    ?? obj = new Object();
                    obj.f22377a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f22378b = paint;
                    obj.e = 0L;
                    obj.f22380f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f22379c = syVar2;
                    wyVar.V0 = obj;
                }
                org.telegram.ui.Components.ad0 ad0Var = wyVar.V0;
                ad0Var.d = zVar;
                ad0Var.h = 0.0f;
                ad0Var.f22381g = 0.0f;
                ad0Var.e = System.currentTimeMillis();
                ad0Var.f22379c.invalidate();
                return;
            }
            zVar.run();
            return;
        }
        wyVar.W0 = null;
    }
}
