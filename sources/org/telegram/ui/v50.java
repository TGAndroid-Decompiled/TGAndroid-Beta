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
public class v50 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, fe.e, View.OnClickListener, hh.d {
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
    public final int f42605a;
    public ArrayList f42606a0;
    public final fe.f f42607b;
    public org.telegram.ui.Components.s20 f42608b0;
    public final fe.b f42609c;
    public int f42610c0;
    public ih.c d;
    public org.telegram.ui.Components.hd0 f42611d0;
    public kg.f0 e;
    public boolean f42612e0;
    public org.telegram.ui.Components.h10 f42613f;
    public final HashSet f42614f0;
    public boolean f42615g0;
    public n50 h;
    public boolean f42616h0;
    public ArrayList f42617i0;
    public boolean f42618j0;
    public boolean f42619k0;
    public int f42620l0;
    public int m0;
    public org.telegram.ui.Components.tk0 f42621n;
    public int f42622n0;
    public final Rect f42623o0;
    public final tg.f f42624p0;
    public final hi.f f42625q0;
    public s4.a0 f42626r;
    public tg.j f42627r0;
    public org.telegram.ui.Components.dw0 f42628s;
    public final ArrayList f42629s0;
    public final RectF f42630t0;
    public final RectF f42631u0;
    public t50 f42632w;
    public r50 f42633x;
    public q50 f42634y;

