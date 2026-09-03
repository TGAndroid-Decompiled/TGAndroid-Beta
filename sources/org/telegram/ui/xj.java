package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class xj extends f2.a1 {
    public boolean f43061b;
    public final xn d;
    public float f43060a = 0.0f;
    public final int f43062c = AndroidUtilities.dp(100.0f);

    public xj(xn xnVar) {
        this.d = xnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        xn xnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = xnVar.f43244m2;
            if (t1Var != null) {
                xnVar.f43220k2.e(t1Var, -1, xnVar.f43257n2, xnVar.f43269o2, true);
                xnVar.f43244m2 = null;
            }
            xnVar.f43172g3 = false;
            xnVar.f43185h3 = false;
            xnVar.f43197i3 = false;
            xnVar.f43209j3 = false;
            xnVar.f9(true);
            xnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = xn.Ec;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            xnVar.f43340u0.setOverScrollMode(0);
            xnVar.Z8.W();
            xnVar.Wc(false);
            xnVar.q9(1);
            xnVar.f43289pa = false;
            return;
        }
        qh.e3 e3Var = xnVar.f43354v1;
        if (e3Var != null && e3Var.S) {
            e3Var.e(true);
        }
        org.telegram.ui.Components.k6 k6Var = xnVar.T2;
        if (k6Var != null && k6Var.getVisibility() == 0 && xnVar.x9()) {
            AndroidUtilities.hideKeyboard(xnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            xnVar.A4 = true;
            xnVar.f43197i3 = true;
        } else if (i10 == 1) {
            xnVar.f43244m2 = null;
            xnVar.A4 = true;
            xnVar.f43172g3 = true;
            xnVar.f43185h3 = true;
            xnVar.f43209j3 = true;
            xnVar.f43197i3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = xn.Ec;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ng.v vVar = xnVar.V9;
        if (vVar != null && vVar.d()) {
            xnVar.V9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        boolean z10;
        og.e eVar;
        boolean z11;
        boolean z12;
        xn xnVar = this.d;
        xn xnVar2 = xnVar.f43100aa;
        if (xnVar2 == null) {
            xnVar2 = xnVar;
        }
        xnVar.f43340u0.invalidate();
        boolean z13 = true;
        if (i11 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f43061b = z4;
        int L0 = xnVar.f43367w0.L0();
        s5.m mVar = null;
        if (((i11 != 0 && xnVar.f43289pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && xnVar.K4 != 0) {
            if (this.f43061b && !xnVar.L4) {
                if (!xnVar.f43340u0.U1 && L0 != -1) {
                    int N0 = xnVar.f43367w0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m9 = xnVar.f43367w0.m(N0);
                            if (m9 instanceof org.telegram.ui.Cells.t1) {
                                messageObject = ((org.telegram.ui.Cells.t1) m9).getMessageObject();
                            } else if (m9 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m9).getMessageObject();
                            }
                            if (messageObject != null && xnVar.K4 == messageObject.getId()) {
                                z12 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12 && messageObject != null && messageObject.getId() < xnVar.K4) {
                        xnVar.K4 = 0;
                    }
                }
            } else {
                xnVar.K4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            xnVar.L4 = false;
            if (!xnVar.A4 && i11 != 0) {
                xnVar.A4 = true;
            }
        }
        if (i11 != 0) {
            xnVar.q9(1);
            xnVar.U0.getClass();
            xnVar.h9(true);
        }
        if (i11 != 0 && xnVar.f43172g3 && !xnVar.c3) {
            if (xnVar.I7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Fb(true);
        }
        if (xnVar.t9() && i11 != 0 && xnVar.f43185h3 && !xnVar.c3) {
            if (xnVar.I7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Gb(true);
        }
        xnVar.a7(true);
        if (L0 != -1) {
            xnVar.f43381x0.h();
            if (L0 == 0 && xnVar.B6[0]) {
                if (i11 >= 0) {
                    xnVar.f43139d9 = false;
                    xnVar.vc();
                }
            } else {
                s5.m[] mVarArr = xnVar.f43170g1.f50622e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((xd.a) mVar.f47094c).f50542f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = this.f43062c;
                if (i11 > 0) {
                    if (!z11) {
                        float f10 = this.f43060a + i11;
                        this.f43060a = f10;
                        if (f10 > i12) {
                            this.f43060a = 0.0f;
                            xnVar.f43139d9 = true;
                            xnVar.vc();
                            xnVar.f43183h1 = true;
                        }
                    }
                } else if (xnVar.f43183h1 && z11) {
                    float f11 = this.f43060a + i11;
                    this.f43060a = f11;
                    if (f11 < (-i12)) {
                        xnVar.f43139d9 = false;
                        xnVar.vc();
                        this.f43060a = 0.0f;
                    }
                }
            }
        }
        xnVar.r9();
        xnVar.Z8.H();
        ArrayList arrayList = xnVar.f43350ua.C;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((bz) arrayList.get(i13)).f35625c) {
                ((bz) arrayList.get(i13)).f35624b -= i11;
            }
        }
        ng.m0 m0Var = ng.m0.B;
        if (m0Var != null) {
            m0Var.f16133r -= i11;
            if (i11 != 0) {
                m0Var.f16136u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar2.C) != null) {
            eVar.f(i10, i11);
        }
        xnVar.i7(false);
        qh.e3 e3Var = xnVar.f43341u1;
        if (e3Var != null) {
            if (e3Var.S) {
                e3Var.e(true);
            } else if (!xnVar.Sb) {
                xnVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ng(xnVar, 28));
                AndroidUtilities.runOnUIThread(new ng(xnVar, 29), 2000L);
            }
        }
        vl vlVar = xnVar.f43396y1;
        if (vlVar != null && vlVar.S) {
            vlVar.e(true);
        }
        qh.e3 e3Var2 = xnVar.f43368w1;
        if (e3Var2 != null && e3Var2.S) {
            e3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new wj(xnVar, 0));
            AndroidUtilities.runOnUIThread(new wj(xnVar, 1), 2000L);
        }
        qh.e3 e3Var3 = xnVar.f43382x1;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            jkVar.l0();
        }
        mh.l5 l5Var = xnVar.nc;
        if (l5Var != null) {
            l5Var.invalidate();
        }
        vg.a aVar = xnVar.Nb;
        if (aVar != null && aVar.f49292b > 0) {
            int childCount = aVar.f49291a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f49291a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        z10 = aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        z10 = aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject());
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    i14++;
                } else {
                    z13 = false;
                    break;
                }
            }
            if (!z13) {
                aVar.c(0, 0L);
            }
        }
    }
}
