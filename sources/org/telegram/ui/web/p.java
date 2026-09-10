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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.v51;
import w7.a6;
public final class p extends m61 {
    public j e;
    public final Runnable f38040f;
    public final org.telegram.ui.s h;
    public org.telegram.ui.ActionBar.w0 f38041n;
    public org.telegram.ui.ActionBar.w0 f38042r;
    public String f38043s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f38044w = new HashSet();
    public final HashSet f38045x = new HashSet();

    public p(org.telegram.ui.b0 b0Var, org.telegram.ui.s sVar) {
        this.f38040f = b0Var;
        this.h = sVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f38044w.clear();
        pVar.actionBar.r();
        pVar.f25171a.Y2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.a2.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.a2.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.a2.w(" ", translitSafe2, translitSafe) && !org.telegram.messenger.a2.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f38045x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f38043s);
        j jVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f37972a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f37942a;
                    v51 J = v51.J(h.class);
                    J.f27842z = 3;
                    J.f27834q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!jVar.f37975f) {
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f37972a;
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
                    o2 a11 = p2.b().a(hostAuthority);
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
                    if (f0(hostAuthority, this.f38043s) || f0(str, this.f38043s) || f0(str2, this.f38043s)) {
                        String str3 = this.f38043s;
                        int i13 = h.f37942a;
                        v51 J2 = v51.J(h.class);
                        J2.f27842z = 3;
                        J2.f27834q = false;
                        J2.H = messageObject2;
                        J2.f27830m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.e.f37972a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f38043s;
                    int i15 = h.f37942a;
                    v51 J3 = v51.J(h.class);
                    J3.f27842z = 3;
                    J3.f27834q = false;
                    J3.H = messageObject3;
                    J3.f27830m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.e.f37975f) {
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
                arrayList.add(v51.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(v51.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(v51 v51Var, View view) {
        if (v51Var.G(h.class)) {
            if (this.actionBar.s()) {
                c0(v51Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) v51Var.H));
        }
    }

    @Override
    public final boolean X(v51 v51Var, View view) {
        if (v51Var.G(h.class)) {
            c0(v51Var, view);
            return true;
        }
        return false;
    }

    public final void c0(v51 v51Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) v51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f38044w;
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
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f38042r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = j6.f17928d6;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(j6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = j6.G6;
        lVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(j6.f18327z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(j6.f18308y8));
        this.v.setOnTouchListener(new ai.h(2));
        j3.addView(this.v, a6.m(1.0f, 0, -1, 65, 0, 0));
        this.f38042r = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new o(this);
        this.f38041n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38041n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f38041n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f25171a.j(new al0(this, 7));
        jx0 jx0Var = new jx0(context, null, 1, null);
        jx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        jx0Var.e.setVisibility(8);
        jx0Var.e(false, false);
        jx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(jx0Var, a6.c(-1.0f, -1));
        this.f25171a.setEmptyView(jx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f38044w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f38040f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new di.e2(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f38044w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f25171a.getChildCount()) {
                View childAt = this.f25171a.getChildAt(i12);
                this.f25171a.getClass();
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
        this.f25171a.Y2.N(true);
        if (i11 >= 0) {
            this.f25171a.X2.h1(i11, i10);
        } else {
            this.f25171a.X2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f17928d6)) > 0.721f) {
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
