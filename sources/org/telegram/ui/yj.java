package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class yj extends s4.s0 {
    public boolean f43244b;
    public final yn d;
    public float f43243a = 0.0f;
    public final int f43245c = AndroidUtilities.dp(100.0f);

    public yj(yn ynVar) {
        this.d = ynVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        yn ynVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = ynVar.f43428n2;
            if (u1Var != null) {
                ynVar.f43403l2.e(u1Var, -1, ynVar.f43439o2, ynVar.f43451p2, true);
                ynVar.f43428n2 = null;
            }
            ynVar.f43355h3 = false;
            ynVar.f43367i3 = false;
            ynVar.j3 = false;
            ynVar.f43392k3 = false;
            ynVar.g9(true);
            ynVar.h9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = yn.Bc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            ynVar.f43526v0.setOverScrollMode(0);
            ynVar.f43271a9.W();
            ynVar.Vc(false);
            ynVar.f43470qa = false;
            return;
        }
        ci.e4 e4Var = ynVar.f43540w1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = ynVar.U2;
        if (p6Var != null && p6Var.getVisibility() == 0 && ynVar.w9()) {
            AndroidUtilities.hideKeyboard(ynVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            ynVar.B4 = true;
            ynVar.j3 = true;
        } else if (i10 == 1) {
            ynVar.f43428n2 = null;
            ynVar.B4 = true;
            ynVar.f43355h3 = true;
            ynVar.f43367i3 = true;
            ynVar.f43392k3 = true;
            ynVar.j3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = yn.Bc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.r rVar = ynVar.W9;
        if (rVar != null && rVar.d()) {
            ynVar.W9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        yn ynVar = this.d;
        ynVar.f43526v0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43244b = z10;
        int L0 = ynVar.f43552x0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && ynVar.f43470qa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && ynVar.L4 != 0) {
            if (this.f43244b && !ynVar.M4) {
                if (!ynVar.f43526v0.X1 && L0 != -1) {
                    int N0 = ynVar.f43552x0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = ynVar.f43552x0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && ynVar.L4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < ynVar.L4) {
                        ynVar.L4 = 0;
                    }
                }
            } else {
                ynVar.L4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            ynVar.M4 = false;
            if (!ynVar.B4 && i11 != 0) {
                ynVar.B4 = true;
            }
        }
        if (i11 != 0) {
            ynVar.V0.getClass();
            ynVar.i9(true);
        }
        if (i11 != 0 && ynVar.f43355h3 && !ynVar.f43305d3) {
            if (ynVar.J7 != Integer.MAX_VALUE) {
                ynVar.Ha();
                ynVar.Vc(false);
            }
            ynVar.Eb(true);
        }
        if (ynVar.s9() && i11 != 0 && ynVar.f43367i3 && !ynVar.f43305d3) {
            if (ynVar.J7 != Integer.MAX_VALUE) {
                ynVar.Ha();
                ynVar.Vc(false);
            }
            ynVar.Fb(true);
        }
        ynVar.a7(true);
        if (L0 != -1) {
            ynVar.f43565y0.h();
            if (L0 == 0 && ynVar.C6[0]) {
                if (i11 >= 0) {
                    ynVar.f43324e9 = false;
                    ynVar.uc();
                }
            } else {
                aa.a[] aVarArr = ynVar.f43353h1.f14164e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.b) aVar.f387c).f15437f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f43245c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f43243a + i11;
                        this.f43243a = f7;
                        if (f7 > i12) {
                            this.f43243a = 0.0f;
                            ynVar.f43324e9 = true;
                            ynVar.uc();
                            ynVar.f43365i1 = true;
                        }
                    }
                } else if (ynVar.f43365i1 && z12) {
                    float f10 = this.f43243a + i11;
                    this.f43243a = f10;
                    if (f10 < (-i12)) {
                        ynVar.f43324e9 = false;
                        ynVar.uc();
                        this.f43243a = 0.0f;
                    }
                }
            }
        }
        ynVar.q9();
        ynVar.f43271a9.H();
        ArrayList arrayList = ynVar.f43535va.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).f36446c) {
                ((fz) arrayList.get(i13)).f36445b -= i11;
            }
        }
        zg.i0 i0Var = zg.i0.B;
        if (i0Var != null) {
            i0Var.f53422r -= i11;
            if (i11 != 0) {
                i0Var.f53425u = true;
            }
        }
        ynVar.i7(false);
        ci.e4 e4Var = ynVar.f43527v1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!ynVar.Sb) {
                ynVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(ynVar, 25));
                AndroidUtilities.runOnUIThread(new ug(ynVar, 26), 2000L);
            }
        }
        ul ulVar = ynVar.f43578z1;
        if (ulVar != null && ulVar.V) {
            ulVar.e(true);
        }
        ci.e4 e4Var2 = ynVar.f43553x1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new ug(ynVar, 27));
            AndroidUtilities.runOnUIThread(new ug(ynVar, 28), 2000L);
        }
        ci.e4 e4Var3 = ynVar.f43566y1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            jkVar.l0();
        }
        yh.c4 c4Var = ynVar.nc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = ynVar.Nb;
        if (aVar2 != null && aVar2.f11423b > 0) {
            int childCount = aVar2.f11422a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f11422a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject());
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
                aVar2.c(0, 0L);
            }
        }
    }
}
