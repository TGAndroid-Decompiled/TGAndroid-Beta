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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zw0;
import w7.x5;
public final class p extends a61 {
    public i f38897f;
    public final Runnable h;
    public final org.telegram.ui.r f38898n;
    public org.telegram.ui.ActionBar.w0 f38899r;
    public org.telegram.ui.ActionBar.w0 f38900s;
    public String v;
    public NumberTextView f38901w;
    public final i e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f38902x = new HashSet();
    public final HashSet f38903y = new HashSet();

    public p(org.telegram.ui.a0 a0Var, org.telegram.ui.r rVar) {
        this.h = a0Var;
        this.f38898n = rVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.e.b(new ArrayList(hashSet));
        i iVar = pVar.f38897f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        pVar.f38902x.clear();
        pVar.actionBar.r();
        pVar.f22336a.Y2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.w1.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.w1.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.w1.w(" ", translitSafe2, translitSafe) && !org.telegram.messenger.w1.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, x51 x51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f38903y;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.v);
        i iVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f38824a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f38795a;
                    j51 J = j51.J(g.class);
                    J.f25140z = 3;
                    J.f25132q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f38827f) {
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f38824a;
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
                    if (f0(hostAuthority, this.v) || f0(str, this.v) || f0(str2, this.v)) {
                        String str3 = this.v;
                        int i13 = g.f38795a;
                        j51 J2 = j51.J(g.class);
                        J2.f25140z = 3;
                        J2.f25132q = false;
                        J2.H = messageObject2;
                        J2.f25128m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f38897f.f38824a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.v;
                    int i15 = g.f38795a;
                    j51 J3 = j51.J(g.class);
                    J3.f25140z = 3;
                    J3.f25132q = false;
                    J3.H = messageObject3;
                    J3.f25128m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f38897f.f38827f) {
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(j51.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(j51 j51Var, View view) {
        if (j51Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(j51Var, view);
                return;
            }
            finishFragment();
            this.f38898n.run(k.a((MessageObject) j51Var.H));
        }
    }

    @Override
    public final boolean X(j51 j51Var, View view) {
        if (j51Var.G(g.class)) {
            c0(j51Var, view);
            return true;
        }
        return false;
    }

    public final void c0(j51 j51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) j51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f38902x;
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
        this.f38901w.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.r();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f38900s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = j6.f18863d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(j6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(j6.f19266z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.a0 j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38901w = numberTextView;
        numberTextView.setTextSize(18);
        this.f38901w.setTypeface(AndroidUtilities.bold());
        this.f38901w.setTextColor(getThemedColor(j6.f19247y8));
        this.f38901w.setOnTouchListener(new bi.d(2));
        j3.addView(this.f38901w, x5.m(1.0f, 0, -1, 65, 0, 0));
        this.f38900s = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new o(this);
        this.f38899r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38899r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f38899r.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f22336a.j(new kb0(this, 11));
        zw0 zw0Var = new zw0(context, null, 1, null);
        zw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        zw0Var.e.setVisibility(8);
        zw0Var.e(false, false);
        zw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zw0Var, x5.c(-1.0f, -1));
        this.f22336a.setEmptyView(zw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f38902x;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new ei.b2(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f38902x.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f22336a.getChildCount()) {
                View childAt = this.f22336a.getChildAt(i12);
                this.f22336a.getClass();
                int S = RecyclerView.S(childAt);
                if (S < 0) {
                    i12++;
                    i11 = S;
                } else {
                    i10 = childAt.getTop();
                    i11 = S;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        this.f22336a.Y2.N(true);
        if (i11 >= 0) {
            this.f22336a.X2.h1(i11, i10);
        } else {
            this.f22336a.X2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f18863d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }
}
