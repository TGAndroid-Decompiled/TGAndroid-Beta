package wh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.q70;
import org.telegram.ui.cr0;
import org.telegram.ui.py;
public abstract class d4 {
    public static EditTextBoldCursor a(Context context, g6 g6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(k6.v0(k6.f21768j5, g6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(k6.v0(k6.H6, g6Var));
        editTextBoldCursor.setHeaderHintColor(k6.v0(k6.L6, g6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(k6.v0(k6.f21787k6, g6Var), k6.v0(k6.f21805l6, g6Var), k6.v0(k6.f21878p7, g6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(k6.v0(k6.f21972uf, g6Var));
        editTextBoldCursor.setHandlesColor(k6.v0(k6.f21990vf, g6Var));
        return editTextBoldCursor;
    }

    public static q70 b(q70 q70Var, org.telegram.ui.ActionBar.p2 p2Var, final q3 q3Var, final boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f49762a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(q3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(q3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                q3Var.f49985f.n3(true);
                k(p2Var, z4, new a4(q3Var, 2));
            }
            return null;
        }
        q70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        d4.i(q3Var, z4);
                        return;
                    default:
                        d4.h(q3Var, z4);
                        return;
                }
            }
        }, false);
        q70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        d4.i(q3Var, z4);
                        return;
                    default:
                        d4.h(q3Var, z4);
                        return;
                }
            }
        }, false);
        q70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new cr0(p2Var, q3Var, z4, 14), false);
        q70Var.Z();
        return q70Var;
    }

    public static q70 c(q70 q70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final g6 g6Var, final o3 o3Var, final boolean z4) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = o3Var.f49936b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
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
                e(context, g6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, g6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, g6Var, o3Var, z4);
            }
            return null;
        }
        q70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        d4.e(context, g6Var, o3Var, z4);
                        return;
                    default:
                        d4.d(context, g6Var, o3Var, z4);
                        return;
                }
            }
        }, false);
        q70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        d4.e(context, g6Var, o3Var, z4);
                        return;
                    default:
                        d4.d(context, g6Var, o3Var, z4);
                        return;
                }
            }
        }, false);
        q70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new hg.j(p2Var, (Object) context, (Object) g6Var, (Object) o3Var, z4, 23), false);
        q70Var.Z();
        return q70Var;
    }

    public static void d(Context context, g6 g6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = o3Var.c();
        int i11 = o3Var.f49936b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
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
        g(context, g6Var, o3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new y3(o3Var, 3));
    }

    public static void e(Context context, g6 g6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = o3Var.c();
        int i11 = o3Var.f49936b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
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
        g(context, g6Var, o3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new y3(o3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, g6 g6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c3 = o3Var.c();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i11 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = o3Var.f49936b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = x5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, g6Var, string, l10);
        f10.addView(a2, c6.n(-1, 64));
        dg.t0 t0Var = new dg.t0(a2, p2Var, z4, o3Var, 28);
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        if (c3) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o9.b(c3, t0Var, a2, o3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new sf.h(t0Var, 16));
            String string3 = LocaleController.getString(R.string.Delete);
            y3 y3Var = new y3(o3Var, 2);
            d2Var.m0 = string3;
            d2Var.f21255n0 = y3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.G0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, g6Var);
    }

    public static void g(Context context, g6 g6Var, o3 o3Var, boolean z4, String str, String str2, String str3, y3 y3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = o3Var.f49936b;
        TL_iv.pageBlockButtonRow d = o3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = x5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, g6Var, string, l10);
        EditTextBoldCursor a10 = a(context, g6Var, str2, str3);
        f10.addView(a2, c6.n(-1, 64));
        f10.addView(a10, c6.n(-1, 64));
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        alertDialog$Builder.f21168a.O = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qh.l1(a2, a10, y3Var, 7));
        if (o3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new y3(o3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (o3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, g6Var);
    }

    public static void h(q3 q3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i10;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f49762a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z10) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = x5.l(q3Var.f49984e);
        }
        String str = l10;
        q3Var.f49985f.n3(false);
        if (z10) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        q3Var.f49981a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z4, new a4(q3Var, 1));
    }

    public static void i(q3 q3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f49762a) != null) {
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
        q3Var.f49985f.n3(false);
        if (z10) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        q3Var.f49981a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z4, new a4(q3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.setOnShowListener(new lh.j(3, editTextBoldCursor));
        d2Var.q(250L);
        if (i10 != 0 && (d2Var.d(i10) instanceof TextView)) {
            ((TextView) d2Var.d(i10)).setTextColor(k6.v0(k6.f21897q7, g6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, c4 c4Var) {
        if (p2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        py pyVar = new py(bundle);
        pyVar.f40278z2 = new sf.h(c4Var, 17);
        if (z4) {
            ?? obj = new Object();
            obj.f22158a = true;
            p2Var.showAsSheet(pyVar, obj);
            return;
        }
        p2Var.presentFragment(pyVar);
    }
}
