package zh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.h7;
import fi.o6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public class y4 extends bb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean f53393a0;
    public final boolean f53394b0;
    public final TL_stars.StarGift f53395c0;
    public GiftAuctionController.Auction f53396d0;
    public final tg.k f53397e0;
    public final String f53398f0;
    public final Runnable f53399g0;
    public final s4 f53400h0;
    public final LinearLayout f53401i0;
    public final long f53402j0;
    public final org.telegram.ui.Cells.v0 f53403k0;
    public final TLRPC.MessageAction f53404l0;
    public final MessageObject m0;
    public final LinearLayout f53405n0;
    public final fi.d f53406o0;
    public final FrameLayout f53407p0;
    public boolean f53408q0;
    public boolean f53409r0;
    public boolean f53410s0;
    public final t4 f53411t0;
    public k71 f53412u0;
    public int f53413v0;
    public final zq[] f53414w0;
    public boolean f53415x0;
    public final hh.c f53416y0;

    public y4(Context context, int i10, final TL_stars.StarGift starGift, final tg.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        boolean z12;
        float f7;
        long j11;
        String str;
        Integer num;
        int themedColor;
        hh.c cVar;
        int i11;
        boolean z13;
        int i12;
        long j12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        boolean z14;
        long j13;
        long j14;
        this.f53409r0 = false;
        this.f53410s0 = false;
        this.f53413v0 = -2;
        new AnimationNotificationsLocker();
        this.f53414w0 = new zq[1];
        this.f53415x0 = false;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.X = z12;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z12) {
            this.f53408q0 = true;
        }
        this.Y = i10;
        this.Z = j10;
        this.f53395c0 = starGift;
        if (starGift != null && starGift.auction) {
            f7 = 4.0f;
            this.f53396d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f22257id, this);
        } else {
            f7 = 4.0f;
        }
        this.f53397e0 = kVar;
        this.f53399g0 = runnable;
        this.f53393a0 = z10;
        this.f53394b0 = z11;
        if (z10) {
            this.f53409r0 = true;
        } else if (z11) {
            this.f53409r0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.f53398f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            this.f53398f0 = str;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.f53403k0 = v0Var;
        v0Var.setDelegate(new Object());
        s4 s4Var = new s4(this, context);
        this.f53400h0 = s4Var;
        Drawable e = o6.e(null, i10, j10, y6.I.q());
        s4Var.U(e);
        hh.c cVar2 = new hh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof vc0) {
                vc0 vc0Var = (vc0) e;
                if (vc0Var.f33694q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = vc0Var.f33677a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            themedColor = num.intValue();
        } else {
            themedColor = getThemedColor(y6.f23428h5);
        }
        cVar2.a(themedColor);
        if (num == null) {
            cVar = cVar2;
        } else {
            cVar = null;
        }
        this.f53416y0 = cVar;
        eh.f fVar = new eh.f(cVar2);
        u6 u6Var = this.resourcesProvider;
        int i17 = y6.f23428h5;
        fVar.v(new fh.b(i17, u6Var));
        fVar.x(AndroidUtilities.dp(20.0f));
        fVar.w(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53401i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f53404l0 = tL_messageActionStarGift;
            z13 = z12;
            i12 = i17;
        } else {
            boolean z15 = z12;
            i11 = 6;
            if (kVar != null && kVar.f48947b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e10 = kVar.e();
                tL_messageActionGiftCode.amount = e10;
                z13 = z15;
                if (kVar.h != null) {
                    i12 = i17;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e10);
                } else {
                    i12 = i17;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f53404l0 = tL_messageActionGiftCode;
            } else {
                z13 = z15;
                i12 = i17;
                if (kVar != null && kVar.f48946a != null) {
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
                    this.f53404l0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f53404l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z16 = this.f53409r0;
            if (!z16 && (!z13 || starGift == null || !starGift.can_upgrade)) {
                z14 = false;
            } else {
                z14 = true;
            }
            tL_messageActionStarGift2.can_upgrade = z14;
            if (!z13 && z16) {
                j13 = starGift.upgrade_stars;
            } else {
                j13 = j11;
            }
            tL_messageActionStarGift2.upgrade_stars = j13;
            if (z16) {
                j14 = j11;
            } else {
                j14 = starGift.convert_stars;
            }
            tL_messageActionStarGift2.convert_stars = j14;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f22049id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.f53404l0;
        if (starGift != null) {
            j12 = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        } else {
            j12 = j11;
        }
        this.f53402j0 = j12;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        v0Var.X(messageObject, true);
        if (j12 > j11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout.addView(v0Var, kb1.x(-1, -1, 119, 0, i13, 0, 8));
        s4Var.addView(linearLayout, kb1.i(-1, -1, 119));
        ww0 ww0Var = (ww0) this.containerView;
        if (starGift != null) {
            i14 = R.string.Gift2Message;
        } else {
            i14 = R.string.Gift2MessageOptional;
        }
        t4 t4Var = new t4(this, context, ww0Var, LocaleController.getString(i14), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f53411t0 = t4Var;
        org.telegram.ui.Cells.b3 b3Var = t4Var.f24003b;
        b3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        b3Var.Q = true;
        t4Var.setShowLimitWhenNear(50);
        this.Q = b3Var;
        t4Var.setShowLimitOnFocus(true);
        t4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(t4Var, 3);
        b3Var.getEditText().setImeOptions(i11);
        b3Var.getEditText().setOnEditorActionListener(new m.s2(gVar, 1));
        int i18 = this.backgroundPaddingLeft;
        t4Var.setPadding(i18, 0, i18, 0);
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.f47798m = false;
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.D = 40L;
        this.d.setItemAnimator(lVar);
        this.f53412u0.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f53405n0 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(y6.w0(i12, this.resourcesProvider));
        int i19 = this.backgroundPaddingLeft;
        int i20 = i12;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i19, 0, i19, 0));
        int i21 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i21, 0, i21, 0);
        this.containerView.addView(linearLayout2, kb1.i(-1, -2, 87));
        View view = new View(context);
        f7.i(y6.K5, view, this.resourcesProvider);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        if (starGift == null) {
            f10 = 0.0f;
        } else {
            f10 = starGift.availability_remains / starGift.availability_total;
        }
        float clamp = Utilities.clamp(f10, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(6.0f);
        int i22 = y6.f23300a7;
        Drawable c02 = y6.c0(dp, y6.w0(i22, this.resourcesProvider));
        b7 N = f7.N(i22);
        u6 u6Var2 = this.resourcesProvider;
        frameLayout.setBackground(c02);
        f7.k(frameLayout, c02, N, null, u6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f53407p0 = frameLayout2;
            frameLayout2.addView(frameLayout, kb1.o(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            f7.i(i20, frameLayout2, this.resourcesProvider);
        } else {
            if (starGift != null && starGift.limited) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            frameLayout.setVisibility(i15);
            linearLayout2.addView(frameLayout, kb1.o(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f53407p0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i23 = y6.G6;
        f7.V(textView, i23, this.resourcesProvider);
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, kb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        k10.setTextSize(1, 13.0f);
        k10.setGravity(21);
        k10.setTypeface(AndroidUtilities.bold());
        f7.V(k10, i23, this.resourcesProvider);
        if (starGift != null) {
            k10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(k10, kb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View v4Var = new v4(context, starGift, clamp);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i24 = y6.Oh;
        Drawable c03 = y6.c0(dp2, y6.w0(i24, this.resourcesProvider));
        b7 N2 = f7.N(i24);
        u6 u6Var3 = this.resourcesProvider;
        v4Var.setBackground(c03);
        f7.k(v4Var, c03, N2, null, u6Var3);
        frameLayout.addView(v4Var, kb1.i(-1, -1, 119));
        w4 w4Var = new w4(context, clamp);
        w4Var.setWillNotDraw(false);
        frameLayout.addView(w4Var, kb1.i(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        w4Var.addView(textView2, kb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        w4Var.addView(textView3, kb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        fi.d dVar = new fi.d(context, this.resourcesProvider, true);
        this.f53406o0 = dVar;
        dVar.f();
        Z(false);
        linearLayout2.addView(dVar, kb1.x(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j10, context, runnable, starGift));
        ig.a0 a0Var = this.f26791c;
        this.P = true;
        a0Var.l1(true);
        this.f53412u0.O(false);
        this.f26791c.h1(this.f53412u0.f29882y.size(), AndroidUtilities.dp(200.0f));
        nm0 nm0Var = this.d;
        int i25 = this.backgroundPaddingLeft;
        if (starGift != null && starGift.limited && this.f53407p0 == null) {
            i16 = 40;
        } else {
            i16 = 0;
        }
        nm0Var.setPadding(i25, 0, i25, AndroidUtilities.dp(68 + i16));
        this.d.i(new x4(this));
        this.d.setOnItemClickListener(new am0() {
            @Override
            public final void c(int i26, View view2) {
                boolean z17;
                long j15;
                TL_stars.StarGift starGift2;
                y4 y4Var = y4.this;
                TL_stars.StarGift starGift3 = y4Var.f53395c0;
                boolean z18 = y4Var.X;
                org.telegram.ui.Cells.v0 v0Var2 = y4Var.f53403k0;
                TLRPC.MessageAction messageAction2 = y4Var.f53404l0;
                MessageObject messageObject2 = y4Var.m0;
                k71 k71Var = y4Var.f53412u0;
                if (!y4Var.P) {
                    i26--;
                }
                u61 G = k71Var.G(i26);
                if (G != null) {
                    int i27 = G.d;
                    if (i27 == 1) {
                        boolean z19 = !y4Var.f53408q0;
                        y4Var.f53408q0 = z19;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z19;
                        }
                        messageObject2.updateMessageText();
                        v0Var2.X(messageObject2, true);
                        y4Var.f53412u0.O(true);
                    } else if (i27 == 2) {
                        if (!z10 && !z11) {
                            boolean z20 = y4Var.f53409r0;
                            y4Var.f53409r0 = !z20;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z20 && (!z18 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z17;
                                long j16 = 0;
                                if (z18 || z20) {
                                    j15 = 0;
                                } else {
                                    j15 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j15;
                                if (z20) {
                                    j16 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j16;
                            }
                            messageObject2.updateMessageText();
                            v0Var2.X(messageObject2, true);
                            y4Var.f53412u0.O(true);
                            y4Var.Z(true);
                            return;
                        }
                        int i28 = -y4Var.f53413v0;
                        y4Var.f53413v0 = i28;
                        AndroidUtilities.shakeViewSpring(view2, i28);
                    } else if (i27 == 3) {
                        boolean z21 = y4Var.f53410s0;
                        y4Var.f53410s0 = !z21;
                        boolean z22 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        tg.k kVar2 = kVar;
                        if (z22) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z21) {
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
                            if (!z21) {
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
                        v0Var2.X(messageObject2, true);
                        y4Var.f53412u0.O(true);
                        y4Var.Z(true);
                    }
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.f53399g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.f53411t0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.f53406o0.setLoading(false);
    }

    public static void Q(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.f53399g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.f53411t0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.f53406o0.setLoading(false);
    }

    public static void S(zh.y4 r16, long r17, android.content.Context r19, java.lang.Runnable r20, org.telegram.tgnet.tl.TL_stars.StarGift r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.y4.S(zh.y4, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void U(y4 y4Var) {
        new h7(y4Var.getContext(), y4Var.Y, y4Var.Z, y4Var.resourcesProvider, null).s2(y4Var.f53395c0.f22257id, y4Var.f53398f0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f53404l0;
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
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return wc.b0(U);
    }

    public final void Y(boolean z10) {
        int i10 = this.Y;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.Z;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f22177id), userFull);
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f26793n;
        if (r2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) r2Var.getParentActivity()).O().getFragmentStack());
            j5 parentLayout = r2Var.getParentLayout();
            int size = arrayList.size();
            wn wnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var2 instanceof wn) {
                    wnVar = (wn) r2Var2;
                    if (wnVar.a() != j10) {
                        r2Var2.removeSelfFromStack();
                    }
                } else if (r2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == r2Var2) {
                        r2Var2.finishFragment();
                    } else {
                        r2Var2.removeSelfFromStack();
                    }
                }
            }
            if (wnVar == null || wnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).S(new wn(a1.g.h(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        long j10;
        long j11;
        String str;
        GiftAuctionController.Auction auction = this.f53396d0;
        int i10 = this.Y;
        fi.d dVar = this.f53406o0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f53396d0.isUpcoming(currentTime)) {
                int i11 = this.f53396d0.gift.auction_start_date - currentTime;
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f53396d0.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
            dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
            dVar.g(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.f53395c0;
        zq[] zqVarArr = this.f53414w0;
        if (starGift != null) {
            long j12 = ca.y(i10, false).p().amount;
            long j13 = starGift.stars;
            if (this.f53409r0) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j13 + j10;
            if (TextUtils.isEmpty(this.f53411t0.getText())) {
                j11 = 0;
            } else {
                j11 = this.f53402j0;
            }
            long j15 = j14 + j11;
            if (this.X) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.i(dd.U0(false, LocaleController.formatPluralStringComma(str, (int) j15), zqVarArr), z10, true);
            if (ca.y(i10, false).e && j15 > j12) {
                dVar.g(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j12), z10);
                return;
            } else {
                dVar.g(null, z10);
                return;
            }
        }
        tg.k kVar = this.f53397e0;
        if (kVar != null) {
            if (this.f53410s0) {
                dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, zqVarArr), z10, true);
                zqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.i(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.g(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            k71 k71Var = this.f53412u0;
            if (k71Var != null && this.f53397e0 != null) {
                k71Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        t4 t4Var = this.f53411t0;
        org.telegram.ui.Cells.b3 b3Var = t4Var.f24003b;
        org.telegram.ui.Cells.b3 b3Var2 = t4Var.f24003b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
        } else if (b3Var2.v) {
            b3Var2.d();
        } else {
            b3Var2.r();
            if (this.f53396d0 != null) {
                GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.f53396d0.giftId, this);
            }
            this.f53415x0 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onBackPressed() {
        t4 t4Var = this.f53411t0;
        org.telegram.ui.Cells.b3 b3Var = t4Var.f24003b;
        org.telegram.ui.Cells.b3 b3Var2 = t4Var.f24003b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
        } else if (b3Var2.v) {
            b3Var2.d();
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f53405n0;
            if (linearLayout != null) {
                int w02 = y6.w0(y6.f23428h5, this.resourcesProvider);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i10 = this.backgroundPaddingLeft;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i10, 0, i10, 0));
                }
            }
            hh.c cVar = this.f53416y0;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.f23428h5));
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f53396d0 = auction;
    }

    @Override
    public final void show() {
        t4 t4Var = this.f53411t0;
        if (t4Var != null) {
            t4Var.f24003b.s();
        }
        super.show();
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.Y, 0, true, new m4(this, 0), this.resourcesProvider);
        this.f53412u0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
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
