package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v21 extends org.telegram.ui.Components.ql0 {
    public final Context f38966c;
    public final w21 d;

    public v21(w21 w21Var, Context context) {
        this.d = w21Var;
        this.f38966c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        if (b10 != 0) {
            w21 w21Var = this.d;
            if (b10 != w21Var.f39255c && b10 != w21Var.d && b10 != w21Var.e) {
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
        w21 w21Var = this.d;
        if (i10 == w21Var.f39256f) {
            return 0;
        }
        if (i10 != 0 && i10 != w21Var.f39255c && i10 != w21Var.d && i10 != w21Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z4 = false;
                w21 w21Var = this.d;
                if (i11 != 4) {
                    switch (i11) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == w21Var.f39255c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == w21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == w21Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = w21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != w21Var.e) {
                                z4 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = i3Var.f21169a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            i3Var.f21170b = z4;
                            i3Var.setWillNotDraw(!z4);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.r8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), w21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f38966c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
        z8Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.f38966c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context);
                        i3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        this.d.f39257n[i10 - 9] = i3Var;
                        z8Var = i3Var;
                        break;
                    default:
                        z8Var = new org.telegram.ui.Cells.r8(context);
                        z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        break;
                }
            } else {
                z8Var = new org.telegram.ui.Cells.z9(context);
                z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            }
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
        }
        z8Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(z8Var);
    }
}
