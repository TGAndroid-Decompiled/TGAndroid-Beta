package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x21 extends org.telegram.ui.Components.wl0 {
    public final Context f39812c;
    public final y21 d;

    public x21(y21 y21Var, Context context) {
        this.d = y21Var;
        this.f39812c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 0) {
            y21 y21Var = this.d;
            if (b10 != y21Var.f40036c && b10 != y21Var.d && b10 != y21Var.e) {
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
        y21 y21Var = this.d;
        if (i10 == y21Var.f40037f) {
            return 0;
        }
        if (i10 != 0 && i10 != y21Var.f40036c && i10 != y21Var.d && i10 != y21Var.e) {
            return 1;
        }
        return i10 + 9;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i11 != 0) {
            if (i11 != 1) {
                boolean z10 = false;
                y21 y21Var = this.d;
                if (i11 != 4) {
                    switch (i11) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
                            if (i10 == 0) {
                                str = LocaleController.getString(R.string.QuickReplyDefault1);
                                str2 = "quick_reply_msg1";
                            } else if (i10 == y21Var.f40036c) {
                                str = LocaleController.getString(R.string.QuickReplyDefault2);
                                str2 = "quick_reply_msg2";
                            } else if (i10 == y21Var.d) {
                                str = LocaleController.getString(R.string.QuickReplyDefault3);
                                str2 = "quick_reply_msg3";
                            } else if (i10 == y21Var.e) {
                                str = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String string = y21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str2, "");
                            if (i10 != y21Var.e) {
                                z10 = true;
                            }
                            EditTextBoldCursor editTextBoldCursor = k3Var.f20556a;
                            editTextBoldCursor.setText(string);
                            editTextBoldCursor.setHint(str);
                            k3Var.f20557b = z10;
                            k3Var.setWillNotDraw(!z10);
                            return;
                        default:
                            return;
                    }
                }
                ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), y21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(this.f39812c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
        e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.f39812c;
        if (i10 != 0) {
            if (i10 != 1) {
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                        this.d.f40038n[i10 - 9] = k3Var;
                        e9Var = k3Var;
                        break;
                    default:
                        e9Var = new org.telegram.ui.Cells.w8(context);
                        e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                        break;
                }
            } else {
                e9Var = new org.telegram.ui.Cells.ea(context);
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
            }
        } else {
            e9Var = new org.telegram.ui.Cells.e9(context);
        }
        e9Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(e9Var);
    }
}
