package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vc1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public t31 B;
    public boolean C;
    public SpannableStringBuilder D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final org.telegram.ui.ActionBar.e6 G;
    public final TLRPC.TL_theme H;
    public EditTextBoldCursor f43536a;
    public EditTextBoldCursor f43537b;
    public org.telegram.ui.ActionBar.w0 f43538c;
    public org.telegram.ui.Cells.y8 d;
    public org.telegram.ui.Cells.y8 f43539e;
    public org.telegram.ui.Cells.ca f43540f;
    public org.telegram.ui.Cells.y9 h;
    public org.telegram.ui.Cells.y8 f43541n;
    public org.telegram.ui.ActionBar.c2 f43542r;
    public org.telegram.ui.Components.fn f43543s;
    public org.telegram.ui.Cells.k4 v;
    public EditTextBoldCursor f43544w;
    public LinearLayout f43545x;
    public int f43546y;

    public vc1(org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.F = f6Var;
        this.G = e6Var;
        if (e6Var != null) {
            tL_theme = e6Var.f22917r;
        } else {
            tL_theme = f6Var.B;
        }
        this.H = tL_theme;
        if (e6Var != null) {
            i10 = e6Var.f22919t;
        } else {
            i10 = f6Var.A;
        }
        this.currentAccount = i10;
        this.E = z10;
    }

    public static void U(vc1 vc1Var, int i10) {
        ConnectionsManager.getInstance(vc1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(vc1 vc1Var, TLRPC.TL_theme tL_theme) {
        try {
            vc1Var.f43542r.dismiss();
            vc1Var.f43542r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.ActionBar.g6.C1(vc1Var.F, vc1Var.G, tL_theme, vc1Var.currentAccount, false);
        vc1Var.finishFragment();
    }

    public static void W(vc1 vc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            vc1Var.f43542r.dismiss();
            vc1Var.f43542r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.c5.f0(vc1Var.currentAccount, tL_error, vc1Var, updatetheme, new Object[0]);
    }

    public static void X(vc1 vc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        vc1Var.f43546y = ConnectionsManager.getInstance(vc1Var.currentAccount).sendRequest(createtheme, new u80(28, vc1Var, str), 2);
    }

    public static void Y(vc1 vc1Var) {
        org.telegram.ui.ActionBar.f6 f6Var = vc1Var.F;
        TLRPC.TL_theme tL_theme = vc1Var.H;
        if (!vc1Var.Z(vc1Var.f43536a.getText().toString(), true) || vc1Var.getParentActivity() == null) {
            return;
        }
        if (vc1Var.f43537b.length() == 0) {
            org.telegram.ui.Components.c5.u0(vc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (vc1Var.E) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(vc1Var.getParentActivity(), 3, null);
            vc1Var.f43542r = c2Var;
            c2Var.setOnCancelListener(new Object());
            vc1Var.f43542r.show();
            String obj = vc1Var.f43537b.getText().toString();
            tL_theme.title = obj;
            f6Var.f22941a = obj;
            f6Var.B.slug = vc1Var.f43536a.getText().toString();
            org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, true);
        } else {
            String str2 = tL_theme.slug;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = tL_theme.title;
            if (str4 != null) {
                str3 = str4;
            }
            String obj2 = vc1Var.f43536a.getText().toString();
            String obj3 = vc1Var.f43537b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                vc1Var.finishFragment();
                return;
            }
            vc1Var.f43542r = new org.telegram.ui.ActionBar.c2(vc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f22463id = tL_theme.f22529id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(vc1Var.currentAccount).sendRequest(updatetheme, new u80(29, vc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(vc1Var.currentAccount).bindRequestToGuid(sendRequest, vc1Var.classGuid);
            vc1Var.f43542r.setOnCancelListener(new jh.w(vc1Var, sendRequest, 9));
            vc1Var.f43542r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        t31 t31Var = this.B;
        if (t31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t31Var);
            this.B = null;
            this.A = null;
            if (this.f43546y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f43546y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.H;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.g6.f23401w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.g6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.A = str;
                t31 t31Var2 = new t31(11, this, str);
                this.B = t31Var2;
                AndroidUtilities.runOnUIThread(t31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.g6.f23279p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.E;
        if (isEmpty) {
            this.f43539e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                return;
            }
        }
        this.f43539e.setVisibility(0);
        this.f43539e.setText(str);
        this.f43539e.setTag(Integer.valueOf(i10));
        this.f43539e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.g6.f23028b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.E;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 20));
        this.f43538c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new mh.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f43545x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f43545x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        linearLayout2.addView(this.f43545x, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 23);
        this.v = k4Var;
        k4Var.setText(LocaleController.getString(R.string.Info));
        this.f43545x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43537b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f43537b;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f43537b;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f43537b.setMaxLines(1);
        this.f43537b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f43537b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f43537b.setBackgroundDrawable(null);
        this.f43537b.setPadding(0, 0, 0, 0);
        this.f43537b.setSingleLine(true);
        this.f43537b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f43537b.setInputType(163872);
        this.f43537b.setImeOptions(6);
        this.f43537b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f43537b.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f43537b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43537b.setCursorWidth(1.5f);
        this.f43545x.addView(this.f43537b, i7.f6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f43537b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final vc1 f42069b;

            {
                this.f42069b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        vc1 vc1Var = this.f42069b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(vc1Var.f43537b);
                            return true;
                        }
                        vc1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f42069b.f43538c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.fn fnVar = new org.telegram.ui.Components.fn(context, 25);
        this.f43543s = fnVar;
        this.f43545x.addView(fnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f43545x.addView(linearLayout4, i7.f6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f43544w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f43544w.setTextSize(1, 18.0f);
        this.f43544w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f43544w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f43544w.setMaxLines(1);
        this.f43544w.setLines(1);
        this.f43544w.setEnabled(false);
        this.f43544w.setBackgroundDrawable(null);
        this.f43544w.setPadding(0, 0, 0, 0);
        this.f43544w.setSingleLine(true);
        this.f43544w.setInputType(163840);
        this.f43544w.setImeOptions(6);
        linearLayout4.addView(this.f43544w, i7.f6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f43536a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f43536a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f43536a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f43536a.setMaxLines(1);
        this.f43536a.setLines(1);
        this.f43536a.setBackgroundDrawable(null);
        this.f43536a.setPadding(0, 0, 0, 0);
        this.f43536a.setSingleLine(true);
        this.f43536a.setInputType(163872);
        this.f43536a.setImeOptions(6);
        this.f43536a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f43536a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f43536a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43536a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f43536a, i7.f6.n(-1, 50));
        this.f43536a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final vc1 f42069b;

            {
                this.f42069b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        vc1 vc1Var = this.f42069b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(vc1Var.f43537b);
                            return true;
                        }
                        vc1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f42069b.f43538c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f43536a.addTextChangedListener(new uc1(this));
        if (z10) {
            this.f43536a.setOnFocusChangeListener(new kd(this, 11));
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f43539e = y8Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.g6.f23028b7;
        y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i13, i14));
        this.f43539e.setVisibility(8);
        this.f43539e.setBottomPadding(0);
        linearLayout2.addView(this.f43539e, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
        this.d = y8Var2;
        y8Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.hv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.y8 y8Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.D = replaceTags;
            y8Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, i7.f6.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context, this.parentLayout, 1);
            this.f43540f = caVar;
            linearLayout2.addView(caVar, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
            this.h = y9Var;
            y9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, i7.f6.n(-1, -2));
            this.h.setOnClickListener(new t70(27, this, context));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.f43541n = y8Var4;
            y8Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f43541n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f43541n, i7.f6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.H;
        if (tL_theme != null) {
            this.C = true;
            this.f43537b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f43537b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f43536a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f43536a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.C = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.ActionBar.c2 c2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.e6 e6Var = this.G;
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var2 == f6Var && e6Var2 == e6Var && (c2Var2 = this.f43542r) != null) {
                try {
                    c2Var2.dismiss();
                    this.f43542r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var3 == f6Var && e6Var3 == e6Var && (c2Var = this.f43542r) != null) {
                try {
                    c2Var.dismiss();
                    this.f43542r = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        LinearLayout linearLayout = this.f43545x;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43541n, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43541n, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43539e, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43539e, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43539e, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43539e, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23401w6));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f43536a;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43536a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43537b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43537b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43537b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43544w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43544w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.fn fnVar = this.f43543s;
        Paint paint = org.telegram.ui.ActionBar.g6.f23183k0;
        int i15 = org.telegram.ui.ActionBar.g6.f23063d7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43543s, 1, null, org.telegram.ui.ActionBar.g6.f23183k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23220m3, org.telegram.ui.ActionBar.g6.f23292q3}, null, org.telegram.ui.ActionBar.g6.f23313ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23238n3, org.telegram.ui.ActionBar.g6.f23308r3}, null, org.telegram.ui.ActionBar.g6.f23067dc));
        org.telegram.ui.Cells.ca caVar = this.f43540f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23220m3.f22881y;
        int i16 = org.telegram.ui.ActionBar.g6.f23350ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(caVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, org.telegram.ui.ActionBar.g6.f23292q3.f22881y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23257o3, org.telegram.ui.ActionBar.g6.f23324s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23275p3, org.telegram.ui.ActionBar.g6.f23343t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        org.telegram.ui.Cells.ca caVar2 = this.f43540f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23257o3.f22881y;
        int i17 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(caVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, org.telegram.ui.ActionBar.g6.f23324s3.f22881y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23086ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23104fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23430y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23447z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23333sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23013ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23049cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23066db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23015ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23103fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23248nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23332sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23266od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43540f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23246nb));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.E) {
            this.f43536a.requestFocus();
            AndroidUtilities.showKeyboard(this.f43536a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.E) {
            this.f43536a.requestFocus();
            AndroidUtilities.showKeyboard(this.f43536a);
        }
    }
}
