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
public final class t70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, ne.d, qh.d {
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
    public final int f41602a;
    public final ne.e f41603b;
    public org.telegram.ui.Components.h20 f41604c;
    public r70 d;
    public org.telegram.ui.ActionBar.v1 e;
    public s70 f41605f;
    public org.telegram.ui.Components.im0 h;
    public s4.b0 f41606n;
    public org.telegram.ui.Components.rx0 f41607r;
    public p70 f41608s;
    public boolean v;
    public ArrayList f41609w;
    public int f41610x;
    public boolean f41611y;

    public t70() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f41602a = i10;
        this.f41603b = new ne.e(3, this, org.telegram.ui.Components.bs.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(t70 t70Var, View view, int i10) {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !t70Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(t70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                t70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) view).getContact()) != null) {
            org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) t70Var.F.get(contact.key);
            if (v30Var != null) {
                t70Var.f41605f.a(v30Var);
            } else {
                org.telegram.ui.Components.v30 v30Var2 = new org.telegram.ui.Components.v30(t70Var.getParentActivity(), null, contact, true, t70Var.resourceProvider);
                s70 s70Var = t70Var.f41605f;
                ArrayList arrayList = s70Var.f41031c;
                t70 t70Var2 = s70Var.h;
                t70Var2.G.add(v30Var2);
                t70Var2.F.put(v30Var2.getKey(), v30Var2);
                AnimatorSet animatorSet = s70Var.f41029a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    s70Var.f41029a.cancel();
                }
                s70Var.f41030b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                s70Var.f41029a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.n31(s70Var, 29));
                s70Var.f41029a.setInterpolator(org.telegram.ui.Components.bs.h);
                s70Var.f41029a.setDuration(320L);
                s70Var.d = v30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, View.ALPHA, 0.0f, 1.0f));
                s70Var.addView(v30Var2);
                v30Var2.setOnClickListener(t70Var);
            }
            t70Var.f41604c.e(!t70Var.G.isEmpty(), true);
            if (!t70Var.E && !t70Var.f41611y) {
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

    public static void V(t70 t70Var) {
        ArrayList arrayList = t70Var.G;
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
            intent.putExtra("sms_body", ContactsController.getInstance(t70Var.currentAccount).getInviteText(i10));
            t70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        t70Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f41610x);
            fVar.g(1, this.O);
            fVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.h20 h20Var = this.f41604c;
        if (h20Var != null) {
            h20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f41602a) + ((int) this.f41603b.e), 0, this.J);
        this.f41607r.setPadding(0, 0, 0, this.J);
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
        this.f41611y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 4));
        m0 m0Var = new m0(this, context, 9);
        this.fragmentView = m0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        s70 s70Var = new s70(this, context);
        this.f41605f = s70Var;
        this.e.addView(s70Var, w7.z5.d(108.0f, -1));
        this.d = new r70(this, context, this.e);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(6);
        b10Var.f24767w = false;
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, b10Var, 0, null);
        this.f41607r = rx0Var;
        rx0Var.addView(b10Var, 0);
        this.f41607r.setAnimateLayoutChange(true);
        this.f41607r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f41607r.e.setText("");
        this.f41607r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.h6.f20928a7;
        m0Var.setBackgroundColor(getThemedColor(i12));
        m0Var.addView(this.f41607r);
        this.f41606n = new s4.b0(1, false);
        this.f41608s = new p70(this, context);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.h = im0Var;
        im0Var.setSections(true);
        this.h.setEmptyView(this.f41607r);
        this.h.setAdapter(this.f41608s);
        this.h.setLayoutManager(this.f41606n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.im0 im0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        im0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        m0Var.addView(this.h, w7.z5.a(-1.0f, 0.0f, -this.f41602a, 0.0f, 0.0f, -1, 119));
        this.h.setOnItemClickListener(new i(this, 15));
        this.h.setOnScrollListener(new k3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f20865l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f41604c = h20Var;
        h20Var.f26736c.setImageDrawable(g2Var);
        this.f41604c.e(false, false);
        this.f41604c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f41604c.setOnClickListener(new y50(this, 3));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.im0 im0Var3 = this.h;
        Objects.requireNonNull(im0Var3);
        this.N = new bh.l(im0Var3, m0Var, new ms(im0Var3, 0));
        this.h.C0(new m70(this, 0));
        p70 p70Var = this.f41608s;
        if (p70Var != null && !this.E) {
            int h = p70Var.h();
            org.telegram.ui.Components.rx0 rx0Var2 = this.f41607r;
            if (h != 2) {
                i10 = 4;
            }
            rx0Var2.setVisibility(i10);
        }
        m0Var.addView(this.f41604c, org.telegram.ui.Components.h20.b());
        m0Var.addView(this.actionBar);
        m0Var.addView(this.d, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f33156g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f41609w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(29));
        org.telegram.ui.Components.rx0 rx0Var = this.f41607r;
        if (rx0Var != null) {
            rx0Var.e(false, true);
        }
        p70 p70Var = this.f41608s;
        if (p70Var != null) {
            p70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.rx0 rx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (rx0Var = this.f41607r) != null) {
            rx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21131l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21150m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21170n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i10 = org.telegram.ui.ActionBar.h6.f20939ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21076i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21114k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21169n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21374y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.o4.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i11 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41605f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20979ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41605f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20959bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41605f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20996di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41605f, 0, new Class[]{org.telegram.ui.Components.v30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.K = k1Var.f44853a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) view;
        if (v30Var.f31161y) {
            this.H = null;
            this.f41605f.a(v30Var);
            this.f41604c.e(!this.G.isEmpty(), true);
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
    public final void u(int i10, float f7, float f10, ne.e eVar) {
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
    public final void t() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
