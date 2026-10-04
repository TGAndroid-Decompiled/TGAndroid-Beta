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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import w7.z5;
public final class o extends x61 {
    public i f42296f;
    public final Runnable h;
    public final org.telegram.ui.s f42297n;
    public org.telegram.ui.ActionBar.v0 f42298r;
    public org.telegram.ui.ActionBar.v0 f42299s;
    public String v;
    public NumberTextView f42300w;
    public final i f42295e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f42301x = new HashSet();
    public final HashSet f42302y = new HashSet();

    public o(org.telegram.ui.b0 b0Var, org.telegram.ui.s sVar) {
        this.h = b0Var;
        this.f42297n = sVar;
    }

    public static void X(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.f42295e.b(new ArrayList(hashSet));
        i iVar = oVar.f42296f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.f42301x.clear();
        oVar.actionBar.r();
        oVar.f32731a.f25250f3.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !bi.u(" ", lowerCase2, lowerCase) && !bi.u(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !bi.u(" ", translitSafe2, translitSafe) && !bi.u(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void S(ArrayList arrayList, u61 u61Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f42302y;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.v);
        i iVar = this.f42295e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f42223a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f42191a;
                    g61 J = g61.J(g.class);
                    J.f26687z = 3;
                    J.f26679q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f42227f) {
                arrayList.add(g61.p(arrayList.size(), 32));
                arrayList.add(g61.p(arrayList.size(), 32));
                arrayList.add(g61.p(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f42223a;
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
                        int i13 = g.f42191a;
                        g61 J2 = g61.J(g.class);
                        J2.f26687z = 3;
                        J2.f26679q = false;
                        J2.H = messageObject2;
                        J2.f26675m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f42296f.f42223a;
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
                    int i15 = g.f42191a;
                    g61 J3 = g61.J(g.class);
                    J3.f26687z = 3;
                    J3.f26679q = false;
                    J3.H = messageObject3;
                    J3.f26675m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f42296f.f42227f) {
                arrayList.add(g61.p(arrayList.size(), 32));
                arrayList.add(g61.p(arrayList.size(), 32));
                arrayList.add(g61.p(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(g61.B(charSequence));
        }
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void U(g61 g61Var, View view) {
        if (g61Var.G(g.class)) {
            if (this.actionBar.s()) {
                c0(g61Var, view);
                return;
            }
            finishFragment();
            this.f42297n.run(k.a((MessageObject) g61Var.H));
        }
    }

    @Override
    public final boolean W(g61 g61Var, View view) {
        if (g61Var.G(g.class)) {
            c0(g61Var, view);
            return true;
        }
        return false;
    }

    public final void c0(g61 g61Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) g61Var.H;
        boolean e02 = e0(messageObject);
        HashSet hashSet = this.f42301x;
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
        this.f42300w.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.r();
        } else {
            this.actionBar.M(null, null);
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f42299s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(v0Var, z10, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = i6.f20822d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(i6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(i6.f21230z8), false);
        this.actionBar.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f42300w = numberTextView;
        numberTextView.setTextSize(18);
        this.f42300w.setTypeface(AndroidUtilities.bold());
        this.f42300w.setTextColor(getThemedColor(i6.f21211y8));
        this.f42300w.setOnTouchListener(new bi.d(2));
        j3.addView(this.f42300w, z5.m(1.0f, 0, -1, 65, 0, 0));
        this.f42299s = j3.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j3.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new n(this);
        this.f42298r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42298r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42298r.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f32731a.j(new xb0(this, 11));
        tx0 tx0Var = new tx0(context, null, 1, null);
        tx0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        tx0Var.f31201e.setVisibility(8);
        tx0Var.e(false, false);
        tx0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(tx0Var, z5.c(-1.0f, -1));
        this.f32731a.setEmptyView(tx0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f42301x;
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
        AndroidUtilities.runOnUIThread(new ei.c2(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f42301x.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f32731a.getChildCount()) {
                View childAt = this.f32731a.getChildAt(i12);
                this.f32731a.getClass();
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
        this.f32731a.f25250f3.N(true);
        if (i11 >= 0) {
            this.f32731a.f25249e3.h1(i11, i10);
        } else {
            this.f32731a.f25249e3.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f20822d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42295e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f42295e.c();
    }
}
