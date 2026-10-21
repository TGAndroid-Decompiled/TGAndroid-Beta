package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class r70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, ne.d, qh.d {
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
    public final int f41074a;
    public final ne.e f41075b;
    public org.telegram.ui.Components.h20 f41076c;
    public p70 d;
    public org.telegram.ui.ActionBar.v1 e;
    public q70 f41077f;
    public org.telegram.ui.Components.jm0 h;
    public s4.b0 f41078n;
    public org.telegram.ui.Components.tx0 f41079r;
    public n70 f41080s;
    public boolean v;
    public ArrayList f41081w;
    public int f41082x;
    public boolean f41083y;

    public r70() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f41074a = i10;
        this.f41075b = new ne.e(3, this, org.telegram.ui.Components.bs.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(r70 r70Var, View view, int i10) {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !r70Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(r70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                r70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) view).getContact()) != null) {
            org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) r70Var.F.get(contact.key);
            if (v30Var != null) {
                r70Var.f41077f.a(v30Var);
            } else {
                org.telegram.ui.Components.v30 v30Var2 = new org.telegram.ui.Components.v30(r70Var.getParentActivity(), null, contact, true, r70Var.resourceProvider);
                q70 q70Var = r70Var.f41077f;
                ArrayList arrayList = q70Var.f40496c;
                r70 r70Var2 = q70Var.h;
                r70Var2.G.add(v30Var2);
                r70Var2.F.put(v30Var2.getKey(), v30Var2);
                AnimatorSet animatorSet = q70Var.f40494a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    q70Var.f40494a.cancel();
                }
                q70Var.f40495b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                q70Var.f40494a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.p31(q70Var, 29));
                q70Var.f40494a.setInterpolator(org.telegram.ui.Components.bs.h);
                q70Var.f40494a.setDuration(320L);
                q70Var.d = v30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(q70Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(q70Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(q70Var.d, View.ALPHA, 0.0f, 1.0f));
                q70Var.addView(v30Var2);
                v30Var2.setOnClickListener(r70Var);
            }
            r70Var.f41076c.e(!r70Var.G.isEmpty(), true);
            if (!r70Var.E && !r70Var.f41083y) {
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

    public static void V(r70 r70Var) {
        ArrayList arrayList = r70Var.G;
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
            intent.putExtra("sms_body", ContactsController.getInstance(r70Var.currentAccount).getInviteText(i10));
            r70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r70Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f41082x);
            fVar.g(1, this.O);
            fVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.h20 h20Var = this.f41076c;
        if (h20Var != null) {
            h20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f41074a) + ((int) this.f41075b.e), 0, this.J);
        this.f41079r.setPadding(0, 0, 0, this.J);
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
        this.f41083y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 4));
        m0 m0Var = new m0(this, context, 9);
        this.fragmentView = m0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        q70 q70Var = new q70(this, context);
        this.f41077f = q70Var;
        this.e.addView(q70Var, w7.z5.c(108.0f, -1));
        this.d = new p70(this, context, this.e);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(6);
        b10Var.f24774w = false;
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, b10Var, 0, null);
        this.f41079r = tx0Var;
        tx0Var.addView(b10Var, 0);
        this.f41079r.setAnimateLayoutChange(true);
        this.f41079r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f41079r.e.setText("");
        this.f41079r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.h6.f20932a7;
        m0Var.setBackgroundColor(getThemedColor(i12));
        m0Var.addView(this.f41079r);
        this.f41078n = new s4.b0(1, false);
        this.f41080s = new n70(this, context);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.h = jm0Var;
        jm0Var.setSections(true);
        this.h.setEmptyView(this.f41079r);
        this.h.setAdapter(this.f41080s);
        this.h.setLayoutManager(this.f41078n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.jm0 jm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        jm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        m0Var.addView(this.h, w7.z5.d(-1, -1.0f, 119, 0.0f, -this.f41074a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 15));
        this.h.setOnScrollListener(new k3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f20869l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f41076c = h20Var;
        h20Var.f26717c.setImageDrawable(g2Var);
        this.f41076c.e(false, false);
        this.f41076c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f41076c.setOnClickListener(new s50(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.jm0 jm0Var3 = this.h;
        Objects.requireNonNull(jm0Var3);
        this.N = new bh.l(jm0Var3, m0Var, new ks(jm0Var3, 0));
        this.h.C0(new k70(this, 0));
        n70 n70Var = this.f41080s;
        if (n70Var != null && !this.E) {
            int h = n70Var.h();
            org.telegram.ui.Components.tx0 tx0Var2 = this.f41079r;
            if (h != 2) {
                i10 = 4;
            }
            tx0Var2.setVisibility(i10);
        }
        m0Var.addView(this.f41076c, org.telegram.ui.Components.h20.b());
        m0Var.addView(this.actionBar);
        m0Var.addView(this.d, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f33169g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f41081w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(29));
        org.telegram.ui.Components.tx0 tx0Var = this.f41079r;
        if (tx0Var != null) {
            tx0Var.e(false, true);
        }
        n70 n70Var = this.f41080s;
        if (n70Var != null) {
            n70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tx0 tx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (tx0Var = this.f41079r) != null) {
            tx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21269s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21135l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21154m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21174n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i10 = org.telegram.ui.ActionBar.h6.f20943ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21080i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21118k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21173n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21378y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.o4.class}, null, org.telegram.ui.ActionBar.h6.f21241r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i11 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41077f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20983ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41077f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20963bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41077f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21000di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41077f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.K = k1Var.f44835a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) view;
        if (v30Var.f31136y) {
            this.H = null;
            this.f41077f.a(v30Var);
            this.f41076c.e(!this.G.isEmpty(), true);
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
    public final void r(int i10, float f7, float f10, ne.e eVar) {
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
    public final void L() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
