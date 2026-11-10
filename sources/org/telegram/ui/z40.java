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
public class z40 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.p00 D;
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
    public final int f52210a;
    public ArrayList f52211a0;
    public final te.c f52212b;
    public org.telegram.ui.Components.c20 f52213b0;
    public final te.a f52214c;
    public int f52215c0;
    public di.b3 d;
    public org.telegram.ui.Components.mc0 f52216d0;
    public fi.p5 f52217e;
    public boolean f52218e0;
    public org.telegram.ui.Components.r00 f52219f;
    public final HashSet f52220f0;
    public boolean f52221g0;
    public r40 h;
    public boolean f52222h0;
    public ArrayList f52223i0;
    public boolean f52224j0;
    public boolean f52225k0;
    public int f52226l0;
    public int m0;
    public org.telegram.ui.Components.pj0 f52227n;
    public int f52228n0;
    public final Rect f52229o0;
    public final dh.g f52230p0;
    public final ri.f f52231q0;
    public v4.b0 f52232r;
    public dh.k f52233r0;
    public org.telegram.ui.Components.bv0 f52234s;
    public final ArrayList f52235s0;
    public final RectF f52236t0;
    public final RectF f52237u0;
    public x40 f52238w;
    public v40 f52239x;
    public u40 f52240y;

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
        this.f52210a = i7;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f52212b = new te.c(3, this, wqVar, 350L);
        this.f52214c = new te.a(4, this, wqVar, 350L, false);
        this.Z = new a0.h();
        this.f52211a0 = new ArrayList();
        this.f52220f0 = new HashSet();
        this.f52226l0 = -4;
        this.f52229o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f52235s0 = arrayList;
        RectF rectF = new RectF();
        this.f52236t0 = rectF;
        RectF rectF2 = new RectF();
        this.f52237u0 = rectF2;
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
            this.f52230p0 = new dh.g(false);
            this.f52231q0 = new ri.f(null);
            return;
        }
        this.f52230p0 = null;
        this.f52231q0 = null;
    }

    public static void Z(z40 z40Var, Context context, View view, int i7) {
        long j3;
        String str;
        org.telegram.ui.Components.bc K;
        boolean z9;
        int i10 = z40Var.K;
        long j10 = z40Var.H;
        x40 x40Var = z40Var.f52238w;
        if (i7 == x40Var.f51518x) {
            int i11 = z40Var.currentAccount;
            org.telegram.ui.ActionBar.h6 h6Var = z40Var.resourceProvider;
            p40 p40Var = new p40(z40Var, 0);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            u1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21339b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bg.k0(i11, u1Var, context, h6Var, p40Var, 5));
        } else if (i7 == 0 && x40Var.F != 0 && !x40Var.f51514n) {
            TLRPC.ChatFull chatFull = z40Var.I;
            long j11 = z40Var.G;
            if (j10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(context, z40Var, chatFull, j11, z9);
            z40Var.f52216d0 = mc0Var;
            z40Var.showDialog(mc0Var);
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.f29283r) {
                org.telegram.ui.Components.c20 c20Var = z40Var.X;
                if (c20Var == null) {
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(z40Var.f52219f.f37446r.getContext(), "premium");
                    z40Var.X = c20Var2;
                    z40Var.h.a(c20Var2);
                    z40Var.X.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(c20Var);
                    z40Var.X = null;
                }
                z40Var.p0();
            } else if (h4Var.f29284s) {
                org.telegram.ui.Components.c20 c20Var3 = z40Var.Y;
                if (c20Var3 == null) {
                    org.telegram.ui.Components.c20 c20Var4 = new org.telegram.ui.Components.c20(z40Var.f52219f.f37446r.getContext(), "miniapps");
                    z40Var.Y = c20Var4;
                    z40Var.h.a(c20Var4);
                    z40Var.Y.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(c20Var3);
                    z40Var.Y = null;
                }
                z40Var.p0();
            } else {
                Object object = h4Var.getObject();
                boolean z10 = object instanceof TLRPC.User;
                if (z10) {
                    j3 = ((TLRPC.User) object).f27109id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26960id;
                } else {
                    return;
                }
                a0.h hVar = z40Var.J;
                if (hVar == null || hVar.h(j3) < 0) {
                    if (h4Var.O) {
                        int i12 = -z40Var.f52226l0;
                        z40Var.f52226l0 = i12;
                        org.telegram.messenger.g0.G3(i12, h4Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        if (j3 >= 0) {
                            str = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(z40Var.currentAccount).a2(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.qp.s1(z40Var.currentAccount).D3()) {
                            K = org.telegram.ui.Components.gc.a0(z40Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)));
                        } else {
                            K = org.telegram.ui.Components.gc.a0(z40Var).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)), org.telegram.messenger.id.M0(2131743759, null), new p40(z40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.c20 c20Var5 = (org.telegram.ui.Components.c20) z40Var.Z.f(j3);
                    if (c20Var5 != null) {
                        z40Var.h.c(c20Var5);
                    } else if (i10 == 0 || z40Var.Z.m() != i10) {
                        if (z40Var.M == 0 && z40Var.Z.m() == z40Var.getMessagesController().V2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z40Var.getParentActivity());
                            String M0 = org.telegram.messenger.id.M0(2131689472, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27300a;
                            u1Var2.R = M0;
                            u1Var2.T = org.telegram.messenger.id.M0(2131745294, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            z40Var.showDialog(u1Var2);
                            return;
                        }
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (z40Var.R && user.bot) {
                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.gc.a0(z40Var).t(org.telegram.messenger.id.M0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat M02 = z40Var.getMessagesController().M0(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.f27300a;
                                    if (w10) {
                                        u1Var3.R = org.telegram.messenger.id.M0(2131754461, null);
                                        u1Var3.T = org.telegram.messenger.id.M0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131754466, null), new su(6, z40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    } else {
                                        u1Var3.T = org.telegram.messenger.id.M0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    }
                                    z40Var.showDialog(u1Var3);
                                    return;
                                }
                            }
                            z40Var.getMessagesController().X3(user, !z40Var.T, false);
                        } else if (object instanceof TLRPC.Chat) {
                            z40Var.getMessagesController().Q3((TLRPC.Chat) object, !z40Var.T);
                        }
                        org.telegram.ui.Components.c20 c20Var6 = new org.telegram.ui.Components.c20(z40Var.f52219f.f37446r.getContext(), object);
                        z40Var.h.a(c20Var6);
                        c20Var6.setOnClickListener(z40Var);
                    } else {
                        return;
                    }
                    z40Var.x0();
                    if (!z40Var.T && !z40Var.S) {
                        z40Var.p0();
                    } else {
                        org.telegram.messenger.g0.K3(z40Var.f52219f.f37446r);
                    }
                    if (z40Var.f52219f.f37446r.length() > 0) {
                        z40Var.f52219f.f37446r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(z40 z40Var) {
        if (z40Var.F == null) {
            return;
        }
        z40Var.f52214c.a(!z40Var.Z.i(), true);
    }

    public static void f0(z40 z40Var, Canvas canvas, RectF rectF, Paint paint) {
        ri.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f() && (fVar = z40Var.f52231q0) != null) {
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
            int paddingTop = this.f52227n.getPaddingTop();
            o0();
            org.telegram.ui.Components.r00 r00Var = this.f52219f;
            te.c cVar2 = this.f52212b;
            r00Var.setTranslationY(cVar2.f55504f);
            n0();
            this.f52217e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f55504f);
            this.d.invalidate();
            int paddingTop2 = this.f52227n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((te.a) this.f52217e.f12600c).f55499f) {
                this.f52227n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i7 == 4) {
            l0();
            n0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28072n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
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
        int i7;
        int i10;
        int i11;
        this.T = false;
        this.S = false;
        this.f52211a0.clear();
        this.Z.b();
        this.f52213b0 = null;
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
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748288, null));
        } else if (z9) {
            if (this.H != 0) {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131749500, null));
            }
        } else {
            int i13 = this.U;
            if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750805, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131754267, null));
                }
            } else if (z10) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750729, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748292, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748290, null));
                }
            } else {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (i12 == 0) {
                    i7 = 2131748273;
                } else {
                    i7 = 2131748289;
                }
                lVar.setTitle(org.telegram.messenger.id.M0(i7, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new xx(this, 4));
        this.f52219f = new org.telegram.ui.Components.r00(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        r40 r40Var = new r40(this, context, this.currentAccount);
        this.h = r40Var;
        r40Var.setDelegate(new n40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new o40(this, 1));
        r40 r40Var2 = this.h;
        this.Z = r40Var2.f38792b;
        this.f52211a0 = r40Var2.f38793c;
        w0();
        this.f52219f.f37446r.setOnEditorActionListener(new fa(this, 4));
        this.f52219f.f37446r.setOnKeyListener(new s40(0, this));
        this.f52219f.f37446r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.f52223i0;
        if (arrayList != null) {
            u0(arrayList, this.f52224j0, this.f52225k0);
        }
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(6);
        lzVar.f35774x = false;
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 1, null);
        this.f52234s = bv0Var;
        bv0Var.addView(lzVar);
        this.f52234s.e(true, false);
        this.f52234s.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.f52232r = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f52227n = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.f52227n.setEmptyView(this.f52234s);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f52227n;
        x40 x40Var = new x40(this, context);
        this.f52238w = x40Var;
        pj0Var2.setAdapter(x40Var);
        this.f52227n.setLayoutManager(this.f52232r);
        this.f52227n.setVerticalScrollBarEnabled(false);
        this.f52227n.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f52227n;
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f52227n;
        float f10 = -this.f52210a;
        k0Var.addView(pj0Var4, c8.ha.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.f52234s);
        this.f52227n.setOnItemClickListener(new di.q4(18, this, context));
        this.f52227n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.pj0 pj0Var5 = this.f52227n;
        pj0Var5.W1 = true;
        pj0Var5.X1 = 0;
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.D = p00Var;
        if (!z10 && !z11 && !z9) {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.f28788l = 180;
            y1Var.invalidateSelf();
            this.D.f36738c.setImageDrawable(y1Var);
        } else {
            p00Var.f36738c.setImageResource(2131231195);
        }
        if (!z12) {
            k0Var.addView(this.D, org.telegram.ui.Components.p00.b());
        }
        this.D.setOnClickListener(new o40(this, 2));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        if (z12) {
            this.F = new bi.s1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, this.resourceProvider);
            this.F.addView(view, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22566p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.F.addView(linearLayout, c8.ha.e(-1, -2, 87));
            fi.d dVar = new fi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232622, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749481, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, c8.ha.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new o40(this, 3));
            fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232624, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131749482, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new o40(this, 4));
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
        k0Var.addView(this.f52219f, c8.ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.pj0 pj0Var6 = this.f52227n;
        Objects.requireNonNull(pj0Var6);
        this.f52233r0 = new dh.k(pj0Var6, k0Var, new q40(pj0Var6, 0));
        this.f52227n.D0(new p40(this, 3));
        fi.p5 p5Var = new fi.p5(context, this.parentLayout);
        this.f52217e = p5Var;
        ((te.a) p5Var.f12600c).a(false, false);
        k0Var.addView(this.f52217e, c8.ha.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41263f1.d.add(this);
        }
        View view2 = this.fragmentView;
        n40 n40Var = new n40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(view2, n40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            x40 x40Var = this.f52238w;
            if (x40Var != null) {
                x40Var.f();
            }
        } else if (i7 == org.telegram.messenger.qs.f25067r) {
            if (this.f52227n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f52227n.getChildCount();
                int i11 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f52227n.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28038l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28056m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28073n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52234s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52234s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28000j7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52227n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28020k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52234s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52234s.f32368e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28282y6));
        if (this.f52216d0 != null) {
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f52230p0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f52215c0;
            RectF rectF = this.f52236t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.F != null) {
                RectF rectF2 = this.f52237u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.F != null && this.f52214c.f55498e > 0.0f) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f52235s0);
            gVar.e(this.f52233r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z40.k0(boolean):boolean");
    }

    public final void l0() {
        int i7;
        bi.s1 s1Var = this.F;
        if (s1Var == null) {
            return;
        }
        float f10 = this.f52214c.f55498e;
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
        this.f52228n0 = k1Var.f54213a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.p00 p00Var = this.D;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.m0, this.f52228n0));
        }
    }

    public final void n0() {
        if (this.f52227n.Y0()) {
            this.f52227n.setClipBounds(null);
            return;
        }
        int i7 = this.m0;
        int i10 = this.f52210a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f52212b.f55504f);
        int measuredWidth = this.f52227n.getMeasuredWidth();
        int z9 = org.telegram.messenger.k5.z(i10, this.f52227n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i7) * this.f52214c.f55498e));
        Rect rect = this.f52229o0;
        rect.set(0, measuredHeight, measuredWidth, z9);
        this.f52227n.setClipBounds(rect);
    }

    public final void o0() {
        int i7;
        int i10;
        if (this.Q) {
            i7 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i7 = 0;
        }
        this.f52227n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f52212b.f55504f), 0, org.telegram.messenger.g0.L(this.f52210a) + this.m0 + i7);
        this.f52234s.setPadding(0, 0, 0, this.m0);
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
            this.f52213b0 = null;
            this.h.c(c20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.f52213b0;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.f52213b0 = c20Var;
        c20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.O);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25067r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.O);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25067r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.r00 r00Var = this.f52219f;
            if (r00Var != null) {
                r00Var.updateColors();
            }
            org.telegram.ui.Components.p00 p00Var = this.D;
            if (p00Var != null) {
                p00Var.updateColors();
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
        int childCount = this.f52227n.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f52227n.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f27109id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26960id;
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
                this.f52227n.getClass();
                if (RecyclerView.R(childAt) == this.f52238w.f51517w) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                    if (this.X == null && this.Z.i()) {
                        M0 = "";
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131751457, null);
                    }
                    x3Var.a(M0, new o40(this, 0));
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
        u40 u40Var = this.f52240y;
        if (u40Var != null) {
            u40Var.f(i7, arrayList);
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
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
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
                        c2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                        c2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754393, org.telegram.messenger.t10.j(getMessagesController().a2(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.id.M0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.id.f23161a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.id.f23161a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new b10(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new su(7, this, c2VarArr));
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
                getNotificationCenter().k(org.telegram.messenger.qs.f25080t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new cn(bundle), true);
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
                    presentFragment(new g50(bundle2));
                    return true;
                }
                v40 v40Var = this.f52239x;
                if (v40Var != null) {
                    if (this.X != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.Y != null) {
                        z11 = true;
                    }
                    v40Var.a(arrayList2, z9, z11);
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
        HashSet hashSet = this.f52220f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f52221g0 = z9;
        this.f52222h0 = z10;
        r40 r40Var = this.h;
        if (r40Var == null) {
            this.f52223i0 = arrayList;
            this.f52224j0 = z9;
            this.f52225k0 = z10;
            return;
        }
        if (z9 && this.X == null) {
            org.telegram.ui.Components.c20 c20Var3 = new org.telegram.ui.Components.c20(getParentActivity(), "premium");
            this.X = c20Var3;
            this.h.a(c20Var3);
            this.X.setOnClickListener(this);
        } else if (!z9 && (c20Var = this.X) != null) {
            r40Var.c(c20Var);
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
        org.telegram.ui.Components.u00 u00Var = this.h.d;
        AnimatorSet animatorSet = u00Var.f38457a;
        if (animatorSet != null && animatorSet.isRunning()) {
            u00Var.f38457a.setupEndValues();
            u00Var.f38457a.cancel();
        }
        org.telegram.messenger.g0.b4(this.f52227n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f52227n, new org.telegram.ui.Components.q2(this, i7, 15));
    }

    public final void w0() {
        x40 x40Var;
        ah.i iVar = this.f52219f.f37446r;
        if (iVar == null) {
            return;
        }
        if (this.M == 2) {
            iVar.setHint(org.telegram.messenger.id.M0(2131754396, null));
        } else if (!this.R && ((x40Var = this.f52238w) == null || x40Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    iVar.setHint(org.telegram.messenger.id.M0(2131748287, null));
                    return;
                } else {
                    iVar.setHint(org.telegram.messenger.id.M0(2131745595, null));
                    return;
                }
            }
            iVar.setHint(org.telegram.messenger.id.M0(2131745768, null));
        } else {
            iVar.setHint(org.telegram.messenger.id.M0(2131745769, null));
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
                    this.actionBar.setSubtitle(org.telegram.messenger.id.a0(null, null, 2131748619, org.telegram.messenger.id.G(i11 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.id.K0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 != 2 && z10) {
            if (this.E && this.f52211a0.isEmpty()) {
                this.D.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f52211a0.isEmpty()) {
                this.D.e(true, true);
                this.E = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.pj0 pj0Var = this.f52227n;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f52227n.getFastScroll() != null) {
                    this.f52227n.getFastScroll().invalidate();
                }
            }
            r40 r40Var = this.h;
            if (r40Var != null && r40Var.getSpansContainer() != null) {
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
