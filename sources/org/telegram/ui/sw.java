package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class sw extends u4.v {
    public u4.d1 d;
    public boolean f49627e;
    public boolean f49628f;
    public final tw f49629g;
    public final uw h;

    public sw(uw uwVar, tw twVar) {
        this.h = uwVar;
        this.f49629g = twVar;
    }

    @Override
    public final int b(int i3, int i10) {
        if (this.f49628f) {
            return 0;
        }
        return super.b(i3, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i3, float f10, float f11) {
        uw uwVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i3 == 4) {
            return 200L;
        }
        if (i3 == 8 && (t2Var = (uwVar = this.h).Y0) != null) {
            org.telegram.messenger.g0.i3(new pg(1, t2Var), this.f49629g.f49907y.f55617e);
            uwVar.Y0 = null;
        }
        return super.d(recyclerView, i3, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, u4.d1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.e(androidx.recyclerview.widget.RecyclerView, u4.d1):int");
    }

    @Override
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        char c2;
        int i3;
        uw uwVar = this.h;
        ArrayList arrayList = uwVar.f50209b1;
        View view = d1Var2.f55540a;
        char c10 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
            if (dialog != null && uwVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                tw twVar = this.f49629g;
                if (twVar.f49897a.getItemAnimator() == null) {
                    twVar.f49897a.setItemAnimator(twVar.f49907y);
                }
                dv dvVar = twVar.d;
                uw uwVar2 = dvVar.S;
                int i10 = dvVar.G;
                ArrayList d42 = uwVar2.d4(i10, dvVar.h, dvVar.f17093r, false);
                int H = dvVar.H(b10);
                int H2 = dvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = dvVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.mo[] moVarArr = org.telegram.messenger.hp.s1(i10).N;
                    if (dvVar.h == 8) {
                        c2 = 1;
                    } else {
                        c2 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = moVarArr[c2].f24244j;
                    int i13 = longSparseIntArray.get(dialog2.f27005id);
                    longSparseIntArray.put(dialog2.f27005id, longSparseIntArray.get(dialog3.f27005id));
                    longSparseIntArray.put(dialog3.f27005id, i13);
                }
                Collections.swap(d42, H, H2);
                dvVar.X(null);
                int i14 = uwVar.f50230f0[0].f49904s;
                if (i14 != 7) {
                    i3 = 8;
                    if (i14 != 8) {
                        uwVar.f50203a1 = true;
                        return true;
                    }
                } else {
                    i3 = 8;
                }
                org.telegram.messenger.mo[] moVarArr2 = uwVar.getMessagesController().N;
                if (uwVar.f50230f0[0].f49904s == i3) {
                    c10 = 1;
                }
                org.telegram.messenger.mo moVar = moVarArr2[c10];
                if (!arrayList.contains(moVar)) {
                    arrayList.add(moVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        if (d1Var != null) {
            this.f49629g.f49897a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f30580x = false;
            }
        }
    }

    @Override
    public final void q(u4.d1 d1Var) {
        int i3;
        uw uwVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f55540a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.m5.D(dialogId);
            int i10 = 0;
            tw twVar = this.f49629g;
            if (D) {
                pw pwVar = twVar.f49897a;
                int i11 = pw.C3;
                pwVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!uwVar.getMessagesController().C2(dialogId, false) && uwVar.X2 == 0) {
                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                if (org.telegram.messenger.az.m(i3) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    uwVar.O2 = i10;
                    uwVar.D4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.t3.Y(uwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                uwVar.D4(arrayList2, 111, true, false, null);
                return;
            }
            uwVar.X0 = t2Var;
            k2.a0 a0Var = new k2.a0(this, dialog, twVar.d.b(), d1Var.b(), 13);
            uwVar.M4(true, true);
            if (Utilities.f21385b.nextInt(1000) == 1) {
                if (uwVar.W0 == null) {
                    pw pwVar2 = twVar.f49897a;
                    ?? obj = new Object();
                    obj.f34653a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f34654b = paint;
                    obj.f34656e = 0L;
                    obj.f34657f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f34655c = pwVar2;
                    uwVar.W0 = obj;
                }
                org.telegram.ui.Components.ib0 ib0Var = uwVar.W0;
                ib0Var.d = a0Var;
                ib0Var.h = 0.0f;
                ib0Var.f34658g = 0.0f;
                ib0Var.f34656e = System.currentTimeMillis();
                ib0Var.f34655c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        uwVar.X0 = null;
    }
}
