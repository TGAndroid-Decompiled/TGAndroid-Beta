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
public final class xw extends v4.v {
    public v4.d1 d;
    public boolean f51828e;
    public boolean f51829f;
    public final yw f51830g;
    public final zw h;

    public xw(zw zwVar, yw ywVar) {
        this.h = zwVar;
        this.f51830g = ywVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f51829f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        zw zwVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (zwVar = this.h).Y0) != null) {
            org.telegram.messenger.g0.i3(new wg(1, t2Var), this.f51830g.f52135y.f57125e);
            zwVar.Y0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, v4.d1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xw.e(androidx.recyclerview.widget.RecyclerView, v4.d1):int");
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
        zw zwVar = this.h;
        ArrayList arrayList = zwVar.f52562b1;
        View view = d1Var2.f57052a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) zwVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && zwVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                yw ywVar = this.f51830g;
                if (ywVar.f52125a.getItemAnimator() == null) {
                    ywVar.f52125a.setItemAnimator(ywVar.f52135y);
                }
                jv jvVar = ywVar.d;
                zw zwVar2 = jvVar.R;
                int i10 = jvVar.F;
                ArrayList d42 = zwVar2.d4(i10, jvVar.h, jvVar.f16855r, false);
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
                    org.telegram.messenger.vo[] voVarArr = org.telegram.messenger.qp.s1(i10).M;
                    if (jvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = voVarArr[c10].f26081j;
                    int i13 = longSparseIntArray.get(dialog2.f26964id);
                    longSparseIntArray.put(dialog2.f26964id, longSparseIntArray.get(dialog3.f26964id));
                    longSparseIntArray.put(dialog3.f26964id, i13);
                }
                Collections.swap(d42, H, H2);
                jvVar.X(null);
                int i14 = zwVar.f52577e0[0].f52132s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        zwVar.f52556a1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.vo[] voVarArr2 = zwVar.getMessagesController().M;
                if (zwVar.f52577e0[0].f52132s == i7) {
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
            this.f51830g.f52125a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f30519x = false;
            }
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
        int i7;
        zw zwVar = this.h;
        if (d1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.f57052a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.m5.D(dialogId);
            int i10 = 0;
            yw ywVar = this.f51830g;
            if (D) {
                vw vwVar = ywVar.f52125a;
                int i11 = vw.B3;
                vwVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) zwVar.getMessagesController().Q.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!zwVar.getMessagesController().C2(dialogId, false) && zwVar.X2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                if (org.telegram.messenger.iz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    zwVar.O2 = i10;
                    zwVar.D4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.t3.Y(zwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                zwVar.D4(arrayList2, 111, true, false, null);
                return;
            }
            zwVar.X0 = t2Var;
            l2.z zVar = new l2.z(this, dialog, ywVar.d.b(), d1Var.b(), 13);
            zwVar.M4(true, true);
            if (Utilities.f21339b.nextInt(1000) == 1) {
                if (zwVar.W0 == null) {
                    vw vwVar2 = ywVar.f52125a;
                    ?? obj = new Object();
                    obj.f36277a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f36278b = paint;
                    obj.f36280e = 0L;
                    obj.f36281f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f36279c = vwVar2;
                    zwVar.W0 = obj;
                }
                org.telegram.ui.Components.nb0 nb0Var = zwVar.W0;
                nb0Var.d = zVar;
                nb0Var.h = 0.0f;
                nb0Var.f36282g = 0.0f;
                nb0Var.f36280e = System.currentTimeMillis();
                nb0Var.f36279c.invalidate();
                return;
            }
            zVar.run();
            return;
        }
        zwVar.X0 = null;
    }
}
