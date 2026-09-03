package ph;

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
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;
public final class u7 extends bg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final s7 f42480f;
    public rl0 h;
    public final y7 f42481n;

    public u7(y7 y7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, s7 s7Var, nh.t3 t3Var) {
        this.f42481n = y7Var;
        this.d = context;
        this.e = f6Var;
        this.f42480f = s7Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if ((i10 != 3 || !this.f42481n.T.C) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f42481n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        y7 y7Var = this.f42481n;
        ArrayList arrayList = y7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((o7) y7Var.I.get(i10)).f1830a;
        }
        return -1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        o7 o7Var;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        y7 y7Var = this.f42481n;
        e8 e8Var = y7Var.T;
        ArrayList arrayList = y7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            o7 o7Var2 = (o7) arrayList.get(i10);
            int i15 = l1Var.f5777f;
            View view = l1Var.f5774a;
            boolean z10 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                o7Var = (o7) arrayList.get(i16);
            } else {
                o7Var = null;
            }
            if (o7Var != null && ((i14 = o7Var.f1830a) == i15 || (i14 == 9 && o7Var.f42114q == 1))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 == 3) {
                d8 d8Var = (d8) view;
                boolean z11 = o7Var2.f42111n;
                d8Var.d(z11, !z11);
                int i17 = o7Var2.f42106i;
                float f10 = 1.0f;
                if (i17 > 0) {
                    d8Var.e(i17, o7Var2.f42105g, o7Var2.f42107j);
                    d8Var.b(1.0f, false);
                } else {
                    TLRPC.User user = o7Var2.f42105g;
                    if (user != null) {
                        d8Var.setUser(user);
                        if (o7Var2.f42109l && !o7Var2.f42108k) {
                            f10 = 0.5f;
                        }
                        d8Var.b(f10, false);
                    } else {
                        TLRPC.Chat chat = o7Var2.h;
                        if (chat != null) {
                            d8Var.a(e8.d1(e8Var, chat), chat);
                        }
                    }
                }
                if (!o7Var2.f42108k && !o7Var2.f42109l) {
                    z10 = false;
                }
                d8Var.c(z10, false);
                d8Var.setDivider(z4);
                d8Var.setRedCheckbox(o7Var2.f42110m);
                d8Var.v = e8Var.C;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (o7Var2.f42112o > 0) {
                        rl0 rl0Var = this.h;
                        if (rl0Var != null && rl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + y7Var.Q;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - o7Var2.f42112o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = o7Var2.f42113p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.w0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new f2.w0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f42480f.G)));
                } else if (i15 == 4) {
                    n7 n7Var = (n7) view;
                    CharSequence charSequence = o7Var2.e;
                    CharSequence charSequence2 = o7Var2.f42104f;
                    n7Var.f42062a.setText(charSequence);
                    n7Var.f42063b.setText(charSequence2);
                } else if (i15 == 11) {
                    n7 n7Var2 = (n7) view;
                    n7Var2.f42062a.setText(o7Var2.e);
                    n7Var2.f42063b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((zw0) view).f31483b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    if (o7Var2.e == null) {
                        z8Var.setFixedSize(12);
                        z8Var.setText(null);
                        return;
                    }
                    z8Var.setFixedSize(0);
                    z8Var.setText(o7Var2.e);
                } else if (i15 == 7) {
                    int i18 = o7Var2.f42103c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.n8) view).j(o7Var2.e, e8Var.f41628x, z4);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.n8) view).j(o7Var2.e, e8Var.f41629y, z4);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.n8) view).j(o7Var2.e, e8Var.f41627w, z4);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = o7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.n8) view).t(o7Var2.e, drawable, z4);
                    } else {
                        ((org.telegram.ui.Cells.n8) view).o(o7Var2.e, o7Var2.f42104f, false, z4);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.l4) view).setText(o7Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.w7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(e8Var.E, i19, 0);
                    cl0 cl0Var = new cl0(17);
                    org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7();
                    v7Var.f22476c = a2;
                    v7Var.d = 20;
                    v7Var.e = cl0Var;
                    ((org.telegram.ui.Cells.w7) view).d(clamp, v7Var, new org.telegram.ui.web.a1(this, 11));
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View gnVar;
        org.telegram.ui.Cells.n8 n8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            gnVar = new View(context);
        } else if (i10 == 0) {
            gnVar = new View(context);
            gnVar.setTag(35);
        } else if (i10 == 1) {
            gnVar = new View(context);
            gnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                gnVar = new d8(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new n7(context, f6Var, true);
                } else if (i10 == 11) {
                    gnVar = new n7(context, f6Var, false);
                } else if (i10 == 8) {
                    gnVar = new org.telegram.ui.Cells.l4(context, f6Var);
                    gnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, f6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.f31482a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    gnVar = new org.telegram.ui.Cells.z8(context, f6Var);
                    gnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        gnVar = new org.telegram.ui.Cells.w7(context, f6Var);
                    } else {
                        gnVar = new gn(context, 26);
                    }
                    gnVar = n8Var;
                }
                gnVar = view;
            }
        }
        return new f2.l1(gnVar);
    }
}
