package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import eg.t3;
import fg.s0;
import java.util.WeakHashMap;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ed;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cd;
import org.telegram.ui.lu0;
import org.telegram.ui.qd1;
import org.telegram.ui.qr;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.o9;
public final class n extends p2 implements x40, NotificationCenter.NotificationCenterDelegate, xd.b {
    public y40 B;
    public TLRPC.FileLocation C;
    public s0 D;
    public TLRPC.Chat E;
    public TLRPC.ChatFull F;
    public final d2[] G;
    public final l H;
    public final xd.a f48152a;
    public long f48153b;
    public t3 f48154c;
    public i61 d;
    public String f48155e;
    public boolean f48156f;
    public boolean h;
    public o9 f48157n;
    public m f48158r;
    public fg.i0 f48159s;
    public p9 v;
    public AnimatorSet f48160w;
    public RadialProgressView f48161x;
    public z8 f48162y;

    public n(Bundle bundle) {
        super(bundle);
        this.f48152a = new xd.a(0, this, pr.h, 320L, false);
        this.G = new d2[1];
        this.H = new l(this);
    }

    public static boolean U(n nVar, j51 j51Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f20843id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, nVar.E);
            z10 = isChannelAndNotMegaGroup;
            z4 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f20990id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, nVar.E);
                z4 = isBot;
                z10 = false;
            }
            return false;
        }
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = o0.b(nVar.currentAccount, j11);
        if (b10 != 1 && b10 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z12 || z11) {
            q70 F = q70.F(nVar.f48154c, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z4) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z10) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new h(nVar, j11, 1), z11);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new ed(nVar, z4, z10, j11, 2));
            F.W(nVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(n nVar, j51 j51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = j51Var.d;
        if (i10 == 140) {
            if (!nVar.B.h() && (chatPhoto = (chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f48153b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().K2(null, nVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = nVar.F;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(nVar.F.chat_photo.video_sizes.get(0), nVar.F.chat_photo);
                    }
                }
                PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, nVar.H, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z4 = true;
        if (i10 == 141) {
            y40 y40Var = nVar.B;
            if (nVar.C == null) {
                z4 = false;
            }
            y40Var.o(z4, new i(nVar, 0), new eg.c0(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.f48153b);
            bundle.putInt("type", 1);
            qr qrVar = new qr(bundle);
            qrVar.x0(nVar.F);
            nVar.presentFragment(qrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.f48153b);
            bundle2.putInt("type", 0);
            qr qrVar2 = new qr(bundle2);
            qrVar2.x0(nVar.F);
            nVar.presentFragment(qrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.f48153b);
            nVar.presentFragment(new q(bundle3));
        } else if (i10 == 150) {
            nVar.Z(true);
        } else if (i10 == 151) {
            nVar.Z(false);
        } else if (i10 == 145) {
            z4.s(nVar, false, nVar.E, null, false, true, true, false, new k(nVar));
        } else if (i10 == 146) {
            o0.e(nVar.G, nVar, nVar.currentAccount, nVar.E);
        } else {
            Object obj = j51Var.G;
            if (obj instanceof TLRPC.Chat) {
                nVar.presentFragment(xn.R9(-((TLRPC.Chat) obj).f20843id));
            } else if (obj instanceof TLRPC.User) {
                nVar.presentFragment(xn.R9(((TLRPC.User) obj).f20990id));
            }
        }
    }

    public static void W(n nVar) {
        nVar.C = null;
        MessagesController.getInstance(nVar.currentAccount).changeChatAvatar(nVar.f48153b, null, null, null, null, 0.0d, null, null, null, null);
        nVar.a0(false, true);
        nVar.v.h(null, null, nVar.f48162y, nVar.E);
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f48161x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f48161x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        this.D.setAlpha(f10);
        this.D.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.D.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        s0 s0Var = this.D;
        if (f10 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        s0Var.setVisibility(i11);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        boolean z4;
        if (this.f48156f == this.h && TextUtils.equals(((mh.m) this.f48157n.f45839b).getText().toString(), this.f48155e)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f48152a.a(z4, true);
    }

    public final void Z(boolean z4) {
        if (this.h == z4) {
            return;
        }
        i6 i6Var = (i6) this.d.y1(151);
        if (i6Var != null) {
            i6Var.a(!z4);
        }
        i6 i6Var2 = (i6) this.d.y1(150);
        if (i6Var2 != null) {
            i6Var2.a(z4);
        }
        this.h = z4;
        Y();
    }

    public final void a0(boolean z4, boolean z10) {
        if (this.f48161x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f48160w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f48160w = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48160w = animatorSet2;
            if (z4) {
                this.f48161x.setVisibility(0);
                this.f48159s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f48160w;
                RadialProgressView radialProgressView = this.f48161x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f48159s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f48161x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f48159s, property2, 0.0f));
            }
            this.f48160w.setDuration(180L);
            this.f48160w.addListener(new qd1(15, this, z4));
            this.f48160w.start();
        } else if (z4) {
            this.f48161x.setAlpha(1.0f);
            this.f48161x.setVisibility(0);
            this.f48159s.setAlpha(1.0f);
            this.f48159s.setVisibility(0);
        } else {
            this.f48161x.setAlpha(0.0f);
            this.f48161x.setVisibility(4);
            this.f48159s.setAlpha(0.0f);
            this.f48159s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 1));
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(k6.f21659d6));
        this.actionBar.M(new og.a(cVar), sg.b.n(this.resourceProvider), false);
        this.actionBar.M0 = true;
        t3 t3Var = new t3(this, context);
        this.f48154c = t3Var;
        t3Var.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        this.f48162y = new z8(this.E);
        m mVar = new m(context);
        this.f48158r = mVar;
        mVar.f48151a.e(this.E, this.f48162y);
        this.v = this.f48158r.f48151a;
        String name = DialogObject.getName(this.E);
        this.f48155e = name;
        g6 g6Var = this.resourceProvider;
        o9 o9Var = new o9(context);
        int i10 = 5;
        mh.m mVar2 = new mh.m(context, 5);
        o9Var.f45839b = mVar2;
        mVar2.setTextColor(k6.v0(k6.G6, g6Var));
        mVar2.setLinkTextColor(k6.v0(k6.f21720gc, g6Var));
        mVar2.setHintTextColor(k6.v0(k6.H6, g6Var));
        mVar2.setTextSize(1, 16.0f);
        mVar2.setMaxLines(Integer.MAX_VALUE);
        mVar2.setBackground(null);
        mVar2.setImeOptions(mVar2.getImeOptions() | 268435456);
        mVar2.setInputType(mVar2.getInputType() | 16384);
        mVar2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        mVar2.setMinHeight(AndroidUtilities.dp(50.0f));
        if (!LocaleController.isRTL) {
            i10 = 3;
        }
        o9Var.addView(mVar2, c6.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f48157n = o9Var;
        mVar2.setText(name);
        ((mh.m) this.f48157n.f45839b).setSelection(name.length());
        ((mh.m) this.f48157n.f45839b).addTextChangedListener(new eh.c(this, 17));
        s0 s0Var = new s0(this, context);
        this.D = s0Var;
        s0Var.setTextColor(getThemedColor(k6.Sh));
        this.D.setText(LocaleController.getString(R.string.Save));
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextSize(1, 14.0f);
        this.D.setGravity(17);
        this.D.setVisibility(8);
        this.D.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.D.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 16));
        e6.a(this.D);
        this.actionBar.addView(this.D, c6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        fg.i0 i0Var = new fg.i0(this, context);
        this.f48159s = i0Var;
        this.f48158r.addView(i0Var, c6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48161x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f48161x.setProgressColor(-1);
        this.f48161x.setNoProgress(false);
        this.f48158r.addView(this.f48161x, c6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        i61 i61Var = new i61(this, new j(this, 1), new k(this), new k(this));
        this.d = i61Var;
        i61Var.setClipToPadding(false);
        i61 i61Var2 = this.d;
        i61Var2.V2.f32957r = false;
        i61Var2.p1();
        this.actionBar.setBackground(null);
        this.f48154c.addView(this.d, c6.c(-1.0f, -1));
        this.f48154c.addView(this.actionBar, c6.e(-1, -2, 48));
        t3 t3Var2 = this.f48154c;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(t3Var2, kVar);
        t3 t3Var3 = this.f48154c;
        this.fragmentView = t3Var3;
        return t3Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20844id == this.f48153b) {
                this.F = chatFull;
                this.d.V2.N(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.B.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.B.f33296c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((mh.m) this.f48157n.f45839b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.B.i(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z4;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f48153b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f48153b));
        this.E = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f48156f = z4;
        this.h = z4;
        this.F = getMessagesController().getChatFull(this.f48153b);
        y40 y40Var = new y40(3, true, true);
        this.B = y40Var;
        y40Var.f33294a = this;
        y40Var.f33295b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        y40 y40Var = this.B;
        if (y40Var != null) {
            y40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.B.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.B.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.B.l();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        y40 y40Var = this.B;
        if (y40Var != null) {
            y40Var.f33298f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        y40 y40Var = this.B;
        if (y40Var != null && (str = y40Var.f33298f) != null) {
            bundle.putString("path", str);
        }
        o9 o9Var = this.f48157n;
        if (o9Var != null) {
            String obj = ((mh.m) o9Var.f45839b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
