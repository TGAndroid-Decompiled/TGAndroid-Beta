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
public final class ym0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final org.telegram.messenger.ve K;
    public org.telegram.ui.Components.uj0 L;
    public l4 M;
    public vm0 N;
    public org.telegram.ui.Components.cv0 O;
    public hi.q2 P;
    public org.telegram.ui.ActionBar.q0 Q;
    public org.telegram.ui.ActionBar.z0 R;
    public int S;
    public boolean T;
    public final int U;
    public final an V;
    public org.telegram.ui.Components.yj0 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final int f53564a;
    public FrameLayout f53565a0;
    public final HashMap f53566b;
    public k0 f53567b0;
    public final ArrayList f53568c;
    public rv f53569c0;
    public CharSequence d;
    public View f53570d0;
    public boolean f53571e;
    public org.telegram.ui.Components.rt f53572e0;
    public final ArrayList f53573f;
    public ImageView f53574f0;
    public um0 f53575g0;
    public final HashMap h;
    public int f53576h0;
    public final TextPaint f53577i0;
    public final RectF f53578j0;
    public final Paint f53579k0;
    public AnimatorSet f53580l0;
    public boolean m0;
    public final ArrayList f53581n;
    public org.telegram.ui.ActionBar.g1 f53582n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f53583o0;
    public org.telegram.ui.ActionBar.z0[] f53584p0;
    public String f53585q0;
    public boolean f53586r;
    public boolean f53587r0;
    public boolean f53588s;
    public final boolean f53589s0;
    public xm0 f53590t0;
    public zm0 f53591u0;
    public final int f53592v0;
    public String f53593w;
    public final int f53594w0;
    public String f53595x;
    public final int f53596x0;
    public int f53597y;
    public final sm0 f53598y0;

    public ym0(int i7, org.telegram.messenger.ve veVar, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, an anVar, boolean z11) {
        super(null);
        this.f53573f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f53581n = new ArrayList();
        this.f53588s = true;
        this.J = true;
        this.S = 100;
        this.f53576h0 = 3;
        this.f53577i0 = new TextPaint(1);
        this.f53578j0 = new RectF();
        this.f53579k0 = new Paint(1);
        this.f53587r0 = true;
        this.f53598y0 = new sm0(this);
        this.K = veVar;
        this.f53566b = hashMap;
        this.f53568c = arrayList;
        this.f53564a = i7;
        this.U = i10;
        this.V = anVar;
        this.F = z10;
        this.f53589s0 = z11;
        if (veVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt("count", 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.f53581n.add(string);
            }
        }
        if (z11) {
            this.f53592v0 = org.telegram.ui.ActionBar.j6.f29006lh;
            this.f53594w0 = org.telegram.ui.ActionBar.j6.Yg;
            this.f53596x0 = org.telegram.ui.ActionBar.j6.Zg;
            return;
        }
        this.f53592v0 = org.telegram.ui.ActionBar.j6.f28922h5;
        this.f53594w0 = org.telegram.ui.ActionBar.j6.f28957j5;
        this.f53596x0 = org.telegram.ui.ActionBar.j6.I5;
    }

    public static void Z(ym0 ym0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.np.s1(ym0Var.currentAccount).Y3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.np.s1(ym0Var.currentAccount).S3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.vr.a0(ym0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = ym0Var.H;
        ym0Var.H = null;
        ym0Var.i0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.q5 a0(ym0 ym0Var, int i7) {
        int childCount = ym0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ym0Var.L.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) q5Var.getTag()).intValue();
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= ym0Var.f53573f.size()) : !(intValue < 0 || intValue >= veVar.f26971e.size())) {
                    if (intValue == i7) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    public static int b0(ym0 ym0Var) {
        return ym0Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28853da));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Z = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = this.f53592v0;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.f53594w0;
        org.telegram.ui.ActionBar.q6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, this.f53596x0, null);
        this.actionBar.setBackButtonImage(2131231240);
        int i11 = this.f53564a;
        org.telegram.messenger.ve veVar = this.K;
        if (veVar != null) {
            this.actionBar.setTitle(veVar.f26970c);
        } else if (i11 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745761, null));
        } else if (i11 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131745764, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 25));
        if (this.m0) {
            org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131231244);
            a10.setSubMenuDelegate(new tm0(this));
            this.R = a10.e(1, 2131232209, org.telegram.messenger.hd.M0(2131745345, null));
            a10.e(2, 2131232266, org.telegram.messenger.hd.M0(2131747796, null));
        }
        if (veVar == null) {
            org.telegram.ui.ActionBar.q0 a11 = this.actionBar.s().a(0, 2131232487);
            a11.O();
            a11.I = new hi.s2(this);
            this.Q = a11;
            EditTextBoldCursor searchField = a11.getSearchField();
            org.telegram.ui.ActionBar.q6.U(searchField, i10, null);
            org.telegram.ui.ActionBar.q6.v(searchField, i10, null);
            org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, null);
        }
        if (veVar == null) {
            if (i11 == 0) {
                this.Q.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
            } else if (i11 == 1) {
                this.Q.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
            }
        }
        um0 um0Var = new um0(this, context);
        this.f53575g0 = um0Var;
        org.telegram.ui.ActionBar.q6.h(i7, um0Var, null);
        this.fragmentView = this.f53575g0;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.L = uj0Var;
        uj0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        org.telegram.ui.Components.uj0 uj0Var2 = this.L;
        ?? sVar = new v4.s(4);
        this.N = sVar;
        uj0Var2.setLayoutManager(sVar);
        this.N.O = new bi.y1(this, 16);
        this.f53575g0.addView(this.L, c8.ja.e(-1, -1, 51));
        org.telegram.ui.Components.uj0 uj0Var3 = this.L;
        l4 l4Var = new l4(14, this, context);
        this.M = l4Var;
        uj0Var3.setAdapter(l4Var);
        org.telegram.ui.ActionBar.q6.H(this.L, i7, null);
        this.L.setOnItemClickListener(new h(this, 21));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new rm0(this, 2));
        }
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(new tm0(this));
        this.W = yj0Var;
        if (this.I != 1) {
            this.L.F.add(yj0Var);
        }
        hi.q2 q2Var = new hi.q2(1, context, getResourceProvider());
        this.P = q2Var;
        q2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.P, 1, getResourceProvider());
        this.O = cv0Var;
        cv0Var.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(this.O.d, org.telegram.ui.ActionBar.j6.f29241y6, getResourceProvider());
        this.O.addView(this.P, 0);
        if (veVar != null) {
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748180, null));
        } else {
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748169, null));
        }
        this.O.e(false, false);
        this.f53575g0.addView(this.O, c8.ja.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new g3(this, 23));
        if (veVar == null) {
            o0();
        }
        if (this.f53587r0) {
            View view = new View(context);
            this.f53570d0 = view;
            view.setBackgroundResource(2131231238);
            this.f53570d0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f53575g0.addView(this.f53570d0, c8.ja.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.f53565a0 = frameLayout;
            org.telegram.ui.ActionBar.q6.h(i7, frameLayout, null);
            this.f53565a0.setVisibility(4);
            this.f53565a0.setTranslationY(org.telegram.messenger.g0.L(48.0f));
            this.f53575g0.addView(this.f53565a0, c8.ja.e(-1, 48, 83));
            this.f53565a0.setOnTouchListener(new gi.a(2));
            org.telegram.ui.Components.rt rtVar = this.f53572e0;
            if (rtVar != null) {
                rtVar.o();
            }
            this.f53572e0 = new org.telegram.ui.Components.rt(context, this.f53575g0, null, 1, false, null);
            this.f53572e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).H0())});
            this.f53572e0.setHint(org.telegram.messenger.hd.M0(2131754454, null));
            this.f53572e0.s();
            org.telegram.ui.Components.ft editText = this.f53572e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.f53565a0.addView(this.f53572e0, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f53572e0.setText(charSequence);
            }
            this.f53572e0.getEditText().addTextChangedListener(new m0(this, 14));
            k0 k0Var = new k0(18, context, this);
            this.f53567b0 = k0Var;
            k0Var.setFocusable(true);
            this.f53567b0.setFocusableInTouchMode(true);
            this.f53567b0.setVisibility(4);
            this.f53567b0.setScaleX(0.2f);
            this.f53567b0.setScaleY(0.2f);
            this.f53567b0.setAlpha(0.0f);
            this.f53575g0.addView(this.f53567b0, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f53574f0 = new ImageView(context);
            this.f53574f0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T5, false)));
            this.f53574f0.setImageResource(2131230876);
            this.f53574f0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.q6.s(this.f53574f0, org.telegram.ui.ActionBar.j6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f53574f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f53574f0.setOutlineProvider(new bg.p0(20));
            this.f53567b0.addView(this.f53574f0, c8.ja.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f53574f0.setOnClickListener(new g40(this, 19));
            this.f53574f0.setOnLongClickListener(new t(this, 4));
            TextPaint textPaint = this.f53577i0;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            rv rvVar = new rv(5, context, this);
            this.f53569c0 = rvVar;
            rvVar.setAlpha(0.0f);
            this.f53569c0.setScaleX(0.2f);
            this.f53569c0.setScaleY(0.2f);
            this.f53575g0.addView(this.f53569c0, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.f53572e0.setVisibility(8);
            }
        }
        if ((veVar != null || i11 == 0 || i11 == 1) && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f53571e = z10;
        this.L.setEmptyView(this.O);
        org.telegram.ui.Components.uj0 uj0Var4 = this.L;
        uj0Var4.X1 = true;
        uj0Var4.Y1 = 0;
        n0(0);
        return this.fragmentView;
    }

    public final int d0(int i7, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof org.telegram.messenger.ff;
        if (z10) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        } else if (obj instanceof org.telegram.messenger.jf) {
            obj2 = ((org.telegram.messenger.jf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f53566b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f53568c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f53571e) {
                m0();
            }
            if (i7 >= 0) {
                if (z10) {
                    ((org.telegram.messenger.ff) obj).e();
                } else if (obj instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj).e();
                }
                this.f53598y0.X(i7);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25572t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0() {
        this.f53581n.clear();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        this.O.e(false, true);
        h0();
    }

    public final void f0(View view, Object obj) {
        boolean z10;
        int i7 = 1;
        if (d0(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(this.f53568c.contains(Integer.valueOf(((org.telegram.messenger.ff) this.K.f26971e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z10) {
            i7 = 2;
        }
        n0(i7);
        this.f53590t0.y();
    }

    public final void g0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f53573f.clear();
        this.h.clear();
        this.f53588s = true;
        if (this.f53564a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(obj, "", z10, true);
        this.f53593w = obj;
        if (obj.length() == 0) {
            this.f53593w = null;
            this.O.d.setText(org.telegram.messenger.hd.M0(2131748169, null));
        } else {
            this.O.d.setText(org.telegram.messenger.hd.a0("NoResultFoundFor", null, 2131748166, this.f53593w));
        }
        o0();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53575g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53592v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53592v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53594w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53594w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53596x0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53594w0));
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53594w0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f53592v0));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    public final void h0() {
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26600b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f53581n.size());
        int size = this.f53581n.size();
        for (int i7 = 0; i7 < size; i7++) {
            edit.putString(i5.c.i(i7, "recent"), (String) this.f53581n.get(i7));
        }
        edit.commit();
    }

    public final void i0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f53586r) {
            this.f53586r = false;
            if (this.f53597y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f53597y, true);
                this.f53597y = 0;
            }
        }
        this.H = str;
        this.f53586r = true;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.currentAccount);
        org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(this.currentAccount);
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
                org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(this.currentAccount);
                if (z10) {
                    str5 = s14.L3;
                } else {
                    str5 = s14.M3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new hi.b3(10, this, z10));
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
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        an anVar = this.V;
        if (anVar != null) {
            long a10 = anVar.a();
            if (org.telegram.messenger.m5.C(a10)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a10);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i7 = this.E + 1;
        this.E = i7;
        this.f53597y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.zm(this, str, i7, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f53597y, this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i7, boolean z10) {
        HashMap hashMap = this.f53566b;
        if (!hashMap.isEmpty() && this.f53590t0 != null && !this.T) {
            org.telegram.ui.Components.rt rtVar = this.f53572e0;
            if (rtVar != null && rtVar.f39056a.length() > 0) {
                Object obj = hashMap.get(this.f53568c.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj).f27707a = this.f53572e0.getText().toString();
                } else if (obj instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj).I = this.f53572e0.getText().toString();
                }
            }
            this.T = true;
            this.f53590t0.t0(i7, false, z10);
            if (this.U != 2) {
                xm0 xm0Var = this.f53590t0;
                if (xm0Var == null || xm0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void k0(int i7, boolean z10) {
        this.I = i7;
        this.J = z10;
        if (i7 > 0 && this.f53564a == 1) {
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
        if (this.f53572e0 != null) {
            if (this.f53565a0.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f53580l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.f53565a0;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f53572e0.getEditText().isFocused()) {
                    org.telegram.messenger.g0.v1(this.f53572e0.getEditText());
                }
                this.f53572e0.k(true);
                if (z10) {
                    this.f53565a0.setVisibility(0);
                    this.f53567b0.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z11) {
                    this.f53580l0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    k0 k0Var = this.f53567b0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property, f14));
                    k0 k0Var2 = this.f53567b0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, f15));
                    k0 k0Var3 = this.f53567b0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k0Var3, property3, f16));
                    rv rvVar = this.f53569c0;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(rvVar, property, f17));
                    rv rvVar2 = this.f53569c0;
                    if (z10) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(rvVar2, property2, f19));
                    rv rvVar3 = this.f53569c0;
                    if (!z10) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(rvVar3, property3, f20));
                    FrameLayout frameLayout2 = this.f53565a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        L2 = 0.0f;
                    } else {
                        L2 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.f53570d0;
                    if (!z10) {
                        f18 = org.telegram.messenger.g0.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f53580l0.playTogether(arrayList);
                    this.f53580l0.setInterpolator(new DecelerateInterpolator());
                    this.f53580l0.setDuration(180L);
                    this.f53580l0.addListener(new z20(4, this, z10));
                    this.f53580l0.start();
                    return true;
                }
                k0 k0Var4 = this.f53567b0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                k0Var4.setScaleX(f10);
                k0 k0Var5 = this.f53567b0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                k0Var5.setScaleY(f11);
                k0 k0Var6 = this.f53567b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k0Var6.setAlpha(f12);
                rv rvVar4 = this.f53569c0;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                rvVar4.setScaleX(f13);
                rv rvVar5 = this.f53569c0;
                if (z10) {
                    f19 = 1.0f;
                }
                rvVar5.setScaleY(f19);
                rv rvVar6 = this.f53569c0;
                if (!z10) {
                    f20 = 0.0f;
                }
                rvVar6.setAlpha(f20);
                FrameLayout frameLayout3 = this.f53565a0;
                if (z10) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.f53570d0;
                if (!z10) {
                    f18 = org.telegram.messenger.g0.L(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z10) {
                    this.f53565a0.setVisibility(4);
                    this.f53567b0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void m0() {
        boolean z10;
        if (this.f53571e) {
            int childCount = this.L.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.L.getChildAt(i7);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.q5;
                org.telegram.messenger.ve veVar = this.K;
                ArrayList arrayList = this.f53568c;
                if (z11) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i10 = -1;
                    if (veVar != null) {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26971e.get(num.intValue());
                        if (this.f53571e) {
                            i10 = arrayList.indexOf(Integer.valueOf(ffVar.C));
                        }
                        q5Var.setNum(i10);
                    } else {
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) this.f53573f.get(num.intValue());
                        if (this.f53571e) {
                            i10 = arrayList.indexOf(jfVar.B);
                        }
                        q5Var.setNum(i10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ff) veVar.f26971e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g7Var.b(z10, false);
                }
            }
        }
    }

    public final void n0(int i7) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (this.f53566b.size() == 0) {
            this.f53569c0.setPivotX(0.0f);
            this.f53569c0.setPivotY(0.0f);
            if (i7 == 0) {
                z11 = false;
            }
            l0(false, z11);
            return;
        }
        this.f53569c0.invalidate();
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l0(true, z10) && i7 != 0) {
            this.f53569c0.setPivotX(org.telegram.messenger.g0.L(21.0f));
            this.f53569c0.setPivotY(org.telegram.messenger.g0.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            rv rvVar = this.f53569c0;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i7 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rvVar, property, f10, 1.0f);
            rv rvVar2 = this.f53569c0;
            Property property2 = View.SCALE_Y;
            if (i7 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(rvVar2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f53569c0.setPivotX(0.0f);
        this.f53569c0.setPivotY(0.0f);
    }

    public final void o0() {
        String str;
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        if (!this.f53586r && (this.f53581n.size() <= 0 || ((str = this.f53593w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.f53572e0;
        if (rtVar != null && rtVar.f39059e) {
            if (z10) {
                rtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25572t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25572t);
        if (this.f53597y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f53597y, true);
            this.f53597y = 0;
        }
        org.telegram.ui.Components.rt rtVar = this.f53572e0;
        if (rtVar != null) {
            rtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.uj0 uj0Var = this.L;
        if (uj0Var == null) {
            return;
        }
        if (this.f53572e0.f39059e) {
            this.fragmentView.setTranslationY(f10);
            this.L.setTranslationY(0.0f);
            return;
        }
        uj0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.M;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.rt rtVar = this.f53572e0;
        if (rtVar != null) {
            rtVar.s();
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.Q;
        if (q0Var != null) {
            q0Var.G(true);
            if (!TextUtils.isEmpty(this.f53585q0)) {
                this.Q.Q(this.f53585q0, false);
                this.f53585q0 = null;
                g0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (z10 && (q0Var = this.Q) != null) {
            org.telegram.messenger.g0.J3(q0Var.getSearchField());
        }
    }
}
