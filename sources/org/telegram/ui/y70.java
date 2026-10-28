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
public final class y70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, oe.d, rh.d {
    public final ArrayList E;
    public org.telegram.ui.Components.x30 F;
    public int G;
    public int H;
    public int I;
    public final oe.e f45866a;
    public org.telegram.ui.Components.j20 f45867b;
    public org.telegram.ui.ActionBar.y5 f45868c;
    public w70 d;
    public ScrollView e;
    public x70 f45869f;
    public org.telegram.ui.Components.nm0 h;
    public s4.c0 f45870n;
    public org.telegram.ui.Components.fy0 f45871r;
    public v70 f45872s;
    public ArrayList v;
    public int f45873w;
    public boolean f45874x;
    public final HashMap f45875y;

    public y70() {
        super(null);
        this.f45866a = new oe.e(3, this, org.telegram.ui.Components.ds.h, 350L, 0.0f);
        this.f45875y = new HashMap();
        this.E = new ArrayList();
    }

    public static void V(y70 y70Var, View view, int i10) {
        org.telegram.ui.Cells.t4 t4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !y70Var.f45874x) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(y70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                y70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.t4) && (contact = (t4Var = (org.telegram.ui.Cells.t4) view).getContact()) != null) {
            org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) y70Var.f45875y.get(contact.key);
            if (x30Var != null) {
                y70Var.f45869f.a(x30Var);
            } else {
                org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(y70Var.getParentActivity(), null, contact, true, y70Var.resourceProvider);
                x70 x70Var = y70Var.f45869f;
                ArrayList arrayList = x70Var.f45620c;
                y70 y70Var2 = x70Var.f45621f;
                y70Var2.E.add(x30Var2);
                y70Var2.f45875y.put(x30Var2.getKey(), x30Var2);
                AnimatorSet animatorSet = x70Var.f45618a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    x70Var.f45618a.cancel();
                }
                x70Var.f45619b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                x70Var.f45618a = animatorSet2;
                animatorSet2.addListener(new k50(x70Var, 1));
                x70Var.f45618a.setInterpolator(org.telegram.ui.Components.ds.h);
                x70Var.f45618a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x30Var2, View.ALPHA, 0.0f, 1.0f));
                x70Var.addView(x30Var2);
                y70Var2.e.post(new r00(x70Var, 14));
                x30Var2.setOnClickListener(y70Var);
            }
            y70Var.f45867b.e(!y70Var.E.isEmpty(), true);
            if (x30Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.aq aqVar = t4Var.e;
            if (aqVar != null) {
                aqVar.a(z10, true);
            }
        }
    }

    public static void W(y70 y70Var) {
        ArrayList arrayList = y70Var.E;
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
            intent.putExtra("sms_body", ContactsController.getInstance(y70Var.currentAccount).getInviteText(i10));
            y70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        y70Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.r5 X(y70 y70Var) {
        return y70Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.r5 Y(y70 y70Var) {
        return y70Var.simpleActionBar;
    }

    public static void Z(y70 y70Var) {
        y70Var.f45874x = false;
        v70 v70Var = y70Var.f45872s;
        if (v70Var.h) {
            v70Var.h = false;
            v70Var.l();
        }
        y70Var.f45872s.E(null);
        y70Var.h.setFastScrollVisible(true);
        y70Var.h.setVerticalScrollBarEnabled(false);
        y70Var.f45871r.e(false, true);
        y70Var.f45871r.setStickerType(0);
        y70Var.f45871r.d.setText(LocaleController.getString(R.string.NoContacts));
        y70Var.f45871r.e.setText("");
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
        float f7 = this.f45866a.f19333f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f7 > 0.0f) {
            i10 = AndroidUtilities.dp(4.0f) + ((int) f7);
        } else {
            i10 = 0;
        }
        oi.a.d(this.h, this.G, this.H, currentActionBarHeight + i10, 0);
        this.f45871r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23330bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23310ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
    }

    public final void b0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.v = arrayList;
        Collections.sort(arrayList, new dv(1));
        org.telegram.ui.Components.fy0 fy0Var = this.f45871r;
        if (fy0Var != null) {
            fy0Var.e(false, true);
        }
        v70 v70Var = this.f45872s;
        if (v70Var != null) {
            v70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        this.f45874x = false;
        this.E.clear();
        this.f45875y.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 6));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(1, R.drawable.outline_header_search);
        this.f45868c = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.y5 y5Var = this.f45868c;
        y5Var.N();
        y5Var.f23292z0 = new s70(this);
        this.f45868c.setSearchFieldHint(LocaleController.getString(R.string.Search));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        x70 x70Var = new x70(this, context);
        this.f45869f = x70Var;
        this.e.addView(x70Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        this.d = new w70(this, context);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(6);
        c10Var.f27026w = false;
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, c10Var, 0, null);
        this.f45871r = fy0Var;
        fy0Var.addView(c10Var, 0);
        this.f45871r.setAnimateLayoutChange(true);
        this.f45871r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f45871r.e.setText("");
        this.f45871r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f45870n = new s4.c0(1, false);
        this.f45872s = new v70(this, context);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.h = nm0Var;
        nm0Var.u1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f45871r);
        this.h.setAdapter(this.f45872s);
        this.h.setLayoutManager(this.f45870n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.nm0 nm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        nm0Var2.setVerticalScrollbarPosition(i10);
        k0Var.addView(this.h, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        k0Var.addView(this.f45871r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new i3(this, 17));
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        j2Var.f22740l = 180;
        j2Var.invalidateSelf();
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f45867b = j20Var;
        j20Var.f29484c.setImageDrawable(j2Var);
        this.f45867b.e(false, false);
        this.f45867b.setContentDescription(LocaleController.getString(R.string.Next));
        this.f45867b.setOnClickListener(new z50(this, 4));
        v70 v70Var = this.f45872s;
        if (v70Var != null && !this.f45874x) {
            int h = v70Var.h();
            org.telegram.ui.Components.fy0 fy0Var2 = this.f45871r;
            if (h != 2) {
                i11 = 4;
            }
            fy0Var2.setVisibility(i11);
        }
        k0Var.addView(this.d, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f45867b, org.telegram.ui.Components.j20.b());
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35562h1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.fy0 fy0Var;
        if (i10 == NotificationCenter.contactsImported) {
            b0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (fy0Var = this.f45871r) != null) {
            fy0Var.e(false, true);
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23504l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23522m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23542n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23310ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23450i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 4, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23486k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 262148, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23541n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45869f, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23350ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45869f, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23369di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        int i10 = k1Var.f47153a.f(8).d;
        this.I = i10;
        org.telegram.ui.Components.j20 j20Var = this.f45867b;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.H, i10));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.t4 t4Var;
        ContactsController.Contact contact;
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (x30Var.f34655y) {
            this.F = null;
            this.f45869f.a(x30Var);
            this.f45867b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.h.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.t4) && (contact = (t4Var = (org.telegram.ui.Cells.t4) childAt).getContact()) != null) {
                    boolean containsKey = this.f45875y.containsKey(contact.key);
                    org.telegram.ui.Components.aq aqVar = t4Var.e;
                    if (aqVar != null) {
                        aqVar.a(containsKey, true);
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
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsDidLoad);
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
        w70 w70Var = this.d;
        if (w70Var != null) {
            w70Var.setTranslationY(AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.j20 j20Var = this.f45867b;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.nm0 nm0Var = this.h;
            if (nm0Var != null) {
                nm0Var.A1();
            }
            if (this.f45869f != null) {
                for (int i10 = 0; i10 < this.f45869f.getChildCount(); i10++) {
                    View childAt = this.f45869f.getChildAt(i10);
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
