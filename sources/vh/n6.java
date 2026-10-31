package vh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.tk0;
public final class n6 extends hg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final k6 f51566f;
    public tk0 h;
    public final r6 f51567n;

    public n6(r6 r6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, k6 k6Var, th.r2 r2Var) {
        this.f51567n = r6Var;
        this.d = context;
        this.e = p6Var;
        this.f51566f = k6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if ((i10 != 3 || !this.f51567n.W.f52113w1) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f51567n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i10) {
        r6 r6Var = this.f51567n;
        ArrayList arrayList = r6Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((g6) r6Var.L.get(i10)).f7680a;
        }
        return -1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        g6 g6Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        r6 r6Var = this.f51567n;
        w6 w6Var = r6Var.W;
        ArrayList arrayList = r6Var.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            g6 g6Var2 = (g6) arrayList.get(i10);
            int i14 = c1Var.f47901f;
            View view = c1Var.f47898a;
            boolean z11 = true;
            int i15 = i10 + 1;
            if (i15 < arrayList.size()) {
                g6Var = (g6) arrayList.get(i15);
            } else {
                g6Var = null;
            }
            if (g6Var != null && ((i13 = g6Var.f7680a) == i14 || (i13 == 9 && g6Var.f51211q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i14 == 3) {
                v6 v6Var = (v6) view;
                boolean z12 = g6Var2.f51208n;
                v6Var.d(z12, !z12);
                int i16 = g6Var2.f51203i;
                float f7 = 1.0f;
                if (i16 > 0) {
                    v6Var.e(i16, g6Var2.f51204j, g6Var2.f51202g);
                    v6Var.b(false, 1.0f);
                } else {
                    TLRPC.User user = g6Var2.f51202g;
                    if (user != null) {
                        v6Var.setUser(user);
                        if (g6Var2.f51206l && !g6Var2.f51205k) {
                            f7 = 0.5f;
                        }
                        v6Var.b(false, f7);
                    } else {
                        TLRPC.Chat chat = g6Var2.h;
                        if (chat != null) {
                            v6Var.a(w6.K0(w6Var, chat), chat);
                        }
                    }
                }
                if (!g6Var2.f51205k && !g6Var2.f51206l) {
                    z11 = false;
                }
                v6Var.c(z11, false);
                v6Var.setDivider(z10);
                v6Var.setRedCheckbox(g6Var2.f51207m);
                v6Var.f52062w = w6Var.f52113w1;
            } else if (i14 != 2) {
                if (i14 == 0) {
                    view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                } else if (i14 == -1) {
                    if (g6Var2.f51209o > 0) {
                        tk0 tk0Var = this.h;
                        if (tk0Var != null && tk0Var.getMeasuredHeight() > 0) {
                            i12 = this.h.getMeasuredHeight() + r6Var.T;
                        } else {
                            i12 = org.telegram.messenger.i0.f16026q.y;
                        }
                        i11 = Math.max(i12 - g6Var2.f51209o, org.telegram.messenger.i0.L(120.0f));
                        view.setTag(33);
                    } else {
                        i11 = g6Var2.f51210p;
                        if (i11 >= 0) {
                            view.setTag(null);
                        } else {
                            i11 = (int) (org.telegram.messenger.i0.f16026q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.o0(-1, i11));
                } else if (i14 == 1) {
                    view.setLayoutParams(new s4.o0(-1, Math.min(org.telegram.messenger.i0.L(150.0f), this.f51566f.K)));
                } else if (i14 == 4) {
                    f6 f6Var = (f6) view;
                    CharSequence charSequence = g6Var2.e;
                    CharSequence charSequence2 = g6Var2.f51201f;
                    f6Var.f51163a.setText(charSequence);
                    f6Var.f51164b.setText(charSequence2);
                } else if (i14 == 11) {
                    f6 f6Var2 = (f6) view;
                    f6Var2.f51163a.setText(g6Var2.e);
                    f6Var2.f51164b.setText((CharSequence) null);
                } else if (i14 == 5) {
                    try {
                        ((dw0) view).f25550b.getImageReceiver().P0(false);
                    } catch (Exception unused) {
                    }
                } else if (i14 == 6) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    if (g6Var2.e == null) {
                        b9Var.setFixedSize(12);
                        b9Var.setText(null);
                        return;
                    }
                    b9Var.setFixedSize(0);
                    b9Var.setText(g6Var2.e);
                } else if (i14 == 7) {
                    int i17 = g6Var2.f51200c;
                    if (i17 == 0) {
                        ((org.telegram.ui.Cells.p8) view).l(g6Var2.e, w6Var.f52110t1, z10);
                    } else if (i17 == 1) {
                        ((org.telegram.ui.Cells.p8) view).l(g6Var2.e, w6Var.f52111u1, z10);
                    } else if (i17 == 2) {
                        ((org.telegram.ui.Cells.p8) view).l(g6Var2.e, w6Var.f52109s1, z10);
                    }
                } else if (i14 == 9) {
                    Drawable drawable = g6Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.p8) view).v(g6Var2.e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.p8) view).q(g6Var2.e, g6Var2.f51201f, false, z10);
                    }
                } else if (i14 == 8) {
                    ((org.telegram.ui.Cells.p4) view).setText(g6Var2.e);
                } else if (i14 == 10) {
                    int i18 = w6.U1;
                    int i19 = (int) vp.r1(w6Var.f21583a).J6;
                    int[] a2 = org.telegram.ui.Cells.x7.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i19);
                    int j10 = Utilities.j(w6Var.f52115y1, i19, 0);
                    th.m1 m1Var = new th.m1(14);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f23408c = a2;
                    w7Var.d = 20;
                    w7Var.e = m1Var;
                    ((org.telegram.ui.Cells.x7) view).d(j10, w7Var, new m6(this, 0));
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View bnVar;
        org.telegram.ui.Cells.p8 p8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            bnVar = new View(context);
        } else if (i10 == 0) {
            bnVar = new View(context);
            bnVar.setTag(35);
        } else if (i10 == 1) {
            bnVar = new View(context);
            bnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.e;
            if (i10 == 3) {
                bnVar = new v6(context, p6Var);
            } else {
                if (i10 == 4) {
                    view = new f6(context, p6Var, true);
                } else if (i10 == 11) {
                    bnVar = new f6(context, p6Var, false);
                } else if (i10 == 8) {
                    bnVar = new org.telegram.ui.Cells.p4(context, p6Var);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, bnVar, p6Var);
                } else if (i10 == 5) {
                    dw0 dw0Var = new dw0(context, null, 1, p6Var);
                    dw0Var.d.setText(cd.L0(2131748183, null));
                    dw0Var.e.setText(cd.L0(2131745824, null));
                    dw0Var.f25549a.setTranslationY(org.telegram.messenger.i0.L(24.0f));
                    view = dw0Var;
                } else if (i10 == 6) {
                    bnVar = new org.telegram.ui.Cells.b9(context, p6Var);
                    bnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        bnVar = new org.telegram.ui.Cells.x7(context, p6Var);
                    } else {
                        bnVar = new bn(context, 26);
                    }
                    bnVar = p8Var;
                }
                bnVar = view;
            }
        }
        return new s4.c1(bnVar);
    }
}
