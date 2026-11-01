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
public final class xx extends s4.u {
    public s4.c1 d;
    public boolean e;
    public boolean f43468f;
    public final yx f43469g;
    public final zx h;

    public xx(zx zxVar, yx yxVar) {
        this.h = zxVar;
        this.f43469g = yxVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f43468f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        zx zxVar;
        org.telegram.ui.Cells.v2 v2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (v2Var = (zxVar = this.h).X0) != null) {
            org.telegram.messenger.i0.h3(new eh(1, v2Var), this.f43469g.f43742y.e);
            zxVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, s4.c1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
        zx zxVar = this.h;
        ArrayList arrayList = zxVar.f44117a1;
        View view = c1Var2.f47909a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.v2) {
            long dialogId = ((org.telegram.ui.Cells.v2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && zxVar.s4(dialog) && !org.telegram.messenger.o5.D(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                yx yxVar = this.f43469g;
                if (yxVar.f43733a.getItemAnimator() == null) {
                    yxVar.f43733a.setItemAnimator(yxVar.f43742y);
                }
                kw kwVar = yxVar.d;
                zx zxVar2 = kwVar.R;
                int i11 = kwVar.F;
                ArrayList d42 = zxVar2.d4(i11, kwVar.h, kwVar.f55583r, false);
                int H = kwVar.H(b10);
                int H2 = kwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i12 = kwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    org.telegram.messenger.bp[] bpVarArr = org.telegram.messenger.wp.r1(i11).M;
                    if (kwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = bpVarArr[c10].f15006j;
                    int i14 = longSparseIntArray.get(dialog2.f19798id);
                    longSparseIntArray.put(dialog2.f19798id, longSparseIntArray.get(dialog3.f19798id));
                    longSparseIntArray.put(dialog3.f19798id, i14);
                }
                Collections.swap(d42, H, H2);
                kwVar.X(null);
                int i15 = zxVar.f44137e0[0].f43739s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        zxVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                org.telegram.messenger.bp[] bpVarArr2 = zxVar.getMessagesController().M;
                if (zxVar.f44137e0[0].f43739s == i10) {
                    c11 = 1;
                }
                org.telegram.messenger.bp bpVar = bpVarArr2[c11];
                if (!arrayList.contains(bpVar)) {
                    arrayList.add(bpVar);
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
            this.f43469g.f43733a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).f23290x = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        zx zxVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.f47909a;
            long dialogId = v2Var.getDialogId();
            boolean D = org.telegram.messenger.o5.D(dialogId);
            int i11 = 0;
            yx yxVar = this.f43469g;
            if (D) {
                vx vxVar = yxVar.f43733a;
                int i12 = vx.B3;
                vxVar.C1(false, v2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!zxVar.getMessagesController().B2(dialogId, false) && zxVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                if (org.telegram.messenger.uz.m(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    zxVar.N2 = i11;
                    zxVar.D4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.w3.Y(zxVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                zxVar.D4(arrayList2, 111, true, false, null);
                return;
            }
            zxVar.W0 = v2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, yxVar.d.b(), c1Var.b(), 13);
            zxVar.M4(true, true);
            if (Utilities.f14520b.nextInt(1000) == 1) {
                if (zxVar.V0 == null) {
                    vx vxVar2 = yxVar.f43733a;
                    ?? obj = new Object();
                    obj.f26410a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26411b = paint;
                    obj.e = 0L;
                    obj.f26413f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                    obj.f26412c = vxVar2;
                    zxVar.V0 = obj;
                }
                org.telegram.ui.Components.gc0 gc0Var = zxVar.V0;
                gc0Var.d = a0Var;
                gc0Var.h = 0.0f;
                gc0Var.f26414g = 0.0f;
                gc0Var.e = System.currentTimeMillis();
                gc0Var.f26412c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        zxVar.W0 = null;
    }
}
