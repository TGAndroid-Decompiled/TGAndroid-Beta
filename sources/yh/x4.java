package yh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.a7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import w7.z5;
import zh.n5;
import zh.p7;
public class x4 extends db implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean f49199a0;
    public final boolean f49200b0;
    public final TL_stars.StarGift f49201c0;
    public GiftAuctionController.Auction f49202d0;
    public final sg.k f49203e0;
    public final String f49204f0;
    public final Runnable f49205g0;
    public final r4 f49206h0;
    public final LinearLayout f49207i0;
    public final long f49208j0;
    public final org.telegram.ui.Cells.w0 f49209k0;
    public final TLRPC.MessageAction f49210l0;
    public final MessageObject m0;
    public final di.d f49211n0;
    public final FrameLayout f49212o0;
    public boolean f49213p0;
    public boolean f49214q0;
    public boolean f49215r0;
    public final s4 f49216s0;
    public a71 f49217t0;
    public int f49218u0;
    public final br[] f49219v0;
    public boolean f49220w0;

    public x4(Context context, int i10, final TL_stars.StarGift starGift, final sg.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        boolean z12;
        float f7;
        long j11;
        String str;
        Integer num;
        int themedColor;
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
        this.f49214q0 = false;
        this.f49215r0 = false;
        this.f49218u0 = -2;
        new AnimationNotificationsLocker();
        this.f49219v0 = new br[1];
        this.f49220w0 = false;
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
            this.f49213p0 = true;
        }
        this.Y = i10;
        this.Z = j10;
        this.f49201c0 = starGift;
        if (starGift != null && starGift.auction) {
            f7 = 4.0f;
            this.f49202d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.f19141id, this);
        } else {
            f7 = 4.0f;
        }
        this.f49203e0 = kVar;
        this.f49205g0 = runnable;
        this.f49199a0 = z10;
        this.f49200b0 = z11;
        if (z10) {
            this.f49214q0 = true;
        } else if (z11) {
            this.f49214q0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.f49204f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            this.f49204f0 = str;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.f49209k0 = w0Var;
        w0Var.setDelegate(new Object());
        r4 r4Var = new r4(this, context);
        this.f49206h0 = r4Var;
        Drawable e = a7.e(null, i10, j10, g6.I.q());
        r4Var.V(e);
        gh.c cVar = new gh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof cd0) {
                cd0 cd0Var = (cd0) e;
                if (cd0Var.f23706q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = cd0Var.f23689a;
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
            themedColor = getThemedColor(g6.f19672h5);
        }
        cVar.a(themedColor);
        dh.f fVar = new dh.f(cVar);
        c6 c6Var = this.resourcesProvider;
        int i17 = g6.f19672h5;
        fVar.o(new eh.b(i17, c6Var));
        fVar.q(AndroidUtilities.dp(20.0f));
        fVar.p(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49207i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f49210l0 = tL_messageActionStarGift;
            z13 = z12;
            i12 = i17;
        } else {
            boolean z15 = z12;
            i11 = 6;
            if (kVar != null && kVar.f45231b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e7 = kVar.e();
                tL_messageActionGiftCode.amount = e7;
                z13 = z15;
                if (kVar.h != null) {
                    i12 = i17;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e7);
                } else {
                    i12 = i17;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f49210l0 = tL_messageActionGiftCode;
            } else {
                z13 = z15;
                i12 = i17;
                if (kVar != null && kVar.f45230a != null) {
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
                    this.f49210l0 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f49210l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z16 = this.f49214q0;
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
        tL_messageService.f18937id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.f49210l0;
        if (starGift != null) {
            j12 = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        } else {
            j12 = j11;
        }
        this.f49208j0 = j12;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        w0Var.Y(messageObject, true);
        if (j12 > j11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout.addView(w0Var, z5.t(-1, -1, 119, 0, i13, 0, 8));
        r4Var.addView(linearLayout, z5.e(-1, -1, 119));
        ow0 ow0Var = (ow0) this.containerView;
        if (starGift != null) {
            i14 = R.string.Gift2Message;
        } else {
            i14 = R.string.Gift2MessageOptional;
        }
        s4 s4Var = new s4(this, context, ow0Var, LocaleController.getString(i14), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.f49216s0 = s4Var;
        org.telegram.ui.Cells.e3 e3Var = s4Var.f20905b;
        e3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        e3Var.Q = true;
        s4Var.setShowLimitWhenNear(50);
        this.Q = e3Var;
        s4Var.setShowLimitOnFocus(true);
        s4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(s4Var, 3);
        e3Var.getEditText().setImeOptions(i11);
        e3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i18 = this.backgroundPaddingLeft;
        s4Var.setPadding(i18, 0, i18, 0);
        s4.k kVar2 = new s4.k();
        kVar2.C = false;
        kVar2.f44872m = false;
        kVar2.n(350L);
        kVar2.o(es.h);
        kVar2.D = 40L;
        this.d.setItemAnimator(kVar2);
        this.f49217t0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i19 = i12;
        linearLayout2.setBackgroundColor(g6.w0(i19, this.resourcesProvider));
        int i20 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i20, 0, i20, 0);
        this.containerView.addView(linearLayout2, z5.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(g6.w0(g6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        if (starGift == null) {
            f10 = 0.0f;
        } else {
            f10 = starGift.availability_remains / starGift.availability_total;
        }
        float clamp = Utilities.clamp(f10, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(g6.c0(AndroidUtilities.dp(6.0f), g6.w0(g6.f19543a7, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f49212o0 = frameLayout2;
            frameLayout2.addView(frameLayout, z5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(g6.w0(i19, this.resourcesProvider));
        } else {
            if (starGift != null && starGift.limited) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            frameLayout.setVisibility(i15);
            linearLayout2.addView(frameLayout, z5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f49212o0 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i21 = g6.G6;
        textView.setTextColor(g6.w0(i21, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3), context);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(g6.w0(i21, this.resourcesProvider));
        if (starGift != null) {
            g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(g10, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        View u4Var = new u4(context, starGift, clamp);
        u4Var.setBackground(g6.c0(AndroidUtilities.dp(6.0f), g6.w0(g6.Oh, this.resourcesProvider)));
        frameLayout.addView(u4Var, z5.e(-1, -1, 119));
        v4 v4Var = new v4(context, clamp);
        v4Var.setWillNotDraw(false);
        frameLayout.addView(v4Var, z5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        v4Var.addView(textView2, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        v4Var.addView(textView3, z5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        this.f49211n0 = dVar;
        dVar.e();
        a0(false);
        linearLayout2.addView(dVar, z5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new o(this, j10, context, runnable, starGift));
        hg.a0 a0Var = this.f24068c;
        this.P = true;
        a0Var.k1(true);
        this.f49217t0.N(false);
        this.f24068c.h1(this.f49217t0.f23148x.size(), AndroidUtilities.dp(200.0f));
        mm0 mm0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        if (starGift != null && starGift.limited && this.f49212o0 == null) {
            i16 = 40;
        } else {
            i16 = 0;
        }
        mm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(68 + i16));
        this.d.i(new w4(this));
        this.d.setOnItemClickListener(new am0() {
            @Override
            public final void a(int i23, View view2) {
                boolean z17;
                long j15;
                TL_stars.StarGift starGift2;
                x4 x4Var = x4.this;
                TL_stars.StarGift starGift3 = x4Var.f49201c0;
                boolean z18 = x4Var.X;
                org.telegram.ui.Cells.w0 w0Var2 = x4Var.f49209k0;
                TLRPC.MessageAction messageAction2 = x4Var.f49210l0;
                MessageObject messageObject2 = x4Var.m0;
                a71 a71Var = x4Var.f49217t0;
                if (!x4Var.P) {
                    i23--;
                }
                m61 G = a71Var.G(i23);
                if (G != null) {
                    int i24 = G.d;
                    if (i24 == 1) {
                        boolean z19 = !x4Var.f49213p0;
                        x4Var.f49213p0 = z19;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z19;
                        }
                        messageObject2.updateMessageText();
                        w0Var2.Y(messageObject2, true);
                        x4Var.f49217t0.N(true);
                    } else if (i24 == 2) {
                        if (!z10 && !z11) {
                            boolean z20 = x4Var.f49214q0;
                            x4Var.f49214q0 = !z20;
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
                            w0Var2.Y(messageObject2, true);
                            x4Var.f49217t0.N(true);
                            x4Var.a0(true);
                            return;
                        }
                        int i25 = -x4Var.f49218u0;
                        x4Var.f49218u0 = i25;
                        AndroidUtilities.shakeViewSpring(view2, i25);
                    } else if (i24 == 3) {
                        boolean z21 = x4Var.f49215r0;
                        x4Var.f49215r0 = !z21;
                        boolean z22 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        sg.k kVar3 = kVar;
                        if (z22) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z21) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = kVar3.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = kVar3.a();
                                long e11 = kVar3.e();
                                tL_messageActionGiftPremium2.amount = e11;
                                if (kVar3.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e11);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z21) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = kVar3.g();
                            } else {
                                tL_messageActionGiftCode2.currency = kVar3.a();
                                long e12 = kVar3.e();
                                tL_messageActionGiftCode2.amount = e12;
                                if (kVar3.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e12);
                                }
                            }
                        }
                        messageObject2.updateMessageText();
                        w0Var2.Y(messageObject2, true);
                        x4Var.f49217t0.N(true);
                        x4Var.a0(true);
                    }
                }
            }
        });
        this.e.setTitle(B());
    }

    public static void Q(x4 x4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = x4Var.f49205g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(x4Var.f49216s0);
            x4Var.dismiss();
            AndroidUtilities.runOnUIThread(new o4(1, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, new zc(x4Var.topBulletinContainer, x4Var.resourcesProvider), R.raw.error, 36);
        }
        x4Var.f49211n0.setLoading(false);
    }

    public static void R(x4 x4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = x4Var.f49205g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(x4Var.f49216s0);
            x4Var.dismiss();
            AndroidUtilities.runOnUIThread(new o4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, new zc(x4Var.topBulletinContainer, x4Var.resourcesProvider), R.raw.error, 36);
        }
        x4Var.f49211n0.setLoading(false);
    }

    public static void T(yh.x4 r17, long r18, android.content.Context r20, java.lang.Runnable r21, org.telegram.tgnet.tl.TL_stars.StarGift r22) {
        throw new UnsupportedOperationException("Method not decompiled: yh.x4.T(yh.x4, long, android.content.Context, java.lang.Runnable, org.telegram.tgnet.tl.TL_stars$StarGift):void");
    }

    public static void V(x4 x4Var) {
        new zh.r3(x4Var.getContext(), x4Var.Y, x4Var.Z, x4Var.resourcesProvider, null).W1(x4Var.f49201c0.f19141id, x4Var.f49204f0);
    }

    @Override
    public final CharSequence B() {
        int i10;
        if (this.X) {
            i10 = R.string.Gift2TitleSelf2;
        } else {
            i10 = R.string.Gift2Title;
        }
        return LocaleController.getString(i10);
    }

    public final TLRPC.TL_textWithEntities X() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f49210l0;
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

    public zc Y() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return zc.a0(U);
    }

    public final void Z(boolean z10) {
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
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.f19063id), userFull);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24070n;
        if (m2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) m2Var.getParentActivity()).O().getFragmentStack());
            b5 parentLayout = m2Var.getParentLayout();
            int size = arrayList.size();
            fo foVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                if (m2Var2 instanceof fo) {
                    foVar = (fo) m2Var2;
                    if (foVar.a() != j10) {
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
            if (foVar == null || foVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new fo(t8.b.e(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void a0(boolean z10) {
        long j10;
        long j11;
        String str;
        GiftAuctionController.Auction auction = this.f49202d0;
        int i10 = this.Y;
        di.d dVar = this.f49211n0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.f49202d0.isUpcoming(currentTime)) {
                int i11 = this.f49202d0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f49202d0.auctionStateActive;
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
        TL_stars.StarGift starGift = this.f49201c0;
        br[] brVarArr = this.f49219v0;
        if (starGift != null) {
            long j12 = n5.y(i10, false).p().amount;
            long j13 = starGift.stars;
            if (this.f49214q0) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j13 + j10;
            if (TextUtils.isEmpty(this.f49216s0.getText())) {
                j11 = 0;
            } else {
                j11 = this.f49208j0;
            }
            long j15 = j14 + j11;
            if (this.X) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.g(p7.W0(false, LocaleController.formatPluralStringComma(str, (int) j15), brVarArr), z10, true);
            if (n5.y(i10, false).e && j15 > j12) {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j12), z10);
                return;
            } else {
                dVar.f(null, z10);
                return;
            }
        }
        sg.k kVar = this.f49203e0;
        if (kVar != null) {
            if (this.f49215r0) {
                dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, brVarArr), z10, true);
                brVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a0(true);
            a71 a71Var = this.f49217t0;
            if (a71Var != null && this.f49203e0 != null) {
                a71Var.N(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        s4 s4Var = this.f49216s0;
        org.telegram.ui.Cells.e3 e3Var = s4Var.f20905b;
        org.telegram.ui.Cells.e3 e3Var2 = s4Var.f20905b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
        } else if (e3Var2.v) {
            e3Var2.d();
        } else {
            e3Var2.r();
            if (this.f49202d0 != null) {
                GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.f49202d0.giftId, this);
            }
            this.f49220w0 = true;
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
        s4 s4Var = this.f49216s0;
        org.telegram.ui.Cells.e3 e3Var = s4Var.f20905b;
        org.telegram.ui.Cells.e3 e3Var2 = s4Var.f20905b;
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
        this.f49202d0 = auction;
    }

    @Override
    public final void show() {
        s4 s4Var = this.f49216s0;
        if (s4Var != null) {
            s4Var.f20905b.s();
        }
        super.show();
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.Y, 0, true, new l4(this, 0), this.resourcesProvider);
        this.f49217t0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
