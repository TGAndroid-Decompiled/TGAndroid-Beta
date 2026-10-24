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
    public org.telegram.ui.Components.t30 H;
    public int I;
    public int J;
    public int K;
    public final bh.f L;
    public final gh.d M;
    public bh.l N;
    public final ArrayList O;
    public final RectF P;
    public final int f43487a;
    public final ne.e f43488b;
    public org.telegram.ui.Components.f20 f43489c;
    public u70 d;
    public org.telegram.ui.ActionBar.u1 e;
    public w70 f43490f;
    public org.telegram.ui.Components.lm0 h;
    public s4.b0 f43491n;
    public org.telegram.ui.Components.vx0 f43492r;
    public s70 f43493s;
    public boolean v;
    public ArrayList f43494w;
    public int f43495x;
    public boolean f43496y;

    public x70() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f43487a = i10;
        this.f43488b = new ne.e(3, this, org.telegram.ui.Components.zr.h, 350L, AndroidUtilities.dp(37.0f));
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
            org.telegram.ui.Components.t30 t30Var = (org.telegram.ui.Components.t30) x70Var.F.get(contact.key);
            if (t30Var != null) {
                x70Var.f43490f.a(t30Var);
            } else {
                org.telegram.ui.Components.t30 t30Var2 = new org.telegram.ui.Components.t30(x70Var.getParentActivity(), null, contact, true, x70Var.resourceProvider);
                w70 w70Var = x70Var.f43490f;
                ArrayList arrayList = w70Var.f42933c;
                x70 x70Var2 = w70Var.h;
                x70Var2.G.add(t30Var2);
                x70Var2.F.put(t30Var2.getKey(), t30Var2);
                AnimatorSet animatorSet = w70Var.f42931a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    w70Var.f42931a.cancel();
                }
                w70Var.f42932b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                w70Var.f42931a = animatorSet2;
                animatorSet2.addListener(new v70(w70Var, 0));
                w70Var.f42931a.setInterpolator(org.telegram.ui.Components.zr.h);
                w70Var.f42931a.setDuration(320L);
                w70Var.d = t30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(w70Var.d, View.ALPHA, 0.0f, 1.0f));
                w70Var.addView(t30Var2);
                t30Var2.setOnClickListener(x70Var);
            }
            x70Var.f43489c.e(!x70Var.G.isEmpty(), true);
            if (!x70Var.E && !x70Var.f43496y) {
                if (t30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.vp vpVar = o4Var.e;
                if (vpVar != null) {
                    vpVar.a(z10, true);
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
                ContactsController.Contact contact = ((org.telegram.ui.Components.t30) arrayList.get(i11)).getContact();
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
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f43495x);
            fVar.g(1, this.O);
            fVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.f20 f20Var = this.f43489c;
        if (f20Var != null) {
            f20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f43487a) + ((int) this.f43488b.e), 0, this.J);
        this.f43492r.setPadding(0, 0, 0, this.J);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21157bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21137ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
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
                org.telegram.ui.Components.vp vpVar = o4Var.e;
                if (vpVar != null) {
                    vpVar.a(containsKey, true);
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
        this.f43496y = false;
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
        this.f43490f = w70Var;
        this.e.addView(w70Var, w7.z5.c(108.0f, -1));
        this.d = new u70(this, context, this.e);
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        z00Var.setViewType(6);
        z00Var.f33104w = false;
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, z00Var, 0, null);
        this.f43492r = vx0Var;
        vx0Var.addView(z00Var, 0);
        this.f43492r.setAnimateLayoutChange(true);
        this.f43492r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f43492r.e.setText("");
        this.f43492r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i12, l0Var, getResourceProvider());
        l0Var.addView(this.f43492r);
        this.f43491n = new s4.b0(1, false);
        this.f43493s = new s70(this, context);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.h = lm0Var;
        lm0Var.setSections(true);
        this.h.setEmptyView(this.f43492r);
        this.h.setAdapter(this.f43493s);
        this.h.setLayoutManager(this.f43491n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.lm0 lm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        lm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        l0Var.addView(this.h, w7.z5.d(-1, -1.0f, 119, 0.0f, -this.f43487a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new j3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.f20940l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(context, this.resourceProvider, false);
        this.f43489c = f20Var;
        f20Var.f26170c.setImageDrawable(h2Var);
        this.f43489c.e(false, false);
        this.f43489c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f43489c.setOnClickListener(new w50(this, 4));
        org.telegram.ui.ActionBar.r6.i(i12, this.actionBar, getResourceProvider());
        org.telegram.ui.Components.lm0 lm0Var3 = this.h;
        Objects.requireNonNull(lm0Var3);
        this.N = new bh.l(lm0Var3, l0Var, new ns(lm0Var3, 0));
        this.h.C0(new p70(this, 0));
        s70 s70Var = this.f43493s;
        if (s70Var != null && !this.E) {
            int h = s70Var.h();
            org.telegram.ui.Components.vx0 vx0Var2 = this.f43492r;
            if (h != 2) {
                i10 = 4;
            }
            vx0Var2.setVisibility(i10);
        }
        l0Var.addView(this.f43489c, org.telegram.ui.Components.f20.b());
        l0Var.addView(this.actionBar);
        l0Var.addView(this.d, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33474h1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f43494w = arrayList;
        Collections.sort(arrayList, new o70(0));
        org.telegram.ui.Components.vx0 vx0Var = this.f43492r;
        if (vx0Var != null) {
            vx0Var.e(false, true);
        }
        s70 s70Var = this.f43493s;
        if (s70Var != null) {
            s70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.vx0 vx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (vx0Var = this.f43492r) != null) {
            vx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21126a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21329l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21348m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21368n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21137ai));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21274i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21312k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43490f, 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21177ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43490f, 0, new Class[]{org.telegram.ui.Components.t30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21194di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.K = k1Var.f45250a.f(8).d;
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
        org.telegram.ui.Components.t30 t30Var = (org.telegram.ui.Components.t30) view;
        if (t30Var.f30711y) {
            this.H = null;
            this.f43490f.a(t30Var);
            this.f43489c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.t30 t30Var2 = this.H;
        if (t30Var2 != null) {
            t30Var2.a();
        }
        this.H = t30Var;
        t30Var.b();
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
            org.telegram.ui.Components.lm0 lm0Var = this.h;
            if (lm0Var != null) {
                lm0Var.A1();
            }
            if (this.f43490f != null) {
                for (int i10 = 0; i10 < this.f43490f.getChildCount(); i10++) {
                    View childAt = this.f43490f.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.t30) {
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
