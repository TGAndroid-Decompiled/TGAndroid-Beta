package yh;

import android.graphics.Bitmap;
import android.view.View;
import ci.cb;
import ci.kb;
import ci.lc;
import ci.ob;
import ci.yb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback3 {
    public final int f47884a;
    public final NotificationCenter.NotificationCenterDelegate f47885b;

    public x0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f47884a = i10;
        this.f47885b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        ci.t tVar;
        float f7;
        switch (this.f47884a) {
            case 0:
                ((y3) this.f47885b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                y3.v0((y3) this.f47885b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                lc lcVar = (lc) this.f47885b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (lcVar.f5044f0 == 0 && arrayList != null && !arrayList.isEmpty() && lcVar.f5075p2 == null && !lcVar.W && lcVar.J()) {
                    lcVar.H1 = null;
                    lcVar.I1 = null;
                    lcVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + lcVar.A0.getFilledCount() > lcVar.A0.getTotalCount()) {
                            int size = arrayList.size() + lcVar.A0.getFilledCount();
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
                                lcVar.A0.o(null);
                                lcVar.A0.e();
                                lcVar.I0.setSelected((ci.t) null);
                                ob obVar = lcVar.B0;
                                if (obVar != null) {
                                    obVar.recordHevc = !lcVar.A0.j();
                                }
                                lcVar.I0.a(false, true);
                                lcVar.m0(true);
                                return;
                            }
                            yb ybVar = lcVar.A0;
                            lcVar.f5108z0 = tVar;
                            ybVar.o(tVar);
                            lcVar.I0.setSelected(tVar);
                            int indexOf = ci.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                lcVar.I0.f5858a.u0(indexOf);
                            }
                            ob obVar2 = lcVar.B0;
                            if (obVar2 != null) {
                                obVar2.recordHevc = !lcVar.A0.j();
                            }
                            lcVar.G0.setDrawable(new ci.u(tVar, false));
                            lcVar.c0(lcVar.H0, lcVar.I0.e, true);
                            ci.j7 j7Var = lcVar.O0;
                            if (lcVar.A0.j()) {
                                f7 = lcVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            j7Var.e(f7, true);
                        }
                    }
                    lcVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ci.l8 l4 = ci.l8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = lcVar.f5093v0;
                            l4.K0 = lcVar.f5097w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (lcVar.A0.l(l4)) {
                                    lcVar.K1 = ci.l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (lcVar.K1 == null) {
                                    lcVar.K1 = l4;
                                } else {
                                    if (lcVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        lcVar.H1 = arrayList3;
                                        arrayList3.add(lcVar.K1);
                                    }
                                    if (lcVar.H1.size() < 10) {
                                        lcVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (lcVar.H1 != null) {
                        lcVar.i0(false, true);
                        lcVar.Q0.a(lcVar.O1);
                        ci.j7 j7Var2 = lcVar.O0;
                        if (lcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j7Var2.f4845n0 = -1.0f;
                        j7Var2.f4846o0 = z10;
                        j7Var2.invalidate();
                        lcVar.I1 = new ArrayList();
                        lcVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < lcVar.H1.size(); i13 = com.google.android.gms.internal.vision.e2.e(i13, i13, 1, lcVar.J1)) {
                            lcVar.I1.add(Integer.valueOf(i13));
                        }
                        lcVar.A0.n(null);
                        lcVar.I0.a(false, true);
                        lcVar.m0(true);
                        lcVar.f(false);
                        lcVar.K(1, true);
                        cb cbVar = lcVar.f5038d1;
                        if (cbVar != null) {
                            androidx.fragment.app.a0 a0Var = cbVar.h;
                            if (!cbVar.I && !cbVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(a0Var);
                                cbVar.I = true;
                                cbVar.invalidate();
                                AndroidUtilities.runOnUIThread(a0Var, 5500L);
                            }
                        }
                        kb kbVar = lcVar.M0;
                        if (kbVar != null) {
                            lcVar.f5063l2 = kbVar.e.e0();
                            lcVar.f5065m2 = lcVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    ci.l8 l8Var = lcVar.K1;
                    if (l8Var != null) {
                        l8Var.B();
                    }
                    lcVar.I0.a(false, true);
                    lcVar.m0(true);
                    lcVar.f(false);
                    kb kbVar2 = lcVar.M0;
                    if (kbVar2 != null) {
                        lcVar.f5063l2 = kbVar2.e.e0();
                        lcVar.f5065m2 = lcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
