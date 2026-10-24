package org.telegram.ui.web;

import ai.ra;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vx0;
import w7.z5;
public final class p extends d71 {
    public j e;
    public final Runnable f43209f;
    public final org.telegram.ui.q h;
    public org.telegram.ui.ActionBar.u0 f43210n;
    public org.telegram.ui.ActionBar.u0 f43211r;
    public String f43212s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f43213w = new HashSet();
    public final HashSet f43214x = new HashSet();

    public p(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.f43209f = a0Var;
        this.h = qVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f43213w.clear();
        pVar.actionBar.r();
        pVar.f25615a.Z2.N(true);
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
    public final void U(ArrayList arrayList, a71 a71Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f43214x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f43212s);
        j jVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f43143a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f43120a;
                    l61 J = l61.J(h.class);
                    J.f28240z = 3;
                    J.f28232q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!jVar.f43146f) {
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
                arrayList.add(l61.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f43143a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String a10 = l.a(messageObject2);
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
                    if (f0(hostAuthority, this.f43212s) || f0(str, this.f43212s) || f0(str2, this.f43212s)) {
                        String str3 = this.f43212s;
                        int i13 = h.f43120a;
                        l61 J2 = l61.J(h.class);
                        J2.f28240z = 3;
                        J2.f28232q = false;
                        J2.H = messageObject2;
                        J2.f28228m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.e.f43143a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f43212s;
                    int i15 = h.f43120a;
                    l61 J3 = l61.J(h.class);
                    J3.f28240z = 3;
                    J3.f28232q = false;
                    J3.H = messageObject3;
                    J3.f28228m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f43146f) {
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
        if (l61Var.G(h.class)) {
            if (this.actionBar.s()) {
                c0(l61Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) l61Var.H));
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        if (l61Var.G(h.class)) {
            c0(l61Var, view);
            return true;
        }
        return false;
    }

    public final void c0(l61 l61Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) l61Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f43213w;
        boolean z10 = false;
        if (e02) {
            if (messageObject != null) {
                hashSet.remove(Integer.valueOf(messageObject.getId()));
            }
            iVar.setChecked(false);
        } else {
            if (messageObject != null) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
            iVar.setChecked(true);
        }
        this.v.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.r();
        } else {
            this.actionBar.N(null, null);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f43211r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(u0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21184d6;
        r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        r6.m(kVar2, 5, i11, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f21591z8, getResourceProvider());
        r6.m(this.actionBar, 1, i11, getResourceProvider());
        r6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.y i12 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i12.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(k6.f21574y8));
        this.v.setOnTouchListener(new di.d(2));
        i12.addView(this.v, z5.m(1.0f, 0, -1, 65, 0, 0));
        this.f43211r = i12.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        i12.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new o(this);
        this.f43210n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43210n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f43210n.getSearchField();
        r6.W(searchField, i11, getResourceProvider());
        r6.F(searchField, k6.Si, getResourceProvider());
        r6.x(searchField, i11, getResourceProvider());
        this.f25615a.j(new iv(this, 17));
        vx0 vx0Var = new vx0(context, null, 1, null);
        vx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        vx0Var.e.setVisibility(8);
        vx0Var.e(false, false);
        vx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(vx0Var, z5.c(-1.0f, -1));
        this.f25615a.setEmptyView(vx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f43213w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f43209f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new ra(clientUserId, intValue, 3), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f43213w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f25615a.getChildCount()) {
                View childAt = this.f25615a.getChildAt(i12);
                this.f25615a.getClass();
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
        this.f25615a.Z2.N(true);
        if (i11 >= 0) {
            this.f25615a.Y2.h1(i11, i10);
        } else {
            this.f25615a.Y2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21184d6)) > 0.721f) {
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

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.f21184d6, false));
            }
            NumberTextView numberTextView = this.v;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f21574y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f43210n;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f43210n.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
