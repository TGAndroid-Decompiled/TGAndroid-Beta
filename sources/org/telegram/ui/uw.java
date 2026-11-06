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
public final class uw extends v4.v {
    public v4.d1 d;
    public boolean f50508e;
    public boolean f50509f;
    public final vw f50510g;
    public final ww h;

    public uw(ww wwVar, vw vwVar) {
        this.h = wwVar;
        this.f50510g = vwVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f50509f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        ww wwVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (wwVar = this.h).X0) != null) {
            org.telegram.messenger.g0.i3(new tg(1, t2Var), this.f50510g.f50848y.f57024e);
            wwVar.X0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, v4.d1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.e(androidx.recyclerview.widget.RecyclerView, v4.d1):int");
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
        ww wwVar = this.h;
        ArrayList arrayList = wwVar.f51528a1;
        View view = d1Var2.f56951a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && wwVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                vw vwVar = this.f50510g;
                if (vwVar.f50838a.getItemAnimator() == null) {
                    vwVar.f50838a.setItemAnimator(vwVar.f50848y);
                }
                gv gvVar = vwVar.d;
                ww wwVar2 = gvVar.R;
                int i10 = gvVar.F;
                ArrayList d42 = wwVar2.d4(i10, gvVar.h, gvVar.f16852r, false);
                int H = gvVar.H(b10);
                int H2 = gvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = gvVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.vo[] voVarArr = org.telegram.messenger.qp.s1(i10).M;
                    if (gvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = voVarArr[c10].f26071j;
                    int i13 = longSparseIntArray.get(dialog2.f26957id);
                    longSparseIntArray.put(dialog2.f26957id, longSparseIntArray.get(dialog3.f26957id));
                    longSparseIntArray.put(dialog3.f26957id, i13);
                }
                Collections.swap(d42, H, H2);
                gvVar.X(null);
                int i14 = wwVar.f51549e0[0].f50845s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        wwVar.Z0 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.vo[] voVarArr2 = wwVar.getMessagesController().M;
                if (wwVar.f51549e0[0].f50845s == i7) {
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
            this.f50510g.f50838a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f56951a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f30500x = false;
            }
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
        int i7;
        ww wwVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f56951a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.m5.D(dialogId);
            int i10 = 0;
            vw vwVar = this.f50510g;
            if (D) {
                sw swVar = vwVar.f50838a;
                int i11 = sw.B3;
                swVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!wwVar.getMessagesController().C2(dialogId, false) && wwVar.W2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                if (org.telegram.messenger.iz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    wwVar.N2 = i10;
                    wwVar.D4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.t3.Y(wwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                wwVar.D4(arrayList2, 111, true, false, null);
                return;
            }
            wwVar.W0 = t2Var;
            l2.a0 a0Var = new l2.a0(this, dialog, vwVar.d.b(), d1Var.b(), 13);
            wwVar.M4(true, true);
            if (Utilities.f21331b.nextInt(1000) == 1) {
                if (wwVar.V0 == null) {
                    sw swVar2 = vwVar.f50838a;
                    ?? obj = new Object();
                    obj.f36289a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f36290b = paint;
                    obj.f36292e = 0L;
                    obj.f36293f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f36291c = swVar2;
                    wwVar.V0 = obj;
                }
                org.telegram.ui.Components.nb0 nb0Var = wwVar.V0;
                nb0Var.d = a0Var;
                nb0Var.h = 0.0f;
                nb0Var.f36294g = 0.0f;
                nb0Var.f36292e = System.currentTimeMillis();
                nb0Var.f36291c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        wwVar.W0 = null;
    }
}
