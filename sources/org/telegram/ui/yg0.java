package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yg0 extends org.telegram.ui.Components.ul0 {
    public final Context f38997c;
    public final zg0 d;

    public yg0(zg0 zg0Var, Context context) {
        this.d = zg0Var;
        this.f38997c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zg0 zg0Var = this.d;
        if (b10 != zg0Var.f39315c && b10 != zg0Var.d && b10 != zg0Var.e && b10 != zg0Var.f39316f && b10 != zg0Var.h && b10 != zg0Var.f39318r) {
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
        if (i10 != zg0Var.f39315c && i10 != zg0Var.d && i10 != zg0Var.e && i10 != zg0Var.f39316f && i10 != zg0Var.h) {
            if (i10 == zg0Var.f39317n) {
                return 2;
            }
            if (i10 == zg0Var.f39318r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 != 0) {
            zg0 zg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                        if (i10 == zg0Var.f39319s) {
                            f9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 == zg0Var.f39318r) {
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
                    gaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == zg0Var.f39315c) {
                e9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == zg0Var.d) {
                e9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == zg0Var.e) {
                e9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == zg0Var.f39316f) {
                e9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == zg0Var.h) {
                e9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
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
        org.telegram.ui.Cells.e9 e9Var;
        View view;
        Context context = this.f38997c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.f9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7));
                    } else {
                        FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
                        gaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                        e9Var = gaVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                }
                return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            e9Var2.setMultilineDetail(true);
            e9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            e9Var = e9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            e9Var = m4Var;
        }
        view = e9Var;
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
