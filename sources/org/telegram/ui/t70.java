package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Property;
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

public final class t70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, ud.b, yg.d {
    public boolean A;
    public final HashMap B;
    public final ArrayList C;
    public org.telegram.ui.Components.a30 D;
    public int E;
    public int F;
    public int G;
    public final jg.e H;
    public final og.d I;
    public jg.k J;
    public final ArrayList K;
    public final RectF L;

    public final int f42794a;

    public final ud.c f42795b;

    public org.telegram.ui.Components.m10 f42796c;
    public r70 d;

    public org.telegram.ui.ActionBar.v1 f42797e;

    public s70 f42798f;
    public org.telegram.ui.Components.zk0 h;

    public f2.k0 f42799n;

    public org.telegram.ui.Components.iw0 f42800r;

    public p70 f42801s;
    public boolean v;

    public ArrayList f42802w;

    public int f42803x;

    public boolean f42804y;

    public t70() {
        super(null);
        int i10 = Build.VERSION.SDK_INT;
        this.f42794a = i10 >= 31 ? 48 : 0;
        this.f42795b = new ud.c(3, this, org.telegram.ui.Components.er.h, 350L, AndroidUtilities.dp(37.0f));
        this.B = new HashMap();
        this.C = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        RectF rectF = new RectF();
        this.L = rectF;
        arrayList.add(rectF);
        if (i10 >= 31) {
            this.H = new jg.e(false);
            this.I = new og.d(null);
        } else {
            this.H = null;
            this.I = null;
        }
    }

