package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zg0 extends org.telegram.ui.Components.ul0 {
    public final Context f40216c;
    public final ah0 d;

    public zg0(ah0 ah0Var, Context context) {
        this.d = ah0Var;
        this.f40216c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ah0 ah0Var = this.d;
        if (b10 != ah0Var.f32061c && b10 != ah0Var.d && b10 != ah0Var.e && b10 != ah0Var.f32062f && b10 != ah0Var.h && b10 != ah0Var.f32064r) {
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
        ah0 ah0Var = this.d;
        ah0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != ah0Var.f32061c && i10 != ah0Var.d && i10 != ah0Var.e && i10 != ah0Var.f32062f && i10 != ah0Var.h) {
            if (i10 == ah0Var.f32063n) {
                return 2;
            }
            if (i10 == ah0Var.f32064r) {
                return 3;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 != 0) {
            ah0 ah0Var = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                        if (i10 == ah0Var.f32065s) {
                            f9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                if (i10 == ah0Var.f32064r) {
                    faVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19315p7, false));
                    faVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == ah0Var.f32061c) {
                e9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            } else if (i10 == ah0Var.d) {
                e9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            } else if (i10 == ah0Var.e) {
                e9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
                return;
            } else if (i10 == ah0Var.f32062f) {
                e9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
                return;
            } else if (i10 == ah0Var.h) {
                e9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i10 == 0) {
            n4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e9 e9Var;
        View view;
        Context context = this.f40216c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        view = new org.telegram.ui.Cells.f9(context);
                        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19058b7));
                    } else {
                        FrameLayout faVar = new org.telegram.ui.Cells.fa(context);
                        faVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                        e9Var = faVar;
                    }
                } else {
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            }
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            e9Var2.setMultilineDetail(true);
            e9Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            e9Var = e9Var2;
        } else {
            FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            e9Var = n4Var;
        }
        view = e9Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
