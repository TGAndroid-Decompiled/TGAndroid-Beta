package qh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dy;
import org.telegram.ui.np0;
public abstract class a4 {
    public static EditTextBoldCursor a(Context context, b6 b6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(f6.v0(f6.f23108j5, b6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(f6.v0(f6.H6, b6Var));
        editTextBoldCursor.setHeaderHintColor(f6.v0(f6.L6, b6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(f6.v0(f6.f23127k6, b6Var), f6.v0(f6.f23144l6, b6Var), f6.v0(f6.f23212p7, b6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(f6.v0(f6.f23312uf, b6Var));
        editTextBoldCursor.setHandlesColor(f6.v0(f6.f23325vf, b6Var));
        return editTextBoldCursor;
    }

    public static x60 b(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, final n3 n3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        if (b4Var != null && (textbutton = b4Var.f46313a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(n3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(n3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                n3Var.f46541f.o3(true);
                k(o2Var, z10, new x3(n3Var, 2));
            }
            return null;
        }
        x60Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        a4.i(n3Var, z10);
                        return;
                    default:
                        a4.h(n3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        a4.i(n3Var, z10);
                        return;
                    default:
                        a4.h(n3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new np0(o2Var, n3Var, z10, 14), false);
        x60Var.Z();
        return x60Var;
    }

    public static x60 c(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final b6 b6Var, final l3 l3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i9 = l3Var.f46500b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        if (d != null && i9 >= 0 && i9 < d.buttons.size()) {
            pageButton = d.buttons.get(i9);
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
                e(context, b6Var, l3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, b6Var, l3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, b6Var, l3Var, z10);
            }
            return null;
        }
        x60Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        a4.e(context, b6Var, l3Var, z10);
                        return;
                    default:
                        a4.d(context, b6Var, l3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        a4.e(context, b6Var, l3Var, z10);
                        return;
                    default:
                        a4.d(context, b6Var, l3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new bg.m(o2Var, (Object) context, (Object) b6Var, (Object) l3Var, z10, 23), false);
        x60Var.Z();
        return x60Var;
    }

    public static void d(Context context, b6 b6Var, l3 l3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i9;
        boolean c10 = l3Var.c();
        int i10 = l3Var.f46500b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
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
        if (c10) {
            i9 = R.string.RichEditorEditCopyButton;
        } else {
            i9 = R.string.RichEditorCreateCopyButton;
        }
        g(context, b6Var, l3Var, z10, LocaleController.getString(i9), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new v3(l3Var, 3));
    }

    public static void e(Context context, b6 b6Var, l3 l3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i9;
        boolean c10 = l3Var.c();
        int i10 = l3Var.f46500b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
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
        if (c10) {
            i9 = R.string.RichEditorEditLinkButton;
        } else {
            i9 = R.string.RichEditorCreateLinkButton;
        }
        g(context, b6Var, l3Var, z10, LocaleController.getString(i9), LocaleController.getString(R.string.RichEditorButtonURL), str2, new v3(l3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, b6 b6Var, l3 l3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i9;
        boolean c10 = l3Var.c();
        LinearLayout f10 = ll.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = l3Var.f46500b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = u5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, b6Var, string, l10);
        f10.addView(a2, e6.n(-1, 64));
        bg.d dVar = new bg.d(a2, o2Var, z10, l3Var, 27);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        }
        if (c10) {
            i9 = R.string.RichEditorEditProfileButton;
        } else {
            i9 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i9);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new k9.b(c10, dVar, a2, l3Var, 6));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new kh.p(dVar, 24));
            String string3 = LocaleController.getString(R.string.Delete);
            v3 v3Var = new v3(l3Var, 2);
            c2Var.f22777l0 = string3;
            c2Var.m0 = v3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.F0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i10, b6Var);
    }

    public static void g(Context context, b6 b6Var, l3 l3Var, boolean z10, String str, String str2, String str3, v3 v3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = ll.f(context, 1);
        int i9 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i10 = l3Var.f46500b;
        TL_iv.pageBlockButtonRow d = l3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = u5.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, b6Var, string, l10);
        EditTextBoldCursor a3 = a(context, b6Var, str2, str3);
        f10.addView(a2, e6.n(-1, 64));
        f10.addView(a3, e6.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        }
        alertDialog$Builder.f22702a.N = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hq0(a2, a3, v3Var, 6));
        if (l3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new v3(l3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a3;
        }
        if (l3Var.c()) {
            i9 = -3;
        }
        j(alertDialog$Builder, a2, i9, b6Var);
    }

    public static void h(n3 n3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i9;
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        if (b4Var != null && (textbutton = b4Var.f46313a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = u5.l(n3Var.f46540e);
        }
        String str = l10;
        n3Var.f46541f.o3(false);
        if (z11) {
            i9 = R.string.RichEditorEditCopyButton;
        } else {
            i9 = R.string.RichEditorCreateCopyButton;
        }
        n3Var.f46537a.showInputDialog(LocaleController.getString(i9), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new x3(n3Var, 1));
    }

    public static void i(n3 n3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i9;
        TL_iv.textButton textbutton;
        b4 b4Var = n3Var.d;
        if (b4Var != null && (textbutton = b4Var.f46313a) != null) {
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
        n3Var.f46541f.o3(false);
        if (z11) {
            i9 = R.string.RichEditorEditLinkButton;
        } else {
            i9 = R.string.RichEditorCreateLinkButton;
        }
        n3Var.f46537a.showInputDialog(LocaleController.getString(i9), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new x3(n3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i9, b6 b6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.setOnShowListener(new fh.k(3, editTextBoldCursor));
        c2Var.q(250L);
        if (i9 != 0 && (c2Var.d(i9) instanceof TextView)) {
            ((TextView) c2Var.d(i9)).setTextColor(f6.v0(f6.f23230q7, b6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, z3 z3Var) {
        if (o2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        dy dyVar = new dy(bundle);
        dyVar.f37752y2 = new kh.p(z3Var, 25);
        if (z10) {
            ?? obj = new Object();
            obj.f23653a = true;
            o2Var.showAsSheet(dyVar, obj);
            return;
        }
        o2Var.presentFragment(dyVar);
    }
}
