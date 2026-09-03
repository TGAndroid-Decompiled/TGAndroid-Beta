package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import k7.c6;
import mh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zw0;
public final class p extends b61 {
    public i f42621e;
    public final Runnable f42622f;
    public final org.telegram.ui.t h;
    public org.telegram.ui.ActionBar.w0 f42623n;
    public org.telegram.ui.ActionBar.w0 f42624r;
    public String f42625s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f42626w = new HashSet();
    public final HashSet f42627x = new HashSet();

    public p(org.telegram.ui.c0 c0Var, org.telegram.ui.t tVar) {
        this.f42622f = c0Var;
        this.h = tVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        i iVar = pVar.f42621e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        pVar.f42626w.clear();
        pVar.actionBar.r();
        pVar.f25523a.V2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !y3.w(" ", lowerCase2, lowerCase) && !y3.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !y3.w(" ", translitSafe2, translitSafe) && !y3.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f42627x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f42625s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f42544a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f42515a;
                    h51 J = h51.J(g.class);
                    J.f27388z = 3;
                    J.f27380q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f42548f) {
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f42544a;
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
                    if (f0(hostAuthority, this.f42625s) || f0(str, this.f42625s) || f0(str2, this.f42625s)) {
                        String str3 = this.f42625s;
                        int i13 = g.f42515a;
                        h51 J2 = h51.J(g.class);
                        J2.f27388z = 3;
                        J2.f27380q = false;
                        J2.H = messageObject2;
                        J2.f27376m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f42621e.f42544a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f42625s;
                    int i15 = g.f42515a;
                    h51 J3 = h51.J(g.class);
                    J3.f27388z = 3;
                    J3.f27380q = false;
                    J3.H = messageObject3;
                    J3.f27376m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f42621e.f42548f) {
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(h51.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        if (h51Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(h51Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) h51Var.H));
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        if (h51Var.G(g.class)) {
            c0(h51Var, view);
            return true;
        }
        return false;
    }

    public final void c0(h51 h51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) h51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f42626w;
        boolean z4 = false;
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
            this.actionBar.r();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f42624r;
        if (hashSet.size() == 1) {
            z4 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z4, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21661d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(k6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(k6.f22057z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(k6.f22040y8));
        this.v.setOnTouchListener(new s2(1));
        j10.addView(this.v, c6.m(1.0f, 0, -1, 65, 0, 0));
        this.f42624r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new o(this);
        this.f42623n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42623n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42623n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(k6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f25523a.j(new nb0(this, 10));
        zw0 zw0Var = new zw0(context, null, 1, null);
        zw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        zw0Var.f34033e.setVisibility(8);
        zw0Var.e(false, false);
        zw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zw0Var, c6.c(-1.0f, -1));
        this.f25523a.setEmptyView(zw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f42626w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f42622f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new b8(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f42626w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f25523a.getChildCount()) {
                View childAt = this.f25523a.getChildAt(i12);
                this.f25523a.getClass();
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
        this.f25523a.V2.N(true);
        if (i11 >= 0) {
            this.f25523a.U2.h1(i11, i10);
        } else {
            this.f25523a.U2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21661d6)) > 0.721f) {
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
