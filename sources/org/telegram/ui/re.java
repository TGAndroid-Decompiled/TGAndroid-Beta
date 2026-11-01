package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class re implements org.telegram.ui.Components.f50, org.telegram.ui.Components.i50, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.wn, org.telegram.messenger.as, org.telegram.ui.Components.ti0, ResultCallback, ei.n, oh.d, bh.a, p50, ms, bh.b, org.telegram.ui.Components.jk0, bh.g {
    public final int f41065a;
    public final un f41066b;

    public re(un unVar, int i10) {
        this.f41065a = i10;
        this.f41066b = unVar;
    }

    @Override
    public void a() {
        un unVar = this.f41066b;
        if (unVar.M3 == null && unVar.getParentActivity() != null) {
            unVar.c8();
            unVar.M3.m(unVar.f42108j6, unVar.f42054f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f41065a) {
            case 4:
                un.d1(this.f41066b, document);
                return;
            default:
                un.v1(this.f41066b, document);
                return;
        }
    }

    @Override
    public void c(boolean z10, boolean z11) {
        un unVar = this.f41066b;
        unVar.f41990a1.i(unVar.f42300ya.b(), z10, z11);
    }

    @Override
    public void d(int i10) {
        un unVar = this.f41066b;
        if (i10 == 1) {
            unVar.pa();
        } else if (i10 == 2) {
            unVar.ca();
        } else if (i10 == 3) {
            unVar.P4 = true;
            unVar.getMessagesController().v1(unVar.f42108j6, unVar.b(), unVar.f42304z1, true, new hg(unVar, 0));
        } else if (i10 == 4) {
            unVar.P4 = true;
            unVar.getMessagesController().v1(unVar.f42108j6, unVar.b(), unVar.A1, false, new hg(unVar, 1));
        } else if (i10 == 6) {
            unVar.q9(true);
        } else if (i10 == 5) {
            unVar.q9(false);
        } else if (i10 == 0) {
            ag.v vVar = unVar.X1;
            if (vVar != null) {
                vVar.v1(0, null);
            }
            unVar.sa();
        }
    }

    @Override
    public boolean f(int i10, View view) {
        un unVar = this.f41066b;
        boolean z10 = false;
        if (unVar.getParentActivity() != null) {
            zf.x0 adapter = unVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                zf.x0 adapter2 = unVar.W1.getAdapter();
                if (adapter2.f55690w0 != null && !adapter2.f55672h0) {
                    return false;
                }
                Object J = unVar.W1.getAdapter().J(i10 - 1);
                if (J instanceof zf.u0) {
                    zf.u0 u0Var = (zf.u0) J;
                    if (unVar.W1.getAdapter().J != null && org.telegram.ui.Components.c51.h) {
                        unVar.Z.setFieldText("");
                        mk mkVar = unVar.Z;
                        String str = u0Var.f55649a;
                        TLRPC.Chat chat = unVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.Y0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (unVar.W1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.c51.h) {
                            unVar.Z.setFieldText("");
                            mk mkVar2 = unVar.Z;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = unVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            mkVar2.Y0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42288xa);
                        String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new re(unVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        unVar.showDialog(x1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void g(int i10, ArrayList arrayList) {
        un unVar = this.f41066b;
        unVar.getMessagesController().o(unVar.e, unVar, arrayList, i10, null, null, null);
        unVar.getMessagesController().h2(unVar.f42108j6, unVar.f42054f, unVar.e);
        unVar.qd(true);
        unVar.Nc(true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f41065a) {
            case 2:
                rk rkVar = this.f41066b.D0;
                if (rkVar != null) {
                    rkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f41066b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            default:
                un unVar = this.f41066b;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) unVar.V4.get(Integer.valueOf(unVar.X4));
                if (kjVar == null) {
                    kjVar = (org.telegram.messenger.kj) unVar.E6[0].get(unVar.X4);
                }
                unVar.Bc(kjVar);
                return;
            case 6:
                un unVar2 = this.f41066b;
                org.telegram.messenger.oj ojVar = unVar2.f42257v5;
                if (ojVar != null) {
                    ojVar.d(null, unVar2.f42108j6);
                }
                unVar2.w8();
                return;
            case 7:
                this.f41066b.xa(1);
                return;
            case 8:
                un unVar3 = this.f41066b;
                unVar3.getMessagesController().c5(null, unVar3.f42054f.f19943id);
                return;
            case 10:
                this.f41066b.finishFragment();
                return;
            case 12:
                zf.x0 adapter = this.f41066b.W1.getAdapter();
                adapter.f55691x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.t90 t90Var = adapter.V;
                if (t90Var != null) {
                    t90Var.a(false);
                    return;
                }
                return;
            case 15:
                un unVar4 = this.f41066b;
                unVar4.showDialog(new vl(unVar4, unVar4.getParentActivity(), unVar4));
                return;
            case 16:
                un unVar5 = this.f41066b;
                unVar5.c8();
                UndoView undoView = unVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 18:
                un unVar6 = this.f41066b;
                org.telegram.messenger.oj ojVar2 = unVar6.f42257v5;
                if (ojVar2 != null && ojVar2.d != null) {
                    unVar6.xa(0);
                    return;
                }
                return;
            case 19:
                this.f41066b.w9(true);
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        un unVar = this.f41066b;
        org.telegram.messenger.at notificationCenter = unVar.getNotificationCenter();
        int i10 = org.telegram.messenger.at.f14786t;
        notificationCenter.n(unVar, i10);
        unVar.getNotificationCenter().k(i10, new Object[0]);
        unVar.finishFragment();
        unVar.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(unVar.f42108j6), unVar.f42054f, unVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void j(int i10) {
        un.Y0(this.f41066b, i10);
    }

    @Override
    public void l(ArrayList arrayList) {
        switch (this.f41065a) {
            case 11:
                un unVar = this.f41066b;
                if (unVar.getParentActivity() != null && unVar.getParentActivity() != null) {
                    mi miVar = new mi(unVar, unVar, unVar.getParentActivity(), unVar.f42288xa, arrayList);
                    boolean O9 = unVar.O9();
                    miVar.f21602h0 = O9;
                    miVar.f21607n = O9;
                    miVar.f21609o0 = false;
                    unVar.M7(false);
                    unVar.showDialog(miVar);
                    return;
                }
                return;
            default:
                un unVar2 = this.f41066b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    gj gjVar = new gj(unVar2, unVar2, unVar2.getParentActivity(), unVar2.f42288xa, arrayList);
                    boolean O92 = unVar2.O9();
                    gjVar.f21602h0 = O92;
                    gjVar.f21607n = O92;
                    gjVar.f21609o0 = false;
                    unVar2.M7(false);
                    unVar2.showDialog(gjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
        un unVar = this.f41066b;
        sn snVar = unVar.f42288xa;
        TLRPC.WallPaper wallPaper = snVar.f41402g;
        if (unVar.f42061f6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.r(y3Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void e(TLRPC.User user) {
    }
}
