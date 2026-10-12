package zh;

import android.graphics.Bitmap;
import android.view.View;
import bi.la;
import di.bb;
import di.jb;
import di.k8;
import di.kc;
import di.nb;
import di.xb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback3 {
    public final int f51261a;
    public final NotificationCenter.NotificationCenterDelegate f51262b;

    public w0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f51261a = i10;
        this.f51262b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        di.t tVar;
        float f7;
        switch (this.f51261a) {
            case 0:
                ((r3) this.f51262b).q2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                r3.w0((r3) this.f51262b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                kc kcVar = (kc) this.f51262b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (kcVar.f7252f0 == 0 && arrayList != null && !arrayList.isEmpty() && kcVar.f7283p2 == null && !kcVar.W && kcVar.I()) {
                    kcVar.H1 = null;
                    kcVar.I1 = null;
                    kcVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + kcVar.A0.getFilledCount() > kcVar.A0.getTotalCount()) {
                            int size = arrayList.size() + kcVar.A0.getFilledCount();
                            ArrayList a2 = di.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (di.t) obj4;
                                    if (tVar.e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                kcVar.A0.o(null);
                                kcVar.A0.e();
                                kcVar.I0.setSelected((di.t) null);
                                nb nbVar = kcVar.B0;
                                if (nbVar != null) {
                                    nbVar.recordHevc = !kcVar.A0.j();
                                }
                                kcVar.I0.a(false, true);
                                kcVar.l0(true);
                                return;
                            }
                            xb xbVar = kcVar.A0;
                            kcVar.f7316z0 = tVar;
                            xbVar.o(tVar);
                            kcVar.I0.setSelected(tVar);
                            int indexOf = di.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                kcVar.I0.f8112a.u0(indexOf);
                            }
                            nb nbVar2 = kcVar.B0;
                            if (nbVar2 != null) {
                                nbVar2.recordHevc = !kcVar.A0.j();
                            }
                            kcVar.G0.setDrawable(new di.u(tVar, false));
                            kcVar.b0(kcVar.H0, kcVar.I0.e, true);
                            di.i7 i7Var = kcVar.O0;
                            if (kcVar.A0.j()) {
                                f7 = kcVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            i7Var.e(f7, true);
                        }
                    }
                    kcVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            k8 l4 = k8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = kcVar.f7301v0;
                            l4.K0 = kcVar.f7305w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (kcVar.A0.l(l4)) {
                                    kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
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
                        kcVar.h0(false, true);
                        kcVar.Q0.a(kcVar.O1);
                        di.i7 i7Var2 = kcVar.O0;
                        if (kcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i7Var2.f7062n0 = -1.0f;
                        i7Var2.f7063o0 = z10;
                        i7Var2.invalidate();
                        kcVar.I1 = new ArrayList();
                        kcVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < kcVar.H1.size(); i13 = com.google.android.gms.internal.play_billing.k3.f(i13, i13, 1, kcVar.J1)) {
                            kcVar.I1.add(Integer.valueOf(i13));
                        }
                        kcVar.A0.n(null);
                        kcVar.I0.a(false, true);
                        kcVar.l0(true);
                        kcVar.e(false);
                        kcVar.J(1, true);
                        bb bbVar = kcVar.f7246d1;
                        if (bbVar != null) {
                            la laVar = bbVar.h;
                            if (!bbVar.I && !bbVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(laVar);
                                bbVar.I = true;
                                bbVar.invalidate();
                                AndroidUtilities.runOnUIThread(laVar, 5500L);
                            }
                        }
                        jb jbVar = kcVar.M0;
                        if (jbVar != null) {
                            kcVar.f7271l2 = jbVar.e.e0();
                            kcVar.f7273m2 = kcVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    k8 k8Var = kcVar.K1;
                    if (k8Var != null) {
                        k8Var.B();
                    }
                    kcVar.I0.a(false, true);
                    kcVar.l0(true);
                    kcVar.e(false);
                    jb jbVar2 = kcVar.M0;
                    if (jbVar2 != null) {
                        kcVar.f7271l2 = jbVar2.e.e0();
                        kcVar.f7273m2 = kcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
