package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import hh.c8;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.xm;

public final class p extends f51 {

    public j f43929e;

    public final Runnable f43930f;
    public final org.telegram.ui.s h;

    public org.telegram.ui.ActionBar.v0 f43931n;

    public org.telegram.ui.ActionBar.v0 f43932r;

    public String f43933s;
    public NumberTextView v;
    public final j d = new j(null, this.currentAccount, new m(this, 0));

    public final HashSet f43934w = new HashSet();

    public final HashSet f43935x = new HashSet();

    public p(org.telegram.ui.d0 d0Var, org.telegram.ui.s sVar) {
        this.f43930f = d0Var;
        this.h = sVar;
    }

    public static void Y(p pVar, HashSet hashSet) {
        MessagesController.getInstance(pVar.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(pVar.currentAccount).getClientUserId(), 0, true, 0);
        pVar.d.b(new ArrayList(hashSet));
        j jVar = pVar.f43929e;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        pVar.f43934w.clear();
        pVar.actionBar.s();
        pVar.f28261a.U2.N(true);
    }

    public static boolean f0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.y1.x(" ", lowerCase2, lowerCase) && !org.telegram.messenger.y1.x(".", lowerCase2, lowerCase)) {
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
            if (!strTranslitSafe.startsWith(strTranslitSafe2) && !org.telegram.messenger.y1.x(" ", strTranslitSafe2, strTranslitSafe) && !org.telegram.messenger.y1.x(".", strTranslitSafe2, strTranslitSafe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, b51 b51Var) {
        CharSequence charSequence;
        String str;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.f43935x;
        hashSet.clear();
        boolean zIsEmpty = TextUtils.isEmpty(this.f43933s);
        j jVar = this.d;
        if (zIsEmpty) {
            ArrayList arrayList2 = jVar.f43873a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                MessageObject messageObject = (MessageObject) obj;
                String strA = l.a(messageObject);
                if (!TextUtils.isEmpty(strA) && !strA.startsWith("#") && !strA.startsWith("$") && !strA.startsWith("@")) {
                    hashSet.add(strA);
                    int i11 = h.f43844a;
                    n41 n41VarJ = n41.J(h.class);
                    n41VarJ.f30857z = 3;
                    n41VarJ.f30849q = false;
                    n41VarJ.H = messageObject;
                    n41VarJ.K(e0(messageObject));
                    arrayList.add(n41VarJ);
                }
            }
            charSequence = null;
            if (!jVar.f43877f) {
                arrayList.add(n41.o(arrayList.size(), 32));
                arrayList.add(n41.o(arrayList.size(), 32));
                arrayList.add(n41.o(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f43873a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String strA2 = l.a(messageObject2);
                if (!TextUtils.isEmpty(strA2) && !strA2.startsWith("#") && !strA2.startsWith("$") && !strA2.startsWith("@")) {
                    hashSet.add(strA2);
                    String hostAuthority = AndroidUtilities.getHostAuthority(strA2, true);
                    i2 i2VarA = j2.b().a(hostAuthority);
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    if (webPage == null || TextUtils.isEmpty(webPage.site_name)) {
                        str = (i2VarA == null || TextUtils.isEmpty(i2VarA.d)) ? null : i2VarA.d;
                    } else {
                        str = webPage.site_name;
                    }
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (f0(hostAuthority, this.f43933s) || f0(str, this.f43933s) || f0(str2, this.f43933s)) {
                        String str3 = this.f43933s;
                        int i13 = h.f43844a;
                        n41 n41VarJ2 = n41.J(h.class);
                        n41VarJ2.f30857z = 3;
                        n41VarJ2.f30849q = false;
                        n41VarJ2.H = messageObject2;
                        n41VarJ2.f30845m = str3;
                        n41VarJ2.K(e0(messageObject2));
                        arrayList.add(n41VarJ2);
                    }
                }
            }
            ArrayList arrayList4 = this.f43929e.f43873a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String strA3 = l.a(messageObject3);
                if (!TextUtils.isEmpty(strA3) && !strA3.startsWith("#") && !strA3.startsWith("$") && !strA3.startsWith("@")) {
                    hashSet.add(strA3);
                    String str4 = this.f43933s;
                    int i15 = h.f43844a;
                    n41 n41VarJ3 = n41.J(h.class);
                    n41VarJ3.f30857z = 3;
                    n41VarJ3.f30849q = false;
                    n41VarJ3.H = messageObject3;
                    n41VarJ3.f30845m = str4;
                    n41VarJ3.K(e0(messageObject3));
                    arrayList.add(n41VarJ3);
                }
            }
            if (!this.f43929e.f43877f) {
                arrayList.add(n41.o(arrayList.size(), 32));
                arrayList.add(n41.o(arrayList.size(), 32));
                arrayList.add(n41.o(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(n41.B(charSequence));
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    public final void W(n41 n41Var, View view) {
        if (n41Var.G(h.class)) {
            if (this.actionBar.t()) {
                c0(n41Var, view);
                return;
            }
            finishFragment();
            this.h.run(l.a((MessageObject) n41Var.H));
        }
    }

    @Override
    public final boolean X(n41 n41Var, View view) {
        if (!n41Var.G(h.class)) {
            return false;
        }
        c0(n41Var, view);
        return true;
    }

    public final void c0(n41 n41Var, View view) {
        i iVar = (i) view;
        MessageObject messageObject = (MessageObject) n41Var.H;
        boolean zE0 = e0(messageObject);
        HashSet hashSet = this.f43934w;
        if (zE0) {
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
            this.actionBar.s();
        } else {
            this.actionBar.O(null, null);
        }
        AndroidUtilities.updateViewShow(this.f43932r, hashSet.size() == 1, true, true);
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = g6.f23053d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(g6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = g6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(g6.f23443z8), false);
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new n(this));
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
        this.v = numberTextView;
        numberTextView.setTextSize(18);
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setTextColor(getThemedColor(g6.f23425y8));
        this.v.setOnTouchListener(new kh.e(2));
        zVarJ.addView(this.v, z5.m(1.0f, 0, -1, 65, 0, 0));
        this.f43932r = zVarJ.h(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        zVarJ.h(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        org.telegram.ui.ActionBar.v0 v0VarC = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        v0VarC.F();
        v0VarC.D = new o(this);
        this.f43931n = v0VarC;
        v0VarC.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43931n.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f43931n.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        this.f28261a.j(new xm(this, 17));
        iw0 iw0Var = new iw0(context, null, 1, null);
        iw0Var.d.setText(LocaleController.getString(R.string.WebNoBookmarks));
        iw0Var.f29506e.setVisibility(8);
        iw0Var.e(false, false);
        iw0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(iw0Var, z5.c(-1.0f, -1));
        this.f28261a.setEmptyView(iw0Var);
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.f43934w;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int iIntValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.f43930f;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new c8(clientUserId, iIntValue, 2), 80L);
    }

    public final boolean e0(MessageObject messageObject) {
        if (messageObject != null) {
            return this.f43934w.contains(Integer.valueOf(messageObject.getId()));
        }
        return false;
    }

    public final void g0() {
        int top;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f28261a.getChildCount()) {
                top = 0;
                break;
            }
            View childAt = this.f28261a.getChildAt(i11);
            this.f28261a.getClass();
            int iR = RecyclerView.R(childAt);
            if (iR >= 0) {
                top = childAt.getTop();
                i10 = iR;
                break;
            } else {
                i11++;
                i10 = iR;
            }
        }
        this.f28261a.U2.N(true);
        if (i10 >= 0) {
            this.f28261a.T2.h1(i10, top);
        } else {
            this.f28261a.T2.h1(0, 0);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f23053d6)) > 0.721f;
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
