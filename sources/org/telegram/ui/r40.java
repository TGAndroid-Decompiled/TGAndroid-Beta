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
public class r40 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, qe.b, View.OnClickListener, sh.c {
    public org.telegram.ui.Components.l00 E;
    public boolean F;
    public ci.l1 G;
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
    public org.telegram.ui.Components.y10 Y;
    public org.telegram.ui.Components.y10 Z;
    public final int f49031a;
    public a0.h f49032a0;
    public final qe.c f49033b;
    public ArrayList f49034b0;
    public final qe.a f49035c;
    public org.telegram.ui.Components.y10 f49036c0;
    public ei.e3 d;
    public int f49037d0;
    public gi.n5 f49038e;
    public org.telegram.ui.Components.hc0 f49039e0;
    public org.telegram.ui.Components.n00 f49040f;
    public boolean f49041f0;
    public final HashSet f49042g0;
    public j40 h;
    public boolean f49043h0;
    public boolean f49044i0;
    public ArrayList f49045j0;
    public boolean f49046k0;
    public boolean f49047l0;
    public int m0;
    public org.telegram.ui.Components.tj0 f49048n;
    public int f49049n0;
    public int f49050o0;
    public final Rect f49051p0;
    public final eh.g f49052q0;
    public u4.b0 f49053r;
    public final si.f f49054r0;
    public org.telegram.ui.Components.zu0 f49055s;
    public eh.k f49056s0;
    public final ArrayList f49057t0;
    public final RectF f49058u0;
    public final RectF f49059v0;
    public p40 f49060w;
    public n40 f49061x;
    public m40 f49062y;

