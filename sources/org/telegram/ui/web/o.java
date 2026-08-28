package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import gh.d8;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class o extends d51 {
    public i f43942e;
    public final Runnable f43943f;
    public final org.telegram.ui.r h;
    public org.telegram.ui.ActionBar.w0 f43944n;
    public org.telegram.ui.ActionBar.w0 f43945r;
    public String f43946s;
    public NumberTextView v;
    public final i d = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f43947w = new HashSet();
    public final HashSet f43948x = new HashSet();

    public o(org.telegram.ui.c0 c0Var, org.telegram.ui.r rVar) {
        this.f43943f = c0Var;
        this.h = rVar;
    }

    public static void X(o oVar, HashSet hashSet) {
        MessagesController.getInstance(oVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(oVar.currentAccount).getClientUserId(), 0, true, 0);
        oVar.d.b(new ArrayList(hashSet));
        i iVar = oVar.f43942e;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        oVar.f43947w.clear();
        oVar.actionBar.r();
        oVar.f27658a.U2.N(true);
    }

    public static boolean e0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.w(".", lowerCase2, lowerCase)) {
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!translitSafe.startsWith(translitSafe2) && !org.telegram.messenger.l0.w(" ", translitSafe2, translitSafe) && !org.telegram.messenger.l0.w(".", translitSafe2, translitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void T(ArrayList arrayList, z41 z41Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f43948x;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f43946s);
        i iVar = this.d;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f43886a;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                MessageObject messageObject = (MessageObject) obj;
                String a2 = k.a(messageObject);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i10 = g.f43857a;
                    l41 J = l41.J(g.class);
                    J.f30352z = 3;
                    J.f30344q = false;
                    J.H = messageObject;
                    J.K(d0(messageObject));
                    arrayList.add(J);
                }
            }
            charSequence = null;
            if (!iVar.f43890f) {
                arrayList.add(l41.o(arrayList.size(), 32));
                arrayList.add(l41.o(arrayList.size(), 32));
                arrayList.add(l41.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f43886a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String a3 = k.a(messageObject2);
                if (!TextUtils.isEmpty(a3) && !a3.startsWith("#") && !a3.startsWith("$") && !a3.startsWith("@")) {
                    hashSet.add(a3);
                    String hostAuthority = AndroidUtilities.getHostAuthority(a3, true);
                    h2 a10 = i2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    if (message != null && (messageMedia = message.media) != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.site_name)) {
                        str = webPage.site_name;
                    } else if (a10 != null && !TextUtils.isEmpty(a10.d)) {
                        str = a10.d;
                    } else {
                        str = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.title)) {
                        str2 = webPage.title;
                    } else {
                        str2 = null;
                    }
                    if (e0(hostAuthority, this.f43946s) || e0(str, this.f43946s) || e0(str2, this.f43946s)) {
                        String str3 = this.f43946s;
                        int i12 = g.f43857a;
                        l41 J2 = l41.J(g.class);
                        J2.f30352z = 3;
                        J2.f30344q = false;
                        J2.H = messageObject2;
                        J2.f30340m = str3;
                        J2.K(d0(messageObject2));
                        arrayList.add(J2);
                    }
                }
            }
            ArrayList arrayList4 = this.f43942e.f43886a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String a11 = k.a(messageObject3);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String str4 = this.f43946s;
                    int i14 = g.f43857a;
                    l41 J3 = l41.J(g.class);
                    J3.f30352z = 3;
                    J3.f30344q = false;
                    J3.H = messageObject3;
                    J3.f30340m = str4;
                    J3.K(d0(messageObject3));
                    arrayList.add(J3);
                }
            }
            if (!this.f43942e.f43890f) {
                arrayList.add(l41.o(arrayList.size(), 32));
                arrayList.add(l41.o(arrayList.size(), 32));
                arrayList.add(l41.o(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(l41.B(charSequence));
        }
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void V(l41 l41Var, View view) {
        if (l41Var.G(g.class)) {
            if (this.actionBar.s()) {
                b0(l41Var, view);
                return;
            }
            finishFragment();
            this.h.run(k.a((MessageObject) l41Var.H));
        }
    }

    @Override
    public final boolean W(l41 l41Var, View view) {
        if (l41Var.G(g.class)) {
            b0(l41Var, view);
            return true;
        }
        return false;
    }

    public final void b0(l41 l41Var, View view) {
        h hVar = (h) view;
        MessageObject messageObject = (MessageObject) l41Var.H;
        boolean d02 = d0(messageObject);
        HashSet hashSet = this.f43947w;
        boolean z10 = false;
        if (d02) {
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
            this.actionBar.N(null, null);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f43945r;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(w0Var, z10, true, true);
    }

    public final void c0() {
        HashSet hashSet = this.f43947w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f43943f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new d8(clientUserId, intValue, 2), 80L);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = f6.f23001d6;
        kVar.setBackgroundColor(getThemedColor(i9));
        this.actionBar.setActionModeColor(f6.w0(null, i9, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = f6.G6;
        kVar2.setTitleColor(getThemedColor(i10));
        this.actionBar.A(getThemedColor(f6.f23388z8), false);
        this.actionBar.C(getThemedColor(i10), false);
        this.actionBar.C(getThemedColor(i10), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new m(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(f6.f23371y8));
        this.v.setOnTouchListener(new jh.d(2));
        j10.addView(this.v, e6.m(1.0f, 0, -1, 65, 0, 0));
        this.f43945r = j10.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        j10.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.D = new n(this);
        this.f43944n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43944n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f43944n.getSearchField();
        searchField.setTextColor(getThemedColor(i10));
        searchField.setHintTextColor(getThemedColor(f6.Si));
        searchField.setCursorColor(getThemedColor(i10));
        this.f27658a.j(new kn(this, 16));
        gw0 gw0Var = new gw0(context, null, 1, null);
        gw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        gw0Var.f28885e.setVisibility(8);
        gw0Var.e(false, false);
        gw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(gw0Var, e6.c(-1.0f, -1));
        this.f27658a.setEmptyView(gw0Var);
        return this.fragmentView;
    }

    public final boolean d0(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f43947w.contains(Integer.valueOf(messageObject.getId()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f0() {
        int i9;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 < this.f27658a.getChildCount()) {
                View childAt = this.f27658a.getChildAt(i11);
                this.f27658a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i11++;
                    i10 = R;
                } else {
                    i9 = childAt.getTop();
                    i10 = R;
                    break;
                }
            } else {
                i9 = 0;
                break;
            }
        }
        this.f27658a.U2.N(true);
        if (i10 >= 0) {
            this.f27658a.T2.h1(i10, i9);
        } else {
            this.f27658a.T2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(f6.f23001d6)) > 0.721f) {
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
