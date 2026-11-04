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
public final class sm0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final org.telegram.messenger.pe K;
    public org.telegram.ui.Components.tj0 L;
    public n4 M;
    public pm0 N;
    public org.telegram.ui.Components.zu0 O;
    public gi.q2 P;
    public org.telegram.ui.ActionBar.q0 Q;
    public org.telegram.ui.ActionBar.y0 R;
    public int S;
    public boolean T;
    public final int U;
    public final wm V;
    public org.telegram.ui.Components.xj0 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final int f49538a;
    public FrameLayout f49539a0;
    public final HashMap f49540b;
    public l0 f49541b0;
    public final ArrayList f49542c;
    public org.telegram.ui.Components.voip.r0 f49543c0;
    public CharSequence d;
    public View f49544d0;
    public boolean f49545e;
    public org.telegram.ui.Components.jt f49546e0;
    public final ArrayList f49547f;
    public ImageView f49548f0;
    public om0 f49549g0;
    public final HashMap h;
    public int f49550h0;
    public final TextPaint f49551i0;
    public final RectF f49552j0;
    public final Paint f49553k0;
    public AnimatorSet f49554l0;
    public boolean m0;
    public final ArrayList f49555n;
    public org.telegram.ui.ActionBar.f1 f49556n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f49557o0;
    public org.telegram.ui.ActionBar.y0[] f49558p0;
    public String f49559q0;
    public boolean f49560r;
    public boolean f49561r0;
    public boolean f49562s;
    public final boolean f49563s0;
    public rm0 f49564t0;
    public tm0 f49565u0;
    public final int f49566v0;
    public String f49567w;
    public final int f49568w0;
    public String f49569x;
    public final int f49570x0;
    public int f49571y;
    public final mm0 f49572y0;

    public sm0(int i3, org.telegram.messenger.pe peVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, wm wmVar, boolean z11) {
        super(null);
        this.f49547f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f49555n = new ArrayList();
        this.f49562s = true;
        this.J = true;
        this.S = 100;
        this.f49550h0 = 3;
        this.f49551i0 = new TextPaint(1);
        this.f49552j0 = new RectF();
        this.f49553k0 = new Paint(1);
        this.f49561r0 = true;
        this.f49572y0 = new mm0(this);
        this.K = peVar;
        this.f49540b = hashMap;
        this.f49542c = arrayList;
        this.f49538a = i3;
        this.U = i10;
        this.V = wmVar;
        this.F = z10;
        this.f49563s0 = z11;
        if (peVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f49555n.add(string);
            }
        }
        if (z11) {
            this.f49566v0 = org.telegram.ui.ActionBar.k6.f27980ih;
            this.f49568w0 = org.telegram.ui.ActionBar.k6.Vg;
            this.f49570x0 = org.telegram.ui.ActionBar.k6.Wg;
            return;
        }
        this.f49566v0 = org.telegram.ui.ActionBar.k6.f27954h5;
        this.f49568w0 = org.telegram.ui.ActionBar.k6.f27988j5;
        this.f49570x0 = org.telegram.ui.ActionBar.k6.I5;
    }

    public static void Z(sm0 sm0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.hp.s1(sm0Var.currentAccount).Y3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.hp.s1(sm0Var.currentAccount).S3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.qr.a0(sm0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = sm0Var.H;
        sm0Var.H = null;
        sm0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.q5 a0(sm0 sm0Var, int i3) {
        int childCount = sm0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sm0Var.L.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar == null ? !(intValue < 0 || intValue >= sm0Var.f49547f.size()) : !(intValue < 0 || intValue >= peVar.f24738e.size())) {
                    if (intValue == i3) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(sm0 sm0Var) {
        return sm0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27882da));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Z = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = this.f49566v0;
        org.telegram.ui.ActionBar.r6.i(i3, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f49568w0;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, this.f49570x0, null);
        this.actionBar.setBackButtonImage(2131231240);
        int i11 = this.f49538a;
        org.telegram.messenger.pe peVar = this.K;
        if (peVar != null) {
            this.actionBar.setTitle(peVar.f24737c);
        } else if (i11 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131745771, null));
        } else if (i11 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131745774, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 25));
        if (this.m0) {
            org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131231244);
            a10.setSubMenuDelegate(new nm0(this));
            this.R = a10.e(1, 2131232208, org.telegram.messenger.bd.M0(2131745355, null));
            a10.e(2, 2131232265, org.telegram.messenger.bd.M0(2131747804, null));
        }
        if (peVar == null) {
            org.telegram.ui.ActionBar.q0 a11 = this.actionBar.q().a(0, 2131232486);
            a11.N();
            a11.I = new gi.s2(this);
            this.Q = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.r6.V(searchField, i10, null);
            org.telegram.ui.ActionBar.r6.w(searchField, i10, null);
            org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, null);
        }
        if (peVar == null) {
            if (i11 == 0) {
                this.Q.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745771, null));
            } else if (i11 == 1) {
                this.Q.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745774, null));
            }
        }
        om0 om0Var = new om0(this, context);
        this.f49549g0 = om0Var;
        org.telegram.ui.ActionBar.r6.i(i3, om0Var, null);
        this.fragmentView = this.f49549g0;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.L = tj0Var;
        tj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        org.telegram.ui.Components.tj0 tj0Var2 = this.L;
        ?? sVar = new u4.s(4);
        this.N = sVar;
        tj0Var2.setLayoutManager(sVar);
        this.N.O = new ai.g2(this, 16);
        this.f49549g0.addView(this.L, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.tj0 tj0Var3 = this.L;
        n4 n4Var = new n4(14, this, context);
        this.M = n4Var;
        tj0Var3.setAdapter(n4Var);
        org.telegram.ui.ActionBar.r6.I(this.L, i3, null);
        this.L.setOnItemClickListener(new h(this, 21));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new lm0(this, 2));
        }
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(new nm0(this));
        this.W = xj0Var;
        if (this.I != 1) {
            this.L.F.add(xj0Var);
        }
        gi.q2 q2Var = new gi.q2(1, context, getResourceProvider());
        this.P = q2Var;
        q2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, this.P, 1, getResourceProvider());
        this.O = zu0Var;
        zu0Var.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(this.O.d, org.telegram.ui.ActionBar.k6.f28273y6, getResourceProvider());
        this.O.addView(this.P, 0);
        if (peVar != null) {
            this.O.d.setText(org.telegram.messenger.bd.M0(2131748188, null));
        } else {
            this.O.d.setText(org.telegram.messenger.bd.M0(2131748177, null));
        }
        this.O.e(false, false);
        this.f49549g0.addView(this.O, b8.mf.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new h3(this, 23));
        if (peVar == null) {
            o0();
        }
        if (this.f49561r0) {
            View view = new View(context);
            this.f49544d0 = view;
            view.setBackgroundResource(2131231238);
            this.f49544d0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f49549g0.addView(this.f49544d0, b8.mf.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.f49539a0 = frameLayout;
            org.telegram.ui.ActionBar.r6.i(i3, frameLayout, null);
            this.f49539a0.setVisibility(4);
            this.f49539a0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f49549g0.addView(this.f49539a0, b8.mf.e(-1, 48, 83));
            this.f49539a0.setOnTouchListener(new fi.a(2));
            org.telegram.ui.Components.jt jtVar = this.f49546e0;
            if (jtVar != null) {
                jtVar.o();
            }
            this.f49546e0 = new org.telegram.ui.Components.jt(context, this.f49549g0, null, 1, false, null);
            this.f49546e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).H0())});
            this.f49546e0.setHint(org.telegram.messenger.bd.M0(2131754454, null));
            this.f49546e0.s();
            org.telegram.ui.Components.xs editText = this.f49546e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.f49539a0.addView(this.f49546e0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f49546e0.setText(charSequence);
            }
            this.f49546e0.getEditText().addTextChangedListener(new n0(this, 14));
            l0 l0Var = new l0(18, context, this);
            this.f49541b0 = l0Var;
            l0Var.setFocusable(true);
            this.f49541b0.setFocusableInTouchMode(true);
            this.f49541b0.setVisibility(4);
            this.f49541b0.setScaleX(0.2f);
            this.f49541b0.setScaleY(0.2f);
            this.f49541b0.setAlpha(0.0f);
            this.f49549g0.addView(this.f49541b0, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f49548f0 = new ImageView(context);
            this.f49548f0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
            this.f49548f0.setImageResource(2131230876);
            this.f49548f0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.r6.t(this.f49548f0, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f49548f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f49548f0.setOutlineProvider(new cg.p0(23));
            this.f49541b0.addView(this.f49548f0, b8.mf.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f49548f0.setOnClickListener(new b40(this, 19));
            this.f49548f0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f49551i0;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(6, context, this);
            this.f49543c0 = r0Var;
            r0Var.setAlpha(0.0f);
            this.f49543c0.setScaleX(0.2f);
            this.f49543c0.setScaleY(0.2f);
            this.f49549g0.addView(this.f49543c0, b8.mf.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.f49546e0.setVisibility(8);
            }
        }
        if ((peVar != null || i11 == 0 || i11 == 1) && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49545e = z10;
        this.L.setEmptyView(this.O);
        org.telegram.ui.Components.tj0 tj0Var4 = this.L;
        tj0Var4.X1 = true;
        tj0Var4.Y1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i3, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof org.telegram.messenger.ye;
        if (z10) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ye) obj).C);
        } else if (obj instanceof org.telegram.messenger.bf) {
            obj2 = ((org.telegram.messenger.bf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f49540b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f49542c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f49545e) {
                m0();
            }
            if (i3 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ye) obj).e();
                } else if (obj instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj).e();
                }
                this.f49572y0.X(i3);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23305t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f49555n.clear();
        n4 n4Var = this.M;
        if (n4Var != null) {
            n4Var.f();
        }
        this.O.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z10;
        int i3 = 1;
        if (d0(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(this.f49542c.contains(Integer.valueOf(((org.telegram.messenger.ye) this.K.f24738e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i3 = 2;
        }
        n0(i3);
        this.f49564t0.m();
    }

    public final void g0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f49547f.clear();
        this.h.clear();
        this.f49562s = true;
        if (this.f49538a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(obj, "", z10, true);
        this.f49567w = obj;
        if (obj.length() == 0) {
            this.f49567w = null;
            this.O.d.setText(org.telegram.messenger.bd.M0(2131748177, null));
        } else {
            this.O.d.setText(org.telegram.messenger.bd.a0("NoResultFoundFor", null, 2131748174, this.f49567w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49549g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49566v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49566v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49568w0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49568w0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49570x0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49568w0));
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49568w0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f49566v0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f49555n.size());
        int size = this.f49555n.size();
        for (int i3 = 0; i3 < size; i3++) {
            edit.putString(k2.p1.i(i3, "recent"), (String) this.f49555n.get(i3));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f49560r) {
            this.f49560r = false;
            if (this.f49571y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f49571y, true);
                this.f49571y = 0;
            }
        }
        this.H = str;
        this.f49560r = true;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.currentAccount);
        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(this.currentAccount);
        if (z10) {
            str3 = s13.L3;
        } else {
            str3 = s13.M3;
        }
        TLObject f22 = s12.f2(str3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z11 && !this.G) {
                this.G = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(this.currentAccount);
                if (z10) {
                    str5 = s14.L3;
                } else {
                    str5 = s14.M3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new gi.b3(10, this, z10));
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
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.hp.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        wm wmVar = this.V;
        if (wmVar != null) {
            long a10 = wmVar.a();
            if (org.telegram.messenger.m5.C(a10)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a10);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i3 = this.E + 1;
        this.E = i3;
        this.f49571y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.sm(this, str, i3, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f49571y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i3, boolean z10) {
        HashMap hashMap = this.f49540b;
        if (!hashMap.isEmpty() && this.f49564t0 != null && !this.T) {
            org.telegram.ui.Components.jt jtVar = this.f49546e0;
            if (jtVar != null && jtVar.f35188a.length() > 0) {
                Object obj = hashMap.get(this.f49542c.get(0));
                if (obj instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj).f25309a = this.f49546e0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj).I = this.f49546e0.getText().toString();
                }
            }
            this.T = true;
            this.f49564t0.v0(i3, false, z10);
            if (this.U != 2) {
                rm0 rm0Var = this.f49564t0;
                if (rm0Var == null || rm0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i3, boolean z10) {
        this.I = i3;
        this.J = z10;
        if (i3 > 0 && this.f49538a == 1) {
            this.I = 1;
        }
    }

    public final boolean l0(boolean z10, boolean z11) {
        boolean z12;
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
        if (this.f49546e0 != null) {
            if (this.f49539a0.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f49554l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.f49539a0;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f49546e0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.f49546e0.getEditText());
                }
                this.f49546e0.k(true);
                if (z10) {
                    this.f49539a0.setVisibility(0);
                    this.f49541b0.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z11) {
                    this.f49554l0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    l0 l0Var = this.f49541b0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property, f14));
                    l0 l0Var2 = this.f49541b0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, f15));
                    l0 l0Var3 = this.f49541b0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var3, property3, f16));
                    org.telegram.ui.Components.voip.r0 r0Var = this.f49543c0;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f17));
                    org.telegram.ui.Components.voip.r0 r0Var2 = this.f49543c0;
                    if (z10) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var2, property2, f19));
                    org.telegram.ui.Components.voip.r0 r0Var3 = this.f49543c0;
                    if (!z10) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var3, property3, f20));
                    FrameLayout frameLayout2 = this.f49539a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f49544d0;
                    if (!z10) {
                        f18 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f49554l0.playTogether(arrayList);
                    this.f49554l0.setInterpolator(new DecelerateInterpolator());
                    this.f49554l0.setDuration(180L);
                    this.f49554l0.addListener(new u40(3, this, z10));
                    this.f49554l0.start();
                    return true;
                }
                l0 l0Var4 = this.f49541b0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                l0Var4.setScaleX(f10);
                l0 l0Var5 = this.f49541b0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                l0Var5.setScaleY(f11);
                l0 l0Var6 = this.f49541b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                l0Var6.setAlpha(f12);
                org.telegram.ui.Components.voip.r0 r0Var4 = this.f49543c0;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                r0Var4.setScaleX(f13);
                org.telegram.ui.Components.voip.r0 r0Var5 = this.f49543c0;
                if (z10) {
                    f19 = 1.0f;
                }
                r0Var5.setScaleY(f19);
                org.telegram.ui.Components.voip.r0 r0Var6 = this.f49543c0;
                if (!z10) {
                    f20 = 0.0f;
                }
                r0Var6.setAlpha(f20);
                FrameLayout frameLayout3 = this.f49539a0;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f49544d0;
                if (!z10) {
                    f18 = org.telegram.messenger.g0.L(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z10) {
                    this.f49539a0.setVisibility(4);
                    this.f49541b0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z10;
        if (this.f49545e) {
            int childCount = this.L.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.L.getChildAt(i3);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.q5;
                org.telegram.messenger.pe peVar = this.K;
                ArrayList arrayList = this.f49542c;
                if (z11) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (peVar != null) {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.f24738e.get(num.intValue());
                        if (this.f49545e) {
                            i10 = arrayList.indexOf(Integer.valueOf(yeVar.C));
                        }
                        q5Var.setNum(i10);
                    } else {
                        org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) this.f49547f.get(num.intValue());
                        if (this.f49545e) {
                            i10 = arrayList.indexOf(bfVar.B);
                        }
                        q5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ye) peVar.f24738e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g7Var.b(z10, false);
                }
            }
        }
    }

    public final void n0(int i3) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (this.f49540b.size() == 0) {
            this.f49543c0.setPivotX(0.0f);
            this.f49543c0.setPivotY(0.0f);
            if (i3 == 0) {
                z11 = false;
            }
            l0(false, z11);
            return;
        }
        this.f49543c0.invalidate();
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l0(true, z10) && i3 != 0) {
            this.f49543c0.setPivotX(org.telegram.messenger.g0.L(21.0f));
            this.f49543c0.setPivotY(org.telegram.messenger.g0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.voip.r0 r0Var = this.f49543c0;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i3 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r0Var, property, f10, 1.0f);
            org.telegram.ui.Components.voip.r0 r0Var2 = this.f49543c0;
            Property property2 = View.SCALE_Y;
            if (i3 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(r0Var2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f49543c0.setPivotX(0.0f);
        this.f49543c0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        n4 n4Var = this.M;
        if (n4Var != null) {
            n4Var.f();
        }
        if (!this.f49560r && (this.f49555n.size() <= 0 || ((str = this.f49567w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.f49546e0;
        if (jtVar != null && jtVar.f35191e) {
            if (z10) {
                jtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23305t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23305t);
        if (this.f49571y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f49571y, true);
            this.f49571y = 0;
        }
        org.telegram.ui.Components.jt jtVar = this.f49546e0;
        if (jtVar != null) {
            jtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.tj0 tj0Var = this.L;
        if (tj0Var == null) {
            return;
        }
        if (this.f49546e0.f35191e) {
            this.fragmentView.setTranslationY(f10);
            this.L.setTranslationY(0.0f);
            return;
        }
        tj0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.M;
        if (n4Var != null) {
            n4Var.f();
        }
        org.telegram.ui.Components.jt jtVar = this.f49546e0;
        if (jtVar != null) {
            jtVar.s();
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            q0Var.F(true);
            if (!TextUtils.isEmpty(this.f49559q0)) {
                this.Q.P(this.f49559q0, false);
                this.f49559q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (z10 && (q0Var = this.Q) != null) {
            org.telegram.messenger.g0.K3(q0Var.getSearchField());
        }
    }
}
