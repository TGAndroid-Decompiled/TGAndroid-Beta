package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.u61;
import w7.w5;
public final class o extends k71 {
    public i f43358e;
    public final Runnable f43359f;
    public final org.telegram.ui.s h;
    public org.telegram.ui.ActionBar.u0 f43360n;
    public org.telegram.ui.ActionBar.u0 f43361r;
    public String f43362s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f43363w = new HashSet();
    public final HashSet f43364x = new HashSet();

    public o(org.telegram.ui.b0 b0Var, org.telegram.ui.s sVar) {
        this.f43359f = b0Var;
        this.h = sVar;
    }

    public static void Y(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.d.b(new ArrayList(hashSet));
        i iVar = oVar.f43358e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.f43363w.clear();
        oVar.actionBar.t();
        oVar.f27776a.W2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.v0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.v0.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.v0.w(" ", translitSafe2, translitSafe) && !org.telegram.messenger.v0.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, h71 h71Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f43364x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f43362s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f43283a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f43248a;
                    u61 J = u61.J(g.class);
                    J.f31084z = 3;
                    J.f31076q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f43287f) {
                arrayList.add(u61.o(arrayList.size(), 32));
                arrayList.add(u61.o(arrayList.size(), 32));
                arrayList.add(u61.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f43283a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String a10 = k.a(messageObject2);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    String hostAuthority = AndroidUtilities.getHostAuthority(a10, true);
                    m2 a11 = n2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    if (message != null && (messageMedia = message.media) != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.site_name)) {
                        str = webPage.site_name;
                    } else if (a11 != null && !TextUtils.isEmpty(a11.d)) {
                        str = a11.d;
                    } else {
                        str = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.title)) {
                        str2 = webPage.title;
                    } else {
                        str2 = null;
                    }
                    if (f0(hostAuthority, this.f43362s) || f0(str, this.f43362s) || f0(str2, this.f43362s)) {
                        String str3 = this.f43362s;
                        int i13 = g.f43248a;
                        u61 J2 = u61.J(g.class);
                        J2.f31084z = 3;
                        J2.f31076q = false;
                        J2.H = messageObject2;
                        J2.f31072m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f43358e.f43283a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f43362s;
                    int i15 = g.f43248a;
                    u61 J3 = u61.J(g.class);
                    J3.f31084z = 3;
                    J3.f31076q = false;
                    J3.H = messageObject3;
                    J3.f31072m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f43358e.f43287f) {
                arrayList.add(u61.o(arrayList.size(), 32));
                arrayList.add(u61.o(arrayList.size(), 32));
                arrayList.add(u61.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(u61.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(u61 u61Var, View view) {
        if (u61Var.G(g.class)) {
            if (this.actionBar.u()) {
                c0(u61Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) u61Var.H));
        }
    }

    @Override
    public final boolean X(u61 u61Var, View view) {
        if (u61Var.G(g.class)) {
            c0(u61Var, view);
            return true;
        }
        return false;
    }

    public final void c0(u61 u61Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) u61Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f43363w;
        boolean z10 = false;
        if (e02) {
            if (messageObject != null) {
                hashSet.remove(Integer.valueOf(messageObject.getId()));
            }
            hVar.setChecked(false);
        } else {
            if (messageObject != null) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
            hVar.setChecked(true);
        }
        this.v.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.t();
        } else {
            this.actionBar.P(null, null);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f43361r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(u0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = h6.f20560d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(h6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.D(getThemedColor(h6.f20966z8), false);
        this.actionBar.E(getThemedColor(i11), false);
        this.actionBar.E(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.y k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(h6.f20948y8));
        this.v.setOnTouchListener(new bi.d(2));
        k10.addView(this.v, w5.m(1.0f, 0, -1, 65, 0, 0));
        this.f43361r = k10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        k10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.p().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.f43360n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43360n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f43360n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f27776a.j(new qh0(this, 12));
        gy0 gy0Var = new gy0(context, null, 1, null);
        gy0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        gy0Var.f26561e.setVisibility(8);
        gy0Var.e(false, false);
        gy0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(gy0Var, w5.d(-1.0f, -1));
        this.f27776a.setEmptyView(gy0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f43363w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f43359f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new ei.b2(clientUserId, intValue, 2), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f43363w.contains(Integer.valueOf(messageObject.getId()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g0() {
        int i10;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 < this.f27776a.getChildCount()) {
                View childAt = this.f27776a.getChildAt(i12);
                this.f27776a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i12++;
                    i11 = R;
                } else {
                    i10 = childAt.getTop();
                    i11 = R;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        this.f27776a.W2.N(true);
        if (i11 >= 0) {
            this.f27776a.V2.h1(i11, i10);
        } else {
            this.f27776a.V2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f20560d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.d.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.d.c();
    }
}
