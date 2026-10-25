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
public class r60 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, oe.d, View.OnClickListener, rh.d {
    public boolean E;
    public bi.t1 F;
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
    public org.telegram.ui.Components.x30 X;
    public org.telegram.ui.Components.x30 Y;
    public a0.h Z;
    public final int f43009a;
    public ArrayList f43010a0;
    public final oe.e f43011b;
    public org.telegram.ui.Components.x30 f43012b0;
    public final oe.b f43013c;
    public int f43014c0;
    public di.h3 d;
    public org.telegram.ui.Components.te0 f43015d0;
    public fi.f6 e;
    public boolean f43016e0;
    public org.telegram.ui.Components.m20 f43017f;
    public final HashSet f43018f0;
    public boolean f43019g0;
    public j60 h;
    public boolean f43020h0;
    public ArrayList f43021i0;
    public boolean f43022j0;
    public boolean f43023k0;
    public int f43024l0;
    public int m0;
    public org.telegram.ui.Components.mm0 f43025n;
    public int f43026n0;
    public final Rect f43027o0;
    public final ch.f f43028p0;
    public final hh.d f43029q0;
    public s4.c0 f43030r;
    public ch.j f43031r0;
    public org.telegram.ui.Components.ey0 f43032s;
    public final ArrayList f43033s0;
    public final RectF f43034t0;
    public final RectF f43035u0;
    public p60 v;
    public n60 f43036w;
    public m60 f43037x;
    public org.telegram.ui.Components.j20 f43038y;

