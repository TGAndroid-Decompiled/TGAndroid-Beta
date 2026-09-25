package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class yj extends s4.s0 {
    public boolean f40179b;
    public final wn d;
    public float f40178a = 0.0f;
    public final int f40180c = AndroidUtilities.dp(100.0f);

    public yj(wn wnVar) {
        this.d = wnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        wn wnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = wnVar.f39595p2;
            if (u1Var != null) {
                wnVar.f39572n2.e(u1Var, -1, wnVar.f39607q2, wnVar.f39620r2, true);
                wnVar.f39595p2 = null;
            }
            wnVar.j3 = false;
            wnVar.f39536k3 = false;
            wnVar.f39548l3 = false;
            wnVar.f39559m3 = false;
            wnVar.f9(true);
            wnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = wn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            wnVar.f39696x0.setOverScrollMode(0);
            wnVar.f39445c9.W();
            wnVar.Wc(false);
            wnVar.q9(1);
            wnVar.f39642sa = false;
            return;
        }
        ci.e4 e4Var = wnVar.f39710y1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = wnVar.W2;
        if (p6Var != null && p6Var.getVisibility() == 0 && wnVar.x9()) {
            AndroidUtilities.hideKeyboard(wnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            wnVar.D4 = true;
            wnVar.f39548l3 = true;
        } else if (i10 == 1) {
            wnVar.f39595p2 = null;
            wnVar.D4 = true;
            wnVar.j3 = true;
            wnVar.f39536k3 = true;
            wnVar.f39559m3 = true;
            wnVar.f39548l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = wn.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = wnVar.Y9;
        if (tVar != null && tVar.d()) {
            wnVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.h hVar;
        boolean z12;
        boolean z13;
        wn wnVar = this.d;
        wn wnVar2 = wnVar.f39458da;
        if (wnVar2 == null) {
            wnVar2 = wnVar;
        }
        wnVar.f39696x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40179b = z10;
        int L0 = wnVar.f39721z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && wnVar.f39642sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && wnVar.N4 != 0) {
            if (this.f40179b && !wnVar.O4) {
                if (!wnVar.f39696x0.X1 && L0 != -1) {
                    int N0 = wnVar.f39721z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = wnVar.f39721z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.u1) {
                                messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && wnVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < wnVar.N4) {
                        wnVar.N4 = 0;
                    }
                }
            } else {
                wnVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            wnVar.O4 = false;
            if (!wnVar.D4 && i11 != 0) {
                wnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            wnVar.q9(1);
            wnVar.X0.getClass();
            wnVar.h9(true);
        }
        if (i11 != 0 && wnVar.j3 && !wnVar.f39476f3) {
            if (wnVar.L7 != Integer.MAX_VALUE) {
                wnVar.Ia();
                wnVar.Wc(false);
            }
            wnVar.Fb(true);
        }
        if (wnVar.t9() && i11 != 0 && wnVar.f39536k3 && !wnVar.f39476f3) {
            if (wnVar.L7 != Integer.MAX_VALUE) {
                wnVar.Ia();
                wnVar.Wc(false);
            }
            wnVar.Gb(true);
        }
        wnVar.a7(true);
        if (L0 != -1) {
            wnVar.A0.h();
            if (L0 == 0 && wnVar.E6[0]) {
                if (i11 >= 0) {
                    wnVar.f39494g9 = false;
                    wnVar.vc();
                }
            } else {
                aa.a[] aVarArr = wnVar.f39522j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.c) aVar.f360c).f14201f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f40180c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f40178a + i11;
                        this.f40178a = f7;
                        if (f7 > i12) {
                            this.f40178a = 0.0f;
                            wnVar.f39494g9 = true;
                            wnVar.vc();
                            wnVar.f39534k1 = true;
                        }
                    }
                } else if (wnVar.f39534k1 && z12) {
                    float f10 = this.f40178a + i11;
                    this.f40178a = f10;
                    if (f10 < (-i12)) {
                        wnVar.f39494g9 = false;
                        wnVar.vc();
                        this.f40178a = 0.0f;
                    }
                }
            }
        }
        wnVar.r9();
        wnVar.f39445c9.H();
        ArrayList arrayList = wnVar.f39706xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((bz) arrayList.get(i13)).f32515c) {
                ((bz) arrayList.get(i13)).f32514b -= i11;
            }
        }
        zg.k0 k0Var = zg.k0.B;
        if (k0Var != null) {
            k0Var.f49351r -= i11;
            if (i11 != 0) {
                k0Var.f49354u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = wnVar2.F) != null) {
            hVar.f(i10, i11);
        }
        wnVar.i7(false);
        ci.e4 e4Var = wnVar.f39697x1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!wnVar.Ub) {
                wnVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new rg(wnVar, 28));
                AndroidUtilities.runOnUIThread(new rg(wnVar, 29), 2000L);
            }
        }
        ul ulVar = wnVar.B1;
        if (ulVar != null && ulVar.V) {
            ulVar.e(true);
        }
        ci.e4 e4Var2 = wnVar.f39722z1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new xj(wnVar, 0));
            AndroidUtilities.runOnUIThread(new xj(wnVar, 1), 2000L);
        }
        ci.e4 e4Var3 = wnVar.A1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.l0();
        }
        yh.b4 b4Var = wnVar.f39604pc;
        if (b4Var != null) {
            b4Var.invalidate();
        }
        hh.a aVar2 = wnVar.Pb;
        if (aVar2 != null && aVar2.f10481b > 0) {
            int childCount = aVar2.f10480a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f10480a.getChildAt(i14);
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
