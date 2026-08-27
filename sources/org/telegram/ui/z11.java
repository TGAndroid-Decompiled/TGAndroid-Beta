package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class z11 extends org.telegram.ui.Components.yk0 {

    public final Context f44994c;
    public final a21 d;

    public z11(a21 a21Var, Context context) {
        this.d = a21Var;
        this.f44994c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        if (iB == 0) {
            return true;
        }
        a21 a21Var = this.d;
        return iB == a21Var.f36353c || iB == a21Var.d || iB == a21Var.f36354e;
    }

    @Override
    public final int h() {
        return this.d.h;
    }

    @Override
    public final int j(int i10) {
        a21 a21Var = this.d;
        if (i10 == a21Var.f36355f) {
            return 0;
        }
        if (i10 == 0 || i10 == a21Var.f36353c || i10 == a21Var.d || i10 == a21Var.f36354e) {
            return i10 + 9;
        }
        return 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        String str;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.f44994c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            x8Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        a21 a21Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.p8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), a21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) view;
                if (i10 == 0) {
                    string = LocaleController.getString(R.string.QuickReplyDefault1);
                    str = "quick_reply_msg1";
                } else if (i10 == a21Var.f36353c) {
                    string = LocaleController.getString(R.string.QuickReplyDefault2);
                    str = "quick_reply_msg2";
                } else if (i10 == a21Var.d) {
                    string = LocaleController.getString(R.string.QuickReplyDefault3);
                    str = "quick_reply_msg3";
                } else if (i10 == a21Var.f36354e) {
                    string = LocaleController.getString(R.string.QuickReplyDefault4);
                    str = "quick_reply_msg4";
                } else {
                    string = null;
                    str = null;
                }
                String string2 = a21Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str, "");
                boolean z10 = i10 != a21Var.f36354e;
                EditTextBoldCursor editTextBoldCursor = h3Var.f24424a;
                editTextBoldCursor.setText(string2);
                editTextBoldCursor.setHint(string);
                h3Var.f24425b = z10;
                h3Var.setWillNotDraw(!z10);
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        Context context = this.f44994c;
        if (i10 == 0) {
            x8Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                    h3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    this.d.f36356n[i10 - 9] = h3Var;
                    x8Var = h3Var;
                    break;
                default:
                    x8Var = new org.telegram.ui.Cells.p8(context);
                    x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    break;
            }
        } else {
            x8Var = new org.telegram.ui.Cells.x9(context);
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        }
        x8Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
