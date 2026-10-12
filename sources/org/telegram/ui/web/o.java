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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.z61;
import w7.a6;
public final class o extends c71 {
    public i e;
    public final Runnable f41443f;
    public final org.telegram.ui.r h;
    public org.telegram.ui.ActionBar.u0 f41444n;
    public org.telegram.ui.ActionBar.u0 f41445r;
    public String f41446s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f41447w = new HashSet();
    public final HashSet f41448x = new HashSet();

    public o(org.telegram.ui.b0 b0Var, org.telegram.ui.r rVar) {
        this.f41443f = b0Var;
        this.h = rVar;
    }

    public static void Y(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.d.b(new ArrayList(hashSet));
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.f41447w.clear();
        oVar.actionBar.s();
        oVar.f23964a.W2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !yh.v(" ", lowerCase2, lowerCase) && !yh.v(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !yh.v(" ", translitSafe2, translitSafe) && !yh.v(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f41448x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f41446s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f41380a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f41356a;
                    l61 J = l61.J(g.class);
                    J.f26967z = 3;
                    J.f26959q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f41383f) {
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f41380a;
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
                    l2 a11 = m2.b().a(hostAuthority);
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
                    if (f0(hostAuthority, this.f41446s) || f0(str, this.f41446s) || f0(str2, this.f41446s)) {
                        String str3 = this.f41446s;
                        int i13 = g.f41356a;
                        l61 J2 = l61.J(g.class);
                        J2.f26967z = 3;
                        J2.f26959q = false;
                        J2.H = messageObject2;
                        J2.f26955m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.e.f41380a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f41446s;
                    int i15 = g.f41356a;
                    l61 J3 = l61.J(g.class);
                    J3.f26967z = 3;
                    J3.f26959q = false;
                    J3.H = messageObject3;
                    J3.f26955m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f41383f) {
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(l61.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        if (l61Var.G(g.class)) {
            if (this.actionBar.t()) {
                c0(l61Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) l61Var.H));
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        if (l61Var.G(g.class)) {
            c0(l61Var, view);
            return true;
        }
        return false;
    }

    public final void c0(l61 l61Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) l61Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f41447w;
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
            this.actionBar.s();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f41445r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(u0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = g6.f19901d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(g6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = g6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(g6.f20307z8), false);
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(g6.f20290y8));
        this.v.setOnTouchListener(new ci.d(2));
        j10.addView(this.v, a6.m(1.0f, 0, -1, 65, 0, 0));
        this.f41445r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.f41444n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41444n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f41444n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f23964a.j(new kc0(this, 13));
        wx0 wx0Var = new wx0(context, null, 1, null);
        wx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        wx0Var.e.setVisibility(8);
        wx0Var.e(false, false);
        wx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(wx0Var, a6.d(-1.0f, -1));
        this.f23964a.setEmptyView(wx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f41447w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f41443f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new fi.a2(clientUserId, intValue, 2), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f41447w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f23964a.getChildCount()) {
                View childAt = this.f23964a.getChildAt(i12);
                this.f23964a.getClass();
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
        this.f23964a.W2.N(true);
        if (i11 >= 0) {
            this.f23964a.V2.h1(i11, i10);
        } else {
            this.f23964a.V2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f19901d6)) > 0.721f) {
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