    public r60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f43009a = i10;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f43011b = new oe.e(3, this, dsVar, 350L);
        this.f43013c = new oe.b(4, this, dsVar, 350L, false);
        this.Z = new a0.h();
        this.f43010a0 = new ArrayList();
        this.f43018f0 = new HashSet();
        this.f43024l0 = -4;
        this.f43027o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f43033s0 = arrayList;
        RectF rectF = new RectF();
        this.f43034t0 = rectF;
        RectF rectF2 = new RectF();
        this.f43035u0 = rectF2;
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
                this.K = getMessagesController().conferenceCallSizeLimit - 1;
            } else {
                MessagesController messagesController = getMessagesController();
                if (i13 == 0) {
                    i11 = messagesController.maxMegagroupCount;
                } else {
                    i11 = messagesController.maxBroadcastCount;
                }
                this.K = i11;
            }
        } else {
            this.K = 0;
        }
        if (i12 >= 31) {
            this.f43028p0 = new ch.f();
            this.f43029q0 = new hh.d(null);
            return;
        }
        this.f43028p0 = null;
        this.f43029q0 = null;
    }

    public static void V(r60 r60Var, Context context, View view, int i10) {
        long j10;
        String str;
        org.telegram.ui.Components.qc J;
        boolean z10;
        int i11 = r60Var.K;
        long j11 = r60Var.H;
        p60 p60Var = r60Var.v;
        if (i10 == p60Var.f42370w) {
            int i12 = r60Var.currentAccount;
            org.telegram.ui.ActionBar.u6 u6Var = r60Var.resourceProvider;
            h60 h60Var = new h60(r60Var, 0);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
            e2Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ag.p0(i12, e2Var, context, u6Var, h60Var, 6));
        } else if (i10 == 0 && p60Var.F != 0 && !p60Var.f42367n) {
            TLRPC.ChatFull chatFull = r60Var.I;
            long j12 = r60Var.G;
            if (j11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.te0 te0Var = new org.telegram.ui.Components.te0(context, r60Var, chatFull, j12, z10);
            r60Var.f43015d0 = te0Var;
            r60Var.showDialog(te0Var);
        } else if (view instanceof org.telegram.ui.Cells.k4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (k4Var.f24324r) {
                org.telegram.ui.Components.x30 x30Var = r60Var.X;
                if (x30Var == null) {
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(r60Var.f43017f.f30365r.getContext(), "premium");
                    r60Var.X = x30Var2;
                    r60Var.h.a(x30Var2);
                    r60Var.X.setOnClickListener(r60Var);
                } else {
                    r60Var.h.c(x30Var);
                    r60Var.X = null;
                }
                r60Var.l0();
            } else if (k4Var.f24325s) {
                org.telegram.ui.Components.x30 x30Var3 = r60Var.Y;
                if (x30Var3 == null) {
                    org.telegram.ui.Components.x30 x30Var4 = new org.telegram.ui.Components.x30(r60Var.f43017f.f30365r.getContext(), "miniapps");
                    r60Var.Y = x30Var4;
                    r60Var.h.a(x30Var4);
                    r60Var.Y.setOnClickListener(r60Var);
                } else {
                    r60Var.h.c(x30Var3);
                    r60Var.Y = null;
                }
                r60Var.l0();
            } else {
                Object object = k4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j10 = ((TLRPC.User) object).f22174id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22027id;
                } else {
                    return;
                }
                a0.h hVar = r60Var.J;
                if (hVar == null || hVar.h(j10) < 0) {
                    if (k4Var.O) {
                        int i13 = -r60Var.f43024l0;
                        r60Var.f43024l0 = i13;
                        AndroidUtilities.shakeViewSpring(k4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(r60Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(r60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.wc.b0(r60Var).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.wc.b0(r60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new h60(r60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.x30 x30Var5 = (org.telegram.ui.Components.x30) r60Var.Z.f(j10);
                    if (x30Var5 != null) {
                        r60Var.h.c(x30Var5);
                    } else if (i11 == 0 || r60Var.Z.m() != i11) {
                        if (r60Var.M == 0 && r60Var.Z.m() == r60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22366a;
                            e2Var2.R = string;
                            e2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            r60Var.showDialog(e2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (r60Var.R && user.bot) {
                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.wc.b0(r60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = r60Var.getMessagesController().getChat(Long.valueOf(j11));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder2.f22366a;
                                    if (canAddAdmins) {
                                        e2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        e2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.voip.k1(14, r60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        e2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    r60Var.showDialog(e2Var3);
                                    return;
                                }
                            }
                            r60Var.getMessagesController().putUser(user, !r60Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            r60Var.getMessagesController().putChat((TLRPC.Chat) object, !r60Var.T);
                        }
                        org.telegram.ui.Components.x30 x30Var6 = new org.telegram.ui.Components.x30(r60Var.f43017f.f30365r.getContext(), object);
                        r60Var.h.a(x30Var6);
                        x30Var6.setOnClickListener(r60Var);
                    } else {
                        return;
                    }
                    r60Var.t0();
                    if (!r60Var.T && !r60Var.S) {
                        r60Var.l0();
                    } else {
                        AndroidUtilities.showKeyboard(r60Var.f43017f.f30365r);
                    }
                    if (r60Var.f43017f.f30365r.length() > 0) {
                        r60Var.f43017f.f30365r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void a0(r60 r60Var) {
        if (r60Var.F == null) {
            return;
        }
        r60Var.f43013c.a(!r60Var.Z.i(), true);
    }

    public static void b0(r60 r60Var, Canvas canvas, RectF rectF, Paint paint) {
        hh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = r60Var.f43029q0) != null) {
            dVar.w(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.f43025n.getPaddingTop();
            k0();
            org.telegram.ui.Components.m20 m20Var = this.f43017f;
            oe.e eVar2 = this.f43011b;
            m20Var.setTranslationY(eVar2.f19334f);
            j0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.f19334f);
            this.d.invalidate();
            int paddingTop2 = this.f43025n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((oe.b) this.e.f10865c).f19327f) {
                this.f43025n.scrollBy(0, paddingTop - paddingTop2);
            }
        } else if (i10 == 4) {
            h0();
            j0();
        }
    }

    @Override
    public final View O() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23327bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23538n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23307ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23374e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
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
        this.T = false;
        this.S = false;
        this.f43010a0.clear();
        this.Z.b();
        this.f43012b0 = null;
        boolean z10 = this.R;
        int i12 = this.M;
        if (i12 == 2) {
            this.E = true;
        } else {
            this.E = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z11 = this.P;
        boolean z12 = this.O;
        boolean z13 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (z10) {
            if (this.H != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
            }
        } else {
            int i13 = this.U;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (z11) {
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
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 1));
        this.f43017f = new org.telegram.ui.Components.m20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        j60 j60Var = new j60(this, context, this.currentAccount);
        this.h = j60Var;
        j60Var.setDelegate(new f60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new g60(this, 1));
        j60 j60Var2 = this.h;
        this.Z = j60Var2.f31807b;
        this.f43010a0 = j60Var2.f31808c;
        s0();
        this.f43017f.f30365r.setOnEditorActionListener(new la(this, 4));
        this.f43017f.f30365r.setOnKeyListener(new k60(0, this));
        this.f43017f.f30365r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.f43021i0;
        if (arrayList != null) {
            q0(arrayList, this.f43022j0, this.f43023k0);
        }
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(6);
        c10Var.f27029w = false;
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, c10Var, 1, null);
        this.f43032s = ey0Var;
        ey0Var.addView(c10Var);
        this.f43032s.e(true, false);
        this.f43032s.d.setText(LocaleController.getString(R.string.NoResult));
        this.f43030r = new s4.c0(1, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f43025n = mm0Var;
        mm0Var.setFastScrollEnabled(0);
        this.f43025n.setEmptyView(this.f43032s);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f43025n;
        p60 p60Var = new p60(this, context);
        this.v = p60Var;
        mm0Var2.setAdapter(p60Var);
        this.f43025n.setLayoutManager(this.f43030r);
        this.f43025n.setVerticalScrollBarEnabled(false);
        this.f43025n.setClipToPadding(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f43025n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f43025n;
        float f7 = -this.f43009a;
        k0Var.addView(mm0Var4, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        k0Var.addView(this.f43032s);
        this.f43025n.setOnItemClickListener(new di.x4(17, this, context));
        this.f43025n.setOnScrollListener(new i3(this, 14));
        org.telegram.ui.Components.mm0 mm0Var5 = this.f43025n;
        mm0Var5.W1 = true;
        mm0Var5.X1 = 0;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.f43038y = j20Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
            j2Var.f22737l = 180;
            j2Var.invalidateSelf();
            this.f43038y.f29455c.setImageDrawable(j2Var);
        } else {
            j20Var.f29455c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            k0Var.addView(this.f43038y, org.telegram.ui.Components.j20.b());
        }
        this.f43038y.setOnClickListener(new g60(this, 2));
        this.f43038y.e(this.E, false);
        this.f43038y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new bi.t1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23355d7, view, this.resourceProvider);
            this.F.addView(view, org.telegram.ui.Components.gb1.h(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, org.telegram.ui.Components.gb1.i(-1, -2, 87));
            fi.d dVar = new fi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new g60(this, 3));
            fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new g60(this, 4));
            k0Var.addView(this.F, org.telegram.ui.Components.gb1.i(-1, -2, 87));
            h0();
        }
        t0();
        di.h3 h3Var = new di.h3(this, context);
        this.d = h3Var;
        k0Var.addView(h3Var, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f43017f, org.telegram.ui.Components.gb1.h(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.mm0 mm0Var6 = this.f43025n;
        Objects.requireNonNull(mm0Var6);
        this.f43031r0 = new ch.j(mm0Var6, k0Var, new i60(mm0Var6, 0));
        this.f43025n.D0(new h60(this, 3));
        fi.f6 f6Var = new fi.f6(context, this.parentLayout);
        this.e = f6Var;
        ((oe.b) f6Var.f10865c).a(false, false);
        k0Var.addView(this.e, org.telegram.ui.Components.gb1.i(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f35535h1.d.add(this);
        }
        View view2 = this.fragmentView;
        f60 f60Var = new f60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(view2, f60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            p60 p60Var = this.v;
            if (p60Var != null) {
                p60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f43025n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f43025n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f43025n.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.k4) {
                            ((org.telegram.ui.Cells.k4) childAt).f(intValue);
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

    public final void f0() {
        ch.f fVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f43028p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f43014c0;
            RectF rectF = this.f43034t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f43035u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f43013c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f43033s0);
            fVar.e(this.f43031r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean g0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r60.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23501l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23519m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23539n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43032s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43032s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23307ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23447i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23464j7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43025n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23483k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23347ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23366di));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43032s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f43032s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23746y6));
        if (this.f43015d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void h0() {
        int i10;
        bi.t1 t1Var = this.F;
        if (t1Var == null) {
            return;
        }
        float f7 = this.f43013c.e;
        t1Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        bi.t1 t1Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t1Var2.setVisibility(i10);
    }

    public final void i0() {
        org.telegram.ui.Components.j20 j20Var = this.f43038y;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.m0, this.f43026n0));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.f43025n.Z0()) {
            this.f43025n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f43009a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f43011b.f19334f);
        int measuredWidth = this.f43025n.getMeasuredWidth();
        int C = org.telegram.messenger.t.C(i11, this.f43025n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f43013c.e));
        Rect rect = this.f43027o0;
        rect.set(0, measuredHeight, measuredWidth, C);
        this.f43025n.setClipBounds(rect);
    }

    @Override
    public final void k(r0.k1 k1Var) {
        this.f43026n0 = k1Var.f47115a.f(8).d;
        i0();
    }

    public final void k0() {
        int i10;
        int i11;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        this.f43025n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f43011b.f19334f), 0, AndroidUtilities.dp(this.f43009a) + this.m0 + i10);
        this.f43032s.setPadding(0, 0, 0, this.m0);
    }

    public final void l0() {
        String string;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f43025n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f43025n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) childAt;
                Object object = k4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22174id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22027id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k4Var.c(z11, true);
                        k4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k4Var.c(z10, true);
                        k4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        k4Var.c(true, false);
                        k4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j10) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k4Var.c(z12, true);
                        k4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                this.f43025n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    z3Var.a(string, new g60(this, 0));
                }
            }
        }
    }

    public final HashSet m0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void n0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.Z.j(i11))));
        }
        m60 m60Var = this.f43037x;
        if (m60Var != null) {
            m60Var.f(i10, arrayList);
        }
        finishFragment();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!g0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (x30Var.f34606y) {
            this.f43012b0 = null;
            this.h.c(x30Var);
            t0();
            l0();
            return;
        }
        org.telegram.ui.Components.x30 x30Var2 = this.f43012b0;
        if (x30Var2 != null) {
            x30Var2.a();
        }
        this.f43012b0 = x30Var;
        x30Var.b();
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

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.m20 m20Var = this.f43017f;
            if (m20Var != null) {
                m20Var.updateColors();
            }
            org.telegram.ui.Components.j20 j20Var = this.f43038y;
            if (j20Var != null) {
                j20Var.updateColors();
            }
            u0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean p0() {
        boolean z10;
        int dp;
        int dp2;
        boolean i10 = this.Z.i();
        boolean z11 = this.R;
        int i11 = this.M;
        boolean z12 = false;
        if (!i10 || i11 == 2 || !z11) {
            long j10 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.R = formatPluralString;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < this.Z.m(); i12++) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z.j(i12)));
                        if (user != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                            sb2.append("**");
                        }
                    }
                    MessagesController messagesController = getMessagesController();
                    if (j10 == 0) {
                        j10 = this.H;
                    }
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                    String str = "";
                    if (this.Z.m() > 5) {
                        int m10 = this.Z.m();
                        if (chat != null) {
                            str = chat.title;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", m10, str)));
                        String format = String.format("%d", Integer.valueOf(this.Z.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        e2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1, this.resourceProvider);
                        y1VarArr[0] = y1Var;
                        y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                        y1VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                        } else {
                            y1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
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
                        y1Var2.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(y1VarArr[0], org.telegram.ui.Components.gb1.r(-1, -2));
                        y1VarArr[0].setOnClickListener(new i20(y1VarArr, 1));
                        alertDialog$Builder.o(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new org.telegram.ui.Components.voip.k1(15, this, y1VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(e2Var);
                    return true;
                }
            } else if (i11 == 2) {
                ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                for (int i14 = 0; i14 < this.Z.m(); i14++) {
                    TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.Z.j(i14))));
                    if (inputUser != null) {
                        arrayList.add(inputUser);
                    }
                }
                getMessagesController().addUsersToChannel(j10, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
                return true;
            } else if (this.E) {
                if (z11) {
                    n0(0);
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < this.Z.m(); i15++) {
                    arrayList2.add(Long.valueOf(this.Z.j(i15)));
                }
                if (!this.O && !this.P) {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        jArr[i16] = ((Long) arrayList2.get(i16)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new x60(bundle2));
                    return true;
                }
                n60 n60Var = this.f43036w;
                if (n60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    n60Var.b(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    public final void q0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.x30 x30Var;
        org.telegram.ui.Components.x30 x30Var2;
        Object user;
        HashSet hashSet = this.f43018f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f43019g0 = z10;
        this.f43020h0 = z11;
        j60 j60Var = this.h;
        if (j60Var == null) {
            this.f43021i0 = arrayList;
            this.f43022j0 = z10;
            this.f43023k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.x30 x30Var3 = new org.telegram.ui.Components.x30(getParentActivity(), "premium");
            this.X = x30Var3;
            this.h.a(x30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (x30Var = this.X) != null) {
            j60Var.c(x30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.x30 x30Var4 = new org.telegram.ui.Components.x30(getParentActivity(), "miniApps");
            this.Y = x30Var4;
            this.h.a(x30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (x30Var2 = this.Y) != null) {
            this.h.c(x30Var2);
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
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(l4);
            }
            if (user != null) {
                org.telegram.ui.Components.x30 x30Var5 = new org.telegram.ui.Components.x30(getParentActivity(), user);
                this.h.a(x30Var5);
                x30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.p20 p20Var = this.h.d;
        AnimatorSet animatorSet = p20Var.f31420a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p20Var.f31420a.setupEndValues();
            p20Var.f31420a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f43025n);
    }

    public final void r0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f43025n, new org.telegram.ui.Components.h2(this, i10, 17));
    }

    public final void s0() {
        p60 p60Var;
        fi.c2 c2Var = this.f43017f.f30365r;
        if (c2Var == null) {
            return;
        }
        if (this.M == 2) {
            c2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((p60Var = this.v) == null || p60Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    c2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    c2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            c2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            c2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
        }
    }

    public final void t0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.Z.m(), new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.Q ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.Z.m()), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 != 2 && z11) {
            if (this.E && this.f43010a0.isEmpty()) {
                this.f43038y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f43010a0.isEmpty()) {
                this.f43038y.e(true, true);
                this.E = true;
            }
        }
    }

    public final void u0() {
        try {
            org.telegram.ui.Components.mm0 mm0Var = this.f43025n;
            if (mm0Var != null) {
                mm0Var.A1();
                if (this.f43025n.getFastScroll() != null) {
                    this.f43025n.getFastScroll().invalidate();
                }
            }
            j60 j60Var = this.h;
            if (j60Var != null && j60Var.getSpansContainer() != null) {
                ViewGroup spansContainer = this.h.getSpansContainer();
                for (int i10 = 0; i10 < spansContainer.getChildCount(); i10++) {
                    View childAt = spansContainer.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.x30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void M() {
    }

    @Override
    public final void t() {
    }

    public void o0(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
