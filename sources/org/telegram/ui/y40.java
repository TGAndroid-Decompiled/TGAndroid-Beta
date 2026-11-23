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
public class y40 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.a10 E;
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
    public org.telegram.ui.Components.n20 Y;
    public org.telegram.ui.Components.n20 Z;
    public final int f54190a;
    public a0.h f54191a0;
    public final te.c f54192b;
    public ArrayList f54193b0;
    public final te.a f54194c;
    public org.telegram.ui.Components.n20 f54195c0;
    public fi.u2 d;
    public int f54196d0;
    public hi.w5 f54197e;
    public org.telegram.ui.Components.wc0 f54198e0;
    public org.telegram.ui.Components.c10 f54199f;
    public boolean f54200f0;
    public final HashSet f54201g0;
    public q40 h;
    public boolean f54202h0;
    public boolean f54203i0;
    public ArrayList f54204j0;
    public boolean f54205k0;
    public boolean f54206l0;
    public int m0;
    public org.telegram.ui.Components.ek0 f54207n;
    public int f54208n0;
    public int f54209o0;
    public final Rect f54210p0;
    public final dh.g f54211q0;
    public v4.c0 f54212r;
    public final ui.f f54213r0;
    public org.telegram.ui.Components.mv0 f54214s;
    public dh.k f54215s0;
    public final ArrayList f54216t0;
    public final RectF f54217u0;
    public final RectF f54218v0;
    public w40 f54219w;
    public u40 f54220x;
    public t40 f54221y;

    public y40(Bundle bundle) {
        super(bundle);
        int i7;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f54190a = i7;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f54192b = new te.c(3, this, krVar, 350L);
        this.f54194c = new te.a(4, this, krVar, 350L, false);
        this.f54191a0 = new a0.h();
        this.f54193b0 = new ArrayList();
        this.f54201g0 = new HashSet();
        this.m0 = -4;
        this.f54210p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f54216t0 = arrayList;
        RectF rectF = new RectF();
        this.f54217u0 = rectF;
        RectF rectF2 = new RectF();
        this.f54218v0 = rectF2;
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
                    i10 = messagesController.f25692a3;
                } else {
                    i10 = messagesController.Z2;
                }
                this.L = i10;
            }
        } else {
            this.L = 0;
        }
        if (i11 >= 31) {
            this.f54211q0 = new dh.g(false);
            this.f54213r0 = new ui.f(null);
            return;
        }
        this.f54211q0 = null;
        this.f54213r0 = null;
    }

    public static void Z(y40 y40Var, Context context, View view, int i7) {
        long j3;
        String str;
        org.telegram.ui.Components.fc K;
        boolean z10;
        int i10 = y40Var.L;
        long j10 = y40Var.I;
        w40 w40Var = y40Var.f54219w;
        if (i7 == w40Var.f53117x) {
            int i11 = y40Var.currentAccount;
            org.telegram.ui.ActionBar.i6 i6Var = y40Var.resourceProvider;
            o40 o40Var = new o40(y40Var, 0);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            t1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f22875b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bg.l0(i11, t1Var, context, i6Var, o40Var, 5));
        } else if (i7 == 0 && w40Var.G != 0 && !w40Var.f53113n) {
            TLRPC.ChatFull chatFull = y40Var.J;
            long j11 = y40Var.H;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(context, y40Var, chatFull, j11, z10);
            y40Var.f54198e0 = wc0Var;
            y40Var.showDialog(wc0Var);
        } else if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (i4Var.f30903r) {
                org.telegram.ui.Components.n20 n20Var = y40Var.Y;
                if (n20Var == null) {
                    org.telegram.ui.Components.n20 n20Var2 = new org.telegram.ui.Components.n20(y40Var.f54199f.f33883r.getContext(), "premium");
                    y40Var.Y = n20Var2;
                    y40Var.h.a(n20Var2);
                    y40Var.Y.setOnClickListener(y40Var);
                } else {
                    y40Var.h.c(n20Var);
                    y40Var.Y = null;
                }
                y40Var.p0();
            } else if (i4Var.f30904s) {
                org.telegram.ui.Components.n20 n20Var3 = y40Var.Z;
                if (n20Var3 == null) {
                    org.telegram.ui.Components.n20 n20Var4 = new org.telegram.ui.Components.n20(y40Var.f54199f.f33883r.getContext(), "miniapps");
                    y40Var.Z = n20Var4;
                    y40Var.h.a(n20Var4);
                    y40Var.Z.setOnClickListener(y40Var);
                } else {
                    y40Var.h.c(n20Var3);
                    y40Var.Z = null;
                }
                y40Var.p0();
            } else {
                Object object = i4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f28641id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28492id;
                } else {
                    return;
                }
                a0.h hVar = y40Var.K;
                if (hVar == null || hVar.h(j3) < 0) {
                    if (i4Var.P) {
                        int i12 = -y40Var.m0;
                        y40Var.m0 = i12;
                        org.telegram.messenger.g0.E3(i12, i4Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        if (j3 >= 0) {
                            str = org.telegram.messenger.n10.q(org.telegram.messenger.mp.u1(y40Var.currentAccount).c2(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.mp.u1(y40Var.currentAccount).K3()) {
                            K = org.telegram.ui.Components.kc.b0(y40Var).Q(2131624217, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, str)));
                        } else {
                            K = org.telegram.ui.Components.kc.b0(y40Var).K(2131624217, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, str)), org.telegram.messenger.gd.N0(2131743512, null), new o40(y40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.n20 n20Var5 = (org.telegram.ui.Components.n20) y40Var.f54191a0.f(j3);
                    if (n20Var5 != null) {
                        y40Var.h.c(n20Var5);
                    } else if (i10 == 0 || y40Var.f54191a0.m() != i10) {
                        if (y40Var.N == 0 && y40Var.f54191a0.m() == y40Var.getMessagesController().Y2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y40Var.getParentActivity());
                            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                            t1Var2.S = N0;
                            t1Var2.U = org.telegram.messenger.gd.N0(2131745098, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            y40Var.showDialog(t1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (y40Var.S && user.bot) {
                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.kc.b0(y40Var).t(org.telegram.messenger.gd.N0(2131753105, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat O0 = y40Var.getMessagesController().O0(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(y40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.v3.w(4, O0);
                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.f28835a;
                                    if (w10) {
                                        t1Var3.S = org.telegram.messenger.gd.N0(2131754458, null);
                                        t1Var3.U = org.telegram.messenger.gd.N0(2131754457, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131754463, null), new zs(9, y40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                    } else {
                                        t1Var3.U = org.telegram.messenger.gd.N0(2131752554, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                                    }
                                    y40Var.showDialog(t1Var3);
                                    return;
                                }
                            }
                            y40Var.getMessagesController().e4(user, !y40Var.U, false);
                        } else if (object instanceof TLRPC.Chat) {
                            y40Var.getMessagesController().X3((TLRPC.Chat) object, !y40Var.U);
                        }
                        org.telegram.ui.Components.n20 n20Var6 = new org.telegram.ui.Components.n20(y40Var.f54199f.f33883r.getContext(), object);
                        y40Var.h.a(n20Var6);
                        n20Var6.setOnClickListener(y40Var);
                    } else {
                        return;
                    }
                    y40Var.x0();
                    if (!y40Var.U && !y40Var.T) {
                        y40Var.p0();
                    } else {
                        org.telegram.messenger.g0.I3(y40Var.f54199f.f33883r);
                    }
                    if (y40Var.f54199f.f33883r.length() > 0) {
                        y40Var.f54199f.f33883r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(y40 y40Var) {
        if (y40Var.G == null) {
            return;
        }
        y40Var.f54194c.a(!y40Var.f54191a0.i(), true);
    }

    public static void f0(y40 y40Var, Canvas canvas, RectF rectF, Paint paint) {
        ui.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.bz.f() && (fVar = y40Var.f54213r0) != null) {
            fVar.z(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.f54207n.getPaddingTop();
            o0();
            org.telegram.ui.Components.c10 c10Var = this.f54199f;
            te.c cVar2 = this.f54192b;
            c10Var.setTranslationY(cVar2.f57785f);
            n0();
            this.f54197e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f57785f);
            this.d.invalidate();
            int paddingTop2 = this.f54207n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((te.a) this.f54197e.f15678c).f57780f) {
                this.f54207n.scrollBy(0, paddingTop - paddingTop2);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29633n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29471e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
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
        this.f54193b0.clear();
        this.f54191a0.b();
        this.f54195c0 = null;
        boolean z10 = this.S;
        int i12 = this.N;
        if (i12 == 2) {
            this.F = true;
        } else {
            this.F = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(2131231243);
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
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 7));
        this.f54199f = new org.telegram.ui.Components.c10(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        q40 q40Var = new q40(this, context, this.currentAccount);
        this.h = q40Var;
        q40Var.setDelegate(new m40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new n40(this, 1));
        q40 q40Var2 = this.h;
        this.f54191a0 = q40Var2.f35611b;
        this.f54193b0 = q40Var2.f35612c;
        w0();
        this.f54199f.f33883r.setOnEditorActionListener(new fa(this, 4));
        this.f54199f.f33883r.setOnKeyListener(new r40(0, this));
        this.f54199f.f33883r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.f54204j0;
        if (arrayList != null) {
            u0(arrayList, this.f54205k0, this.f54206l0);
        }
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        vzVar.setViewType(6);
        vzVar.f41457x = false;
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(context, vzVar, 1, null);
        this.f54214s = mv0Var;
        mv0Var.addView(vzVar);
        this.f54214s.e(true, false);
        this.f54214s.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.f54212r = new v4.c0(1, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f54207n = ek0Var;
        ek0Var.setFastScrollEnabled(0);
        this.f54207n.setEmptyView(this.f54214s);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f54207n;
        w40 w40Var = new w40(this, context);
        this.f54219w = w40Var;
        ek0Var2.setAdapter(w40Var);
        this.f54207n.setLayoutManager(this.f54212r);
        this.f54207n.setVerticalScrollBarEnabled(false);
        this.f54207n.setClipToPadding(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f54207n;
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f54207n;
        float f10 = -this.f54190a;
        k0Var.addView(ek0Var4, c8.na.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.f54214s);
        this.f54207n.setOnItemClickListener(new fi.g4(18, this, context));
        this.f54207n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.ek0 ek0Var5 = this.f54207n;
        ek0Var5.X1 = true;
        ek0Var5.Y1 = 0;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.E = a10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.f30315l = 180;
            x1Var.invalidateSelf();
            this.E.f33308c.setImageDrawable(x1Var);
        } else {
            a10Var.f33308c.setImageResource(2131231198);
        }
        if (!z13) {
            k0Var.addView(this.E, org.telegram.ui.Components.a10.b());
        }
        this.E.setOnClickListener(new n40(this, 2));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        if (z13) {
            this.G = new di.d1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, this.resourceProvider);
            this.G.addView(view, c8.na.d(-1, 1.0f / org.telegram.messenger.g0.f24225p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, c8.na.e(-1, -2, 87));
            hi.e eVar = new hi.e(context, this.resourceProvider, true);
            eVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(2131232627, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749288, null));
            eVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(eVar, c8.na.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            eVar.setOnClickListener(new n40(this, 3));
            hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
            eVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.kq(2131232629, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.N0(2131749289, null));
            eVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(eVar2, c8.na.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            eVar2.setOnClickListener(new n40(this, 4));
            i11 = -1;
            k0Var.addView(this.G, c8.na.e(-1, -2, 87));
            l0();
        } else {
            i11 = -1;
        }
        x0();
        fi.u2 u2Var = new fi.u2(this, context);
        this.d = u2Var;
        k0Var.addView(u2Var, c8.na.e(i11, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f54199f, c8.na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.ek0 ek0Var6 = this.f54207n;
        Objects.requireNonNull(ek0Var6);
        this.f54215s0 = new dh.k(ek0Var6, k0Var, new p40(ek0Var6, 0));
        this.f54207n.D0(new o40(this, 3));
        hi.w5 w5Var = new hi.w5(context, this.parentLayout);
        this.f54197e = w5Var;
        ((te.a) w5Var.f15678c).a(false, false);
        k0Var.addView(this.f54197e, c8.na.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43200g1.d.add(this);
        }
        View view2 = this.fragmentView;
        m40 m40Var = new m40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(view2, m40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O) {
            w40 w40Var = this.f54219w;
            if (w40Var != null) {
                w40Var.f();
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
            if (this.f54207n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f54207n.getChildCount();
                int i11 = org.telegram.messenger.mp.I8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f54207n.getChildAt(i12);
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
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29599l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29617m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29634n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54214s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54214s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29561j7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54207n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29581k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54214s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f54214s.f37553e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29843y6));
        if (this.f54198e0 != null) {
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f54211q0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f54196d0;
            RectF rectF = this.f54217u0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.G != null) {
                RectF rectF2 = this.f54218v0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.G != null && this.f54194c.f57779e > 0.0f) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f54216t0);
            gVar.e(this.f54215s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y40.k0(boolean):boolean");
    }

    public final void l0() {
        int i7;
        di.d1 d1Var = this.G;
        if (d1Var == null) {
            return;
        }
        float f10 = this.f54194c.f57779e;
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
        this.f54209o0 = l1Var.f56381a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.a10 a10Var = this.E;
        if (a10Var != null) {
            a10Var.setTranslationY(-Math.max(this.f54208n0, this.f54209o0));
        }
    }

    public final void n0() {
        if (this.f54207n.Y0()) {
            this.f54207n.setClipBounds(null);
            return;
        }
        int i7 = this.f54208n0;
        int i10 = this.f54190a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f54192b.f57785f);
        int measuredWidth = this.f54207n.getMeasuredWidth();
        int z10 = org.telegram.messenger.f3.z(i10, this.f54207n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i7) * this.f54194c.f57779e));
        Rect rect = this.f54210p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f54207n.setClipBounds(rect);
    }

    public final void o0() {
        int i7;
        int i10;
        if (this.R) {
            i7 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i7 = 0;
        }
        this.f54207n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f54192b.f57785f), 0, org.telegram.messenger.g0.L(this.f54190a) + this.f54208n0 + i7);
        this.f54214s.setPadding(0, 0, 0, this.f54208n0);
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
        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
        if (n20Var.E) {
            this.f54195c0 = null;
            this.h.c(n20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.n20 n20Var2 = this.f54195c0;
        if (n20Var2 != null) {
            n20Var2.a();
        }
        this.f54195c0 = n20Var;
        n20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.O);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25276r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.O);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25276r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.c10 c10Var = this.f54199f;
            if (c10Var != null) {
                c10Var.updateColors();
            }
            org.telegram.ui.Components.a10 a10Var = this.E;
            if (a10Var != null) {
                a10Var.updateColors();
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
        int childCount = this.f54207n.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f54207n.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                Object object = i4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f28641id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28492id;
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
                        if (this.f54191a0.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i4Var.c(z12, true);
                        i4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                this.f54207n.getClass();
                if (RecyclerView.R(childAt) == this.f54219w.f53116w) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (this.Y == null && this.f54191a0.i()) {
                        N0 = "";
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131751445, null);
                    }
                    y3Var.a(N0, new n40(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.f54191a0.m(); i7++) {
            hashSet.add(Long.valueOf(this.f54191a0.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f54191a0.m(); i10++) {
            arrayList.add(getMessagesController().c2(Long.valueOf(this.f54191a0.j(i10))));
        }
        t40 t40Var = this.f54221y;
        if (t40Var != null) {
            t40Var.g(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z10;
        int L;
        int L2;
        boolean i7 = this.f54191a0.i();
        boolean z11 = this.S;
        int i10 = this.N;
        boolean z12 = false;
        if (!i7 || i10 == 2 || !z11) {
            long j3 = this.H;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.gd.G(this.f54191a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.f54191a0.m(); i11++) {
                        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f54191a0.j(i11)));
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
                    if (this.f54191a0.m() > 5) {
                        int m10 = this.f54191a0.m();
                        if (O0 != null) {
                            str = O0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.f54191a0.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
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
                        d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                        d2VarArr[0].setMultiline(true);
                        if (this.f54191a0.m() == 1) {
                            d2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754390, org.telegram.messenger.n10.k(getMessagesController().c2(Long.valueOf(this.f54191a0.j(0))), true))), "", true, false, false);
                        } else {
                            d2VarArr[0].e(org.telegram.messenger.gd.N0(2131754395, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                        if (org.telegram.messenger.gd.f24314a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.gd.f24314a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        d2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(d2VarArr[0], c8.na.o(-1, -2));
                        d2VarArr[0].setOnClickListener(new b10(d2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754483, null), new zs(10, this, d2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    showDialog(t1Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < this.f54191a0.m(); i12++) {
                    arrayList.add(getMessagesController().s1(getMessagesController().c2(Long.valueOf(this.f54191a0.j(i12)))));
                }
                org.telegram.messenger.mp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.j1(j3);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.go(messagesController2, tL_channels_inviteToChannel, j3, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.ks.f25289t, new Object[0]);
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
                for (int i13 = 0; i13 < this.f54191a0.m(); i13++) {
                    arrayList2.add(Long.valueOf(this.f54191a0.j(i13)));
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
                    presentFragment(new e50(bundle2));
                    return true;
                }
                u40 u40Var = this.f54220x;
                if (u40Var != null) {
                    if (this.Y != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Z != null) {
                        z12 = true;
                    }
                    u40Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.n20 n20Var;
        org.telegram.ui.Components.n20 n20Var2;
        Object c22;
        HashSet hashSet = this.f54201g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f54202h0 = z10;
        this.f54203i0 = z11;
        q40 q40Var = this.h;
        if (q40Var == null) {
            this.f54204j0 = arrayList;
            this.f54205k0 = z10;
            this.f54206l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.n20 n20Var3 = new org.telegram.ui.Components.n20(getParentActivity(), "premium");
            this.Y = n20Var3;
            this.h.a(n20Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (n20Var = this.Y) != null) {
            q40Var.c(n20Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.n20 n20Var4 = new org.telegram.ui.Components.n20(getParentActivity(), "miniApps");
            this.Z = n20Var4;
            this.h.a(n20Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (n20Var2 = this.Z) != null) {
            this.h.c(n20Var2);
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
                org.telegram.ui.Components.n20 n20Var5 = new org.telegram.ui.Components.n20(getParentActivity(), c22);
                this.h.a(n20Var5);
                n20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.g10 g10Var = this.h.d;
        AnimatorSet animatorSet = g10Var.f35271a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g10Var.f35271a.setupEndValues();
            g10Var.f35271a.cancel();
        }
        org.telegram.messenger.g0.Z3(this.f54207n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f54207n, new ii(this, i7, 23));
    }

    public final void w0() {
        w40 w40Var;
        ah.i iVar = this.f54199f.f33883r;
        if (iVar == null) {
            return;
        }
        if (this.N == 2) {
            iVar.setHint(org.telegram.messenger.gd.N0(2131754393, null));
        } else if (!this.S && ((w40Var = this.f54219w) == null || w40Var.H != 0)) {
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
                this.actionBar.setSubtitle(org.telegram.messenger.gd.G(this.f54191a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.f54191a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131748426, org.telegram.messenger.gd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.gd.K0(this.f54191a0.m(), "MembersCountSelected"), Integer.valueOf(this.f54191a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 != 2 && z11) {
            if (this.F && this.f54193b0.isEmpty()) {
                this.E.e(false, true);
                this.F = false;
            } else if (!this.F && !this.f54193b0.isEmpty()) {
                this.E.e(true, true);
                this.F = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.ek0 ek0Var = this.f54207n;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.f54207n.getFastScroll() != null) {
                    this.f54207n.getFastScroll().invalidate();
                }
            }
            q40 q40Var = this.h;
            if (q40Var != null && q40Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                    View childAt = spansContainer.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.n20) {
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
    public final void G(float f10, int i7) {
    }
}
