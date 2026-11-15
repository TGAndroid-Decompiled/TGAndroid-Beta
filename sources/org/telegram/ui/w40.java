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
public class w40 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.t00 E;
    public boolean F;
    public di.e1 G;
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
    public org.telegram.ui.Components.f20 Y;
    public org.telegram.ui.Components.f20 Z;
    public final int f52401a;
    public a0.h f52402a0;
    public final te.c f52403b;
    public ArrayList f52404b0;
    public final te.a f52405c;
    public org.telegram.ui.Components.f20 f52406c0;
    public fi.w2 d;
    public int f52407d0;
    public hi.n5 f52408e;
    public org.telegram.ui.Components.nc0 f52409e0;
    public org.telegram.ui.Components.v00 f52410f;
    public boolean f52411f0;
    public final HashSet f52412g0;
    public o40 h;
    public boolean f52413h0;
    public boolean f52414i0;
    public ArrayList f52415j0;
    public boolean f52416k0;
    public boolean f52417l0;
    public int m0;
    public org.telegram.ui.Components.uj0 f52418n;
    public int f52419n0;
    public int f52420o0;
    public final Rect f52421p0;
    public final dh.g f52422q0;
    public v4.b0 f52423r;
    public final ui.f f52424r0;
    public org.telegram.ui.Components.cv0 f52425s;
    public dh.k f52426s0;
    public final ArrayList f52427t0;
    public final RectF f52428u0;
    public final RectF f52429v0;
    public u40 f52430w;
    public s40 f52431x;
    public r40 f52432y;

    public w40(Bundle bundle) {
        super(bundle);
        int i7;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f52401a = i7;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f52403b = new te.c(3, this, erVar, 350L);
        this.f52405c = new te.a(4, this, erVar, 350L, false);
        this.f52402a0 = new a0.h();
        this.f52404b0 = new ArrayList();
        this.f52412g0 = new HashSet();
        this.m0 = -4;
        this.f52421p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f52427t0 = arrayList;
        RectF rectF = new RectF();
        this.f52428u0 = rectF;
        RectF rectF2 = new RectF();
        this.f52429v0 = rectF2;
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
                this.L = getMessagesController().Q6 - 1;
            } else {
                org.telegram.messenger.np messagesController = getMessagesController();
                if (i12 == 0) {
                    i10 = messagesController.Y2;
                } else {
                    i10 = messagesController.X2;
                }
                this.L = i10;
            }
        } else {
            this.L = 0;
        }
        if (i11 >= 31) {
            this.f52422q0 = new dh.g(false);
            this.f52424r0 = new ui.f(null);
            return;
        }
        this.f52422q0 = null;
        this.f52424r0 = null;
    }

    public static void Z(w40 w40Var, Context context, View view, int i7) {
        long j3;
        String str;
        org.telegram.ui.Components.xb K;
        boolean z10;
        int i10 = w40Var.L;
        long j10 = w40Var.I;
        u40 u40Var = w40Var.f52430w;
        if (i7 == u40Var.f51741x) {
            int i11 = w40Var.currentAccount;
            org.telegram.ui.ActionBar.e6 e6Var = w40Var.resourceProvider;
            m40 m40Var = new m40(w40Var, 0);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            t1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22414b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bg.k0(i11, t1Var, context, e6Var, m40Var, 5));
        } else if (i7 == 0 && u40Var.G != 0 && !u40Var.f51737n) {
            TLRPC.ChatFull chatFull = w40Var.J;
            long j11 = w40Var.H;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.nc0 nc0Var = new org.telegram.ui.Components.nc0(context, w40Var, chatFull, j11, z10);
            w40Var.f52409e0 = nc0Var;
            w40Var.showDialog(nc0Var);
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.f30391r) {
                org.telegram.ui.Components.f20 f20Var = w40Var.Y;
                if (f20Var == null) {
                    org.telegram.ui.Components.f20 f20Var2 = new org.telegram.ui.Components.f20(w40Var.f52410f.f40202r.getContext(), "premium");
                    w40Var.Y = f20Var2;
                    w40Var.h.a(f20Var2);
                    w40Var.Y.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(f20Var);
                    w40Var.Y = null;
                }
                w40Var.p0();
            } else if (h4Var.f30392s) {
                org.telegram.ui.Components.f20 f20Var3 = w40Var.Z;
                if (f20Var3 == null) {
                    org.telegram.ui.Components.f20 f20Var4 = new org.telegram.ui.Components.f20(w40Var.f52410f.f40202r.getContext(), "miniapps");
                    w40Var.Z = f20Var4;
                    w40Var.h.a(f20Var4);
                    w40Var.Z.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(f20Var3);
                    w40Var.Z = null;
                }
                w40Var.p0();
            } else {
                Object object = h4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f28200id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28051id;
                } else {
                    return;
                }
                a0.h hVar = w40Var.K;
                if (hVar == null || hVar.h(j3) < 0) {
                    if (h4Var.P) {
                        int i12 = -w40Var.m0;
                        w40Var.m0 = i12;
                        org.telegram.messenger.g0.F3(i12, h4Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        if (j3 >= 0) {
                            str = org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(w40Var.currentAccount).a2(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.np.s1(w40Var.currentAccount).D3()) {
                            K = org.telegram.ui.Components.cc.a0(w40Var).Q(2131624217, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)));
                        } else {
                            K = org.telegram.ui.Components.cc.a0(w40Var).K(2131624217, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)), org.telegram.messenger.hd.M0(2131743759, null), new m40(w40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.f20 f20Var5 = (org.telegram.ui.Components.f20) w40Var.f52402a0.f(j3);
                    if (f20Var5 != null) {
                        w40Var.h.c(f20Var5);
                    } else if (i10 == 0 || w40Var.f52402a0.m() != i10) {
                        if (w40Var.N == 0 && w40Var.f52402a0.m() == w40Var.getMessagesController().W2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w40Var.getParentActivity());
                            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                            t1Var2.S = M0;
                            t1Var2.U = org.telegram.messenger.hd.M0(2131745294, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                            w40Var.showDialog(t1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (w40Var.S && user.bot) {
                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.cc.a0(w40Var).t(org.telegram.messenger.hd.M0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat M02 = w40Var.getMessagesController().M0(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.f28392a;
                                    if (w10) {
                                        t1Var3.S = org.telegram.messenger.hd.M0(2131754461, null);
                                        t1Var3.U = org.telegram.messenger.hd.M0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754466, null), new tr(10, w40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    } else {
                                        t1Var3.U = org.telegram.messenger.hd.M0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    }
                                    w40Var.showDialog(t1Var3);
                                    return;
                                }
                            }
                            w40Var.getMessagesController().X3(user, !w40Var.U, false);
                        } else if (object instanceof TLRPC.Chat) {
                            w40Var.getMessagesController().Q3((TLRPC.Chat) object, !w40Var.U);
                        }
                        org.telegram.ui.Components.f20 f20Var6 = new org.telegram.ui.Components.f20(w40Var.f52410f.f40202r.getContext(), object);
                        w40Var.h.a(f20Var6);
                        f20Var6.setOnClickListener(w40Var);
                    } else {
                        return;
                    }
                    w40Var.x0();
                    if (!w40Var.U && !w40Var.T) {
                        w40Var.p0();
                    } else {
                        org.telegram.messenger.g0.J3(w40Var.f52410f.f40202r);
                    }
                    if (w40Var.f52410f.f40202r.length() > 0) {
                        w40Var.f52410f.f40202r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(w40 w40Var) {
        if (w40Var.G == null) {
            return;
        }
        w40Var.f52405c.a(!w40Var.f52402a0.i(), true);
    }

    public static void f0(w40 w40Var, Canvas canvas, RectF rectF, Paint paint) {
        ui.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.gz.f() && (fVar = w40Var.f52424r0) != null) {
            fVar.b0(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.f52418n.getPaddingTop();
            o0();
            org.telegram.ui.Components.v00 v00Var = this.f52410f;
            te.c cVar2 = this.f52403b;
            v00Var.setTranslationY(cVar2.f57091f);
            n0();
            this.f52408e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f57091f);
            this.d.invalidate();
            int paddingTop2 = this.f52418n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((te.a) this.f52408e.f14762c).f57086f) {
                this.f52418n.scrollBy(0, paddingTop - paddingTop2);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
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
        this.f52404b0.clear();
        this.f52402a0.b();
        this.f52406c0 = null;
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
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748288, null));
        } else if (z10) {
            if (this.I != 0) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131749500, null));
            }
        } else {
            int i13 = this.V;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750805, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754267, null));
                }
            } else if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750729, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748292, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748290, null));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i7 = 2131748273;
                } else {
                    i7 = 2131748289;
                }
                kVar.setTitle(org.telegram.messenger.hd.M0(i7, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 5));
        this.f52410f = new org.telegram.ui.Components.v00(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        o40 o40Var = new o40(this, context, this.currentAccount);
        this.h = o40Var;
        o40Var.setDelegate(new k40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new l40(this, 1));
        o40 o40Var2 = this.h;
        this.f52402a0 = o40Var2.f42203b;
        this.f52404b0 = o40Var2.f42204c;
        w0();
        this.f52410f.f40202r.setOnEditorActionListener(new fa(this, 4));
        this.f52410f.f40202r.setOnKeyListener(new p40(0, this));
        this.f52410f.f40202r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.f52415j0;
        if (arrayList != null) {
            u0(arrayList, this.f52416k0, this.f52417l0);
        }
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(6);
        pzVar.f38448x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, pzVar, 1, null);
        this.f52425s = cv0Var;
        cv0Var.addView(pzVar);
        this.f52425s.e(true, false);
        this.f52425s.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.f52423r = new v4.b0(1, false);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f52418n = uj0Var;
        uj0Var.setFastScrollEnabled(0);
        this.f52418n.setEmptyView(this.f52425s);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f52418n;
        u40 u40Var = new u40(this, context);
        this.f52430w = u40Var;
        uj0Var2.setAdapter(u40Var);
        this.f52418n.setLayoutManager(this.f52423r);
        this.f52418n.setVerticalScrollBarEnabled(false);
        this.f52418n.setClipToPadding(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f52418n;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        uj0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.uj0 uj0Var4 = this.f52418n;
        float f10 = -this.f52401a;
        k0Var.addView(uj0Var4, c8.ja.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.f52425s);
        this.f52418n.setOnItemClickListener(new fi.i4(18, this, context));
        this.f52418n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.uj0 uj0Var5 = this.f52418n;
        uj0Var5.X1 = true;
        uj0Var5.Y1 = 0;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.E = t00Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.f29865l = 180;
            x1Var.invalidateSelf();
            this.E.f39465c.setImageDrawable(x1Var);
        } else {
            t00Var.f39465c.setImageResource(2131231195);
        }
        if (!z13) {
            k0Var.addView(this.E, org.telegram.ui.Components.t00.b());
        }
        this.E.setOnClickListener(new l40(this, 2));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        if (z13) {
            this.G = new di.e1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, this.resourceProvider);
            this.G.addView(view, c8.ja.d(-1, 1.0f / org.telegram.messenger.g0.f23610p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, c8.ja.e(-1, -2, 87));
            hi.d dVar = new hi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232623, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749481, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, c8.ja.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new l40(this, 3));
            hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(2131232625, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749482, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, c8.ja.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new l40(this, 4));
            i11 = -1;
            k0Var.addView(this.G, c8.ja.e(-1, -2, 87));
            l0();
        } else {
            i11 = -1;
        }
        x0();
        fi.w2 w2Var = new fi.w2(this, context);
        this.d = w2Var;
        k0Var.addView(w2Var, c8.ja.e(i11, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f52410f, c8.ja.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.uj0 uj0Var6 = this.f52418n;
        Objects.requireNonNull(uj0Var6);
        this.f52426s0 = new dh.k(uj0Var6, k0Var, new n40(uj0Var6, 0));
        this.f52418n.D0(new m40(this, 3));
        hi.n5 n5Var = new hi.n5(context, this.parentLayout);
        this.f52408e = n5Var;
        ((te.a) n5Var.f14762c).a(false, false);
        k0Var.addView(this.f52408e, c8.ja.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f42635g1.d.add(this);
        }
        View view2 = this.fragmentView;
        k40 k40Var = new k40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(view2, k40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.O) {
            u40 u40Var = this.f52430w;
            if (u40Var != null) {
                u40Var.f();
            }
        } else if (i7 == org.telegram.messenger.ns.f25560r) {
            if (this.f52418n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f52418n.getChildCount();
                int i11 = org.telegram.messenger.np.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f52418n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.R) {
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
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52425s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52425s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28959j7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52418n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52425s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52425s.f33709e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29241y6));
        if (this.f52409e0 != null) {
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f52422q0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f52407d0;
            RectF rectF = this.f52428u0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.G != null) {
                RectF rectF2 = this.f52429v0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.G != null && this.f52405c.f57085e > 0.0f) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f52427t0);
            gVar.e(this.f52426s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w40.k0(boolean):boolean");
    }

    public final void l0() {
        int i7;
        di.e1 e1Var = this.G;
        if (e1Var == null) {
            return;
        }
        float f10 = this.f52405c.f57085e;
        e1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.G.setAlpha(f10);
        di.e1 e1Var2 = this.G;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        e1Var2.setVisibility(i7);
    }

    @Override
    public final void m(r0.k1 k1Var) {
        this.f52420o0 = k1Var.f55682a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.t00 t00Var = this.E;
        if (t00Var != null) {
            t00Var.setTranslationY(-Math.max(this.f52419n0, this.f52420o0));
        }
    }

    public final void n0() {
        if (this.f52418n.Y0()) {
            this.f52418n.setClipBounds(null);
            return;
        }
        int i7 = this.f52419n0;
        int i10 = this.f52401a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f52403b.f57091f);
        int measuredWidth = this.f52418n.getMeasuredWidth();
        int z10 = org.telegram.messenger.k5.z(i10, this.f52418n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i7) * this.f52405c.f57085e));
        Rect rect = this.f52421p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f52418n.setClipBounds(rect);
    }

    public final void o0() {
        int i7;
        int i10;
        if (this.R) {
            i7 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i7 = 0;
        }
        this.f52418n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f52403b.f57091f), 0, org.telegram.messenger.g0.L(this.f52401a) + this.f52419n0 + i7);
        this.f52425s.setPadding(0, 0, 0, this.f52419n0);
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
        org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) view;
        if (f20Var.E) {
            this.f52406c0 = null;
            this.h.c(f20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.f20 f20Var2 = this.f52406c0;
        if (f20Var2 != null) {
            f20Var2.a();
        }
        this.f52406c0 = f20Var;
        f20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.O);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25560r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.O);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25560r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.v00 v00Var = this.f52410f;
            if (v00Var != null) {
                v00Var.updateColors();
            }
            org.telegram.ui.Components.t00 t00Var = this.E;
            if (t00Var != null) {
                t00Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        String M0;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f52418n.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f52418n.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f28200id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28051id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h4Var.c(z11, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Z != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h4Var.c(z10, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.K;
                    if (hVar != null && hVar.h(j3) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.f52402a0.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h4Var.c(z12, true);
                        h4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.f52418n.getClass();
                if (RecyclerView.R(childAt) == this.f52430w.f51740w) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                    if (this.Y == null && this.f52402a0.i()) {
                        M0 = "";
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131751457, null);
                    }
                    x3Var.a(M0, new l40(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.f52402a0.m(); i7++) {
            hashSet.add(Long.valueOf(this.f52402a0.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f52402a0.m(); i10++) {
            arrayList.add(getMessagesController().a2(Long.valueOf(this.f52402a0.j(i10))));
        }
        r40 r40Var = this.f52432y;
        if (r40Var != null) {
            r40Var.i(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z10;
        int L;
        int L2;
        boolean i7 = this.f52402a0.i();
        boolean z11 = this.S;
        int i10 = this.N;
        boolean z12 = false;
        if (!i7 || i10 == 2 || !z11) {
            long j3 = this.H;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.hd.G(this.f52402a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.f52402a0.m(); i11++) {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f52402a0.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    org.telegram.messenger.np messagesController = getMessagesController();
                    if (j3 == 0) {
                        j3 = this.I;
                    }
                    TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
                    String str = "";
                    if (this.f52402a0.m() > 5) {
                        int m10 = this.f52402a0.m();
                        if (M0 != null) {
                            str = M0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.f52402a0.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        t1Var.U = spannableStringBuilder;
                    } else {
                        if (M0 != null) {
                            str = M0.title;
                        }
                        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754399, sb2, str));
                    }
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    if (!org.telegram.messenger.t3.T(M0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                        c2VarArr[0] = c2Var;
                        c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                        c2VarArr[0].setMultiline(true);
                        if (this.f52402a0.m() == 1) {
                            c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754393, org.telegram.messenger.q10.j(getMessagesController().a2(Long.valueOf(this.f52402a0.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.hd.M0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.hd.f24104a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.hd.f24104a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], c8.ja.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new z00(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754486, null), new tr(11, this, c2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    showDialog(t1Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < this.f52402a0.m(); i12++) {
                    arrayList.add(getMessagesController().q1(getMessagesController().a2(Long.valueOf(this.f52402a0.j(i12)))));
                }
                org.telegram.messenger.np messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.h1(j3);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.mj(messagesController2, tL_channels_inviteToChannel, j3, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.ns.f25573t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
                return true;
            } else if (this.F) {
                if (z11) {
                    r0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < this.f52402a0.m(); i13++) {
                    arrayList2.add(Long.valueOf(this.f52402a0.j(i13)));
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
                    presentFragment(new c50(bundle2));
                    return true;
                }
                s40 s40Var = this.f52431x;
                if (s40Var != null) {
                    if (this.Y != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Z != null) {
                        z12 = true;
                    }
                    s40Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.f20 f20Var;
        org.telegram.ui.Components.f20 f20Var2;
        Object a22;
        HashSet hashSet = this.f52412g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f52413h0 = z10;
        this.f52414i0 = z11;
        o40 o40Var = this.h;
        if (o40Var == null) {
            this.f52415j0 = arrayList;
            this.f52416k0 = z10;
            this.f52417l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.f20 f20Var3 = new org.telegram.ui.Components.f20(getParentActivity(), "premium");
            this.Y = f20Var3;
            this.h.a(f20Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (f20Var = this.Y) != null) {
            o40Var.c(f20Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.f20 f20Var4 = new org.telegram.ui.Components.f20(getParentActivity(), "miniApps");
            this.Z = f20Var4;
            this.h.a(f20Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (f20Var2 = this.Z) != null) {
            this.h.c(f20Var2);
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
                a22 = getMessagesController().M0(Long.valueOf(-longValue));
            } else {
                a22 = getMessagesController().a2(l10);
            }
            if (a22 != null) {
                org.telegram.ui.Components.f20 f20Var5 = new org.telegram.ui.Components.f20(getParentActivity(), a22);
                this.h.a(f20Var5);
                f20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.y00 y00Var = this.h.d;
        AnimatorSet animatorSet = y00Var.f41823a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y00Var.f41823a.setupEndValues();
            y00Var.f41823a.cancel();
        }
        org.telegram.messenger.g0.a4(this.f52418n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f52418n, new org.telegram.ui.Components.a2(this, i7, 18));
    }

    public final void w0() {
        u40 u40Var;
        ah.i iVar = this.f52410f.f40202r;
        if (iVar == null) {
            return;
        }
        if (this.N == 2) {
            iVar.setHint(org.telegram.messenger.hd.M0(2131754396, null));
        } else if (!this.S && ((u40Var = this.f52430w) == null || u40Var.H != 0)) {
            if (!this.P && !this.Q) {
                if (this.R) {
                    iVar.setHint(org.telegram.messenger.hd.M0(2131748287, null));
                    return;
                } else {
                    iVar.setHint(org.telegram.messenger.hd.M0(2131745595, null));
                    return;
                }
            }
            iVar.setHint(org.telegram.messenger.hd.M0(2131745768, null));
        } else {
            iVar.setHint(org.telegram.messenger.hd.M0(2131745769, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i7 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.f52402a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.f52402a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.hd.a0(null, null, 2131748619, org.telegram.messenger.hd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(this.f52402a0.m(), "MembersCountSelected"), Integer.valueOf(this.f52402a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 != 2 && z11) {
            if (this.F && this.f52404b0.isEmpty()) {
                this.E.e(false, true);
                this.F = false;
            } else if (!this.F && !this.f52404b0.isEmpty()) {
                this.E.e(true, true);
                this.F = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.uj0 uj0Var = this.f52418n;
            if (uj0Var != null) {
                uj0Var.x1();
                if (this.f52418n.getFastScroll() != null) {
                    this.f52418n.getFastScroll().invalidate();
                }
            }
            o40 o40Var = this.h;
            if (o40Var != null && o40Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                    View childAt = spansContainer.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.f20) {
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
    public final void Q() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