    public static void U(t70 t70Var, View view, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        ContactsController.Contact contact;
        if (i10 == 0 && !t70Var.A) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(t70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                t70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m4) && (contact = (m4Var = (org.telegram.ui.Cells.m4) view).getContact()) != null) {
            org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) t70Var.B.get(contact.key);
            int i11 = 1;
            if (a30Var != null) {
                t70Var.f42798f.a(a30Var);
            } else {
                org.telegram.ui.Components.a30 a30Var2 = new org.telegram.ui.Components.a30(t70Var.getParentActivity(), null, contact, true, t70Var.resourceProvider);
                s70 s70Var = t70Var.f42798f;
                ArrayList arrayList = s70Var.f42540c;
                t70 t70Var2 = s70Var.h;
                t70Var2.C.add(a30Var2);
                t70Var2.B.put(a30Var2.getKey(), a30Var2);
                AnimatorSet animatorSet = s70Var.f42538a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    s70Var.f42538a.cancel();
                }
                s70Var.f42539b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                s70Var.f42538a = animatorSet2;
                animatorSet2.addListener(new f50(s70Var, i11));
                s70Var.f42538a.setInterpolator(org.telegram.ui.Components.er.h);
                s70Var.f42538a.setDuration(320L);
                s70Var.d = a30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s70Var.d, (Property<org.telegram.ui.Components.a30, Float>) View.ALPHA, 0.0f, 1.0f));
                s70Var.addView(a30Var2);
                a30Var2.setOnClickListener(t70Var);
            }
            t70Var.f42796c.e(!t70Var.C.isEmpty(), true);
            if (t70Var.A || t70Var.f42804y) {
                return;
            }
            boolean z10 = a30Var == null;
            org.telegram.ui.Components.bp bpVar = m4Var.f24682e;
            if (bpVar != null) {
                bpVar.a(z10, true);
            }
        }
    }

    public static void V(t70 t70Var) {
        ArrayList arrayList = t70Var.C;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.a30) arrayList.get(i11)).getContact();
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        t70Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.H) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        this.L.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + AndroidUtilities.dp(48.0f) + this.f42803x);
        eVar.g(1, this.K);
        eVar.e(this.J, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void Z() {
        org.telegram.ui.Components.m10 m10Var = this.f42796c;
        if (m10Var != null) {
            m10Var.setTranslationY(-Math.max(this.F, this.G));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f42794a) + ((int) this.f42795b.f48502e), 0, this.F);
        this.f42800r.setPadding(0, 0, 0, this.F);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.m4 m4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && (contact = (m4Var = (org.telegram.ui.Cells.m4) childAt).getContact()) != null) {
                boolean zContainsKey = this.B.containsKey(contact.key);
                org.telegram.ui.Components.bp bpVar = m4Var.f24682e;
                if (bpVar != null) {
                    bpVar.a(zContainsKey, true);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k kVarCreateActionBar = super.createActionBar(context);
        kVarCreateActionBar.setAddToContainer(false);
        return kVarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        this.A = false;
        this.f42804y = false;
        this.C.clear();
        this.B.clear();
        this.D = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 27));
        n0 n0Var = new n0(this, context, 9);
        this.fragmentView = n0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.f42797e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        s70 s70Var = new s70(this, context);
        this.f42798f = s70Var;
        this.f42797e.addView(s70Var, h7.z5.c(108.0f, -1));
        this.d = new r70(this, context, this.f42797e);
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        h00Var.setViewType(6);
        h00Var.f28887w = false;
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, h00Var, 0, null);
        this.f42800r = iw0Var;
        iw0Var.addView(h00Var, 0);
        this.f42800r.setAnimateLayoutChange(true);
        this.f42800r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f42800r.f29506e.setText("");
        this.f42800r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        n0Var.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.f42800r);
        this.f42799n = new f2.k0(1, false);
        this.f42801s = new p70(this, context);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.h = zk0Var;
        zk0Var.setSections(true);
        this.h.setEmptyView(this.f42800r);
        this.h.setAdapter(this.f42801s);
        this.h.setLayoutManager(this.f42799n);
        this.h.setVerticalScrollBarEnabled(true);
        this.h.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.h.setClipToPadding(false);
        n0Var.addView(this.h, h7.z5.d(-1, -1.0f, 119, 0.0f, -this.f42794a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new m3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f22974l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.f42796c = m10Var;
        m10Var.f30519c.setImageDrawable(g2Var);
        this.f42796c.e(false, false);
        this.f42796c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f42796c.setOnClickListener(new u50(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.zk0 zk0Var2 = this.h;
        Objects.requireNonNull(zk0Var2);
        this.J = new jg.k(zk0Var2, n0Var, new os(zk0Var2, 0));
        this.h.C0(new m70(this, 0));
        p70 p70Var = this.f42801s;
        if (p70Var != null && !this.A) {
            this.f42800r.setVisibility(p70Var.h() != 2 ? 4 : 0);
        }
        n0Var.addView(this.f42796c, org.telegram.ui.Components.m10.b());
        n0Var.addView(this.actionBar);
        n0Var.addView(this.d, h7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35504c1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f42802w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(6));
        org.telegram.ui.Components.iw0 iw0Var = this.f42800r;
        if (iw0Var != null) {
            iw0Var.e(false, true);
        }
        p70 p70Var = this.f42801s;
        if (p70Var != null) {
            p70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.iw0 iw0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else {
            if (i10 != NotificationCenter.contactsDidLoad || (iw0Var = this.f42800r) == null) {
                return;
            }
            iw0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23216m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23235n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 16, new Class[]{org.telegram.ui.Cells.c4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.c4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i10 = org.telegram.ui.ActionBar.g6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.c4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23145i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.m4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        int i11 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42798f, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42798f, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42798f, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42798f, 0, new Class[]{org.telegram.ui.Components.a30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.G = m1Var.f46619a.f(8).d;
        Z();
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
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
        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
        if (a30Var.f26618y) {
            this.D = null;
            this.f42798f.a(a30Var);
            this.f42796c.e(!this.C.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.a30 a30Var2 = this.D;
        if (a30Var2 != null) {
            a30Var2.a();
        }
        this.D = a30Var;
        a30Var.b();
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
        this.F = i13;
        a0();
        Z();
    }

    @Override
    public final void L() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
