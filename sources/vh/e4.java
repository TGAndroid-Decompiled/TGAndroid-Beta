package vh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p70;
import org.telegram.ui.cr0;
import org.telegram.ui.qy;
import ph.z8;
public abstract class e4 {
    public static EditTextBoldCursor a(Context context, f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(j6.v0(j6.f19987j5, f6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(j6.v0(j6.H6, f6Var));
        editTextBoldCursor.setHeaderHintColor(j6.v0(j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(j6.v0(j6.f20006k6, f6Var), j6.v0(j6.f20024l6, f6Var), j6.v0(j6.f20097p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(j6.v0(j6.f20191uf, f6Var));
        editTextBoldCursor.setHandlesColor(j6.v0(j6.f20209vf, f6Var));
        return editTextBoldCursor;
    }

    public static p70 b(p70 p70Var, org.telegram.ui.ActionBar.p2 p2Var, final r3 r3Var, final boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        if (f4Var != null && (textbutton = f4Var.f45975a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(r3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(r3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                r3Var.f46190f.n3(true);
                k(p2Var, z4, new b4(r3Var, 2));
            }
            return null;
        }
        p70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e4.i(r3Var, z4);
                        return;
                    default:
                        e4.h(r3Var, z4);
                        return;
                }
            }
        }, false);
        p70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e4.i(r3Var, z4);
                        return;
                    default:
                        e4.h(r3Var, z4);
                        return;
                }
            }
        }, false);
        p70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new cr0(p2Var, r3Var, z4, 14), false);
        p70Var.Z();
        return p70Var;
    }

    public static p70 c(p70 p70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final f6 f6Var, final p3 p3Var, final boolean z4) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = p3Var.f46137b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            inlineButtonType = null;
        } else {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, f6Var, p3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, p3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, f6Var, p3Var, z4);
            }
            return null;
        }
        p70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        e4.e(context, f6Var, p3Var, z4);
                        return;
                    default:
                        e4.d(context, f6Var, p3Var, z4);
                        return;
                }
            }
        }, false);
        p70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        e4.e(context, f6Var, p3Var, z4);
                        return;
                    default:
                        e4.d(context, f6Var, p3Var, z4);
                        return;
                }
            }
        }, false);
        p70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new gg.j(p2Var, (Object) context, (Object) f6Var, (Object) p3Var, z4, 23), false);
        p70Var.Z();
        return p70Var;
    }

    public static void d(Context context, f6 f6Var, p3 p3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = p3Var.c();
        int i11 = p3Var.f46137b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton != null) {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            str = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            str = "";
        }
        String str2 = str;
        if (c3) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        g(context, f6Var, p3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new z3(p3Var, 3));
    }

    public static void e(Context context, f6 f6Var, p3 p3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = p3Var.c();
        int i11 = p3Var.f46137b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton != null) {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        if (c3) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        g(context, f6Var, p3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new z3(p3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, f6 f6Var, p3 p3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c3 = p3Var.c();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i11 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = p3Var.f46137b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = y5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, f6Var, string, l10);
        f10.addView(a2, b6.n(-1, 64));
        cg.u0 u0Var = new cg.u0(a2, p2Var, z4, p3Var, 28);
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        if (c3) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o9.b(c3, u0Var, a2, p3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new z8(u0Var, 15));
            String string3 = LocaleController.getString(R.string.Delete);
            z3 z3Var = new z3(p3Var, 2);
            d2Var.m0 = string3;
            d2Var.f19576n0 = z3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.G0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, f6Var);
    }

    public static void g(Context context, f6 f6Var, p3 p3Var, boolean z4, String str, String str2, String str3, z3 z3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = p3Var.f46137b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = y5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, f6Var, string, l10);
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f10.addView(a2, b6.n(-1, 64));
        f10.addView(a10, b6.n(-1, 64));
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        alertDialog$Builder.f19478a.O = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.l1(a2, a10, z3Var, 7));
        if (p3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z3(p3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (p3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void h(r3 r3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i10;
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        if (f4Var != null && (textbutton = f4Var.f45975a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z10) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = y5.l(r3Var.e);
        }
        String str = l10;
        r3Var.f46190f.n3(false);
        if (z10) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        r3Var.f46187a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z4, new b4(r3Var, 1));
    }

    public static void i(r3 r3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        f4 f4Var = r3Var.d;
        if (f4Var != null && (textbutton = f4Var.f45975a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        if (z10) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        r3Var.f46190f.n3(false);
        if (z10) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        r3Var.f46187a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z4, new b4(r3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, f6 f6Var) {
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.setOnShowListener(new kh.j(3, editTextBoldCursor));
        d2Var.q(250L);
        if (i10 != 0 && (d2Var.d(i10) instanceof TextView)) {
            ((TextView) d2Var.d(i10)).setTextColor(j6.v0(j6.f20116q7, f6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, d4 d4Var) {
        if (p2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        qy qyVar = new qy(bundle);
        qyVar.f37649z2 = new z8(d4Var, 16);
        if (z4) {
            ?? obj = new Object();
            obj.f20453a = true;
            p2Var.showAsSheet(qyVar, obj);
            return;
        }
        p2Var.presentFragment(qyVar);
    }
}
