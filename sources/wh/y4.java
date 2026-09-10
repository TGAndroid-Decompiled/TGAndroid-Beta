package wh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.e8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import w7.a6;
import xh.v5;
import xh.z7;
public class y4 extends ab implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean f44440a0;
    public final boolean f44441b0;
    public final TL_stars.StarGift f44442c0;
    public GiftAuctionController.Auction f44443d0;
    public final qg.k f44444e0;
    public final String f44445f0;
    public final Runnable f44446g0;
    public final s4 f44447h0;
    public final LinearLayout f44448i0;
    public final long f44449j0;
    public final org.telegram.ui.Cells.w0 f44450k0;
    public final TLRPC.MessageAction f44451l0;
    public final MessageObject m0;
    public final bi.d f44452n0;
    public final FrameLayout f44453o0;
    public boolean f44454p0;
    public boolean f44455q0;
    public boolean f44456r0;
    public final t4 f44457s0;
    public j61 f44458t0;
    public int f44459u0;
    public final uq[] f44460v0;
    public boolean f44461w0;

    public y4(Context context, int i10, final TL_stars.StarGift starGift, final qg.k kVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j10;
        Integer num;
        boolean z12;
        int i11;
        this.f44455q0 = false;
        this.f44456r0 = false;
        this.f44459u0 = -2;
        new AnimationNotificationsLocker();
        this.f44460v0 = new uq[1];
        this.f44461w0 = false;
        boolean z13 = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.X = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.f44454p0 = true;
        }
        this.Y = i10;
        this.Z = j3;
        this.f44442c0 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.f44443d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f17425id, this);
        }
        this.f44444e0 = kVar;
        this.f44446g0 = runnable;
        this.f44440a0 = z10;
        this.f44441b0 = z11;
        if (z10) {
            this.f44455q0 = true;
        } else if (z11) {
            this.f44455q0 = false;
        }
        this.v = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f44445f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f44445f0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.f44450k0 = w0Var;
        w0Var.setDelegate(new Object());
        s4 s4Var = new s4(this, context);
        this.f44447h0 = s4Var;
        Drawable e = e8.e(null, i10, j3, j6.I.q());
        s4Var.V(e);
        eh.c cVar = new eh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof lc0) {
                lc0 lc0Var = (lc0) e;
                if (lc0Var.f24955q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = lc0Var.f24938a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(j6.f17998h5));
        bh.f fVar = new bh.f(cVar);
        f6 f6Var = this.resourcesProvider;
        int i12 = j6.f17998h5;
        fVar.n(new ch.b(i12, f6Var));
        fVar.p(AndroidUtilities.dp(20.0f));
        fVar.o(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44448i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f44451l0 = tL_messageActionStarGift;
            z12 = z13;
            i11 = i12;
        } else {
            boolean z14 = z13;
            if (kVar != null && kVar.f40760b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e7 = kVar.e();
                tL_messageActionGiftCode.amount = e7;
                z12 = z14;
                if (kVar.h != null) {
                    i11 = i12;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e7);
                } else {
                    i11 = i12;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f44451l0 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i11 = i12;
                if (kVar != null && kVar.f40759a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = kVar.d();
                    tL_messageActionGiftPremium.currency = kVar.a();
                    long e10 = kVar.e();
                    tL_messageActionGiftPremium.amount = e10;
                    if (kVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e10);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f44451l0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f44451l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f44455q0;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f17216id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j3);
        tL_messageService.action = this.f44451l0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j3) : j10;
        this.f44449j0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        w0Var.U(messageObject, true);
        linearLayout.addView(w0Var, a6.t(-1, -1, 119, 0, sendPaidMessagesStars > j10 ? 0 : 8, 0, 8));
        s4Var.addView(linearLayout, a6.e(-1, -1, 119));
        t4 t4Var = new t4(this, context, (aw0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f44457s0 = t4Var;
        org.telegram.ui.Cells.d3 d3Var = t4Var.f19109b;
        d3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        d3Var.Q = true;
        t4Var.setShowLimitWhenNear(50);
        this.Q = d3Var;
        t4Var.setShowLimitOnFocus(true);
        t4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(t4Var, 3);
        d3Var.getEditText().setImeOptions(6);
        d3Var.getEditText().setOnEditorActionListener(new m.s2(gVar, 1));
        int i13 = this.backgroundPaddingLeft;
        t4Var.setPadding(i13, 0, i13, 0);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f41645m = false;
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.f44458t0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i14 = i11;
        linearLayout2.setBackgroundColor(j6.v0(i14, this.resourcesProvider));
        int i15 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i15, 0, i15, 0);
        this.containerView.addView(linearLayout2, a6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(j6.v0(j6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a6.z(-1.0f), a6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.f17872a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f44453o0 = frameLayout2;
            frameLayout2.addView(frameLayout, a6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(j6.v0(i14, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, a6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f44453o0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i16 = j6.G6;
        textView.setTextColor(j6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView f10 = r6.f(frameLayout, textView, a6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        f10.setTextSize(1, 13.0f);
        f10.setGravity(21);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextColor(j6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            f10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(f10, a6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View v4Var = new v4(context, starGift, clamp);
        v4Var.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.Oh, this.resourcesProvider)));
        frameLayout.addView(v4Var, a6.e(-1, -1, 119));
        w4 w4Var = new w4(context, clamp);
        w4Var.setWillNotDraw(false);
        frameLayout.addView(w4Var, a6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        w4Var.addView(textView2, a6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        w4Var.addView(textView3, a6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        bi.d dVar = new bi.d(context, this.resourcesProvider, true);
        this.f44452n0 = dVar;
        dVar.e();
        Z(false);
        linearLayout2.addView(dVar, a6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j3, context, runnable, starGift));
        fg.a0 a0Var = this.f21450c;
        this.P = true;
        a0Var.k1(true);
        this.f44458t0.N(false);
        this.f21450c.h1(this.f44458t0.f24253x.size(), AndroidUtilities.dp(200.0f));
        vl0 vl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f44453o0 == null) ? 40 : 0)));
        this.d.i(new x4(this));
        this.d.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i18, View view2) {
                boolean z16;
                long j11;
                TL_stars.StarGift starGift2;
                y4 y4Var = y4.this;
                TL_stars.StarGift starGift3 = y4Var.f44442c0;
                boolean z17 = y4Var.X;
                org.telegram.ui.Cells.w0 w0Var2 = y4Var.f44450k0;
                TLRPC.MessageAction messageAction2 = y4Var.f44451l0;
                MessageObject messageObject2 = y4Var.m0;
                j61 j61Var = y4Var.f44458t0;
                if (!y4Var.P) {
                    i18--;
                }
                v51 G = j61Var.G(i18);
                if (G != null) {
                    int i19 = G.d;
                    if (i19 == 1) {
                        boolean z18 = !y4Var.f44454p0;
                        y4Var.f44454p0 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        messageObject2.updateMessageText();
                        w0Var2.U(messageObject2, true);
                        y4Var.f44458t0.N(true);
                    } else if (i19 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = y4Var.f44455q0;
                            y4Var.f44455q0 = !z19;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z19 && (!z17 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z16;
                                long j12 = 0;
                                if (z17 || z19) {
                                    j11 = 0;
                                } else {
                                    j11 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j11;
                                if (z19) {
                                    j12 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j12;
                            }
                            messageObject2.updateMessageText();
                            w0Var2.U(messageObject2, true);
                            y4Var.f44458t0.N(true);
                            y4Var.Z(true);
                            return;
                        }
                        int i20 = -y4Var.f44459u0;
                        y4Var.f44459u0 = i20;
                        AndroidUtilities.shakeViewSpring(view2, i20);
                    } else if (i19 == 3) {
                        boolean z20 = y4Var.f44456r0;
                        y4Var.f44456r0 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        qg.k kVar2 = kVar;
                        if (z21) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = kVar2.a();
                                long e11 = kVar2.e();
                                tL_messageActionGiftPremium2.amount = e11;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e11);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = kVar2.a();
                                long e12 = kVar2.e();
                                tL_messageActionGiftCode2.amount = e12;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e12);
                                }
                            }
                        }
                        messageObject2.updateMessageText();
                        w0Var2.U(messageObject2, true);
                        y4Var.f44458t0.N(true);
                        y4Var.Z(true);
                    }
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.f44446g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.f44457s0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.f44452n0.setLoading(false);
    }

    public static void Q(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.f44446g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.f44457s0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.f44452n0.setLoading(false);
    }

    public static void S(wh.y4 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: wh.y4.S(wh.y4, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void U(y4 y4Var) {
        new xh.x3(y4Var.getContext(), y4Var.Y, y4Var.Z, y4Var.resourcesProvider, null).V1(y4Var.f44442c0.f17425id, y4Var.f44445f0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f44451l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
            return null;
        }
        return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
    }

    public wc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return wc.a0(U);
    }

    public final void Y(boolean z10) {
        int i10 = this.Y;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j3 = this.Z;
        TLRPC.UserFull userFull = messagesController.getUserFull(j3);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f17342id), userFull);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f21452n;
        if (p2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) p2Var.getParentActivity()).O().getFragmentStack());
            f5 parentLayout = p2Var.getParentLayout();
            int size = arrayList.size();
            eo eoVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var2 instanceof eo) {
                    eoVar = (eo) p2Var2;
                    if (eoVar.a() != j3) {
                        p2Var2.removeSelfFromStack();
                    }
                } else if (p2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == p2Var2) {
                        p2Var2.finishFragment();
                    } else {
                        p2Var2.removeSelfFromStack();
                    }
                }
            }
            if (eoVar == null || eoVar.a() != j3) {
                ((ActionBarLayout) parentLayout).Q(new eo(w.f.e(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        long j3;
        long j10;
        String str;
        GiftAuctionController.Auction auction = this.f44443d0;
        int i10 = this.Y;
        bi.d dVar = this.f44452n0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f44443d0.isUpcoming(currentTime)) {
                int i11 = this.f44443d0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f44443d0.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
            dVar.f(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.f44442c0;
        uq[] uqVarArr = this.f44460v0;
        if (starGift != null) {
            long j11 = v5.y(i10, false).p().amount;
            long j12 = starGift.stars;
            if (this.f44455q0) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j12 + j3;
            if (TextUtils.isEmpty(this.f44457s0.getText())) {
                j10 = 0;
            } else {
                j10 = this.f44449j0;
            }
            long j14 = j13 + j10;
            if (this.X) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(z7.V0(false, LocaleController.formatPluralStringComma(str, (int) j14), uqVarArr), z10, true);
            if (v5.y(i10, false).e && j14 > j11) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j11), z10);
                return;
            } else {
                dVar.f(null, z10);
                return;
            }
        }
        qg.k kVar = this.f44444e0;
        if (kVar != null) {
            if (this.f44456r0) {
                dVar.g(z7.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, uqVarArr), z10, true);
                uqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            j61 j61Var = this.f44458t0;
            if (j61Var != null && this.f44444e0 != null) {
                j61Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        t4 t4Var = this.f44457s0;
        org.telegram.ui.Cells.d3 d3Var = t4Var.f19109b;
        org.telegram.ui.Cells.d3 d3Var2 = t4Var.f19109b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            d3Var2.r();
            if (this.f44443d0 != null) {
                GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.f44443d0.giftId, this);
            }
            this.f44461w0 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onBackPressed() {
        t4 t4Var = this.f44457s0;
        org.telegram.ui.Cells.d3 d3Var = t4Var.f19109b;
        org.telegram.ui.Cells.d3 d3Var2 = t4Var.f19109b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f44443d0 = auction;
    }

    @Override
    public final void show() {
        t4 t4Var = this.f44457s0;
        if (t4Var != null) {
            t4Var.f19109b.s();
        }
        super.show();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.Y, 0, true, new m4(this, 0), this.resourcesProvider);
        this.f44458t0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.X) {
            i10 = R.string.Gift2TitleSelf2;
        } else {
            i10 = R.string.Gift2Title;
        }
        return LocaleController.getString(i10);
    }
}
