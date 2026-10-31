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
public final class yx extends s4.u {
    public s4.c1 d;
    public boolean e;
    public boolean f43902f;
    public final zx f43903g;
    public final ay h;

    public yx(ay ayVar, zx zxVar) {
        this.h = ayVar;
        this.f43903g = zxVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f43902f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ay ayVar;
        org.telegram.ui.Cells.v2 v2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (v2Var = (ayVar = this.h).X0) != null) {
            org.telegram.messenger.i0.h3(new hh(1, v2Var), this.f43903g.f44248y.e);
            ayVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r18, s4.c1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
        ay ayVar = this.h;
        ArrayList arrayList = ayVar.f35774a1;
        View view = c1Var2.f47898a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.v2) {
            long dialogId = ((org.telegram.ui.Cells.v2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && ayVar.r4(dialog) && !org.telegram.messenger.o5.D(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                zx zxVar = this.f43903g;
                if (zxVar.f44239a.getItemAnimator() == null) {
                    zxVar.f44239a.setItemAnimator(zxVar.f44248y);
                }
                lw lwVar = zxVar.d;
                ay ayVar2 = lwVar.R;
                int i11 = lwVar.F;
                ArrayList c42 = ayVar2.c4(i11, lwVar.h, lwVar.f55565r, false);
                int H = lwVar.H(b10);
                int H2 = lwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) c42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) c42.get(H2);
                int i12 = lwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    org.telegram.messenger.ap[] apVarArr = org.telegram.messenger.vp.r1(i11).M;
                    if (lwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = apVarArr[c10].f14651j;
                    int i14 = longSparseIntArray.get(dialog2.f19797id);
                    longSparseIntArray.put(dialog2.f19797id, longSparseIntArray.get(dialog3.f19797id));
                    longSparseIntArray.put(dialog3.f19797id, i14);
                }
                Collections.swap(c42, H, H2);
                lwVar.X(null);
                int i15 = ayVar.f35794e0[0].f44245s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        ayVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                org.telegram.messenger.ap[] apVarArr2 = ayVar.getMessagesController().M;
                if (ayVar.f35794e0[0].f44245s == i10) {
                    c11 = 1;
                }
                org.telegram.messenger.ap apVar = apVarArr2[c11];
                if (!arrayList.contains(apVar)) {
                    arrayList.add(apVar);
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
            this.f43903g.f44239a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).f23289x = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        ay ayVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.f47898a;
            long dialogId = v2Var.getDialogId();
            boolean D = org.telegram.messenger.o5.D(dialogId);
            int i11 = 0;
            zx zxVar = this.f43903g;
            if (D) {
                wx wxVar = zxVar.f44239a;
                int i12 = wx.B3;
                wxVar.C1(false, v2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!ayVar.getMessagesController().B2(dialogId, false) && ayVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                if (org.telegram.messenger.tz.m(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    ayVar.N2 = i11;
                    ayVar.C4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.w3.Y(ayVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                ayVar.C4(arrayList2, 111, true, false, null);
                return;
            }
            ayVar.W0 = v2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, zxVar.d.b(), c1Var.b(), 13);
            ayVar.L4(true, true);
            if (Utilities.f14519b.nextInt(1000) == 1) {
                if (ayVar.V0 == null) {
                    wx wxVar2 = zxVar.f44239a;
                    ?? obj = new Object();
                    obj.f26345a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26346b = paint;
                    obj.e = 0L;
                    obj.f26348f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                    obj.f26347c = wxVar2;
                    ayVar.V0 = obj;
                }
                org.telegram.ui.Components.gc0 gc0Var = ayVar.V0;
                gc0Var.d = a0Var;
                gc0Var.h = 0.0f;
                gc0Var.f26349g = 0.0f;
                gc0Var.e = System.currentTimeMillis();
                gc0Var.f26347c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        ayVar.W0 = null;
    }
}
