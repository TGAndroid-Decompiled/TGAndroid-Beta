package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class w70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, oe.d, rh.d {
    public final ArrayList E;
    public org.telegram.ui.Components.x30 F;
    public int G;
    public int H;
    public int I;
    public final oe.e f44990a;
    public org.telegram.ui.Components.j20 f44991b;
    public org.telegram.ui.ActionBar.y5 f44992c;
    public u70 d;
    public ScrollView e;
    public v70 f44993f;
    public org.telegram.ui.Components.mm0 h;
    public s4.c0 f44994n;
    public org.telegram.ui.Components.ey0 f44995r;
    public t70 f44996s;
    public ArrayList v;
    public int f44997w;
    public boolean f44998x;
    public final HashMap f44999y;

    public w70() {
        super(null);
        this.f44990a = new oe.e(3, this, org.telegram.ui.Components.ds.h, 350L, 0.0f);
        this.f44999y = new HashMap();
        this.E = new ArrayList();
    }

    public static void V(w70 w70Var, View view, int i10) {
        org.telegram.ui.Cells.t4 t4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !w70Var.f44998x) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(w70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                w70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.t4) && (contact = (t4Var = (org.telegram.ui.Cells.t4) view).getContact()) != null) {
            org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) w70Var.f44999y.get(contact.key);
            if (x30Var != null) {
                w70Var.f44993f.a(x30Var);
            } else {
                org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(w70Var.getParentActivity(), null, contact, true, w70Var.resourceProvider);
                v70 v70Var = w70Var.f44993f;
                ArrayList arrayList = v70Var.f44729c;
                w70 w70Var2 = v70Var.f44730f;
                w70Var2.E.add(x30Var2);
                w70Var2.f44999y.put(x30Var2.getKey(), x30Var2);
                AnimatorSet animatorSet = v70Var.f44727a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    v70Var.f44727a.cancel();
                }
                v70Var.f44728b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                v70Var.f44727a = animatorSet2;
                animatorSet2.addListener(new i50(v70Var, 1));
                v70Var.f44727a.setInterpolator(org.telegram.ui.Components.ds.h);
                v70Var.f44727a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.ALPHA, 0.0f, 1.0f));
                v70Var.addView(x30Var2);
                w70Var2.e.post(new p00(v70Var, 14));
                x30Var2.setOnClickListener(w70Var);
            }
            w70Var.f44991b.e(!w70Var.E.isEmpty(), true);
            if (x30Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.zp zpVar = t4Var.e;
            if (zpVar != null) {
                zpVar.a(z10, true);
            }
        }
    }

    public static void W(w70 w70Var) {
        ArrayList arrayList = w70Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.x30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(w70Var.currentAccount).getInviteText(i10));
            w70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        w70Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.r5 X(w70 w70Var) {
        return w70Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.r5 Y(w70 w70Var) {
        return w70Var.simpleActionBar;
    }

    public static void Z(w70 w70Var) {
        w70Var.f44998x = false;
        t70 t70Var = w70Var.f44996s;
        if (t70Var.h) {
            t70Var.h = false;
            t70Var.l();
        }
        w70Var.f44996s.E(null);
        w70Var.h.setFastScrollVisible(true);
        w70Var.h.setVerticalScrollBarEnabled(false);
        w70Var.f44995r.e(false, true);
        w70Var.f44995r.setStickerType(0);
        w70Var.f44995r.d.setText(LocaleController.getString(R.string.NoContacts));
        w70Var.f44995r.e.setText("");
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final View O() {
        return this.fragmentView;
    }

    public final void a0() {
        int i10;
        if (this.h == null) {
            return;
        }
        float f7 = this.f44990a.f19334f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f7 > 0.0f) {
            i10 = AndroidUtilities.dp(4.0f) + ((int) f7);
        } else {
            i10 = 0;
        }
        oi.a.d(this.h, this.G, this.H, currentActionBarHeight + i10, 0);
        this.f44995r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23327bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23307ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
    }

    public final void b0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.v = arrayList;
        Collections.sort(arrayList, new bv(1));
        org.telegram.ui.Components.ey0 ey0Var = this.f44995r;
        if (ey0Var != null) {
            ey0Var.e(false, true);
        }
        t70 t70Var = this.f44996s;
        if (t70Var != null) {
            t70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        this.f44998x = false;
        this.E.clear();
        this.f44999y.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 6));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(1, R.drawable.outline_header_search);
        this.f44992c = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.y5 y5Var = this.f44992c;
        y5Var.N();
        y5Var.f23289z0 = new q70(this);
        this.f44992c.setSearchFieldHint(LocaleController.getString(R.string.Search));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        v70 v70Var = new v70(this, context);
        this.f44993f = v70Var;
        this.e.addView(v70Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        this.d = new u70(this, context);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(6);
        c10Var.f27029w = false;
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, c10Var, 0, null);
        this.f44995r = ey0Var;
        ey0Var.addView(c10Var, 0);
        this.f44995r.setAnimateLayoutChange(true);
        this.f44995r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f44995r.e.setText("");
        this.f44995r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f44994n = new s4.c0(1, false);
        this.f44996s = new t70(this, context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.u1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f44995r);
        this.h.setAdapter(this.f44996s);
        this.h.setLayoutManager(this.f44994n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i10);
        k0Var.addView(this.h, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        k0Var.addView(this.f44995r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new i3(this, 17));
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        j2Var.f22737l = 180;
        j2Var.invalidateSelf();
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f44991b = j20Var;
        j20Var.f29455c.setImageDrawable(j2Var);
        this.f44991b.e(false, false);
        this.f44991b.setContentDescription(LocaleController.getString(R.string.Next));
        this.f44991b.setOnClickListener(new x50(this, 4));
        t70 t70Var = this.f44996s;
        if (t70Var != null && !this.f44998x) {
            int h = t70Var.h();
            org.telegram.ui.Components.ey0 ey0Var2 = this.f44995r;
            if (h != 2) {
                i11 = 4;
            }
            ey0Var2.setVisibility(i11);
        }
        k0Var.addView(this.d, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f44991b, org.telegram.ui.Components.j20.b());
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35535h1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ey0 ey0Var;
        if (i10 == NotificationCenter.contactsImported) {
            b0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (ey0Var = this.f44995r) != null) {
            ey0Var.e(false, true);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23501l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23519m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23539n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23307ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23447i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23483k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 262148, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23538n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44993f, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23347ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44993f, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23366di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        int i10 = k1Var.f47115a.f(8).d;
        this.I = i10;
        org.telegram.ui.Components.j20 j20Var = this.f44991b;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.H, i10));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.t4 t4Var;
        ContactsController.Contact contact;
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (x30Var.f34606y) {
            this.F = null;
            this.f44993f.a(x30Var);
            this.f44991b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.h.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t4) && (contact = (t4Var = (org.telegram.ui.Cells.t4) childAt).getContact()) != null) {
                    boolean containsKey = this.f44999y.containsKey(contact.key);
                    org.telegram.ui.Components.zp zpVar = t4Var.e;
                    if (zpVar != null) {
                        zpVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.x30 x30Var2 = this.F;
        if (x30Var2 != null) {
            x30Var2.a();
        }
        this.F = x30Var;
        x30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        b0();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.G = i11;
        this.H = i13;
        a0();
        u70 u70Var = this.d;
        if (u70Var != null) {
            u70Var.setTranslationY(AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.j20 j20Var = this.f44991b;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.mm0 mm0Var = this.h;
            if (mm0Var != null) {
                mm0Var.A1();
            }
            if (this.f44993f != null) {
                for (int i10 = 0; i10 < this.f44993f.getChildCount(); i10++) {
                    View childAt = this.f44993f.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.x30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void M() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
