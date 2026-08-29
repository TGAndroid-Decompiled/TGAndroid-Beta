package th;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j70;
import org.telegram.ui.fy;
import org.telegram.ui.mp0;
public abstract class b4 {
    public static EditTextBoldCursor a(Context context, c6 c6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(g6.v0(g6.f23169j5, c6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(g6.v0(g6.H6, c6Var));
        editTextBoldCursor.setHeaderHintColor(g6.v0(g6.L6, c6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(g6.v0(g6.f23189k6, c6Var), g6.v0(g6.f23206l6, c6Var), g6.v0(g6.f23279p7, c6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(g6.v0(g6.f23374uf, c6Var));
        editTextBoldCursor.setHandlesColor(g6.v0(g6.f23392vf, c6Var));
        return editTextBoldCursor;
    }

    public static j70 b(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, final o3 o3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        if (c4Var != null && (textbutton = c4Var.f48388a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(o3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(o3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                o3Var.f48614f.o3(true);
                k(o2Var, z10, new y3(o3Var, 2));
            }
            return null;
        }
        j70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b4.i(o3Var, z10);
                        return;
                    default:
                        b4.h(o3Var, z10);
                        return;
                }
            }
        }, false);
        j70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b4.i(o3Var, z10);
                        return;
                    default:
                        b4.h(o3Var, z10);
                        return;
                }
            }
        }, false);
        j70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new mp0(o2Var, o3Var, z10, 14), false);
        j70Var.Z();
        return j70Var;
    }

    public static j70 c(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final c6 c6Var, final m3 m3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = m3Var.f48570b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
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
                e(context, c6Var, m3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, c6Var, m3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, c6Var, m3Var, z10);
            }
            return null;
        }
        j70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        b4.e(context, c6Var, m3Var, z10);
                        return;
                    default:
                        b4.d(context, c6Var, m3Var, z10);
                        return;
                }
            }
        }, false);
        j70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        b4.e(context, c6Var, m3Var, z10);
                        return;
                    default:
                        b4.d(context, c6Var, m3Var, z10);
                        return;
                }
            }
        }, false);
        j70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new eg.j(o2Var, (Object) context, (Object) c6Var, (Object) m3Var, z10, 23), false);
        j70Var.Z();
        return j70Var;
    }

    public static void d(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = m3Var.c();
        int i11 = m3Var.f48570b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
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
        g(context, c6Var, m3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new w3(m3Var, 3));
    }

    public static void e(Context context, c6 c6Var, m3 m3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = m3Var.c();
        int i11 = m3Var.f48570b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
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
        g(context, c6Var, m3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new w3(m3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, c6 c6Var, m3 m3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c3 = m3Var.c();
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        int i11 = 0;
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = m3Var.f48570b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = v5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, c6Var, string, l10);
        g10.addView(a2, f6.n(-1, 64));
        ag.w0 w0Var = new ag.w0(a2, o2Var, z10, m3Var, 28);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        if (c3) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string2;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new m9.b(c3, w0Var, a2, m3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new sf.f1(w0Var, 7));
            String string3 = LocaleController.getString(R.string.Delete);
            w3 w3Var = new w3(m3Var, 2);
            c2Var.f22794l0 = string3;
            c2Var.m0 = w3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.F0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, c6Var);
    }

    public static void g(Context context, c6 c6Var, m3 m3Var, boolean z10, String str, String str2, String str3, w3 w3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        int i10 = 0;
        g10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = m3Var.f48570b;
        TL_iv.pageBlockButtonRow d = m3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = v5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, c6Var, string, l10);
        EditTextBoldCursor a10 = a(context, c6Var, str2, str3);
        g10.addView(a2, f6.n(-1, 64));
        g10.addView(a10, f6.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        alertDialog$Builder.f22714a.N = str;
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.voip.w1(a2, a10, w3Var, 7));
        if (m3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new w3(m3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (m3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, c6Var);
    }

    public static void h(o3 o3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i10;
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        if (c4Var != null && (textbutton = c4Var.f48388a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = v5.l(o3Var.f48613e);
        }
        String str = l10;
        o3Var.f48614f.o3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        o3Var.f48610a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new y3(o3Var, 1));
    }

    public static void i(o3 o3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        c4 c4Var = o3Var.d;
        if (c4Var != null && (textbutton = c4Var.f48388a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        if (z11) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        o3Var.f48614f.o3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        o3Var.f48610a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new y3(o3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, c6 c6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.setOnShowListener(new ih.k(3, editTextBoldCursor));
        c2Var.q(250L);
        if (i10 != 0 && (c2Var.d(i10) instanceof TextView)) {
            ((TextView) c2Var.d(i10)).setTextColor(g6.v0(g6.f23295q7, c6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, a4 a4Var) {
        if (o2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        fy fyVar = new fy(bundle);
        fyVar.f38379y2 = new sf.f1(a4Var, 8);
        if (z10) {
            ?? obj = new Object();
            obj.f23673a = true;
            o2Var.showAsSheet(fyVar, obj);
            return;
        }
        o2Var.presentFragment(fyVar);
    }
}
