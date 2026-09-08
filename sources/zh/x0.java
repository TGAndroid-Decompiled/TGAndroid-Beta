package zh;

import android.graphics.Bitmap;
import android.view.View;
import bi.oa;
import di.cc;
import di.fb;
import di.ob;
import di.pc;
import di.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback3 {
    public final int f52846a;
    public final NotificationCenter.NotificationCenterDelegate f52847b;

    public x0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f52846a = i10;
        this.f52847b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        di.t tVar;
        float f7;
        switch (this.f52846a) {
            case 0:
                ((w3) this.f52847b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                return;
            case 1:
                w3.v0((w3) this.f52847b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                return;
            default:
                pc pcVar = (pc) this.f52847b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (pcVar.f7888f0 == 0 && arrayList != null && !arrayList.isEmpty() && pcVar.f7919p2 == null && !pcVar.W && pcVar.J()) {
                    pcVar.H1 = null;
                    pcVar.I1 = null;
                    pcVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + pcVar.A0.getFilledCount() > pcVar.A0.getTotalCount()) {
                            int size = arrayList.size() + pcVar.A0.getFilledCount();
                            ArrayList a2 = di.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (di.t) obj4;
                                    if (tVar.f8179e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                pcVar.A0.o(null);
                                pcVar.A0.e();
                                pcVar.I0.setSelected((di.t) null);
                                sb sbVar = pcVar.B0;
                                if (sbVar != null) {
                                    sbVar.recordHevc = !pcVar.A0.j();
                                }
                                pcVar.I0.a(false, true);
                                pcVar.m0(true);
                                return;
                            }
                            cc ccVar = pcVar.A0;
                            pcVar.f7952z0 = tVar;
                            ccVar.o(tVar);
                            pcVar.I0.setSelected(tVar);
                            int indexOf = di.t.a().indexOf(tVar);
                            if (indexOf >= 0) {
                                pcVar.I0.f8468a.u0(indexOf);
                            }
                            sb sbVar2 = pcVar.B0;
                            if (sbVar2 != null) {
                                sbVar2.recordHevc = !pcVar.A0.j();
                            }
                            pcVar.G0.setDrawable(new di.u(tVar, false));
                            pcVar.c0(pcVar.H0, pcVar.I0.f8471e, true);
                            di.l7 l7Var = pcVar.O0;
                            if (pcVar.A0.j()) {
                                f7 = pcVar.A0.getFilledProgress();
                            } else {
                                f7 = 0.0f;
                            }
                            l7Var.e(f7, true);
                        }
                    }
                    pcVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            di.o8 l4 = di.o8.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = pcVar.f7937v0;
                            l4.K0 = pcVar.f7941w0;
                            l4.A();
                            if (bool.booleanValue()) {
                                if (pcVar.A0.l(l4)) {
                                    pcVar.K1 = di.o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
                                } else {
                                    i12++;
                                }
                            } else {
                                if (pcVar.K1 == null) {
                                    pcVar.K1 = l4;
                                } else {
                                    if (pcVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        pcVar.H1 = arrayList3;
                                        arrayList3.add(pcVar.K1);
                                    }
                                    if (pcVar.H1.size() < 10) {
                                        pcVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    if (pcVar.H1 != null) {
                        pcVar.i0(false, true);
                        pcVar.Q0.a(pcVar.O1);
                        di.l7 l7Var2 = pcVar.O0;
                        if (pcVar.O1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l7Var2.f7580n0 = -1.0f;
                        l7Var2.f7581o0 = z10;
                        l7Var2.invalidate();
                        pcVar.I1 = new ArrayList();
                        pcVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < pcVar.H1.size(); i13 = com.google.android.gms.internal.vision.e2.e(i13, i13, 1, pcVar.J1)) {
                            pcVar.I1.add(Integer.valueOf(i13));
                        }
                        pcVar.A0.n(null);
                        pcVar.I0.a(false, true);
                        pcVar.m0(true);
                        pcVar.f(false);
                        pcVar.K(1, true);
                        fb fbVar = pcVar.f7881d1;
                        if (fbVar != null) {
                            oa oaVar = fbVar.h;
                            if (!fbVar.I && !fbVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(oaVar);
                                fbVar.I = true;
                                fbVar.invalidate();
                                AndroidUtilities.runOnUIThread(oaVar, 5500L);
                            }
                        }
                        ob obVar = pcVar.M0;
                        if (obVar != null) {
                            pcVar.f7907l2 = obVar.f8397e.e0();
                            pcVar.f7909m2 = pcVar.M0.getSelectedAlbum();
                            return;
                        }
                        return;
                    }
                    di.o8 o8Var = pcVar.K1;
                    if (o8Var != null) {
                        o8Var.B();
                    }
                    pcVar.I0.a(false, true);
                    pcVar.m0(true);
                    pcVar.f(false);
                    ob obVar2 = pcVar.M0;
                    if (obVar2 != null) {
                        pcVar.f7907l2 = obVar2.f8397e.e0();
                        pcVar.f7909m2 = pcVar.M0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
