package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
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
public final class x70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, ne.d, qh.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.v30 H;
    public int I;
    public int J;
    public int K;
    public final bh.f L;
    public final gh.d M;
    public bh.l N;
    public final ArrayList O;
    public final RectF P;
    public final int f43521a;
    public final ne.e f43522b;
    public org.telegram.ui.Components.h20 f43523c;
    public u70 d;
    public org.telegram.ui.ActionBar.u1 e;
    public w70 f43524f;
    public org.telegram.ui.Components.mm0 h;
    public s4.b0 f43525n;
    public org.telegram.ui.Components.wx0 f43526r;
    public s70 f43527s;
    public boolean v;
    public ArrayList f43528w;
    public int f43529x;
    public boolean f43530y;

    public x70() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f43521a = i10;
        this.f43522b = new ne.e(3, this, org.telegram.ui.Components.bs.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new bh.f(false);
            this.M = new gh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void U(x70 x70Var, View view, int i10) {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !x70Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(x70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                x70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) view).getContact()) != null) {
            org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) x70Var.F.get(contact.key);
            if (v30Var != null) {
                x70Var.f43524f.a(v30Var);
            } else {
                org.telegram.ui.Components.v30 v30Var2 = new org.telegram.ui.Components.v30(x70Var.getParentActivity(), null, contact, true, x70Var.resourceProvider);
                w70 w70Var = x70Var.f43524f;
                ArrayList arrayList = w70Var.f42952c;
                x70 x70Var2 = w70Var.h;
                x70Var2.G.add(v30Var2);
                x70Var2.F.put(v30Var2.getKey(), v30Var2);
                AnimatorSet animatorSet = w70Var.f42950a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    w70Var.f42950a.cancel();
                }
                w70Var.f42951b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                w70Var.f42950a = animatorSet2;
                animatorSet2.addListener(new v70(w70Var, 0));
                w70Var.f42950a.setInterpolator(org.telegram.ui.Components.bs.h);
                w70Var.f42950a.setDuration(320L);
                w70Var.d = v30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.ALPHA, 0.0f, 1.0f));
                w70Var.addView(v30Var2);
                v30Var2.setOnClickListener(x70Var);
            }
            x70Var.f43523c.e(!x70Var.G.isEmpty(), true);
            if (!x70Var.E && !x70Var.f43530y) {
                if (v30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.xp xpVar = o4Var.e;
                if (xpVar != null) {
                    xpVar.a(z10, true);
                }
            }
        }
    }

    public static void V(x70 x70Var) {
        ArrayList arrayList = x70Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.v30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(x70Var.currentAccount).getInviteText(i10));
            x70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        x70Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f43529x);
            fVar.g(1, this.O);
            fVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.h20 h20Var = this.f43523c;
        if (h20Var != null) {
            h20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f43521a) + ((int) this.f43522b.e), 0, this.J);
        this.f43526r.setPadding(0, 0, 0, this.J);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21156bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21571y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21136ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) childAt).getContact()) != null) {
                boolean containsKey = this.F.containsKey(contact.key);
                org.telegram.ui.Components.xp xpVar = o4Var.e;
                if (xpVar != null) {
                    xpVar.a(containsKey, true);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10 = 0;
        this.E = false;
        this.f43530y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 4));
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 3);
        this.e = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        w70 w70Var = new w70(this, context);
        this.f43524f = w70Var;
        this.e.addView(w70Var, w7.z5.c(108.0f, -1));
        this.d = new u70(this, context, this.e);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(6);
        b10Var.f24923w = false;
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, b10Var, 0, null);
        this.f43526r = wx0Var;
        wx0Var.addView(b10Var, 0);
        this.f43526r.setAnimateLayoutChange(true);
        this.f43526r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f43526r.e.setText("");
        this.f43526r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.k6.f21125a7;
        org.telegram.ui.ActionBar.r6.i(i12, l0Var, getResourceProvider());
        l0Var.addView(this.f43526r);
        this.f43525n = new s4.b0(1, false);
        this.f43527s = new s70(this, context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.setSections(true);
        this.h.setEmptyView(this.f43526r);
        this.h.setAdapter(this.f43527s);
        this.h.setLayoutManager(this.f43525n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        l0Var.addView(this.h, w7.z5.d(-1, -1.0f, 119, 0.0f, -this.f43521a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new j3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.f20939l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f43523c = h20Var;
        h20Var.f26768c.setImageDrawable(h2Var);
        this.f43523c.e(false, false);
        this.f43523c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f43523c.setOnClickListener(new w50(this, 4));
        org.telegram.ui.ActionBar.r6.i(i12, this.actionBar, getResourceProvider());
        org.telegram.ui.Components.mm0 mm0Var3 = this.h;
        Objects.requireNonNull(mm0Var3);
        this.N = new bh.l(mm0Var3, l0Var, new ns(mm0Var3, 0));
        this.h.C0(new p70(this, 0));
        s70 s70Var = this.f43527s;
        if (s70Var != null && !this.E) {
            int h = s70Var.h();
            org.telegram.ui.Components.wx0 wx0Var2 = this.f43526r;
            if (h != 2) {
                i10 = 4;
            }
            wx0Var2.setVisibility(i10);
        }
        l0Var.addView(this.f43523c, org.telegram.ui.Components.h20.b());
        l0Var.addView(this.actionBar);
        l0Var.addView(this.d, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity != null) {
            launchActivity.f33474i1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f43528w = arrayList;
        Collections.sort(arrayList, new o70(0));
        org.telegram.ui.Components.wx0 wx0Var = this.f43526r;
        if (wx0Var != null) {
            wx0Var.e(false, true);
        }
        s70 s70Var = this.f43527s;
        if (s70Var != null) {
            s70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.wx0 wx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (wx0Var = this.f43526r) != null) {
            wx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21125a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21328l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21347m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21367n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21136ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21273i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21366n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43524f, 0, new Class[]{org.telegram.ui.Components.v30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21176ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43524f, 0, new Class[]{org.telegram.ui.Components.v30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21193di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.K = k1Var.f45251a.f(8).d;
        Z();
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) view;
        if (v30Var.f31335y) {
            this.H = null;
            this.f43524f.a(v30Var);
            this.f43523c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.v30 v30Var2 = this.H;
        if (v30Var2 != null) {
            v30Var2.a();
        }
        this.H = v30Var;
        v30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        d0();
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
        this.J = i13;
        a0();
        Z();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.mm0 mm0Var = this.h;
            if (mm0Var != null) {
                mm0Var.A1();
            }
            if (this.f43524f != null) {
                for (int i10 = 0; i10 < this.f43524f.getChildCount(); i10++) {
                    View childAt = this.f43524f.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.v30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void L() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
