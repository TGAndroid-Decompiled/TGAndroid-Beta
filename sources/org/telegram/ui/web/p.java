package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.qa;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.u61;
public final class p extends n71 {
    public j f44854f;
    public final Runnable h;
    public final org.telegram.ui.q f44855n;
    public org.telegram.ui.ActionBar.w0 f44856r;
    public org.telegram.ui.ActionBar.w0 f44857s;
    public String v;
    public NumberTextView f44858w;
    public final j e = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f44859x = new HashSet();
    public final HashSet f44860y = new HashSet();

    public p(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.h = a0Var;
        this.f44855n = qVar;
    }

    public static void Z(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.e.b(new ArrayList(hashSet));
        j jVar = pVar.f44854f;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f44859x.clear();
        pVar.actionBar.p();
        pVar.f30764a.f32504g3.O(true);
    }

    public static boolean g0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !wh.u(" ", lowerCase2, lowerCase) && !wh.u(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !wh.u(" ", translitSafe2, translitSafe) && !wh.u(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void V(ArrayList arrayList, k71 k71Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f44860y;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.v);
        j jVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f44790a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = l.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = h.f44766a;
                    u61 K = u61.K(h.class);
                    K.f33262z = 3;
                    K.f33254q = false;
                    K.H = messageObject;
                    K.L(f0(messageObject));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!jVar.f44793f) {
                arrayList.add(u61.q(arrayList.size(), 32));
                arrayList.add(u61.q(arrayList.size(), 32));
                arrayList.add(u61.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f44790a;
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
                    if (g0(hostAuthority, this.v) || g0(str, this.v) || g0(str2, this.v)) {
                        String str3 = this.v;
                        int i13 = h.f44766a;
                        u61 K2 = u61.K(h.class);
                        K2.f33262z = 3;
                        K2.f33254q = false;
                        K2.H = messageObject2;
                        K2.f33250m = str3;
                        K2.L(f0(messageObject2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f44854f.f44790a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = l.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.v;
                    int i15 = h.f44766a;
                    u61 K3 = u61.K(h.class);
                    K3.f33262z = 3;
                    K3.f33254q = false;
                    K3.H = messageObject3;
                    K3.f33250m = str4;
                    K3.L(f0(messageObject3));
                    arrayList.add(K3);
                }
            }
            if (!this.f44854f.f44793f) {
                arrayList.add(u61.q(arrayList.size(), 32));
                arrayList.add(u61.q(arrayList.size(), 32));
                arrayList.add(u61.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(u61.C(charSequence));
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void X(u61 u61Var, View view) {
        if (u61Var.H(h.class)) {
            if (this.actionBar.q()) {
                d0(u61Var, view);
                return;
            }
            finishFragment();
            this.f44855n.run(l.a((MessageObject) u61Var.H));
        }
    }

    @Override
    public final boolean Y(u61 u61Var, View view) {
        if (u61Var.H(h.class)) {
            d0(u61Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = y6.f23357d6;
        f7.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(y6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = y6.G6;
        f7.m(kVar2, 5, i11, getResourceProvider());
        f7.m(this.actionBar, 3, y6.f23770z8, getResourceProvider());
        f7.m(this.actionBar, 1, i11, getResourceProvider());
        f7.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z i12 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i12.getContext());
        this.f44858w = numberTextView;
        numberTextView.setTextSize(18);
        this.f44858w.setTypeface(AndroidUtilities.bold());
        this.f44858w.setTextColor(getThemedColor(y6.f23751y8));
        this.f44858w.setOnTouchListener(new ei.d(2));
        i12.addView(this.f44858w, kb1.q(1.0f, 0, -1, 65, 0, 0));
        this.f44857s = i12.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        i12.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.l().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new o(this);
        this.f44856r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f44856r.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f44856r.getSearchField();
        f7.V(searchField, i11, getResourceProvider());
        f7.E(searchField, y6.Si, getResourceProvider());
        f7.w(searchField, i11, getResourceProvider());
        this.f30764a.j(new ml(this, 22));
        fy0 fy0Var = new fy0(context, null, 1, null);
        fy0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        fy0Var.e.setVisibility(8);
        fy0Var.e(false, false);
        fy0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(fy0Var, kb1.g(-1.0f, -1));
        this.f30764a.setEmptyView(fy0Var);
        return this.fragmentView;
    }

    public final void d0(u61 u61Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) u61Var.H;
        boolean f02 = f0(messageObject);
        HashSet hashSet = this.f44859x;
        boolean z10 = false;
        if (f02) {
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
        this.f44858w.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.p();
        } else {
            this.actionBar.K(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f44857s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    public final void e0() {
        HashSet hashSet = this.f44859x;
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
        AndroidUtilities.runOnUIThread(new qa(clientUserId, intValue, 3), 80L);
    }

    public final boolean f0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f44859x.contains(Integer.valueOf(messageObject.getId()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h0() {
        int i10;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 < this.f30764a.getChildCount()) {
                View childAt = this.f30764a.getChildAt(i12);
                this.f30764a.getClass();
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
        this.f30764a.f32504g3.O(true);
        if (i11 >= 0) {
            this.f30764a.f32503f3.h1(i11, i10);
        } else {
            this.f30764a.f32503f3.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(y6.f23357d6)) > 0.721f) {
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

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(y6.x0(null, y6.f23357d6, false));
            }
            NumberTextView numberTextView = this.f44858w;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(y6.f23751y8));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f44856r;
            if (w0Var != null && w0Var.getSearchField() != null) {
                this.f44856r.getSearchField().setCursorColor(getThemedColor(y6.G6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
