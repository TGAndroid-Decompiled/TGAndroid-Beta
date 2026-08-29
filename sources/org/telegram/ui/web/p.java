package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import jh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.w41;
public final class p extends p51 {
    public j f44132e;
    public final Runnable f44133f;
    public final org.telegram.ui.t h;
    public org.telegram.ui.ActionBar.w0 f44134n;
    public org.telegram.ui.ActionBar.w0 f44135r;
    public String f44136s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f44137w = new HashSet();
    public final HashSet f44138x = new HashSet();

    public p(org.telegram.ui.d0 d0Var, org.telegram.ui.t tVar) {
        this.f44133f = d0Var;
        this.h = tVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        j jVar = pVar.f44132e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f44137w.clear();
        pVar.actionBar.r();
        pVar.f31601a.U2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !x3.w(" ", lowerCase2, lowerCase) && !x3.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !x3.w(" ", translitSafe2, translitSafe) && !x3.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, k51 k51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f44138x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f44136s);
        j jVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f44069a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f44044a;
                    w41 J = w41.J(h.class);
                    J.f34313z = 3;
                    J.f34305q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!jVar.f44073f) {
                arrayList.add(w41.o(arrayList.size(), 32));
                arrayList.add(w41.o(arrayList.size(), 32));
                arrayList.add(w41.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f44069a;
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
                    j2 a11 = k2.b().a(hostAuthority);
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
                    if (f0(hostAuthority, this.f44136s) || f0(str, this.f44136s) || f0(str2, this.f44136s)) {
                        String str3 = this.f44136s;
                        int i13 = h.f44044a;
                        w41 J2 = w41.J(h.class);
                        J2.f34313z = 3;
                        J2.f34305q = false;
                        J2.H = messageObject2;
                        J2.f34301m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f44132e.f44069a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f44136s;
                    int i15 = h.f44044a;
                    w41 J3 = w41.J(h.class);
                    J3.f34313z = 3;
                    J3.f34305q = false;
                    J3.H = messageObject3;
                    J3.f34301m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f44132e.f44073f) {
                arrayList.add(w41.o(arrayList.size(), 32));
                arrayList.add(w41.o(arrayList.size(), 32));
                arrayList.add(w41.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(w41.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(w41 w41Var, View view) {
        if (w41Var.G(h.class)) {
            if (this.actionBar.s()) {
                c0(w41Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) w41Var.H));
        }
    }

    @Override
    public final boolean X(w41 w41Var, View view) {
        if (w41Var.G(h.class)) {
            c0(w41Var, view);
            return true;
        }
        return false;
    }

    public final void c0(w41 w41Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) w41Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f44137w;
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f44135r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = g6.f23062d6;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(g6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = g6.G6;
        lVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(g6.f23452z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(g6.y8));
        this.v.setOnTouchListener(new mh.d(2));
        j10.addView(this.v, f6.m(1.0f, 0, -1, 65, 0, 0));
        this.f44135r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.D = new o(this);
        this.f44134n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f44134n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f44134n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f31601a.j(new h00(this, 12));
        qw0 qw0Var = new qw0(context, null, 1, null);
        qw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        qw0Var.f32122e.setVisibility(8);
        qw0Var.e(false, false);
        qw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(qw0Var, f6.c(-1.0f, -1));
        this.f31601a.setEmptyView(qw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f44137w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f44133f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new a8(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f44137w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f31601a.getChildCount()) {
                View childAt = this.f31601a.getChildAt(i12);
                this.f31601a.getClass();
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
        this.f31601a.U2.N(true);
        if (i11 >= 0) {
            this.f31601a.T2.h1(i11, i10);
        } else {
            this.f31601a.T2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f23062d6)) > 0.721f) {
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
