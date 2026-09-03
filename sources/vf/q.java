package vf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.a2;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.u9;
public final class q extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public static d2 d;

    public static void Y(q qVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(qVar.getParentActivity(), qVar.currentAccount, tL_businessChatLink, qVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c3 = 65535;
        boolean z4 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c3 == 65535) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    c3 = 0;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    c3 = 1;
                                } else {
                                    c3 = 2;
                                }
                            }
                        }
                    }
                }
                z4 = true;
            }
        }
        if (c3 == 0 || (c3 == 65535 && z4)) {
            return 0;
        }
        if (c3 == 2) {
            return 2;
        }
        return 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, g6 g6Var) {
        View view;
        boolean z4;
        AlertDialog$Builder alertDialog$Builder;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        View view2 = view;
        d2[] d2VarArr = new d2[1];
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        n nVar = new n(activity, g6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        nVar.setInputType(49153);
        nVar.setTextSize(1, 18.0f);
        nVar.setText(tL_businessChatLink.title);
        int i11 = k6.f21768j5;
        nVar.setTextColor(k6.v0(i11, g6Var));
        nVar.setHintColor(k6.v0(k6.Xh, g6Var));
        nVar.setCursorColor(k6.w0(null, k6.Wd, false));
        nVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        nVar.setSingleLine(true);
        nVar.setFocusable(true);
        nVar.setLineColors(k6.v0(k6.f21787k6, g6Var), k6.v0(k6.f21805l6, g6Var), k6.v0(k6.f21878p7, g6Var));
        nVar.setImeOptions(6);
        nVar.setBackgroundDrawable(null);
        nVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout h = l.d.h(activity, 1);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        h.addView(textView, c6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        h.addView(nVar, c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(h);
        d2Var.f21237a = AndroidUtilities.dp(292.0f);
        nVar.setOnEditorActionListener(new b2(nVar, i10, tL_businessChatLink, d2VarArr, view2, 1));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new e3.d(nVar, i10, tL_businessChatLink, 16));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sg.a(19));
        if (z4) {
            d = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new m(0, view2));
            d.setOnShowListener(new lh.j(2, nVar));
            d.q(250L);
        } else {
            d2Var.L = new a2(16, view2, nVar);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new fg.d0(nVar, 11));
            d2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.r0(view2, nVar, 1));
            d2VarArr[0].show();
        }
        d2VarArr[0].f21245e0 = false;
        nVar.setSelection(nVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        h51 h51Var = new h51(2);
        h51Var.f27375l = string;
        h51Var.f27378o = string2;
        h51Var.f27374k = i10;
        arrayList.add(h51Var);
        w51Var.U();
        t d10 = t.d(this.currentAccount);
        if (d10.f49239b.size() < MessagesController.getInstance(d10.f49238a).businessChatLinksLimit) {
            h51 c3 = h51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c3.f27380q = true;
            arrayList.add(c3);
        }
        ArrayList arrayList2 = t.d(this.currentAccount).f49239b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f49202a = (TL_account.TL_businessChatLink) obj;
            h51 h51Var2 = new h51(29);
            h51Var2.G = obj2;
            arrayList.add(h51Var2);
        }
        w51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String r10 = android.support.v4.media.a.r(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(r10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder f10 = w.c.f(r10, "+");
            f10.append(currentUser.phone);
            arrayList3.add(f10.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1));
            } else {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(formatString);
            int size2 = arrayList3.size();
            while (i11 < size2) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                String str = (String) obj3;
                int indexOf = formatString.indexOf(str);
                if (indexOf > -1) {
                    h4 h4Var = new h4(yh.k("https://", str), (s01) null);
                    h4Var.f27352f = this;
                    spannableString.setSpan(h4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(h51.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        if (h51Var.d == 1) {
            t d10 = t.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f49238a).sendRequest(createbusinesschatlink, new s(d10, 1));
        } else if (h51Var.f2505a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof p) {
                Bundle h = android.support.v4.media.a.h(6, "chatMode");
                h.putString("business_link", ((p) obj).f49202a.link);
                presentFragment(new xn(h));
            }
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        if (h51Var.f2505a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof p) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((p) obj).f49202a;
                q70 H = q70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new u9(tL_businessChatLink, 19), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final q f49132b;

                    {
                        this.f49132b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q qVar = this.f49132b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                q.Y(this.f49132b, tL_businessChatLink);
                                return;
                            default:
                                q qVar2 = this.f49132b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(9, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.f21168a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(k6.f21897q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final q f49132b;

                    {
                        this.f49132b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q qVar = this.f49132b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                q.Y(this.f49132b, tL_businessChatLink);
                                return;
                            default:
                                q qVar2 = this.f49132b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(9, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.f21168a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(k6.f21897q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final q f49132b;

                    {
                        this.f49132b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q qVar = this.f49132b;
                                qVar.getClass();
                                Intent intent = new Intent(qVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                qVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                q.Y(this.f49132b, tL_businessChatLink);
                                return;
                            default:
                                q qVar2 = this.f49132b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qVar2.getParentActivity(), 0, qVar2.getResourceProvider());
                                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.web.m(9, qVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                d2 d2Var = alertDialog$Builder.f21168a;
                                qVar2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(qVar2.getThemedColor(k6.f21897q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f25523a.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f25523a.o1();
        a61 a61Var = this.f25523a;
        a61Var.V2.f32651r = false;
        this.actionBar.A(a61Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle h = android.support.v4.media.a.h(6, "chatMode");
                h.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new xn(h));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                t.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        a61 a61Var = this.f25523a;
        if (a61Var != null && (w51Var = a61Var.V2) != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        d2 d2Var = d;
        if (d2Var != null && d2Var.isShowing()) {
            if (z4) {
                d.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        t d10 = t.d(this.currentAccount);
        if (!d10.d) {
            d10.e(true, true);
        } else {
            d10.e(false, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        ic.e();
        super.onFragmentDestroy();
    }
}
