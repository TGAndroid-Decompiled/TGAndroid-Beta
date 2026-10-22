package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t11 extends org.telegram.ui.Components.im0 {
    public final Context f41582c;
    public final u11 d;

    public t11(u11 u11Var, Context context) {
        this.d = u11Var;
        this.f41582c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 0) {
            u11 u11Var = this.d;
            if (b10 != u11Var.f41790c && b10 != u11Var.d && b10 != u11Var.e) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.h;
    }

    @Override
    public final int j(int i10) {
        u11 u11Var = this.d;
        if (i10 == u11Var.f41791f) {
            return 0;
        }
        if (i10 != 0 && i10 != u11Var.f41790c && i10 != u11Var.d && i10 != u11Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        int i11 = b1Var.f45923f;
        View view = b1Var.f45920a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                u11 u11Var = this.d;
                if (i11 != 4) {
                    switch (i11) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == u11Var.f41790c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == u11Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == u11Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = u11Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != u11Var.e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = j3Var.f22463a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            j3Var.f22464b = z10;
                            j3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.v8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), u11Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(this.f41582c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7));
        d9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        Context context = this.f41582c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context);
                        j3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                        this.d.f41792n[i10 - 9] = j3Var;
                        d9Var = j3Var;
                        break;
                    default:
                        d9Var = new org.telegram.ui.Cells.v8(context);
                        d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                        break;
                }
            } else {
                d9Var = new org.telegram.ui.Cells.ba(context);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
            }
        } else {
            d9Var = new org.telegram.ui.Cells.d9(context);
        }
        d9Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(d9Var);
    }
}
