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
    public boolean f42440b;
    public final sn d;
    public float f42439a = 0.0f;
    public final int f42441c = AndroidUtilities.dp(100.0f);

    public uj(sn snVar) {
        this.d = snVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        sn snVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = snVar.B2;
            if (t1Var != null) {
                snVar.f41761z2.e(t1Var, -1, snVar.C2, snVar.D2, true);
                snVar.B2 = null;
            }
            snVar.f41710v3 = false;
            snVar.f41724w3 = false;
            snVar.f41737x3 = false;
            snVar.y3 = false;
            snVar.k9(true);
            snVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = sn.Vc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            snVar.f41734x0.setOverScrollMode(0);
            snVar.f41629o9.V();
            snVar.dd(false);
            snVar.v9(1);
            snVar.Ea = false;
            return;
        }
        ei.x3 x3Var = snVar.K1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = snVar.f41548i3;
        if (o6Var != null && o6Var.getVisibility() == 0 && snVar.C9()) {
            AndroidUtilities.hideKeyboard(snVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            snVar.P4 = true;
            snVar.f41737x3 = true;
        } else if (i10 == 1) {
            snVar.B2 = null;
            snVar.P4 = true;
            snVar.f41710v3 = true;
            snVar.f41724w3 = true;
            snVar.y3 = true;
            snVar.f41737x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = sn.Vc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = snVar.f41580ka;
        if (f0Var != null && f0Var.d()) {
            snVar.f41580ka.setHiddenByScroll(true);
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
        sn snVar2 = snVar.f41639pa;
        if (snVar2 == null) {
            snVar2 = snVar;
        }
        snVar.f41734x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42440b = z10;
        int L0 = snVar.f41759z0.L0();
        androidx.biometric.e eVar = null;
        if (((i11 != 0 && snVar.Ea && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && snVar.Z4 != 0) {
            if (this.f42440b && !snVar.f41449a5) {
                if (!snVar.f41734x0.V1 && L0 != -1) {
                    int N0 = snVar.f41759z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = snVar.f41759z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                            }
                            if (messageObject != null && snVar.Z4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < snVar.Z4) {
                        snVar.Z4 = 0;
                    }
                }
            } else {
                snVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            snVar.f41449a5 = false;
            if (!snVar.P4 && i11 != 0) {
                snVar.P4 = true;
            }
        }
        if (i11 != 0) {
            snVar.v9(1);
            snVar.f41558j1.getClass();
            snVar.m9(true);
        }
        if (i11 != 0 && snVar.f41710v3 && !snVar.f41658r3) {
            if (snVar.X7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.dd(false);
            }
            snVar.Lb(true);
        }
        if (snVar.y9() && i11 != 0 && snVar.f41724w3 && !snVar.f41658r3) {
            if (snVar.X7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.dd(false);
            }
            snVar.Mb(true);
        }
        snVar.d7(true);
        if (L0 != -1) {
            snVar.A0.h();
            if (L0 == 0 && snVar.Q6[0]) {
                if (i11 >= 0) {
                    snVar.f41678s9 = false;
                    snVar.Cc();
                }
            } else {
                androidx.biometric.e[] eVarArr = snVar.f41708v1.e;
                if (1 < eVarArr.length) {
                    eVar = eVarArr[1];
                }
                if (eVar != null && ((ne.b) eVar.f2823c).f17447f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f42441c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f42439a + i11;
                        this.f42439a = f7;
                        if (f7 > i12) {
                            this.f42439a = 0.0f;
                            snVar.f41678s9 = true;
                            snVar.Cc();
                            snVar.f41722w1 = true;
                        }
                    }
                } else if (snVar.f41722w1 && z12) {
                    float f10 = this.f42439a + i11;
                    this.f42439a = f10;
                    if (f10 < (-i12)) {
                        snVar.f41678s9 = false;
                        snVar.Cc();
                        this.f42439a = 0.0f;
                    }
                }
            }
        }
        snVar.w9();
        snVar.f41629o9.G();
        ArrayList arrayList = snVar.Ja.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((py) arrayList.get(i13)).f40649c) {
                ((py) arrayList.get(i13)).f40648b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f702r -= i11;
            if (i11 != 0) {
                d1Var.f705u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = snVar2.F) != null) {
            fVar.f(i10, i11);
        }
        snVar.l7(false);
        ei.x3 x3Var = snVar.J1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!snVar.f41556ic) {
                snVar.hc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new kg(snVar, 29));
                AndroidUtilities.runOnUIThread(new tj(snVar, 0), 2000L);
            }
        }
        ql qlVar = snVar.N1;
        if (qlVar != null && qlVar.V) {
            qlVar.e(true);
        }
        ei.x3 x3Var2 = snVar.L1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new tj(snVar, 1));
            AndroidUtilities.runOnUIThread(new tj(snVar, 2), 2000L);
        }
        ei.x3 x3Var3 = snVar.M1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            gkVar.i0();
        }
        ai.q7 q7Var = snVar.Dc;
        if (q7Var != null) {
            q7Var.invalidate();
        }
        ih.a aVar = snVar.f41496dc;
        if (aVar != null && aVar.f13143b > 0) {
            int childCount = aVar.f13142a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f13142a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        z11 = aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject());
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
