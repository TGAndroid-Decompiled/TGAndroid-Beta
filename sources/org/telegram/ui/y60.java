package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class y60 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, xd.b, View.OnClickListener, ch.d {
    public boolean B;
    public dg.v3 C;
    public final long D;
    public final long E;
    public TLRPC.ChatFull F;
    public a0.h G;
    public final int H;
    public String I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public boolean P;
    public boolean Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public org.telegram.ui.Components.n30 U;
    public org.telegram.ui.Components.n30 V;
    public a0.h W;
    public ArrayList X;
    public org.telegram.ui.Components.n30 Y;
    public int Z;
    public final int f40411a;
    public org.telegram.ui.Components.de0 f40412a0;
    public final xd.c f40413b;
    public boolean f40414b0;
    public final xd.a f40415c;
    public final HashSet f40416c0;
    public nh.a3 d;
    public boolean f40417d0;
    public eg.i0 e;
    public boolean f40418e0;
    public org.telegram.ui.Components.c20 f40419f;
    public ArrayList f40420f0;
    public boolean f40421g0;
    public q60 h;
    public boolean f40422h0;
    public int f40423i0;
    public int f40424j0;
    public int f40425k0;
    public final Rect f40426l0;
    public final ng.e m0;
    public org.telegram.ui.Components.sl0 f40427n;
    public final sg.d f40428n0;
    public ng.k f40429o0;
    public final ArrayList f40430p0;
    public final RectF f40431q0;
    public f2.i0 f40432r;
    public final RectF f40433r0;
    public org.telegram.ui.Components.zw0 f40434s;
    public w60 v;
    public u60 f40435w;
    public t60 f40436x;
    public org.telegram.ui.Components.z10 f40437y;

    public y60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40411a = i10;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f40413b = new xd.c(3, this, nrVar, 350L);
        this.f40415c = new xd.a(4, this, nrVar, 350L, false);
        this.W = new a0.h();
        this.X = new ArrayList();
        this.f40416c0 = new HashSet();
        this.f40423i0 = -4;
        this.f40426l0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f40430p0 = arrayList;
        RectF rectF = new RectF();
        this.f40431q0 = rectF;
        RectF rectF2 = new RectF();
        this.f40433r0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i13 = bundle.getInt("chatType", 0);
        this.J = i13;
        this.K = bundle.getBoolean("forImport", false);
        boolean z4 = bundle.getBoolean("isAlwaysShare", false);
        this.L = z4;
        boolean z10 = bundle.getBoolean("isNeverShare", false);
        this.M = z10;
        boolean z11 = bundle.getBoolean("isCall", false);
        this.N = z11;
        boolean z12 = bundle.getBoolean("addToGroup", false);
        this.O = z12;
        this.R = bundle.getInt("chatAddType", 0);
        this.S = bundle.getBoolean("allowPremium", false);
        this.T = bundle.getBoolean("allowMiniapps", false);
        this.D = bundle.getLong("chatId");
        this.E = bundle.getLong("channelId");
        if (!z4 && !z10 && !z12) {
            if (z11) {
                this.H = getMessagesController().conferenceCallSizeLimit - 1;
            } else {
                MessagesController messagesController = getMessagesController();
                if (i13 == 0) {
                    i11 = messagesController.maxMegagroupCount;
                } else {
                    i11 = messagesController.maxBroadcastCount;
                }
                this.H = i11;
            }
        } else {
            this.H = 0;
        }
        if (i12 >= 31) {
            this.m0 = new ng.e(false);
            this.f40428n0 = new sg.d(null);
            return;
        }
        this.m0 = null;
        this.f40428n0 = null;
    }

    public static void U(y60 y60Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.ic J;
        boolean z4;
        int i11 = y60Var.H;
        long j11 = y60Var.E;
        w60 w60Var = y60Var.v;
        if (i10 == w60Var.f39351w) {
            int i12 = y60Var.currentAccount;
            org.telegram.ui.ActionBar.f6 f6Var = y60Var.resourceProvider;
            o60 o60Var = new o60(y60Var, 0);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            d2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new lf.i0(i12, d2Var, context, f6Var, o60Var, 5));
        } else if (i10 == 0 && w60Var.C != 0 && !w60Var.f39348n) {
            TLRPC.ChatFull chatFull = y60Var.F;
            long j12 = y60Var.D;
            if (j11 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.Components.de0 de0Var = new org.telegram.ui.Components.de0(context, y60Var, chatFull, j12, z4);
            y60Var.f40412a0 = de0Var;
            y60Var.showDialog(de0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f21093r) {
                org.telegram.ui.Components.n30 n30Var = y60Var.U;
                if (n30Var == null) {
                    org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(y60Var.f40419f.f23815r.getContext(), "premium");
                    y60Var.U = n30Var2;
                    y60Var.h.a(n30Var2);
                    y60Var.U.setOnClickListener(y60Var);
                } else {
                    y60Var.h.c(n30Var);
                    y60Var.U = null;
                }
                y60Var.k0();
            } else if (g4Var.f21094s) {
                org.telegram.ui.Components.n30 n30Var3 = y60Var.V;
                if (n30Var3 == null) {
                    org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(y60Var.f40419f.f23815r.getContext(), "miniapps");
                    y60Var.V = n30Var4;
                    y60Var.h.a(n30Var4);
                    y60Var.V.setOnClickListener(y60Var);
                } else {
                    y60Var.h.c(n30Var3);
                    y60Var.V = null;
                }
                y60Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z10 = object instanceof TLRPC.User;
                if (z10) {
                    j10 = ((TLRPC.User) object).f19331id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19184id;
                } else {
                    return;
                }
                a0.h hVar = y60Var.G;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (g4Var.L) {
                        int i13 = -y60Var.f40423i0;
                        y60Var.f40423i0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(y60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(y60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.qc.a0(y60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.qc.a0(y60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new o60(y60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.n30 n30Var5 = (org.telegram.ui.Components.n30) y60Var.W.f(j10);
                    if (n30Var5 != null) {
                        y60Var.h.c(n30Var5);
                    } else if (i11 == 0 || y60Var.W.m() != i11) {
                        if (y60Var.J == 0 && y60Var.W.m() == y60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f19503a;
                            d2Var2.O = string;
                            d2Var2.Q = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            y60Var.showDialog(d2Var2);
                            return;
                        }
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (y60Var.O && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.qc.a0(y60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = y60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(y60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f19503a;
                                    if (canAddAdmins) {
                                        d2Var3.O = LocaleController.getString(R.string.AddBotAdminAlert);
                                        d2Var3.Q = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new qs(11, y60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        d2Var3.Q = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    y60Var.showDialog(d2Var3);
                                    return;
                                }
                            }
                            y60Var.getMessagesController().putUser(user, !y60Var.Q);
                        } else if (object instanceof TLRPC.Chat) {
                            y60Var.getMessagesController().putChat((TLRPC.Chat) object, !y60Var.Q);
                        }
                        org.telegram.ui.Components.n30 n30Var6 = new org.telegram.ui.Components.n30(y60Var.f40419f.f23815r.getContext(), object);
                        y60Var.h.a(n30Var6);
                        n30Var6.setOnClickListener(y60Var);
                    } else {
                        return;
                    }
                    y60Var.s0();
                    if (!y60Var.Q && !y60Var.P) {
                        y60Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(y60Var.f40419f.f23815r);
                    }
                    if (y60Var.f40419f.f23815r.length() > 0) {
                        y60Var.f40419f.f23815r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(y60 y60Var) {
        if (y60Var.C == null) {
            return;
        }
        y60Var.f40415c.a(!y60Var.W.i(), true);
    }

    public static void a0(y60 y60Var, Canvas canvas, RectF rectF, Paint paint) {
        sg.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = y60Var.f40428n0) != null) {
            dVar.X(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 3) {
            int paddingTop = this.f40427n.getPaddingTop();
            j0();
            org.telegram.ui.Components.c20 c20Var = this.f40419f;
            xd.c cVar2 = this.f40413b;
            c20Var.setTranslationY(cVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f40427n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((xd.a) this.e.f5302c).f46893f) {
                this.f40427n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            g0();
            i0();
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    @Override
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.Q = false;
        this.P = false;
        this.X.clear();
        this.W.b();
        this.Y = null;
        boolean z4 = this.O;
        int i12 = this.J;
        if (i12 == 2) {
            this.B = true;
        } else {
            this.B = !z4;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.I);
        boolean z10 = this.M;
        boolean z11 = this.L;
        boolean z12 = this.N;
        if (!isEmpty) {
            this.actionBar.setTitle(this.I);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (z4) {
            if (this.E != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
            }
        } else {
            int i13 = this.R;
            if (z11) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (z10) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
                }
            } else {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (i12 == 0) {
                    i10 = R.string.NewGroup;
                } else {
                    i10 = R.string.NewBroadcastList;
                }
                kVar.setTitle(LocaleController.getString(i10));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 13));
        this.f40419f = new org.telegram.ui.Components.c20(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 7);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        q60 q60Var = new q60(this, context, this.currentAccount);
        this.h = q60Var;
        q60Var.setDelegate(new n60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new p60(this, 0));
        q60 q60Var2 = this.h;
        this.W = q60Var2.f25018b;
        this.X = q60Var2.f25019c;
        r0();
        this.f40419f.f23815r.setOnEditorActionListener(new ha(this, 4));
        this.f40419f.f23815r.setOnKeyListener(new r60(0, this));
        this.f40419f.f23815r.addTextChangedListener(new n0(this, 6));
        ArrayList arrayList = this.f40420f0;
        if (arrayList != null) {
            p0(arrayList, this.f40421g0, this.f40422h0);
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(6);
        t00Var.f28855w = false;
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, t00Var, 1, null);
        this.f40434s = zw0Var;
        zw0Var.addView(t00Var);
        this.f40434s.e(true, false);
        this.f40434s.d.setText(LocaleController.getString(R.string.NoResult));
        l0Var.addView(this.f40434s);
        this.f40432r = new f2.i0(1, false);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f40427n = sl0Var;
        sl0Var.setFastScrollEnabled(0);
        this.f40427n.setEmptyView(this.f40434s);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f40427n;
        w60 w60Var = new w60(this, context);
        this.v = w60Var;
        sl0Var2.setAdapter(w60Var);
        this.f40427n.setLayoutManager(this.f40432r);
        this.f40427n.setVerticalScrollBarEnabled(false);
        this.f40427n.setClipToPadding(false);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f40427n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.sl0 sl0Var4 = this.f40427n;
        float f10 = -this.f40411a;
        l0Var.addView(sl0Var4, k7.b6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        this.f40427n.setOnItemClickListener(new gg.v0(18, this, context));
        this.f40427n.setOnScrollListener(new l3(this, 13));
        org.telegram.ui.Components.sl0 sl0Var5 = this.f40427n;
        sl0Var5.V1 = true;
        sl0Var5.W1 = 0;
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f40437y = z10Var;
        if (!z10 && !z11 && !z4) {
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            i2Var.f19796l = 180;
            i2Var.invalidateSelf();
            this.f40437y.f31207c.setImageDrawable(i2Var);
        } else {
            z10Var.f31207c.setImageResource(R.drawable.floating_check);
        }
        if (!z12) {
            l0Var.addView(this.f40437y, org.telegram.ui.Components.z10.b());
        }
        this.f40437y.setOnClickListener(new p60(this, 1));
        this.f40437y.e(this.B, false);
        this.f40437y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z12) {
            this.C = new dg.v3(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, this.resourceProvider));
            this.C.addView(view, k7.b6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.C.addView(linearLayout, k7.b6.e(-1, -2, 87));
            ph.d dVar = new ph.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, k7.b6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new p60(this, 2));
            ph.d dVar2 = new ph.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.mq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, k7.b6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new p60(this, 3));
            l0Var.addView(this.C, k7.b6.e(-1, -2, 87));
            g0();
        }
        s0();
        nh.a3 a3Var = new nh.a3(this, context);
        this.d = a3Var;
        l0Var.addView(a3Var, k7.b6.e(-1, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f40419f, k7.b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.sl0 sl0Var6 = this.f40427n;
        Objects.requireNonNull(sl0Var6);
        this.f40429o0 = new ng.k(sl0Var6, l0Var, new ts(sl0Var6, 0));
        this.f40427n.C0(new o60(this, 3));
        eg.i0 i0Var = new eg.i0(context, this.parentLayout);
        this.e = i0Var;
        i0Var.b(false, false);
        l0Var.addView(this.e, k7.b6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f31621d1.d.add(this);
        }
        View view2 = this.fragmentView;
        n60 n60Var = new n60(this, 3);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(view2, n60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            w60 w60Var = this.v;
            if (w60Var != null) {
                w60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f40427n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f40427n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f40427n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        ng.e eVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.m0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.Z;
            RectF rectF = this.f40431q0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f10 = -dp;
            rectF.inset(0.0f, f10);
            if (this.C != null) {
                RectF rectF2 = this.f40433r0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.C.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f10);
            }
            if (this.C != null && this.f40415c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f40430p0);
            eVar.e(this.f40429o0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y60.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        dg.v3 v3Var = this.C;
        if (v3Var == null) {
            return;
        }
        float f10 = this.f40415c.e;
        v3Var.setTranslationY((1.0f - f10) * AndroidUtilities.dp(12.0f));
        this.C.setAlpha(f10);
        dg.v3 v3Var2 = this.C;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        v3Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20050l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20068m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20086n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40434s, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40434s, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19978h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i12 = org.telegram.ui.ActionBar.j6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19997i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20014j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20085n6));
        int i13 = org.telegram.ui.ActionBar.j6.f20281y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40427n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        int i14 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40434s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40434s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.de0 de0Var = this.f40412a0;
        if (de0Var != null) {
            arrayList.addAll(de0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.z10 z10Var = this.f40437y;
        if (z10Var != null) {
            z10Var.setTranslationY(-Math.max(this.f40424j0, this.f40425k0));
        }
    }

    public final void i0() {
        if (this.f40427n.Z0()) {
            this.f40427n.setClipBounds(null);
            return;
        }
        int i10 = this.f40424j0;
        int i11 = this.f40411a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40413b.e);
        int measuredWidth = this.f40427n.getMeasuredWidth();
        int B = org.telegram.messenger.y3.B(i11, this.f40427n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f40415c.e));
        Rect rect = this.f40426l0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f40427n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i10;
        if (this.N) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.sl0 sl0Var = this.f40427n;
        int i11 = this.f40411a;
        sl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40413b.e), 0, AndroidUtilities.dp(i11) + this.f40424j0 + i10);
        this.f40434s.setPadding(0, 0, 0, this.f40424j0);
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.f40425k0 = m1Var.f43130a.f(8).d;
        h0();
    }

    public final void k0() {
        String string;
        long j10;
        boolean z4;
        boolean z10;
        boolean z11;
        int childCount = this.f40427n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f40427n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19331id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19184id;
                } else {
                    boolean z12 = object instanceof String;
                    if (z12 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.U != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g4Var.c(z10, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z12 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.V != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        g4Var.c(z4, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.G;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.W.h(j10) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g4Var.c(z11, true);
                        g4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.u3) {
                this.f40427n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    if (this.U == null && this.W.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    u3Var.b(string, new p60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.W.m(); i10++) {
            hashSet.add(Long.valueOf(this.W.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.W.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.W.j(i11))));
        }
        t60 t60Var = this.f40436x;
        if (t60Var != null) {
            t60Var.j(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean z4;
        int dp;
        int dp2;
        boolean i10 = this.W.i();
        boolean z10 = this.O;
        int i11 = this.J;
        boolean z11 = false;
        if (!i10 || i11 == 2 || !z10) {
            long j10 = this.D;
            if (z10) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.W.m(), new Object[0]);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = formatPluralString;
                    StringBuilder sb = new StringBuilder();
                    for (int i12 = 0; i12 < this.W.m(); i12++) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.W.j(i12)));
                        if (user != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append("**");
                            sb.append(ContactsController.formatName(user.first_name, user.last_name));
                            sb.append("**");
                        }
                    }
                    MessagesController messagesController = getMessagesController();
                    if (j10 == 0) {
                        j10 = this.E;
                    }
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                    String str = "";
                    if (this.W.m() > 5) {
                        int m9 = this.W.m();
                        if (chat != null) {
                            str = chat.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", m9, str)));
                        String format = String.format("%d", Integer.valueOf(this.W.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        d2Var.Q = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb, str));
                    }
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                        z1VarArr[0] = z1Var;
                        z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        z1VarArr[0].setMultiline(true);
                        if (this.W.m() == 1) {
                            z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.W.j(0)))))), "", true, false, false);
                        } else {
                            z1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
                        if (LocaleController.isRTL) {
                            dp = AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            dp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            dp2 = AndroidUtilities.dp(16.0f);
                        }
                        z1Var2.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(z1VarArr[0], k7.b6.n(-1, -2));
                        z1VarArr[0].setOnClickListener(new q20(z1VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new qs(12, this, z1VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(d2Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i14 = 0; i14 < this.W.m(); i14++) {
                    TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.W.j(i14))));
                    if (inputUser != null) {
                        arrayList.add(inputUser);
                    }
                }
                getMessagesController().addUsersToChannel(j10, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new xn(bundle), true);
                return true;
            } else if (this.B) {
                if (z10) {
                    m0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < this.W.m(); i15++) {
                    arrayList2.add(Long.valueOf(this.W.j(i15)));
                }
                if (!this.L && !this.M) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        jArr[i16] = ((Long) arrayList2.get(i16)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.K);
                    presentFragment(new e70(bundle2));
                    return true;
                }
                u60 u60Var = this.f40435w;
                if (u60Var != null) {
                    if (this.U != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.V != null) {
                        z11 = true;
                    }
                    u60Var.b(arrayList2, z4, z11);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!f0(z4)) {
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f27182y) {
            this.Y = null;
            this.h.c(n30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.Y;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.Y = n30Var;
        n30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void p0(ArrayList arrayList, boolean z4, boolean z10) {
        org.telegram.ui.Components.n30 n30Var;
        org.telegram.ui.Components.n30 n30Var2;
        Object user;
        HashSet hashSet = this.f40416c0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f40417d0 = z4;
        this.f40418e0 = z10;
        q60 q60Var = this.h;
        if (q60Var == null) {
            this.f40420f0 = arrayList;
            this.f40421g0 = z4;
            this.f40422h0 = z10;
            return;
        }
        if (z4 && this.U == null) {
            org.telegram.ui.Components.n30 n30Var3 = new org.telegram.ui.Components.n30(getParentActivity(), "premium");
            this.U = n30Var3;
            this.h.a(n30Var3);
            this.U.setOnClickListener(this);
        } else if (!z4 && (n30Var = this.U) != null) {
            q60Var.c(n30Var);
            this.U = null;
        }
        if (z10 && this.V == null) {
            org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(getParentActivity(), "miniApps");
            this.V = n30Var4;
            this.h.a(n30Var4);
            this.V.setOnClickListener(this);
        } else if (!z10 && (n30Var2 = this.V) != null) {
            this.h.c(n30Var2);
            this.V = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            if (longValue < 0) {
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(l10);
            }
            if (user != null) {
                org.telegram.ui.Components.n30 n30Var5 = new org.telegram.ui.Components.n30(getParentActivity(), user);
                this.h.a(n30Var5);
                n30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.f20 f20Var = this.h.d;
        AnimatorSet animatorSet = f20Var.f24753a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f20Var.f24753a.setupEndValues();
            f20Var.f24753a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f40427n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f40427n, new org.telegram.ui.Components.hm(this, i10, 14));
    }

    public final void r0() {
        w60 w60Var;
        kg.f fVar = this.f40419f.f23815r;
        if (fVar == null) {
            return;
        }
        if (this.J == 2) {
            fVar.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.O && ((w60Var = this.v) == null || w60Var.D != 0)) {
            if (!this.L && !this.M) {
                if (this.N) {
                    fVar.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    fVar.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            fVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            fVar.setHint(LocaleController.getString(R.string.SearchForPeople));
        }
    }

    public final void s0() {
        boolean z4 = this.L;
        int i10 = this.J;
        boolean z10 = this.O;
        if (!z4 && !this.M && !z10) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.W.m(), new Object[0]));
            } else {
                boolean i11 = this.W.i();
                int i12 = this.H;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.N ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.W.m()), Integer.valueOf(this.W.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z10) {
            if (this.B && this.X.isEmpty()) {
                this.f40437y.e(false, true);
                this.B = false;
            } else if (!this.B && !this.X.isEmpty()) {
                this.f40437y.e(true, true);
                this.B = true;
            }
        }
    }

    @Override
    public final void J() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
