package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yg0 extends org.telegram.ui.Components.vl0 {
    public final Context f39820c;
    public final zg0 d;

    public yg0(zg0 zg0Var, Context context) {
        this.d = zg0Var;
        this.f39820c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zg0 zg0Var = this.d;
        if (b10 != zg0Var.f40138c && b10 != zg0Var.d && b10 != zg0Var.e && b10 != zg0Var.f40139f && b10 != zg0Var.h && b10 != zg0Var.f40141r) {
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
        zg0 zg0Var = this.d;
        zg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != zg0Var.f40138c && i10 != zg0Var.d && i10 != zg0Var.e && i10 != zg0Var.f40139f && i10 != zg0Var.h) {
            if (i10 == zg0Var.f40140n) {
                return 2;
            }
            if (i10 == zg0Var.f40141r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i11 != 0) {
            zg0 zg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                        if (i10 == zg0Var.f40142s) {
                            e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                if (i10 == zg0Var.f40141r) {
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19283p7, false));
                    eaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == zg0Var.f40138c) {
                d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == zg0Var.d) {
                d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == zg0Var.e) {
                d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == zg0Var.f40139f) {
                d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == zg0Var.h) {
                d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == 0) {
            m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.d9 d9Var;
        View view;
        Context context = this.f39820c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.e9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19026b7));
                    } else {
                        FrameLayout eaVar = new org.telegram.ui.Cells.ea(context);
                        eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                        d9Var = eaVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            }
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            d9Var2.setMultilineDetail(true);
            d9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
            d9Var = d9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
            d9Var = m4Var;
        }
        view = d9Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
