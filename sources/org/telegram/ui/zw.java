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
public final class zw extends v4.w {
    public v4.f1 d;
    public boolean f54737e;
    public boolean f54738f;
    public final ax f54739g;
    public final bx h;

    public zw(bx bxVar, ax axVar) {
        this.h = bxVar;
        this.f54739g = axVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f54738f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        bx bxVar;
        org.telegram.ui.Cells.u2 u2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (u2Var = (bxVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.h3(new sg(1, u2Var), this.f54739g.f45832y.f59319e);
            bxVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, v4.f1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.e(androidx.recyclerview.widget.RecyclerView, v4.f1):int");
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
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        char c10;
        int i7;
        bx bxVar = this.h;
        ArrayList arrayList = bxVar.f46534c1;
        View view = f1Var2.f59245a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.u2) {
            long dialogId = ((org.telegram.ui.Cells.u2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
            if (dialog != null && bxVar.v4(dialog) && !org.telegram.messenger.n5.D(dialogId)) {
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                ax axVar = this.f54739g;
                if (axVar.f45822a.getItemAnimator() == null) {
                    axVar.f45822a.setItemAnimator(axVar.f45832y);
                }
                jv jvVar = axVar.d;
                bx bxVar2 = jvVar.S;
                int i10 = jvVar.G;
                ArrayList d42 = bxVar2.d4(i10, jvVar.h, jvVar.f17675r, false);
                int H = jvVar.H(b10);
                int H2 = jvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = jvVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.ro[] roVarArr = org.telegram.messenger.mp.u1(i10).N;
                    if (jvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = roVarArr[c10].f26780j;
                    int i13 = longSparseIntArray.get(dialog2.f28496id);
                    longSparseIntArray.put(dialog2.f28496id, longSparseIntArray.get(dialog3.f28496id));
                    longSparseIntArray.put(dialog3.f28496id, i13);
                }
                Collections.swap(d42, H, H2);
                jvVar.X(null);
                int i14 = bxVar.f46549f0[0].f45829s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        bxVar.f46528b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.ro[] roVarArr2 = bxVar.getMessagesController().N;
                if (bxVar.f46549f0[0].f45829s == i7) {
                    c11 = 1;
                }
                org.telegram.messenger.ro roVar = roVarArr2[c11];
                if (!arrayList.contains(roVar)) {
                    arrayList.add(roVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        if (f1Var != null) {
            this.f54739g.f45822a.d1(false);
        }
        this.d = f1Var;
        if (f1Var != null) {
            View view = f1Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).f32087x = false;
            }
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
        int i7;
        bx bxVar = this.h;
        if (f1Var != null) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.f59245a;
            long dialogId = u2Var.getDialogId();
            boolean D = org.telegram.messenger.n5.D(dialogId);
            int i10 = 0;
            ax axVar = this.f54739g;
            if (D) {
                xw xwVar = axVar.f45822a;
                int i11 = xw.C3;
                xwVar.C1(false, u2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!bxVar.getMessagesController().I2(dialogId, false) && bxVar.Y2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                if (org.telegram.messenger.bz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    bxVar.P2 = i10;
                    bxVar.K4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.v3.Y(bxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                bxVar.K4(arrayList2, 111, true, false, null);
                return;
            }
            bxVar.Y0 = u2Var;
            l2.y yVar = new l2.y(this, dialog, axVar.d.b(), f1Var.b(), 13);
            bxVar.U4(true, true);
            if (Utilities.f22875b.nextInt(1000) == 1) {
                if (bxVar.X0 == null) {
                    xw xwVar2 = axVar.f45822a;
                    ?? obj = new Object();
                    obj.f41968a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f41969b = paint;
                    obj.f41971e = 0L;
                    obj.f41972f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f41970c = xwVar2;
                    bxVar.X0 = obj;
                }
                org.telegram.ui.Components.xb0 xb0Var = bxVar.X0;
                xb0Var.d = yVar;
                xb0Var.h = 0.0f;
                xb0Var.f41973g = 0.0f;
                xb0Var.f41971e = System.currentTimeMillis();
                xb0Var.f41970c.invalidate();
                return;
            }
            yVar.run();
            return;
        }
        bxVar.Y0 = null;
    }
}
