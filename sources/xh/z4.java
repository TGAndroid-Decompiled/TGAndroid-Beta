package xh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.b7;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
import w7.y5;
import yh.s5;
import yh.w7;
public class z4 extends bb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean f46506a0;
    public final boolean f46507b0;
    public final TL_stars.StarGift f46508c0;
    public GiftAuctionController.Auction f46509d0;
    public final rg.k f46510e0;
    public final String f46511f0;
    public final Runnable f46512g0;
    public final t4 f46513h0;
    public final LinearLayout f46514i0;
    public final long f46515j0;
    public final org.telegram.ui.Cells.w0 f46516k0;
    public final TLRPC.MessageAction f46517l0;
    public final MessageObject m0;
    public final ci.d f46518n0;
    public final FrameLayout f46519o0;
    public boolean f46520p0;
    public boolean f46521q0;
    public boolean f46522r0;
    public final u4 f46523s0;
    public j61 f46524t0;
    public int f46525u0;
    public final pq[] f46526v0;
    public boolean f46527w0;

    public z4(Context context, int i10, final TL_stars.StarGift starGift, final rg.k kVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j10;
        Integer num;
        boolean z12;
        int i11;
        this.f46521q0 = false;
        this.f46522r0 = false;
        this.f46525u0 = -2;
        new AnimationNotificationsLocker();
        this.f46526v0 = new pq[1];
        this.f46527w0 = false;
        boolean z13 = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.X = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.f46520p0 = true;
        }
        this.Y = i10;
        this.Z = j3;
        this.f46508c0 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.f46509d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f18560id, this);
        }
        this.f46510e0 = kVar;
        this.f46512g0 = runnable;
        this.f46506a0 = z10;
        this.f46507b0 = z11;
        if (z10) {
            this.f46521q0 = true;
        } else if (z11) {
            this.f46521q0 = false;
        }
        this.v = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f46511f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f46511f0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.f46516k0 = w0Var;
        w0Var.setDelegate(new Object());
        t4 t4Var = new t4(this, context);
        this.f46513h0 = t4Var;
        Drawable e = b7.e(null, i10, j3, h6.I.q());
        t4Var.V(e);
        fh.c cVar = new fh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof mc0) {
                mc0 mc0Var = (mc0) e;
                if (mc0Var.f26448q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = mc0Var.f26431a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(h6.f19129h5));
        ch.f fVar = new ch.f(cVar);
        d6 d6Var = this.resourcesProvider;
        int i12 = h6.f19129h5;
        fVar.o(new dh.b(i12, d6Var));
        fVar.q(AndroidUtilities.dp(20.0f));
        fVar.p(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46514i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f46517l0 = tL_messageActionStarGift;
            z12 = z13;
            i11 = i12;
        } else {
            boolean z14 = z13;
            if (kVar != null && kVar.f42621b != null) {
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
                this.f46517l0 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i11 = i12;
                if (kVar != null && kVar.f42620a != null) {
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
                    this.f46517l0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f46517l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f46521q0;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f18356id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j3);
        tL_messageService.action = this.f46517l0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j3) : j10;
        this.f46515j0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        w0Var.U(messageObject, true);
        linearLayout.addView(w0Var, y5.t(-1, -1, 119, 0, sendPaidMessagesStars > j10 ? 0 : 8, 0, 8));
        t4Var.addView(linearLayout, y5.e(-1, -1, 119));
        u4 u4Var = new u4(this, context, (aw0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f46523s0 = u4Var;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f20328b;
        e3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        e3Var.Q = true;
        u4Var.setShowLimitWhenNear(50);
        this.Q = e3Var;
        u4Var.setShowLimitOnFocus(true);
        u4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(u4Var, 3);
        e3Var.getEditText().setImeOptions(6);
        e3Var.getEditText().setOnEditorActionListener(new m.s2(gVar, 1));
        int i13 = this.backgroundPaddingLeft;
        u4Var.setPadding(i13, 0, i13, 0);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42995m = false;
        jVar.n(350L);
        jVar.o(rr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.f46524t0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i14 = i11;
        linearLayout2.setBackgroundColor(h6.v0(i14, this.resourcesProvider));
        int i15 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i15, 0, i15, 0);
        this.containerView.addView(linearLayout2, y5.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(h6.v0(h6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(y5.z(-1.0f), y5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(h6.b0(AndroidUtilities.dp(6.0f), h6.v0(h6.f19003a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f46519o0 = frameLayout2;
            frameLayout2.addView(frameLayout, y5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(h6.v0(i14, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, y5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f46519o0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i16 = h6.G6;
        textView.setTextColor(h6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, y5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        h.setTextSize(1, 13.0f);
        h.setGravity(21);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextColor(h6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            h.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(h, y5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View w4Var = new w4(context, starGift, clamp);
        w4Var.setBackground(h6.b0(AndroidUtilities.dp(6.0f), h6.v0(h6.Oh, this.resourcesProvider)));
        frameLayout.addView(w4Var, y5.e(-1, -1, 119));
        x4 x4Var = new x4(context, clamp);
        x4Var.setWillNotDraw(false);
        frameLayout.addView(x4Var, y5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        x4Var.addView(textView2, y5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        x4Var.addView(textView3, y5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        this.f46518n0 = dVar;
        dVar.e();
        Z(false);
        linearLayout2.addView(dVar, y5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j3, context, runnable, starGift));
        gg.b0 b0Var = this.f22955c;
        this.P = true;
        b0Var.k1(true);
        this.f46524t0.N(false);
        this.f22955c.h1(this.f46524t0.f25293x.size(), AndroidUtilities.dp(200.0f));
        wl0 wl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f46519o0 == null) ? 40 : 0)));
        this.d.i(new y4(this));
        this.d.setOnItemClickListener(new kl0() {
            @Override
            public final void d(int i18, View view2) {
                boolean z16;
                long j11;
                TL_stars.StarGift starGift2;
                z4 z4Var = z4.this;
                TL_stars.StarGift starGift3 = z4Var.f46508c0;
                boolean z17 = z4Var.X;
                org.telegram.ui.Cells.w0 w0Var2 = z4Var.f46516k0;
                TLRPC.MessageAction messageAction2 = z4Var.f46517l0;
                MessageObject messageObject2 = z4Var.m0;
                j61 j61Var = z4Var.f46524t0;
                if (!z4Var.P) {
                    i18--;
                }
                v51 G = j61Var.G(i18);
                if (G != null) {
                    int i19 = G.d;
                    if (i19 == 1) {
                        boolean z18 = !z4Var.f46520p0;
                        z4Var.f46520p0 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        messageObject2.updateMessageText();
                        w0Var2.U(messageObject2, true);
                        z4Var.f46524t0.N(true);
                    } else if (i19 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = z4Var.f46521q0;
                            z4Var.f46521q0 = !z19;
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
                            z4Var.f46524t0.N(true);
                            z4Var.Z(true);
                            return;
                        }
                        int i20 = -z4Var.f46525u0;
                        z4Var.f46525u0 = i20;
                        AndroidUtilities.shakeViewSpring(view2, i20);
                    } else if (i19 == 3) {
                        boolean z20 = z4Var.f46522r0;
                        z4Var.f46522r0 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        rg.k kVar2 = kVar;
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
                        z4Var.f46524t0.N(true);
                        z4Var.Z(true);
                    }
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.f46512g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.f46523s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new xc(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.f46518n0.setLoading(false);
    }

    public static void Q(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.f46512g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.f46523s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new xc(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.f46518n0.setLoading(false);
    }

    public static void S(xh.z4 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z4.S(xh.z4, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void U(z4 z4Var) {
        new yh.x3(z4Var.getContext(), z4Var.Y, z4Var.Z, z4Var.resourcesProvider, null).V1(z4Var.f46508c0.f18560id, z4Var.f46511f0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f46517l0;
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

    public xc X() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return xc.a0(U);
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
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f18482id), userFull);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f22957n;
        if (m2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) m2Var.getParentActivity()).O().getFragmentStack());
            b5 parentLayout = m2Var.getParentLayout();
            int size = arrayList.size();
            wn wnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                if (m2Var2 instanceof wn) {
                    wnVar = (wn) m2Var2;
                    if (wnVar.a() != j3) {
                        m2Var2.removeSelfFromStack();
                    }
                } else if (m2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == m2Var2) {
                        m2Var2.finishFragment();
                    } else {
                        m2Var2.removeSelfFromStack();
                    }
                }
            }
            if (wnVar == null || wnVar.a() != j3) {
                ((ActionBarLayout) parentLayout).Q(new wn(v7.j.e(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        long j3;
        long j10;
        String str;
        GiftAuctionController.Auction auction = this.f46509d0;
        int i10 = this.Y;
        ci.d dVar = this.f46518n0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f46509d0.isUpcoming(currentTime)) {
                int i11 = this.f46509d0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f46509d0.auctionStateActive;
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
        TL_stars.StarGift starGift = this.f46508c0;
        pq[] pqVarArr = this.f46526v0;
        if (starGift != null) {
            long j11 = s5.y(i10, false).p().amount;
            long j12 = starGift.stars;
            if (this.f46521q0) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j12 + j3;
            if (TextUtils.isEmpty(this.f46523s0.getText())) {
                j10 = 0;
            } else {
                j10 = this.f46515j0;
            }
            long j14 = j13 + j10;
            if (this.X) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(w7.V0(false, LocaleController.formatPluralStringComma(str, (int) j14), pqVarArr), z10, true);
            if (s5.y(i10, false).e && j14 > j11) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j11), z10);
                return;
            } else {
                dVar.f(null, z10);
                return;
            }
        }
        rg.k kVar = this.f46510e0;
        if (kVar != null) {
            if (this.f46522r0) {
                dVar.g(w7.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, pqVarArr), z10, true);
                pqVarArr[0].spaceScaleX = 0.85f;
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
            j61 j61Var = this.f46524t0;
            if (j61Var != null && this.f46510e0 != null) {
                j61Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        u4 u4Var = this.f46523s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f20328b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.f20328b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
        } else if (e3Var2.v) {
            e3Var2.d();
        } else {
            e3Var2.r();
            if (this.f46509d0 != null) {
                GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.f46509d0.giftId, this);
            }
            this.f46527w0 = true;
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
        u4 u4Var = this.f46523s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f20328b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.f20328b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
        } else if (e3Var2.v) {
            e3Var2.d();
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
        this.f46509d0 = auction;
    }

    @Override
    public final void show() {
        u4 u4Var = this.f46523s0;
        if (u4Var != null) {
            u4Var.f20328b.s();
        }
        super.show();
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.Y, 0, true, new n4(this, 0), this.resourcesProvider);
        this.f46524t0 = j61Var;
        j61Var.f25290r = false;
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