    public r40(Bundle bundle) {
        super(bundle);
        int i3;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i3 = 48;
        } else {
            i3 = 0;
        }
        this.f49031a = i3;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f49033b = new qe.c(3, this, xqVar, 350L);
        this.f49035c = new qe.a(4, this, xqVar, 350L, false);
        this.f49032a0 = new a0.h();
        this.f49034b0 = new ArrayList();
        this.f49042g0 = new HashSet();
        this.m0 = -4;
        this.f49051p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f49057t0 = arrayList;
        RectF rectF = new RectF();
        this.f49058u0 = rectF;
        RectF rectF2 = new RectF();
        this.f49059v0 = rectF2;
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
                this.L = getMessagesController().P6 - 1;
            } else {
                org.telegram.messenger.hp messagesController = getMessagesController();
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
            this.f49052q0 = new eh.g(false);
            this.f49054r0 = new si.f(null);
            return;
        }
        this.f49052q0 = null;
        this.f49054r0 = null;
    }

    public static void Z(r40 r40Var, Context context, View view, int i3) {
        long j10;
        String str;
        org.telegram.ui.Components.ac K;
        boolean z10;
        int i10 = r40Var.L;
        long j11 = r40Var.I;
        p40 p40Var = r40Var.f49060w;
        if (i3 == p40Var.f48461x) {
            int i11 = r40Var.currentAccount;
            org.telegram.ui.ActionBar.e6 e6Var = r40Var.resourceProvider;
            h40 h40Var = new h40(r40Var, 0);
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
            s1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.f21385b.nextInt();
            ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new cg.j0(i11, s1Var, context, e6Var, h40Var, 5));
        } else if (i3 == 0 && p40Var.G != 0 && !p40Var.f48457n) {
            TLRPC.ChatFull chatFull = r40Var.J;
            long j12 = r40Var.H;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.hc0 hc0Var = new org.telegram.ui.Components.hc0(context, r40Var, chatFull, j12, z10);
            r40Var.f49039e0 = hc0Var;
            r40Var.showDialog(hc0Var);
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.f29332r) {
                org.telegram.ui.Components.y10 y10Var = r40Var.Y;
                if (y10Var == null) {
                    org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(r40Var.f49040f.f36302r.getContext(), "premium");
                    r40Var.Y = y10Var2;
                    r40Var.h.a(y10Var2);
                    r40Var.Y.setOnClickListener(r40Var);
                } else {
                    r40Var.h.c(y10Var);
                    r40Var.Y = null;
                }
                r40Var.p0();
            } else if (h4Var.f29333s) {
                org.telegram.ui.Components.y10 y10Var3 = r40Var.Z;
                if (y10Var3 == null) {
                    org.telegram.ui.Components.y10 y10Var4 = new org.telegram.ui.Components.y10(r40Var.f49040f.f36302r.getContext(), "miniapps");
                    r40Var.Z = y10Var4;
                    r40Var.h.a(y10Var4);
                    r40Var.Z.setOnClickListener(r40Var);
                } else {
                    r40Var.h.c(y10Var3);
                    r40Var.Z = null;
                }
                r40Var.p0();
            } else {
                Object object = h4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f27150id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f27001id;
                } else {
                    return;
                }
                a0.h hVar = r40Var.K;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (h4Var.P) {
                        int i12 = -r40Var.m0;
                        r40Var.m0 = i12;
                        org.telegram.messenger.g0.G3(i12, h4Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        if (j10 >= 0) {
                            str = org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(r40Var.currentAccount).a2(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (org.telegram.messenger.hp.s1(r40Var.currentAccount).D3()) {
                            K = org.telegram.ui.Components.fc.a0(r40Var).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)));
                        } else {
                            K = org.telegram.ui.Components.fc.a0(r40Var).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)), org.telegram.messenger.bd.M0(2131743769, null), new h40(r40Var, 2));
                        }
                        K.j();
                        return;
                    }
                    org.telegram.ui.Components.y10 y10Var5 = (org.telegram.ui.Components.y10) r40Var.f49032a0.f(j10);
                    if (y10Var5 != null) {
                        r40Var.h.c(y10Var5);
                    } else if (i10 == 0 || r40Var.f49032a0.m() != i10) {
                        if (r40Var.N == 0 && r40Var.f49032a0.m() == r40Var.getMessagesController().W2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r40Var.getParentActivity());
                            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                            s1Var2.S = M0;
                            s1Var2.U = org.telegram.messenger.bd.M0(2131745304, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            r40Var.showDialog(s1Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (r40Var.S && user.bot) {
                                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i13 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.fc.a0(r40Var).t(org.telegram.messenger.bd.M0(2131753108, null), null).j();
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                } else if (i13 != 0) {
                                    TLRPC.Chat M02 = r40Var.getMessagesController().M0(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r40Var.getParentActivity());
                                    boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.f27343a;
                                    if (w10) {
                                        s1Var3.S = org.telegram.messenger.bd.M0(2131754461, null);
                                        s1Var3.U = org.telegram.messenger.bd.M0(2131754460, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754466, null), new org.telegram.ui.Components.i41(16, r40Var, user));
                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    } else {
                                        s1Var3.U = org.telegram.messenger.bd.M0(2131752566, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    }
                                    r40Var.showDialog(s1Var3);
                                    return;
                                }
                            }
                            r40Var.getMessagesController().X3(user, !r40Var.U, false);
                        } else if (object instanceof TLRPC.Chat) {
                            r40Var.getMessagesController().Q3((TLRPC.Chat) object, !r40Var.U);
                        }
                        org.telegram.ui.Components.y10 y10Var6 = new org.telegram.ui.Components.y10(r40Var.f49040f.f36302r.getContext(), object);
                        r40Var.h.a(y10Var6);
                        y10Var6.setOnClickListener(r40Var);
                    } else {
                        return;
                    }
                    r40Var.x0();
                    if (!r40Var.U && !r40Var.T) {
                        r40Var.p0();
                    } else {
                        org.telegram.messenger.g0.K3(r40Var.f49040f.f36302r);
                    }
                    if (r40Var.f49040f.f36302r.length() > 0) {
                        r40Var.f49040f.f36302r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void e0(r40 r40Var) {
        if (r40Var.G == null) {
            return;
        }
        r40Var.f49035c.a(!r40Var.f49032a0.i(), true);
    }

    public static void f0(r40 r40Var, Canvas canvas, RectF rectF, Paint paint) {
        si.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.az.f() && (fVar = r40Var.f49054r0) != null) {
            fVar.l(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
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
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 3) {
            int paddingTop = this.f49048n.getPaddingTop();
            o0();
            org.telegram.ui.Components.n00 n00Var = this.f49040f;
            qe.c cVar2 = this.f49033b;
            n00Var.setTranslationY(cVar2.f53846f);
            n0();
            this.f49038e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f53846f);
            this.d.invalidate();
            int paddingTop2 = this.f49048n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((qe.a) this.f49038e.f13304c).f53841f) {
                this.f49048n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i3 == 4) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
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
        int i3;
        int i10;
        int i11;
        this.U = false;
        this.T = false;
        this.f49034b0.clear();
        this.f49032a0.b();
        this.f49036c0 = null;
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
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748296, null));
        } else if (z10) {
            if (this.I != 0) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752526, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131749508, null));
            }
        } else {
            int i13 = this.V;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750806, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754267, null));
                }
            } else if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750730, null));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748300, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748298, null));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i3 = 2131748281;
                } else {
                    i3 = 2131748297;
                }
                kVar.setTitle(org.telegram.messenger.bd.M0(i3, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 5));
        this.f49040f = new org.telegram.ui.Components.n00(context, this.resourceProvider);
        l0 l0Var = new l0(9, context, this);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        j40 j40Var = new j40(this, context, this.currentAccount);
        this.h = j40Var;
        j40Var.setDelegate(new f40(this, 0));
        this.h.getSpansContainer().setOnClickListener(new g40(this, 1));
        j40 j40Var2 = this.h;
        this.f49032a0 = j40Var2.f37586b;
        this.f49034b0 = j40Var2.f37587c;
        w0();
        this.f49040f.f36302r.setOnEditorActionListener(new ea(this, 4));
        this.f49040f.f36302r.setOnKeyListener(new k40(0, this));
        this.f49040f.f36302r.addTextChangedListener(new n0(this, 8));
        ArrayList arrayList = this.f49045j0;
        if (arrayList != null) {
            u0(arrayList, this.f49046k0, this.f49047l0);
        }
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(6);
        izVar.f34869x = false;
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, izVar, 1, null);
        this.f49055s = zu0Var;
        zu0Var.addView(izVar);
        this.f49055s.e(true, false);
        this.f49055s.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.f49053r = new u4.b0(1, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f49048n = tj0Var;
        tj0Var.setFastScrollEnabled(0);
        this.f49048n.setEmptyView(this.f49055s);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f49048n;
        p40 p40Var = new p40(this, context);
        this.f49060w = p40Var;
        tj0Var2.setAdapter(p40Var);
        this.f49048n.setLayoutManager(this.f49053r);
        this.f49048n.setVerticalScrollBarEnabled(false);
        this.f49048n.setClipToPadding(false);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f49048n;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        tj0Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.tj0 tj0Var4 = this.f49048n;
        float f10 = -this.f49031a;
        l0Var.addView(tj0Var4, b8.mf.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        l0Var.addView(this.f49055s);
        this.f49048n.setOnItemClickListener(new ei.q4(18, this, context));
        this.f49048n.setOnScrollListener(new h3(this, 14));
        org.telegram.ui.Components.tj0 tj0Var5 = this.f49048n;
        tj0Var5.X1 = true;
        tj0Var5.Y1 = 0;
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.E = l00Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
            w1Var.f28773l = 180;
            w1Var.invalidateSelf();
            this.E.f35530c.setImageDrawable(w1Var);
        } else {
            l00Var.f35530c.setImageResource(2131231195);
        }
        if (!z13) {
            l0Var.addView(this.E, org.telegram.ui.Components.l00.b());
        }
        this.E.setOnClickListener(new g40(this, 2));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        if (z13) {
            this.G = new ci.l1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, this.resourceProvider);
            this.G.addView(view, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.f22607p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, b8.mf.e(-1, -2, 87));
            gi.d dVar = new gi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232620, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749489, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, b8.mf.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new g40(this, 3));
            gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232622, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131749490, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, b8.mf.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new g40(this, 4));
            i11 = -1;
            l0Var.addView(this.G, b8.mf.e(-1, -2, 87));
            l0();
        } else {
            i11 = -1;
        }
        x0();
        ei.e3 e3Var = new ei.e3(this, context);
        this.d = e3Var;
        l0Var.addView(e3Var, b8.mf.e(i11, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f49040f, b8.mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.tj0 tj0Var6 = this.f49048n;
        Objects.requireNonNull(tj0Var6);
        this.f49056s0 = new eh.k(tj0Var6, l0Var, new i40(tj0Var6, 0));
        this.f49048n.D0(new h40(this, 3));
        gi.n5 n5Var = new gi.n5(context, this.parentLayout);
        this.f49038e = n5Var;
        ((qe.a) n5Var.f13304c).a(false, false);
        l0Var.addView(this.f49038e, b8.mf.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.f41300i1.d.add(this);
        }
        View view2 = this.fragmentView;
        f40 f40Var = new f40(this, 3);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(view2, f40Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O) {
            p40 p40Var = this.f49060w;
            if (p40Var != null) {
                p40Var.f();
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            if (this.f49048n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f49048n.getChildCount();
                int i11 = org.telegram.messenger.hp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f49048n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.R) {
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49055s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49055s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27973i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27990j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49048n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49055s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49055s.f41128e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28273y6));
        if (this.f49039e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        eh.g gVar;
        int i3;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f49052q0) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(48.0f) + this.f49037d0;
            RectF rectF = this.f49058u0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -L;
            rectF.inset(0.0f, f10);
            if (this.G != null) {
                RectF rectF2 = this.f49059v0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.G != null && this.f49035c.f53840e > 0.0f) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            gVar.g(i3, this.f49057t0);
            gVar.e(this.f49056s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean k0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r40.k0(boolean):boolean");
    }

    public final void l0() {
        int i3;
        ci.l1 l1Var = this.G;
        if (l1Var == null) {
            return;
        }
        float f10 = this.f49035c.f53840e;
        l1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.G.setAlpha(f10);
        ci.l1 l1Var2 = this.G;
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        l1Var2.setVisibility(i3);
    }

    @Override
    public final void m(r0.k1 k1Var) {
        this.f49050o0 = k1Var.f54026a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.l00 l00Var = this.E;
        if (l00Var != null) {
            l00Var.setTranslationY(-Math.max(this.f49049n0, this.f49050o0));
        }
    }

    public final void n0() {
        if (this.f49048n.Y0()) {
            this.f49048n.setClipBounds(null);
            return;
        }
        int i3 = this.f49049n0;
        int i10 = this.f49031a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f49033b.f53846f);
        int measuredWidth = this.f49048n.getMeasuredWidth();
        int z10 = org.telegram.messenger.k5.z(i10, this.f49048n.getMeasuredHeight(), (int) ((org.telegram.messenger.g0.L(76.0f) + i3) * this.f49035c.f53840e));
        Rect rect = this.f49051p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.f49048n.setClipBounds(rect);
    }

    public final void o0() {
        int i3;
        int i10;
        if (this.R) {
            i3 = org.telegram.messenger.g0.L(76.0f);
        } else {
            i3 = 0;
        }
        this.f49048n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i10 + 48) + ((int) this.f49033b.f53846f), 0, org.telegram.messenger.g0.L(this.f49031a) + this.f49049n0 + i3);
        this.f49055s.setPadding(0, 0, 0, this.f49049n0);
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
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        if (y10Var.E) {
            this.f49036c0 = null;
            this.h.c(y10Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.y10 y10Var2 = this.f49036c0;
        if (y10Var2 != null) {
            y10Var2.a();
        }
        this.f49036c0 = y10Var;
        y10Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.O);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.O);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.R);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.n00 n00Var = this.f49040f;
            if (n00Var != null) {
                n00Var.updateColors();
            }
            org.telegram.ui.Components.l00 l00Var = this.E;
            if (l00Var != null) {
                l00Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        String M0;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f49048n.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f49048n.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f27150id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f27001id;
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
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.K;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.f49032a0.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h4Var.c(z12, true);
                        h4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.f49048n.getClass();
                if (RecyclerView.R(childAt) == this.f49060w.f48460w) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                    if (this.Y == null && this.f49032a0.i()) {
                        M0 = "";
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131751458, null);
                    }
                    x3Var.a(M0, new g40(this, 0));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < this.f49032a0.m(); i3++) {
            hashSet.add(Long.valueOf(this.f49032a0.j(i3)));
        }
        return hashSet;
    }

    public final void r0(int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f49032a0.m(); i10++) {
            arrayList.add(getMessagesController().a2(Long.valueOf(this.f49032a0.j(i10))));
        }
        m40 m40Var = this.f49062y;
        if (m40Var != null) {
            m40Var.h(i3, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean z10;
        int L;
        int L2;
        boolean i3 = this.f49032a0.i();
        boolean z11 = this.S;
        int i10 = this.N;
        boolean z12 = false;
        if (!i3 || i10 == 2 || !z11) {
            long j10 = this.H;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String G = org.telegram.messenger.bd.G(this.f49032a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < this.f49032a0.m(); i11++) {
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f49032a0.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    org.telegram.messenger.hp messagesController = getMessagesController();
                    if (j10 == 0) {
                        j10 = this.I;
                    }
                    TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
                    String str = "";
                    if (this.f49032a0.m() > 5) {
                        int m10 = this.f49032a0.m();
                        if (M0 != null) {
                            str = M0.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(m10, "AddManyMembersAlertNamesText", str)));
                        String format = String.format("%d", Integer.valueOf(this.f49032a0.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        s1Var.U = spannableStringBuilder;
                    } else {
                        if (M0 != null) {
                            str = M0.title;
                        }
                        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754399, sb2, str));
                    }
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    if (!org.telegram.messenger.t3.T(M0)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                        c2VarArr[0] = c2Var;
                        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                        c2VarArr[0].setMultiline(true);
                        if (this.f49032a0.m() == 1) {
                            c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754393, org.telegram.messenger.l10.j(getMessagesController().a2(Long.valueOf(this.f49032a0.j(0))), true))), "", true, false, false);
                        } else {
                            c2VarArr[0].e(org.telegram.messenger.bd.M0(2131754398, null), "", true, false, false);
                        }
                        org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                        if (org.telegram.messenger.bd.f21784a0) {
                            L = org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(8.0f);
                        }
                        if (org.telegram.messenger.bd.f21784a0) {
                            L2 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        }
                        c2Var2.setPadding(L, 0, L2, 0);
                        linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                        c2VarArr[0].setOnClickListener(new q00(c2VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754486, null), new org.telegram.ui.Components.i41(17, this, c2VarArr));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    showDialog(s1Var);
                    return true;
                }
            } else if (i10 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < this.f49032a0.m(); i12++) {
                    arrayList.add(getMessagesController().q1(getMessagesController().a2(Long.valueOf(this.f49032a0.j(i12)))));
                }
                org.telegram.messenger.hp messagesController2 = getMessagesController();
                messagesController2.getClass();
                if (!arrayList.isEmpty()) {
                    TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                    tL_channels_inviteToChannel.channel = messagesController2.h1(j10);
                    tL_channels_inviteToChannel.users = arrayList;
                    messagesController2.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.fj(messagesController2, tL_channels_inviteToChannel, j10, 6));
                }
                getNotificationCenter().k(org.telegram.messenger.hs.f23305t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wm(bundle), true);
                return true;
            } else if (this.F) {
                if (z11) {
                    r0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < this.f49032a0.m(); i13++) {
                    arrayList2.add(Long.valueOf(this.f49032a0.j(i13)));
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
                    presentFragment(new y40(bundle2));
                    return true;
                }
                n40 n40Var = this.f49061x;
                if (n40Var != null) {
                    if (this.Y != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Z != null) {
                        z12 = true;
                    }
                    n40Var.a(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.y10 y10Var;
        org.telegram.ui.Components.y10 y10Var2;
        Object a22;
        HashSet hashSet = this.f49042g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f49043h0 = z10;
        this.f49044i0 = z11;
        j40 j40Var = this.h;
        if (j40Var == null) {
            this.f49045j0 = arrayList;
            this.f49046k0 = z10;
            this.f49047l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.y10 y10Var3 = new org.telegram.ui.Components.y10(getParentActivity(), "premium");
            this.Y = y10Var3;
            this.h.a(y10Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (y10Var = this.Y) != null) {
            j40Var.c(y10Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.y10 y10Var4 = new org.telegram.ui.Components.y10(getParentActivity(), "miniApps");
            this.Z = y10Var4;
            this.h.a(y10Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (y10Var2 = this.Z) != null) {
            this.h.c(y10Var2);
            this.Z = null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            if (longValue < 0) {
                a22 = getMessagesController().M0(Long.valueOf(-longValue));
            } else {
                a22 = getMessagesController().a2(l10);
            }
            if (a22 != null) {
                org.telegram.ui.Components.y10 y10Var5 = new org.telegram.ui.Components.y10(getParentActivity(), a22);
                this.h.a(y10Var5);
                y10Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.q00 q00Var = this.h.d;
        AnimatorSet animatorSet = q00Var.f37300a;
        if (animatorSet != null && animatorSet.isRunning()) {
            q00Var.f37300a.setupEndValues();
            q00Var.f37300a.cancel();
        }
        org.telegram.messenger.g0.b4(this.f49048n);
    }

    public final void v0(int i3) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.f49048n, new org.telegram.ui.Components.o2(this, i3, 15));
    }

    public final void w0() {
        p40 p40Var;
        bh.g gVar = this.f49040f.f36302r;
        if (gVar == null) {
            return;
        }
        if (this.N == 2) {
            gVar.setHint(org.telegram.messenger.bd.M0(2131754396, null));
        } else if (!this.S && ((p40Var = this.f49060w) == null || p40Var.H != 0)) {
            if (!this.P && !this.Q) {
                if (this.R) {
                    gVar.setHint(org.telegram.messenger.bd.M0(2131748295, null));
                    return;
                } else {
                    gVar.setHint(org.telegram.messenger.bd.M0(2131745605, null));
                    return;
                }
            }
            gVar.setHint(org.telegram.messenger.bd.M0(2131745778, null));
        } else {
            gVar.setHint(org.telegram.messenger.bd.M0(2131745779, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i3 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i3 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.bd.G(this.f49032a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.f49032a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.bd.a0(null, null, 2131748627, org.telegram.messenger.bd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.bd.K0(this.f49032a0.m(), "MembersCountSelected"), Integer.valueOf(this.f49032a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i3 != 2 && z11) {
            if (this.F && this.f49034b0.isEmpty()) {
                this.E.e(false, true);
                this.F = false;
            } else if (!this.F && !this.f49034b0.isEmpty()) {
                this.E.e(true, true);
                this.F = true;
            }
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.tj0 tj0Var = this.f49048n;
            if (tj0Var != null) {
                tj0Var.x1();
                if (this.f49048n.getFastScroll() != null) {
                    this.f49048n.getFastScroll().invalidate();
                }
            }
            j40 j40Var = this.h;
            if (j40Var != null && j40Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i3 = 0; i3 < spansContainer.getChildCount(); i3++) {
                    View childAt = spansContainer.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Components.y10) {
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
    public final void F(float f10, int i3) {
    }
}
