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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.x51;
import w7.y5;
public final class o extends o61 {
    public i f39111f;
    public final Runnable h;
    public final org.telegram.ui.t f39112n;
    public org.telegram.ui.ActionBar.w0 f39113r;
    public org.telegram.ui.ActionBar.w0 f39114s;
    public String v;
    public NumberTextView f39115w;
    public final i e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f39116x = new HashSet();
    public final HashSet f39117y = new HashSet();

    public o(org.telegram.ui.c0 c0Var, org.telegram.ui.t tVar) {
        this.h = c0Var;
        this.f39112n = tVar;
    }

    public static void Y(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.e.b(new ArrayList(hashSet));
        i iVar = oVar.f39111f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.f39116x.clear();
        oVar.actionBar.s();
        oVar.f27008a.Y2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.v(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.v(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.l0.v(" ", translitSafe2, translitSafe) && !org.telegram.messenger.l0.v(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, l61 l61Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f39117y;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.v);
        i iVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f39045a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f39015a;
                    x51 J = x51.J(g.class);
                    J.f30315z = 3;
                    J.f30307q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f39048f) {
                arrayList.add(x51.o(arrayList.size(), 32));
                arrayList.add(x51.o(arrayList.size(), 32));
                arrayList.add(x51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f39045a;
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
                    if (f0(hostAuthority, this.v) || f0(str, this.v) || f0(str2, this.v)) {
                        String str3 = this.v;
                        int i13 = g.f39015a;
                        x51 J2 = x51.J(g.class);
                        J2.f30315z = 3;
                        J2.f30307q = false;
                        J2.H = messageObject2;
                        J2.f30303m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f39111f.f39045a;
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
                    int i15 = g.f39015a;
                    x51 J3 = x51.J(g.class);
                    J3.f30315z = 3;
                    J3.f30307q = false;
                    J3.H = messageObject3;
                    J3.f30303m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f39111f.f39048f) {
                arrayList.add(x51.o(arrayList.size(), 32));
                arrayList.add(x51.o(arrayList.size(), 32));
                arrayList.add(x51.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(x51.B(charSequence));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(x51 x51Var, View view) {
        if (x51Var.G(g.class)) {
            if (this.actionBar.t()) {
                c0(x51Var, view);
                return;
            }
            finishFragment();
            this.f39112n.run(k.a((MessageObject) x51Var.H));
        }
    }

    @Override
    public final boolean X(x51 x51Var, View view) {
        if (x51Var.G(g.class)) {
            c0(x51Var, view);
            return true;
        }
        return false;
    }

    public final void c0(x51 x51Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) x51Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f39116x;
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
        this.f39115w.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.s();
        } else {
            this.actionBar.P(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f39114s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = i6.f19057d6;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(i6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = i6.G6;
        lVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(i6.f19463z8), false);
        this.actionBar.E(getThemedColor(i11), false);
        this.actionBar.E(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.a0 k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.f39115w = numberTextView;
        numberTextView.setTextSize(18);
        this.f39115w.setTypeface(AndroidUtilities.bold());
        this.f39115w.setTextColor(getThemedColor(i6.f19444y8));
        this.f39115w.setOnTouchListener(new bi.d(2));
        k10.addView(this.f39115w, y5.m(1.0f, 0, -1, 65, 0, 0));
        this.f39114s = k10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        k10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.f39113r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39113r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f39113r.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f27008a.j(new hg0(this, 10));
        kx0 kx0Var = new kx0(context, null, 1, null);
        kx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        kx0Var.e.setVisibility(8);
        kx0Var.e(false, false);
        kx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(kx0Var, y5.c(-1.0f, -1));
        this.f27008a.setEmptyView(kx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f39116x;
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
            if (this.f39116x.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f27008a.getChildCount()) {
                View childAt = this.f27008a.getChildAt(i12);
                this.f27008a.getClass();
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
        this.f27008a.Y2.N(true);
        if (i11 >= 0) {
            this.f27008a.X2.h1(i11, i10);
        } else {
            this.f27008a.X2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f19057d6)) > 0.721f) {
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
