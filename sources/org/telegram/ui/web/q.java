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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y51;
import w7.x5;
public final class q extends y51 {
    public j f42238e;
    public final Runnable f42239f;
    public final org.telegram.ui.r h;
    public org.telegram.ui.ActionBar.v0 f42240n;
    public org.telegram.ui.ActionBar.v0 f42241r;
    public String f42242s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f42243w = new HashSet();
    public final HashSet f42244x = new HashSet();

    public q(org.telegram.ui.a0 a0Var, org.telegram.ui.r rVar) {
        this.f42239f = a0Var;
        this.h = rVar;
    }

    public static void Y(q qVar, HashSet hashSet) {
        MessagesController.getInstance(qVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(qVar.currentAccount).getClientUserId(), 0, true, 0);
        qVar.d.b(new ArrayList(hashSet));
        j jVar = qVar.f42238e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        qVar.f42243w.clear();
        qVar.actionBar.r();
        qVar.f32876a.Y2.N(true);
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
    public final void U(ArrayList arrayList, v51 v51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f42244x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f42242s);
        j jVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f42159a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f42127a;
                    h51 J = h51.J(h.class);
                    J.f26634z = 3;
                    J.f26626q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!jVar.f42163f) {
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
                arrayList.add(h51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f42159a;
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
                    n2 a11 = o2.b().a(hostAuthority);
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
                    if (f0(hostAuthority, this.f42242s) || f0(str, this.f42242s) || f0(str2, this.f42242s)) {
                        String str3 = this.f42242s;
                        int i13 = h.f42127a;
                        h51 J2 = h51.J(h.class);
                        J2.f26634z = 3;
                        J2.f26626q = false;
                        J2.H = messageObject2;
                        J2.f26622m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f42238e.f42159a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f42242s;
                    int i15 = h.f42127a;
                    h51 J3 = h51.J(h.class);
                    J3.f26634z = 3;
                    J3.f26626q = false;
                    J3.H = messageObject3;
                    J3.f26622m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f42238e.f42163f) {
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
        if (h51Var.G(h.class)) {
            if (this.actionBar.s()) {
                c0(h51Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) h51Var.H));
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        if (h51Var.G(h.class)) {
            c0(h51Var, view);
            return true;
        }
        return false;
    }

    public final void c0(h51 h51Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) h51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f42243w;
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f42241r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(v0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = j6.f20690d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(j6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(j6.f21090z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new o(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(j6.f21071y8));
        this.v.setOnTouchListener(new ci.d(2));
        j3.addView(this.v, x5.m(1.0f, 0, -1, 65, 0, 0));
        this.f42241r = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new p(this);
        this.f42240n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42240n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42240n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f32876a.j(new lb0(this, 10));
        xw0 xw0Var = new xw0(context, null, 1, null);
        xw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        xw0Var.f32782e.setVisibility(8);
        xw0Var.e(false, false);
        xw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(xw0Var, x5.c(-1.0f, -1));
        this.f32876a.setEmptyView(xw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f42243w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f42239f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new fi.b2(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f42243w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f32876a.getChildCount()) {
                View childAt = this.f32876a.getChildAt(i12);
                this.f32876a.getClass();
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
        this.f32876a.Y2.N(true);
        if (i11 >= 0) {
            this.f32876a.X2.h1(i11, i10);
        } else {
            this.f32876a.X2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f20690d6)) > 0.721f) {
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
