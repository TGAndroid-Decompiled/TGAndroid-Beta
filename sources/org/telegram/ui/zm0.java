package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final org.telegram.messenger.we J;
    public org.telegram.ui.Components.qj0 K;
    public l4 L;
    public wm0 M;
    public org.telegram.ui.Components.cv0 N;
    public fi.s2 O;
    public org.telegram.ui.ActionBar.r0 P;
    public org.telegram.ui.ActionBar.z0 Q;
    public int R;
    public boolean S;
    public final int T;
    public final cn U;
    public org.telegram.ui.Components.uj0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int f52598a;
    public k0 f52599a0;
    public final HashMap f52600b;
    public n00 f52601b0;
    public final ArrayList f52602c;
    public View f52603c0;
    public CharSequence d;
    public org.telegram.ui.Components.lt f52604d0;
    public boolean f52605e;
    public ImageView f52606e0;
    public final ArrayList f52607f;
    public vm0 f52608f0;
    public int f52609g0;
    public final HashMap h;
    public final TextPaint f52610h0;
    public final RectF f52611i0;
    public final Paint f52612j0;
    public AnimatorSet f52613k0;
    public boolean f52614l0;
    public org.telegram.ui.ActionBar.g1 m0;
    public final ArrayList f52615n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f52616n0;
    public org.telegram.ui.ActionBar.z0[] f52617o0;
    public String f52618p0;
    public boolean f52619q0;
    public boolean f52620r;
    public final boolean f52621r0;
    public boolean f52622s;
    public ym0 f52623s0;
    public an0 f52624t0;
    public final int f52625u0;
    public final int f52626v0;
    public String f52627w;
    public final int f52628w0;
    public String f52629x;
    public final tm0 f52630x0;
    public int f52631y;

    public zm0(int i7, org.telegram.messenger.we weVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z9, cn cnVar, boolean z10) {
        super(null);
        this.f52607f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f52615n = new ArrayList();
        this.f52622s = true;
        this.I = true;
        this.R = 100;
        this.f52609g0 = 3;
        this.f52610h0 = new TextPaint(1);
        this.f52611i0 = new RectF();
        this.f52612j0 = new Paint(1);
        this.f52619q0 = true;
        this.f52630x0 = new tm0(this);
        this.J = weVar;
        this.f52600b = hashMap;
        this.f52602c = arrayList;
        this.f52598a = i7;
        this.T = i10;
        this.U = cnVar;
        this.E = z9;
        this.f52621r0 = z10;
        if (weVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f52615n.add(string);
            }
        }
        if (z10) {
            this.f52625u0 = org.telegram.ui.ActionBar.l6.f27966ih;
            this.f52626v0 = org.telegram.ui.ActionBar.l6.Vg;
            this.f52628w0 = org.telegram.ui.ActionBar.l6.Wg;
            return;
        }
        this.f52625u0 = org.telegram.ui.ActionBar.l6.f27938h5;
        this.f52626v0 = org.telegram.ui.ActionBar.l6.f27973j5;
        this.f52628w0 = org.telegram.ui.ActionBar.l6.I5;
    }

    public static void Z(zm0 zm0Var, TLObject tLObject, boolean z9) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.qp.s1(zm0Var.currentAccount).Y3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.qp.s1(zm0Var.currentAccount).S3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.yr.a0(zm0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zm0Var.G;
        zm0Var.G = null;
        zm0Var.i0(str, "", z9, false);
    }

    public static org.telegram.ui.Cells.q5 a0(zm0 zm0Var, int i7) {
        int childCount = zm0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zm0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.we weVar = zm0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= zm0Var.f52607f.size()) : !(intValue < 0 || intValue >= weVar.f26300e.size())) {
                    if (intValue == i7) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(zm0 zm0Var) {
        return zm0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27869da));
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        this.Y = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.f52625u0;
        org.telegram.ui.ActionBar.s6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f52626v0;
        org.telegram.ui.ActionBar.s6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, this.f52628w0, null);
        this.actionBar.setBackButtonImage(2131231240);
        int i11 = this.f52598a;
        org.telegram.messenger.we weVar = this.J;
        if (weVar != null) {
            this.actionBar.setTitle(weVar.f26299c);
        } else if (i11 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131745761, null));
        } else if (i11 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131745764, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new wx(this, 24));
        if (this.f52614l0) {
            org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131231244);
            a10.setSubMenuDelegate(new um0(this));
            this.Q = a10.e(1, 2131232208, org.telegram.messenger.id.M0(2131745345, null));
            a10.e(2, 2131232265, org.telegram.messenger.id.M0(2131747796, null));
        }
        if (weVar == null) {
            org.telegram.ui.ActionBar.r0 a11 = this.actionBar.r().a(0, 2131232486);
            a11.N();
            a11.H = new fi.u2(this);
            this.P = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.s6.U(searchField, i10, null);
            org.telegram.ui.ActionBar.s6.v(searchField, i10, null);
            org.telegram.ui.ActionBar.s6.D(searchField, org.telegram.ui.ActionBar.l6.Je, null);
        }
        if (weVar == null) {
            if (i11 == 0) {
                this.P.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
            } else if (i11 == 1) {
                this.P.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
            }
        }
        vm0 vm0Var = new vm0(this, context);
        this.f52608f0 = vm0Var;
        org.telegram.ui.ActionBar.s6.h(i7, vm0Var, null);
        this.fragmentView = this.f52608f0;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.K = qj0Var;
        qj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.qj0 qj0Var2 = this.K;
        ?? sVar = new v4.s(4);
        this.M = sVar;
        qj0Var2.setLayoutManager(sVar);
        this.M.O = new ai.l(this, 13);
        this.f52608f0.addView(this.K, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.qj0 qj0Var3 = this.K;
        l4 l4Var = new l4(14, this, context);
        this.L = l4Var;
        qj0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.s6.H(this.K, i7, null);
        this.K.setOnItemClickListener(new h(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new sm0(this, 2));
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(new um0(this));
        this.V = uj0Var;
        if (this.H != 1) {
            this.K.E.add(uj0Var);
        }
        fi.s2 s2Var = new fi.s2(1, context, getResourceProvider());
        this.O = s2Var;
        s2Var.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.O, 1, getResourceProvider());
        this.N = cv0Var;
        cv0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(this.N.d, org.telegram.ui.ActionBar.l6.f28257y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (weVar != null) {
            this.N.d.setText(org.telegram.messenger.id.M0(2131748180, null));
        } else {
            this.N.d.setText(org.telegram.messenger.id.M0(2131748169, null));
        }
        this.N.e(false, false);
        this.f52608f0.addView(this.N, c8.ha.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new g3(this, 23));
        if (weVar == null) {
            o0();
        }
        if (this.f52619q0) {
            View view = new View(context);
            this.f52603c0 = view;
            view.setBackgroundResource(2131231238);
            this.f52603c0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f52608f0.addView(this.f52603c0, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.s6.h(i7, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f52608f0.addView(this.Z, c8.ha.e(-1, 48, 83));
            this.Z.setOnTouchListener(new ei.b(2));
            org.telegram.ui.Components.lt ltVar = this.f52604d0;
            if (ltVar != null) {
                ltVar.o();
            }
            this.f52604d0 = new org.telegram.ui.Components.lt(context, this.f52608f0, null, 1, false, null);
            this.f52604d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).H0())});
            this.f52604d0.setHint(org.telegram.messenger.id.M0(2131754454, null));
            this.f52604d0.s();
            org.telegram.ui.Components.zs editText = this.f52604d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.f52604d0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f52604d0.setText(charSequence);
            }
            this.f52604d0.getEditText().addTextChangedListener(new m0(this, 14));
            k0 k0Var = new k0(18, context, this);
            this.f52599a0 = k0Var;
            k0Var.setFocusable(true);
            this.f52599a0.setFocusableInTouchMode(true);
            this.f52599a0.setVisibility(4);
            this.f52599a0.setScaleX(0.2f);
            this.f52599a0.setScaleY(0.2f);
            this.f52599a0.setAlpha(0.0f);
            this.f52608f0.addView(this.f52599a0, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f52606e0 = new ImageView(context);
            this.f52606e0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.S5, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.T5, false)));
            this.f52606e0.setImageResource(2131230876);
            this.f52606e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.s6.s(this.f52606e0, org.telegram.ui.ActionBar.l6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f52606e0.setScaleType(ImageView.ScaleType.CENTER);
            this.f52606e0.setOutlineProvider(new bg.q0(20));
            this.f52599a0.addView(this.f52606e0, c8.ha.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f52606e0.setOnClickListener(new i40(this, 19));
            this.f52606e0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f52610h0;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            n00 n00Var = new n00(4, context, this);
            this.f52601b0 = n00Var;
            n00Var.setAlpha(0.0f);
            this.f52601b0.setScaleX(0.2f);
            this.f52601b0.setScaleY(0.2f);
            this.f52608f0.addView(this.f52601b0, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.f52604d0.setVisibility(8);
            }
        }
        if ((weVar != null || i11 == 0 || i11 == 1) && this.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f52605e = z9;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.qj0 qj0Var4 = this.K;
        qj0Var4.W1 = true;
        qj0Var4.X1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i7, Object obj) {
        Object obj2;
        boolean z9 = obj instanceof org.telegram.messenger.gf;
        if (z9) {
            obj2 = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        } else if (obj instanceof org.telegram.messenger.kf) {
            obj2 = ((org.telegram.messenger.kf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f52600b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f52602c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f52605e) {
                m0();
            }
            if (i7 >= 0) {
                if (z9) {
                    ((org.telegram.messenger.gf) obj).e();
                } else if (obj instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj).e();
                }
                this.f52630x0.X(i7);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25076t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f52615n.clear();
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        this.N.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z9;
        int i7 = 1;
        if (d0(-1, obj) == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(this.f52602c.contains(Integer.valueOf(((org.telegram.messenger.gf) this.J.f26300e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z9) {
            i7 = 2;
        }
        n0(i7);
        this.f52623s0.A();
    }

    public final void g0(EditText editText) {
        boolean z9;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f52607f.clear();
        this.h.clear();
        this.f52622s = true;
        if (this.f52598a == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        i0(obj, "", z9, true);
        this.f52627w = obj;
        if (obj.length() == 0) {
            this.f52627w = null;
            this.N.d.setText(org.telegram.messenger.id.M0(2131748169, null));
        } else {
            this.N.d.setText(org.telegram.messenger.id.a0("NoResultFoundFor", null, 2131748166, this.f52627w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52608f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52625u0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52625u0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52626v0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52626v0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52628w0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52626v0));
        org.telegram.ui.ActionBar.r0 r0Var = this.P;
        if (r0Var != null) {
            editTextBoldCursor = r0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52626v0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.f52625u0));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25566b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f52615n.size());
        int size = this.f52615n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(jg.g.j(i7, "recent"), (String) this.f52615n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z9, boolean z10) {
        String str3;
        String str4;
        String str5;
        if (this.f52620r) {
            this.f52620r = false;
            if (this.f52631y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f52631y, true);
                this.f52631y = 0;
            }
        }
        this.G = str;
        this.f52620r = true;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.currentAccount);
        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(this.currentAccount);
        if (z9) {
            str3 = s13.K3;
        } else {
            str3 = s13.L3;
        }
        TLObject f22 = s12.f2(str3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z10 && !this.F) {
                this.F = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(this.currentAccount);
                if (z9) {
                    str5 = s14.K3;
                } else {
                    str5 = s14.L3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new fi.d3(10, this, z9));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) f22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        cn cnVar = this.U;
        if (cnVar != null) {
            long a10 = cnVar.a();
            if (org.telegram.messenger.m5.C(a10)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a10);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i7 = this.D + 1;
        this.D = i7;
        this.f52631y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.cn(this, str, i7, z9, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f52631y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i7, boolean z9) {
        HashMap hashMap = this.f52600b;
        if (!hashMap.isEmpty() && this.f52623s0 != null && !this.S) {
            org.telegram.ui.Components.lt ltVar = this.f52604d0;
            if (ltVar != null && ltVar.f35841a.length() > 0) {
                Object obj = hashMap.get(this.f52602c.get(0));
                if (obj instanceof org.telegram.messenger.gf) {
                    ((org.telegram.messenger.gf) obj).f26844a = this.f52604d0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj).I = this.f52604d0.getText().toString();
                }
            }
            this.S = true;
            this.f52623s0.v0(i7, false, z9);
            if (this.T != 2) {
                ym0 ym0Var = this.f52623s0;
                if (ym0Var == null || ym0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i7, boolean z9) {
        this.H = i7;
        this.I = z9;
        if (i7 > 0 && this.f52598a == 1) {
            this.H = 1;
        }
    }

    public final boolean l0(boolean z9, boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        float f14;
        float f15;
        float f16;
        float f17;
        float L2;
        if (this.f52604d0 != null) {
            if (this.Z.getTag() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z9 != z11) {
                AnimatorSet animatorSet = this.f52613k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.Z;
                if (z9) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f52604d0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.f52604d0.getEditText());
                }
                this.f52604d0.k(true);
                if (z9) {
                    this.Z.setVisibility(0);
                    this.f52599a0.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z10) {
                    this.f52613k0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    k0 k0Var = this.f52599a0;
                    Property property = View.SCALE_X;
                    if (z9) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f14));
                    k0 k0Var2 = this.f52599a0;
                    Property property2 = View.SCALE_Y;
                    if (z9) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, f15));
                    k0 k0Var3 = this.f52599a0;
                    Property property3 = View.ALPHA;
                    if (z9) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var3, property3, f16));
                    n00 n00Var = this.f52601b0;
                    if (z9) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n00Var, property, f17));
                    n00 n00Var2 = this.f52601b0;
                    if (z9) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n00Var2, property2, f19));
                    n00 n00Var3 = this.f52601b0;
                    if (!z9) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n00Var3, property3, f20));
                    FrameLayout frameLayout2 = this.Z;
                    Property property4 = View.TRANSLATION_Y;
                    if (z9) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f52603c0;
                    if (!z9) {
                        f18 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f52613k0.playTogether(arrayList);
                    this.f52613k0.setInterpolator(new DecelerateInterpolator());
                    this.f52613k0.setDuration(180L);
                    this.f52613k0.addListener(new b50(3, this, z9));
                    this.f52613k0.start();
                    return true;
                }
                k0 k0Var4 = this.f52599a0;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                k0Var4.setScaleX(f10);
                k0 k0Var5 = this.f52599a0;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                k0Var5.setScaleY(f11);
                k0 k0Var6 = this.f52599a0;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k0Var6.setAlpha(f12);
                n00 n00Var4 = this.f52601b0;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                n00Var4.setScaleX(f13);
                n00 n00Var5 = this.f52601b0;
                if (z9) {
                    f19 = 1.0f;
                }
                n00Var5.setScaleY(f19);
                n00 n00Var6 = this.f52601b0;
                if (!z9) {
                    f20 = 0.0f;
                }
                n00Var6.setAlpha(f20);
                FrameLayout frameLayout3 = this.Z;
                if (z9) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f52603c0;
                if (!z9) {
                    f18 = org.telegram.messenger.g0.L(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z9) {
                    this.Z.setVisibility(4);
                    this.f52599a0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z9;
        if (this.f52605e) {
            int childCount = this.K.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.K.getChildAt(i7);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q5;
                org.telegram.messenger.we weVar = this.J;
                ArrayList arrayList = this.f52602c;
                if (z10) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (weVar != null) {
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(num.intValue());
                        if (this.f52605e) {
                            i10 = arrayList.indexOf(Integer.valueOf(gfVar.C));
                        }
                        q5Var.setNum(i10);
                    } else {
                        org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) this.f52607f.get(num.intValue());
                        if (this.f52605e) {
                            i10 = arrayList.indexOf(kfVar.B);
                        }
                        q5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.gf) weVar.f26300e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    h7Var.b(z9, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        boolean z9;
        float f10;
        boolean z10 = true;
        if (this.f52600b.size() == 0) {
            this.f52601b0.setPivotX(0.0f);
            this.f52601b0.setPivotY(0.0f);
            if (i7 == 0) {
                z10 = false;
            }
            l0(false, z10);
            return;
        }
        this.f52601b0.invalidate();
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!l0(true, z9) && i7 != 0) {
            this.f52601b0.setPivotX(org.telegram.messenger.g0.L(21.0f));
            this.f52601b0.setPivotY(org.telegram.messenger.g0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            n00 n00Var = this.f52601b0;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i7 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n00Var, property, f10, 1.0f);
            n00 n00Var2 = this.f52601b0;
            Property property2 = View.SCALE_Y;
            if (i7 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(n00Var2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f52601b0.setPivotX(0.0f);
        this.f52601b0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        if (!this.f52620r && (this.f52615n.size() <= 0 || ((str = this.f52627w) != null && !TextUtils.isEmpty(str)))) {
            this.N.e(false, true);
        } else {
            this.N.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.lt ltVar = this.f52604d0;
        if (ltVar != null && ltVar.f35844e) {
            if (z9) {
                ltVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25076t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25076t);
        if (this.f52631y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f52631y, true);
            this.f52631y = 0;
        }
        org.telegram.ui.Components.lt ltVar = this.f52604d0;
        if (ltVar != null) {
            ltVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.qj0 qj0Var = this.K;
        if (qj0Var == null) {
            return;
        }
        if (this.f52604d0.f35844e) {
            this.fragmentView.setTranslationY(f10);
            this.K.setTranslationY(0.0f);
            return;
        }
        qj0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.L;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.lt ltVar = this.f52604d0;
        if (ltVar != null) {
            ltVar.s();
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.P;
        if (r0Var != null) {
            r0Var.F(true);
            if (!TextUtils.isEmpty(this.f52618p0)) {
                this.P.P(this.f52618p0, false);
                this.f52618p0 = null;
                g0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (z9 && (r0Var = this.P) != null) {
            org.telegram.messenger.g0.K3(r0Var.getSearchField());
        }
    }
}
