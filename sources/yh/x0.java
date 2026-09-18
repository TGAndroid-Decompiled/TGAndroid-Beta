package yh;

import android.graphics.Bitmap;
import android.view.View;
import ci.bc;
import ci.fb;
import ci.nb;
import ci.oc;
import ci.rb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback3 {
    public final int f48195a;
    public final NotificationCenter.NotificationCenterDelegate f48196b;

    public x0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f48195a = i10;
        this.f48196b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        ci.t tVar;
        float f7;
        switch (this.f48195a) {
            case 0:
                ((y3) this.f48196b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                y3.v0((y3) this.f48196b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                oc ocVar = (oc) this.f48196b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (ocVar.f5222f0 == 0 && arrayList != null && !arrayList.isEmpty() && ocVar.f5253p2 == null && !ocVar.W && ocVar.J()) {
                    ocVar.H1 = null;
                    ocVar.I1 = null;
                    ocVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + ocVar.A0.getFilledCount() > ocVar.A0.getTotalCount()) {
                            int size = arrayList.size() + ocVar.A0.getFilledCount();
                            ArrayList a2 = ci.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (ci.t) obj4;
                                    if (tVar.e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                ocVar.A0.o(null);
                                ocVar.A0.e();
                                ocVar.I0.setSelected((ci.t) null);
                                rb rbVar = ocVar.B0;
                                if (rbVar != null) {
                                    rbVar.recordHevc = !ocVar.A0.j();
                                }
                                ocVar.I0.a(false, true);
                                ocVar.m0(true);
                                return;
                            }
                            bc bcVar = ocVar.A0;
                            ocVar.f5286z0 = tVar;
                            bcVar.o(tVar);
                            ocVar.I0.setSelected(tVar);
                            int indexOf = ci.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                ocVar.I0.f5799a.v0(indexOf);
                            }
                            rb rbVar2 = ocVar.B0;
                            if (rbVar2 != null) {
                                rbVar2.recordHevc = !ocVar.A0.j();
                            }
                            ocVar.G0.setDrawable(new ci.u(tVar, false));
                            ocVar.c0(ocVar.H0, ocVar.I0.e, true);
                            ci.l7 l7Var = ocVar.O0;
                            if (ocVar.A0.j()) {
                                f7 = ocVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            l7Var.e(f7, true);
                        }
                    }
                    ocVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ci.o8 l4 = ci.o8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = ocVar.f5271v0;
                            l4.K0 = ocVar.f5275w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (ocVar.A0.l(l4)) {
                                    ocVar.K1 = ci.o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (ocVar.K1 == null) {
                                    ocVar.K1 = l4;
                                } else {
                                    if (ocVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        ocVar.H1 = arrayList3;
                                        arrayList3.add(ocVar.K1);
                                    }
                                    if (ocVar.H1.size() < 10) {
                                        ocVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (ocVar.H1 != null) {
                        ocVar.i0(false, true);
                        ocVar.Q0.a(ocVar.O1);
                        ci.l7 l7Var2 = ocVar.O0;
                        if (ocVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l7Var2.f4957n0 = -1.0f;
                        l7Var2.f4958o0 = z10;
                        l7Var2.invalidate();
                        ocVar.I1 = new ArrayList();
                        ocVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < ocVar.H1.size(); i13 = com.google.android.gms.internal.vision.e2.e(i13, i13, 1, ocVar.J1)) {
                            ocVar.I1.add(Integer.valueOf(i13));
                        }
                        ocVar.A0.n(null);
                        ocVar.I0.a(false, true);
                        ocVar.m0(true);
                        ocVar.f(false);
                        ocVar.K(1, true);
                        fb fbVar = ocVar.f5216d1;
                        if (fbVar != null) {
                            androidx.fragment.app.a0 a0Var = fbVar.h;
                            if (!fbVar.I && !fbVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(a0Var);
                                fbVar.I = true;
                                fbVar.invalidate();
                                AndroidUtilities.runOnUIThread(a0Var, 5500L);
                            }
                        }
                        nb nbVar = ocVar.M0;
                        if (nbVar != null) {
                            ocVar.f5241l2 = nbVar.e.e0();
                            ocVar.f5243m2 = ocVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    ci.o8 o8Var = ocVar.K1;
                    if (o8Var != null) {
                        o8Var.B();
                    }
                    ocVar.I0.a(false, true);
                    ocVar.m0(true);
                    ocVar.f(false);
                    nb nbVar2 = ocVar.M0;
                    if (nbVar2 != null) {
                        ocVar.f5241l2 = nbVar2.e.e0();
                        ocVar.f5243m2 = ocVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
