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
    public v4.e1 d;
    public boolean f53012e;
    public boolean f53013f;
    public final xw f53014g;
    public final yw h;

    public ww(yw ywVar, xw xwVar) {
        this.h = ywVar;
        this.f53014g = xwVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f53013f) {
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
        if (i7 == 8 && (t2Var = (ywVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.i3(new sg(1, t2Var), this.f53014g.f53341y.f58609e);
            ywVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, v4.e1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ww.e(androidx.recyclerview.widget.RecyclerView, v4.e1):int");
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
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        char c10;
        int i7;
        yw ywVar = this.h;
        ArrayList arrayList = ywVar.f53658c1;
        View view = e1Var2.f58535a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
            if (dialog != null && ywVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                xw xwVar = this.f53014g;
                if (xwVar.f53331a.getItemAnimator() == null) {
                    xwVar.f53331a.setItemAnimator(xwVar.f53341y);
                }
                hv hvVar = xwVar.d;
                yw ywVar2 = hvVar.S;
                int i10 = hvVar.G;
                ArrayList d42 = ywVar2.d4(i10, hvVar.h, hvVar.f17196r, false);
                int H = hvVar.H(b10);
                int H2 = hvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = hvVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.so[] soVarArr = org.telegram.messenger.np.s1(i10).N;
                    if (hvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = soVarArr[c10].f26549j;
                    int i13 = longSparseIntArray.get(dialog2.f28055id);
                    longSparseIntArray.put(dialog2.f28055id, longSparseIntArray.get(dialog3.f28055id));
                    longSparseIntArray.put(dialog3.f28055id, i13);
                }
                Collections.swap(d42, H, H2);
                hvVar.X(null);
                int i14 = ywVar.f53673f0[0].f53338s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        ywVar.f53652b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.so[] soVarArr2 = ywVar.getMessagesController().N;
                if (ywVar.f53673f0[0].f53338s == i7) {
                    c11 = 1;
                }
                org.telegram.messenger.so soVar = soVarArr2[c11];
                if (!arrayList.contains(soVar)) {
                    arrayList.add(soVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        if (e1Var != null) {
            this.f53014g.f53331a.d1(false);
        }
        this.d = e1Var;
        if (e1Var != null) {
            View view = e1Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f31656x = false;
            }
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
        int i7;
        yw ywVar = this.h;
        if (e1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.f58535a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.m5.D(dialogId);
            int i10 = 0;
            xw xwVar = this.f53014g;
            if (D) {
                uw uwVar = xwVar.f53331a;
                int i11 = uw.C3;
                uwVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!ywVar.getMessagesController().C2(dialogId, false) && ywVar.Y2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                if (org.telegram.messenger.gz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    ywVar.P2 = i10;
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
            ywVar.Y0 = t2Var;
            l2.x xVar = new l2.x(this, dialog, xwVar.d.b(), e1Var.b(), 13);
            ywVar.M4(true, true);
            if (Utilities.f22414b.nextInt(1000) == 1) {
                if (ywVar.X0 == null) {
                    uw uwVar2 = xwVar.f53331a;
                    ?? obj = new Object();
                    obj.f37913a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f37914b = paint;
                    obj.f37916e = 0L;
                    obj.f37917f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f37915c = uwVar2;
                    ywVar.X0 = obj;
                }
                org.telegram.ui.Components.ob0 ob0Var = ywVar.X0;
                ob0Var.d = xVar;
                ob0Var.h = 0.0f;
                ob0Var.f37918g = 0.0f;
                ob0Var.f37916e = System.currentTimeMillis();
                ob0Var.f37915c.invalidate();
                return;
            }
            xVar.run();
            return;
        }
        ywVar.Y0 = null;
    }
}