    public v50(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f42605a = i10;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f42607b = new fe.f(3, this, grVar, 350L);
        this.f42609c = new fe.b(4, this, grVar, 350L, false);
        this.Z = new a0.h();
        this.f42606a0 = new ArrayList();
        this.f42614f0 = new HashSet();
        this.f42620l0 = -4;
        this.f42623o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f42629s0 = arrayList;
        RectF rectF = new RectF();
        this.f42630t0 = rectF;
        RectF rectF2 = new RectF();
        this.f42631u0 = rectF2;
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
                org.telegram.messenger.vp messagesController = getMessagesController();
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
            this.f42624p0 = new tg.f(false);
            this.f42625q0 = new hi.f(null);
            return;
        }
        this.f42624p0 = null;
        this.f42625q0 = null;
    }

    public static void Y(v50 v50Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.wb K;
        boolean z10;
        int i11 = v50Var.K;
        long j11 = v50Var.H;
        t50 t50Var = v50Var.f42632w;
        if (i10 == t50Var.f41736x) {
            int i12 = v50Var.currentAccount;
            org.telegram.ui.ActionBar.p6 p6Var = v50Var.resourceProvider;
            l50 l50Var = new l50(v50Var, 0);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
            x1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f14519b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new q8(i12, x1Var, context, p6Var, l50Var, 0));
        } else if (i10 == 0 && t50Var.F != 0 && !t50Var.f41732n) {
            TLRPC.ChatFull chatFull = v50Var.I;
            long j12 = v50Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, v50Var, chatFull, j12, z10);
            v50Var.f42611d0 = hd0Var;
            v50Var.showDialog(hd0Var);
        } else if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (j4Var.f22079r) {
                org.telegram.ui.Components.s20 s20Var = v50Var.X;
                if (s20Var == null) {
                    org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(v50Var.f42613f.f26588r.getContext(), "premium");
                    v50Var.X = s20Var2;
                    v50Var.h.a(s20Var2);
                    v50Var.X.setOnClickListener(v50Var);
                } else {
                    v50Var.h.c(s20Var);
                    v50Var.X = null;
                }
                v50Var.o0();
            } else if (j4Var.f22080s) {
                org.telegram.ui.Components.s20 s20Var3 = v50Var.Y;
                if (s20Var3 == null) {
                    org.telegram.ui.Components.s20 s20Var4 = new org.telegram.ui.Components.s20(v50Var.f42613f.f26588r.getContext(), "miniapps");
                    v50Var.Y = s20Var4;
                    v50Var.h.a(s20Var4);
                    v50Var.Y.setOnClickListener(v50Var);
                } else {
                    v50Var.h.c(s20Var3);
                    v50Var.Y = null;
                }
                v50Var.o0();
            } else {
                Object object = j4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f19942id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19793id;
                } else {
                    return;
                }
                a0.h hVar = v50Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (j4Var.O) {
                        int i13 = -v50Var.f42620l0;
                        v50Var.f42620l0 = i13;
                        org.telegram.messenger.i0.F3(i13, j4Var, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        if (j10 >= 0) {
                            str = org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(v50Var.currentAccount).Z1(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.vp.r1(v50Var.currentAccount).A3()) {
                            K = org.telegram.ui.Components.cc.a0(v50Var).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)));
                        } else {
                            K = org.telegram.ui.Components.cc.a0(v50Var).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)), org.telegram.messenger.cd.L0(2131743785, null), new l50(v50Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.s20 s20Var5 = (org.telegram.ui.Components.s20) v50Var.Z.f(j10);
                    if (s20Var5 != null) {
                        v50Var.h.c(s20Var5);
                    } else if (i11 == 0 || v50Var.Z.m() != i11) {
                        if (v50Var.M == 0 && v50Var.Z.m() == v50Var.getMessagesController().V2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v50Var.getParentActivity());
                            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
                            x1Var2.R = L0;
                            x1Var2.T = org.telegram.messenger.cd.L0(2131745312, null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            v50Var.showDialog(x1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (v50Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.cc.a0(v50Var).t(org.telegram.messenger.cd.L0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat L02 = v50Var.getMessagesController().L0(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v50Var.getParentActivity());
                                    boolean w9 = org.telegram.messenger.w3.w(4, L02);
                                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.f20134a;
                                    if (w9) {
                                        x1Var3.R = org.telegram.messenger.cd.L0(2131754461, null);
                                        x1Var3.T = org.telegram.messenger.cd.L0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754466, null), new rv(7, v50Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    } else {
                                        x1Var3.T = org.telegram.messenger.cd.L0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    }
                                    v50Var.showDialog(x1Var3);
                                    return;
                                }
                            }
                            v50Var.getMessagesController().U3(user, !v50Var.T, false);
                        } else if (object instanceof TLRPC.Chat) {
                            v50Var.getMessagesController().N3((TLRPC.Chat) object, !v50Var.T);
                        }
                        org.telegram.ui.Components.s20 s20Var6 = new org.telegram.ui.Components.s20(v50Var.f42613f.f26588r.getContext(), object);
                        v50Var.h.a(s20Var6);
                        s20Var6.setOnClickListener(v50Var);
                    } else {
                        return;
                    }
                    v50Var.w0();
                    if (!v50Var.T && !v50Var.S) {
                        v50Var.o0();
                    } else {
                        org.telegram.messenger.i0.J3(v50Var.f42613f.f26588r);
                    }
                    if (v50Var.f42613f.f26588r.length() > 0) {
                        v50Var.f42613f.f26588r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void d0(v50 v50Var) {
        if (v50Var.F == null) {
            return;
        }
        v50Var.f42609c.a(!v50Var.Z.i(), true);
    }

    public static void e0(v50 v50Var, Canvas canvas, RectF rectF, Paint paint) {
        hi.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.tz.f() && (fVar = v50Var.f42625q0) != null) {
            fVar.e(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final View R() {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return j0(true);
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
        this.f42606a0.clear();
        this.Z.b();
        this.f42608b0 = null;
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
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748302, null));
        } else if (z10) {
            if (this.H != 0) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131749509, null));
            }
        } else {
            int i14 = this.U;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750806, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131754267, null));
                }
            } else if (z11) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750730, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748306, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748304, null));
                }
            } else {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (i13 == 0) {
                    i10 = 2131748290;
                } else {
                    i10 = 2131748303;
                }
                lVar.setTitle(org.telegram.messenger.cd.L0(i10, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 25));
        this.f42613f = new org.telegram.ui.Components.h10(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        n50 n50Var = new n50(this, context, this.currentAccount);
        this.h = n50Var;
        n50Var.setDelegate(new j50(this, 0));
        this.h.getSpansContainer().setOnClickListener(new k50(this, 1));
        n50 n50Var2 = this.h;
        this.Z = n50Var2.f27965b;
        this.f42606a0 = n50Var2.f27966c;
        v0();
        this.f42613f.f26588r.setOnEditorActionListener(new ha(this, 4));
        this.f42613f.f26588r.setOnKeyListener(new o50(0, this));
        this.f42613f.f26588r.addTextChangedListener(new n0(this, 8));
        ArrayList arrayList = this.f42617i0;
        if (arrayList != null) {
            t0(arrayList, this.f42618j0, this.f42619k0);
        }
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.f33274x = false;
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, zzVar, 1, null);
        this.f42628s = dw0Var;
        dw0Var.addView(zzVar);
        this.f42628s.e(true, false);
        this.f42628s.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.f42626r = new s4.a0(1, false);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f42621n = tk0Var;
        tk0Var.setFastScrollEnabled(0);
        this.f42621n.setEmptyView(this.f42628s);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f42621n;
        t50 t50Var = new t50(this, context);
        this.f42632w = t50Var;
        tk0Var2.setAdapter(t50Var);
        this.f42621n.setLayoutManager(this.f42626r);
        this.f42621n.setVerticalScrollBarEnabled(false);
        this.f42621n.setClipToPadding(false);
        org.telegram.ui.Components.tk0 tk0Var3 = this.f42621n;
        if (org.telegram.messenger.cd.X) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        tk0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.tk0 tk0Var4 = this.f42621n;
        float f7 = -this.f42605a;
        l0Var.addView(tk0Var4, w7.b6.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        l0Var.addView(this.f42628s);
        this.f42621n.setOnItemClickListener(new mg.q0(17, this, context));
        this.f42621n.setOnScrollListener(new h3(this, 14));
        org.telegram.ui.Components.tk0 tk0Var5 = this.f42621n;
        tk0Var5.W1 = true;
        tk0Var5.X1 = 0;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.D = f10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
            c2Var.f20203l = 180;
            c2Var.invalidateSelf();
            this.D.f25929c.setImageDrawable(c2Var);
        } else {
            f10Var.f25929c.setImageResource(2131231195);
        }
        if (!z13) {
            l0Var.addView(this.D, org.telegram.ui.Components.f10.b());
        }
        this.D.setOnClickListener(new k50(this, 2));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        if (z13) {
            this.F = new jg.a3(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d7, view, this.resourceProvider);
            this.F.addView(view, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.f16025p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
            this.F.addView(linearLayout, w7.b6.e(-1, -2, 87));
            vh.d dVar = new vh.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232619, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131749490, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.b6.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new k50(this, 3));
            vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(2131232621, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131749491, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new k50(this, 4));
            i12 = -1;
            l0Var.addView(this.F, w7.b6.e(-1, -2, 87));
            k0();
        } else {
            i12 = -1;
        }
        w0();
        ih.c cVar = new ih.c(this, context);
        this.d = cVar;
        l0Var.addView(cVar, w7.b6.e(i12, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f42613f, w7.b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.tk0 tk0Var6 = this.f42621n;
        Objects.requireNonNull(tk0Var6);
        this.f42627r0 = new tg.j(tk0Var6, l0Var, new m50(tk0Var6, 0));
        this.f42621n.D0(new l50(this, 3));
        kg.f0 f0Var = new kg.f0(context, this.parentLayout);
        this.e = f0Var;
        ((fe.b) f0Var.f11064c).a(false, false);
        l0Var.addView(this.e, w7.b6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33362h1.d.add(this);
        }
        View view2 = this.fragmentView;
        j50 j50Var = new j50(this, 3);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(view2, j50Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.O) {
            t50 t50Var = this.f42632w;
            if (t50Var != null) {
                t50Var.f();
            }
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            if (this.f42621n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f42621n.getChildCount();
                int i12 = org.telegram.messenger.vp.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = this.f42621n.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.j4) {
                            ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.R) {
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
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21096m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21116n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42628s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42628s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21021i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21039j7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42621n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42628s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42628s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21311y6));
        if (this.f42611d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void i0() {
        tg.f fVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f42624p0) != null) {
            int L = org.telegram.messenger.i0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(48.0f) + this.f42610c0;
            RectF rectF = this.f42630t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -L;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f42631u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f42609c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f42629s0);
            fVar.e(this.f42627r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.j0(boolean):boolean");
    }

    public final void k0() {
        int i10;
        jg.a3 a3Var = this.F;
        if (a3Var == null) {
            return;
        }
        float f7 = this.f42609c.e;
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
    public final void l(r0.j1 j1Var) {
        this.f42622n0 = j1Var.f46132a.f(8).d;
        l0();
    }

    public final void l0() {
        org.telegram.ui.Components.f10 f10Var = this.D;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.m0, this.f42622n0));
        }
    }

    public final void m0() {
        if (this.f42621n.Y0()) {
            this.f42621n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f42605a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(i11 + 48) + ((int) this.f42607b.f7031f);
        int measuredWidth = this.f42621n.getMeasuredWidth();
        int z10 = org.telegram.messenger.m5.z(i11, this.f42621n.getMeasuredHeight(), (int) ((org.telegram.messenger.i0.L(76.0f) + i10) * this.f42609c.e));
        Rect rect = this.f42623o0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f42621n.setClipBounds(rect);
    }

    public final void n0() {
        int i10;
        int i11;
        if (this.Q) {
            i10 = org.telegram.messenger.i0.L(76.0f);
        } else {
            i10 = 0;
        }
        this.f42621n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(i11 + 48) + ((int) this.f42607b.f7031f), 0, org.telegram.messenger.i0.L(this.f42605a) + this.m0 + i10);
        this.f42628s.setPadding(0, 0, 0, this.m0);
    }

    public final void o0() {
        String L0;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f42621n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f42621n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) childAt;
                Object object = j4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19942id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19793id;
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
                this.f42621n.getClass();
                if (RecyclerView.R(childAt) == this.f42632w.f41735w) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                    if (this.X == null && this.Z.i()) {
                        L0 = "";
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131751458, null);
                    }
                    z3Var.a(L0, new k50(this, 0));
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!j0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (s20Var.D) {
            this.f42608b0 = null;
            this.h.c(s20Var);
            w0();
            o0();
            return;
        }
        org.telegram.ui.Components.s20 s20Var2 = this.f42608b0;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.f42608b0 = s20Var;
        s20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.O);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().c(this, org.telegram.messenger.zs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.O);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.h10 h10Var = this.f42613f;
            if (h10Var != null) {
                h10Var.updateColors();
            }
            org.telegram.ui.Components.f10 f10Var = this.D;
            if (f10Var != null) {
                f10Var.updateColors();
            }
            x0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final HashSet p0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void q0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().Z1(Long.valueOf(this.Z.j(i11))));
        }
        q50 q50Var = this.f42634y;
        if (q50Var != null) {
            q50Var.g(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean s0() {
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
                    String G = org.telegram.messenger.cd.G(this.Z.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
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
                    org.telegram.messenger.vp messagesController = getMessagesController();
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
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.Z.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        x1Var.T = spannableStringBuilder;
                    } else {
                        if (L0 != null) {
                            str = L0.title;
                        }
                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754399, sb2, str));
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
                            c2VarArr[0].e(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754393, org.telegram.messenger.h20.j(getMessagesController().Z1(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.cd.L0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.cd.X) {
                            L = org.telegram.messenger.i0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(8.0f);
                        }
                        if (org.telegram.messenger.cd.X) {
                            L2 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.i0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new u10(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754486, null), new rv(8, this, c2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    showDialog(x1Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < this.Z.m(); i13++) {
                    arrayList.add(getMessagesController().p1(getMessagesController().Z1(Long.valueOf(this.Z.j(i13)))));
                }
                org.telegram.messenger.vp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.g1(j10);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.qj(messagesController2, tL_channels_inviteToChannel, j10, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.zs.f19690t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
                return true;
            } else if (this.E) {
                if (z11) {
                    q0(0);
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
                    presentFragment(new c60(bundle2));
                    return true;
                }
                r50 r50Var = this.f42633x;
                if (r50Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    r50Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void t0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.s20 s20Var;
        org.telegram.ui.Components.s20 s20Var2;
        Object Z1;
        HashSet hashSet = this.f42614f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f42615g0 = z10;
        this.f42616h0 = z11;
        n50 n50Var = this.h;
        if (n50Var == null) {
            this.f42617i0 = arrayList;
            this.f42618j0 = z10;
            this.f42619k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.s20 s20Var3 = new org.telegram.ui.Components.s20(getParentActivity(), "premium");
            this.X = s20Var3;
            this.h.a(s20Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (s20Var = this.X) != null) {
            n50Var.c(s20Var);
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
        AnimatorSet animatorSet = k10Var.f27599a;
        if (animatorSet != null && animatorSet.isRunning()) {
            k10Var.f27599a.setupEndValues();
            k10Var.f27599a.cancel();
        }
        org.telegram.messenger.i0.a4(this.f42621n);
    }

    public final void u0(int i10) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.i0.K(this.f42621n, new org.telegram.ui.Components.qq(this, i10, 10));
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.f42621n.getPaddingTop();
            n0();
            org.telegram.ui.Components.h10 h10Var = this.f42613f;
            fe.f fVar2 = this.f42607b;
            h10Var.setTranslationY(fVar2.f7031f);
            m0();
            this.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar2.f7031f);
            this.d.invalidate();
            int paddingTop2 = this.f42621n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((fe.b) this.e.f11064c).f7021f) {
                this.f42621n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            k0();
            m0();
        }
    }

    public final void v0() {
        t50 t50Var;
        org.telegram.ui.ActionBar.n0 n0Var = this.f42613f.f26588r;
        if (n0Var == null) {
            return;
        }
        if (this.M == 2) {
            n0Var.setHint(org.telegram.messenger.cd.L0(2131754396, null));
        } else if (!this.R && ((t50Var = this.f42632w) == null || t50Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    n0Var.setHint(org.telegram.messenger.cd.L0(2131748301, null));
                    return;
                } else {
                    n0Var.setHint(org.telegram.messenger.cd.L0(2131745612, null));
                    return;
                }
            }
            n0Var.setHint(org.telegram.messenger.cd.L0(2131745785, null));
        } else {
            n0Var.setHint(org.telegram.messenger.cd.L0(2131745786, null));
        }
    }

    public final void w0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.cd.G(this.Z.m(), "Members", new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(org.telegram.messenger.cd.a0(null, null, 2131748634, org.telegram.messenger.cd.G(i12 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.cd.J0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z11) {
            if (this.E && this.f42606a0.isEmpty()) {
                this.D.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f42606a0.isEmpty()) {
                this.D.e(true, true);
                this.E = true;
            }
        }
    }

    public final void x0() {
        try {
            org.telegram.ui.Components.tk0 tk0Var = this.f42621n;
            if (tk0Var != null) {
                tk0Var.x1();
                if (this.f42621n.getFastScroll() != null) {
                    this.f42621n.getFastScroll().invalidate();
                }
            }
            n50 n50Var = this.h;
            if (n50Var != null && n50Var.getSpansContainer() != null) {
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

    public void r0(HashSet hashSet) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
