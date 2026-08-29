package sf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d2;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k4;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.tn;
import org.telegram.ui.yu0;
public final class r extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 d;

    public static void Y(r rVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(rVar.getParentActivity(), rVar.currentAccount, tL_businessChatLink, rVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
        char c3 = 65535;
        boolean z10 = false;
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
                z10 = true;
            }
        }
        if (c3 == 0 || (c3 == 65535 && z10)) {
            return 0;
        }
        if (c3 == 2) {
            return 2;
        }
        return 1;
    }

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, c6 c6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof hv0) && ((hv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        c2[] c2VarArr = new c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        o oVar = new o(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        oVar.setInputType(49153);
        oVar.setTextSize(1, 18.0f);
        oVar.setText(tL_businessChatLink.title);
        int i11 = g6.f23169j5;
        oVar.setTextColor(g6.v0(i11, c6Var));
        oVar.setHintColor(g6.v0(g6.Xh, c6Var));
        oVar.setCursorColor(g6.w0(null, g6.Wd, false));
        oVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setLineColors(g6.v0(g6.f23189k6, c6Var), g6.v0(g6.f23206l6, c6Var), g6.v0(g6.f23279p7, c6Var));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f9 = x3.f(activity, 1);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f9.addView(textView, f6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f9.addView(oVar, f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(f9);
        c2Var.f22778a = AndroidUtilities.dp(292.0f);
        oVar.setOnEditorActionListener(new d2(oVar, i10, tL_businessChatLink, c2VarArr, view2, 1));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new e3.d(oVar, i10, tL_businessChatLink, 16));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r.a(27));
        if (z10) {
            d = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(0, view2));
            d.setOnShowListener(new ih.k(2, oVar));
            d.q(250L);
        } else {
            c2Var.K = new yu0(17, view2, oVar);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new cg.d0(oVar, 11));
            c2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.q0(view2, oVar, 1));
            c2VarArr[0].show();
        }
        c2VarArr[0].f22784d0 = false;
        oVar.setSelection(oVar.getText().length());
    }

    @Override
    public final void U(ArrayList arrayList, k51 k51Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        w41 w41Var = new w41(2);
        w41Var.f34300l = string;
        w41Var.f34303o = string2;
        w41Var.f34299k = i10;
        arrayList.add(w41Var);
        k51Var.U();
        u d10 = u.d(this.currentAccount);
        if (d10.f47959b.size() < MessagesController.getInstance(d10.f47958a).businessChatLinksLimit) {
            w41 c3 = w41.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c3.f34305q = true;
            arrayList.add(c3);
        }
        ArrayList arrayList2 = u.d(this.currentAccount).f47959b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            ?? obj2 = new Object();
            obj2.f47927a = (TL_account.TL_businessChatLink) obj;
            w41 w41Var2 = new w41(29);
            w41Var2.G = obj2;
            arrayList.add(w41Var2);
        }
        k51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String q6 = a4.w.q(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(q6 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder f9 = u3.c.f(q6, "+");
            f9.append(currentUser.phone);
            arrayList3.add(f9.toString());
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
                    k4 k4Var = new k4(u3.c.e("https://", str), (h01) null);
                    k4Var.f29917f = this;
                    spannableString.setSpan(k4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(w41.B(spannableString));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void W(w41 w41Var, View view) {
        if (w41Var.d == 1) {
            u d10 = u.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.f47958a).sendRequest(createbusinesschatlink, new t(d10, 1));
        } else if (w41Var.f50845a == 29) {
            Object obj = w41Var.G;
            if (obj instanceof q) {
                Bundle h = a4.w.h(6, "chatMode");
                h.putString("business_link", ((q) obj).f47927a.link);
                presentFragment(new tn(h));
            }
        }
    }

    @Override
    public final boolean X(w41 w41Var, View view) {
        if (w41Var.f50845a == 29) {
            Object obj = w41Var.G;
            if (obj instanceof q) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((q) obj).f47927a;
                j70 H = j70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new org.telegram.ui.web.t1(tL_businessChatLink, 15), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final r f47880b;

                    {
                        this.f47880b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f47880b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.Y(this.f47880b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f47880b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22714a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.f23295q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final r f47880b;

                    {
                        this.f47880b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f47880b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.Y(this.f47880b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f47880b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22714a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.f23295q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final r f47880b;

                    {
                        this.f47880b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f47880b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.Y(this.f47880b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f47880b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new fi1(8, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22714a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(g6.f23295q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f31601a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f31601a.p1();
        o51 o51Var = this.f31601a;
        o51Var.U2.f29939r = false;
        this.actionBar.A(o51Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 != NotificationCenter.businessLinksUpdated && i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.businessLinkCreated) {
                Bundle h = a4.w.h(6, "chatMode");
                h.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new tn(h));
                return;
            } else if (i10 == NotificationCenter.needDeleteBusinessLink) {
                u.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        o51 o51Var = this.f31601a;
        if (o51Var != null && (k51Var = o51Var.U2) != null) {
            k51Var.N(true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        c2 c2Var = d;
        if (c2Var != null && c2Var.isShowing()) {
            if (z10) {
                d.dismiss();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        u d10 = u.d(this.currentAccount);
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
        mc.e();
        super.onFragmentDestroy();
    }
}
