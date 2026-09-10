package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z0 extends w7.w5 {
    public final int f39144a;
    public final Object f39145b;

    public z0(Object obj, int i10) {
        this.f39144a = i10;
        this.f39145b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f39144a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = ((j4) this.f39145b).I;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.f39145b;
                eoVar.f32425n9 = !z10;
                if (z10) {
                    if (eoVar.f32303d9 != null) {
                        eo.V1(eoVar, 0.0f);
                        eoVar.f32303d9 = null;
                    }
                    eoVar.f32315e9 = false;
                    eoVar.f32327f9 = false;
                    tl tlVar = eoVar.f32351h9;
                    if (tlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(tlVar.H);
                        tlVar.a();
                    }
                }
                eoVar.vc();
                return;
            case 2:
                org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) this.f39145b;
                org.telegram.ui.Components.qb0 qb0Var = yb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = yb0Var.f29299s;
                org.telegram.ui.Components.ec0 ec0Var = yb0Var.f29295c0;
                if (ec0Var.f22667s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f22703b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (qb0Var.v - qb0Var.f19164u > MessagesController.getInstance(ec0Var.f22668w).quoteLengthMax) {
                            yb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.aa aaVar = qb0Var.W;
                        if (aaVar != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) aaVar).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = yb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = ec0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = qb0Var.f19164u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = qb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = tn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(yb0Var.I);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                zh.a3 a3Var = (zh.a3) this.f39145b;
                zh.w2 w2Var = a3Var.Q1;
                boolean y3 = a3Var.K0.W.y();
                zh.u7 u7Var = ((zh.l7) w2Var).d;
                u7Var.f48941j1 = y3;
                u7Var.P();
                return;
        }
    }

    @Override
    public void b() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f39144a) {
            case 1:
                eo eoVar = (eo) this.f39145b;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (lVar2.s()) {
                        eoVar.z7(false);
                    }
                }
                eoVar.Q7();
                eoVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
