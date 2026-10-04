package yh;

import android.graphics.Bitmap;
import android.view.View;
import ci.bb;
import ci.jb;
import ci.kc;
import ci.nb;
import ci.xb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback3 {
    public final int f52179a;
    public final NotificationCenter.NotificationCenterDelegate f52180b;

    public x0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f52179a = i10;
        this.f52180b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        ci.t tVar;
        float f7;
        switch (this.f52179a) {
            case 0:
                ((x3) this.f52180b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                x3.v0((x3) this.f52180b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                kc kcVar = (kc) this.f52180b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (kcVar.f5392f0 == 0 && arrayList != null && !arrayList.isEmpty() && kcVar.f5423p2 == null && !kcVar.W && kcVar.J()) {
                    kcVar.H1 = null;
                    kcVar.I1 = null;
                    kcVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + kcVar.A0.getFilledCount() > kcVar.A0.getTotalCount()) {
                            int size = arrayList.size() + kcVar.A0.getFilledCount();
                            ArrayList a2 = ci.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (ci.t) obj4;
                                    if (tVar.f5940e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                kcVar.A0.o(null);
                                kcVar.A0.e();
                                kcVar.I0.setSelected((ci.t) null);
                                nb nbVar = kcVar.B0;
                                if (nbVar != null) {
                                    nbVar.recordHevc = !kcVar.A0.j();
                                }
                                kcVar.I0.a(false, true);
                                kcVar.m0(true);
                                return;
                            }
                            xb xbVar = kcVar.A0;
                            kcVar.f5456z0 = tVar;
                            xbVar.o(tVar);
                            kcVar.I0.setSelected(tVar);
                            int indexOf = ci.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                kcVar.I0.f6323a.v0(indexOf);
                            }
                            nb nbVar2 = kcVar.B0;
                            if (nbVar2 != null) {
                                nbVar2.recordHevc = !kcVar.A0.j();
                            }
                            kcVar.G0.setDrawable(new ci.u(tVar, false));
                            kcVar.c0(kcVar.H0, kcVar.I0.f6326e, true);
                            ci.j7 j7Var = kcVar.O0;
                            if (kcVar.A0.j()) {
                                f7 = kcVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            j7Var.e(f7, true);
                        }
                    }
                    kcVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ci.k8 l4 = ci.k8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = kcVar.f5441v0;
                            l4.K0 = kcVar.f5445w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (kcVar.A0.l(l4)) {
                                    kcVar.K1 = ci.k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (kcVar.K1 == null) {
                                    kcVar.K1 = l4;
                                } else {
                                    if (kcVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        kcVar.H1 = arrayList3;
                                        arrayList3.add(kcVar.K1);
                                    }
                                    if (kcVar.H1.size() < 10) {
                                        kcVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (kcVar.H1 != null) {
                        kcVar.i0(false, true);
                        kcVar.Q0.a(kcVar.O1);
                        ci.j7 j7Var2 = kcVar.O0;
                        if (kcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j7Var2.f5233n0 = -1.0f;
                        j7Var2.f5234o0 = z10;
                        j7Var2.invalidate();
                        kcVar.I1 = new ArrayList();
                        kcVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < kcVar.H1.size(); i13 = com.google.android.gms.internal.vision.e2.e(i13, i13, 1, kcVar.J1)) {
                            kcVar.I1.add(Integer.valueOf(i13));
                        }
                        kcVar.A0.n(null);
                        kcVar.I0.a(false, true);
                        kcVar.m0(true);
                        kcVar.f(false);
                        kcVar.K(1, true);
                        bb bbVar = kcVar.f5385d1;
                        if (bbVar != null) {
                            androidx.fragment.app.a0 a0Var = bbVar.h;
                            if (!bbVar.I && !bbVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(a0Var);
                                bbVar.I = true;
                                bbVar.invalidate();
                                AndroidUtilities.runOnUIThread(a0Var, 5500L);
                            }
                        }
                        jb jbVar = kcVar.M0;
                        if (jbVar != null) {
                            kcVar.f5411l2 = jbVar.f6214e.e0();
                            kcVar.f5413m2 = kcVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    ci.k8 k8Var = kcVar.K1;
                    if (k8Var != null) {
                        k8Var.B();
                    }
                    kcVar.I0.a(false, true);
                    kcVar.m0(true);
                    kcVar.f(false);
                    jb jbVar2 = kcVar.M0;
                    if (jbVar2 != null) {
                        kcVar.f5411l2 = jbVar2.f6214e.e0();
                        kcVar.f5413m2 = kcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
