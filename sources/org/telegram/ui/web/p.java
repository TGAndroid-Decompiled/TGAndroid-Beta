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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wx0;
import w7.z5;
public final class p extends e71 {
    public j e;
    public final Runnable f43220f;
    public final org.telegram.ui.q h;
    public org.telegram.ui.ActionBar.u0 f43221n;
    public org.telegram.ui.ActionBar.u0 f43222r;
    public String f43223s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f43224w = new HashSet();
    public final HashSet f43225x = new HashSet();

    public p(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.f43220f = a0Var;
        this.h = qVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f43224w.clear();
        pVar.actionBar.r();
        pVar.f25907a.Z2.N(true);
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
    public final void U(ArrayList arrayList, b71 b71Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f43225x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f43223s);
        j jVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f43154a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f43131a;
                    m61 J = m61.J(h.class);
                    J.f28572z = 3;
                    J.f28564q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!jVar.f43157f) {
                arrayList.add(m61.o(arrayList.size(), 32));
                arrayList.add(m61.o(arrayList.size(), 32));
                arrayList.add(m61.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f43154a;
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
                    if (f0(hostAuthority, this.f43223s) || f0(str, this.f43223s) || f0(str2, this.f43223s)) {
                        String str3 = this.f43223s;
                        int i13 = h.f43131a;
                        m61 J2 = m61.J(h.class);
                        J2.f28572z = 3;
                        J2.f28564q = false;
                        J2.H = messageObject2;
                        J2.f28560m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.e.f43154a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f43223s;
                    int i15 = h.f43131a;
                    m61 J3 = m61.J(h.class);
                    J3.f28572z = 3;
                    J3.f28564q = false;
                    J3.H = messageObject3;
                    J3.f28560m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f43157f) {
                arrayList.add(m61.o(arrayList.size(), 32));
                arrayList.add(m61.o(arrayList.size(), 32));
                arrayList.add(m61.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(m61.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(m61 m61Var, View view) {
        if (m61Var.G(h.class)) {
            if (this.actionBar.s()) {
                c0(m61Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) m61Var.H));
        }
    }

    @Override
    public final boolean X(m61 m61Var, View view) {
        if (m61Var.G(h.class)) {
            c0(m61Var, view);
            return true;
        }
        return false;
    }

    public final void c0(m61 m61Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) m61Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f43224w;
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f43222r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(u0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21183d6;
        r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        r6.m(kVar2, 5, i11, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f21590z8, getResourceProvider());
        r6.m(this.actionBar, 1, i11, getResourceProvider());
        r6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.y i12 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i12.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(k6.f21573y8));
        this.v.setOnTouchListener(new di.d(2));
        i12.addView(this.v, z5.m(1.0f, 0, -1, 65, 0, 0));
        this.f43222r = i12.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        i12.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new o(this);
        this.f43221n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43221n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f43221n.getSearchField();
        r6.W(searchField, i11, getResourceProvider());
        r6.F(searchField, k6.Si, getResourceProvider());
        r6.x(searchField, i11, getResourceProvider());
        this.f25907a.j(new kv(this, 17));
        wx0 wx0Var = new wx0(context, null, 1, null);
        wx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        wx0Var.e.setVisibility(8);
        wx0Var.e(false, false);
        wx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(wx0Var, z5.c(-1.0f, -1));
        this.f25907a.setEmptyView(wx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f43224w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f43220f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new ra(clientUserId, intValue, 3), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f43224w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f25907a.getChildCount()) {
                View childAt = this.f25907a.getChildAt(i12);
                this.f25907a.getClass();
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
        this.f25907a.Z2.N(true);
        if (i11 >= 0) {
            this.f25907a.Y2.h1(i11, i10);
        } else {
            this.f25907a.Y2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21183d6)) > 0.721f) {
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
                kVar.setActionModeColor(k6.x0(null, k6.f21183d6, false));
            }
            NumberTextView numberTextView = this.v;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f21573y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f43221n;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f43221n.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
