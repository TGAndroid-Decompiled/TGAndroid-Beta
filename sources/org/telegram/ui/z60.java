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
public class z60 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, le.e, View.OnClickListener, ph.d {
    public boolean E;
    public ai.w7 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.i J;
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
    public org.telegram.ui.Components.n30 X;
    public org.telegram.ui.Components.n30 Y;
    public a0.i Z;
    public final int f40350a;
    public ArrayList f40351a0;
    public final le.f f40352b;
    public org.telegram.ui.Components.n30 f40353b0;
    public final le.c f40354c;
    public int f40355c0;
    public ai.n4 d;
    public org.telegram.ui.Components.ke0 f40356d0;
    public ci.r6 e;
    public boolean f40357e0;
    public org.telegram.ui.Components.c20 f40358f;
    public final HashSet f40359f0;
    public boolean f40360g0;
    public r60 h;
    public boolean f40361h0;
    public ArrayList f40362i0;
    public boolean f40363j0;
    public boolean f40364k0;
    public int f40365l0;
    public int m0;
    public org.telegram.ui.Components.wl0 f40366n;
    public int f40367n0;
    public final Rect f40368o0;
    public final ah.h f40369p0;
    public final fh.d f40370q0;
    public s4.c0 f40371r;
    public ah.n f40372r0;
    public org.telegram.ui.Components.ix0 f40373s;
    public final ArrayList f40374s0;
    public final RectF f40375t0;
    public final RectF f40376u0;
    public x60 v;
    public v60 f40377w;
    public u60 f40378x;
    public org.telegram.ui.Components.z10 f40379y;

