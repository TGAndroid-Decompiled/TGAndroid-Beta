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
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yn;
import w7.z5;
import yh.t5;
import yh.x7;
public class z4 extends cb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean f50336a0;
    public final boolean f50337b0;
    public final TL_stars.StarGift f50338c0;
    public GiftAuctionController.Auction f50339d0;
    public final rg.k f50340e0;
    public final String f50341f0;
    public final Runnable f50342g0;
    public final t4 f50343h0;
    public final LinearLayout f50344i0;
    public final long f50345j0;
    public final org.telegram.ui.Cells.w0 f50346k0;
    public final TLRPC.MessageAction f50347l0;
    public final MessageObject m0;
    public final ci.d f50348n0;
    public final FrameLayout f50349o0;
    public boolean f50350p0;
    public boolean f50351q0;
    public boolean f50352r0;
    public final u4 f50353s0;
    public u61 f50354t0;
    public int f50355u0;
    public final rq[] f50356v0;
    public boolean f50357w0;

    public z4(Context context, int i10, final TL_stars.StarGift starGift, final rg.k kVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j10;
        Integer num;
        boolean z12;
        int i11;
        this.f50351q0 = false;
        this.f50352r0 = false;
        this.f50355u0 = -2;
        new AnimationNotificationsLocker();
        this.f50356v0 = new rq[1];
        this.f50357w0 = false;
        boolean z13 = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.X = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.f50350p0 = true;
        }
        this.Y = i10;
        this.Z = j3;
        this.f50338c0 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.f50339d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f20269id, this);
        }
        this.f50340e0 = kVar;
        this.f50342g0 = runnable;
        this.f50336a0 = z10;
        this.f50337b0 = z11;
        if (z10) {
            this.f50351q0 = true;
        } else if (z11) {
            this.f50351q0 = false;
        }
        this.v = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f50341f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f50341f0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.f50346k0 = w0Var;
        w0Var.setDelegate(new Object());
        t4 t4Var = new t4(this, context);
        this.f50343h0 = t4Var;
        Drawable e7 = b7.e(null, i10, j3, i6.I.q());
        t4Var.V(e7);
        fh.c cVar = new fh.c();
        if (e7 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e7).getColor());
        } else {
            if (e7 instanceof pc0) {
                pc0 pc0Var = (pc0) e7;
                if (pc0Var.f29624q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = pc0Var.f29606a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(i6.f20894h5));
        ch.f fVar = new ch.f(cVar);
        d6 d6Var = this.resourcesProvider;
        int i12 = i6.f20894h5;
        fVar.w(new dh.b(i12, d6Var));
        fVar.y(AndroidUtilities.dp(20.0f));
        fVar.x(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50344i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f50347l0 = tL_messageActionStarGift;
            z12 = z13;
            i11 = i12;
        } else {
            boolean z14 = z13;
            if (kVar != null && kVar.f46146b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e10 = kVar.e();
                tL_messageActionGiftCode.amount = e10;
                z12 = z14;
                if (kVar.h != null) {
                    i11 = i12;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e10);
                } else {
                    i11 = i12;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f50347l0 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i11 = i12;
                if (kVar != null && kVar.f46145a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = kVar.d();
                    tL_messageActionGiftPremium.currency = kVar.a();
                    long e11 = kVar.e();
                    tL_messageActionGiftPremium.amount = e11;
                    if (kVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e11);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f50347l0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f50347l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f50351q0;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f20063id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j3);
        tL_messageService.action = this.f50347l0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j3) : j10;
        this.f50345j0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        w0Var.S(messageObject, true);
        linearLayout.addView(w0Var, z5.t(-1, -1, 119, 0, sendPaidMessagesStars > j10 ? 0 : 8, 0, 8));
        t4Var.addView(linearLayout, z5.e(-1, -1, 119));
        u4 u4Var = new u4(this, context, (lw0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f50353s0 = u4Var;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f22132b;
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
        jVar.f46570m = false;
        jVar.n(350L);
        jVar.o(tr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.f50354t0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i14 = i11;
        linearLayout2.setBackgroundColor(i6.v0(i14, this.resourcesProvider));
        int i15 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i15, 0, i15, 0);
        this.containerView.addView(linearLayout2, z5.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(i6.v0(i6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(i6.b0(AndroidUtilities.dp(6.0f), i6.v0(i6.f20766a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f50349o0 = frameLayout2;
            frameLayout2.addView(frameLayout, z5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(i6.v0(i14, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, z5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f50349o0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i16 = i6.G6;
        textView.setTextColor(i6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView i17 = org.telegram.ui.Cells.c1.i(frameLayout, textView, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i17.setTextSize(1, 13.0f);
        i17.setGravity(21);
        i17.setTypeface(AndroidUtilities.bold());
        i17.setTextColor(i6.v0(i16, this.resourcesProvider));
        if (starGift != null) {
            i17.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(i17, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View w4Var = new w4(context, starGift, clamp);
        w4Var.setBackground(i6.b0(AndroidUtilities.dp(6.0f), i6.v0(i6.Oh, this.resourcesProvider)));
        frameLayout.addView(w4Var, z5.e(-1, -1, 119));
        x4 x4Var = new x4(context, clamp);
        x4Var.setWillNotDraw(false);
        frameLayout.addView(x4Var, z5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        x4Var.addView(textView2, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        x4Var.addView(textView3, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        this.f50348n0 = dVar;
        dVar.e();
        Y(false);
        linearLayout2.addView(dVar, z5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j3, context, runnable, starGift));
        gg.b0 b0Var = this.f25306c;
        this.P = true;
        b0Var.k1(true);
        this.f50354t0.N(false);
        this.f25306c.h1(this.f50354t0.f31316x.size(), AndroidUtilities.dp(200.0f));
        zl0 zl0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.f50349o0 == null) ? 40 : 0)));
        this.d.i(new y4(this));
        this.d.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i19, View view2) {
                boolean z16;
                long j11;
                TL_stars.StarGift starGift2;
                z4 z4Var = z4.this;
                TL_stars.StarGift starGift3 = z4Var.f50338c0;
                boolean z17 = z4Var.X;
                org.telegram.ui.Cells.w0 w0Var2 = z4Var.f50346k0;
                TLRPC.MessageAction messageAction2 = z4Var.f50347l0;
                MessageObject messageObject2 = z4Var.m0;
                u61 u61Var = z4Var.f50354t0;
                if (!z4Var.P) {
                    i19--;
                }
                g61 G = u61Var.G(i19);
                if (G != null) {
                    int i20 = G.d;
                    if (i20 == 1) {
                        boolean z18 = !z4Var.f50350p0;
                        z4Var.f50350p0 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        messageObject2.updateMessageText();
                        w0Var2.S(messageObject2, true);
                        z4Var.f50354t0.N(true);
                    } else if (i20 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = z4Var.f50351q0;
                            z4Var.f50351q0 = !z19;
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
                            w0Var2.S(messageObject2, true);
                            z4Var.f50354t0.N(true);
                            z4Var.Y(true);
                            return;
                        }
                        int i21 = -z4Var.f50355u0;
                        z4Var.f50355u0 = i21;
                        AndroidUtilities.shakeViewSpring(view2, i21);
                    } else if (i20 == 3) {
                        boolean z20 = z4Var.f50352r0;
                        z4Var.f50352r0 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        rg.k kVar2 = kVar;
                        if (z21) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = kVar2.a();
                                long e12 = kVar2.e();
                                tL_messageActionGiftPremium2.amount = e12;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e12);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = kVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = kVar2.a();
                                long e13 = kVar2.e();
                                tL_messageActionGiftCode2.amount = e13;
                                if (kVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e13);
                                }
                            }
                        }
                        messageObject2.updateMessageText();
                        w0Var2.S(messageObject2, true);
                        z4Var.f50354t0.N(true);
                        z4Var.Y(true);
                    }
                }
            }
        });
        this.f25307e.setTitle(y());
    }

    public static void N(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.f50342g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.f50353s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.f50348n0.setLoading(false);
    }

    public static void O(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.f50342g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.f50353s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.f50348n0.setLoading(false);
    }

    public static void Q(xh.z4 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z4.Q(xh.z4, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void S(z4 z4Var) {
        new yh.x3(z4Var.getContext(), z4Var.Y, z4Var.Z, z4Var.resourcesProvider, null).V1(z4Var.f50338c0.f20269id, z4Var.f50341f0);
    }

    public final TLRPC.TL_textWithEntities U() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f50347l0;
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

    public yc W() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return yc.a0(U);
    }

    public final void X(boolean z10) {
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
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f20189id), userFull);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f25309n;
        if (n2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) n2Var.getParentActivity()).O().getFragmentStack());
            c5 parentLayout = n2Var.getParentLayout();
            int size = arrayList.size();
            yn ynVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var2 instanceof yn) {
                    ynVar = (yn) n2Var2;
                    if (ynVar.a() != j3) {
                        n2Var2.removeSelfFromStack();
                    }
                } else if (n2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == n2Var2) {
                        n2Var2.finishFragment();
                    } else {
                        n2Var2.removeSelfFromStack();
                    }
                }
            }
            if (ynVar == null || ynVar.a() != j3) {
                ((ActionBarLayout) parentLayout).Q(new yn(sa.e.f(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Y(boolean z10) {
        long j3;
        long j10;
        String str;
        GiftAuctionController.Auction auction = this.f50339d0;
        int i10 = this.Y;
        ci.d dVar = this.f50348n0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f50339d0.isUpcoming(currentTime)) {
                int i11 = this.f50339d0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f50339d0.auctionStateActive;
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
        TL_stars.StarGift starGift = this.f50338c0;
        rq[] rqVarArr = this.f50356v0;
        if (starGift != null) {
            long j11 = t5.y(i10, false).p().amount;
            long j12 = starGift.stars;
            if (this.f50351q0) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j12 + j3;
            if (TextUtils.isEmpty(this.f50353s0.getText())) {
                j10 = 0;
            } else {
                j10 = this.f50345j0;
            }
            long j14 = j13 + j10;
            if (this.X) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(x7.b1(false, LocaleController.formatPluralStringComma(str, (int) j14), rqVarArr), z10, true);
            if (t5.y(i10, false).f52019e && j14 > j11) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j11), z10);
                return;
            } else {
                dVar.f(null, z10);
                return;
            }
        }
        rg.k kVar = this.f50340e0;
        if (kVar != null) {
            if (this.f50352r0) {
                dVar.g(x7.X0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, rqVarArr), z10, true);
                rqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Y(true);
            u61 u61Var = this.f50354t0;
            if (u61Var != null && this.f50340e0 != null) {
                u61Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        u4 u4Var = this.f50353s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f22132b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.f22132b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
        } else if (e3Var2.v) {
            e3Var2.d();
        } else {
            e3Var2.r();
            if (this.f50339d0 != null) {
                GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.f50339d0.giftId, this);
            }
            this.f50357w0 = true;
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
        u4 u4Var = this.f50353s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.f22132b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.f22132b;
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
        this.f50339d0 = auction;
    }

    @Override
    public final void show() {
        u4 u4Var = this.f50353s0;
        if (u4Var != null) {
            u4Var.f22132b.s();
        }
        super.show();
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.Y, 0, true, new n4(this, 0), this.resourcesProvider);
        this.f50354t0 = u61Var;
        u61Var.f31313r = false;
        return u61Var;
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
