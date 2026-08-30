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
import org.telegram.ui.Components.o70;
import org.telegram.ui.oy;
import org.telegram.ui.vq0;
public abstract class d4 {
    public static EditTextBoldCursor a(Context context, f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(j6.v0(j6.f20012j5, f6Var));
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
        editTextBoldCursor.setLineColors(j6.v0(j6.f20031k6, f6Var), j6.v0(j6.f20049l6, f6Var), j6.v0(j6.f20122p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(j6.v0(j6.f20216uf, f6Var));
        editTextBoldCursor.setHandlesColor(j6.v0(j6.f20234vf, f6Var));
        return editTextBoldCursor;
    }

    public static o70 b(o70 o70Var, org.telegram.ui.ActionBar.p2 p2Var, final q3 q3Var, final boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f45878a) != null) {
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
                q3Var.f46090f.o3(true);
                k(p2Var, z4, new a4(q3Var, 2));
            }
            return null;
        }
        o70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
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
        o70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
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
        o70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new vq0(p2Var, q3Var, z4, 14), false);
        o70Var.Z();
        return o70Var;
    }

    public static o70 c(o70 o70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final f6 f6Var, final o3 o3Var, final boolean z4) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = o3Var.f46040b;
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
                e(context, f6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, o3Var, z4);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, f6Var, o3Var, z4);
            }
            return null;
        }
        o70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        d4.e(context, f6Var, o3Var, z4);
                        return;
                    default:
                        d4.d(context, f6Var, o3Var, z4);
                        return;
                }
            }
        }, false);
        o70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        d4.e(context, f6Var, o3Var, z4);
                        return;
                    default:
                        d4.d(context, f6Var, o3Var, z4);
                        return;
                }
            }
        }, false);
        o70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new gg.j(p2Var, (Object) context, (Object) f6Var, (Object) o3Var, z4, 23), false);
        o70Var.Z();
        return o70Var;
    }

    public static void d(Context context, f6 f6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = o3Var.c();
        int i11 = o3Var.f46040b;
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
        g(context, f6Var, o3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new y3(o3Var, 3));
    }

    public static void e(Context context, f6 f6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c3 = o3Var.c();
        int i11 = o3Var.f46040b;
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
        g(context, f6Var, o3Var, z4, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new y3(o3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, f6 f6Var, o3 o3Var, boolean z4) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c3 = o3Var.c();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i11 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = o3Var.f46040b;
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
        EditTextBoldCursor a2 = a(context, f6Var, string, l10);
        f10.addView(a2, b6.n(-1, 64));
        cg.u0 u0Var = new cg.u0(a2, p2Var, z4, o3Var, 28);
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = string2;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o9.b(c3, u0Var, a2, o3Var, 6));
        if (c3) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new rh.e(u0Var, 12));
            String string3 = LocaleController.getString(R.string.Delete);
            y3 y3Var = new y3(o3Var, 2);
            d2Var.m0 = string3;
            d2Var.f19601n0 = y3Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.G0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, f6Var);
    }

    public static void g(Context context, f6 f6Var, o3 o3Var, boolean z4, String str, String str2, String str3, y3 y3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        int i10 = 0;
        f10.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = o3Var.f46040b;
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
        EditTextBoldCursor a2 = a(context, f6Var, string, l10);
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f10.addView(a2, b6.n(-1, 64));
        f10.addView(a10, b6.n(-1, 64));
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        alertDialog$Builder.f19503a.O = str;
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.m1(a2, a10, y3Var, 7));
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
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void h(q3 q3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i10;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f45878a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z10) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = x5.l(q3Var.e);
        }
        String str = l10;
        q3Var.f46090f.o3(false);
        if (z10) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        q3Var.f46087a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z4, new a4(q3Var, 1));
    }

    public static void i(q3 q3Var, boolean z4) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        e4 e4Var = q3Var.d;
        if (e4Var != null && (textbutton = e4Var.f45878a) != null) {
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
        q3Var.f46090f.o3(false);
        if (z10) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        q3Var.f46087a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z4, new a4(q3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, f6 f6Var) {
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.setOnShowListener(new kh.j(3, editTextBoldCursor));
        d2Var.q(250L);
        if (i10 != 0 && (d2Var.d(i10) instanceof TextView)) {
            ((TextView) d2Var.d(i10)).setTextColor(j6.v0(j6.f20141q7, f6Var));
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
        oy oyVar = new oy(bundle);
        oyVar.f37131z2 = new rh.e(c4Var, 13);
        if (z4) {
            ?? obj = new Object();
            obj.f20478a = true;
            p2Var.showAsSheet(oyVar, obj);
            return;
        }
        p2Var.presentFragment(oyVar);
    }
}
