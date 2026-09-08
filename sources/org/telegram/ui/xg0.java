package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xg0 extends org.telegram.ui.Components.kl0 {
    public final Context f42751c;
    public final yg0 d;

    public xg0(yg0 yg0Var, Context context) {
        this.d = yg0Var;
        this.f42751c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        yg0 yg0Var = this.d;
        if (b10 != yg0Var.f43137c && b10 != yg0Var.d && b10 != yg0Var.f43138e && b10 != yg0Var.f43139f && b10 != yg0Var.h && b10 != yg0Var.f43141r) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        yg0 yg0Var = this.d;
        yg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != yg0Var.f43137c && i10 != yg0Var.d && i10 != yg0Var.f43138e && i10 != yg0Var.f43139f && i10 != yg0Var.h) {
            if (i10 == yg0Var.f43140n) {
                return 2;
            }
            if (i10 == yg0Var.f43141r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i11 != 0) {
            yg0 yg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                        if (i10 == yg0Var.f43142s) {
                            e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                if (i10 == yg0Var.f43141r) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
                    eaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == yg0Var.f43137c) {
                d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == yg0Var.d) {
                d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == yg0Var.f43138e) {
                d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == yg0Var.f43139f) {
                d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == yg0Var.h) {
                d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == 0) {
            l4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.d9 d9Var;
        View view;
        Context context = this.f42751c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.e9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f20654b7));
                    } else {
                        FrameLayout eaVar = new org.telegram.ui.Cells.ea(context);
                        eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                        d9Var = eaVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                }
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            d9Var2.setMultilineDetail(true);
            d9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
            d9Var = d9Var2;
        } else {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
            d9Var = l4Var;
        }
        view = d9Var;
        return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
    }
}
