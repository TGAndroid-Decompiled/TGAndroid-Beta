package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class zj extends f2.z0 {
    public boolean f40493b;
    public final zn d;
    public float f40492a = 0.0f;
    public final int f40494c = AndroidUtilities.dp(100.0f);

    public zj(zn znVar) {
        this.d = znVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        zn znVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = znVar.f40663m2;
            if (s1Var != null) {
                znVar.f40639k2.e(s1Var, -1, znVar.f40676n2, znVar.f40688o2, true);
                znVar.f40663m2 = null;
            }
            znVar.f40591g3 = false;
            znVar.f40604h3 = false;
            znVar.f40616i3 = false;
            znVar.f40628j3 = false;
            znVar.f9(true);
            znVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = zn.Ec;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            znVar.f40759u0.setOverScrollMode(0);
            znVar.Z8.W();
            znVar.Wc(false);
            znVar.q9(1);
            znVar.f40708pa = false;
            return;
        }
        ph.f3 f3Var = znVar.f40773v1;
        if (f3Var != null && f3Var.S) {
            f3Var.e(true);
        }
        org.telegram.ui.Components.k6 k6Var = znVar.T2;
        if (k6Var != null && k6Var.getVisibility() == 0 && znVar.x9()) {
            AndroidUtilities.hideKeyboard(znVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            znVar.A4 = true;
            znVar.f40616i3 = true;
        } else if (i10 == 1) {
            znVar.f40663m2 = null;
            znVar.A4 = true;
            znVar.f40591g3 = true;
            znVar.f40604h3 = true;
            znVar.f40628j3 = true;
            znVar.f40616i3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = zn.Ec;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        mg.v vVar = znVar.V9;
        if (vVar != null && vVar.d()) {
            znVar.V9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        boolean z10;
        ng.e eVar;
        boolean z11;
        boolean z12;
        zn znVar = this.d;
        zn znVar2 = znVar.f40520aa;
        if (znVar2 == null) {
            znVar2 = znVar;
        }
        znVar.f40759u0.invalidate();
        boolean z13 = true;
        if (i11 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f40493b = z4;
        int L0 = znVar.f40786w0.L0();
        s5.m mVar = null;
        if (((i11 != 0 && znVar.f40708pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && znVar.K4 != 0) {
            if (this.f40493b && !znVar.L4) {
                if (!znVar.f40759u0.U1 && L0 != -1) {
                    int N0 = znVar.f40786w0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m9 = znVar.f40786w0.m(N0);
                            if (m9 instanceof org.telegram.ui.Cells.s1) {
                                messageObject = ((org.telegram.ui.Cells.s1) m9).getMessageObject();
                            } else if (m9 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m9).getMessageObject();
                            }
                            if (messageObject != null && znVar.K4 == messageObject.getId()) {
                                z12 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12 && messageObject != null && messageObject.getId() < znVar.K4) {
                        znVar.K4 = 0;
                    }
                }
            } else {
                znVar.K4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            znVar.L4 = false;
            if (!znVar.A4 && i11 != 0) {
                znVar.A4 = true;
            }
        }
        if (i11 != 0) {
            znVar.q9(1);
            znVar.U0.getClass();
            znVar.h9(true);
        }
        if (i11 != 0 && znVar.f40591g3 && !znVar.c3) {
            if (znVar.I7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Fb(true);
        }
        if (znVar.t9() && i11 != 0 && znVar.f40604h3 && !znVar.c3) {
            if (znVar.I7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Gb(true);
        }
        znVar.a7(true);
        if (L0 != -1) {
            znVar.f40800x0.h();
            if (L0 == 0 && znVar.B6[0]) {
                if (i11 >= 0) {
                    znVar.f40559d9 = false;
                    znVar.vc();
                }
            } else {
                s5.m[] mVarArr = znVar.f40589g1.e;
                if (1 < mVarArr.length) {
                    mVar = mVarArr[1];
                }
                if (mVar != null && ((xd.a) mVar.f44154c).f46961f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = this.f40494c;
                if (i11 > 0) {
                    if (!z11) {
                        float f10 = this.f40492a + i11;
                        this.f40492a = f10;
                        if (f10 > i12) {
                            this.f40492a = 0.0f;
                            znVar.f40559d9 = true;
                            znVar.vc();
                            znVar.f40602h1 = true;
                        }
                    }
                } else if (znVar.f40602h1 && z11) {
                    float f11 = this.f40492a + i11;
                    this.f40492a = f11;
                    if (f11 < (-i12)) {
                        znVar.f40559d9 = false;
                        znVar.vc();
                        this.f40492a = 0.0f;
                    }
                }
            }
        }
        znVar.r9();
        znVar.Z8.H();
        ArrayList arrayList = znVar.f40769ua.C;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((cz) arrayList.get(i13)).f33261c) {
                ((cz) arrayList.get(i13)).f33260b -= i11;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.f14050r -= i11;
            if (i11 != 0) {
                m0Var.f14053u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = znVar2.C) != null) {
            eVar.f(i10, i11);
        }
        znVar.i7(false);
        ph.f3 f3Var = znVar.f40760u1;
        if (f3Var != null) {
            if (f3Var.S) {
                f3Var.e(true);
            } else if (!znVar.Sb) {
                znVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new pg(znVar, 28));
                AndroidUtilities.runOnUIThread(new pg(znVar, 29), 2000L);
            }
        }
        xl xlVar = znVar.f40815y1;
        if (xlVar != null && xlVar.S) {
            xlVar.e(true);
        }
        ph.f3 f3Var2 = znVar.f40787w1;
        if (f3Var2 != null && f3Var2.S) {
            f3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new yj(znVar, 0));
            AndroidUtilities.runOnUIThread(new yj(znVar, 1), 2000L);
        }
        ph.f3 f3Var3 = znVar.f40801x1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        lk lkVar = znVar.V;
        if (lkVar != null) {
            lkVar.l0();
        }
        lh.l5 l5Var = znVar.nc;
        if (l5Var != null) {
            l5Var.invalidate();
        }
        ug.a aVar = znVar.Nb;
        if (aVar != null && aVar.f45557b > 0) {
            int childCount = aVar.f45556a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f45556a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        z10 = aVar.a(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
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
