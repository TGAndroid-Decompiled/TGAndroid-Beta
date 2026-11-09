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
public final class ww extends v4.v {
    public v4.d1 d;
    public boolean f51487e;
    public boolean f51488f;
    public final xw f51489g;
    public final yw h;

    public ww(yw ywVar, xw xwVar) {
        this.h = ywVar;
        this.f51489g = xwVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f51488f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        yw ywVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (ywVar = this.h).Y0) != null) {
            org.telegram.messenger.g0.i3(new wg(1, t2Var), this.f51489g.f51782y.f57129e);
            ywVar.Y0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, v4.d1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ww.e(androidx.recyclerview.widget.RecyclerView, v4.d1):int");
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
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        char c10;
        int i7;
        yw ywVar = this.h;
        ArrayList arrayList = ywVar.f52216b1;
        View view = d1Var2.f57056a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && ywVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                xw xwVar = this.f51489g;
                if (xwVar.f51772a.getItemAnimator() == null) {
                    xwVar.f51772a.setItemAnimator(xwVar.f51782y);
                }
                iv ivVar = xwVar.d;
                yw ywVar2 = ivVar.R;
                int i10 = ivVar.F;
                ArrayList d42 = ywVar2.d4(i10, ivVar.h, ivVar.f16855r, false);
                int H = ivVar.H(b10);
                int H2 = ivVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = ivVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.vo[] voVarArr = org.telegram.messenger.qp.s1(i10).M;
                    if (ivVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = voVarArr[c10].f26077j;
                    int i13 = longSparseIntArray.get(dialog2.f26960id);
                    longSparseIntArray.put(dialog2.f26960id, longSparseIntArray.get(dialog3.f26960id));
                    longSparseIntArray.put(dialog3.f26960id, i13);
                }
                Collections.swap(d42, H, H2);
                ivVar.X(null);
                int i14 = ywVar.f52231e0[0].f51779s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        ywVar.f52210a1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.vo[] voVarArr2 = ywVar.getMessagesController().M;
                if (ywVar.f52231e0[0].f51779s == i7) {
                    c11 = 1;
                }
                org.telegram.messenger.vo voVar = voVarArr2[c11];
                if (!arrayList.contains(voVar)) {
                    arrayList.add(voVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        if (d1Var != null) {
            this.f51489g.f51772a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f30508x = false;
            }
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
        int i7;
        yw ywVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f57056a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.m5.D(dialogId);
            int i10 = 0;
            xw xwVar = this.f51489g;
            if (D) {
                uw uwVar = xwVar.f51772a;
                int i11 = uw.B3;
                uwVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!ywVar.getMessagesController().C2(dialogId, false) && ywVar.X2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                if (org.telegram.messenger.iz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    ywVar.O2 = i10;
                    ywVar.D4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.t3.Y(ywVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                ywVar.D4(arrayList2, 111, true, false, null);
                return;
            }
            ywVar.X0 = t2Var;
            l2.z zVar = new l2.z(this, dialog, xwVar.d.b(), d1Var.b(), 13);
            ywVar.M4(true, true);
            if (Utilities.f21334b.nextInt(1000) == 1) {
                if (ywVar.W0 == null) {
                    uw uwVar2 = xwVar.f51772a;
                    ?? obj = new Object();
                    obj.f36687a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f36688b = paint;
                    obj.f36690e = 0L;
                    obj.f36691f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f36689c = uwVar2;
                    ywVar.W0 = obj;
                }
                org.telegram.ui.Components.ob0 ob0Var = ywVar.W0;
                ob0Var.d = zVar;
                ob0Var.h = 0.0f;
                ob0Var.f36692g = 0.0f;
                ob0Var.f36690e = System.currentTimeMillis();
                ob0Var.f36689c.invalidate();
                return;
            }
            zVar.run();
            return;
        }
        ywVar.X0 = null;
    }
}
