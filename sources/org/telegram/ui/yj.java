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
    public boolean f39844b;
    public final xn d;
    public float f39843a = 0.0f;
    public final int f39845c = AndroidUtilities.dp(100.0f);

    public yj(xn xnVar) {
        this.d = xnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        xn xnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = xnVar.f39495p2;
            if (t1Var != null) {
                xnVar.f39472n2.e(t1Var, -1, xnVar.f39507q2, xnVar.f39520r2, true);
                xnVar.f39495p2 = null;
            }
            xnVar.j3 = false;
            xnVar.f39436k3 = false;
            xnVar.f39448l3 = false;
            xnVar.f39459m3 = false;
            xnVar.f9(true);
            xnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = xn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            xnVar.f39596x0.setOverScrollMode(0);
            xnVar.f39345c9.W();
            xnVar.Wc(false);
            xnVar.q9(1);
            xnVar.f39542sa = false;
            return;
        }
        ci.e4 e4Var = xnVar.f39610y1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = xnVar.W2;
        if (p6Var != null && p6Var.getVisibility() == 0 && xnVar.x9()) {
            AndroidUtilities.hideKeyboard(xnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            xnVar.D4 = true;
            xnVar.f39448l3 = true;
        } else if (i10 == 1) {
            xnVar.f39495p2 = null;
            xnVar.D4 = true;
            xnVar.j3 = true;
            xnVar.f39436k3 = true;
            xnVar.f39459m3 = true;
            xnVar.f39448l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = xn.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = xnVar.Y9;
        if (tVar != null && tVar.d()) {
            xnVar.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        ah.h hVar;
        boolean z12;
        boolean z13;
        xn xnVar = this.d;
        xn xnVar2 = xnVar.f39358da;
        if (xnVar2 == null) {
            xnVar2 = xnVar;
        }
        xnVar.f39596x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39844b = z10;
        int L0 = xnVar.f39621z0.L0();
        aa.a aVar = null;
        if (((i11 != 0 && xnVar.f39542sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && xnVar.N4 != 0) {
            if (this.f39844b && !xnVar.O4) {
                if (!xnVar.f39596x0.X1 && L0 != -1) {
                    int N0 = xnVar.f39621z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = xnVar.f39621z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                                messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                            }
                            if (messageObject != null && xnVar.N4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < xnVar.N4) {
                        xnVar.N4 = 0;
                    }
                }
            } else {
                xnVar.N4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            xnVar.O4 = false;
            if (!xnVar.D4 && i11 != 0) {
                xnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            xnVar.q9(1);
            xnVar.X0.getClass();
            xnVar.h9(true);
        }
        if (i11 != 0 && xnVar.j3 && !xnVar.f39376f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Fb(true);
        }
        if (xnVar.t9() && i11 != 0 && xnVar.f39436k3 && !xnVar.f39376f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Gb(true);
        }
        xnVar.a7(true);
        if (L0 != -1) {
            xnVar.A0.h();
            if (L0 == 0 && xnVar.E6[0]) {
                if (i11 >= 0) {
                    xnVar.f39394g9 = false;
                    xnVar.vc();
                }
            } else {
                aa.a[] aVarArr = xnVar.f39422j1.e;
                if (1 < aVarArr.length) {
                    aVar = aVarArr[1];
                }
                if (aVar != null && ((le.c) aVar.f360c).f13963f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f39845c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f39843a + i11;
                        this.f39843a = f7;
                        if (f7 > i12) {
                            this.f39843a = 0.0f;
                            xnVar.f39394g9 = true;
                            xnVar.vc();
                            xnVar.f39434k1 = true;
                        }
                    }
                } else if (xnVar.f39434k1 && z12) {
                    float f10 = this.f39843a + i11;
                    this.f39843a = f10;
                    if (f10 < (-i12)) {
                        xnVar.f39394g9 = false;
                        xnVar.vc();
                        this.f39843a = 0.0f;
                    }
                }
            }
        }
        xnVar.r9();
        xnVar.f39345c9.H();
        ArrayList arrayList = xnVar.f39606xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((cz) arrayList.get(i13)).f32442c) {
                ((cz) arrayList.get(i13)).f32441b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49025r -= i11;
            if (i11 != 0) {
                l0Var.f49028u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = xnVar2.F) != null) {
            hVar.f(i10, i11);
        }
        xnVar.i7(false);
        ci.e4 e4Var = xnVar.f39597x1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!xnVar.Ub) {
                xnVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new sg(xnVar, 28));
                AndroidUtilities.runOnUIThread(new sg(xnVar, 29), 2000L);
            }
        }
        vl vlVar = xnVar.B1;
        if (vlVar != null && vlVar.V) {
            vlVar.e(true);
        }
        ci.e4 e4Var2 = xnVar.f39622z1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new xj(xnVar, 0));
            AndroidUtilities.runOnUIThread(new xj(xnVar, 1), 2000L);
        }
        ci.e4 e4Var3 = xnVar.A1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        jk jkVar = xnVar.Y;
        if (jkVar != null) {
            jkVar.m0();
        }
        yh.c4 c4Var = xnVar.f39504pc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = xnVar.Pb;
        if (aVar2 != null && aVar2.f10481b > 0) {
            int childCount = aVar2.f10480a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar2.f10480a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        z11 = aVar2.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
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
