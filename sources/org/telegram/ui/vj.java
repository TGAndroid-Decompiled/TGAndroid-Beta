package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vj extends s4.u0 {
    public boolean f44833b;
    public final un d;
    public float f44832a = 0.0f;
    public final int f44834c = AndroidUtilities.dp(100.0f);

    public vj(un unVar) {
        this.d = unVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        un unVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = unVar.B2;
            if (s1Var != null) {
                unVar.f44495z2.e(s1Var, -1, unVar.C2, unVar.D2, true);
                unVar.B2 = null;
            }
            unVar.f44444v3 = false;
            unVar.f44457w3 = false;
            unVar.f44471x3 = false;
            unVar.y3 = false;
            unVar.p9(true);
            unVar.q9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = un.f44168bd;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            unVar.f44468x0.setOverScrollMode(0);
            unVar.f44362o9.V();
            unVar.jd(false);
            unVar.Ea = false;
            return;
        }
        fi.v3 v3Var = unVar.K1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = unVar.f44282i3;
        if (s6Var != null && s6Var.getVisibility() == 0 && unVar.F9()) {
            AndroidUtilities.hideKeyboard(unVar.getParentActivity().getCurrentFocus());
        }
        unVar.f44325lb = 0;
        unVar.f44337mb = Integer.MIN_VALUE;
        if (i10 == 2) {
            unVar.P4 = true;
            unVar.f44471x3 = true;
        } else if (i10 == 1) {
            unVar.B2 = null;
            unVar.P4 = true;
            unVar.f44444v3 = true;
            unVar.f44457w3 = true;
            unVar.y3 = true;
            unVar.f44471x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = un.f44168bd;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        bh.x xVar = unVar.f44313ka;
        if (xVar != null && xVar.d()) {
            unVar.f44313ka.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        un unVar = this.d;
        unVar.f44468x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44833b = z10;
        int L0 = unVar.f44493z0.L0();
        k6.c cVar = null;
        if (((i11 != 0 && unVar.Ea && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && unVar.Z4 != 0) {
            if (this.f44833b && !unVar.f44181a5) {
                if (!unVar.f44468x0.V1 && L0 != -1) {
                    int N0 = unVar.f44493z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = unVar.f44493z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.s1) {
                                messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                            }
                            if (messageObject != null && unVar.Z4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < unVar.Z4) {
                        unVar.Z4 = 0;
                    }
                }
            } else {
                unVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            unVar.f44181a5 = false;
            if (!unVar.P4 && i11 != 0) {
                unVar.P4 = true;
            }
        }
        if (i11 != 0) {
            unVar.f44292j1.getClass();
            unVar.r9(true);
        }
        if (i11 != 0 && unVar.f44444v3 && !unVar.f44392r3) {
            if (unVar.X7 != Integer.MAX_VALUE) {
                unVar.Ra();
                unVar.jd(false);
            }
            unVar.Rb(true);
        }
        if (unVar.B9() && i11 != 0 && unVar.f44457w3 && !unVar.f44392r3) {
            if (unVar.X7 != Integer.MAX_VALUE) {
                unVar.Ra();
                unVar.jd(false);
            }
            unVar.Sb(true);
        }
        unVar.h7(true);
        if (L0 != -1) {
            unVar.A0.h();
            if (L0 == 0 && unVar.Q6[0]) {
                if (i11 >= 0) {
                    unVar.f44411s9 = false;
                    unVar.Ic();
                }
            } else {
                k6.c[] cVarArr = unVar.f44442v1.e;
                if (1 < cVarArr.length) {
                    cVar = cVarArr[1];
                }
                if (cVar != null && ((oe.b) cVar.f16407c).f19327f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f44834c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f44832a + i11;
                        this.f44832a = f7;
                        if (f7 > i12) {
                            this.f44832a = 0.0f;
                            unVar.f44411s9 = true;
                            unVar.Ic();
                            unVar.f44455w1 = true;
                        }
                    }
                } else if (unVar.f44455w1 && z12) {
                    float f10 = this.f44832a + i11;
                    this.f44832a = f10;
                    if (f10 < (-i12)) {
                        unVar.f44411s9 = false;
                        unVar.Ic();
                        this.f44832a = 0.0f;
                    }
                }
            }
        }
        unVar.z9();
        unVar.f44362o9.G();
        ArrayList arrayList = unVar.Ja.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ny) arrayList.get(i13)).f42018c) {
                ((ny) arrayList.get(i13)).f42017b -= i11;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.f4139r -= i11;
            if (i11 != 0) {
                s0Var.f4142u = true;
            }
        }
        unVar.p7(false);
        fi.v3 v3Var = unVar.J1;
        if (v3Var != null) {
            if (v3Var.V) {
                v3Var.e(true);
            } else if (!unVar.f44400rc) {
                unVar.f44387qc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new uj(unVar, 0));
                AndroidUtilities.runOnUIThread(new uj(unVar, 1), 2000L);
            }
        }
        rl rlVar = unVar.N1;
        if (rlVar != null && rlVar.V) {
            rlVar.e(true);
        }
        fi.v3 v3Var2 = unVar.L1;
        if (v3Var2 != null && v3Var2.V) {
            v3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new uj(unVar, 2));
            AndroidUtilities.runOnUIThread(new uj(unVar, 3), 2000L);
        }
        fi.v3 v3Var3 = unVar.M1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            hkVar.i0();
        }
        bi.m7 m7Var = unVar.Mc;
        if (m7Var != null) {
            m7Var.invalidate();
        }
        jh.a aVar = unVar.f44338mc;
        if (aVar != null && aVar.f15918b > 0) {
            int childCount = aVar.f15917a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f15917a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        z11 = aVar.a(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
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
