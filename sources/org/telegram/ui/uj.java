package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class uj extends s4.r0 {
    public boolean f41996b;
    public final qn d;
    public float f41995a = 0.0f;
    public final int f41997c = AndroidUtilities.dp(100.0f);

    public uj(qn qnVar) {
        this.d = qnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        qn qnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = qnVar.f40802p2;
            if (u1Var != null) {
                qnVar.f40778n2.e(u1Var, -1, qnVar.f40813q2, qnVar.f40826r2, true);
                qnVar.f40802p2 = null;
            }
            qnVar.f40729j3 = false;
            qnVar.f40742k3 = false;
            qnVar.f40754l3 = false;
            qnVar.f40765m3 = false;
            qnVar.k9(true);
            qnVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = qn.Ic;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            qnVar.f40903x0.setOverScrollMode(0);
            qnVar.f40650c9.V();
            qnVar.ad(false);
            qnVar.v9(1);
            qnVar.f40848sa = false;
            return;
        }
        ei.x3 x3Var = qnVar.f40918y1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = qnVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && qnVar.C9()) {
            AndroidUtilities.hideKeyboard(qnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            qnVar.D4 = true;
            qnVar.f40754l3 = true;
        } else if (i10 == 1) {
            qnVar.f40802p2 = null;
            qnVar.D4 = true;
            qnVar.f40729j3 = true;
            qnVar.f40742k3 = true;
            qnVar.f40765m3 = true;
            qnVar.f40754l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = qn.Ic;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = qnVar.Y9;
        if (f0Var != null && f0Var.d()) {
            qnVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        bh.f fVar;
        boolean z12;
        boolean z13;
        qn qnVar = this.d;
        qn qnVar2 = qnVar.f40664da;
        if (qnVar2 == null) {
            qnVar2 = qnVar;
        }
        qnVar.f40903x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41996b = z10;
        int L0 = qnVar.f40928z0.L0();
        androidx.biometric.e eVar = null;
        if (((i11 != 0 && qnVar.f40848sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && qnVar.N4 != 0) {
            if (this.f41996b && !qnVar.O4) {
                if (!qnVar.f40903x0.V1 && L0 != -1) {
                    int N0 = qnVar.f40928z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = qnVar.f40928z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && qnVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < qnVar.N4) {
                        qnVar.N4 = 0;
                    }
                }
            } else {
                qnVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            qnVar.O4 = false;
            if (!qnVar.D4 && i11 != 0) {
                qnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            qnVar.v9(1);
            qnVar.X0.getClass();
            qnVar.m9(true);
        }
        if (i11 != 0 && qnVar.f40729j3 && !qnVar.f40682f3) {
            if (qnVar.L7 != Integer.MAX_VALUE) {
                qnVar.Ma();
                qnVar.ad(false);
            }
            qnVar.Jb(true);
        }
        if (qnVar.y9() && i11 != 0 && qnVar.f40742k3 && !qnVar.f40682f3) {
            if (qnVar.L7 != Integer.MAX_VALUE) {
                qnVar.Ma();
                qnVar.ad(false);
            }
            qnVar.Kb(true);
        }
        qnVar.d7(true);
        if (L0 != -1) {
            qnVar.A0.h();
            if (L0 == 0 && qnVar.E6[0]) {
                if (i11 >= 0) {
                    qnVar.f40699g9 = false;
                    qnVar.zc();
                }
            } else {
                androidx.biometric.e[] eVarArr = qnVar.f40727j1.e;
                if (1 < eVarArr.length) {
                    eVar = eVarArr[1];
                }
                if (eVar != null && ((ne.b) eVar.f2818c).f17386f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f41997c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f41995a + i11;
                        this.f41995a = f7;
                        if (f7 > i12) {
                            this.f41995a = 0.0f;
                            qnVar.f40699g9 = true;
                            qnVar.zc();
                            qnVar.f40740k1 = true;
                        }
                    }
                } else if (qnVar.f40740k1 && z12) {
                    float f10 = this.f41995a + i11;
                    this.f41995a = f10;
                    if (f10 < (-i12)) {
                        qnVar.f40699g9 = false;
                        qnVar.zc();
                        this.f41995a = 0.0f;
                    }
                }
            }
        }
        qnVar.w9();
        qnVar.f40650c9.G();
        ArrayList arrayList = qnVar.f40913xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ny) arrayList.get(i13)).f39701c) {
                ((ny) arrayList.get(i13)).f39700b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f702r -= i11;
            if (i11 != 0) {
                d1Var.f705u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = qnVar2.F) != null) {
            fVar.f(i10, i11);
        }
        qnVar.l7(false);
        ei.x3 x3Var = qnVar.f40904x1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!qnVar.Vb) {
                qnVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new kg(qnVar, 29));
                AndroidUtilities.runOnUIThread(new tj(qnVar, 0), 2000L);
            }
        }
        pl plVar = qnVar.B1;
        if (plVar != null && plVar.V) {
            plVar.e(true);
        }
        ei.x3 x3Var2 = qnVar.f40929z1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new tj(qnVar, 1));
            AndroidUtilities.runOnUIThread(new tj(qnVar, 2), 2000L);
        }
        ei.x3 x3Var3 = qnVar.A1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            fkVar.j0();
        }
        ai.p7 p7Var = qnVar.f40822qc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        ih.a aVar = qnVar.Qb;
        if (aVar != null && aVar.f13106b > 0) {
            int childCount = aVar.f13105a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f13105a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject());
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i14++;
                } else {
                    z14 = false;
                    break;
                }
            }
            if (!z14) {
                aVar.c(0, 0L);
            }
        }
    }
}
