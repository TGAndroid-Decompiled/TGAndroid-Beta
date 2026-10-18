package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class wj extends s4.r0 {
    public boolean f42867b;
    public final sn d;
    public float f42866a = 0.0f;
    public final int f42868c = AndroidUtilities.dp(100.0f);

    public wj(sn snVar) {
        this.d = snVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        sn snVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = snVar.f41318p2;
            if (u1Var != null) {
                snVar.f41294n2.e(u1Var, -1, snVar.f41329q2, snVar.f41342r2, true);
                snVar.f41318p2 = null;
            }
            snVar.f41245j3 = false;
            snVar.f41258k3 = false;
            snVar.f41270l3 = false;
            snVar.f41281m3 = false;
            snVar.k9(true);
            snVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = sn.Ic;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            snVar.f41419x0.setOverScrollMode(0);
            snVar.f41166c9.V();
            snVar.ad(false);
            snVar.v9(1);
            snVar.f41364sa = false;
            return;
        }
        ei.x3 x3Var = snVar.f41434y1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = snVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && snVar.C9()) {
            AndroidUtilities.hideKeyboard(snVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            snVar.D4 = true;
            snVar.f41270l3 = true;
        } else if (i10 == 1) {
            snVar.f41318p2 = null;
            snVar.D4 = true;
            snVar.f41245j3 = true;
            snVar.f41258k3 = true;
            snVar.f41281m3 = true;
            snVar.f41270l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = sn.Ic;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = snVar.Y9;
        if (f0Var != null && f0Var.d()) {
            snVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        bh.f fVar;
        boolean z12;
        boolean z13;
        sn snVar = this.d;
        sn snVar2 = snVar.f41180da;
        if (snVar2 == null) {
            snVar2 = snVar;
        }
        snVar.f41419x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42867b = z10;
        int L0 = snVar.f41444z0.L0();
        androidx.biometric.e eVar = null;
        if (((i11 != 0 && snVar.f41364sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && snVar.N4 != 0) {
            if (this.f42867b && !snVar.O4) {
                if (!snVar.f41419x0.V1 && L0 != -1) {
                    int N0 = snVar.f41444z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = snVar.f41444z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && snVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < snVar.N4) {
                        snVar.N4 = 0;
                    }
                }
            } else {
                snVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            snVar.O4 = false;
            if (!snVar.D4 && i11 != 0) {
                snVar.D4 = true;
            }
        }
        if (i11 != 0) {
            snVar.v9(1);
            snVar.X0.getClass();
            snVar.m9(true);
        }
        if (i11 != 0 && snVar.f41245j3 && !snVar.f41198f3) {
            if (snVar.L7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.ad(false);
            }
            snVar.Jb(true);
        }
        if (snVar.y9() && i11 != 0 && snVar.f41258k3 && !snVar.f41198f3) {
            if (snVar.L7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.ad(false);
            }
            snVar.Kb(true);
        }
        snVar.d7(true);
        if (L0 != -1) {
            snVar.A0.h();
            if (L0 == 0 && snVar.E6[0]) {
                if (i11 >= 0) {
                    snVar.f41215g9 = false;
                    snVar.zc();
                }
            } else {
                androidx.biometric.e[] eVarArr = snVar.f41243j1.e;
                if (1 < eVarArr.length) {
                    eVar = eVarArr[1];
                }
                if (eVar != null && ((ne.b) eVar.f2820c).f17383f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f42868c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f42866a + i11;
                        this.f42866a = f7;
                        if (f7 > i12) {
                            this.f42866a = 0.0f;
                            snVar.f41215g9 = true;
                            snVar.zc();
                            snVar.f41256k1 = true;
                        }
                    }
                } else if (snVar.f41256k1 && z12) {
                    float f10 = this.f42866a + i11;
                    this.f42866a = f10;
                    if (f10 < (-i12)) {
                        snVar.f41215g9 = false;
                        snVar.zc();
                        this.f42866a = 0.0f;
                    }
                }
            }
        }
        snVar.w9();
        snVar.f41166c9.G();
        ArrayList arrayList = snVar.f41429xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((py) arrayList.get(i13)).f40222c) {
                ((py) arrayList.get(i13)).f40221b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f704r -= i11;
            if (i11 != 0) {
                d1Var.f707u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = snVar2.F) != null) {
            fVar.f(i10, i11);
        }
        snVar.l7(false);
        ei.x3 x3Var = snVar.f41420x1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!snVar.Vb) {
                snVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new mg(snVar, 29));
                AndroidUtilities.runOnUIThread(new vj(snVar, 0), 2000L);
            }
        }
        rl rlVar = snVar.B1;
        if (rlVar != null && rlVar.V) {
            rlVar.e(true);
        }
        ei.x3 x3Var2 = snVar.f41445z1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new vj(snVar, 1));
            AndroidUtilities.runOnUIThread(new vj(snVar, 2), 2000L);
        }
        ei.x3 x3Var3 = snVar.A1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            hkVar.j0();
        }
        ai.p7 p7Var = snVar.f41338qc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        ih.a aVar = snVar.Qb;
        if (aVar != null && aVar.f13104b > 0) {
            int childCount = aVar.f13103a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f13103a.getChildAt(i14);
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
