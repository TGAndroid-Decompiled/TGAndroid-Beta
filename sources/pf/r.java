package pf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z1;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.ei1;
import org.telegram.ui.fk0;
import org.telegram.ui.qn;
public final class r extends d51 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 d;

    public static void X(r rVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        a0(rVar.getParentActivity(), rVar.currentAccount, tL_businessChatLink, rVar.resourceProvider);
    }

    public static int Z(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i9);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c10 == 65535) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                    c10 = 0;
                                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                    c10 = 1;
                                } else {
                                    c10 = 2;
                                }
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (c10 == 0 || (c10 == 65535 && z10)) {
            return 0;
        }
        if (c10 == 2) {
            return 2;
        }
        return 1;
    }

    public static void a0(Activity activity, int i9, TL_account.TL_businessChatLink tL_businessChatLink, b6 b6Var) {
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
        if (R != null && (R.getFragmentView() instanceof xu0) && ((xu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view2 = view;
        c2[] c2VarArr = new c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        }
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        o oVar = new o(activity, b6Var);
        MediaDataController.getInstance(i9).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        oVar.setInputType(49153);
        oVar.setTextSize(1, 18.0f);
        oVar.setText(tL_businessChatLink.title);
        int i10 = f6.f23108j5;
        oVar.setTextColor(f6.v0(i10, b6Var));
        oVar.setHintColor(f6.v0(f6.Xh, b6Var));
        oVar.setCursorColor(f6.w0(null, f6.Wd, false));
        oVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setLineColors(f6.v0(f6.f23127k6, b6Var), f6.v0(f6.f23144l6, b6Var), f6.v0(f6.f23212p7, b6Var));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        TextView textView = new TextView(activity);
        ll.n(i10, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f10.addView(textView, e6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(oVar, e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.n(f10);
        c2Var.f22761a = AndroidUtilities.dp(292.0f);
        oVar.setOnEditorActionListener(new z1(oVar, i9, tL_businessChatLink, c2VarArr, view2, 1));
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new c3.e(oVar, i9, tL_businessChatLink, 16));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(15));
        if (z10) {
            d = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(0, view2));
            d.setOnShowListener(new fh.k(2, oVar));
            d.q(250L);
        } else {
            c2Var.K = new eb0(17, view2, oVar);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new eh.l(oVar, 9));
            c2VarArr[0].setOnShowListener(new org.telegram.messenger.voip.q0(view2, oVar, 1));
            c2VarArr[0].show();
        }
        c2VarArr[0].f22767d0 = false;
        oVar.setSelection(oVar.getText().length());
    }

    @Override
    public final void T(ArrayList arrayList, z41 z41Var) {
        String formatString;
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i9 = R.raw.biz_links;
        l41 l41Var = new l41(2);
        l41Var.f30339l = string;
        l41Var.f30342o = string2;
        l41Var.f30338k = i9;
        arrayList.add(l41Var);
        z41Var.U();
        u d9 = u.d(this.currentAccount);
        if (d9.f45790b.size() < MessagesController.getInstance(d9.f45789a).businessChatLinksLimit) {
            l41 c10 = l41.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.f30344q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = u.d(this.currentAccount).f45790b;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ?? obj2 = new Object();
            obj2.f45752a = (TL_account.TL_businessChatLink) obj;
            l41 l41Var2 = new l41(29);
            l41Var2.G = obj2;
            arrayList.add(l41Var2);
        }
        z41Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String r10 = aa.d.r(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(r10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (Z(privacyRules) != 1 || Z(privacyRules2) != 2)) {
            StringBuilder e10 = ta.b.e(r10, "+");
            e10.append(currentUser.phone);
            arrayList3.add(e10.toString());
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() == 2) {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1));
            } else {
                formatString = LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
            }
            SpannableString spannableString = new SpannableString(formatString);
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                String str = (String) obj3;
                int indexOf = formatString.indexOf(str);
                if (indexOf > -1) {
                    g4 g4Var = new g4(ta.b.d("https://", str), (vz0) null);
                    g4Var.f28635f = this;
                    spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
                }
            }
            arrayList.add(l41.B(spannableString));
        }
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override
    public final void V(l41 l41Var, View view) {
        if (l41Var.d == 1) {
            u d9 = u.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d9.f45789a).sendRequest(createbusinesschatlink, new t(d9, 1));
        } else if (l41Var.f48814a == 29) {
            Object obj = l41Var.G;
            if (obj instanceof q) {
                Bundle h = aa.d.h(6, "chatMode");
                h.putString("business_link", ((q) obj).f45752a.link);
                presentFragment(new qn(h));
            }
        }
    }

    @Override
    public final boolean W(l41 l41Var, View view) {
        if (l41Var.f48814a == 29) {
            Object obj = l41Var.G;
            if (obj instanceof q) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((q) obj).f45752a;
                x60 H = x60.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new m2(tL_businessChatLink, 24), false);
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) {
                    public final r f45687b;

                    {
                        this.f45687b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f45687b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.X(this.f45687b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f45687b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22702a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.f23230q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) {
                    public final r f45687b;

                    {
                        this.f45687b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f45687b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.X(this.f45687b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f45687b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22702a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.f23230q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                    public final r f45687b;

                    {
                        this.f45687b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar = this.f45687b;
                                rVar.getClass();
                                Intent intent = new Intent(rVar.getParentActivity(), LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                rVar.startActivityForResult(intent, 500);
                                return;
                            case 1:
                                r.X(this.f45687b, tL_businessChatLink);
                                return;
                            default:
                                r rVar2 = this.f45687b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rVar2.getParentActivity(), 0, rVar2.getResourceProvider());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ei1(5, rVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                c2 c2Var = alertDialog$Builder.f22702a;
                                rVar2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(rVar2.getThemedColor(f6.f23230q7));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                H.W(this.f27658a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        this.f27658a.p1();
        c51 c51Var = this.f27658a;
        c51Var.U2.f35188r = false;
        this.actionBar.z(c51Var, true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 != NotificationCenter.businessLinksUpdated && i9 != NotificationCenter.privacyRulesUpdated) {
            if (i9 == NotificationCenter.businessLinkCreated) {
                Bundle h = aa.d.h(6, "chatMode");
                h.putString("business_link", ((TL_account.TL_businessChatLink) objArr[0]).link);
                presentFragment(new qn(h));
                return;
            } else if (i9 == NotificationCenter.needDeleteBusinessLink) {
                u.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
                return;
            } else {
                return;
            }
        }
        c51 c51Var = this.f27658a;
        if (c51Var != null && (z41Var = c51Var.U2) != null) {
            z41Var.N(true);
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
        u d9 = u.d(this.currentAccount);
        if (!d9.d) {
            d9.e(true, true);
        } else {
            d9.e(false, true);
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
        gc.e();
        super.onFragmentDestroy();
    }
}
