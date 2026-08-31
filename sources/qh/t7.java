package qh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.cl0;
public final class t7 extends cg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f46121e;
    public final r7 f46122f;
    public tl0 h;
    public final x7 f46123n;

    public t7(x7 x7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, r7 r7Var, oh.v3 v3Var) {
        this.f46123n = x7Var;
        this.d = context;
        this.f46121e = g6Var;
        this.f46122f = r7Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if ((i10 != 3 || !this.f46123n.T.C) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f46123n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        x7 x7Var = this.f46123n;
        ArrayList arrayList = x7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((n7) x7Var.I.get(i10)).f2505a;
        }
        return -1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        n7 n7Var;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        x7 x7Var = this.f46123n;
        d8 d8Var = x7Var.T;
        ArrayList arrayList = x7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            n7 n7Var2 = (n7) arrayList.get(i10);
            int i15 = m1Var.f5879f;
            View view = m1Var.f5875a;
            boolean z10 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                n7Var = (n7) arrayList.get(i16);
            } else {
                n7Var = null;
            }
            if (n7Var != null && ((i14 = n7Var.f2505a) == i15 || (i14 == 9 && n7Var.f45789q == 1))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 == 3) {
                c8 c8Var = (c8) view;
                boolean z11 = n7Var2.f45786n;
                c8Var.d(z11, !z11);
                int i17 = n7Var2.f45781i;
                float f10 = 1.0f;
                if (i17 > 0) {
                    c8Var.e(i17, n7Var2.f45780g, n7Var2.f45782j);
                    c8Var.b(1.0f, false);
                } else {
                    TLRPC.User user = n7Var2.f45780g;
                    if (user != null) {
                        c8Var.setUser(user);
                        if (n7Var2.f45784l && !n7Var2.f45783k) {
                            f10 = 0.5f;
                        }
                        c8Var.b(f10, false);
                    } else {
                        TLRPC.Chat chat = n7Var2.h;
                        if (chat != null) {
                            c8Var.a(d8.d1(d8Var, chat), chat);
                        }
                    }
                }
                if (!n7Var2.f45783k && !n7Var2.f45784l) {
                    z10 = false;
                }
                c8Var.c(z10, false);
                c8Var.setDivider(z4);
                c8Var.setRedCheckbox(n7Var2.f45785m);
                c8Var.v = d8Var.C;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (n7Var2.f45787o > 0) {
                        tl0 tl0Var = this.h;
                        if (tl0Var != null && tl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + x7Var.Q;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - n7Var2.f45787o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = n7Var2.f45788p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.x0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new f2.x0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f46122f.G)));
                } else if (i15 == 4) {
                    m7 m7Var = (m7) view;
                    CharSequence charSequence = n7Var2.f45778e;
                    CharSequence charSequence2 = n7Var2.f45779f;
                    m7Var.f45679a.setText(charSequence);
                    m7Var.f45680b.setText(charSequence2);
                } else if (i15 == 11) {
                    m7 m7Var2 = (m7) view;
                    m7Var2.f45679a.setText(n7Var2.f45778e);
                    m7Var2.f45680b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((ax0) view).f25362b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (n7Var2.f45778e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(n7Var2.f45778e);
                } else if (i15 == 7) {
                    int i18 = n7Var2.f45777c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.o8) view).j(n7Var2.f45778e, d8Var.f45230x, z4);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.o8) view).j(n7Var2.f45778e, d8Var.f45231y, z4);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.o8) view).j(n7Var2.f45778e, d8Var.f45229w, z4);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = n7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.o8) view).t(n7Var2.f45778e, drawable, z4);
                    } else {
                        ((org.telegram.ui.Cells.o8) view).o(n7Var2.f45778e, n7Var2.f45779f, false, z4);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(n7Var2.f45778e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(d8Var.E, i19, 0);
                    cl0 cl0Var = new cl0(18);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f24367c = a2;
                    w7Var.d = 20;
                    w7Var.f24368e = cl0Var;
                    ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new org.telegram.ui.web.d1(this, 11));
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View jnVar;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            jnVar = new View(context);
        } else if (i10 == 0) {
            jnVar = new View(context);
            jnVar.setTag(35);
        } else if (i10 == 1) {
            jnVar = new View(context);
            jnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.f46121e;
            if (i10 == 3) {
                jnVar = new c8(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new m7(context, g6Var, true);
                } else if (i10 == 11) {
                    jnVar = new m7(context, g6Var, false);
                } else if (i10 == 8) {
                    jnVar = new org.telegram.ui.Cells.m4(context, g6Var);
                    jnVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
                } else if (i10 == 5) {
                    ax0 ax0Var = new ax0(context, null, 1, g6Var);
                    ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    ax0Var.f25364e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ax0Var.f25361a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = ax0Var;
                } else if (i10 == 6) {
                    jnVar = new org.telegram.ui.Cells.a9(context, g6Var);
                    jnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.f46121e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.f46121e, true, false);
                    } else if (i10 == 10) {
                        jnVar = new org.telegram.ui.Cells.x7(context, g6Var);
                    } else {
                        jnVar = new jn(context, 26);
                    }
                    jnVar = o8Var;
                }
                jnVar = view;
            }
        }
        return new f2.m1(jnVar);
    }
}
