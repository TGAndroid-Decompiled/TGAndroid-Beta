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
public class w40 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.q00 D;
    public boolean E;
    public bi.s1 F;
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
    public org.telegram.ui.Components.c20 X;
    public org.telegram.ui.Components.c20 Y;
    public a0.h Z;
    public final int f50867a;
    public ArrayList f50868a0;
    public final te.c f50869b;
    public org.telegram.ui.Components.c20 f50870b0;
    public final te.a f50871c;
    public int f50872c0;
    public di.b3 d;
    public org.telegram.ui.Components.mc0 f50873d0;
    public fi.p5 f50874e;
    public boolean f50875e0;
    public org.telegram.ui.Components.s00 f50876f;
    public final HashSet f50877f0;
    public boolean f50878g0;
    public o40 h;
    public boolean f50879h0;
    public ArrayList f50880i0;
    public boolean f50881j0;
    public boolean f50882k0;
    public int f50883l0;
    public int m0;
    public org.telegram.ui.Components.pj0 f50884n;
    public int f50885n0;
    public final Rect f50886o0;
    public final dh.g f50887p0;
    public final ri.f f50888q0;
    public v4.b0 f50889r;
    public dh.k f50890r0;
    public org.telegram.ui.Components.av0 f50891s;
    public final ArrayList f50892s0;
    public final RectF f50893t0;
    public final RectF f50894u0;
    public u40 f50895w;
    public s40 f50896x;
    public r40 f50897y;

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
        this.f50867a = i7;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f50869b = new te.c(3, this, xqVar, 350L);
        this.f50871c = new te.a(4, this, xqVar, 350L, false);
        this.Z = new a0.h();
        this.f50868a0 = new ArrayList();
        this.f50877f0 = new HashSet();
        this.f50883l0 = -4;
        this.f50886o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f50892s0 = arrayList;
        RectF rectF = new RectF();
        this.f50893t0 = rectF;
        RectF rectF2 = new RectF();
        this.f50894u0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i12 = bundle.getInt("chatType", 0);
        this.M = i12;
        this.N = bundle.getBoolean("forImport", false);
        boolean z9 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z9;
        boolean z10 = bundle.getBoolean("isNeverShare", false);
        this.P = z10;
        boolean z11 = bundle.getBoolean("isCall", false);
        this.Q = z11;
        boolean z12 = bundle.getBoolean("addToGroup", false);
        this.R = z12;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (!z9 && !z10 && !z12) {
            if (z11) {
                this.K = getMessagesController().P6 - 1;
            } else {
                org.telegram.messenger.qp messagesController = getMessagesController();
                if (i12 == 0) {
                    i10 = messagesController.X2;
                } else {
                    i10 = messagesController.W2;
                }
                this.K = i10;
            }
        } else {
            this.K = 0;
        }
        if (i11 >= 31) {
            this.f50887p0 = new dh.g(false);
            this.f50888q0 = new ri.f(null);
            return;
        }
        this.f50887p0 = null;
        this.f50888q0 = null;
    }

    public static void Z(w40 w40Var, Context context, View view, int i7) {
        long j3;
        String str;
        org.telegram.ui.Components.cc K;
        boolean z9;
        int i10 = w40Var.K;
        long j10 = w40Var.H;
        u40 u40Var = w40Var.f50895w;
        if (i7 == u40Var.f50211x) {
            int i11 = w40Var.currentAccount;
            org.telegram.ui.ActionBar.f6 f6Var = w40Var.resourceProvider;
            m40 m40Var = new m40(w40Var, 0);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            u1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21334b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bg.k0(i11, u1Var, context, f6Var, m40Var, 5));
        } else if (i7 == 0 && u40Var.F != 0 && !u40Var.f50207n) {
            TLRPC.ChatFull chatFull = w40Var.I;
            long j11 = w40Var.G;
            if (j10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(context, w40Var, chatFull, j11, z9);
            w40Var.f50873d0 = mc0Var;
            w40Var.showDialog(mc0Var);
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.f29268r) {
                org.telegram.ui.Components.c20 c20Var = w40Var.X;
                if (c20Var == null) {
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(w40Var.f50876f.f37824r.getContext(), "premium");
                    w40Var.X = c20Var2;
                    w40Var.h.a(c20Var2);
                    w40Var.X.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(c20Var);
                    w40Var.X = null;
                }
                w40Var.p0();
            } else if (h4Var.f29269s) {
                org.telegram.ui.Components.c20 c20Var3 = w40Var.Y;
                if (c20Var3 == null) {
                    org.telegram.ui.Components.c20 c20Var4 = new org.telegram.ui.Components.c20(w40Var.f50876f.f37824r.getContext(), "miniapps");
                    w40Var.Y = c20Var4;
                    w40Var.h.a(c20Var4);
                    w40Var.Y.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(c20Var3);
                    w40Var.Y = null;
                }
                w40Var.p0();
            } else {
                Object object = h4Var.getObject();
                boolean z10 = object instanceof TLRPC.User;
                if (z10) {
                    j3 = ((TLRPC.User) object).f27105id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26956id;
                } else {
                    return;
                }
                a0.h hVar = w40Var.J;
                if (hVar == null || hVar.h(j3) < 0) {
                    if (h4Var.O) {
                        int i12 = -w40Var.f50883l0;
                        w40Var.f50883l0 = i12;
                        org.telegram.messenger.g0.G3(i12, h4Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        if (j3 >= 0) {
                            str = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(w40Var.currentAccount).a2(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.qp.s1(w40Var.currentAccount).D3()) {
                            K = org.telegram.ui.Components.hc.a0(w40Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743763, str)));
                        } else {
                            K = org.telegram.ui.Components.hc.a0(w40Var).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743763, str)), org.telegram.messenger.id.M0(2131743762, null), new m40(w40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.c20 c20Var5 = (org.telegram.ui.Components.c20) w40Var.Z.f(j3);
                    if (c20Var5 != null) {
                        w40Var.h.c(c20Var5);
                    } else if (i10 == 0 || w40Var.Z.m() != i10) {
                        if (w40Var.M == 0 && w40Var.Z.m() == w40Var.getMessagesController().V2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w40Var.getParentActivity());
                            String M0 = org.telegram.messenger.id.M0(2131689472, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                            u1Var2.R = M0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131745297, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                            w40Var.showDialog(u1Var2);
                            return;
                        }
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (w40Var.R && user.bot) {
                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.hc.a0(w40Var).t(org.telegram.messenger.id.M0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat M02 = w40Var.getMessagesController().M0(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.f27296a;
                                    if (w10) {
                                        u1Var3.R = org.telegram.messenger.id.M0(2131754461, null);
                                        u1Var3.T = org.telegram.messenger.id.M0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131754466, null), new pu(6, w40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    } else {
                                        u1Var3.T = org.telegram.messenger.id.M0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                                    }
                                    w40Var.showDialog(u1Var3);
                                    return;
                                }
                            }
                            w40Var.getMessagesController().X3(user, !w40Var.T, false);
                        } else if (object instanceof TLRPC.Chat) {
                            w40Var.getMessagesController().Q3((TLRPC.Chat) object, !w40Var.T);
                        }
                        org.telegram.ui.Components.c20 c20Var6 = new org.telegram.ui.Components.c20(w40Var.f50876f.f37824r.getContext(), object);
                        w40Var.h.a(c20Var6);
                        c20Var6.setOnClickListener(w40Var);
                    } else {
                        return;
                    }
                    w40Var.x0();
                    if (!w40Var.T && !w40Var.S) {
                        w40Var.p0();
                    } else {
                        org.telegram.messenger.g0.K3(w40Var.f50876f.f37824r);
                    }
                    if (w40Var.f50876f.f37824r.length() > 0) {
                        w40Var.f50876f.f37824r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(w40 w40Var) {
        if (w40Var.F == null) {
            return;
        }
        w40Var.f50871c.a(!w40Var.Z.i(), true);
    }

    public static void f0(w40 w40Var, Canvas canvas, RectF rectF, Paint paint) {
        ri.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f() && (fVar = w40Var.f50888q0) != null) {
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
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.f50884n.getPaddingTop();
            o0();
            org.telegram.ui.Components.s00 s00Var = this.f50876f;
            te.c cVar2 = this.f50869b;
            s00Var.setTranslationY(cVar2.f55492f);
            n0();
            this.f50874e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f55492f);
            this.d.invalidate();
            int paddingTop2 = this.f50884n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((te.a) this.f50874e.f12598c).f55487f) {
                this.f50884n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i7 == 4) {
            l0();
            n0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28034n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27872e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
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
        this.T = false;
        this.S = false;
        this.f50868a0.clear();
        this.Z.b();
        this.f50870b0 = null;
        boolean z9 = this.R;
        int i12 = this.M;
        if (i12 == 2) {
            this.E = true;
        } else {
            this.E = !z9;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z10 = this.P;
        boolean z11 = this.O;
        boolean z12 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i12 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752526, null));
        } else if (z12) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748289, null));
        } else if (z9) {
            if (this.H != 0) {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131749501, null));
            }
        } else {
            int i13 = this.U;
            if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750806, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131754267, null));
                }
            } else if (z10) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750730, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748293, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748291, null));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i7 = 2131748274;
                } else {
                    i7 = 2131748290;
                }
                kVar.setTitle(org.telegram.messenger.id.M0(i7, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 4));
        this.f50876f = new org.telegram.ui.Components.s00(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        o40 o40Var = new o40(this, context, this.currentAccount);
        this.h = o40Var;
        o40Var.setDelegate(new k40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new l40(this, 1));
        o40 o40Var2 = this.h;
        this.Z = o40Var2.f39763b;
        this.f50868a0 = o40Var2.f39764c;
        w0();
        this.f50876f.f37824r.setOnEditorActionListener(new fa(this, 4));
        this.f50876f.f37824r.setOnKeyListener(new p40(0, this));
        this.f50876f.f37824r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.f50880i0;
        if (arrayList != null) {
            u0(arrayList, this.f50881j0, this.f50882k0);
        }
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(6);
        mzVar.f36172x = false;
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, mzVar, 1, null);
        this.f50891s = av0Var;
        av0Var.addView(mzVar);
        this.f50891s.e(true, false);
        this.f50891s.d.setText(org.telegram.messenger.id.M0(2131748168, null));
        this.f50889r = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f50884n = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.f50884n.setEmptyView(this.f50891s);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f50884n;
        u40 u40Var = new u40(this, context);
        this.f50895w = u40Var;
        pj0Var2.setAdapter(u40Var);
        this.f50884n.setLayoutManager(this.f50889r);
        this.f50884n.setVerticalScrollBarEnabled(false);
        this.f50884n.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f50884n;
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f50884n;
        float f10 = -this.f50867a;
        k0Var.addView(pj0Var4, c8.ha.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.f50891s);
        this.f50884n.setOnItemClickListener(new di.p4(18, this, context));
        this.f50884n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.pj0 pj0Var5 = this.f50884n;
        pj0Var5.W1 = true;
        pj0Var5.X1 = 0;
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.D = q00Var;
        if (!z10 && !z11 && !z9) {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.f28776l = 180;
            y1Var.invalidateSelf();
            this.D.f37140c.setImageDrawable(y1Var);
        } else {
            q00Var.f37140c.setImageResource(2131231195);
        }
        if (!z12) {
            k0Var.addView(this.D, org.telegram.ui.Components.q00.b());
        }
        this.D.setOnClickListener(new l40(this, 2));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.id.M0(2131748251, null));
        if (z12) {
            this.F = new bi.s1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27853d7, view, this.resourceProvider);
            this.F.addView(view, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22562p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.F.addView(linearLayout, c8.ha.e(-1, -2, 87));
            fi.d dVar = new fi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232622, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749482, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, c8.ha.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new l40(this, 3));
            fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232624, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131749483, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new l40(this, 4));
            i11 = -1;
            k0Var.addView(this.F, c8.ha.e(-1, -2, 87));
            l0();
        } else {
            i11 = -1;
        }
        x0();
        di.b3 b3Var = new di.b3(this, context);
        this.d = b3Var;
        k0Var.addView(b3Var, c8.ha.e(i11, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f50876f, c8.ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.pj0 pj0Var6 = this.f50884n;
        Objects.requireNonNull(pj0Var6);
        this.f50890r0 = new dh.k(pj0Var6, k0Var, new n40(pj0Var6, 0));
        this.f50884n.D0(new m40(this, 3));
        fi.p5 p5Var = new fi.p5(context, this.parentLayout);
        this.f50874e = p5Var;
        ((te.a) p5Var.f12598c).a(false, false);
        k0Var.addView(this.f50874e, c8.ha.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41265f1.d.add(this);
        }
        View view2 = this.fragmentView;
        k40 k40Var = new k40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f54190a;
        r0.a0.i(view2, k40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            u40 u40Var = this.f50895w;
            if (u40Var != null) {
                u40Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            if (this.f50884n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f50884n.getChildCount();
                int i11 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f50884n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.R) {
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28000l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28018m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28035n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50891s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27835c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50891s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27926h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27962j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50884n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27982k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50891s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50891s.f31927e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28244y6));
        if (this.f50873d0 != null) {
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f50887p0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f50872c0;
            RectF rectF = this.f50893t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.F != null) {
                RectF rectF2 = this.f50894u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.F != null && this.f50871c.f55486e > 0.0f) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f50892s0);
            gVar.e(this.f50890r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w40.k0(boolean):boolean");
    }

    public final void l0() {
        int i7;
        bi.s1 s1Var = this.F;
        if (s1Var == null) {
            return;
        }
        float f10 = this.f50871c.f55486e;
        s1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.F.setAlpha(f10);
        bi.s1 s1Var2 = this.F;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        s1Var2.setVisibility(i7);
    }

    @Override
    public final void m(r0.k1 k1Var) {
        this.f50885n0 = k1Var.f54201a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.q00 q00Var = this.D;
        if (q00Var != null) {
            q00Var.setTranslationY(-Math.max(this.m0, this.f50885n0));
        }
    }

    public final void n0() {
        if (this.f50884n.Y0()) {
            this.f50884n.setClipBounds(null);
            return;
        }
        int i7 = this.m0;
        int i10 = this.f50867a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f50869b.f55492f);
        int measuredWidth = this.f50884n.getMeasuredWidth();
        int z9 = org.telegram.messenger.k5.z(i10, this.f50884n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i7) * this.f50871c.f55486e));
        Rect rect = this.f50886o0;
        rect.set(0, measuredHeight, measuredWidth, z9);
        this.f50884n.setClipBounds(rect);
    }

    public final void o0() {
        int i7;
        int i10;
        if (this.Q) {
            i7 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i7 = 0;
        }
        this.f50884n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f50869b.f55492f), 0, org.telegram.messenger.g0.L(this.f50867a) + this.m0 + i7);
        this.f50891s.setPadding(0, 0, 0, this.m0);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (!k0(z9)) {
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.f50870b0 = null;
            this.h.c(c20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.f50870b0;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.f50870b0 = c20Var;
        c20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.O);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.O);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.s00 s00Var = this.f50876f;
            if (s00Var != null) {
                s00Var.updateColors();
            }
            org.telegram.ui.Components.q00 q00Var = this.D;
            if (q00Var != null) {
                q00Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        String M0;
        long j3;
        boolean z9;
        boolean z10;
        boolean z11;
        int childCount = this.f50884n.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f50884n.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f27105id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26956id;
                } else {
                    boolean z12 = object instanceof String;
                    if (z12 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h4Var.c(z10, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z12 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        h4Var.c(z9, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.J;
                    if (hVar != null && hVar.h(j3) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j3) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h4Var.c(z11, true);
                        h4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.f50884n.getClass();
                if (RecyclerView.R(childAt) == this.f50895w.f50210w) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                    if (this.X == null && this.Z.i()) {
                        M0 = "";
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131751458, null);
                    }
                    x3Var.a(M0, new l40(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.Z.m(); i7++) {
            hashSet.add(Long.valueOf(this.Z.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            arrayList.add(getMessagesController().a2(Long.valueOf(this.Z.j(i10))));
        }
        r40 r40Var = this.f50897y;
        if (r40Var != null) {
            r40Var.f(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z9;
        int L;
        int L2;
        boolean i7 = this.Z.i();
        boolean z10 = this.R;
        int i10 = this.M;
        boolean z11 = false;
        if (!i7 || i10 == 2 || !z10) {
            long j3 = this.G;
            if (z10) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.id.G(this.Z.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.Z.m(); i11++) {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.Z.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    org.telegram.messenger.qp messagesController = getMessagesController();
                    if (j3 == 0) {
                        j3 = this.H;
                    }
                    TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
                    String str = "";
                    if (this.Z.m() > 5) {
                        int m10 = this.Z.m();
                        if (M0 != null) {
                            str = M0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.Z.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        u1Var.T = spannableStringBuilder;
                    } else {
                        if (M0 != null) {
                            str = M0.title;
                        }
                        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754399, sb2, str));
                    }
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    if (!org.telegram.messenger.t3.T(M0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                        c2VarArr[0] = c2Var;
                        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                        c2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754393, org.telegram.messenger.t10.j(getMessagesController().a2(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.id.M0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.id.f23157a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.id.f23157a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new y00(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new pu(7, this, c2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    showDialog(u1Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < this.Z.m(); i12++) {
                    arrayList.add(getMessagesController().q1(getMessagesController().a2(Long.valueOf(this.Z.j(i12)))));
                }
                org.telegram.messenger.qp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.h1(j3);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.oj(messagesController2, tL_channels_inviteToChannel, j3, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.qs.f25076t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
                return true;
            } else if (this.E) {
                if (z10) {
                    r0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < this.Z.m(); i13++) {
                    arrayList2.add(Long.valueOf(this.Z.j(i13)));
                }
                if (!this.O && !this.P) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        jArr[i14] = ((Long) arrayList2.get(i14)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new d50(bundle2));
                    return true;
                }
                s40 s40Var = this.f50896x;
                if (s40Var != null) {
                    if (this.X != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.Y != null) {
                        z11 = true;
                    }
                    s40Var.a(arrayList2, z9, z11);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z9, boolean z10) {
        org.telegram.ui.Components.c20 c20Var;
        org.telegram.ui.Components.c20 c20Var2;
        Object a22;
        HashSet hashSet = this.f50877f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f50878g0 = z9;
        this.f50879h0 = z10;
        o40 o40Var = this.h;
        if (o40Var == null) {
            this.f50880i0 = arrayList;
            this.f50881j0 = z9;
            this.f50882k0 = z10;
            return;
        }
        if (z9 && this.X == null) {
            org.telegram.ui.Components.c20 c20Var3 = new org.telegram.ui.Components.c20(getParentActivity(), "premium");
            this.X = c20Var3;
            this.h.a(c20Var3);
            this.X.setOnClickListener(this);
        } else if (!z9 && (c20Var = this.X) != null) {
            o40Var.c(c20Var);
            this.X = null;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.c20 c20Var4 = new org.telegram.ui.Components.c20(getParentActivity(), "miniApps");
            this.Y = c20Var4;
            this.h.a(c20Var4);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (c20Var2 = this.Y) != null) {
            this.h.c(c20Var2);
            this.Y = null;
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
                org.telegram.ui.Components.c20 c20Var5 = new org.telegram.ui.Components.c20(getParentActivity(), a22);
                this.h.a(c20Var5);
                c20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.v00 v00Var = this.h.d;
        AnimatorSet animatorSet = v00Var.f38800a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v00Var.f38800a.setupEndValues();
            v00Var.f38800a.cancel();
        }
        org.telegram.messenger.g0.b4(this.f50884n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f50884n, new org.telegram.ui.Components.r2(this, i7, 15));
    }

    public final void w0() {
        u40 u40Var;
        ah.i iVar = this.f50876f.f37824r;
        if (iVar == null) {
            return;
        }
        if (this.M == 2) {
            iVar.setHint(org.telegram.messenger.id.M0(2131754396, null));
        } else if (!this.R && ((u40Var = this.f50895w) == null || u40Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    iVar.setHint(org.telegram.messenger.id.M0(2131748288, null));
                    return;
                } else {
                    iVar.setHint(org.telegram.messenger.id.M0(2131745598, null));
                    return;
                }
            }
            iVar.setHint(org.telegram.messenger.id.M0(2131745771, null));
        } else {
            iVar.setHint(org.telegram.messenger.id.M0(2131745772, null));
        }
    }

    public final void x0() {
        boolean z9 = this.O;
        int i7 = this.M;
        boolean z10 = this.R;
        if (!z9 && !this.P && !z10) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.id.G(this.Z.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.Z.i();
                int i11 = this.K;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.id.a0(null, null, 2131748620, org.telegram.messenger.id.G(i11 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.id.K0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 != 2 && z10) {
            if (this.E && this.f50868a0.isEmpty()) {
                this.D.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f50868a0.isEmpty()) {
                this.D.e(true, true);
                this.E = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.pj0 pj0Var = this.f50884n;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f50884n.getFastScroll() != null) {
                    this.f50884n.getFastScroll().invalidate();
                }
            }
            o40 o40Var = this.h;
            if (o40Var != null && o40Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                    View childAt = spansContainer.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
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
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
