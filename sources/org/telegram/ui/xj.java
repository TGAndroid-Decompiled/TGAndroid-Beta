package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class xj extends s4.u0 {
    public boolean f45711b;
    public final wn d;
    public float f45710a = 0.0f;
    public final int f45712c = AndroidUtilities.dp(100.0f);

    public xj(wn wnVar) {
        this.d = wnVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        wn wnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = wnVar.B2;
            if (s1Var != null) {
                wnVar.f45366z2.e(s1Var, -1, wnVar.C2, wnVar.D2, true);
                wnVar.B2 = null;
            }
            wnVar.f45315v3 = false;
            wnVar.f45328w3 = false;
            wnVar.f45342x3 = false;
            wnVar.y3 = false;
            wnVar.s9(true);
            wnVar.t9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = wn.f45035fd;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            wnVar.f45339x0.setOverScrollMode(0);
            wnVar.f45282s9.V();
            wnVar.nd(false);
            wnVar.Ia = false;
            return;
        }
        fi.v3 v3Var = wnVar.K1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = wnVar.f45153i3;
        if (s6Var != null && s6Var.getVisibility() == 0 && wnVar.I9()) {
            AndroidUtilities.hideKeyboard(wnVar.getParentActivity().getCurrentFocus());
        }
        wnVar.pb = 0;
        wnVar.f45257qb = Integer.MIN_VALUE;
        if (i10 == 2) {
            wnVar.P4 = true;
            wnVar.f45342x3 = true;
        } else if (i10 == 1) {
            wnVar.B2 = null;
            wnVar.P4 = true;
            wnVar.f45315v3 = true;
            wnVar.f45328w3 = true;
            wnVar.y3 = true;
            wnVar.f45342x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = wn.f45035fd;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        bh.x xVar = wnVar.f45234oa;
        if (xVar != null && xVar.d()) {
            wnVar.f45234oa.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        wn wnVar = this.d;
        wnVar.f45339x0.invalidate();
        boolean z14 = true;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45711b = z10;
        int L0 = wnVar.f45364z0.L0();
        k6.c cVar = null;
        if (((i11 != 0 && wnVar.Ia && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && wnVar.Z4 != 0) {
            if (this.f45711b && !wnVar.f45049a5) {
                if (!wnVar.f45339x0.V1 && L0 != -1) {
                    int N0 = wnVar.f45364z0.N0();
                    MessageObject messageObject = null;
                    while (true) {
                        if (N0 >= L0) {
                            View m10 = wnVar.f45364z0.m(N0);
                            if (m10 instanceof org.telegram.ui.Cells.s1) {
                                messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                            } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                                messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                            }
                            if (messageObject != null && wnVar.Z4 == messageObject.getId()) {
                                z13 = true;
                                break;
                            }
                            N0--;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (!z13 && messageObject != null && messageObject.getId() < wnVar.Z4) {
                        wnVar.Z4 = 0;
                    }
                }
            } else {
                wnVar.Z4 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            wnVar.f45049a5 = false;
            if (!wnVar.P4 && i11 != 0) {
                wnVar.P4 = true;
            }
        }
        if (i11 != 0) {
            wnVar.f45163j1.getClass();
            wnVar.u9(true);
        }
        if (i11 != 0 && wnVar.f45315v3 && !wnVar.f45263r3) {
            if (wnVar.f45066b8 != Integer.MAX_VALUE) {
                wnVar.Ua();
                wnVar.nd(false);
            }
            wnVar.Vb(true);
        }
        if (wnVar.E9() && i11 != 0 && wnVar.f45328w3 && !wnVar.f45263r3) {
            if (wnVar.f45066b8 != Integer.MAX_VALUE) {
                wnVar.Ua();
                wnVar.nd(false);
            }
            wnVar.Wb(true);
        }
        wnVar.j7(true);
        if (L0 != -1) {
            wnVar.A0.h();
            if (L0 == 0 && wnVar.U6[0]) {
                if (i11 >= 0) {
                    wnVar.f45334w9 = false;
                    wnVar.Mc();
                }
            } else {
                k6.c[] cVarArr = wnVar.f45313v1.e;
                if (1 < cVarArr.length) {
                    cVar = cVarArr[1];
                }
                if (cVar != null && ((oe.b) cVar.f16406c).f19326f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = this.f45712c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.f45710a + i11;
                        this.f45710a = f7;
                        if (f7 > i12) {
                            this.f45710a = 0.0f;
                            wnVar.f45334w9 = true;
                            wnVar.Mc();
                            wnVar.f45326w1 = true;
                        }
                    }
                } else if (wnVar.f45326w1 && z12) {
                    float f10 = this.f45710a + i11;
                    this.f45710a = f10;
                    if (f10 < (-i12)) {
                        wnVar.f45334w9 = false;
                        wnVar.Mc();
                        this.f45710a = 0.0f;
                    }
                }
            }
        }
        wnVar.C9();
        wnVar.f45282s9.G();
        ArrayList arrayList = wnVar.Na.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((py) arrayList.get(i13)).f42529c) {
                ((py) arrayList.get(i13)).f42528b -= i11;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.f4139r -= i11;
            if (i11 != 0) {
                s0Var.f4142u = true;
            }
        }
        wnVar.r7(false);
        fi.v3 v3Var = wnVar.J1;
        if (v3Var != null) {
            if (v3Var.V) {
                v3Var.e(true);
            } else if (!wnVar.f45323vc) {
                wnVar.f45311uc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new wh(wnVar, 1));
                AndroidUtilities.runOnUIThread(new wh(wnVar, 2), 2000L);
            }
        }
        tl tlVar = wnVar.N1;
        if (tlVar != null && tlVar.V) {
            tlVar.e(true);
        }
        fi.v3 v3Var2 = wnVar.L1;
        if (v3Var2 != null && v3Var2.V) {
            v3Var2.e(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new wh(wnVar, 3));
            AndroidUtilities.runOnUIThread(new wh(wnVar, 4), 2000L);
        }
        fi.v3 v3Var3 = wnVar.M1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.h0();
        }
        bi.m7 m7Var = wnVar.Qc;
        if (m7Var != null) {
            m7Var.invalidate();
        }
        jh.a aVar = wnVar.f45258qc;
        if (aVar != null && aVar.f15917b > 0) {
            int childCount = aVar.f15916a.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 < childCount) {
                    View childAt = aVar.f15916a.getChildAt(i14);
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
