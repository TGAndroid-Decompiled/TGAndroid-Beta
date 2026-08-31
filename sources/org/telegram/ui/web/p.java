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
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.x51;
public final class p extends c61 {
    public i f42658e;
    public final Runnable f42659f;
    public final org.telegram.ui.t h;
    public org.telegram.ui.ActionBar.w0 f42660n;
    public org.telegram.ui.ActionBar.w0 f42661r;
    public String f42662s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f42663w = new HashSet();
    public final HashSet f42664x = new HashSet();

    public p(org.telegram.ui.c0 c0Var, org.telegram.ui.t tVar) {
        this.f42659f = c0Var;
        this.h = tVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        i iVar = pVar.f42658e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        pVar.f42663w.clear();
        pVar.actionBar.r();
        pVar.f25815a.V2.N(true);
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
    public final void U(ArrayList arrayList, x51 x51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f42664x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f42662s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f42581a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = g.f42552a;
                    j51 J = j51.J(g.class);
                    J.f28027z = 3;
                    J.f28019q = false;
                    J.H = messageObject;
                    J.K(e0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f42585f) {
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
                arrayList.add(j51.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f42581a;
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
                    if (f0(hostAuthority, this.f42662s) || f0(str, this.f42662s) || f0(str2, this.f42662s)) {
                        String str3 = this.f42662s;
                        int i13 = g.f42552a;
                        j51 J2 = j51.J(g.class);
                        J2.f28027z = 3;
                        J2.f28019q = false;
                        J2.H = messageObject2;
                        J2.f28015m = str3;
                        J2.K(e0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f42658e.f42581a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a12 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f42662s;
                    int i15 = g.f42552a;
                    j51 J3 = j51.J(g.class);
                    J3.f28027z = 3;
                    J3.f28019q = false;
                    J3.H = messageObject3;
                    J3.f28015m = str4;
                    J3.K(e0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f42658e.f42585f) {
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
            this.h.run(k.a((MessageObject) j51Var.H));
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
        HashSet hashSet = this.f42663w;
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f42661r;
        if (hashSet.size() == 1) {
            z4 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z4, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21659d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(k6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.B(getThemedColor(k6.f22055z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(k6.f22038y8));
        this.v.setOnTouchListener(new s2(1));
        j10.addView(this.v, c6.m(1.0f, 0, -1, 65, 0, 0));
        this.f42661r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new o(this);
        this.f42660n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42660n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42660n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(k6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f25815a.j(new nb0(this, 10));
        ax0 ax0Var = new ax0(context, null, 1, null);
        ax0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        ax0Var.f25364e.setVisibility(8);
        ax0Var.e(false, false);
        ax0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(ax0Var, c6.c(-1.0f, -1));
        this.f25815a.setEmptyView(ax0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f42663w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f42659f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new b8(clientUserId, intValue, 1), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f42663w.contains(Integer.valueOf(messageObject.getId()))) {
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
            if (i12 < this.f25815a.getChildCount()) {
                View childAt = this.f25815a.getChildAt(i12);
                this.f25815a.getClass();
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
        this.f25815a.V2.N(true);
        if (i11 >= 0) {
            this.f25815a.U2.h1(i11, i10);
        } else {
            this.f25815a.U2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21659d6)) > 0.721f) {
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
