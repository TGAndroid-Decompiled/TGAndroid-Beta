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
public class z40 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.c10 E;
    public boolean F;
    public di.d1 G;
    public final long H;
    public final long I;
    public TLRPC.ChatFull J;
    public a0.h K;
    public final int L;
    public String M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public org.telegram.ui.Components.p20 Y;
    public org.telegram.ui.Components.p20 Z;
    public final int f54400a;
    public a0.h f54401a0;
    public final te.c f54402b;
    public ArrayList f54403b0;
    public final te.a f54404c;
    public org.telegram.ui.Components.p20 f54405c0;
    public fi.u2 d;
    public int f54406d0;
    public hi.l5 f54407e;
    public org.telegram.ui.Components.yc0 f54408e0;
    public org.telegram.ui.Components.e10 f54409f;
    public boolean f54410f0;
    public final HashSet f54411g0;
    public r40 h;
    public boolean f54412h0;
    public boolean f54413i0;
    public ArrayList f54414j0;
    public boolean f54415k0;
    public boolean f54416l0;
    public int m0;
    public org.telegram.ui.Components.ek0 f54417n;
    public int f54418n0;
    public int f54419o0;
    public final Rect f54420p0;
    public final dh.g f54421q0;
    public v4.c0 f54422r;
    public final ui.f f54423r0;
    public org.telegram.ui.Components.nv0 f54424s;
    public dh.k f54425s0;
    public final ArrayList f54426t0;
    public final RectF f54427u0;
    public final RectF f54428v0;
    public x40 f54429w;
    public v40 f54430x;
    public u40 f54431y;

    public z40(Bundle bundle) {
        super(bundle);
        int i7;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f54400a = i7;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f54402b = new te.c(3, this, nrVar, 350L);
        this.f54404c = new te.a(4, this, nrVar, 350L, false);
        this.f54401a0 = new a0.h();
        this.f54403b0 = new ArrayList();
        this.f54411g0 = new HashSet();
        this.m0 = -4;
        this.f54420p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f54426t0 = arrayList;
        RectF rectF = new RectF();
        this.f54427u0 = rectF;
        RectF rectF2 = new RectF();
        this.f54428v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i12 = bundle.getInt("chatType", 0);
        this.N = i12;
        this.O = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.P = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.Q = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.R = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.S = z13;
        this.V = bundle.getInt("chatAddType", 0);
        this.W = bundle.getBoolean("allowPremium", false);
        this.X = bundle.getBoolean("allowMiniapps", false);
        this.H = bundle.getLong("chatId");
        this.I = bundle.getLong("channelId");
        if (!z10 && !z11 && !z13) {
            if (z12) {
                this.L = getMessagesController().S6 - 1;
            } else {
                org.telegram.messenger.mp messagesController = getMessagesController();
                if (i12 == 0) {
                    i10 = messagesController.f25625a3;
                } else {
                    i10 = messagesController.Z2;
                }
                this.L = i10;
            }
        } else {
            this.L = 0;
        }
        if (i11 >= 31) {
            this.f54421q0 = new dh.g(false);
            this.f54423r0 = new ui.f(null);
            return;
        }
        this.f54421q0 = null;
        this.f54423r0 = null;
    }

    public static void Z(z40 z40Var, Context context, View view, int i7) {
        long j3;
        String str;
        org.telegram.ui.Components.gc K;
        boolean z10;
        int i10 = z40Var.L;
        long j10 = z40Var.I;
        x40 x40Var = z40Var.f54429w;
        if (i7 == x40Var.f53603x) {
            int i11 = z40Var.currentAccount;
            org.telegram.ui.ActionBar.h6 h6Var = z40Var.resourceProvider;
            p40 p40Var = new p40(z40Var, 0);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            t1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22805b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bg.l0(i11, t1Var, context, h6Var, p40Var, 5));
        } else if (i7 == 0 && x40Var.G != 0 && !x40Var.f53599n) {
            TLRPC.ChatFull chatFull = z40Var.J;
            long j11 = z40Var.H;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, z40Var, chatFull, j11, z10);
            z40Var.f54408e0 = yc0Var;
            z40Var.showDialog(yc0Var);
        } else if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (i4Var.f30844r) {
                org.telegram.ui.Components.p20 p20Var = z40Var.Y;
                if (p20Var == null) {
                    org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(z40Var.f54409f.f34647r.getContext(), "premium");
                    z40Var.Y = p20Var2;
                    z40Var.h.a(p20Var2);
                    z40Var.Y.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(p20Var);
                    z40Var.Y = null;
                }
                z40Var.p0();
            } else if (i4Var.f30845s) {
                org.telegram.ui.Components.p20 p20Var3 = z40Var.Z;
                if (p20Var3 == null) {
                    org.telegram.ui.Components.p20 p20Var4 = new org.telegram.ui.Components.p20(z40Var.f54409f.f34647r.getContext(), "miniapps");
                    z40Var.Z = p20Var4;
                    z40Var.h.a(p20Var4);
                    z40Var.Z.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(p20Var3);
                    z40Var.Z = null;
                }
                z40Var.p0();
            } else {
                Object object = i4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f28580id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28431id;
                } else {
                    return;
                }
                a0.h hVar = z40Var.K;
                if (hVar == null || hVar.h(j3) < 0) {
                    if (i4Var.P) {
                        int i12 = -z40Var.m0;
                        z40Var.m0 = i12;
                        org.telegram.messenger.g0.E3(i12, i4Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        if (j3 >= 0) {
                            str = org.telegram.messenger.o10.q(org.telegram.messenger.mp.u1(z40Var.currentAccount).c2(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.mp.u1(z40Var.currentAccount).K3()) {
                            K = org.telegram.ui.Components.lc.b0(z40Var).Q(2131624217, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743517, str)));
                        } else {
                            K = org.telegram.ui.Components.lc.b0(z40Var).K(2131624217, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743517, str)), org.telegram.messenger.gd.N0(2131743516, null), new p40(z40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.p20 p20Var5 = (org.telegram.ui.Components.p20) z40Var.f54401a0.f(j3);
                    if (p20Var5 != null) {
                        z40Var.h.c(p20Var5);
                    } else if (i10 == 0 || z40Var.f54401a0.m() != i10) {
                        if (z40Var.N == 0 && z40Var.f54401a0.m() == z40Var.getMessagesController().Y2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z40Var.getParentActivity());
                            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28774a;
                            t1Var2.S = N0;
                            t1Var2.U = org.telegram.messenger.gd.N0(2131745098, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            z40Var.showDialog(t1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (z40Var.S && user.bot) {
                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.lc.b0(z40Var).t(org.telegram.messenger.gd.N0(2131753105, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat O0 = z40Var.getMessagesController().O0(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.v3.w(4, O0);
                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.f28774a;
                                    if (w10) {
                                        t1Var3.S = org.telegram.messenger.gd.N0(2131754458, null);
                                        t1Var3.U = org.telegram.messenger.gd.N0(2131754457, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131754463, null), new at(9, z40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                    } else {
                                        t1Var3.U = org.telegram.messenger.gd.N0(2131752554, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                                    }
                                    z40Var.showDialog(t1Var3);
                                    return;
                                }
                            }
                            z40Var.getMessagesController().e4(user, !z40Var.U, false);
                        } else if (object instanceof TLRPC.Chat) {
                            z40Var.getMessagesController().X3((TLRPC.Chat) object, !z40Var.U);
                        }
                        org.telegram.ui.Components.p20 p20Var6 = new org.telegram.ui.Components.p20(z40Var.f54409f.f34647r.getContext(), object);
                        z40Var.h.a(p20Var6);
                        p20Var6.setOnClickListener(z40Var);
                    } else {
                        return;
                    }
                    z40Var.x0();
                    if (!z40Var.U && !z40Var.T) {
                        z40Var.p0();
                    } else {
                        org.telegram.messenger.g0.I3(z40Var.f54409f.f34647r);
                    }
                    if (z40Var.f54409f.f34647r.length() > 0) {
                        z40Var.f54409f.f34647r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(z40 z40Var) {
        if (z40Var.G == null) {
            return;
        }
        z40Var.f54404c.a(!z40Var.f54401a0.i(), true);
    }

    public static void f0(z40 z40Var, Canvas canvas, RectF rectF, Paint paint) {
        ui.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.bz.f() && (fVar = z40Var.f54423r0) != null) {
            fVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.f54417n.getPaddingTop();
            o0();
            org.telegram.ui.Components.e10 e10Var = this.f54409f;
            te.c cVar2 = this.f54402b;
            e10Var.setTranslationY(cVar2.f57702f);
            n0();
            this.f54407e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f57702f);
            this.d.invalidate();
            int paddingTop2 = this.f54417n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((te.a) this.f54407e.f15003c).f57697f) {
                this.f54417n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i7 == 4) {
            l0();
            n0();
        }
    }

    @Override
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29770y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29560n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29398e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.U = false;
        this.T = false;
        this.f54403b0.clear();
        this.f54401a0.b();
        this.f54405c0 = null;
        boolean z10 = this.S;
        int i12 = this.N;
        if (i12 == 2) {
            this.F = true;
        } else {
            this.F = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.M);
        boolean z11 = this.Q;
        boolean z12 = this.P;
        boolean z13 = this.R;
        if (!isEmpty) {
            this.actionBar.setTitle(this.M);
        } else if (i12 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131752514, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748095, null));
        } else if (z10) {
            if (this.I != 0) {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131752514, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131749307, null));
            }
        } else {
            int i13 = this.V;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750793, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754266, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131754264, null));
                }
            } else if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750717, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748099, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748097, null));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i7 = 2131748080;
                } else {
                    i7 = 2131748096;
                }
                kVar.setTitle(org.telegram.messenger.gd.N0(i7, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 7));
        this.f54409f = new org.telegram.ui.Components.e10(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        r40 r40Var = new r40(this, context, this.currentAccount);
        this.h = r40Var;
        r40Var.setDelegate(new n40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new o40(this, 1));
        r40 r40Var2 = this.h;
        this.f54401a0 = r40Var2.f36356b;
        this.f54403b0 = r40Var2.f36357c;
        w0();
        this.f54409f.f34647r.setOnEditorActionListener(new fa(this, 4));
        this.f54409f.f34647r.setOnKeyListener(new s40(0, this));
        this.f54409f.f34647r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.f54414j0;
        if (arrayList != null) {
            u0(arrayList, this.f54415k0, this.f54416l0);
        }
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(6);
        yzVar.f42613x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.f54424s = nv0Var;
        nv0Var.addView(yzVar);
        this.f54424s.e(true, false);
        this.f54424s.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.f54422r = new v4.c0(1, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f54417n = ek0Var;
        ek0Var.setFastScrollEnabled(0);
        this.f54417n.setEmptyView(this.f54424s);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f54417n;
        x40 x40Var = new x40(this, context);
        this.f54429w = x40Var;
        ek0Var2.setAdapter(x40Var);
        this.f54417n.setLayoutManager(this.f54422r);
        this.f54417n.setVerticalScrollBarEnabled(false);
        this.f54417n.setClipToPadding(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f54417n;
        if (org.telegram.messenger.gd.f24241a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f54417n;
        float f10 = -this.f54400a;
        k0Var.addView(ek0Var4, c8.ma.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.f54424s);
        this.f54417n.setOnItemClickListener(new fi.g4(18, this, context));
        this.f54417n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.ek0 ek0Var5 = this.f54417n;
        ek0Var5.X1 = true;
        ek0Var5.Y1 = 0;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.E = c10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.f30253l = 180;
            x1Var.invalidateSelf();
            this.E.f33973c.setImageDrawable(x1Var);
        } else {
            c10Var.f33973c.setImageResource(2131231195);
        }
        if (!z13) {
            k0Var.addView(this.E, org.telegram.ui.Components.c10.b());
        }
        this.E.setOnClickListener(new o40(this, 2));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        if (z13) {
            this.G = new di.d1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29379d7, view, this.resourceProvider);
            this.G.addView(view, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.f24145p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, c8.ma.e(-1, -2, 87));
            hi.e eVar = new hi.e(context, this.resourceProvider, true);
            eVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(2131232624, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749288, null));
            eVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(eVar, c8.ma.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            eVar.setOnClickListener(new o40(this, 3));
            hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
            eVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(2131232626, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.N0(2131749289, null));
            eVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(eVar2, c8.ma.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            eVar2.setOnClickListener(new o40(this, 4));
            i11 = -1;
            k0Var.addView(this.G, c8.ma.e(-1, -2, 87));
            l0();
        } else {
            i11 = -1;
        }
        x0();
        fi.u2 u2Var = new fi.u2(this, context);
        this.d = u2Var;
        k0Var.addView(u2Var, c8.ma.e(i11, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f54409f, c8.ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.ek0 ek0Var6 = this.f54417n;
        Objects.requireNonNull(ek0Var6);
        this.f54425s0 = new dh.k(ek0Var6, k0Var, new q40(ek0Var6, 0));
        this.f54417n.D0(new p40(this, 3));
        hi.l5 l5Var = new hi.l5(context, this.parentLayout);
        this.f54407e = l5Var;
        ((te.a) l5Var.f15003c).a(false, false);
        k0Var.addView(this.f54407e, c8.ma.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43121g1.d.add(this);
        }
        View view2 = this.fragmentView;
        n40 n40Var = new n40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.a0.i(view2, n40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O) {
            x40 x40Var = this.f54429w;
            if (x40Var != null) {
                x40Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.f25205r) {
            if (this.f54417n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f54417n.getChildCount();
                int i11 = org.telegram.messenger.mp.I8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f54417n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.i4) {
                            ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.R) {
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
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29378d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29526l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29544m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29561n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54424s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29361c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54424s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29452h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29488j7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54417n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29508k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54424s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54424s.f37991e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29770y6));
        if (this.f54408e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        dh.g gVar;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f54421q0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f54406d0;
            RectF rectF = this.f54427u0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.G != null) {
                RectF rectF2 = this.f54428v0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.G != null && this.f54404c.f57696e > 0.0f) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f54426t0);
            gVar.e(this.f54425s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z40.k0(boolean):boolean");
    }

    public final void l0() {
        int i7;
        di.d1 d1Var = this.G;
        if (d1Var == null) {
            return;
        }
        float f10 = this.f54404c.f57696e;
        d1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.G.setAlpha(f10);
        di.d1 d1Var2 = this.G;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        d1Var2.setVisibility(i7);
    }

    @Override
    public final void m(r0.l1 l1Var) {
        this.f54419o0 = l1Var.f56299a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.c10 c10Var = this.E;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.f54418n0, this.f54419o0));
        }
    }

    public final void n0() {
        if (this.f54417n.Y0()) {
            this.f54417n.setClipBounds(null);
            return;
        }
        int i7 = this.f54418n0;
        int i10 = this.f54400a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f54402b.f57702f);
        int measuredWidth = this.f54417n.getMeasuredWidth();
        int z10 = org.telegram.messenger.f3.z(i10, this.f54417n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i7) * this.f54404c.f57696e));
        Rect rect = this.f54420p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f54417n.setClipBounds(rect);
    }

    public final void o0() {
        int i7;
        int i10;
        if (this.R) {
            i7 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i7 = 0;
        }
        this.f54417n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f54402b.f57702f), 0, org.telegram.messenger.g0.L(this.f54400a) + this.f54418n0 + i7);
        this.f54424s.setPadding(0, 0, 0, this.f54418n0);
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
        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) view;
        if (p20Var.E) {
            this.f54405c0 = null;
            this.h.c(p20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.p20 p20Var2 = this.f54405c0;
        if (p20Var2 != null) {
            p20Var2.a();
        }
        this.f54405c0 = p20Var;
        p20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.O);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25205r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.O);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25205r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.e10 e10Var = this.f54409f;
            if (e10Var != null) {
                e10Var.updateColors();
            }
            org.telegram.ui.Components.c10 c10Var = this.E;
            if (c10Var != null) {
                c10Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        String N0;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f54417n.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f54417n.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                Object object = i4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f28580id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28431id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i4Var.c(z11, true);
                        i4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Z != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i4Var.c(z10, true);
                        i4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.K;
                    if (hVar != null && hVar.h(j3) >= 0) {
                        i4Var.c(true, false);
                        i4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.f54401a0.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i4Var.c(z12, true);
                        i4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                this.f54417n.getClass();
                if (RecyclerView.R(childAt) == this.f54429w.f53602w) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (this.Y == null && this.f54401a0.i()) {
                        N0 = "";
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131751445, null);
                    }
                    y3Var.a(N0, new o40(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.f54401a0.m(); i7++) {
            hashSet.add(Long.valueOf(this.f54401a0.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f54401a0.m(); i10++) {
            arrayList.add(getMessagesController().c2(Long.valueOf(this.f54401a0.j(i10))));
        }
        u40 u40Var = this.f54431y;
        if (u40Var != null) {
            u40Var.i(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z10;
        int L;
        int L2;
        boolean i7 = this.f54401a0.i();
        boolean z11 = this.S;
        int i10 = this.N;
        boolean z12 = false;
        if (!i7 || i10 == 2 || !z11) {
            long j3 = this.H;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.gd.G(this.f54401a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.f54401a0.m(); i11++) {
                        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f54401a0.j(i11)));
                        if (c22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            sb2.append("**");
                        }
                    }
                    org.telegram.messenger.mp messagesController = getMessagesController();
                    if (j3 == 0) {
                        j3 = this.I;
                    }
                    TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
                    String str = "";
                    if (this.f54401a0.m() > 5) {
                        int m10 = this.f54401a0.m();
                        if (O0 != null) {
                            str = O0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.f54401a0.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        t1Var.U = spannableStringBuilder;
                    } else {
                        if (O0 != null) {
                            str = O0.title;
                        }
                        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754396, sb2, str));
                    }
                    org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                    if (!org.telegram.messenger.v3.T(O0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, getParentActivity(), this.resourceProvider);
                        d2VarArr[0] = d2Var;
                        d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                        d2VarArr[0].setMultiline(true);
                        if (this.f54401a0.m() == 1) {
                            d2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754390, org.telegram.messenger.o10.k(getMessagesController().c2(Long.valueOf(this.f54401a0.j(0))), true))), "", true, false, false);
                        } else {
                            d2VarArr[0].e(org.telegram.messenger.gd.N0(2131754395, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                        if (org.telegram.messenger.gd.f24241a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.gd.f24241a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        d2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(d2VarArr[0], c8.ma.o(-1, -2));
                        d2VarArr[0].setOnClickListener(new c10(d2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754483, null), new at(10, this, d2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    showDialog(t1Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < this.f54401a0.m(); i12++) {
                    arrayList.add(getMessagesController().s1(getMessagesController().c2(Long.valueOf(this.f54401a0.j(i12)))));
                }
                org.telegram.messenger.mp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.j1(j3);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.go(messagesController2, tL_channels_inviteToChannel, j3, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.ks.f25218t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new bn(bundle), true);
                return true;
            } else if (this.F) {
                if (z11) {
                    r0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < this.f54401a0.m(); i13++) {
                    arrayList2.add(Long.valueOf(this.f54401a0.j(i13)));
                }
                if (!this.P && !this.Q) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        jArr[i14] = ((Long) arrayList2.get(i14)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.O);
                    presentFragment(new f50(bundle2));
                    return true;
                }
                v40 v40Var = this.f54430x;
                if (v40Var != null) {
                    if (this.Y != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Z != null) {
                        z12 = true;
                    }
                    v40Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.p20 p20Var;
        org.telegram.ui.Components.p20 p20Var2;
        Object c22;
        HashSet hashSet = this.f54411g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f54412h0 = z10;
        this.f54413i0 = z11;
        r40 r40Var = this.h;
        if (r40Var == null) {
            this.f54414j0 = arrayList;
            this.f54415k0 = z10;
            this.f54416l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.p20 p20Var3 = new org.telegram.ui.Components.p20(getParentActivity(), "premium");
            this.Y = p20Var3;
            this.h.a(p20Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (p20Var = this.Y) != null) {
            r40Var.c(p20Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.p20 p20Var4 = new org.telegram.ui.Components.p20(getParentActivity(), "miniApps");
            this.Z = p20Var4;
            this.h.a(p20Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (p20Var2 = this.Z) != null) {
            this.h.c(p20Var2);
            this.Z = null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            if (longValue < 0) {
                c22 = getMessagesController().O0(Long.valueOf(-longValue));
            } else {
                c22 = getMessagesController().c2(l10);
            }
            if (c22 != null) {
                org.telegram.ui.Components.p20 p20Var5 = new org.telegram.ui.Components.p20(getParentActivity(), c22);
                this.h.a(p20Var5);
                p20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.i10 i10Var = this.h.d;
        AnimatorSet animatorSet = i10Var.f36112a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.f36112a.setupEndValues();
            i10Var.f36112a.cancel();
        }
        org.telegram.messenger.g0.Z3(this.f54417n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f54417n, new ii(this, i7, 21));
    }

    public final void w0() {
        x40 x40Var;
        ah.i iVar = this.f54409f.f34647r;
        if (iVar == null) {
            return;
        }
        if (this.N == 2) {
            iVar.setHint(org.telegram.messenger.gd.N0(2131754393, null));
        } else if (!this.S && ((x40Var = this.f54429w) == null || x40Var.H != 0)) {
            if (!this.P && !this.Q) {
                if (this.R) {
                    iVar.setHint(org.telegram.messenger.gd.N0(2131748094, null));
                    return;
                } else {
                    iVar.setHint(org.telegram.messenger.gd.N0(2131745399, null));
                    return;
                }
            }
            iVar.setHint(org.telegram.messenger.gd.N0(2131745572, null));
        } else {
            iVar.setHint(org.telegram.messenger.gd.N0(2131745573, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i7 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.gd.G(this.f54401a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.f54401a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131748426, org.telegram.messenger.gd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.gd.K0(this.f54401a0.m(), "MembersCountSelected"), Integer.valueOf(this.f54401a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 != 2 && z11) {
            if (this.F && this.f54403b0.isEmpty()) {
                this.E.e(false, true);
                this.F = false;
            } else if (!this.F && !this.f54403b0.isEmpty()) {
                this.E.e(true, true);
                this.F = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.ek0 ek0Var = this.f54417n;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.f54417n.getFastScroll() != null) {
                    this.f54417n.getFastScroll().invalidate();
                }
            }
            r40 r40Var = this.h;
            if (r40Var != null && r40Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                    View childAt = spansContainer.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.p20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void s0(HashSet hashSet) {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