    public z60(Bundle bundle) {
        super(bundle);
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40350a = i10;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        this.f40352b = new le.f(3, this, rrVar, 350L);
        this.f40354c = new le.c(4, this, rrVar, 350L, false);
        this.Z = new a0.i();
        this.f40351a0 = new ArrayList();
        this.f40359f0 = new HashSet();
        this.f40365l0 = -4;
        this.f40368o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.f40374s0 = arrayList;
        RectF rectF = new RectF();
        this.f40375t0 = rectF;
        RectF rectF2 = new RectF();
        this.f40376u0 = rectF2;
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
            this.f40369p0 = new ah.h(false);
            this.f40370q0 = new fh.d(null);
            return;
        }
        this.f40369p0 = null;
        this.f40370q0 = null;
    }

    public static void U(z60 z60Var, Context context, View view, int i10) {
        long j3;
        String str;
        org.telegram.ui.Components.qc J;
        boolean z10;
        int i11 = z60Var.K;
        long j10 = z60Var.H;
        x60 x60Var = z60Var.v;
        if (i10 == x60Var.f39830w) {
            int i12 = z60Var.currentAccount;
            org.telegram.ui.ActionBar.d6 d6Var = z60Var.resourceProvider;
            p60 p60Var = new p60(z60Var, 0);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            a2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ai.ya(i12, a2Var, context, d6Var, p60Var, 3));
        } else if (i10 == 0 && x60Var.F != 0 && !x60Var.f39827n) {
            TLRPC.ChatFull chatFull = z60Var.I;
            long j11 = z60Var.G;
            if (j10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.ke0 ke0Var = new org.telegram.ui.Components.ke0(context, z60Var, chatFull, j11, z10);
            z60Var.f40356d0 = ke0Var;
            z60Var.showDialog(ke0Var);
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.f20326r) {
                org.telegram.ui.Components.n30 n30Var = z60Var.X;
                if (n30Var == null) {
                    org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(z60Var.f40358f.f23131r.getContext(), "premium");
                    z60Var.X = n30Var2;
                    z60Var.h.a(n30Var2);
                    z60Var.X.setOnClickListener(z60Var);
                } else {
                    z60Var.h.c(n30Var);
                    z60Var.X = null;
                }
                z60Var.k0();
            } else if (g4Var.f20327s) {
                org.telegram.ui.Components.n30 n30Var3 = z60Var.Y;
                if (n30Var3 == null) {
                    org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(z60Var.f40358f.f23131r.getContext(), "miniapps");
                    z60Var.Y = n30Var4;
                    z60Var.h.a(n30Var4);
                    z60Var.Y.setOnClickListener(z60Var);
                } else {
                    z60Var.h.c(n30Var3);
                    z60Var.Y = null;
                }
                z60Var.k0();
            } else {
                Object object = g4Var.getObject();
                boolean z11 = object instanceof TLRPC.User;
                if (z11) {
                    j3 = ((TLRPC.User) object).f18468id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18321id;
                } else {
                    return;
                }
                a0.i iVar = z60Var.J;
                if (iVar == null || iVar.h(j3) < 0) {
                    if (g4Var.O) {
                        int i13 = -z60Var.f40365l0;
                        z60Var.f40365l0 = i13;
                        AndroidUtilities.shakeViewSpring(g4Var, i13);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getUserName(MessagesController.getInstance(z60Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(z60Var.currentAccount).premiumFeaturesBlocked()) {
                            J = org.telegram.ui.Components.yc.a0(z60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = org.telegram.ui.Components.yc.a0(z60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new p60(z60Var, 2));
                        }
                        J.j();
                        return;
                    }
                    org.telegram.ui.Components.n30 n30Var5 = (org.telegram.ui.Components.n30) z60Var.Z.f(j3);
                    if (n30Var5 != null) {
                        z60Var.h.c(n30Var5);
                    } else if (i11 == 0 || z60Var.Z.m() != i11) {
                        if (z60Var.M == 0 && z60Var.Z.m() == z60Var.getMessagesController().maxGroupCount) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z60Var.getParentActivity());
                            String string = LocaleController.getString(R.string.AppName);
                            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f18647a;
                            a2Var2.R = string;
                            a2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            z60Var.showDialog(a2Var2);
                            return;
                        }
                        if (z11) {
                            TLRPC.User user = (TLRPC.User) object;
                            if (z60Var.R && user.bot) {
                                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                if (i14 == 0 && user.bot_nochats) {
                                    try {
                                        org.telegram.ui.Components.yc.a0(z60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                } else if (i14 != 0) {
                                    TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(j10));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z60Var.getParentActivity());
                                    boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.f18647a;
                                    if (canAddAdmins) {
                                        a2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                        a2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new ow(4, z60Var, user));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    } else {
                                        a2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                    }
                                    z60Var.showDialog(a2Var3);
                                    return;
                                }
                            }
                            z60Var.getMessagesController().putUser(user, !z60Var.T);
                        } else if (object instanceof TLRPC.Chat) {
                            z60Var.getMessagesController().putChat((TLRPC.Chat) object, !z60Var.T);
                        }
                        org.telegram.ui.Components.n30 n30Var6 = new org.telegram.ui.Components.n30(z60Var.f40358f.f23131r.getContext(), object);
                        z60Var.h.a(n30Var6);
                        n30Var6.setOnClickListener(z60Var);
                    } else {
                        return;
                    }
                    z60Var.s0();
                    if (!z60Var.T && !z60Var.S) {
                        z60Var.k0();
                    } else {
                        AndroidUtilities.showKeyboard(z60Var.f40358f.f23131r);
                    }
                    if (z60Var.f40358f.f23131r.length() > 0) {
                        z60Var.f40358f.f23131r.setText((CharSequence) null);
                    }
                }
            }
        }
    }

    public static void Z(z60 z60Var) {
        if (z60Var.F == null) {
            return;
        }
        z60Var.f40354c.a(!z60Var.Z.i(), true);
    }

    public static void a0(z60 z60Var, Canvas canvas, RectF rectF, Paint paint) {
        fh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && (dVar = z60Var.f40370q0) != null) {
            dVar.y(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
            int alpha = paint.getAlpha();
            paint.setAlpha(178);
            canvas.drawRect(rectF, paint);
            paint.setAlpha(alpha);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.f40366n.getPaddingTop();
            j0();
            org.telegram.ui.Components.c20 c20Var = this.f40358f;
            le.f fVar2 = this.f40352b;
            c20Var.setTranslationY(fVar2.e);
            i0();
            this.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar2.e);
            this.d.invalidate();
            int paddingTop2 = this.f40366n.getPaddingTop();
            if (paddingTop2 != paddingTop && !((le.c) this.e.f5458c).f14186f) {
                this.f40366n.scrollBy(0, paddingTop - paddingTop2);
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
        this.T = false;
        this.S = false;
        this.f40351a0.clear();
        this.Z.b();
        this.f40353b0 = null;
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
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 26));
        this.f40358f = new org.telegram.ui.Components.c20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        r60 r60Var = new r60(this, context, this.currentAccount);
        this.h = r60Var;
        r60Var.setDelegate(new o60(this, 0));
        this.h.getSpansContainer().setOnClickListener(new q60(this, 0));
        r60 r60Var2 = this.h;
        this.Z = r60Var2.f24318b;
        this.f40351a0 = r60Var2.f24319c;
        r0();
        this.f40358f.f23131r.setOnEditorActionListener(new ia(this, 4));
        this.f40358f.f23131r.setOnKeyListener(new s60(0, this));
        this.f40358f.f23131r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.f40362i0;
        if (arrayList != null) {
            p0(arrayList, this.f40363j0, this.f40364k0);
        }
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.f28648w = false;
        org.telegram.ui.Components.ix0 ix0Var = new org.telegram.ui.Components.ix0(context, u00Var, 1, null);
        this.f40373s = ix0Var;
        ix0Var.addView(u00Var);
        this.f40373s.e(true, false);
        this.f40373s.d.setText(LocaleController.getString(R.string.NoResult));
        k0Var.addView(this.f40373s);
        this.f40371r = new s4.c0(1, false);
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f40366n = wl0Var;
        wl0Var.setFastScrollEnabled(0);
        this.f40366n.setEmptyView(this.f40373s);
        org.telegram.ui.Components.wl0 wl0Var2 = this.f40366n;
        x60 x60Var = new x60(this, context);
        this.v = x60Var;
        wl0Var2.setAdapter(x60Var);
        this.f40366n.setLayoutManager(this.f40371r);
        this.f40366n.setVerticalScrollBarEnabled(false);
        this.f40366n.setClipToPadding(false);
        org.telegram.ui.Components.wl0 wl0Var3 = this.f40366n;
        if (LocaleController.isRTL) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        wl0Var3.setVerticalScrollbarPosition(i11);
        org.telegram.ui.Components.wl0 wl0Var4 = this.f40366n;
        float f7 = -this.f40350a;
        k0Var.addView(wl0Var4, w7.y5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.f40366n.setOnItemClickListener(new ai.n6(17, this, context));
        this.f40366n.setOnScrollListener(new i3(this, 13));
        org.telegram.ui.Components.wl0 wl0Var5 = this.f40366n;
        wl0Var5.Y1 = true;
        wl0Var5.Z1 = 0;
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f40379y = z10Var;
        if (!z11 && !z12 && !z10) {
            org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
            f2Var.f18862l = 180;
            f2Var.invalidateSelf();
            this.f40379y.f30751c.setImageDrawable(f2Var);
        } else {
            z10Var.f30751c.setImageResource(R.drawable.floating_check);
        }
        if (!z13) {
            k0Var.addView(this.f40379y, org.telegram.ui.Components.z10.b());
        }
        this.f40379y.setOnClickListener(new q60(this, 1));
        this.f40379y.e(this.E, false);
        this.f40379y.setContentDescription(LocaleController.getString(R.string.Next));
        if (z13) {
            this.F = new ai.w7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19046d7, this.resourceProvider));
            this.F.addView(view, w7.y5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.y5.e(-1, -2, 87));
            ci.d dVar = new ci.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.y5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new q60(this, 2));
            ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.pq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.y5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new q60(this, 3));
            k0Var.addView(this.F, w7.y5.e(-1, -2, 87));
            g0();
        }
        s0();
        ai.n4 n4Var = new ai.n4(this, context);
        this.d = n4Var;
        k0Var.addView(n4Var, w7.y5.e(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f40358f, w7.y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.wl0 wl0Var6 = this.f40366n;
        Objects.requireNonNull(wl0Var6);
        this.f40372r0 = new ah.n(wl0Var6, k0Var, new rs(wl0Var6, 0));
        this.f40366n.C0(new p60(this, 3));
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.e = r6Var;
        r6Var.b(false, false);
        k0Var.addView(this.e, w7.y5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31099g1.d.add(this);
        }
        View view2 = this.fragmentView;
        o60 o60Var = new o60(this, 3);
        WeakHashMap weakHashMap = r0.i0.f42114a;
        r0.a0.j(view2, o60Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            x60 x60Var = this.v;
            if (x60Var != null) {
                x60Var.l();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f40366n != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.f40366n.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f40366n.getChildAt(i12);
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
        ah.h hVar;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f40369p0) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            float measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f) + this.f40355c0;
            RectF rectF = this.f40375t0;
            rectF.set(0.0f, 0.0f, this.fragmentView.getMeasuredWidth(), measuredHeight);
            float f7 = -dp;
            rectF.inset(0.0f, f7);
            if (this.F != null) {
                RectF rectF2 = this.f40376u0;
                rectF2.set(0.0f, this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF2.inset(0.0f, f7);
            }
            if (this.F != null && this.f40354c.e > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f40374s0);
            hVar.e(this.f40372r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final boolean f0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z60.f0(boolean):boolean");
    }

    public final void g0() {
        int i10;
        ai.w7 w7Var = this.F;
        if (w7Var == null) {
            return;
        }
        float f7 = this.f40354c.e;
        w7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        ai.w7 w7Var2 = this.F;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w7Var2.setVisibility(i10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f19045d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19323s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19378v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19342t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19134i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19191l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19210m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19230n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19166k0, null, null, org.telegram.ui.ActionBar.h6.f19046d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40373s, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19028c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40373s, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f19116h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i12 = org.telegram.ui.ActionBar.h6.f19000ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19135i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19153j7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19173k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19229n6));
        int i13 = org.telegram.ui.ActionBar.h6.f19428y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40366n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.h6.f19296r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i14 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19038ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19019bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19057di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40373s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40373s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ke0 ke0Var = this.f40356d0;
        if (ke0Var != null) {
            arrayList.addAll(ke0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.z10 z10Var = this.f40379y;
        if (z10Var != null) {
            z10Var.setTranslationY(-Math.max(this.m0, this.f40367n0));
        }
    }

    public final void i0() {
        if (this.f40366n.Z0()) {
            this.f40366n.setClipBounds(null);
            return;
        }
        int i10 = this.m0;
        int i11 = this.f40350a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40352b.e);
        int measuredWidth = this.f40366n.getMeasuredWidth();
        int B = org.telegram.messenger.f0.B(i11, this.f40366n.getMeasuredHeight(), (int) ((AndroidUtilities.dp(76.0f) + i10) * this.f40354c.e));
        Rect rect = this.f40368o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.f40366n.setClipBounds(rect);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.f40367n0 = l1Var.f42126a.f(8).d;
        h0();
    }

    public final void j0() {
        int i10;
        if (this.Q) {
            i10 = AndroidUtilities.dp(76.0f);
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.wl0 wl0Var = this.f40366n;
        int i11 = this.f40350a;
        wl0Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i11 + 48) + ((int) this.f40352b.e), 0, AndroidUtilities.dp(i11) + this.m0 + i10);
        this.f40373s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        String string;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = this.f40366n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f40366n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18468id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18321id;
                } else {
                    boolean z13 = object instanceof String;
                    if (z13 && "premium".equalsIgnoreCase((String) object)) {
                        if (this.X != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g4Var.c(z11, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z13 && "miniapps".equalsIgnoreCase((String) object)) {
                        if (this.Y != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g4Var.c(z10, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.i iVar = this.J;
                    if (iVar != null && iVar.h(j3) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    } else {
                        if (this.Z.h(j3) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        g4Var.c(z12, true);
                        g4Var.setCheckBoxEnabled(true);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                this.f40366n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (this.X == null && this.Z.i()) {
                        string = "";
                    } else {
                        string = LocaleController.getString(R.string.DeselectAll);
                    }
                    v3Var.b(string, new q60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.Z.j(i11))));
        }
        u60 u60Var = this.f40378x;
        if (u60Var != null) {
            u60Var.i(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean z10;
        int dp;
        int dp2;
        boolean i10 = this.Z.i();
        boolean z11 = this.R;
        int i11 = this.M;
        boolean z12 = false;
        if (!i10 || i11 == 2 || !z11) {
            long j3 = this.G;
            if (z11) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                    a2Var.R = formatPluralString;
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
                    if (j3 == 0) {
                        j3 = this.H;
                    }
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                        }
                        a2Var.T = spannableStringBuilder;
                    } else {
                        int i13 = R.string.AddMembersAlertNamesText;
                        if (chat != null) {
                            str = chat.title;
                        }
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, sb2, str));
                    }
                    org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                    if (!ChatObject.isChannel(chat)) {
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(getParentActivity(), 1, this.resourceProvider);
                        a2VarArr[0] = a2Var2;
                        a2Var2.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        a2VarArr[0].setMultiline(true);
                        if (this.Z.m() == 1) {
                            a2VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                        } else {
                            a2VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                        }
                        org.telegram.ui.Cells.a2 a2Var3 = a2VarArr[0];
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
                        a2Var3.setPadding(dp, 0, dp2, 0);
                        linearLayout.addView(a2VarArr[0], w7.y5.n(-1, -2));
                        a2VarArr[0].setOnClickListener(new r20(a2VarArr, 1));
                        alertDialog$Builder.n(linearLayout);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Add), new ow(5, this, a2VarArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(a2Var);
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
                getMessagesController().addUsersToChannel(j3, arrayList, null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wn(bundle), true);
                return true;
            } else if (this.E) {
                if (z11) {
                    m0(0);
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
                    presentFragment(new g70(bundle2));
                    return true;
                }
                v60 v60Var = this.f40377w;
                if (v60Var != null) {
                    if (this.X != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.Y != null) {
                        z12 = true;
                    }
                    v60Var.b(arrayList2, z10, z12);
                }
                finishFragment();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!f0(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f26624y) {
            this.f40353b0 = null;
            this.h.c(n30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.f40353b0;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.f40353b0 = n30Var;
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

    public final void p0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.n30 n30Var;
        org.telegram.ui.Components.n30 n30Var2;
        Object user;
        HashSet hashSet = this.f40359f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.f40360g0 = z10;
        this.f40361h0 = z11;
        r60 r60Var = this.h;
        if (r60Var == null) {
            this.f40362i0 = arrayList;
            this.f40363j0 = z10;
            this.f40364k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.n30 n30Var3 = new org.telegram.ui.Components.n30(getParentActivity(), "premium");
            this.X = n30Var3;
            this.h.a(n30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (n30Var = this.X) != null) {
            r60Var.c(n30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.n30 n30Var4 = new org.telegram.ui.Components.n30(getParentActivity(), "miniApps");
            this.Y = n30Var4;
            this.h.a(n30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (n30Var2 = this.Y) != null) {
            this.h.c(n30Var2);
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
                org.telegram.ui.Components.n30 n30Var5 = new org.telegram.ui.Components.n30(getParentActivity(), user);
                this.h.a(n30Var5);
                n30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.f20 f20Var = this.h.d;
        AnimatorSet animatorSet = f20Var.f24037a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f20Var.f24037a.setupEndValues();
            f20Var.f24037a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.f40366n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.f40366n, new org.telegram.ui.Components.ld(this, i10, 16));
    }

    public final void r0() {
        x60 x60Var;
        ci.h2 h2Var = this.f40358f.f23131r;
        if (h2Var == null) {
            return;
        }
        if (this.M == 2) {
            h2Var.setHint(LocaleController.getString(R.string.AddMutual));
        } else if (!this.R && ((x60Var = this.v) == null || x60Var.G != 0)) {
            if (!this.O && !this.P) {
                if (this.Q) {
                    h2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
                    return;
                } else {
                    h2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
                    return;
                }
            }
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else {
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
        }
    }

    public final void s0() {
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
            if (this.E && this.f40351a0.isEmpty()) {
                this.f40379y.e(false, true);
                this.E = false;
            } else if (!this.E && !this.f40351a0.isEmpty()) {
                this.f40379y.e(true, true);
                this.E = true;
            }
        }
    }

    @Override
    public final void J() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
