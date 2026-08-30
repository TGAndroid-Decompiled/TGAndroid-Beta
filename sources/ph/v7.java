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
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.al0;
public final class v7 extends bg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final t7 f42482f;
    public sl0 h;
    public final z7 f42483n;

    public v7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, t7 t7Var, nh.t3 t3Var) {
        this.f42483n = z7Var;
        this.d = context;
        this.e = f6Var;
        this.f42482f = t7Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if ((i10 != 3 || !this.f42483n.T.C) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f42483n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        z7 z7Var = this.f42483n;
        ArrayList arrayList = z7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((p7) z7Var.I.get(i10)).f1808a;
        }
        return -1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        p7 p7Var;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        z7 z7Var = this.f42483n;
        f8 f8Var = z7Var.T;
        ArrayList arrayList = z7Var.I;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            p7 p7Var2 = (p7) arrayList.get(i10);
            int i15 = l1Var.f5788f;
            View view = l1Var.f5785a;
            boolean z10 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                p7Var = (p7) arrayList.get(i16);
            } else {
                p7Var = null;
            }
            if (p7Var != null && ((i14 = p7Var.f1808a) == i15 || (i14 == 9 && p7Var.f42180q == 1))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 == 3) {
                e8 e8Var = (e8) view;
                boolean z11 = p7Var2.f42177n;
                e8Var.d(z11, !z11);
                int i17 = p7Var2.f42172i;
                float f10 = 1.0f;
                if (i17 > 0) {
                    e8Var.e(i17, p7Var2.f42171g, p7Var2.f42173j);
                    e8Var.b(1.0f, false);
                } else {
                    TLRPC.User user = p7Var2.f42171g;
                    if (user != null) {
                        e8Var.setUser(user);
                        if (p7Var2.f42175l && !p7Var2.f42174k) {
                            f10 = 0.5f;
                        }
                        e8Var.b(f10, false);
                    } else {
                        TLRPC.Chat chat = p7Var2.h;
                        if (chat != null) {
                            e8Var.a(f8.d1(f8Var, chat), chat);
                        }
                    }
                }
                if (!p7Var2.f42174k && !p7Var2.f42175l) {
                    z10 = false;
                }
                e8Var.c(z10, false);
                e8Var.setDivider(z4);
                e8Var.setRedCheckbox(p7Var2.f42176m);
                e8Var.v = f8Var.C;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (p7Var2.f42178o > 0) {
                        sl0 sl0Var = this.h;
                        if (sl0Var != null && sl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + z7Var.Q;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - p7Var2.f42178o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = p7Var2.f42179p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.w0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new f2.w0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f42482f.G)));
                } else if (i15 == 4) {
                    o7 o7Var = (o7) view;
                    CharSequence charSequence = p7Var2.e;
                    CharSequence charSequence2 = p7Var2.f42170f;
                    o7Var.f42064a.setText(charSequence);
                    o7Var.f42065b.setText(charSequence2);
                } else if (i15 == 11) {
                    o7 o7Var2 = (o7) view;
                    o7Var2.f42064a.setText(p7Var2.e);
                    o7Var2.f42065b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((zw0) view).f31455b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (p7Var2.e == null) {
                        a9Var.setFixedSize(12);
                        a9Var.setText(null);
                        return;
                    }
                    a9Var.setFixedSize(0);
                    a9Var.setText(p7Var2.e);
                } else if (i15 == 7) {
                    int i18 = p7Var2.f42169c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.o8) view).j(p7Var2.e, f8Var.f41664x, z4);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.o8) view).j(p7Var2.e, f8Var.f41665y, z4);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.o8) view).j(p7Var2.e, f8Var.f41663w, z4);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = p7Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.o8) view).t(p7Var2.e, drawable, z4);
                    } else {
                        ((org.telegram.ui.Cells.o8) view).o(p7Var2.e, p7Var2.f42170f, false, z4);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.m4) view).setText(p7Var2.e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(f8Var.E, i19, 0);
                    al0 al0Var = new al0(17);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f22548c = a2;
                    w7Var.d = 20;
                    w7Var.e = al0Var;
                    ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new org.telegram.ui.web.y0(this, 11));
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View hnVar;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            hnVar = new View(context);
        } else if (i10 == 0) {
            hnVar = new View(context);
            hnVar.setTag(35);
        } else if (i10 == 1) {
            hnVar = new View(context);
            hnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                hnVar = new e8(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new o7(context, f6Var, true);
                } else if (i10 == 11) {
                    hnVar = new o7(context, f6Var, false);
                } else if (i10 == 8) {
                    hnVar = new org.telegram.ui.Cells.m4(context, f6Var);
                    hnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, f6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.f31454a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    hnVar = new org.telegram.ui.Cells.a9(context, f6Var);
                    hnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, false);
                    } else if (i10 == 10) {
                        hnVar = new org.telegram.ui.Cells.x7(context, f6Var);
                    } else {
                        hnVar = new hn(context, 26);
                    }
                    hnVar = o8Var;
                }
                hnVar = view;
            }
        }
        return new f2.l1(hnVar);
    }
}
