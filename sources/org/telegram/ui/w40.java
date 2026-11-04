package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w40 extends org.telegram.ui.Components.sj0 {
    public final Context f50704c;
    public int d;
    public final ArrayList f50705e = new ArrayList();
    public final y40 f50706f;

    public w40(y40 y40Var, Context context) {
        this.f50706f = y40Var;
        this.f50704c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            ((org.telegram.ui.Cells.h4) d1Var.f55540a).f29326a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 4) {
            if (i3 != 6 || !this.f50706f.R) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f50705e.size();
    }

    @Override
    public final int d(int i3) {
        return ((v40) this.f50705e.get(i3)).f54715a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f50705e;
        arrayList.clear();
        arrayList.add(new sg.a(0, true));
        y40 y40Var = this.f50706f;
        if (y40Var.Q == 5) {
            arrayList.add(new sg.a(6, true));
            arrayList.add(new v40(org.telegram.messenger.bd.M0(2131750589, null)));
        } else {
            arrayList.add(new sg.a(4, true));
            arrayList.add(new v40(org.telegram.messenger.bd.M0(2131749463, null)));
        }
        if (y40Var.U != null) {
            arrayList.add(new sg.a(1, true));
            arrayList.add(new sg.a(3, true));
            arrayList.add(new sg.a(0, true));
        }
        if (y40Var.L.size() > 0) {
            arrayList.add(new sg.a(1, true));
            this.d = arrayList.size();
            for (int i3 = 0; i3 < y40Var.L.size(); i3++) {
                arrayList.add(new sg.a(2, true));
            }
            arrayList.add(new sg.a(7, true));
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String c02;
        boolean z10;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        ArrayList arrayList = this.f50705e;
        boolean z11 = false;
        y40 y40Var = this.f50706f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (y40Var.U != null && i3 == 1) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131753961, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.bd.G(y40Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(y40Var.getMessagesController().a2((Long) y40Var.L.get(i3 - this.d)), null, null);
                if (i3 != arrayList.size() - 1) {
                    z11 = true;
                }
                h4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.v9) view).b(y40Var.U, false);
                return;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i11 = y40Var.X;
                if (i11 == 0) {
                    c02 = org.telegram.messenger.bd.M0(2131747447, null);
                } else {
                    c02 = org.telegram.messenger.bd.c0(i11);
                }
                String str = c02;
                String M0 = org.telegram.messenger.bd.M0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.d2) y40Var).fragmentBeginToShow;
                l8Var.u(M0, str, z10, 2131232060, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((v40) arrayList.get(i3)).f50379c);
                return;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.n(2131232407, org.telegram.messenger.bd.M0(2131752281, null), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f50704c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    n4Var = new org.telegram.ui.Cells.v9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    n4Var = view;
                                }
                            } else {
                                n4Var = new org.telegram.ui.Cells.l8(23, this.f50704c, this.f50706f.getResourceProvider(), false, true);
                            }
                        } else {
                            n4Var = new org.telegram.ui.Cells.y8(context);
                        }
                    } else {
                        n4Var = new org.telegram.ui.Cells.l8(context);
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.h4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                n4Var2.setHeight(46);
                n4Var = n4Var2;
            }
        } else {
            n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        }
        return new u4.d1(n4Var);
    }
}
