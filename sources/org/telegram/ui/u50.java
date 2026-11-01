package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class u50 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, fe.e, View.OnClickListener, hh.d {
    public org.telegram.ui.Components.f10 D;
    public boolean E;
    public jg.a3 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.h J;
    public final int K;
    public String L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public org.telegram.ui.Components.s20 X;
    public org.telegram.ui.Components.s20 Y;
    public a0.h Z;
    public final int f41800a;
    public ArrayList f41801a0;
    public final fe.f f41802b;
    public org.telegram.ui.Components.s20 f41803b0;
    public final fe.b f41804c;
    public int f41805c0;
    public ih.c d;
    public org.telegram.ui.Components.hd0 f41806d0;
    public kg.f0 e;
    public boolean f41807e0;
    public org.telegram.ui.Components.h10 f41808f;
    public final HashSet f41809f0;
    public boolean f41810g0;
    public m50 h;
    public boolean f41811h0;
    public ArrayList f41812i0;
    public boolean f41813j0;
    public boolean f41814k0;
    public int f41815l0;
    public int m0;
    public org.telegram.ui.Components.uk0 f41816n;
    public int f41817n0;
    public final Rect f41818o0;
    public final tg.f f41819p0;
    public final hi.f f41820q0;
    public s4.a0 f41821r;
    public tg.j f41822r0;
    public org.telegram.ui.Components.ew0 f41823s;
    public final ArrayList f41824s0;
    public final RectF f41825t0;
    public final RectF f41826u0;
    public s50 f41827w;
    public q50 f41828x;
    public p50 f41829y;

    public u50(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f41800a = i10;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f41802b = new fe.f(3, this, grVar, 350L);
        this.f41804c = new fe.b(4, this, grVar, 350L, false);
        this.Z = new a0.h();
        this.f41801a0 = new ArrayList();
        this.f41809f0 = new HashSet();
        this.f41815l0 = -4;
        this.f41818o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f41824s0 = arrayList;
        RectF rectF = new RectF();
        this.f41825t0 = rectF;
        RectF rectF2 = new RectF();
        this.f41826u0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i13 = bundle.getInt("chatType", 0);
        this.M = i13;
        this.N = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.P = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.Q = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.R = z13;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (!z10 && !z11 && !z13) {
            if (z12) {
                this.K = getMessagesController().Q6 - 1;
            } else {
                org.telegram.messenger.wp messagesController = getMessagesController();
                if (i13 == 0) {
                    i11 = messagesController.X2;
                } else {
                    i11 = messagesController.W2;
                }
                this.K = i11;
            }
        } else {
            this.K = 0;
        }
        if (i12 >= 31) {
            this.f41819p0 = new tg.f(false);
            this.f41820q0 = new hi.f(null);
            return;
        }
        this.f41819p0 = null;
        this.f41820q0 = null;
    }

    public static void Z(u50 u50Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.wb K;
        boolean z10;
        int i11 = u50Var.K;
        long j11 = u50Var.H;
        s50 s50Var = u50Var.f41827w;
        if (i10 == s50Var.f41227x) {
            int i12 = u50Var.currentAccount;
            org.telegram.ui.ActionBar.p6 p6Var = u50Var.resourceProvider;
            k50 k50Var = new k50(u50Var, 0);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
            x1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f14520b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new q8(i12, x1Var, context, p6Var, k50Var, 0));
        } else if (i10 == 0 && s50Var.F != 0 && !s50Var.f41223n) {
            TLRPC.ChatFull chatFull = u50Var.I;
            long j12 = u50Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, u50Var, chatFull, j12, z10);
            u50Var.f41806d0 = hd0Var;
            u50Var.showDialog(hd0Var);
        } else if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (j4Var.f22080r) {
                org.telegram.ui.Components.s20 s20Var = u50Var.X;
                if (s20Var == null) {
                    org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(u50Var.f41808f.f26635r.getContext(), "premium");
                    u50Var.X = s20Var2;
                    u50Var.h.a(s20Var2);
                    u50Var.X.setOnClickListener(u50Var);
                } else {
                    u50Var.h.c(s20Var);
                    u50Var.X = null;
                }
                u50Var.p0();
            } else if (j4Var.f22081s) {
                org.telegram.ui.Components.s20 s20Var3 = u50Var.Y;
                if (s20Var3 == null) {
                    org.telegram.ui.Components.s20 s20Var4 = new org.telegram.ui.Components.s20(u50Var.f41808f.f26635r.getContext(), "miniapps");
                    u50Var.Y = s20Var4;
                    u50Var.h.a(s20Var4);
                    u50Var.Y.setOnClickListener(u50Var);
                } else {
                    u50Var.h.c(s20Var3);
                    u50Var.Y = null;
                }
                u50Var.p0();
            } else {
                Object object = j4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f19943id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19794id;
                } else {
                    return;
                }
                a0.h hVar = u50Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (j4Var.O) {
                        int i13 = -u50Var.f41815l0;
                        u50Var.f41815l0 = i13;
                        org.telegram.messenger.i0.F3(i13, j4Var, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        if (j10 >= 0) {
                            str = org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(u50Var.currentAccount).Z1(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.wp.r1(u50Var.currentAccount).A3()) {
                            K = org.telegram.ui.Components.cc.a0(u50Var).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)));
                        } else {
                            K = org.telegram.ui.Components.cc.a0(u50Var).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)), org.telegram.messenger.dd.L0(2131743785, null), new k50(u50Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.s20 s20Var5 = (org.telegram.ui.Components.s20) u50Var.Z.f(j10);
                    if (s20Var5 != null) {
                        u50Var.h.c(s20Var5);
                    } else if (i11 == 0 || u50Var.Z.m() != i11) {
                        if (u50Var.M == 0 && u50Var.Z.m() == u50Var.getMessagesController().V2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u50Var.getParentActivity());
                            String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                            x1Var2.R = L0;
                            x1Var2.T = org.telegram.messenger.dd.L0(2131745312, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                            u50Var.showDialog(x1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (u50Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.cc.a0(u50Var).t(org.telegram.messenger.dd.L0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat L02 = u50Var.getMessagesController().L0(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u50Var.getParentActivity());
                                    boolean w9 = org.telegram.messenger.w3.w(4, L02);
                                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.f20135a;
                                    if (w9) {
                                        x1Var3.R = org.telegram.messenger.dd.L0(2131754461, null);
                                        x1Var3.T = org.telegram.messenger.dd.L0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131754466, null), new qv(7, u50Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    } else {
                                        x1Var3.T = org.telegram.messenger.dd.L0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                    }
                                    u50Var.showDialog(x1Var3);
                                    return;
                                }
                            }
                            u50Var.getMessagesController().U3(user, !u50Var.T, false);
                        } else if (object instanceof TLRPC.Chat) {
                            u50Var.getMessagesController().N3((TLRPC.Chat) object, !u50Var.T);
                        }
                        org.telegram.ui.Components.s20 s20Var6 = new org.telegram.ui.Components.s20(u50Var.f41808f.f26635r.getContext(), object);
                        u50Var.h.a(s20Var6);
                        s20Var6.setOnClickListener(u50Var);
                    } else {
                        return;
                    }
                    u50Var.x0();
                    if (!u50Var.T && !u50Var.S) {
                        u50Var.p0();
                    } else {
                        org.telegram.messenger.i0.J3(u50Var.f41808f.f26635r);
                    }
                    if (u50Var.f41808f.f26635r.length() > 0) {
                        u50Var.f41808f.f26635r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(u50 u50Var) {
        if (u50Var.F == null) {
            return;
        }
        u50Var.f41804c.a(!u50Var.Z.i(), true);
    }

    public static void f0(u50 u50Var, Canvas canvas, RectF rectF, Paint paint) {
        hi.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.uz.f() && (fVar = u50Var.f41820q0) != null) {
            fVar.e(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.T = false;
        this.S = false;
        this.f41801a0.clear();
        this.Z.b();
        this.f41803b0 = null;
        boolean z10 = this.R;
        int i13 = this.M;
        if (i13 == 2) {
            this.E = true;
        } else {
            this.E = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z11 = this.P;
        boolean z12 = this.O;
        boolean z13 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i13 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748302, null));
        } else if (z10) {
            if (this.H != 0) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131749509, null));
            }
        } else {
            int i14 = this.U;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750806, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754267, null));
                }
            } else if (z11) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750730, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748306, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748304, null));
                }
            } else {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (i13 == 0) {
                    i10 = 2131748290;
                } else {
                    i10 = 2131748303;
                }
                lVar.setTitle(org.telegram.messenger.dd.L0(i10, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 25));
        this.f41808f = new org.telegram.ui.Components.h10(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        m50 m50Var = new m50(this, context, this.currentAccount);
        this.h = m50Var;
        m50Var.setDelegate(new i50(this, 0));
        this.h.getSpansContainer().setOnClickListener(new j50(this, 1));
        m50 m50Var2 = this.h;
        this.Z = m50Var2.f28015b;
        this.f41801a0 = m50Var2.f28016c;
        w0();
        this.f41808f.f26635r.setOnEditorActionListener(new ha(this, 4));
        this.f41808f.f26635r.setOnKeyListener(new n50(0, this));
        this.f41808f.f26635r.addTextChangedListener(new n0(this, 8));
        ArrayList arrayList = this.f41812i0;
        if (arrayList != null) {
            u0(arrayList, this.f41813j0, this.f41814k0);
        }
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.f33280x = false;
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, zzVar, 1, null);
        this.f41823s = ew0Var;
        ew0Var.addView(zzVar);
        this.f41823s.e(true, false);
        this.f41823s.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.f41821r = new s4.a0(1, false);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f41816n = uk0Var;
        uk0Var.setFastScrollEnabled(0);
        this.f41816n.setEmptyView(this.f41823s);
        org.telegram.ui.Components.uk0 uk0Var2 = this.f41816n;
        s50 s50Var = new s50(this, context);
        this.f41827w = s50Var;
        uk0Var2.setAdapter(s50Var);
        this.f41816n.setLayoutManager(this.f41821r);
        this.f41816n.setVerticalScrollBarEnabled(false);
        this.f41816n.setClipToPadding(false);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f41816n;
        if (org.telegram.messenger.dd.X) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        uk0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.uk0 uk0Var4 = this.f41816n;
        float f7 = -this.f41800a;
        l0Var.addView(uk0Var4, w7.b6.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        l0Var.addView(this.f41823s);
        this.f41816n.setOnItemClickListener(new mg.q0(17, this, context));
        this.f41816n.setOnScrollListener(new h3(this, 14));
        org.telegram.ui.Components.uk0 uk0Var5 = this.f41816n;
        uk0Var5.W1 = true;
        uk0Var5.X1 = 0;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.D = f10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
            c2Var.f20204l = 180;
            c2Var.invalidateSelf();
            this.D.f26022c.setImageDrawable(c2Var);
        } else {
            f10Var.f26022c.setImageResource(2131231195);
        }
        if (!z13) {
            l0Var.addView(this.D, org.telegram.ui.Components.f10.b());
        }
        this.D.setOnClickListener(new j50(this, 2));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        if (z13) {
            this.F = new jg.a3(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, this.resourceProvider);
            this.F.addView(view, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.f16171p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
            this.F.addView(linearLayout, w7.b6.e(-1, -2, 87));
            vh.d dVar = new vh.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232619, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131749490, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.b6.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new j50(this, 3));
            vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(2131232621, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131749491, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new j50(this, 4));
            i12 = -1;
            l0Var.addView(this.F, w7.b6.e(-1, -2, 87));
            l0();
        } else {
            i12 = -1;
        }
        x0();
        ih.c cVar = new ih.c(this, context);
        this.d = cVar;
        l0Var.addView(cVar, w7.b6.e(i12, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f41808f, w7.b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.uk0 uk0Var6 = this.f41816n;
        Objects.requireNonNull(uk0Var6);
        this.f41822r0 = new tg.j(uk0Var6, l0Var, new l50(uk0Var6, 0));
        this.f41816n.D0(new k50(this, 3));
        kg.f0 f0Var = new kg.f0(context, this.parentLayout);
        this.e = f0Var;
        ((fe.b) f0Var.f11065c).a(false, false);
        l0Var.addView(this.e, w7.b6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33369h1.d.add(this);
        }
        View view2 = this.fragmentView;
        i50 i50Var = new i50(this, 3);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(view2, i50Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.O) {
            s50 s50Var = this.f41827w;
            if (s50Var != null) {
                s50Var.f();
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            if (this.f41816n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f41816n.getChildCount();
                int i12 = org.telegram.messenger.wp.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = this.f41816n.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.j4) {
                            ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.R) {
            removeSelfFromStack();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21078l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21097m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21117n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41823s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41823s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21022i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21040j7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41816n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21060k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41823s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41823s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21312y6));
        if (this.f41806d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        tg.f fVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f41819p0) != null) {
            int L = org.telegram.messenger.i0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(48.0f) + this.f41805c0;
            RectF rectF = this.f41825t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -L;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f41826u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f41804c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f41824s0);
            fVar.e(this.f41822r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.k0(boolean):boolean");
    }

    public final void l0() {
        int i10;
        jg.a3 a3Var = this.F;
        if (a3Var == null) {
            return;
        }
        float f7 = this.f41804c.e;
        a3Var.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(12.0f));
        this.F.setAlpha(f7);
        jg.a3 a3Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        a3Var2.setVisibility(i10);
    }

    @Override
    public final void m(r0.j1 j1Var) {
        this.f41817n0 = j1Var.f46143a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.f10 f10Var = this.D;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.m0, this.f41817n0));
        }
    }

    public final void n0() {
        if (this.f41816n.Y0()) {
            this.f41816n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f41800a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(i11 + 48) + ((int) this.f41802b.f7032f);
        int measuredWidth = this.f41816n.getMeasuredWidth();
        int z10 = org.telegram.messenger.m5.z(i11, this.f41816n.getMeasuredHeight(), (int) ((org.telegram.messenger.i0.L(76.0f) + i10) * this.f41804c.e));
        Rect rect = this.f41818o0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f41816n.setClipBounds(rect);
    }

    public final void o0() {
        int i10;
        int i11;
        if (this.Q) {
            i10 = org.telegram.messenger.i0.L(76.0f);
        } else {
            i10 = 0;
        }
        this.f41816n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(i11 + 48) + ((int) this.f41802b.f7032f), 0, org.telegram.messenger.i0.L(this.f41800a) + this.m0 + i10);
        this.f41823s.setPadding(0, 0, 0, this.m0);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!k0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (s20Var.D) {
            this.f41803b0 = null;
            this.h.c(s20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.s20 s20Var2 = this.f41803b0;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.f41803b0 = s20Var;
        s20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.O);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().c(this, org.telegram.messenger.at.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.O);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().n(this, org.telegram.messenger.at.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.h10 h10Var = this.f41808f;
            if (h10Var != null) {
                h10Var.updateColors();
            }
            org.telegram.ui.Components.f10 f10Var = this.D;
            if (f10Var != null) {
                f10Var.updateColors();
            }
            y0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0() {
        String L0;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f41816n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f41816n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) childAt;
                Object object = j4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19943id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19794id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j4Var.c(z11, true);
                        j4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j4Var.c(z10, true);
                        j4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        j4Var.c(true, false);
                        j4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j4Var.c(z12, true);
                        j4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                this.f41816n.getClass();
                if (RecyclerView.R(childAt) == this.f41827w.f41226w) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                    if (this.X == null && this.Z.i()) {
                        L0 = "";
                    } else {
                        L0 = org.telegram.messenger.dd.L0(2131751458, null);
                    }
                    z3Var.a(L0, new j50(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void r0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().Z1(Long.valueOf(this.Z.j(i11))));
        }
        p50 p50Var = this.f41829y;
        if (p50Var != null) {
            p50Var.g(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z10;
        int L;
        int L2;
        boolean i10 = this.Z.i();
        boolean z11 = this.R;
        int i11 = this.M;
        boolean z12 = false;
        if (!i10 || i11 == 2 || !z11) {
            long j10 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.dd.G(this.Z.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < this.Z.m(); i12++) {
                        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.Z.j(i12)));
                        if (Z1 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            sb2.append("**");
                        }
                    }
                    org.telegram.messenger.wp messagesController = getMessagesController();
                    if (j10 == 0) {
                        j10 = this.H;
                    }
                    TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
                    String str = "";
                    if (this.Z.m() > 5) {
                        int m10 = this.Z.m();
                        if (L0 != null) {
                            str = L0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.Z.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        x1Var.T = spannableStringBuilder;
                    } else {
                        if (L0 != null) {
                            str = L0.title;
                        }
                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754399, sb2, str));
                    }
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    if (!org.telegram.messenger.w3.T(L0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                        c2VarArr[0] = c2Var;
                        c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                        c2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            c2VarArr[0].e(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754393, org.telegram.messenger.i20.j(getMessagesController().Z1(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.dd.L0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.dd.X) {
                            L = org.telegram.messenger.i0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(8.0f);
                        }
                        if (org.telegram.messenger.dd.X) {
                            L2 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.i0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new t10(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754486, null), new qv(8, this, c2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    showDialog(x1Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < this.Z.m(); i13++) {
                    arrayList.add(getMessagesController().p1(getMessagesController().Z1(Long.valueOf(this.Z.j(i13)))));
                }
                org.telegram.messenger.wp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.g1(j10);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.rj(messagesController2, tL_channels_inviteToChannel, j10, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.at.f14786t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
                return true;
            } else if (this.E) {
                if (z11) {
                    r0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i14 = 0; i14 < this.Z.m(); i14++) {
                    arrayList2.add(Long.valueOf(this.Z.j(i14)));
                }
                if (!this.O && !this.P) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new b60(bundle2));
                    return true;
                }
                q50 q50Var = this.f41828x;
                if (q50Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    q50Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.s20 s20Var;
        org.telegram.ui.Components.s20 s20Var2;
        Object Z1;
        HashSet hashSet = this.f41809f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f41810g0 = z10;
        this.f41811h0 = z11;
        m50 m50Var = this.h;
        if (m50Var == null) {
            this.f41812i0 = arrayList;
            this.f41813j0 = z10;
            this.f41814k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.s20 s20Var3 = new org.telegram.ui.Components.s20(getParentActivity(), "premium");
            this.X = s20Var3;
            this.h.a(s20Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (s20Var = this.X) != null) {
            m50Var.c(s20Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.s20 s20Var4 = new org.telegram.ui.Components.s20(getParentActivity(), "miniApps");
            this.Y = s20Var4;
            this.h.a(s20Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (s20Var2 = this.Y) != null) {
            this.h.c(s20Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            if (longValue < 0) {
                Z1 = getMessagesController().L0(Long.valueOf(-longValue));
            } else {
                Z1 = getMessagesController().Z1(l4);
            }
            if (Z1 != null) {
                org.telegram.ui.Components.s20 s20Var5 = new org.telegram.ui.Components.s20(getParentActivity(), Z1);
                this.h.a(s20Var5);
                s20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.k10 k10Var = this.h.d;
        AnimatorSet animatorSet = k10Var.f27687a;
        if (animatorSet != null && animatorSet.isRunning()) {
            k10Var.f27687a.setupEndValues();
            k10Var.f27687a.cancel();
        }
        org.telegram.messenger.i0.a4(this.f41816n);
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.f41816n.getPaddingTop();
            o0();
            org.telegram.ui.Components.h10 h10Var = this.f41808f;
            fe.f fVar2 = this.f41802b;
            h10Var.setTranslationY(fVar2.f7032f);
            n0();
            this.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar2.f7032f);
            this.d.invalidate();
            int paddingTop2 = this.f41816n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((fe.b) this.e.f11065c).f7022f) {
                this.f41816n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            l0();
            n0();
        }
    }

    public final void v0(int i10) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.i0.K(this.f41816n, new org.telegram.ui.Components.qq(this, i10, 10));
    }

    public final void w0() {
        s50 s50Var;
        org.telegram.ui.ActionBar.n0 n0Var = this.f41808f.f26635r;
        if (n0Var == null) {
            return;
        }
        if (this.M == 2) {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131754396, null));
        } else if (!this.R && ((s50Var = this.f41827w) == null || s50Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    n0Var.setHint(org.telegram.messenger.dd.L0(2131748301, null));
                    return;
                } else {
                    n0Var.setHint(org.telegram.messenger.dd.L0(2131745612, null));
                    return;
                }
            }
            n0Var.setHint(org.telegram.messenger.dd.L0(2131745785, null));
        } else {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131745786, null));
        }
    }

    public final void x0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.dd.G(this.Z.m(), "Members", new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(org.telegram.messenger.dd.a0(null, null, 2131748634, org.telegram.messenger.dd.G(i12 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.dd.J0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z11) {
            if (this.E && this.f41801a0.isEmpty()) {
                this.D.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f41801a0.isEmpty()) {
                this.D.e(true, true);
                this.E = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.uk0 uk0Var = this.f41816n;
            if (uk0Var != null) {
                uk0Var.x1();
                if (this.f41816n.getFastScroll() != null) {
                    this.f41816n.getFastScroll().invalidate();
                }
            }
            m50 m50Var = this.h;
            if (m50Var != null && m50Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i10 = 0; i10 < spansContainer.getChildCount(); i10++) {
                    View childAt = spansContainer.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.s20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void s0(HashSet hashSet) {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
