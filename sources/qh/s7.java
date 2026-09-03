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
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;
public final class s7 extends cg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f46101e;
    public final q7 f46102f;
    public sl0 h;
    public final w7 f46103n;

    public s7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, q7 q7Var, oh.v3 v3Var) {
        this.f46103n = w7Var;
        this.d = context;
        this.f46101e = g6Var;
        this.f46102f = q7Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if ((i10 != 3 || !this.f46103n.T.C) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f46103n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        w7 w7Var = this.f46103n;
        ArrayList arrayList = w7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((m7) w7Var.I.get(i10)).f2505a;
        }
        return -1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        m7 m7Var;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        w7 w7Var = this.f46103n;
        c8 c8Var = w7Var.T;
        ArrayList arrayList = w7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            m7 m7Var2 = (m7) arrayList.get(i10);
            int i15 = m1Var.f5879f;
            View view = m1Var.f5875a;
            boolean z10 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                m7Var = (m7) arrayList.get(i16);
            } else {
                m7Var = null;
            }
            if (m7Var != null && ((i14 = m7Var.f2505a) == i15 || (i14 == 9 && m7Var.f45766q == 1))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 == 3) {
                b8 b8Var = (b8) view;
                boolean z11 = m7Var2.f45763n;
                b8Var.d(z11, !z11);
                int i17 = m7Var2.f45758i;
                float f10 = 1.0f;
                if (i17 > 0) {
                    b8Var.e(i17, m7Var2.f45757g, m7Var2.f45759j);
                    b8Var.b(1.0f, false);
                } else {
                    TLRPC.User user = m7Var2.f45757g;
                    if (user != null) {
                        b8Var.setUser(user);
                        if (m7Var2.f45761l && !m7Var2.f45760k) {
                            f10 = 0.5f;
                        }
                        b8Var.b(f10, false);
                    } else {
                        TLRPC.Chat chat = m7Var2.h;
                        if (chat != null) {
                            b8Var.a(c8.d1(c8Var, chat), chat);
                        }
                    }
                }
                if (!m7Var2.f45760k && !m7Var2.f45761l) {
                    z10 = false;
                }
                b8Var.c(z10, false);
                b8Var.setDivider(z4);
                b8Var.setRedCheckbox(m7Var2.f45762m);
                b8Var.v = c8Var.C;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (m7Var2.f45764o > 0) {
                        sl0 sl0Var = this.h;
                        if (sl0Var != null && sl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + w7Var.Q;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - m7Var2.f45764o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = m7Var2.f45765p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.x0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new f2.x0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f46102f.G)));
                } else if (i15 == 4) {
                    l7 l7Var = (l7) view;
                    CharSequence charSequence = m7Var2.f45755e;
                    CharSequence charSequence2 = m7Var2.f45756f;
                    l7Var.f45653a.setText(charSequence);
                    l7Var.f45654b.setText(charSequence2);
                } else if (i15 == 11) {
                    l7 l7Var2 = (l7) view;
                    l7Var2.f45653a.setText(m7Var2.f45755e);
                    l7Var2.f45654b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((zw0) view).f34031b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (m7Var2.f45755e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(m7Var2.f45755e);
                } else if (i15 == 7) {
                    int i18 = m7Var2.f45754c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.o8) view).j(m7Var2.f45755e, c8Var.f45195x, z4);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.o8) view).j(m7Var2.f45755e, c8Var.f45196y, z4);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.o8) view).j(m7Var2.f45755e, c8Var.f45194w, z4);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = m7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.o8) view).t(m7Var2.f45755e, drawable, z4);
                    } else {
                        ((org.telegram.ui.Cells.o8) view).o(m7Var2.f45755e, m7Var2.f45756f, false, z4);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(m7Var2.f45755e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(c8Var.E, i19, 0);
                    cl0 cl0Var = new cl0(18);
                    org.telegram.ui.Cells.w7 w7Var2 = new org.telegram.ui.Cells.w7();
                    w7Var2.f24369c = a2;
                    w7Var2.d = 20;
                    w7Var2.f24370e = cl0Var;
                    ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var2, new org.telegram.ui.web.d1(this, 11));
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View inVar;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            inVar = new View(context);
        } else if (i10 == 0) {
            inVar = new View(context);
            inVar.setTag(35);
        } else if (i10 == 1) {
            inVar = new View(context);
            inVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.f46101e;
            if (i10 == 3) {
                inVar = new b8(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new l7(context, g6Var, true);
                } else if (i10 == 11) {
                    inVar = new l7(context, g6Var, false);
                } else if (i10 == 8) {
                    inVar = new org.telegram.ui.Cells.m4(context, g6Var);
                    inVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, g6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.f34033e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.f34030a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    inVar = new org.telegram.ui.Cells.a9(context, g6Var);
                    inVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.f46101e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.f46101e, true, false);
                    } else if (i10 == 10) {
                        inVar = new org.telegram.ui.Cells.x7(context, g6Var);
                    } else {
                        inVar = new in(context, 26);
                    }
                    inVar = o8Var;
                }
                inVar = view;
            }
        }
        return new f2.m1(inVar);
    }
}
