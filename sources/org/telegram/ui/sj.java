package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class sj extends f2.a1 {
    public boolean f42414b;
    public final tn d;
    public float f42413a = 0.0f;
    public final int f42415c = AndroidUtilities.dp(100.0f);

    public sj(tn tnVar) {
        this.d = tnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        tn tnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = tnVar.f42877l2;
            if (s1Var != null) {
                tnVar.f42853j2.e(s1Var, -1, tnVar.f42888m2, tnVar.f42901n2, true);
                tnVar.f42877l2 = null;
            }
            tnVar.f42805f3 = false;
            tnVar.f42817g3 = false;
            tnVar.f42829h3 = false;
            tnVar.f42841i3 = false;
            tnVar.f9(true);
            tnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = tn.Dc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            tnVar.f42973t0.setOverScrollMode(0);
            tnVar.Y8.W();
            tnVar.Wc(false);
            tnVar.q9(1);
            tnVar.f42922oa = false;
            return;
        }
        nh.t3 t3Var = tnVar.f42987u1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = tnVar.S2;
        if (o6Var != null && o6Var.getVisibility() == 0 && tnVar.x9()) {
            AndroidUtilities.hideKeyboard(tnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            tnVar.f43054z4 = true;
            tnVar.f42829h3 = true;
        } else if (i10 == 1) {
            tnVar.f42877l2 = null;
            tnVar.f43054z4 = true;
            tnVar.f42805f3 = true;
            tnVar.f42817g3 = true;
            tnVar.f42841i3 = true;
            tnVar.f42829h3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = tn.Dc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        kg.v vVar = tnVar.U9;
        if (vVar != null && vVar.d()) {
            tnVar.U9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        lg.e eVar;
        boolean z12;
        boolean z13;
        tn tnVar = this.d;
        tn tnVar2 = tnVar.Z9;
        if (tnVar2 == null) {
            tnVar2 = tnVar;
        }
        tnVar.f42973t0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42414b = z10;
        int L0 = tnVar.f42999v0.L0();
        l3.g0 g0Var = null;
        if (((i11 != 0 && tnVar.f42922oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && tnVar.J4 != 0) {
            if (this.f42414b && !tnVar.K4) {
                if (!tnVar.f42973t0.T1 && L0 != -1) {
                    int N0 = tnVar.f42999v0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = tnVar.f42999v0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.s1) {
                                messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                            }
                            if (messageObject != null && tnVar.J4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < tnVar.J4) {
                        tnVar.J4 = 0;
                    }
                }
            } else {
                tnVar.J4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            tnVar.K4 = false;
            if (!tnVar.f43054z4 && i11 != 0) {
                tnVar.f43054z4 = true;
            }
        }
        if (i11 != 0) {
            tnVar.q9(1);
            tnVar.T0.getClass();
            tnVar.h9(true);
        }
        if (i11 != 0 && tnVar.f42805f3 && !tnVar.f42753b3) {
            if (tnVar.H7 != Integer.MAX_VALUE) {
                tnVar.Ia();
                tnVar.Wc(false);
            }
            tnVar.Fb(true);
        }
        if (tnVar.t9() && i11 != 0 && tnVar.f42817g3 && !tnVar.f42753b3) {
            if (tnVar.H7 != Integer.MAX_VALUE) {
                tnVar.Ia();
                tnVar.Wc(false);
            }
            tnVar.Gb(true);
        }
        tnVar.a7(true);
        if (L0 != -1) {
            tnVar.f43013w0.h();
            if (L0 == 0 && tnVar.A6[0]) {
                if (i11 >= 0) {
                    tnVar.f42771c9 = false;
                    tnVar.vc();
                }
            } else {
                l3.g0[] g0VarArr = tnVar.f42803f1.f49236e;
                if (1 < g0VarArr.length) {
                    g0Var = g0VarArr[1];
                }
                if (g0Var != null && ((vd.a) g0Var.f14097c).f49506f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f42415c;
                if (i11 > 0) {
                    if (!z12) {
                        float f9 = this.f42413a + i11;
                        this.f42413a = f9;
                        if (f9 > i12) {
                            this.f42413a = 0.0f;
                            tnVar.f42771c9 = true;
                            tnVar.vc();
                            tnVar.f42815g1 = true;
                        }
                    }
                } else if (tnVar.f42815g1 && z12) {
                    float f10 = this.f42413a + i11;
                    this.f42413a = f10;
                    if (f10 < (-i12)) {
                        tnVar.f42771c9 = false;
                        tnVar.vc();
                        this.f42413a = 0.0f;
                    }
                }
            }
        }
        tnVar.r9();
        tnVar.Y8.H();
        ArrayList arrayList = tnVar.f42983ta.B;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((qy) arrayList.get(i13)).f41799c) {
                ((qy) arrayList.get(i13)).f41798b -= i11;
            }
        }
        kg.m0 m0Var = kg.m0.B;
        if (m0Var != null) {
            m0Var.f13779r -= i11;
            if (i11 != 0) {
                m0Var.f13782u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = tnVar2.B) != null) {
            eVar.f(i10, i11);
        }
        tnVar.i7(false);
        nh.t3 t3Var = tnVar.f42974t1;
        if (t3Var != null) {
            if (t3Var.R) {
                t3Var.e(true);
            } else if (!tnVar.Rb) {
                tnVar.Qb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ig(tnVar, 28));
                AndroidUtilities.runOnUIThread(new ig(tnVar, 29), 2000L);
            }
        }
        pl plVar = tnVar.f43028x1;
        if (plVar != null && plVar.R) {
            plVar.e(true);
        }
        nh.t3 t3Var2 = tnVar.f43000v1;
        if (t3Var2 != null && t3Var2.R) {
            t3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new rj(tnVar, 0));
            AndroidUtilities.runOnUIThread(new rj(tnVar, 1), 2000L);
        }
        nh.t3 t3Var3 = tnVar.f43014w1;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            dkVar.l0();
        }
        jh.m5 m5Var = tnVar.f42897mc;
        if (m5Var != null) {
            m5Var.invalidate();
        }
        sg.a aVar = tnVar.Mb;
        if (aVar != null && aVar.f48020b > 0) {
            int childCount = aVar.f48019a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f48019a.getChildAt(i14);
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
