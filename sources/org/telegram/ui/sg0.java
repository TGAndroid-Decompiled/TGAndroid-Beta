package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sg0 extends org.telegram.ui.Components.ll0 {
    public final Context f37297c;
    public final tg0 d;

    public sg0(tg0 tg0Var, Context context) {
        this.d = tg0Var;
        this.f37297c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        tg0 tg0Var = this.d;
        if (b10 != tg0Var.f37644c && b10 != tg0Var.d && b10 != tg0Var.e && b10 != tg0Var.f37645f && b10 != tg0Var.h && b10 != tg0Var.f37647r) {
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
        tg0 tg0Var = this.d;
        tg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != tg0Var.f37644c && i10 != tg0Var.d && i10 != tg0Var.e && i10 != tg0Var.f37645f && i10 != tg0Var.h) {
            if (i10 == tg0Var.f37646n) {
                return 2;
            }
            if (i10 == tg0Var.f37647r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i11 != 0) {
            tg0 tg0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                        if (i10 == tg0Var.f37648s) {
                            f9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                if (i10 == tg0Var.f37647r) {
                    faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
                    faVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == tg0Var.f37644c) {
                e9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == tg0Var.d) {
                e9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == tg0Var.e) {
                e9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == tg0Var.f37645f) {
                e9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == tg0Var.h) {
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
        Context context = this.f37297c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.f9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f18753b7));
                    } else {
                        FrameLayout faVar = new org.telegram.ui.Cells.fa(context);
                        faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                        e9Var = faVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            e9Var2.setMultilineDetail(true);
            e9Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            e9Var = e9Var2;
        } else {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            e9Var = m4Var;
        }
        view = e9Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
